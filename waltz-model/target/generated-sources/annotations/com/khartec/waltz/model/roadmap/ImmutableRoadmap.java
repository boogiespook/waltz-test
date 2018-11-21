package com.khartec.waltz.model.roadmap;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Roadmap}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoadmap.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Roadmap"})
public final class ImmutableRoadmap extends Roadmap {
  private final long ratingSchemeId;
  private final EntityReference rowType;
  private final EntityReference columnType;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final EntityLifecycleStatus entityLifecycleStatus;

  private ImmutableRoadmap(ImmutableRoadmap.Builder builder) {
    this.ratingSchemeId = builder.ratingSchemeId;
    this.rowType = builder.rowType;
    this.columnType = builder.columnType;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    if (builder.entityLifecycleStatus != null) {
      initShim.entityLifecycleStatus(builder.entityLifecycleStatus);
    }
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.entityLifecycleStatus = initShim.entityLifecycleStatus();
    this.initShim = null;
  }

  private ImmutableRoadmap(
      long ratingSchemeId,
      EntityReference rowType,
      EntityReference columnType,
      Long id,
      String name,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      EntityLifecycleStatus entityLifecycleStatus) {
    this.ratingSchemeId = ratingSchemeId;
    this.rowType = rowType;
    this.columnType = columnType;
    this.id = id;
    this.name = name;
    this.description = description;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.entityLifecycleStatus = entityLifecycleStatus;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableRoadmap.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }
    private EntityLifecycleStatus entityLifecycleStatus;
    private int entityLifecycleStatusBuildStage;

    EntityLifecycleStatus entityLifecycleStatus() {
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (entityLifecycleStatusBuildStage == STAGE_UNINITIALIZED) {
        entityLifecycleStatusBuildStage = STAGE_INITIALIZING;
        this.entityLifecycleStatus = Objects.requireNonNull(ImmutableRoadmap.super.entityLifecycleStatus(), "entityLifecycleStatus");
        entityLifecycleStatusBuildStage = STAGE_INITIALIZED;
      }
      return this.entityLifecycleStatus;
    }

    void entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
      entityLifecycleStatusBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) attributes.add("entityLifecycleStatus");
      return "Cannot build Roadmap, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * @return The value of the {@code lastUpdatedAt} attribute
   */
  @JsonProperty("lastUpdatedAt")
  @Override
  public LocalDateTime lastUpdatedAt() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.lastUpdatedAt()
        : this.lastUpdatedAt;
  }

  /**
   * @return The value of the {@code lastUpdatedBy} attribute
   */
  @JsonProperty("lastUpdatedBy")
  @Override
  public String lastUpdatedBy() {
    return lastUpdatedBy;
  }

  /**
   * @return The value of the {@code entityLifecycleStatus} attribute
   */
  @JsonProperty("entityLifecycleStatus")
  @Override
  public EntityLifecycleStatus entityLifecycleStatus() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.entityLifecycleStatus()
        : this.entityLifecycleStatus;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#ratingSchemeId() ratingSchemeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingSchemeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withRatingSchemeId(long value) {
    if (this.ratingSchemeId == value) return this;
    return new ImmutableRoadmap(
        value,
        this.rowType,
        this.columnType,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#rowType() rowType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rowType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withRowType(EntityReference value) {
    if (this.rowType == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "rowType");
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        newValue,
        this.columnType,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#columnType() columnType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for columnType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withColumnType(EntityReference value) {
    if (this.columnType == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "columnType");
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        newValue,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Roadmap#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoadmap withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        newValue,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Roadmap#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoadmap withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        value,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        this.id,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        this.id,
        this.name,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        this.id,
        this.name,
        this.description,
        newValue,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        newValue,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Roadmap#entityLifecycleStatus() entityLifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityLifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmap withEntityLifecycleStatus(EntityLifecycleStatus value) {
    if (this.entityLifecycleStatus == value) return this;
    EntityLifecycleStatus newValue = Objects.requireNonNull(value, "entityLifecycleStatus");
    return new ImmutableRoadmap(
        this.ratingSchemeId,
        this.rowType,
        this.columnType,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoadmap} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoadmap
        && equalTo((ImmutableRoadmap) another);
  }

  private boolean equalTo(ImmutableRoadmap another) {
    return ratingSchemeId == another.ratingSchemeId
        && rowType.equals(another.rowType)
        && columnType.equals(another.columnType)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && entityLifecycleStatus.equals(another.entityLifecycleStatus);
  }

  /**
   * Computes a hash code from attributes: {@code ratingSchemeId}, {@code rowType}, {@code columnType}, {@code id}, {@code name}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code entityLifecycleStatus}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(ratingSchemeId);
    h += (h << 5) + rowType.hashCode();
    h += (h << 5) + columnType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + entityLifecycleStatus.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Roadmap} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Roadmap{");
    builder.append("ratingSchemeId=").append(ratingSchemeId);
    builder.append(", ");
    builder.append("rowType=").append(rowType);
    builder.append(", ");
    builder.append("columnType=").append(columnType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    builder.append(", ");
    builder.append("entityLifecycleStatus=").append(entityLifecycleStatus);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Roadmap {
    long ratingSchemeId;
    boolean ratingSchemeIdIsSet;
    EntityReference rowType;
    EntityReference columnType;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    EntityLifecycleStatus entityLifecycleStatus;
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
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @JsonProperty("entityLifecycleStatus")
    public void setEntityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
    }
    @Override
    public long ratingSchemeId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference rowType() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference columnType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
    @Override
    public EntityLifecycleStatus entityLifecycleStatus() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRoadmap fromJson(Json json) {
    ImmutableRoadmap.Builder builder = ImmutableRoadmap.builder();
    if (json.ratingSchemeIdIsSet) {
      builder.ratingSchemeId(json.ratingSchemeId);
    }
    if (json.rowType != null) {
      builder.rowType(json.rowType);
    }
    if (json.columnType != null) {
      builder.columnType(json.columnType);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    if (json.entityLifecycleStatus != null) {
      builder.entityLifecycleStatus(json.entityLifecycleStatus);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Roadmap} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Roadmap instance
   */
  public static ImmutableRoadmap copyOf(Roadmap instance) {
    if (instance instanceof ImmutableRoadmap) {
      return (ImmutableRoadmap) instance;
    }
    return ImmutableRoadmap.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoadmap ImmutableRoadmap}.
   * @return A new ImmutableRoadmap builder
   */
  public static ImmutableRoadmap.Builder builder() {
    return new ImmutableRoadmap.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoadmap ImmutableRoadmap}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING_SCHEME_ID = 0x1L;
    private static final long INIT_BIT_ROW_TYPE = 0x2L;
    private static final long INIT_BIT_COLUMN_TYPE = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x10L;
    private long initBits = 0x1fL;

    private long ratingSchemeId;
    private EntityReference rowType;
    private EntityReference columnType;
    private Long id;
    private String name;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private EntityLifecycleStatus entityLifecycleStatus;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EntityLifecycleStatusProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityLifecycleStatusProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LastUpdatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastUpdatedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.roadmap.Roadmap} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Roadmap instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
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
      if (object instanceof EntityLifecycleStatusProvider) {
        EntityLifecycleStatusProvider instance = (EntityLifecycleStatusProvider) object;
        entityLifecycleStatus(instance.entityLifecycleStatus());
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof Roadmap) {
        Roadmap instance = (Roadmap) object;
        ratingSchemeId(instance.ratingSchemeId());
        rowType(instance.rowType());
        columnType(instance.columnType());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link Roadmap#ratingSchemeId() ratingSchemeId} attribute.
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
     * Initializes the value for the {@link Roadmap#rowType() rowType} attribute.
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
     * Initializes the value for the {@link Roadmap#columnType() columnType} attribute.
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
     * Initializes the optional value {@link Roadmap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Roadmap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Roadmap#name() name} attribute.
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
     * Initializes the value for the {@link Roadmap#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link Roadmap#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Roadmap#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link Roadmap#lastUpdatedBy() lastUpdatedBy} attribute.
     * @param lastUpdatedBy The value for lastUpdatedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedBy")
    public final Builder lastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = Objects.requireNonNull(lastUpdatedBy, "lastUpdatedBy");
      initBits &= ~INIT_BIT_LAST_UPDATED_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link Roadmap#entityLifecycleStatus() entityLifecycleStatus} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Roadmap#entityLifecycleStatus() entityLifecycleStatus}.</em>
     * @param entityLifecycleStatus The value for entityLifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatus")
    public final Builder entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = Objects.requireNonNull(entityLifecycleStatus, "entityLifecycleStatus");
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoadmap ImmutableRoadmap}.
     * @return An immutable instance of Roadmap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoadmap build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoadmap(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING_SCHEME_ID) != 0) attributes.add("ratingSchemeId");
      if ((initBits & INIT_BIT_ROW_TYPE) != 0) attributes.add("rowType");
      if ((initBits & INIT_BIT_COLUMN_TYPE) != 0) attributes.add("columnType");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build Roadmap, some of required attributes are not set " + attributes;
    }
  }
}
