/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.EntityWorkflowTransition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * Store entity workflow transitions
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityWorkflowTransitionRecord extends TableRecordImpl<EntityWorkflowTransitionRecord> implements Record9<Long, Long, String, String, String, String, Timestamp, String, String> {

    private static final long serialVersionUID = 1007771626;

    /**
     * Setter for <code>entity_workflow_transition.workflow_id</code>.
     */
    public void setWorkflowId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.workflow_id</code>.
     */
    public Long getWorkflowId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>entity_workflow_transition.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>entity_workflow_transition.entity_kind</code>.
     */
    public void setEntityKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.entity_kind</code>.
     */
    public String getEntityKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>entity_workflow_transition.from_state</code>.
     */
    public void setFromState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.from_state</code>.
     */
    public String getFromState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>entity_workflow_transition.to_state</code>.
     */
    public void setToState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.to_state</code>.
     */
    public String getToState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>entity_workflow_transition.reason</code>.
     */
    public void setReason(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.reason</code>.
     */
    public String getReason() {
        return (String) get(5);
    }

    /**
     * Setter for <code>entity_workflow_transition.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>entity_workflow_transition.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>entity_workflow_transition.provenance</code>.
     */
    public void setProvenance(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>entity_workflow_transition.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, String, String, String, Timestamp, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, String, String, String, Timestamp, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.WORKFLOW_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.FROM_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.TO_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getWorkflowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEntityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFromState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getToState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getWorkflowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEntityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFromState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getToState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value1(Long value) {
        setWorkflowId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value2(Long value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value3(String value) {
        setEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value4(String value) {
        setFromState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value5(String value) {
        setToState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value6(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value7(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value8(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord value9(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityWorkflowTransitionRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, Timestamp value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntityWorkflowTransitionRecord
     */
    public EntityWorkflowTransitionRecord() {
        super(EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION);
    }

    /**
     * Create a detached, initialised EntityWorkflowTransitionRecord
     */
    public EntityWorkflowTransitionRecord(Long workflowId, Long entityId, String entityKind, String fromState, String toState, String reason, Timestamp lastUpdatedAt, String lastUpdatedBy, String provenance) {
        super(EntityWorkflowTransition.ENTITY_WORKFLOW_TRANSITION);

        set(0, workflowId);
        set(1, entityId);
        set(2, entityKind);
        set(3, fromState);
        set(4, toState);
        set(5, reason);
        set(6, lastUpdatedAt);
        set(7, lastUpdatedBy);
        set(8, provenance);
    }
}
