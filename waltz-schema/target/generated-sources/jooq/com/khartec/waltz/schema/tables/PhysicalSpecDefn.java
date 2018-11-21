/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.PhysicalSpecDefnRecord;

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
 * Stores physical spec definition records
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhysicalSpecDefn extends TableImpl<PhysicalSpecDefnRecord> {

    private static final long serialVersionUID = 170707366;

    /**
     * The reference instance of <code>physical_spec_defn</code>
     */
    public static final PhysicalSpecDefn PHYSICAL_SPEC_DEFN = new PhysicalSpecDefn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhysicalSpecDefnRecord> getRecordType() {
        return PhysicalSpecDefnRecord.class;
    }

    /**
     * The column <code>physical_spec_defn.id</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>physical_spec_defn.specification_id</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, Long> SPECIFICATION_ID = createField("specification_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn.version</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn.delimiter</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> DELIMITER = createField("delimiter", org.jooq.impl.SQLDataType.CHAR(1).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>physical_spec_defn.type</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn.provenance</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn.created_at</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>physical_spec_defn.created_by</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn.last_updated_at</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>physical_spec_defn.last_updated_by</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn.status</code>.
     */
    public final TableField<PhysicalSpecDefnRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>physical_spec_defn</code> table reference
     */
    public PhysicalSpecDefn() {
        this(DSL.name("physical_spec_defn"), null);
    }

    /**
     * Create an aliased <code>physical_spec_defn</code> table reference
     */
    public PhysicalSpecDefn(String alias) {
        this(DSL.name(alias), PHYSICAL_SPEC_DEFN);
    }

    /**
     * Create an aliased <code>physical_spec_defn</code> table reference
     */
    public PhysicalSpecDefn(Name alias) {
        this(alias, PHYSICAL_SPEC_DEFN);
    }

    private PhysicalSpecDefn(Name alias, Table<PhysicalSpecDefnRecord> aliased) {
        this(alias, aliased, null);
    }

    private PhysicalSpecDefn(Name alias, Table<PhysicalSpecDefnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Stores physical spec definition records");
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
        return Arrays.<Index>asList(Indexes.PHYSICAL_SPEC_DEFN_IDX_PSD_SPECIFICATION_ID, Indexes.PHYSICAL_SPEC_DEFN_PHY_SPEC_DEFN_UNIQUE_VERSION, Indexes.PHYSICAL_SPEC_DEFN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PhysicalSpecDefnRecord, Long> getIdentity() {
        return Keys.IDENTITY_PHYSICAL_SPEC_DEFN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PhysicalSpecDefnRecord> getPrimaryKey() {
        return Keys.KEY_PHYSICAL_SPEC_DEFN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PhysicalSpecDefnRecord>> getKeys() {
        return Arrays.<UniqueKey<PhysicalSpecDefnRecord>>asList(Keys.KEY_PHYSICAL_SPEC_DEFN_PRIMARY, Keys.KEY_PHYSICAL_SPEC_DEFN_PHY_SPEC_DEFN_UNIQUE_VERSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefn as(String alias) {
        return new PhysicalSpecDefn(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefn as(Name alias) {
        return new PhysicalSpecDefn(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PhysicalSpecDefn rename(String name) {
        return new PhysicalSpecDefn(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PhysicalSpecDefn rename(Name name) {
        return new PhysicalSpecDefn(name, null);
    }
}
