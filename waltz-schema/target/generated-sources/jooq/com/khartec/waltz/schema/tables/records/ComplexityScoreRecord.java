/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.ComplexityScore;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ComplexityScoreRecord extends UpdatableRecordImpl<ComplexityScoreRecord> implements Record4<String, Long, String, BigDecimal> {

    private static final long serialVersionUID = 2060411696;

    /**
     * Setter for <code>complexity_score.entity_kind</code>.
     */
    public void setEntityKind(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>complexity_score.entity_kind</code>.
     */
    public String getEntityKind() {
        return (String) get(0);
    }

    /**
     * Setter for <code>complexity_score.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>complexity_score.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>complexity_score.complexity_kind</code>.
     */
    public void setComplexityKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>complexity_score.complexity_kind</code>.
     */
    public String getComplexityKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>complexity_score.score</code>.
     */
    public void setScore(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>complexity_score.score</code>.
     */
    public BigDecimal getScore() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<String, Long, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Long, String, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Long, String, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ComplexityScore.COMPLEXITY_SCORE.ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ComplexityScore.COMPLEXITY_SCORE.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ComplexityScore.COMPLEXITY_SCORE.COMPLEXITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ComplexityScore.COMPLEXITY_SCORE.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEntityKind();
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
        return getComplexityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEntityKind();
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
        return getComplexityKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComplexityScoreRecord value1(String value) {
        setEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComplexityScoreRecord value2(Long value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComplexityScoreRecord value3(String value) {
        setComplexityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComplexityScoreRecord value4(BigDecimal value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ComplexityScoreRecord values(String value1, Long value2, String value3, BigDecimal value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ComplexityScoreRecord
     */
    public ComplexityScoreRecord() {
        super(ComplexityScore.COMPLEXITY_SCORE);
    }

    /**
     * Create a detached, initialised ComplexityScoreRecord
     */
    public ComplexityScoreRecord(String entityKind, Long entityId, String complexityKind, BigDecimal score) {
        super(ComplexityScore.COMPLEXITY_SCORE);

        set(0, entityKind);
        set(1, entityId);
        set(2, complexityKind);
        set(3, score);
    }
}