/*
 * This file is generated by jOOQ.
*/
package com.khartec.waltz.schema.tables;


import com.khartec.waltz.schema.DefaultSchema;
import com.khartec.waltz.schema.Indexes;
import com.khartec.waltz.schema.Keys;
import com.khartec.waltz.schema.tables.records.FlowDiagramRecord;

import java.sql.Timestamp;
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
 * The flow diagram table represents the metadata and layout data associated 
 * with a flow diagram
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlowDiagram extends TableImpl<FlowDiagramRecord> {

    private static final long serialVersionUID = 237264417;

    /**
     * The reference instance of <code>flow_diagram</code>
     */
    public static final FlowDiagram FLOW_DIAGRAM = new FlowDiagram();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlowDiagramRecord> getRecordType() {
        return FlowDiagramRecord.class;
    }

    /**
     * The column <code>flow_diagram.id</code>.
     */
    public final TableField<FlowDiagramRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>flow_diagram.name</code>.
     */
    public final TableField<FlowDiagramRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>flow_diagram.description</code>.
     */
    public final TableField<FlowDiagramRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>flow_diagram.layout_data</code>.
     */
    public final TableField<FlowDiagramRecord, String> LAYOUT_DATA = createField("layout_data", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>flow_diagram.last_updated_at</code>.
     */
    public final TableField<FlowDiagramRecord, Timestamp> LAST_UPDATED_AT = createField("last_updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>flow_diagram.last_updated_by</code>.
     */
    public final TableField<FlowDiagramRecord, String> LAST_UPDATED_BY = createField("last_updated_by", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>flow_diagram.is_removed</code>.
     */
    public final TableField<FlowDiagramRecord, Boolean> IS_REMOVED = createField("is_removed", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>flow_diagram</code> table reference
     */
    public FlowDiagram() {
        this(DSL.name("flow_diagram"), null);
    }

    /**
     * Create an aliased <code>flow_diagram</code> table reference
     */
    public FlowDiagram(String alias) {
        this(DSL.name(alias), FLOW_DIAGRAM);
    }

    /**
     * Create an aliased <code>flow_diagram</code> table reference
     */
    public FlowDiagram(Name alias) {
        this(alias, FLOW_DIAGRAM);
    }

    private FlowDiagram(Name alias, Table<FlowDiagramRecord> aliased) {
        this(alias, aliased, null);
    }

    private FlowDiagram(Name alias, Table<FlowDiagramRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "The flow diagram table represents the metadata and layout data associated with a flow diagram");
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
        return Arrays.<Index>asList(Indexes.FLOW_DIAGRAM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FlowDiagramRecord, Long> getIdentity() {
        return Keys.IDENTITY_FLOW_DIAGRAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FlowDiagramRecord> getPrimaryKey() {
        return Keys.KEY_FLOW_DIAGRAM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FlowDiagramRecord>> getKeys() {
        return Arrays.<UniqueKey<FlowDiagramRecord>>asList(Keys.KEY_FLOW_DIAGRAM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowDiagram as(String alias) {
        return new FlowDiagram(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowDiagram as(Name alias) {
        return new FlowDiagram(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FlowDiagram rename(String name) {
        return new FlowDiagram(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FlowDiagram rename(Name name) {
        return new FlowDiagram(name, null);
    }
}