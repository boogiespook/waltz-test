/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.EntityStatisticValueRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityStatisticValue extends TableImpl<EntityStatisticValueRecord> {

    private static final long serialVersionUID = 294932329;

    /**
     * The reference instance of <code>entity_statistic_value</code>
     */
    public static final EntityStatisticValue ENTITY_STATISTIC_VALUE = new EntityStatisticValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityStatisticValueRecord> getRecordType() {
        return EntityStatisticValueRecord.class;
    }

    /**
     * The column <code>entity_statistic_value.id</code>.
     */
    public final TableField<EntityStatisticValueRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>entity_statistic_value.statistic_id</code>.
     */
    public final TableField<EntityStatisticValueRecord, Long> STATISTIC_ID = createField("statistic_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>entity_statistic_value.entity_kind</code>.
     */
    public final TableField<EntityStatisticValueRecord, String> ENTITY_KIND = createField("entity_kind", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>entity_statistic_value.entity_id</code>.
     */
    public final TableField<EntityStatisticValueRecord, Long> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>entity_statistic_value.value</code>.
     */
    public final TableField<EntityStatisticValueRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>entity_statistic_value.outcome</code>.
     */
    public final TableField<EntityStatisticValueRecord, String> OUTCOME = createField("outcome", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>entity_statistic_value.state</code>.
     */
    public final TableField<EntityStatisticValueRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>entity_statistic_value.reason</code>.
     */
    public final TableField<EntityStatisticValueRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>entity_statistic_value.created_at</code>.
     */
    public final TableField<EntityStatisticValueRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>entity_statistic_value.current</code>.
     */
    public final TableField<EntityStatisticValueRecord, Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>entity_statistic_value.provenance</code>.
     */
    public final TableField<EntityStatisticValueRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>entity_statistic_value</code> table reference
     */
    public EntityStatisticValue() {
        this(DSL.name("entity_statistic_value"), null);
    }

    /**
     * Create an aliased <code>entity_statistic_value</code> table reference
     */
    public EntityStatisticValue(String alias) {
        this(DSL.name(alias), ENTITY_STATISTIC_VALUE);
    }

    /**
     * Create an aliased <code>entity_statistic_value</code> table reference
     */
    public EntityStatisticValue(Name alias) {
        this(alias, ENTITY_STATISTIC_VALUE);
    }

    private EntityStatisticValue(Name alias, Table<EntityStatisticValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityStatisticValue(Name alias, Table<EntityStatisticValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ENTITY_STATISTIC_VALUE_IDX_ESV_ENTITY_REF_CURRENT, Indexes.ENTITY_STATISTIC_VALUE_IDX_ESV_STATISTIC_ID, Indexes.ENTITY_STATISTIC_VALUE_IDX_ESV_STATISTIC_ID_OUTCOME, Indexes.ENTITY_STATISTIC_VALUE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EntityStatisticValueRecord, Long> getIdentity() {
        return Keys.IDENTITY_ENTITY_STATISTIC_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EntityStatisticValueRecord> getPrimaryKey() {
        return Keys.KEY_ENTITY_STATISTIC_VALUE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EntityStatisticValueRecord>> getKeys() {
        return Arrays.<UniqueKey<EntityStatisticValueRecord>>asList(Keys.KEY_ENTITY_STATISTIC_VALUE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValue as(String alias) {
        return new EntityStatisticValue(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValue as(Name alias) {
        return new EntityStatisticValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityStatisticValue rename(String name) {
        return new EntityStatisticValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityStatisticValue rename(Name name) {
        return new EntityStatisticValue(name, null);
    }
}