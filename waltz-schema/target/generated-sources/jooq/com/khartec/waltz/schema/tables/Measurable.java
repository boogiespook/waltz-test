/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.MeasurableRecord;

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
public class Measurable extends TableImpl<MeasurableRecord> {

    private static final long serialVersionUID = 1670498995;

    /**
     * The reference instance of <code>measurable</code>
     */
    public static final Measurable MEASURABLE = new Measurable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeasurableRecord> getRecordType() {
        return MeasurableRecord.class;
    }

    /**
     * The column <code>measurable.id</code>.
     */
    public final TableField<MeasurableRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>measurable.parent_id</code>.
     */
    public final TableField<MeasurableRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>measurable.name</code>.
     */
    public final TableField<MeasurableRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>measurable.measurable_category_id</code>.
     */
    public final TableField<MeasurableRecord, Long> MEASURABLE_CATEGORY_ID = createField("measurable_category_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>measurable.concrete</code>.
     */
    public final TableField<MeasurableRecord, Boolean> CONCRETE = createField("concrete", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>measurable.description</code>.
     */
    public final TableField<MeasurableRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>measurable.external_id</code>.
     */
    public final TableField<MeasurableRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>measurable.last_updated_at</code>.
     */
    public final TableField<MeasurableRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>measurable.last_updated_by</code>.
     */
    public final TableField<MeasurableRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>measurable.provenance</code>.
     */
    public final TableField<MeasurableRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>measurable.external_parent_id</code>.
     */
    public final TableField<MeasurableRecord, String> EXTERNAL_PARENT_ID = createField("external_parent_id", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>measurable</code> table reference
     */
    public Measurable() {
        this(DSL.name("measurable"), null);
    }

    /**
     * Create an aliased <code>measurable</code> table reference
     */
    public Measurable(String alias) {
        this(DSL.name(alias), MEASURABLE);
    }

    /**
     * Create an aliased <code>measurable</code> table reference
     */
    public Measurable(Name alias) {
        this(alias, MEASURABLE);
    }

    private Measurable(Name alias, Table<MeasurableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Measurable(Name alias, Table<MeasurableRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEASURABLE_IDX_MEASURABLE_CATEGORY, Indexes.MEASURABLE_MEASURABLE_CONTENT_FT_IDX, Indexes.MEASURABLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MeasurableRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEASURABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeasurableRecord> getPrimaryKey() {
        return Keys.KEY_MEASURABLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeasurableRecord>> getKeys() {
        return Arrays.<UniqueKey<MeasurableRecord>>asList(Keys.KEY_MEASURABLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Measurable as(String alias) {
        return new Measurable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Measurable as(Name alias) {
        return new Measurable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Measurable rename(String name) {
        return new Measurable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Measurable rename(Name name) {
        return new Measurable(name, null);
    }
}
