/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.Process;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class ProcessRecord extends TableRecordImpl<ProcessRecord> implements Record8<Long, Long, String, Long, Long, Long, String, Integer> {

    private static final long serialVersionUID = 2138229368;

    /**
     * Setter for <code>process.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>process.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>process.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>process.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>process.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>process.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>process.level_1</code>.
     */
    public void setLevel_1(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>process.level_1</code>.
     */
    public Long getLevel_1() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>process.level_2</code>.
     */
    public void setLevel_2(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>process.level_2</code>.
     */
    public Long getLevel_2() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>process.level_3</code>.
     */
    public void setLevel_3(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>process.level_3</code>.
     */
    public Long getLevel_3() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>process.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>process.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>process.level</code>.
     */
    public void setLevel(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>process.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, Long, Long, Long, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, Long, Long, Long, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Process.PROCESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Process.PROCESS.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Process.PROCESS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Process.PROCESS.LEVEL_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Process.PROCESS.LEVEL_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Process.PROCESS.LEVEL_3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Process.PROCESS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Process.PROCESS.LEVEL;
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getLevel_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getLevel_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getLevel_3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getLevel();
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLevel_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getLevel_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getLevel_3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value2(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value4(Long value) {
        setLevel_1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value5(Long value) {
        setLevel_2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value6(Long value) {
        setLevel_3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord value8(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessRecord values(Long value1, Long value2, String value3, Long value4, Long value5, Long value6, String value7, Integer value8) {
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
     * Create a detached ProcessRecord
     */
    public ProcessRecord() {
        super(Process.PROCESS);
    }

    /**
     * Create a detached, initialised ProcessRecord
     */
    public ProcessRecord(Long id, Long parentId, String name, Long level_1, Long level_2, Long level_3, String description, Integer level) {
        super(Process.PROCESS);

        set(0, id);
        set(1, parentId);
        set(2, name);
        set(3, level_1);
        set(4, level_2);
        set(5, level_3);
        set(6, description);
        set(7, level);
    }
}
