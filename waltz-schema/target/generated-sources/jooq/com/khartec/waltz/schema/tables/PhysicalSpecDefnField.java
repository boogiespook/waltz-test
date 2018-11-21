/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.PhysicalSpecDefnFieldRecord;

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
 * Stores physical spec definition fields
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhysicalSpecDefnField extends TableImpl<PhysicalSpecDefnFieldRecord> {

    private static final long serialVersionUID = 1306015332;

    /**
     * The reference instance of <code>physical_spec_defn_field</code>
     */
    public static final PhysicalSpecDefnField PHYSICAL_SPEC_DEFN_FIELD = new PhysicalSpecDefnField();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhysicalSpecDefnFieldRecord> getRecordType() {
        return PhysicalSpecDefnFieldRecord.class;
    }

    /**
     * The column <code>physical_spec_defn_field.id</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>physical_spec_defn_field.spec_defn_id</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, Long> SPEC_DEFN_ID = createField("spec_defn_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn_field.name</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn_field.position</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, Integer> POSITION = createField("position", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn_field.type</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn_field.description</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn_field.last_updated_at</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>physical_spec_defn_field.last_updated_by</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>physical_spec_defn_field.logical_data_element_id</code>.
     */
    public final TableField<PhysicalSpecDefnFieldRecord, Long> LOGICAL_DATA_ELEMENT_ID = createField("logical_data_element_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>physical_spec_defn_field</code> table reference
     */
    public PhysicalSpecDefnField() {
        this(DSL.name("physical_spec_defn_field"), null);
    }

    /**
     * Create an aliased <code>physical_spec_defn_field</code> table reference
     */
    public PhysicalSpecDefnField(String alias) {
        this(DSL.name(alias), PHYSICAL_SPEC_DEFN_FIELD);
    }

    /**
     * Create an aliased <code>physical_spec_defn_field</code> table reference
     */
    public PhysicalSpecDefnField(Name alias) {
        this(alias, PHYSICAL_SPEC_DEFN_FIELD);
    }

    private PhysicalSpecDefnField(Name alias, Table<PhysicalSpecDefnFieldRecord> aliased) {
        this(alias, aliased, null);
    }

    private PhysicalSpecDefnField(Name alias, Table<PhysicalSpecDefnFieldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Stores physical spec definition fields");
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
        return Arrays.<Index>asList(Indexes.PHYSICAL_SPEC_DEFN_FIELD_IDX_PSDF_SPEC_DEFN_ID, Indexes.PHYSICAL_SPEC_DEFN_FIELD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PhysicalSpecDefnFieldRecord, Long> getIdentity() {
        return Keys.IDENTITY_PHYSICAL_SPEC_DEFN_FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PhysicalSpecDefnFieldRecord> getPrimaryKey() {
        return Keys.KEY_PHYSICAL_SPEC_DEFN_FIELD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PhysicalSpecDefnFieldRecord>> getKeys() {
        return Arrays.<UniqueKey<PhysicalSpecDefnFieldRecord>>asList(Keys.KEY_PHYSICAL_SPEC_DEFN_FIELD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnField as(String alias) {
        return new PhysicalSpecDefnField(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnField as(Name alias) {
        return new PhysicalSpecDefnField(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PhysicalSpecDefnField rename(String name) {
        return new PhysicalSpecDefnField(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PhysicalSpecDefnField rename(Name name) {
        return new PhysicalSpecDefnField(name, null);
    }
}
