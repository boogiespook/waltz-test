/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.EntityHierarchy;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * Generic Hierarchy table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityHierarchyRecord extends TableRecordImpl<EntityHierarchyRecord> implements Record4<String, Long, Long, Integer> {

    private static final long serialVersionUID = 1778580231;

    /**
     * Setter for <code>entity_hierarchy.kind</code>. Entity kind
     */
    public void setKind(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>entity_hierarchy.kind</code>. Entity kind
     */
    public String getKind() {
        return (String) get(0);
    }

    /**
     * Setter for <code>entity_hierarchy.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>entity_hierarchy.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>entity_hierarchy.ancestor_id</code>.
     */
    public void setAncestorId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>entity_hierarchy.ancestor_id</code>.
     */
    public Long getAncestorId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>entity_hierarchy.level</code>.
     */
    public void setLevel(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>entity_hierarchy.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Long, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Long, Long, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EntityHierarchy.ENTITY_HIERARCHY.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EntityHierarchy.ENTITY_HIERARCHY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EntityHierarchy.ENTITY_HIERARCHY.ANCESTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return EntityHierarchy.ENTITY_HIERARCHY.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAncestorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAncestorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityHierarchyRecord value1(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityHierarchyRecord value2(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityHierarchyRecord value3(Long value) {
        setAncestorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityHierarchyRecord value4(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityHierarchyRecord values(String value1, Long value2, Long value3, Integer value4) {
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
     * Create a detached EntityHierarchyRecord
     */
    public EntityHierarchyRecord() {
        super(EntityHierarchy.ENTITY_HIERARCHY);
    }

    /**
     * Create a detached, initialised EntityHierarchyRecord
     */
    public EntityHierarchyRecord(String kind, Long id, Long ancestorId, Integer level) {
        super(EntityHierarchy.ENTITY_HIERARCHY);

        set(0, kind);
        set(1, id);
        set(2, ancestorId);
        set(3, level);
    }
}