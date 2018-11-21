/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.PhysicalSpecDefnSampleFile;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Stores physical spec definition sample file data
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhysicalSpecDefnSampleFileRecord extends UpdatableRecordImpl<PhysicalSpecDefnSampleFileRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = 2086530647;

    /**
     * Setter for <code>physical_spec_defn_sample_file.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_spec_defn_sample_file.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_spec_defn_sample_file.spec_defn_id</code>.
     */
    public void setSpecDefnId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_spec_defn_sample_file.spec_defn_id</code>.
     */
    public Long getSpecDefnId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>physical_spec_defn_sample_file.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_spec_defn_sample_file.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>physical_spec_defn_sample_file.file_data</code>.
     */
    public void setFileData(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_spec_defn_sample_file.file_data</code>.
     */
    public String getFileData() {
        return (String) get(3);
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
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PhysicalSpecDefnSampleFile.PHYSICAL_SPEC_DEFN_SAMPLE_FILE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PhysicalSpecDefnSampleFile.PHYSICAL_SPEC_DEFN_SAMPLE_FILE.SPEC_DEFN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PhysicalSpecDefnSampleFile.PHYSICAL_SPEC_DEFN_SAMPLE_FILE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PhysicalSpecDefnSampleFile.PHYSICAL_SPEC_DEFN_SAMPLE_FILE.FILE_DATA;
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
        return getSpecDefnId();
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
    public String component4() {
        return getFileData();
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
        return getSpecDefnId();
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
    public String value4() {
        return getFileData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnSampleFileRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnSampleFileRecord value2(Long value) {
        setSpecDefnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnSampleFileRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnSampleFileRecord value4(String value) {
        setFileData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhysicalSpecDefnSampleFileRecord values(Long value1, Long value2, String value3, String value4) {
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
     * Create a detached PhysicalSpecDefnSampleFileRecord
     */
    public PhysicalSpecDefnSampleFileRecord() {
        super(PhysicalSpecDefnSampleFile.PHYSICAL_SPEC_DEFN_SAMPLE_FILE);
    }

    /**
     * Create a detached, initialised PhysicalSpecDefnSampleFileRecord
     */
    public PhysicalSpecDefnSampleFileRecord(Long id, Long specDefnId, String name, String fileData) {
        super(PhysicalSpecDefnSampleFile.PHYSICAL_SPEC_DEFN_SAMPLE_FILE);

        set(0, id);
        set(1, specDefnId);
        set(2, name);
        set(3, fileData);
    }
}
