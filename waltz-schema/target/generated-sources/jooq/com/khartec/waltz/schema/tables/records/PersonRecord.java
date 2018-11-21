/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables.records;


import com.khartec.waltz.schema.tables.Person;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class PersonRecord extends UpdatableRecordImpl<PersonRecord> implements Record13<Long, String, String, String, String, String, String, String, String, String, String, Long, Boolean> {

    private static final long serialVersionUID = -584465455;

    /**
     * Setter for <code>person.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>person.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>person.employee_id</code>.
     */
    public void setEmployeeId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>person.employee_id</code>.
     */
    public String getEmployeeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>person.display_name</code>.
     */
    public void setDisplayName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>person.display_name</code>.
     */
    public String getDisplayName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>person.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>person.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>person.user_principal_name</code>.
     */
    public void setUserPrincipalName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>person.user_principal_name</code>.
     */
    public String getUserPrincipalName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>person.department_name</code>.
     */
    public void setDepartmentName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>person.department_name</code>.
     */
    public String getDepartmentName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>person.kind</code>.
     */
    public void setKind(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>person.kind</code>.
     */
    public String getKind() {
        return (String) get(6);
    }

    /**
     * Setter for <code>person.manager_employee_id</code>.
     */
    public void setManagerEmployeeId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>person.manager_employee_id</code>.
     */
    public String getManagerEmployeeId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>person.title</code>.
     */
    public void setTitle(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>person.title</code>.
     */
    public String getTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>person.office_phone</code>.
     */
    public void setOfficePhone(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>person.office_phone</code>.
     */
    public String getOfficePhone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>person.mobile_phone</code>.
     */
    public void setMobilePhone(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>person.mobile_phone</code>.
     */
    public String getMobilePhone() {
        return (String) get(10);
    }

    /**
     * Setter for <code>person.organisational_unit_id</code>.
     */
    public void setOrganisationalUnitId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>person.organisational_unit_id</code>.
     */
    public Long getOrganisationalUnitId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>person.is_removed</code>.
     */
    public void setIsRemoved(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>person.is_removed</code>.
     */
    public Boolean getIsRemoved() {
        return (Boolean) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, String, String, String, String, String, Long, Boolean> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, String, String, String, String, String, Long, Boolean> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Person.PERSON.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Person.PERSON.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Person.PERSON.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Person.PERSON.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Person.PERSON.USER_PRINCIPAL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Person.PERSON.DEPARTMENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Person.PERSON.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Person.PERSON.MANAGER_EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Person.PERSON.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Person.PERSON.OFFICE_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Person.PERSON.MOBILE_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return Person.PERSON.ORGANISATIONAL_UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Person.PERSON.IS_REMOVED;
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
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserPrincipalName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDepartmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getManagerEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOfficePhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getMobilePhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getOrganisationalUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
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
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserPrincipalName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDepartmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getManagerEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOfficePhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getMobilePhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getOrganisationalUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getIsRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value2(String value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value3(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value5(String value) {
        setUserPrincipalName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value6(String value) {
        setDepartmentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value7(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value8(String value) {
        setManagerEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value9(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value10(String value) {
        setOfficePhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value11(String value) {
        setMobilePhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value12(Long value) {
        setOrganisationalUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value13(Boolean value) {
        setIsRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Long value12, Boolean value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonRecord
     */
    public PersonRecord() {
        super(Person.PERSON);
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    public PersonRecord(Long id, String employeeId, String displayName, String email, String userPrincipalName, String departmentName, String kind, String managerEmployeeId, String title, String officePhone, String mobilePhone, Long organisationalUnitId, Boolean isRemoved) {
        super(Person.PERSON);

        set(0, id);
        set(1, employeeId);
        set(2, displayName);
        set(3, email);
        set(4, userPrincipalName);
        set(5, departmentName);
        set(6, kind);
        set(7, managerEmployeeId);
        set(8, title);
        set(9, officePhone);
        set(10, mobilePhone);
        set(11, organisationalUnitId);
        set(12, isRemoved);
    }
}