package com.khartec.waltz.model.roadmap;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.NameProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RoadmapCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoadmapCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RoadmapCreateCommand"})
public final class ImmutableRoadmapCreateCommand extends RoadmapCreateCommand {
  private final long ratingSchemeId;
  private final EntityReference rowType;
  private final EntityReference columnType;
  private final EntityReference linkedEntity;
  private final String name;

  private ImmutableRoadmapCreateCommand(
      long ratingSchemeId,
      EntityReference rowType,
      EntityReference columnType,
      EntityReference linkedEntity,
      String name) {
    this.ratingSchemeId = ratingSchemeId;
    this.rowType = rowType;
    this.columnType = columnType;
    this.linkedEntity = linkedEntity;
    this.name = name;
  }

  /**
   * @return The value of the {@code ratingSchemeId} attribute
   */
  @JsonProperty("ratingSchemeId")
  @Override
  public long ratingSchemeId() {
    return ratingSchemeId;
  }

  /**
   * @return The value of the {@code rowType} attribute
   */
  @JsonProperty("rowType")
  @Override
  public EntityReference rowType() {
    return rowType;
  }

  /**
   * @return The value of the {@code columnType} attribute
   */
  @JsonProperty("columnType")
  @Override
  public EntityReference columnType() {
    return columnType;
  }

  /**
   * @return The value of the {@code linkedEntity} attribute
   */
  @JsonProperty("linkedEntity")
  @Override
  public EntityReference linkedEntity() {
    return linkedEntity;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapCreateCommand#ratingSchemeId() ratingSchemeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingSchemeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapCreateCommand withRatingSchemeId(long value) {
    if (this.ratingSchemeId == value) return this;
    return new ImmutableRoadmapCreateCommand(value, this.rowType, this.columnType, this.linkedEntity, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapCreateCommand#rowType() rowType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rowType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapCreateCommand withRowType(EntityReference value) {
    if (this.rowType == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "rowType");
    return new ImmutableRoadmapCreateCommand(this.ratingSchemeId, newValue, this.columnType, this.linkedEntity, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapCreateCommand#columnType() columnType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for columnType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapCreateCommand withColumnType(EntityReference value) {
    if (this.columnType == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "columnType");
    return new ImmutableRoadmapCreateCommand(this.ratingSchemeId, this.rowType, newValue, this.linkedEntity, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapCreateCommand#linkedEntity() linkedEntity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for linkedEntity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapCreateCommand withLinkedEntity(EntityReference value) {
    if (this.linkedEntity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "linkedEntity");
    return new ImmutableRoadmapCreateCommand(this.ratingSchemeId, this.rowType, this.columnType, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapCreateCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapCreateCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableRoadmapCreateCommand(this.ratingSchemeId, this.rowType, this.columnType, this.linkedEntity, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoadmapCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoadmapCreateCommand
        && equalTo((ImmutableRoadmapCreateCommand) another);
  }

  private boolean equalTo(ImmutableRoadmapCreateCommand another) {
    return ratingSchemeId == another.ratingSchemeId
        && rowType.equals(another.rowType)
        && columnType.equals(another.columnType)
        && linkedEntity.equals(another.linkedEntity)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code ratingSchemeId}, {@code rowType}, {@code columnType}, {@code linkedEntity}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(ratingSchemeId);
    h += (h << 5) + rowType.hashCode();
    h += (h << 5) + columnType.hashCode();
    h += (h << 5) + linkedEntity.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoadmapCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RoadmapCreateCommand{"
        + "ratingSchemeId=" + ratingSchemeId
        + ", rowType=" + rowType
        + ", columnType=" + columnType
        + ", linkedEntity=" + linkedEntity
        + ", name=" + name
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RoadmapCreateCommand {
    long ratingSchemeId;
    boolean ratingSchemeIdIsSet;
    EntityReference rowType;
    EntityReference columnType;
    EntityReference linkedEntity;
    String name;
    @JsonProperty("ratingSchemeId")
    public void setRatingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      this.ratingSchemeIdIsSet = true;
    }
    @JsonProperty("rowType")
    public void setRowType(EntityReference rowType) {
      this.rowType = rowType;
    }
    @JsonProperty("columnType")
    public void setColumnType(EntityReference columnType) {
      this.columnType = columnType;
    }
    @JsonProperty("linkedEntity")
    public void setLinkedEntity(EntityReference linkedEntity) {
      this.linkedEntity = linkedEntity;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public long ratingSchemeId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference rowType() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference columnType() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference linkedEntity() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRoadmapCreateCommand fromJson(Json json) {
    ImmutableRoadmapCreateCommand.Builder builder = ImmutableRoadmapCreateCommand.builder();
    if (json.ratingSchemeIdIsSet) {
      builder.ratingSchemeId(json.ratingSchemeId);
    }
    if (json.rowType != null) {
      builder.rowType(json.rowType);
    }
    if (json.columnType != null) {
      builder.columnType(json.columnType);
    }
    if (json.linkedEntity != null) {
      builder.linkedEntity(json.linkedEntity);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoadmapCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoadmapCreateCommand instance
   */
  public static ImmutableRoadmapCreateCommand copyOf(RoadmapCreateCommand instance) {
    if (instance instanceof ImmutableRoadmapCreateCommand) {
      return (ImmutableRoadmapCreateCommand) instance;
    }
    return ImmutableRoadmapCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoadmapCreateCommand ImmutableRoadmapCreateCommand}.
   * @return A new ImmutableRoadmapCreateCommand builder
   */
  public static ImmutableRoadmapCreateCommand.Builder builder() {
    return new ImmutableRoadmapCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoadmapCreateCommand ImmutableRoadmapCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING_SCHEME_ID = 0x1L;
    private static final long INIT_BIT_ROW_TYPE = 0x2L;
    private static final long INIT_BIT_COLUMN_TYPE = 0x4L;
    private static final long INIT_BIT_LINKED_ENTITY = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private long initBits = 0x1fL;

    private long ratingSchemeId;
    private EntityReference rowType;
    private EntityReference columnType;
    private EntityReference linkedEntity;
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.roadmap.RoadmapCreateCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RoadmapCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.NameProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NameProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof RoadmapCreateCommand) {
        RoadmapCreateCommand instance = (RoadmapCreateCommand) object;
        rowType(instance.rowType());
        columnType(instance.columnType());
        ratingSchemeId(instance.ratingSchemeId());
        linkedEntity(instance.linkedEntity());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link RoadmapCreateCommand#ratingSchemeId() ratingSchemeId} attribute.
     * @param ratingSchemeId The value for ratingSchemeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratingSchemeId")
    public final Builder ratingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      initBits &= ~INIT_BIT_RATING_SCHEME_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link RoadmapCreateCommand#rowType() rowType} attribute.
     * @param rowType The value for rowType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rowType")
    public final Builder rowType(EntityReference rowType) {
      this.rowType = Objects.requireNonNull(rowType, "rowType");
      initBits &= ~INIT_BIT_ROW_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link RoadmapCreateCommand#columnType() columnType} attribute.
     * @param columnType The value for columnType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("columnType")
    public final Builder columnType(EntityReference columnType) {
      this.columnType = Objects.requireNonNull(columnType, "columnType");
      initBits &= ~INIT_BIT_COLUMN_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link RoadmapCreateCommand#linkedEntity() linkedEntity} attribute.
     * @param linkedEntity The value for linkedEntity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkedEntity")
    public final Builder linkedEntity(EntityReference linkedEntity) {
      this.linkedEntity = Objects.requireNonNull(linkedEntity, "linkedEntity");
      initBits &= ~INIT_BIT_LINKED_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link RoadmapCreateCommand#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoadmapCreateCommand ImmutableRoadmapCreateCommand}.
     * @return An immutable instance of RoadmapCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoadmapCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoadmapCreateCommand(ratingSchemeId, rowType, columnType, linkedEntity, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING_SCHEME_ID) != 0) attributes.add("ratingSchemeId");
      if ((initBits & INIT_BIT_ROW_TYPE) != 0) attributes.add("rowType");
      if ((initBits & INIT_BIT_COLUMN_TYPE) != 0) attributes.add("columnType");
      if ((initBits & INIT_BIT_LINKED_ENTITY) != 0) attributes.add("linkedEntity");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build RoadmapCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
