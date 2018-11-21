/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.ServerInformationRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class ServerInformation extends TableImpl<ServerInformationRecord> {

    private static final long serialVersionUID = 180594178;

    /**
     * The reference instance of <code>server_information</code>
     */
    public static final ServerInformation SERVER_INFORMATION = new ServerInformation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServerInformationRecord> getRecordType() {
        return ServerInformationRecord.class;
    }

    /**
     * The column <code>server_information.id</code>.
     */
    public final TableField<ServerInformationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>server_information.hostname</code>.
     */
    public final TableField<ServerInformationRecord, String> HOSTNAME = createField("hostname", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>server_information.operating_system</code>.
     */
    public final TableField<ServerInformationRecord, String> OPERATING_SYSTEM = createField("operating_system", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>server_information.environment</code>.
     */
    public final TableField<ServerInformationRecord, String> ENVIRONMENT = createField("environment", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("'DEV'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>server_information.location</code>.
     */
    public final TableField<ServerInformationRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>server_information.asset_code</code>.
     */
    public final TableField<ServerInformationRecord, String> ASSET_CODE = createField("asset_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>server_information.operating_system_version</code>.
     */
    public final TableField<ServerInformationRecord, String> OPERATING_SYSTEM_VERSION = createField("operating_system_version", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>server_information.country</code>.
     */
    public final TableField<ServerInformationRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>server_information.is_virtual</code>.
     */
    public final TableField<ServerInformationRecord, Boolean> IS_VIRTUAL = createField("is_virtual", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>server_information.provenance</code>.
     */
    public final TableField<ServerInformationRecord, String> PROVENANCE = createField("provenance", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'waltz'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>server_information.os_end_of_life_date</code>.
     */
    public final TableField<ServerInformationRecord, Date> OS_END_OF_LIFE_DATE = createField("os_end_of_life_date", org.jooq.impl.SQLDataType.DATE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * The column <code>server_information.hw_end_of_life_date</code>.
     */
    public final TableField<ServerInformationRecord, Date> HW_END_OF_LIFE_DATE = createField("hw_end_of_life_date", org.jooq.impl.SQLDataType.DATE.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * The column <code>server_information.lifecycle_status</code>.
     */
    public final TableField<ServerInformationRecord, String> LIFECYCLE_STATUS = createField("lifecycle_status", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.field("'UNKNOWN'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>server_information</code> table reference
     */
    public ServerInformation() {
        this(DSL.name("server_information"), null);
    }

    /**
     * Create an aliased <code>server_information</code> table reference
     */
    public ServerInformation(String alias) {
        this(DSL.name(alias), SERVER_INFORMATION);
    }

    /**
     * Create an aliased <code>server_information</code> table reference
     */
    public ServerInformation(Name alias) {
        this(alias, SERVER_INFORMATION);
    }

    private ServerInformation(Name alias, Table<ServerInformationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServerInformation(Name alias, Table<ServerInformationRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SERVER_INFORMATION_IDX_ASSET_CODE, Indexes.SERVER_INFORMATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ServerInformationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SERVER_INFORMATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServerInformationRecord> getPrimaryKey() {
        return Keys.KEY_SERVER_INFORMATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServerInformationRecord>> getKeys() {
        return Arrays.<UniqueKey<ServerInformationRecord>>asList(Keys.KEY_SERVER_INFORMATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerInformation as(String alias) {
        return new ServerInformation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerInformation as(Name alias) {
        return new ServerInformation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServerInformation rename(String name) {
        return new ServerInformation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServerInformation rename(Name name) {
        return new ServerInformation(name, null);
    }
}
