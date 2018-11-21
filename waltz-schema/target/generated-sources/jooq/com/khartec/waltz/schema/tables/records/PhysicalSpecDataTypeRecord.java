/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.PhysicalSpecDataType;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Decorates physical specs with data types
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhysicalSpecDataTypeRecord extends UpdatableRecordImpl<PhysicalSpecDataTypeRecord> implements Record5<Long, Long, String, Timestamp, String> {

    private static final long serialVersionUID = -1632529439;

    /**
     * Setter for <code>physical_spec_data_type.specification_id</code>.
     */
    public void setSpecificationId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_spec_data_type.specification_id</code>.
     */
    public Long getSpecificationId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_spec_data_type.data_type_id</code>.
     */
    public void setDataTypeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_spec_data_type.data_type_id</code>.
     */
    public Long getDataTypeId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>physical_spec_data_type.provenance</code>.
     */
    public void setProvenance(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_spec_data_type.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(2);
    }

    /**
     * Setter for <code>physical_spec_data_type.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_spec_data_type.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>physical_spec_data_type.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_spec_data_type.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, Timestamp, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, Timestamp, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE.SPECIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE.DATA_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getSpecificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDataTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getSpecificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDataTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDataTypeRecord value1(Long value) {
        setSpecificationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDataTypeRecord value2(Long value) {
        setDataTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDataTypeRecord value3(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDataTypeRecord value4(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDataTypeRecord value5(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDataTypeRecord values(Long value1, Long value2, String value3, Timestamp value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhysicalSpecDataTypeRecord
     */
    public PhysicalSpecDataTypeRecord() {
        super(PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE);
    }

    /**
     * Create a detached, initialised PhysicalSpecDataTypeRecord
     */
    public PhysicalSpecDataTypeRecord(Long specificationId, Long dataTypeId, String provenance, Timestamp lastUpdatedAt, String lastUpdatedBy) {
        super(PhysicalSpecDataType.PHYSICAL_SPEC_DATA_TYPE);

        set(0, specificationId);
        set(1, dataTypeId);
        set(2, provenance);
        set(3, lastUpdatedAt);
        set(4, lastUpdatedBy);
    }
}