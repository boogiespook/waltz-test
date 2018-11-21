/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.DataType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class DataTypeRecord extends UpdatableRecordImpl<DataTypeRecord> implements Record7<String, String, String, Long, Long, Boolean, Boolean> {

    private static final long serialVersionUID = -488138447;

    /**
     * Setter for <code>data_type.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>data_type.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>data_type.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data_type.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data_type.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>data_type.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>data_type.id</code>.
     */
    public void setId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>data_type.id</code>.
     */
    public Long getId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>data_type.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>data_type.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>data_type.concrete</code>.
     */
    public void setConcrete(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>data_type.concrete</code>.
     */
    public Boolean getConcrete() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>data_type.unknown</code>.
     */
    public void setUnknown(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>data_type.unknown</code>.
     */
    public Boolean getUnknown() {
        return (Boolean) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Long, Long, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Long, Long, Boolean, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DataType.DATA_TYPE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DataType.DATA_TYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DataType.DATA_TYPE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return DataType.DATA_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return DataType.DATA_TYPE.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return DataType.DATA_TYPE.CONCRETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return DataType.DATA_TYPE.UNKNOWN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCode();
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
    public Long component4() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getConcrete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getUnknown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCode();
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
    public Long value4() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getConcrete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getUnknown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value1(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value4(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value5(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value6(Boolean value) {
        setConcrete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord value7(Boolean value) {
        setUnknown(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataTypeRecord values(String value1, String value2, String value3, Long value4, Long value5, Boolean value6, Boolean value7) {
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
     * Create a detached DataTypeRecord
     */
    public DataTypeRecord() {
        super(DataType.DATA_TYPE);
    }

    /**
     * Create a detached, initialised DataTypeRecord
     */
    public DataTypeRecord(String code, String name, String description, Long id, Long parentId, Boolean concrete, Boolean unknown) {
        super(DataType.DATA_TYPE);

        set(0, code);
        set(1, name);
        set(2, description);
        set(3, id);
        set(4, parentId);
        set(5, concrete);
        set(6, unknown);
    }
}