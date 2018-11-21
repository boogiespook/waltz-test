/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.EntityEnumValue;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * Store entity enum values
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityEnumValueRecord extends TableRecordImpl<EntityEnumValueRecord> implements Record7<Long, String, Long, String, Timestamp, String, String> {

    private static final long serialVersionUID = -633429688;

    /**
     * Setter for <code>entity_enum_value.definition_id</code>.
     */
    public void setDefinitionId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>entity_enum_value.definition_id</code>.
     */
    public Long getDefinitionId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>entity_enum_value.entity_kind</code>.
     */
    public void setEntityKind(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>entity_enum_value.entity_kind</code>.
     */
    public String getEntityKind() {
        return (String) get(1);
    }

    /**
     * Setter for <code>entity_enum_value.entity_id</code>.
     */
    public void setEntityId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>entity_enum_value.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>entity_enum_value.enum_value_key</code>.
     */
    public void setEnumValueKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>entity_enum_value.enum_value_key</code>.
     */
    public String getEnumValueKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>entity_enum_value.last_updated_at</code>.
     */
    public void setLastUpdatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>entity_enum_value.last_updated_at</code>.
     */
    public Timestamp getLastUpdatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>entity_enum_value.last_updated_by</code>.
     */
    public void setLastUpdatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>entity_enum_value.last_updated_by</code>.
     */
    public String getLastUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>entity_enum_value.provenance</code>.
     */
    public void setProvenance(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>entity_enum_value.provenance</code>.
     */
    public String getProvenance() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Long, String, Timestamp, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Long, String, Timestamp, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.DEFINITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.ENTITY_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.ENUM_VALUE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.LAST_UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.LAST_UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EntityEnumValue.ENTITY_ENUM_VALUE.PROVENANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDefinitionId();
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
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEnumValueKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDefinitionId();
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
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEnumValueKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLastUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLastUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProvenance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value1(Long value) {
        setDefinitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value2(String value) {
        setEntityKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value3(Long value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value4(String value) {
        setEnumValueKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value5(Timestamp value) {
        setLastUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value6(String value) {
        setLastUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord value7(String value) {
        setProvenance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityEnumValueRecord values(Long value1, String value2, Long value3, String value4, Timestamp value5, String value6, String value7) {
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
     * Create a detached EntityEnumValueRecord
     */
    public EntityEnumValueRecord() {
        super(EntityEnumValue.ENTITY_ENUM_VALUE);
    }

    /**
     * Create a detached, initialised EntityEnumValueRecord
     */
    public EntityEnumValueRecord(Long definitionId, String entityKind, Long entityId, String enumValueKey, Timestamp lastUpdatedAt, String lastUpdatedBy, String provenance) {
        super(EntityEnumValue.ENTITY_ENUM_VALUE);

        set(0, definitionId);
        set(1, entityKind);
        set(2, entityId);
        set(3, enumValueKey);
        set(4, lastUpdatedAt);
        set(5, lastUpdatedBy);
        set(6, provenance);
    }
}
