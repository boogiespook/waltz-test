/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.Application;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class ApplicationRecord extends UpdatableRecordImpl<ApplicationRecord> implements Record17<Long, String, String, String, Timestamp, Timestamp, Long, String, String, String, String, String, String, Boolean, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1441174053;

    /**
     * Setter for <code>application.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>application.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>application.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>application.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>application.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>application.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>application.asset_code</code>.
     */
    public void setAssetCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>application.asset_code</code>.
     */
    public String getAssetCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>application.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>application.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>application.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>application.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>application.organisational_unit_id</code>.
     */
    public void setOrganisationalUnitId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>application.organisational_unit_id</code>.
     */
    public Long getOrganisationalUnitId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>application.kind</code>.
     */
    public void setKind(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>application.kind</code>.
     */
    public String getKind() {
        return (String) get(7);
    }

    /**
     * Setter for <code>application.lifecycle_phase</code>.
     */
    public void setLifecyclePhase(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>application.lifecycle_phase</code>.
     */
    public String getLifecyclePhase() {
        return (String) get(8);
    }

    /**
     * Setter for <code>application.parent_asset_code</code>.
     */
    public void setParentAssetCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>application.parent_asset_code</code>.
     */
    public String getParentAssetCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>application.overall_rating</code>.
     */
    public void setOverallRating(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>application.overall_rating</code>.
     */
    public String getOverallRating() {
        return (String) get(10);
    }

    /**
     * Setter for <code>application.provenance</code>.
     */
    public void setProvenance(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>application.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(11);
    }

    /**
     * Setter for <code>application.business_criticality</code>.
     */
    public void setBusinessCriticality(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>application.business_criticality</code>.
     */
    public String getBusinessCriticality() {
        return (String) get(12);
    }

    /**
     * Setter for <code>application.is_removed</code>.
     */
    public void setIsRemoved(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>application.is_removed</code>.
     */
    public Boolean getIsRemoved() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>application.entity_lifecycle_status</code>.
     */
    public void setEntityLifecycleStatus(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>application.entity_lifecycle_status</code>.
     */
    public String getEntityLifecycleStatus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>application.planned_retirement_date</code>.
     */
    public void setPlannedRetirementDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>application.planned_retirement_date</code>.
     */
    public Timestamp getPlannedRetirementDate() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>application.actual_retirement_date</code>.
     */
    public void setActualRetirementDate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>application.actual_retirement_date</code>.
     */
    public Timestamp getActualRetirementDate() {
        return (Timestamp) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, String, String, Timestamp, Timestamp, Long, String, String, String, String, String, String, Boolean, String, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, String, String, Timestamp, Timestamp, Long, String, String, String, String, String, String, Boolean, String, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Application.APPLICATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Application.APPLICATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Application.APPLICATION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Application.APPLICATION.ASSET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Application.APPLICATION.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Application.APPLICATION.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Application.APPLICATION.ORGANISATIONAL_UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Application.APPLICATION.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Application.APPLICATION.LIFECYCLE_PHASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Application.APPLICATION.PARENT_ASSET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Application.APPLICATION.OVERALL_RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Application.APPLICATION.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Application.APPLICATION.BUSINESS_CRITICALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Application.APPLICATION.IS_REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Application.APPLICATION.ENTITY_LIFECYCLE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return Application.APPLICATION.PLANNED_RETIREMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Application.APPLICATION.ACTUAL_RETIREMENT_DATE;
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
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAssetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getOrganisationalUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLifecyclePhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getParentAssetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getOverallRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getBusinessCriticality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getIsRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getEntityLifecycleStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getPlannedRetirementDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getActualRetirementDate();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAssetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getOrganisationalUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLifecyclePhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getParentAssetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getOverallRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBusinessCriticality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getIsRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getEntityLifecycleStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getPlannedRetirementDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getActualRetirementDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value4(String value) {
        setAssetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value7(Long value) {
        setOrganisationalUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value8(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value9(String value) {
        setLifecyclePhase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value10(String value) {
        setParentAssetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value11(String value) {
        setOverallRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value12(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value13(String value) {
        setBusinessCriticality(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value14(Boolean value) {
        setIsRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value15(String value) {
        setEntityLifecycleStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value16(Timestamp value) {
        setPlannedRetirementDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value17(Timestamp value) {
        setActualRetirementDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, Long value7, String value8, String value9, String value10, String value11, String value12, String value13, Boolean value14, String value15, Timestamp value16, Timestamp value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationRecord
     */
    public ApplicationRecord() {
        super(Application.APPLICATION);
    }

    /**
     * Create a detached, initialised ApplicationRecord
     */
    public ApplicationRecord(Long id, String name, String description, String assetCode, Timestamp createdAt, Timestamp updatedAt, Long organisationalUnitId, String kind, String lifecyclePhase, String parentAssetCode, String overallRating, String provenance, String businessCriticality, Boolean isRemoved, String entityLifecycleStatus, Timestamp plannedRetirementDate, Timestamp actualRetirementDate) {
        super(Application.APPLICATION);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, assetCode);
        set(4, createdAt);
        set(5, updatedAt);
        set(6, organisationalUnitId);
        set(7, kind);
        set(8, lifecyclePhase);
        set(9, parentAssetCode);
        set(10, overallRating);
        set(11, provenance);
        set(12, businessCriticality);
        set(13, isRemoved);
        set(14, entityLifecycleStatus);
        set(15, plannedRetirementDate);
        set(16, actualRetirementDate);
    }
}
