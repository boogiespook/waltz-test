/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.ApplicationGroupMemberRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ApplicationGroupMember extends TableImpl<ApplicationGroupMemberRecord> {

    private static final long serialVersionUID = 996954940;

    /**
     * The reference instance of <code>application_group_member</code>
     */
    public static final ApplicationGroupMember APPLICATION_GROUP_MEMBER = new ApplicationGroupMember();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationGroupMemberRecord> getRecordType() {
        return ApplicationGroupMemberRecord.class;
    }

    /**
     * The column <code>application_group_member.group_id</code>.
     */
    public final TableField<ApplicationGroupMemberRecord, Long> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>application_group_member.user_id</code>.
     */
    public final TableField<ApplicationGroupMemberRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>application_group_member.role</code>.
     */
    public final TableField<ApplicationGroupMemberRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'VIEWER'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>application_group_member</code> table reference
     */
    public ApplicationGroupMember() {
        this(DSL.name("application_group_member"), null);
    }

    /**
     * Create an aliased <code>application_group_member</code> table reference
     */
    public ApplicationGroupMember(String alias) {
        this(DSL.name(alias), APPLICATION_GROUP_MEMBER);
    }

    /**
     * Create an aliased <code>application_group_member</code> table reference
     */
    public ApplicationGroupMember(Name alias) {
        this(alias, APPLICATION_GROUP_MEMBER);
    }

    private ApplicationGroupMember(Name alias, Table<ApplicationGroupMemberRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicationGroupMember(Name alias, Table<ApplicationGroupMemberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.APPLICATION_GROUP_MEMBER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationGroupMemberRecord> getPrimaryKey() {
        return Keys.KEY_APPLICATION_GROUP_MEMBER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationGroupMemberRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationGroupMemberRecord>>asList(Keys.KEY_APPLICATION_GROUP_MEMBER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApplicationGroupMemberRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApplicationGroupMemberRecord, ?>>asList(Keys.APPLICATION_GROUP_MEMBER_GROUP_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupMember as(String alias) {
        return new ApplicationGroupMember(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGroupMember as(Name alias) {
        return new ApplicationGroupMember(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicationGroupMember rename(String name) {
        return new ApplicationGroupMember(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicationGroupMember rename(Name name) {
        return new ApplicationGroupMember(name, null);
    }
}
