/*
 * Waltz - Enterprise Architecture
 * Copyright (C) 2016, 2017 Waltz open source project
 * See README.md for more information
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.khartec.waltz.data.entity_statistic;

import com.khartec.waltz.model.entity_statistic.*;
import com.khartec.waltz.schema.tables.records.EntityStatisticDefinitionRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static com.khartec.waltz.common.Checks.checkNotNull;
import static com.khartec.waltz.schema.tables.EntityStatisticDefinition.ENTITY_STATISTIC_DEFINITION;

@Repository
public class EntityStatisticDefinitionDao {

    private static final com.khartec.waltz.schema.tables.EntityStatisticDefinition esd = ENTITY_STATISTIC_DEFINITION.as("esd");

    public static final RecordMapper<? super Record, EntityStatisticDefinition> TO_DEFINITION_MAPPER = r -> {
        EntityStatisticDefinitionRecord record = r.into(ENTITY_STATISTIC_DEFINITION);

        return ImmutableEntityStatisticDefinition.builder()
                .id(record.getId())
                .name(record.getName())
                .description((record.getDescription()))
                .type(StatisticType.valueOf(record.getType()))
                .category(StatisticCategory.valueOf(record.getCategory()))
                .active(record.getActive())
                .rollupKind(RollupKind.valueOf(record.getRollupKind()))
                .renderer(record.getRenderer())
                .historicRenderer(record.getHistoricRenderer())
                .provenance(record.getProvenance())
                .parentId(Optional.ofNullable(record.getParentId()))
                .entityVisibility(record.getEntityVisibility())
                .rollupVisibility(record.getRollupVisibility())
                .build();
    };


    private static final Function<EntityStatisticDefinition, EntityStatisticDefinitionRecord> TO_RECORD_MAPPER = domainObj -> {
        EntityStatisticDefinitionRecord record = new EntityStatisticDefinitionRecord();

        record.setId(domainObj.id().get());
        record.setParentId(domainObj.parentId().orElse(null));
        record.setName(domainObj.name());
        record.setDescription(domainObj.description());
        record.setType(domainObj.type().name());
        record.setCategory(domainObj.category().name());
        record.setActive(domainObj.active());
        record.setRollupKind(domainObj.rollupKind().name());
        record.setRenderer(domainObj.renderer());
        record.setHistoricRenderer(domainObj.historicRenderer());
        record.setProvenance(domainObj.provenance());
        record.setEntityVisibility(domainObj.entityVisibility());
        record.setRollupVisibility(domainObj.rollupVisibility());

        return record;
    };


    private final DSLContext dsl;


    @Autowired
    public EntityStatisticDefinitionDao(DSLContext dsl) {
        checkNotNull(dsl, "dsl cannot be null");
        this.dsl = dsl;
    }


    public boolean insert(EntityStatisticDefinition entityStatistic) {
        checkNotNull(entityStatistic, "entityStatistic cannot be null");
        return dsl.executeInsert(TO_RECORD_MAPPER.apply(entityStatistic)) == 1;
    }


    public List<EntityStatisticDefinition> findAllActiveDefinitions(boolean rollupOnly) {
        return dsl.select(esd.fields())
                .from(esd)
                .where(esd.ACTIVE.eq(true))
                .and(mkRollupOnlyCondition(rollupOnly))
                .fetch(TO_DEFINITION_MAPPER);
    }


    public List<EntityStatisticDefinition> findRelated(long id, boolean rollupOnly) {
        Condition findSelf = esd.ID.eq(id);
        Condition findChildren = esd.PARENT_ID.eq(id);

        SelectConditionStep<Record1<Long>> parentIdSelector = dsl
                .select(esd.PARENT_ID)
                .from(esd)
                .where(findSelf);

        Condition findParent = esd.ID.eq(parentIdSelector);

        return dsl.select(esd.fields())
                .from(esd)
                .where(findChildren
                        .or(findSelf)
                        .or(findParent)
                )
                .and(esd.ACTIVE.eq(Boolean.TRUE))
                .and(mkRollupOnlyCondition(rollupOnly))
                .fetch(TO_DEFINITION_MAPPER);
    }


    public EntityStatisticDefinition getById(long id) {
        return dsl.select(esd.fields())
                .from(esd)
                .where(esd.ID.eq(id))
                .fetchOne(TO_DEFINITION_MAPPER);
    }


    public List<EntityStatisticDefinition> findByIds(List<Long> ids) {
        return dsl.select(esd.fields())
                .from(esd)
                .where(esd.ID.in(ids))
                .fetch(TO_DEFINITION_MAPPER);
    }


    private Condition mkRollupOnlyCondition(boolean rollupOnly) {
        return  rollupOnly
                ? esd.ROLLUP_VISIBILITY.eq(true)
                : DSL.trueCondition();
    }
}
