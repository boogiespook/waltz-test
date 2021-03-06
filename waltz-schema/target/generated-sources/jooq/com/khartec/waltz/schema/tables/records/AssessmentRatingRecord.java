/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.AssessmentRating;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Add assessment rating table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AssessmentRatingRecord extends UpdatableRecordImpl<AssessmentRatingRecord> implements Record8<Long, String, Long, Long, String, Timestamp, String, String> {

    private static final long serialVersionUID = 1773099341;

    /**
     * Setter for <code>assessment_rating.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>assessment_rating.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>assessment_rating.entity_kind</code>.
     */
    public void setEntityKind(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>assessment_rating.entity_kind</code>.
     */
    public String getEntityKind() {
        return (String) get(1);
    }

    /**
     * Setter for <code>assessment_rating.assessment_definition_id</code>.
     */
    public void setAssessmentDefinitionId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>assessment_rating.assessment_definition_id</code>.
     */
    public Long getAssessmentDefinitionId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>assessment_rating.rating_id</code>.
     */
    public void setRatingId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>assessment_rating.rating_id</code>.
     */
    public Long getRatingId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>assessment_rating.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>assessment_rating.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>assessment_rating.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>assessment_rating.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>assessment_rating.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>assessment_rating.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>assessment_rating.provenance</code>.
     */
    public void setProvenance(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>assessment_rating.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, String, Timestamp, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, String, Timestamp, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AssessmentRating.ASSESSMENT_RATING.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AssessmentRating.ASSESSMENT_RATING.ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return AssessmentRating.ASSESSMENT_RATING.ASSESSMENT_DEFINITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return AssessmentRating.ASSESSMENT_RATING.RATING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AssessmentRating.ASSESSMENT_RATING.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return AssessmentRating.ASSESSMENT_RATING.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AssessmentRating.ASSESSMENT_RATING.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AssessmentRating.ASSESSMENT_RATING.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEntityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAssessmentDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRatingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
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
    public String component8() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEntityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAssessmentDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRatingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
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
    public String value8() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value1(Long value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value2(String value) {
        setEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value3(Long value) {
        setAssessmentDefinitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value4(Long value) {
        setRatingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value6(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value7(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord value8(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessmentRatingRecord values(Long value1, String value2, Long value3, Long value4, String value5, Timestamp value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssessmentRatingRecord
     */
    public AssessmentRatingRecord() {
        super(AssessmentRating.ASSESSMENT_RATING);
    }

    /**
     * Create a detached, initialised AssessmentRatingRecord
     */
    public AssessmentRatingRecord(Long entityId, String entityKind, Long assessmentDefinitionId, Long ratingId, String description, Timestamp lastUpdatedAt, String lastUpdatedBy, String provenance) {
        super(AssessmentRating.ASSESSMENT_RATING);

        set(0, entityId);
        set(1, entityKind);
        set(2, assessmentDefinitionId);
        set(3, ratingId);
        set(4, description);
        set(5, lastUpdatedAt);
        set(6, lastUpdatedBy);
        set(7, provenance);
    }
}
