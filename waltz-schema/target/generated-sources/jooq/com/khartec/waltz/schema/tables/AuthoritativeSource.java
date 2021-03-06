/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.AuthoritativeSourceRecord;

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
public class AuthoritativeSource extends TableImpl<AuthoritativeSourceRecord> {

    private static final long serialVersionUID = -675491553;

    /**
     * The reference instance of <code>authoritative_source</code>
     */
    public static final AuthoritativeSource AUTHORITATIVE_SOURCE = new AuthoritativeSource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthoritativeSourceRecord> getRecordType() {
        return AuthoritativeSourceRecord.class;
    }

    /**
     * The column <code>authoritative_source.id</code>.
     */
    public final TableField<AuthoritativeSourceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>authoritative_source.parent_kind</code>.
     */
    public final TableField<AuthoritativeSourceRecord, String> PARENT_KIND = createField("parent_kind", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>authoritative_source.data_type</code>.
     */
    public final TableField<AuthoritativeSourceRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>authoritative_source.parent_id</code>.
     */
    public final TableField<AuthoritativeSourceRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>authoritative_source.application_id</code>.
     */
    public final TableField<AuthoritativeSourceRecord, Long> APPLICATION_ID = createField("application_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>authoritative_source.rating</code>.
     */
    public final TableField<AuthoritativeSourceRecord, String> RATING = createField("rating", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>authoritative_source.provenance</code>.
     */
    public final TableField<AuthoritativeSourceRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>authoritative_source.description</code>.
     */
    public final TableField<AuthoritativeSourceRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>authoritative_source</code> table reference
     */
    public AuthoritativeSource() {
        this(DSL.name("authoritative_source"), null);
    }

    /**
     * Create an aliased <code>authoritative_source</code> table reference
     */
    public AuthoritativeSource(String alias) {
        this(DSL.name(alias), AUTHORITATIVE_SOURCE);
    }

    /**
     * Create an aliased <code>authoritative_source</code> table reference
     */
    public AuthoritativeSource(Name alias) {
        this(alias, AUTHORITATIVE_SOURCE);
    }

    private AuthoritativeSource(Name alias, Table<AuthoritativeSourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthoritativeSource(Name alias, Table<AuthoritativeSourceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.AUTHORITATIVE_SOURCE_FKI_AUTHORITATIVE_SOURCE_APPLICATION_ID_FKEY, Indexes.AUTHORITATIVE_SOURCE_IDX_AUTH_SOURCE_UNIQUE, Indexes.AUTHORITATIVE_SOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthoritativeSourceRecord, Long> getIdentity() {
        return Keys.IDENTITY_AUTHORITATIVE_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthoritativeSourceRecord> getPrimaryKey() {
        return Keys.KEY_AUTHORITATIVE_SOURCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthoritativeSourceRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthoritativeSourceRecord>>asList(Keys.KEY_AUTHORITATIVE_SOURCE_PRIMARY, Keys.KEY_AUTHORITATIVE_SOURCE_IDX_AUTH_SOURCE_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritativeSource as(String alias) {
        return new AuthoritativeSource(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritativeSource as(Name alias) {
        return new AuthoritativeSource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthoritativeSource rename(String name) {
        return new AuthoritativeSource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthoritativeSource rename(Name name) {
        return new AuthoritativeSource(name, null);
    }
}
