/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.EntityWorkflowDefinitionRecord;

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
 * Store entity workflow definitions
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityWorkflowDefinition extends TableImpl<EntityWorkflowDefinitionRecord> {

    private static final long serialVersionUID = 584437085;

    /**
     * The reference instance of <code>entity_workflow_definition</code>
     */
    public static final EntityWorkflowDefinition ENTITY_WORKFLOW_DEFINITION = new EntityWorkflowDefinition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityWorkflowDefinitionRecord> getRecordType() {
        return EntityWorkflowDefinitionRecord.class;
    }

    /**
     * The column <code>entity_workflow_definition.id</code>.
     */
    public final TableField<EntityWorkflowDefinitionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>entity_workflow_definition.name</code>.
     */
    public final TableField<EntityWorkflowDefinitionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>entity_workflow_definition.description</code>.
     */
    public final TableField<EntityWorkflowDefinitionRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>entity_workflow_definition</code> table reference
     */
    public EntityWorkflowDefinition() {
        this(DSL.name("entity_workflow_definition"), null);
    }

    /**
     * Create an aliased <code>entity_workflow_definition</code> table reference
     */
    public EntityWorkflowDefinition(String alias) {
        this(DSL.name(alias), ENTITY_WORKFLOW_DEFINITION);
    }

    /**
     * Create an aliased <code>entity_workflow_definition</code> table reference
     */
    public EntityWorkflowDefinition(Name alias) {
        this(alias, ENTITY_WORKFLOW_DEFINITION);
    }

    private EntityWorkflowDefinition(Name alias, Table<EntityWorkflowDefinitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityWorkflowDefinition(Name alias, Table<EntityWorkflowDefinitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Store entity workflow definitions");
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
        return Arrays.<Index>asList(Indexes.ENTITY_WORKFLOW_DEFINITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EntityWorkflowDefinitionRecord, Long> getIdentity() {
        return Keys.IDENTITY_ENTITY_WORKFLOW_DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EntityWorkflowDefinitionRecord> getPrimaryKey() {
        return Keys.KEY_ENTITY_WORKFLOW_DEFINITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EntityWorkflowDefinitionRecord>> getKeys() {
        return Arrays.<UniqueKey<EntityWorkflowDefinitionRecord>>asList(Keys.KEY_ENTITY_WORKFLOW_DEFINITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowDefinition as(String alias) {
        return new EntityWorkflowDefinition(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowDefinition as(Name alias) {
        return new EntityWorkflowDefinition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityWorkflowDefinition rename(String name) {
        return new EntityWorkflowDefinition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityWorkflowDefinition rename(Name name) {
        return new EntityWorkflowDefinition(name, null);
    }
}
