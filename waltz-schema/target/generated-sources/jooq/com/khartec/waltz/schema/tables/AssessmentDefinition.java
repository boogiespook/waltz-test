/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.AssessmentDefinitionRecord;

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
 * Add assessment definition table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AssessmentDefinition extends TableImpl<AssessmentDefinitionRecord> {

    private static final long serialVersionUID = 1036408218;

    /**
     * The reference instance of <code>assessment_definition</code>
     */
    public static final AssessmentDefinition ASSESSMENT_DEFINITION = new AssessmentDefinition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessmentDefinitionRecord> getRecordType() {
        return AssessmentDefinitionRecord.class;
    }

    /**
     * The column <code>assessment_definition.id</code>.
     */
    public final TableField<AssessmentDefinitionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>assessment_definition.name</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>assessment_definition.external_id</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>assessment_definition.rating_scheme_id</code>.
     */
    public final TableField<AssessmentDefinitionRecord, Long> RATING_SCHEME_ID = createField("rating_scheme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>assessment_definition.entity_kind</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> ENTITY_KIND = createField("entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>assessment_definition.description</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>assessment_definition.permitted_role</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> PERMITTED_ROLE = createField("permitted_role", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>assessment_definition.last_updated_at</code>.
     */
    public final TableField<AssessmentDefinitionRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>assessment_definition.last_updated_by</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>assessment_definition.is_readonly</code>.
     */
    public final TableField<AssessmentDefinitionRecord, Boolean> IS_READONLY = createField("is_readonly", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>assessment_definition.provenance</code>.
     */
    public final TableField<AssessmentDefinitionRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>assessment_definition</code> table reference
     */
    public AssessmentDefinition() {
        this(DSL.name("assessment_definition"), null);
    }

    /**
     * Create an aliased <code>assessment_definition</code> table reference
     */
    public AssessmentDefinition(String alias) {
        this(DSL.name(alias), ASSESSMENT_DEFINITION);
    }

    /**
     * Create an aliased <code>assessment_definition</code> table reference
     */
    public AssessmentDefinition(Name alias) {
        this(alias, ASSESSMENT_DEFINITION);
    }

    private AssessmentDefinition(Name alias, Table<AssessmentDefinitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessmentDefinition(Name alias, Table<AssessmentDefinitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Add assessment definition table");
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
        return Arrays.<Index>asList(Indexes.ASSESSMENT_DEFINITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AssessmentDefinitionRecord, Long> getIdentity() {
        return Keys.IDENTITY_ASSESSMENT_DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessmentDefinitionRecord> getPrimaryKey() {
        return Keys.KEY_ASSESSMENT_DEFINITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessmentDefinitionRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessmentDefinitionRecord>>asList(Keys.KEY_ASSESSMENT_DEFINITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentDefinition as(String alias) {
        return new AssessmentDefinition(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentDefinition as(Name alias) {
        return new AssessmentDefinition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessmentDefinition rename(String name) {
        return new AssessmentDefinition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessmentDefinition rename(Name name) {
        return new AssessmentDefinition(name, null);
    }
}