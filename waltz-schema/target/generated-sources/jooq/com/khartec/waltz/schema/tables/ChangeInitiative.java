/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.ChangeInitiativeRecord;

import java.sql.Date;
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
public class ChangeInitiative extends TableImpl<ChangeInitiativeRecord> {

    private static final long serialVersionUID = 446169019;

    /**
     * The reference instance of <code>change_initiative</code>
     */
    public static final ChangeInitiative CHANGE_INITIATIVE = new ChangeInitiative();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChangeInitiativeRecord> getRecordType() {
        return ChangeInitiativeRecord.class;
    }

    /**
     * The column <code>change_initiative.id</code>.
     */
    public final TableField<ChangeInitiativeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>change_initiative.parent_id</code>.
     */
    public final TableField<ChangeInitiativeRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>change_initiative.external_id</code>.
     */
    public final TableField<ChangeInitiativeRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>change_initiative.name</code>.
     */
    public final TableField<ChangeInitiativeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>change_initiative.kind</code>.
     */
    public final TableField<ChangeInitiativeRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'PROGRAMME'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>change_initiative.lifecycle_phase</code>.
     */
    public final TableField<ChangeInitiativeRecord, String> LIFECYCLE_PHASE = createField("lifecycle_phase", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'DEVELOPMENT'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>change_initiative.description</code>.
     */
    public final TableField<ChangeInitiativeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>change_initiative.last_update</code>.
     */
    public final TableField<ChangeInitiativeRecord, Date> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.DATE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * The column <code>change_initiative.start_date</code>.
     */
    public final TableField<ChangeInitiativeRecord, Date> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>change_initiative.end_date</code>.
     */
    public final TableField<ChangeInitiativeRecord, Date> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>change_initiative.provenance</code>.
     */
    public final TableField<ChangeInitiativeRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>change_initiative.organisational_unit_id</code>.
     */
    public final TableField<ChangeInitiativeRecord, Long> ORGANISATIONAL_UNIT_ID = createField("organisational_unit_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>change_initiative</code> table reference
     */
    public ChangeInitiative() {
        this(DSL.name("change_initiative"), null);
    }

    /**
     * Create an aliased <code>change_initiative</code> table reference
     */
    public ChangeInitiative(String alias) {
        this(DSL.name(alias), CHANGE_INITIATIVE);
    }

    /**
     * Create an aliased <code>change_initiative</code> table reference
     */
    public ChangeInitiative(Name alias) {
        this(alias, CHANGE_INITIATIVE);
    }

    private ChangeInitiative(Name alias, Table<ChangeInitiativeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChangeInitiative(Name alias, Table<ChangeInitiativeRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CHANGE_INITIATIVE_CHANGE_INITIATIVE_CONTENT_FT_IDX, Indexes.CHANGE_INITIATIVE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChangeInitiativeRecord> getPrimaryKey() {
        return Keys.KEY_CHANGE_INITIATIVE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChangeInitiativeRecord>> getKeys() {
        return Arrays.<UniqueKey<ChangeInitiativeRecord>>asList(Keys.KEY_CHANGE_INITIATIVE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeInitiative as(String alias) {
        return new ChangeInitiative(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeInitiative as(Name alias) {
        return new ChangeInitiative(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeInitiative rename(String name) {
        return new ChangeInitiative(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangeInitiative rename(Name name) {
        return new ChangeInitiative(name, null);
    }
}
