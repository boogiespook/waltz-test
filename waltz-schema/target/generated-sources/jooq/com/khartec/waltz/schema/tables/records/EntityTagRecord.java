/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.EntityTag;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Allows for association of zero or more tags with entities
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityTagRecord extends UpdatableRecordImpl<EntityTagRecord> implements Record6<Long, String, String, Timestamp, String, String> {

    private static final long serialVersionUID = 2084864454;

    /**
     * Setter for <code>entity_tag.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>entity_tag.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>entity_tag.entity_kind</code>.
     */
    public void setEntityKind(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>entity_tag.entity_kind</code>.
     */
    public String getEntityKind() {
        return (String) get(1);
    }

    /**
     * Setter for <code>entity_tag.tag</code>.
     */
    public void setTag(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>entity_tag.tag</code>.
     */
    public String getTag() {
        return (String) get(2);
    }

    /**
     * Setter for <code>entity_tag.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>entity_tag.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>entity_tag.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>entity_tag.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>entity_tag.provenance</code>.
     */
    public void setProvenance(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>entity_tag.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Long, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, Timestamp, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, Timestamp, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EntityTag.ENTITY_TAG.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EntityTag.ENTITY_TAG.ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EntityTag.ENTITY_TAG.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return EntityTag.ENTITY_TAG.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EntityTag.ENTITY_TAG.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EntityTag.ENTITY_TAG.PROVENANCE;
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
    public String component3() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
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
    public String value3() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord value1(Long value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord value2(String value) {
        setEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord value3(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord value4(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord value5(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord value6(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTagRecord values(Long value1, String value2, String value3, Timestamp value4, String value5, String value6) {
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
     * Create a detached EntityTagRecord
     */
    public EntityTagRecord() {
        super(EntityTag.ENTITY_TAG);
    }

    /**
     * Create a detached, initialised EntityTagRecord
     */
    public EntityTagRecord(Long entityId, String entityKind, String tag, Timestamp lastUpdatedAt, String lastUpdatedBy, String provenance) {
        super(EntityTag.ENTITY_TAG);

        set(0, entityId);
        set(1, entityKind);
        set(2, tag);
        set(3, lastUpdatedAt);
        set(4, lastUpdatedBy);
        set(5, provenance);
    }
}
