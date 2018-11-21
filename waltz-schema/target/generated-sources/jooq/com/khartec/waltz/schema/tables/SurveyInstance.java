/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.SurveyInstanceRecord;

import java.sql.Date;
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
public class SurveyInstance extends TableImpl<SurveyInstanceRecord> {

    private static final long serialVersionUID = -2083126091;

    /**
     * The reference instance of <code>survey_instance</code>
     */
    public static final SurveyInstance SURVEY_INSTANCE = new SurveyInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SurveyInstanceRecord> getRecordType() {
        return SurveyInstanceRecord.class;
    }

    /**
     * The column <code>survey_instance.id</code>.
     */
    public final TableField<SurveyInstanceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>survey_instance.survey_run_id</code>.
     */
    public final TableField<SurveyInstanceRecord, Long> SURVEY_RUN_ID = createField("survey_run_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>survey_instance.entity_kind</code>.
     */
    public final TableField<SurveyInstanceRecord, String> ENTITY_KIND = createField("entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>survey_instance.entity_id</code>.
     */
    public final TableField<SurveyInstanceRecord, Long> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>survey_instance.status</code>.
     */
    public final TableField<SurveyInstanceRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>survey_instance.submitted_at</code>.
     */
    public final TableField<SurveyInstanceRecord, Timestamp> SUBMITTED_AT = createField("submitted_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>survey_instance.submitted_by</code>.
     */
    public final TableField<SurveyInstanceRecord, String> SUBMITTED_BY = createField("submitted_by", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>survey_instance.due_date</code>.
     */
    public final TableField<SurveyInstanceRecord, Date> DUE_DATE = createField("due_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>survey_instance.original_instance_id</code>.
     */
    public final TableField<SurveyInstanceRecord, Long> ORIGINAL_INSTANCE_ID = createField("original_instance_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>survey_instance.approved_at</code>.
     */
    public final TableField<SurveyInstanceRecord, Timestamp> APPROVED_AT = createField("approved_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>survey_instance.approved_by</code>.
     */
    public final TableField<SurveyInstanceRecord, String> APPROVED_BY = createField("approved_by", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>survey_instance</code> table reference
     */
    public SurveyInstance() {
        this(DSL.name("survey_instance"), null);
    }

    /**
     * Create an aliased <code>survey_instance</code> table reference
     */
    public SurveyInstance(String alias) {
        this(DSL.name(alias), SURVEY_INSTANCE);
    }

    /**
     * Create an aliased <code>survey_instance</code> table reference
     */
    public SurveyInstance(Name alias) {
        this(alias, SURVEY_INSTANCE);
    }

    private SurveyInstance(Name alias, Table<SurveyInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SurveyInstance(Name alias, Table<SurveyInstanceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SURVEY_INSTANCE_IDX_SURVEY_INSTANCE_ENTITY, Indexes.SURVEY_INSTANCE_IDX_SURVEY_INSTANCE_RUN, Indexes.SURVEY_INSTANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SurveyInstanceRecord, Long> getIdentity() {
        return Keys.IDENTITY_SURVEY_INSTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SurveyInstanceRecord> getPrimaryKey() {
        return Keys.KEY_SURVEY_INSTANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SurveyInstanceRecord>> getKeys() {
        return Arrays.<UniqueKey<SurveyInstanceRecord>>asList(Keys.KEY_SURVEY_INSTANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyInstance as(String alias) {
        return new SurveyInstance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyInstance as(Name alias) {
        return new SurveyInstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SurveyInstance rename(String name) {
        return new SurveyInstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SurveyInstance rename(Name name) {
        return new SurveyInstance(name, null);
    }
}
