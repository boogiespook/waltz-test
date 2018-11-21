/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.ApplicationGroup;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ApplicationGroupRecord extends UpdatableRecordImpl<ApplicationGroupRecord> implements Record6<Long, String, String, String, String, Boolean> {

    private static final long serialVersionUID = -1544309096;

    /**
     * Setter for <code>application_group.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>application_group.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>application_group.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>application_group.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>application_group.kind</code>.
     */
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>application_group.kind</code>.
     */
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>application_group.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>application_group.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>application_group.external_id</code>.
     */
    public void setExternalId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>application_group.external_id</code>.
     */
    public String getExternalId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>application_group.is_removed</code>.
     */
    public void setIsRemoved(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>application_group.is_removed</code>.
     */
    public Boolean getIsRemoved() {
        return (Boolean) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ApplicationGroup.APPLICATION_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ApplicationGroup.APPLICATION_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ApplicationGroup.APPLICATION_GROUP.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ApplicationGroup.APPLICATION_GROUP.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ApplicationGroup.APPLICATION_GROUP.EXTERNAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return ApplicationGroup.APPLICATION_GROUP.IS_REMOVED;
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
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getExternalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIsRemoved();
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
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getExternalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord value5(String value) {
        setExternalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord value6(Boolean value) {
        setIsRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupRecord values(Long value1, String value2, String value3, String value4, String value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationGroupRecord
     */
    public ApplicationGroupRecord() {
        super(ApplicationGroup.APPLICATION_GROUP);
    }

    /**
     * Create a detached, initialised ApplicationGroupRecord
     */
    public ApplicationGroupRecord(Long id, String name, String kind, String description, String externalId, Boolean isRemoved) {
        super(ApplicationGroup.APPLICATION_GROUP);

        set(0, id);
        set(1, name);
        set(2, kind);
        set(3, description);
        set(4, externalId);
        set(5, isRemoved);
    }
}