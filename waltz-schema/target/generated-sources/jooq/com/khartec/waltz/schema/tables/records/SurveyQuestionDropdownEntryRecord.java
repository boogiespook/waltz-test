/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.SurveyQuestionDropdownEntry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Stores allowed dropdown values for a survey question
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SurveyQuestionDropdownEntryRecord extends UpdatableRecordImpl<SurveyQuestionDropdownEntryRecord> implements Record4<Long, Long, String, Integer> {

    private static final long serialVersionUID = -1673333523;

    /**
     * Setter for <code>survey_question_dropdown_entry.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>survey_question_dropdown_entry.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>survey_question_dropdown_entry.question_id</code>.
     */
    public void setQuestionId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>survey_question_dropdown_entry.question_id</code>.
     */
    public Long getQuestionId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>survey_question_dropdown_entry.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>survey_question_dropdown_entry.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>survey_question_dropdown_entry.position</code>.
     */
    public void setPosition(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>survey_question_dropdown_entry.position</code>.
     */
    public Integer getPosition() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SurveyQuestionDropdownEntry.SURVEY_QUESTION_DROPDOWN_ENTRY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SurveyQuestionDropdownEntry.SURVEY_QUESTION_DROPDOWN_ENTRY.QUESTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SurveyQuestionDropdownEntry.SURVEY_QUESTION_DROPDOWN_ENTRY.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SurveyQuestionDropdownEntry.SURVEY_QUESTION_DROPDOWN_ENTRY.POSITION;
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
        return getQuestionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPosition();
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
        return getQuestionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyQuestionDropdownEntryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyQuestionDropdownEntryRecord value2(Long value) {
        setQuestionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyQuestionDropdownEntryRecord value3(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyQuestionDropdownEntryRecord value4(Integer value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyQuestionDropdownEntryRecord values(Long value1, Long value2, String value3, Integer value4) {
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
     * Create a detached SurveyQuestionDropdownEntryRecord
     */
    public SurveyQuestionDropdownEntryRecord() {
        super(SurveyQuestionDropdownEntry.SURVEY_QUESTION_DROPDOWN_ENTRY);
    }

    /**
     * Create a detached, initialised SurveyQuestionDropdownEntryRecord
     */
    public SurveyQuestionDropdownEntryRecord(Long id, Long questionId, String value, Integer position) {
        super(SurveyQuestionDropdownEntry.SURVEY_QUESTION_DROPDOWN_ENTRY);

        set(0, id);
        set(1, questionId);
        set(2, value);
        set(3, position);
    }
}