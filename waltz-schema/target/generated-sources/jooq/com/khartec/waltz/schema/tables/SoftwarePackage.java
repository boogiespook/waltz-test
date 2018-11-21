/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.SoftwarePackageRecord;

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
public class SoftwarePackage extends TableImpl<SoftwarePackageRecord> {

    private static final long serialVersionUID = -320335668;

    /**
     * The reference instance of <code>software_package</code>
     */
    public static final SoftwarePackage SOFTWARE_PACKAGE = new SoftwarePackage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SoftwarePackageRecord> getRecordType() {
        return SoftwarePackageRecord.class;
    }

    /**
     * The column <code>software_package.id</code>.
     */
    public final TableField<SoftwarePackageRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>software_package.vendor</code>.
     */
    public final TableField<SoftwarePackageRecord, String> VENDOR = createField("vendor", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>software_package.name</code>.
     */
    public final TableField<SoftwarePackageRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>software_package.version</code>.
     */
    public final TableField<SoftwarePackageRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>software_package.maturity_status</code>.
     */
    public final TableField<SoftwarePackageRecord, String> MATURITY_STATUS = createField("maturity_status", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'HOLD'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>software_package.notable</code>.
     */
    public final TableField<SoftwarePackageRecord, Boolean> NOTABLE = createField("notable", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>software_package.description</code>.
     */
    public final TableField<SoftwarePackageRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>software_package.external_id</code>.
     */
    public final TableField<SoftwarePackageRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>software_package.provenance</code>.
     */
    public final TableField<SoftwarePackageRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>software_package</code> table reference
     */
    public SoftwarePackage() {
        this(DSL.name("software_package"), null);
    }

    /**
     * Create an aliased <code>software_package</code> table reference
     */
    public SoftwarePackage(String alias) {
        this(DSL.name(alias), SOFTWARE_PACKAGE);
    }

    /**
     * Create an aliased <code>software_package</code> table reference
     */
    public SoftwarePackage(Name alias) {
        this(alias, SOFTWARE_PACKAGE);
    }

    private SoftwarePackage(Name alias, Table<SoftwarePackageRecord> aliased) {
        this(alias, aliased, null);
    }

    private SoftwarePackage(Name alias, Table<SoftwarePackageRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SOFTWARE_PACKAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SoftwarePackageRecord, Long> getIdentity() {
        return Keys.IDENTITY_SOFTWARE_PACKAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SoftwarePackageRecord> getPrimaryKey() {
        return Keys.KEY_SOFTWARE_PACKAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SoftwarePackageRecord>> getKeys() {
        return Arrays.<UniqueKey<SoftwarePackageRecord>>asList(Keys.KEY_SOFTWARE_PACKAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SoftwarePackage as(String alias) {
        return new SoftwarePackage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SoftwarePackage as(Name alias) {
        return new SoftwarePackage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SoftwarePackage rename(String name) {
        return new SoftwarePackage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SoftwarePackage rename(Name name) {
        return new SoftwarePackage(name, null);
    }
}
