/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.tables.records.EntityWorkflowStateRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Store entity workflow states
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityWorkflowState extends TableImpl<EntityWorkflowStateRecord> {

    private static final long serialVersionUID = -1405586691;

    /**
     * The reference instance of <code>entity_workflow_state</code>
     */
    public static final EntityWorkflowState ENTITY_WORKFLOW_STATE = new EntityWorkflowState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityWorkflowStateRecord> getRecordType() {
        return EntityWorkflowStateRecord.class;
    }

    /**
     * The column <code>entity_workflow_state.workflow_id</code>.
     */
    public final TableField<EntityWorkflowStateRecord, Long> WORKFLOW_ID = createField("workflow_id", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>entity_workflow_state.entity_id</code>.
     */
    public final TableField<EntityWorkflowStateRecord, Long> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>entity_workflow_state.entity_kind</code>.
     */
    public final TableField<EntityWorkflowStateRecord, String> ENTITY_KIND = createField("entity_kind", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>entity_workflow_state.state</code>.
     */
    public final TableField<EntityWorkflowStateRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>entity_workflow_state.last_updated_at</code>.
     */
    public final TableField<EntityWorkflowStateRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>entity_workflow_state.last_updated_by</code>.
     */
    public final TableField<EntityWorkflowStateRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>entity_workflow_state.provenance</code>.
     */
    public final TableField<EntityWorkflowStateRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>entity_workflow_state.description</code>.
     */
    public final TableField<EntityWorkflowStateRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>entity_workflow_state</code> table reference
     */
    public EntityWorkflowState() {
        this(DSL.name("entity_workflow_state"), null);
    }

    /**
     * Create an aliased <code>entity_workflow_state</code> table reference
     */
    public EntityWorkflowState(String alias) {
        this(DSL.name(alias), ENTITY_WORKFLOW_STATE);
    }

    /**
     * Create an aliased <code>entity_workflow_state</code> table reference
     */
    public EntityWorkflowState(Name alias) {
        this(alias, ENTITY_WORKFLOW_STATE);
    }

    private EntityWorkflowState(Name alias, Table<EntityWorkflowStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityWorkflowState(Name alias, Table<EntityWorkflowStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Store entity workflow states");
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
    public EntityWorkflowState as(String alias) {
        return new EntityWorkflowState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowState as(Name alias) {
        return new EntityWorkflowState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityWorkflowState rename(String name) {
        return new EntityWorkflowState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityWorkflowState rename(Name name) {
        return new EntityWorkflowState(name, null);
    }
}