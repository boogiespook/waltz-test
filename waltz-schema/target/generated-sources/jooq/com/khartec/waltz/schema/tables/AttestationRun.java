/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.AttestationRunRecord;

import java.sql.Date;
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
 * Store attestation run records
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttestationRun extends TableImpl<AttestationRunRecord> {

    private static final long serialVersionUID = 1003168576;

    /**
     * The reference instance of <code>attestation_run</code>
     */
    public static final AttestationRun ATTESTATION_RUN = new AttestationRun();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttestationRunRecord> getRecordType() {
        return AttestationRunRecord.class;
    }

    /**
     * The column <code>attestation_run.id</code>.
     */
    public final TableField<AttestationRunRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>attestation_run.target_entity_kind</code>.
     */
    public final TableField<AttestationRunRecord, String> TARGET_ENTITY_KIND = createField("target_entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>attestation_run.name</code>.
     */
    public final TableField<AttestationRunRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>attestation_run.description</code>.
     */
    public final TableField<AttestationRunRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>attestation_run.selector_entity_kind</code>.
     */
    public final TableField<AttestationRunRecord, String> SELECTOR_ENTITY_KIND = createField("selector_entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>attestation_run.selector_entity_id</code>.
     */
    public final TableField<AttestationRunRecord, Long> SELECTOR_ENTITY_ID = createField("selector_entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>attestation_run.selector_hierarchy_scope</code>.
     */
    public final TableField<AttestationRunRecord, String> SELECTOR_HIERARCHY_SCOPE = createField("selector_hierarchy_scope", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>attestation_run.involvement_kind_ids</code>.
     */
    public final TableField<AttestationRunRecord, String> INVOLVEMENT_KIND_IDS = createField("involvement_kind_ids", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>attestation_run.issued_by</code>.
     */
    public final TableField<AttestationRunRecord, String> ISSUED_BY = createField("issued_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>attestation_run.issued_on</code>.
     */
    public final TableField<AttestationRunRecord, Date> ISSUED_ON = createField("issued_on", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>attestation_run.due_date</code>.
     */
    public final TableField<AttestationRunRecord, Date> DUE_DATE = createField("due_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>attestation_run.attested_entity_kind</code>.
     */
    public final TableField<AttestationRunRecord, String> ATTESTED_ENTITY_KIND = createField("attested_entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>attestation_run.attested_entity_id</code>.
     */
    public final TableField<AttestationRunRecord, Long> ATTESTED_ENTITY_ID = createField("attested_entity_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>attestation_run</code> table reference
     */
    public AttestationRun() {
        this(DSL.name("attestation_run"), null);
    }

    /**
     * Create an aliased <code>attestation_run</code> table reference
     */
    public AttestationRun(String alias) {
        this(DSL.name(alias), ATTESTATION_RUN);
    }

    /**
     * Create an aliased <code>attestation_run</code> table reference
     */
    public AttestationRun(Name alias) {
        this(alias, ATTESTATION_RUN);
    }

    private AttestationRun(Name alias, Table<AttestationRunRecord> aliased) {
        this(alias, aliased, null);
    }

    private AttestationRun(Name alias, Table<AttestationRunRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Store attestation run records");
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
        return Arrays.<Index>asList(Indexes.ATTESTATION_RUN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AttestationRunRecord, Long> getIdentity() {
        return Keys.IDENTITY_ATTESTATION_RUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AttestationRunRecord> getPrimaryKey() {
        return Keys.KEY_ATTESTATION_RUN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AttestationRunRecord>> getKeys() {
        return Arrays.<UniqueKey<AttestationRunRecord>>asList(Keys.KEY_ATTESTATION_RUN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationRun as(String alias) {
        return new AttestationRun(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationRun as(Name alias) {
        return new AttestationRun(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AttestationRun rename(String name) {
        return new AttestationRun(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AttestationRun rename(Name name) {
        return new AttestationRun(name, null);
    }
}