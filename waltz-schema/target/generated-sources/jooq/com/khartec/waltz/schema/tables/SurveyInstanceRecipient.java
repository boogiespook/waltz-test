/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.SurveyInstanceRecipientRecord;

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
public class SurveyInstanceRecipient extends TableImpl<SurveyInstanceRecipientRecord> {

    private static final long serialVersionUID = 736841441;

    /**
     * The reference instance of <code>survey_instance_recipient</code>
     */
    public static final SurveyInstanceRecipient SURVEY_INSTANCE_RECIPIENT = new SurveyInstanceRecipient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SurveyInstanceRecipientRecord> getRecordType() {
        return SurveyInstanceRecipientRecord.class;
    }

    /**
     * The column <code>survey_instance_recipient.id</code>.
     */
    public final TableField<SurveyInstanceRecipientRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>survey_instance_recipient.survey_instance_id</code>.
     */
    public final TableField<SurveyInstanceRecipientRecord, Long> SURVEY_INSTANCE_ID = createField("survey_instance_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>survey_instance_recipient.person_id</code>.
     */
    public final TableField<SurveyInstanceRecipientRecord, Long> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>survey_instance_recipient</code> table reference
     */
    public SurveyInstanceRecipient() {
        this(DSL.name("survey_instance_recipient"), null);
    }

    /**
     * Create an aliased <code>survey_instance_recipient</code> table reference
     */
    public SurveyInstanceRecipient(String alias) {
        this(DSL.name(alias), SURVEY_INSTANCE_RECIPIENT);
    }

    /**
     * Create an aliased <code>survey_instance_recipient</code> table reference
     */
    public SurveyInstanceRecipient(Name alias) {
        this(alias, SURVEY_INSTANCE_RECIPIENT);
    }

    private SurveyInstanceRecipient(Name alias, Table<SurveyInstanceRecipientRecord> aliased) {
        this(alias, aliased, null);
    }

    private SurveyInstanceRecipient(Name alias, Table<SurveyInstanceRecipientRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SURVEY_INSTANCE_RECIPIENT_IDX_SIR_PERSON, Indexes.SURVEY_INSTANCE_RECIPIENT_IDX_SURVEY_RECIPIENT_INSTANCE, Indexes.SURVEY_INSTANCE_RECIPIENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SurveyInstanceRecipientRecord, Long> getIdentity() {
        return Keys.IDENTITY_SURVEY_INSTANCE_RECIPIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SurveyInstanceRecipientRecord> getPrimaryKey() {
        return Keys.KEY_SURVEY_INSTANCE_RECIPIENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SurveyInstanceRecipientRecord>> getKeys() {
        return Arrays.<UniqueKey<SurveyInstanceRecipientRecord>>asList(Keys.KEY_SURVEY_INSTANCE_RECIPIENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyInstanceRecipient as(String alias) {
        return new SurveyInstanceRecipient(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyInstanceRecipient as(Name alias) {
        return new SurveyInstanceRecipient(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SurveyInstanceRecipient rename(String name) {
        return new SurveyInstanceRecipient(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SurveyInstanceRecipient rename(Name name) {
        return new SurveyInstanceRecipient(name, null);
    }
}