/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.tables.records.InvolvementRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Involvement extends TableImpl<InvolvementRecord> {

    private static final long serialVersionUID = -1048902094;

    /**
     * The reference instance of <code>involvement</code>
     */
    public static final Involvement INVOLVEMENT = new Involvement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InvolvementRecord> getRecordType() {
        return InvolvementRecord.class;
    }

    /**
     * The column <code>involvement.entity_kind</code>.
     */
    public final TableField<InvolvementRecord, String> ENTITY_KIND = createField("entity_kind", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>involvement.entity_id</code>.
     */
    public final TableField<InvolvementRecord, Long> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>involvement.employee_id</code>.
     */
    public final TableField<InvolvementRecord, String> EMPLOYEE_ID = createField("employee_id", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>involvement.provenance</code>.
     */
    public final TableField<InvolvementRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>involvement.kind_id</code>.
     */
    public final TableField<InvolvementRecord, Long> KIND_ID = createField("kind_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>involvement</code> table reference
     */
    public Involvement() {
        this(DSL.name("involvement"), null);
    }

    /**
     * Create an aliased <code>involvement</code> table reference
     */
    public Involvement(String alias) {
        this(DSL.name(alias), INVOLVEMENT);
    }

    /**
     * Create an aliased <code>involvement</code> table reference
     */
    public Involvement(Name alias) {
        this(alias, INVOLVEMENT);
    }

    private Involvement(Name alias, Table<InvolvementRecord> aliased) {
        this(alias, aliased, null);
    }

    private Involvement(Name alias, Table<InvolvementRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.INVOLVEMENT_IDX_INVOLVEMENT_ENTITY_EMP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Involvement as(String alias) {
        return new Involvement(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Involvement as(Name alias) {
        return new Involvement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Involvement rename(String name) {
        return new Involvement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Involvement rename(Name name) {
        return new Involvement(name, null);
    }
}
