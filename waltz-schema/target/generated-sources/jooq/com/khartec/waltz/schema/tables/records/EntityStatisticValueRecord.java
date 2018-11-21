/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.EntityStatisticValue;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class EntityStatisticValueRecord extends UpdatableRecordImpl<EntityStatisticValueRecord> implements Record11<Long, Long, String, Long, String, String, String, String, Timestamp, Boolean, String> {

    private static final long serialVersionUID = -280077786;

    /**
     * Setter for <code>entity_statistic_value.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>entity_statistic_value.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>entity_statistic_value.statistic_id</code>.
     */
    public void setStatisticId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>entity_statistic_value.statistic_id</code>.
     */
    public Long getStatisticId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>entity_statistic_value.entity_kind</code>.
     */
    public void setEntityKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>entity_statistic_value.entity_kind</code>.
     */
    public String getEntityKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>entity_statistic_value.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>entity_statistic_value.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>entity_statistic_value.value</code>.
     */
    public void setValue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>entity_statistic_value.value</code>.
     */
    public String getValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>entity_statistic_value.outcome</code>.
     */
    public void setOutcome(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>entity_statistic_value.outcome</code>.
     */
    public String getOutcome() {
        return (String) get(5);
    }

    /**
     * Setter for <code>entity_statistic_value.state</code>.
     */
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>entity_statistic_value.state</code>.
     */
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>entity_statistic_value.reason</code>.
     */
    public void setReason(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>entity_statistic_value.reason</code>.
     */
    public String getReason() {
        return (String) get(7);
    }

    /**
     * Setter for <code>entity_statistic_value.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>entity_statistic_value.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>entity_statistic_value.current</code>.
     */
    public void setCurrent(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>entity_statistic_value.current</code>.
     */
    public Boolean getCurrent() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>entity_statistic_value.provenance</code>.
     */
    public void setProvenance(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>entity_statistic_value.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, Long, String, String, String, String, Timestamp, Boolean, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, Long, String, String, String, String, Timestamp, Boolean, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.STATISTIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.OUTCOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.CURRENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EntityStatisticValue.ENTITY_STATISTIC_VALUE.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getStatisticId();
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
    public Long component4() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOutcome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getCurrent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getStatisticId();
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
    public Long value4() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOutcome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getCurrent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value2(Long value) {
        setStatisticId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value3(String value) {
        setEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value4(Long value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value5(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value6(String value) {
        setOutcome(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value8(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value9(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value10(Boolean value) {
        setCurrent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord value11(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityStatisticValueRecord values(Long value1, Long value2, String value3, Long value4, String value5, String value6, String value7, String value8, Timestamp value9, Boolean value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntityStatisticValueRecord
     */
    public EntityStatisticValueRecord() {
        super(EntityStatisticValue.ENTITY_STATISTIC_VALUE);
    }

    /**
     * Create a detached, initialised EntityStatisticValueRecord
     */
    public EntityStatisticValueRecord(Long id, Long statisticId, String entityKind, Long entityId, String value, String outcome, String state, String reason, Timestamp createdAt, Boolean current, String provenance) {
        super(EntityStatisticValue.ENTITY_STATISTIC_VALUE);

        set(0, id);
        set(1, statisticId);
        set(2, entityKind);
        set(3, entityId);
        set(4, value);
        set(5, outcome);
        set(6, state);
        set(7, reason);
        set(8, createdAt);
        set(9, current);
        set(10, provenance);
    }
}