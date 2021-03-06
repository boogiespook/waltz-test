/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.UserRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class UserRoleRecord extends TableRecordImpl<UserRoleRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1274541978;

    /**
     * Setter for <code>user_role.user_name</code>.
     */
    public void setUserName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_role.user_name</code>.
     */
    public String getUserName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>user_role.role</code>.
     */
    public void setRole(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_role.role</code>.
     */
    public String getRole() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserRole.USER_ROLE.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserRole.USER_ROLE.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord value1(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord value2(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRoleRecord
     */
    public UserRoleRecord() {
        super(UserRole.USER_ROLE);
    }

    /**
     * Create a detached, initialised UserRoleRecord
     */
    public UserRoleRecord(String userName, String role) {
        super(UserRole.USER_ROLE);

        set(0, userName);
        set(1, role);
    }
}
