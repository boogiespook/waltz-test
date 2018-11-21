/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.PhysicalFlow;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class PhysicalFlowRecord extends UpdatableRecordImpl<PhysicalFlowRecord> implements Record16<Long, Long, Integer, String, String, String, String, Timestamp, String, Long, Long, Boolean, Timestamp, String, String, String> {

    private static final long serialVersionUID = -2035238391;

    /**
     * Setter for <code>physical_flow.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_flow.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_flow.specification_id</code>.
     */
    public void setSpecificationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_flow.specification_id</code>.
     */
    public Long getSpecificationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>physical_flow.basis_offset</code>.
     */
    public void setBasisOffset(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_flow.basis_offset</code>.
     */
    public Integer getBasisOffset() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>physical_flow.frequency</code>.
     */
    public void setFrequency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_flow.frequency</code>.
     */
    public String getFrequency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>physical_flow.transport</code>.
     */
    public void setTransport(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_flow.transport</code>.
     */
    public String getTransport() {
        return (String) get(4);
    }

    /**
     * Setter for <code>physical_flow.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_flow.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>physical_flow.provenance</code>.
     */
    public void setProvenance(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_flow.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(6);
    }

    /**
     * Setter for <code>physical_flow.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_flow.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>physical_flow.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_flow.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>physical_flow.logical_flow_id</code>.
     */
    public void setLogicalFlowId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>physical_flow.logical_flow_id</code>.
     */
    public Long getLogicalFlowId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>physical_flow.specification_definition_id</code>.
     */
    public void setSpecificationDefinitionId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>physical_flow.specification_definition_id</code>.
     */
    public Long getSpecificationDefinitionId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>physical_flow.is_removed</code>.
     */
    public void setIsRemoved(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>physical_flow.is_removed</code>.
     */
    public Boolean getIsRemoved() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>physical_flow.last_attested_at</code>.
     */
    public void setLastAttestedAt(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>physical_flow.last_attested_at</code>.
     */
    public Timestamp getLastAttestedAt() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>physical_flow.last_attested_by</code>.
     */
    public void setLastAttestedBy(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>physical_flow.last_attested_by</code>.
     */
    public String getLastAttestedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>physical_flow.criticality</code>.
     */
    public void setCriticality(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>physical_flow.criticality</code>.
     */
    public String getCriticality() {
        return (String) get(14);
    }

    /**
     * Setter for <code>physical_flow.external_id</code>.
     */
    public void setExternalId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>physical_flow.external_id</code>.
     */
    public String getExternalId() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, Integer, String, String, String, String, Timestamp, String, Long, Long, Boolean, Timestamp, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, Integer, String, String, String, String, Timestamp, String, Long, Long, Boolean, Timestamp, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PhysicalFlow.PHYSICAL_FLOW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PhysicalFlow.PHYSICAL_FLOW.SPECIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PhysicalFlow.PHYSICAL_FLOW.BASIS_OFFSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PhysicalFlow.PHYSICAL_FLOW.FREQUENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PhysicalFlow.PHYSICAL_FLOW.TRANSPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PhysicalFlow.PHYSICAL_FLOW.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PhysicalFlow.PHYSICAL_FLOW.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return PhysicalFlow.PHYSICAL_FLOW.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return PhysicalFlow.PHYSICAL_FLOW.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return PhysicalFlow.PHYSICAL_FLOW.LOGICAL_FLOW_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return PhysicalFlow.PHYSICAL_FLOW.SPECIFICATION_DEFINITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return PhysicalFlow.PHYSICAL_FLOW.IS_REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return PhysicalFlow.PHYSICAL_FLOW.LAST_ATTESTED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return PhysicalFlow.PHYSICAL_FLOW.LAST_ATTESTED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return PhysicalFlow.PHYSICAL_FLOW.CRITICALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return PhysicalFlow.PHYSICAL_FLOW.EXTERNAL_ID;
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
        return getSpecificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getBasisOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTransport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getLogicalFlowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getSpecificationDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getIsRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getLastAttestedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getLastAttestedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCriticality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getExternalId();
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
        return getSpecificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBasisOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTransport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getLogicalFlowId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getSpecificationDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getIsRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getLastAttestedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLastAttestedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCriticality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getExternalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value2(Long value) {
        setSpecificationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value3(Integer value) {
        setBasisOffset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value4(String value) {
        setFrequency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value5(String value) {
        setTransport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value7(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value8(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value9(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value10(Long value) {
        setLogicalFlowId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value11(Long value) {
        setSpecificationDefinitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value12(Boolean value) {
        setIsRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value13(Timestamp value) {
        setLastAttestedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value14(String value) {
        setLastAttestedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value15(String value) {
        setCriticality(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord value16(String value) {
        setExternalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalFlowRecord values(Long value1, Long value2, Integer value3, String value4, String value5, String value6, String value7, Timestamp value8, String value9, Long value10, Long value11, Boolean value12, Timestamp value13, String value14, String value15, String value16) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhysicalFlowRecord
     */
    public PhysicalFlowRecord() {
        super(PhysicalFlow.PHYSICAL_FLOW);
    }

    /**
     * Create a detached, initialised PhysicalFlowRecord
     */
    public PhysicalFlowRecord(Long id, Long specificationId, Integer basisOffset, String frequency, String transport, String description, String provenance, Timestamp lastUpdatedAt, String lastUpdatedBy, Long logicalFlowId, Long specificationDefinitionId, Boolean isRemoved, Timestamp lastAttestedAt, String lastAttestedBy, String criticality, String externalId) {
        super(PhysicalFlow.PHYSICAL_FLOW);

        set(0, id);
        set(1, specificationId);
        set(2, basisOffset);
        set(3, frequency);
        set(4, transport);
        set(5, description);
        set(6, provenance);
        set(7, lastUpdatedAt);
        set(8, lastUpdatedBy);
        set(9, logicalFlowId);
        set(10, specificationDefinitionId);
        set(11, isRemoved);
        set(12, lastAttestedAt);
        set(13, lastAttestedBy);
        set(14, criticality);
        set(15, externalId);
    }
}