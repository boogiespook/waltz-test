/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.Attestation_1_11Record;

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
 * Store attestation records
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attestation_1_11 extends TableImpl<Attestation_1_11Record> {

    private static final long serialVersionUID = 1413781947;

    /**
     * The reference instance of <code>attestation_1_11</code>
     */
    public static final Attestation_1_11 ATTESTATION_1_11 = new Attestation_1_11();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Attestation_1_11Record> getRecordType() {
        return Attestation_1_11Record.class;
    }

    /**
     * The column <code>attestation_1_11.id</code>.
     */
    public final TableField<Attestation_1_11Record, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>attestation_1_11.parent_entity_id</code>.
     */
    public final TableField<Attestation_1_11Record, Long> PARENT_ENTITY_ID = createField("parent_entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>attestation_1_11.parent_entity_kind</code>.
     */
    public final TableField<Attestation_1_11Record, String> PARENT_ENTITY_KIND = createField("parent_entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>attestation_1_11.child_entity_kind</code>.
     */
    public final TableField<Attestation_1_11Record, String> CHILD_ENTITY_KIND = createField("child_entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>attestation_1_11.attested_at</code>.
     */
    public final TableField<Attestation_1_11Record, Timestamp> ATTESTED_AT = createField("attested_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>attestation_1_11.attested_by</code>.
     */
    public final TableField<Attestation_1_11Record, String> ATTESTED_BY = createField("attested_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>attestation_1_11.comments</code>.
     */
    public final TableField<Attestation_1_11Record, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>attestation_1_11</code> table reference
     */
    public Attestation_1_11() {
        this(DSL.name("attestation_1_11"), null);
    }

    /**
     * Create an aliased <code>attestation_1_11</code> table reference
     */
    public Attestation_1_11(String alias) {
        this(DSL.name(alias), ATTESTATION_1_11);
    }

    /**
     * Create an aliased <code>attestation_1_11</code> table reference
     */
    public Attestation_1_11(Name alias) {
        this(alias, ATTESTATION_1_11);
    }

    private Attestation_1_11(Name alias, Table<Attestation_1_11Record> aliased) {
        this(alias, aliased, null);
    }

    private Attestation_1_11(Name alias, Table<Attestation_1_11Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Store attestation records");
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
        return Arrays.<Index>asList(Indexes.ATTESTATION_1_11_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Attestation_1_11Record, Long> getIdentity() {
        return Keys.IDENTITY_ATTESTATION_1_11;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Attestation_1_11Record> getPrimaryKey() {
        return Keys.KEY_ATTESTATION_1_11_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Attestation_1_11Record>> getKeys() {
        return Arrays.<UniqueKey<Attestation_1_11Record>>asList(Keys.KEY_ATTESTATION_1_11_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attestation_1_11 as(String alias) {
        return new Attestation_1_11(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attestation_1_11 as(Name alias) {
        return new Attestation_1_11(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attestation_1_11 rename(String name) {
        return new Attestation_1_11(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attestation_1_11 rename(Name name) {
        return new Attestation_1_11(name, null);
    }
}
