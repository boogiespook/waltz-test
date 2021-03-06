/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.ApplicationGroupEntry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class ApplicationGroupEntryRecord extends UpdatableRecordImpl<ApplicationGroupEntryRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -425835199;

    /**
     * Setter for <code>application_group_entry.group_id</code>.
     */
    public void setGroupId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>application_group_entry.group_id</code>.
     */
    public Long getGroupId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>application_group_entry.application_id</code>.
     */
    public void setApplicationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>application_group_entry.application_id</code>.
     */
    public Long getApplicationId() {
        return (Long) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ApplicationGroupEntry.APPLICATION_GROUP_ENTRY.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ApplicationGroupEntry.APPLICATION_GROUP_ENTRY.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupEntryRecord value1(Long value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupEntryRecord value2(Long value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupEntryRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationGroupEntryRecord
     */
    public ApplicationGroupEntryRecord() {
        super(ApplicationGroupEntry.APPLICATION_GROUP_ENTRY);
    }

    /**
     * Create a detached, initialised ApplicationGroupEntryRecord
     */
    public ApplicationGroupEntryRecord(Long groupId, Long applicationId) {
        super(ApplicationGroupEntry.APPLICATION_GROUP_ENTRY);

        set(0, groupId);
        set(1, applicationId);
    }
}
