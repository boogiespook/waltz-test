/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.tables.records.ProcessRecord;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Process extends TableImpl<ProcessRecord> {

    private static final long serialVersionUID = -67593393;

    /**
     * The reference instance of <code>process</code>
     */
    public static final Process PROCESS = new Process();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcessRecord> getRecordType() {
        return ProcessRecord.class;
    }

    /**
     * The column <code>process.id</code>.
     */
    public final TableField<ProcessRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>process.parent_id</code>.
     */
    public final TableField<ProcessRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>process.name</code>.
     */
    public final TableField<ProcessRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>process.level_1</code>.
     */
    public final TableField<ProcessRecord, Long> LEVEL_1 = createField("level_1", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>process.level_2</code>.
     */
    public final TableField<ProcessRecord, Long> LEVEL_2 = createField("level_2", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>process.level_3</code>.
     */
    public final TableField<ProcessRecord, Long> LEVEL_3 = createField("level_3", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>process.description</code>.
     */
    public final TableField<ProcessRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>process.level</code>.
     */
    public final TableField<ProcessRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>process</code> table reference
     */
    public Process() {
        this(DSL.name("process"), null);
    }

    /**
     * Create an aliased <code>process</code> table reference
     */
    public Process(String alias) {
        this(DSL.name(alias), PROCESS);
    }

    /**
     * Create an aliased <code>process</code> table reference
     */
    public Process(Name alias) {
        this(alias, PROCESS);
    }

    private Process(Name alias, Table<ProcessRecord> aliased) {
        this(alias, aliased, null);
    }

    private Process(Name alias, Table<ProcessRecord> aliased, Field<?>[] parameters) {
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
    public Process as(String alias) {
        return new Process(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Process as(Name alias) {
        return new Process(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Process rename(String name) {
        return new Process(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Process rename(Name name) {
        return new Process(name, null);
    }
}