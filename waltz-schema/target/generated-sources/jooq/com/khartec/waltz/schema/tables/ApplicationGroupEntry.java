/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.ApplicationGroupEntryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ApplicationGroupEntry extends TableImpl<ApplicationGroupEntryRecord> {

    private static final long serialVersionUID = -1825577624;

    /**
     * The reference instance of <code>application_group_entry</code>
     */
    public static final ApplicationGroupEntry APPLICATION_GROUP_ENTRY = new ApplicationGroupEntry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationGroupEntryRecord> getRecordType() {
        return ApplicationGroupEntryRecord.class;
    }

    /**
     * The column <code>application_group_entry.group_id</code>.
     */
    public final TableField<ApplicationGroupEntryRecord, Long> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>application_group_entry.application_id</code>.
     */
    public final TableField<ApplicationGroupEntryRecord, Long> APPLICATION_ID = createField("application_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>application_group_entry</code> table reference
     */
    public ApplicationGroupEntry() {
        this(DSL.name("application_group_entry"), null);
    }

    /**
     * Create an aliased <code>application_group_entry</code> table reference
     */
    public ApplicationGroupEntry(String alias) {
        this(DSL.name(alias), APPLICATION_GROUP_ENTRY);
    }

    /**
     * Create an aliased <code>application_group_entry</code> table reference
     */
    public ApplicationGroupEntry(Name alias) {
        this(alias, APPLICATION_GROUP_ENTRY);
    }

    private ApplicationGroupEntry(Name alias, Table<ApplicationGroupEntryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicationGroupEntry(Name alias, Table<ApplicationGroupEntryRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.APPLICATION_GROUP_ENTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationGroupEntryRecord> getPrimaryKey() {
        return Keys.KEY_APPLICATION_GROUP_ENTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationGroupEntryRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationGroupEntryRecord>>asList(Keys.KEY_APPLICATION_GROUP_ENTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApplicationGroupEntryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApplicationGroupEntryRecord, ?>>asList(Keys.APPLICATION_GROUP_ENTRY_GROUP_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupEntry as(String alias) {
        return new ApplicationGroupEntry(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupEntry as(Name alias) {
        return new ApplicationGroupEntry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicationGroupEntry rename(String name) {
        return new ApplicationGroupEntry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicationGroupEntry rename(Name name) {
        return new ApplicationGroupEntry(name, null);
    }
}