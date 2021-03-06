/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.SettingsRecord;

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
public class Settings extends TableImpl<SettingsRecord> {

    private static final long serialVersionUID = -1257095973;

    /**
     * The reference instance of <code>settings</code>
     */
    public static final Settings SETTINGS = new Settings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SettingsRecord> getRecordType() {
        return SettingsRecord.class;
    }

    /**
     * The column <code>settings.name</code>.
     */
    public final TableField<SettingsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>settings.value</code>.
     */
    public final TableField<SettingsRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>settings.restricted</code>.
     */
    public final TableField<SettingsRecord, Boolean> RESTRICTED = createField("restricted", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>settings</code> table reference
     */
    public Settings() {
        this(DSL.name("settings"), null);
    }

    /**
     * Create an aliased <code>settings</code> table reference
     */
    public Settings(String alias) {
        this(DSL.name(alias), SETTINGS);
    }

    /**
     * Create an aliased <code>settings</code> table reference
     */
    public Settings(Name alias) {
        this(alias, SETTINGS);
    }

    private Settings(Name alias, Table<SettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Settings(Name alias, Table<SettingsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SETTINGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SettingsRecord> getPrimaryKey() {
        return Keys.KEY_SETTINGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SettingsRecord>> getKeys() {
        return Arrays.<UniqueKey<SettingsRecord>>asList(Keys.KEY_SETTINGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Settings as(String alias) {
        return new Settings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Settings as(Name alias) {
        return new Settings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(String name) {
        return new Settings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(Name name) {
        return new Settings(name, null);
    }
}
