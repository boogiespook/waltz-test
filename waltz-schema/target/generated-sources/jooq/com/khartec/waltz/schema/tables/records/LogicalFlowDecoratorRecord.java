/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.LogicalFlowDecorator;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LogicalFlowDecoratorRecord extends UpdatableRecordImpl<LogicalFlowDecoratorRecord> implements Record7<Long, String, Long, String, String, Timestamp, String> {

    private static final long serialVersionUID = 2041745656;

    /**
     * Setter for <code>logical_flow_decorator.logical_flow_id</code>.
     */
    public void setLogicalFlowId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.logical_flow_id</code>.
     */
    public Long getLogicalFlowId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>logical_flow_decorator.decorator_entity_kind</code>.
     */
    public void setDecoratorEntityKind(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.decorator_entity_kind</code>.
     */
    public String getDecoratorEntityKind() {
        return (String) get(1);
    }

    /**
     * Setter for <code>logical_flow_decorator.decorator_entity_id</code>.
     */
    public void setDecoratorEntityId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.decorator_entity_id</code>.
     */
    public Long getDecoratorEntityId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>logical_flow_decorator.rating</code>.
     */
    public void setRating(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.rating</code>.
     */
    public String getRating() {
        return (String) get(3);
    }

    /**
     * Setter for <code>logical_flow_decorator.provenance</code>.
     */
    public void setProvenance(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(4);
    }

    /**
     * Setter for <code>logical_flow_decorator.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>logical_flow_decorator.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>logical_flow_decorator.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Long, String, Long> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Long, String, String, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Long, String, String, Timestamp, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.LOGICAL_FLOW_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.DECORATOR_ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.DECORATOR_ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getLogicalFlowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDecoratorEntityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getDecoratorEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getLogicalFlowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDecoratorEntityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getDecoratorEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value1(Long value) {
        setLogicalFlowId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value2(String value) {
        setDecoratorEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value3(Long value) {
        setDecoratorEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value4(String value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value5(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value6(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord value7(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogicalFlowDecoratorRecord values(Long value1, String value2, Long value3, String value4, String value5, Timestamp value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogicalFlowDecoratorRecord
     */
    public LogicalFlowDecoratorRecord() {
        super(LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR);
    }

    /**
     * Create a detached, initialised LogicalFlowDecoratorRecord
     */
    public LogicalFlowDecoratorRecord(Long logicalFlowId, String decoratorEntityKind, Long decoratorEntityId, String rating, String provenance, Timestamp lastUpdatedAt, String lastUpdatedBy) {
        super(LogicalFlowDecorator.LOGICAL_FLOW_DECORATOR);

        set(0, logicalFlowId);
        set(1, decoratorEntityKind);
        set(2, decoratorEntityId);
        set(3, rating);
        set(4, provenance);
        set(5, lastUpdatedAt);
        set(6, lastUpdatedBy);
    }
}