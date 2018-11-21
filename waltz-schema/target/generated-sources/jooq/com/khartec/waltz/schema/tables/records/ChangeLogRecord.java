/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.ChangeLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class ChangeLogRecord extends UpdatableRecordImpl<ChangeLogRecord> implements Record9<Integer, String, Long, String, String, String, Timestamp, String, String> {

    private static final long serialVersionUID = 2059782473;

    /**
     * Setter for <code>change_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>change_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>change_log.parent_kind</code>.
     */
    public void setParentKind(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>change_log.parent_kind</code>.
     */
    public String getParentKind() {
        return (String) get(1);
    }

    /**
     * Setter for <code>change_log.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>change_log.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>change_log.message</code>.
     */
    public void setMessage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>change_log.message</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>change_log.user_id</code>.
     */
    public void setUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>change_log.user_id</code>.
     */
    public String getUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>change_log.severity</code>.
     */
    public void setSeverity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>change_log.severity</code>.
     */
    public String getSeverity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>change_log.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>change_log.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>change_log.child_kind</code>.
     */
    public void setChildKind(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>change_log.child_kind</code>.
     */
    public String getChildKind() {
        return (String) get(7);
    }

    /**
     * Setter for <code>change_log.operation</code>.
     */
    public void setOperation(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>change_log.operation</code>.
     */
    public String getOperation() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Long, String, String, String, Timestamp, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Long, String, String, String, Timestamp, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ChangeLog.CHANGE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ChangeLog.CHANGE_LOG.PARENT_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ChangeLog.CHANGE_LOG.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ChangeLog.CHANGE_LOG.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ChangeLog.CHANGE_LOG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ChangeLog.CHANGE_LOG.SEVERITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ChangeLog.CHANGE_LOG.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ChangeLog.CHANGE_LOG.CHILD_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ChangeLog.CHANGE_LOG.OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getParentKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSeverity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getChildKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSeverity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getChildKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value2(String value) {
        setParentKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value3(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value4(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value5(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value6(String value) {
        setSeverity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value7(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value8(String value) {
        setChildKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord value9(String value) {
        setOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangeLogRecord values(Integer value1, String value2, Long value3, String value4, String value5, String value6, Timestamp value7, String value8, String value9) {
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
     * Create a detached ChangeLogRecord
     */
    public ChangeLogRecord() {
        super(ChangeLog.CHANGE_LOG);
    }

    /**
     * Create a detached, initialised ChangeLogRecord
     */
    public ChangeLogRecord(Integer id, String parentKind, Long parentId, String message, String userId, String severity, Timestamp createdAt, String childKind, String operation) {
        super(ChangeLog.CHANGE_LOG);

        set(0, id);
        set(1, parentKind);
        set(2, parentId);
        set(3, message);
        set(4, userId);
        set(5, severity);
        set(6, createdAt);
        set(7, childKind);
        set(8, operation);
    }
}