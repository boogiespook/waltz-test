/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.AssessmentRatingRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Add assessment rating table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AssessmentRating extends TableImpl<AssessmentRatingRecord> {

    private static final long serialVersionUID = -26645311;

    /**
     * The reference instance of <code>assessment_rating</code>
     */
    public static final AssessmentRating ASSESSMENT_RATING = new AssessmentRating();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentRatingRecord> getRecordType() {
        return AssessmentRatingRecord.class;
    }

    /**
     * The column <code>assessment_rating.entity_id</code>.
     */
    public final TableField<AssessmentRatingRecord, Long> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>assessment_rating.entity_kind</code>.
     */
    public final TableField<AssessmentRatingRecord, String> ENTITY_KIND = createField("entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>assessment_rating.assessment_definition_id</code>.
     */
    public final TableField<AssessmentRatingRecord, Long> ASSESSMENT_DEFINITION_ID = createField("assessment_definition_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>assessment_rating.rating_id</code>.
     */
    public final TableField<AssessmentRatingRecord, Long> RATING_ID = createField("rating_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>assessment_rating.description</code>.
     */
    public final TableField<AssessmentRatingRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>assessment_rating.last_updated_at</code>.
     */
    public final TableField<AssessmentRatingRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>assessment_rating.last_updated_by</code>.
     */
    public final TableField<AssessmentRatingRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>assessment_rating.provenance</code>.
     */
    public final TableField<AssessmentRatingRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>assessment_rating</code> table reference
     */
    public AssessmentRating() {
        this(DSL.name("assessment_rating"), null);
    }

    /**
     * Create an aliased <code>assessment_rating</code> table reference
     */
    public AssessmentRating(String alias) {
        this(DSL.name(alias), ASSESSMENT_RATING);
    }

    /**
     * Create an aliased <code>assessment_rating</code> table reference
     */
    public AssessmentRating(Name alias) {
        this(alias, ASSESSMENT_RATING);
    }

    private AssessmentRating(Name alias, Table<AssessmentRatingRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentRating(Name alias, Table<AssessmentRatingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Add assessment rating table");
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
        return Arrays.<Index>asList(Indexes.ASSESSMENT_RATING_IDX_ASSESSMENT_RATING_ENTITY, Indexes.ASSESSMENT_RATING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentRatingRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_RATING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentRatingRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentRatingRecord>>asList(Keys.KEY_ASSESSMENT_RATING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRating as(String alias) {
        return new AssessmentRating(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRating as(Name alias) {
        return new AssessmentRating(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessmentRating rename(String name) {
        return new AssessmentRating(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessmentRating rename(Name name) {
        return new AssessmentRating(name, null);
    }
}
