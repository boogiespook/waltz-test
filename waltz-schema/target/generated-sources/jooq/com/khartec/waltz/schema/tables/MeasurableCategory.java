/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.MeasurableCategoryRecord;

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
public class MeasurableCategory extends TableImpl<MeasurableCategoryRecord> {

    private static final long serialVersionUID = -1505111219;

    /**
     * The reference instance of <code>measurable_category</code>
     */
    public static final MeasurableCategory MEASURABLE_CATEGORY = new MeasurableCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeasurableCategoryRecord> getRecordType() {
        return MeasurableCategoryRecord.class;
    }

    /**
     * The column <code>measurable_category.id</code>.
     */
    public final TableField<MeasurableCategoryRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>measurable_category.name</code>.
     */
    public final TableField<MeasurableCategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>measurable_category.description</code>.
     */
    public final TableField<MeasurableCategoryRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>measurable_category.external_id</code>.
     */
    public final TableField<MeasurableCategoryRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>measurable_category.last_updated_at</code>.
     */
    public final TableField<MeasurableCategoryRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>measurable_category.last_updated_by</code>.
     */
    public final TableField<MeasurableCategoryRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>measurable_category.rating_scheme_id</code>.
     */
    public final TableField<MeasurableCategoryRecord, Long> RATING_SCHEME_ID = createField("rating_scheme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>measurable_category.editable</code>.
     */
    public final TableField<MeasurableCategoryRecord, Boolean> EDITABLE = createField("editable", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>measurable_category</code> table reference
     */
    public MeasurableCategory() {
        this(DSL.name("measurable_category"), null);
    }

    /**
     * Create an aliased <code>measurable_category</code> table reference
     */
    public MeasurableCategory(String alias) {
        this(DSL.name(alias), MEASURABLE_CATEGORY);
    }

    /**
     * Create an aliased <code>measurable_category</code> table reference
     */
    public MeasurableCategory(Name alias) {
        this(alias, MEASURABLE_CATEGORY);
    }

    private MeasurableCategory(Name alias, Table<MeasurableCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeasurableCategory(Name alias, Table<MeasurableCategoryRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEASURABLE_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MeasurableCategoryRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEASURABLE_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeasurableCategoryRecord> getPrimaryKey() {
        return Keys.KEY_MEASURABLE_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeasurableCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<MeasurableCategoryRecord>>asList(Keys.KEY_MEASURABLE_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeasurableCategory as(String alias) {
        return new MeasurableCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeasurableCategory as(Name alias) {
        return new MeasurableCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeasurableCategory rename(String name) {
        return new MeasurableCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeasurableCategory rename(Name name) {
        return new MeasurableCategory(name, null);
    }
}