package com.khartec.waltz.model.physical_specification;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecification.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecification"})
public final class ImmutablePhysicalSpecification
    extends PhysicalSpecification {
  private final EntityReference owningEntity;
  private final DataFormatKind format;
  private final Long id;
  private final boolean isRemoved;
  private final String externalId;
  private final String name;
  private final @Nullable String description;
  private final String provenance;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutablePhysicalSpecification(ImmutablePhysicalSpecification.Builder builder) {
    this.owningEntity = builder.owningEntity;
    this.format = builder.format;
    this.id = builder.id;
    this.externalId = builder.externalId;
    this.name = builder.name;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.isRemovedIsSet()) {
      initShim.isRemoved(builder.isRemoved);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.isRemoved = initShim.isRemoved();
    this.provenance = initShim.provenance();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutablePhysicalSpecification(
      EntityReference owningEntity,
      DataFormatKind format,
      Long id,
      boolean isRemoved,
      String externalId,
      String name,
      @Nullable String description,
      String provenance,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.owningEntity = owningEntity;
    this.format = format;
    this.id = id;
    this.isRemoved = isRemoved;
    this.externalId = externalId;
    this.name = name;
    this.description = description;
    this.provenance = provenance;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private boolean isRemoved;
    private int isRemovedBuildStage;

    boolean isRemoved() {
      if (isRemovedBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isRemovedBuildStage == STAGE_UNINITIALIZED) {
        isRemovedBuildStage = STAGE_INITIALIZING;
        this.isRemoved = ImmutablePhysicalSpecification.super.isRemoved();
        isRemovedBuildStage = STAGE_INITIALIZED;
      }
      return this.isRemoved;
    }

    void isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      isRemovedBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutablePhysicalSpecification.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutablePhysicalSpecification.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (isRemovedBuildStage == STAGE_INITIALIZING) attributes.add("isRemoved");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build PhysicalSpecification, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code owningEntity} attribute
   */
  @JsonProperty("owningEntity")
  @Override
  public EntityReference owningEntity() {
    return owningEntity;
  }

  /**
   * @return The value of the {@code format} attribute
   */
  @JsonProperty("format")
  @Override
  public DataFormatKind format() {
    return format;
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
   * @return The value of the {@code isRemoved} attribute
   */
  @JsonProperty("isRemoved")
  @Override
  public boolean isRemoved() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isRemoved()
        : this.isRemoved;
  }

  /**
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
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
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.provenance()
        : this.provenance;
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
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#owningEntity() owningEntity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for owningEntity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withOwningEntity(EntityReference value) {
    if (this.owningEntity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "owningEntity");
    return new ImmutablePhysicalSpecification(
        newValue,
        this.format,
        this.id,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#format() format} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for format
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withFormat(DataFormatKind value) {
    if (this.format == value) return this;
    DataFormatKind newValue = Objects.requireNonNull(value, "format");
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        newValue,
        this.id,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecification withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        newValue,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecification#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecification withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        value,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#isRemoved() isRemoved} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRemoved
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withIsRemoved(boolean value) {
    if (this.isRemoved == value) return this;
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        value,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecification#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecification withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        newValue,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecification#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecification withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        value,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        this.externalId,
        newValue,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        this.externalId,
        this.name,
        value,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        newValue,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecification#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecification withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutablePhysicalSpecification(
        this.owningEntity,
        this.format,
        this.id,
        this.isRemoved,
        this.externalId,
        this.name,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecification
        && equalTo((ImmutablePhysicalSpecification) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecification another) {
    return owningEntity.equals(another.owningEntity)
        && format.equals(another.format)
        && Objects.equals(id, another.id)
        && isRemoved == another.isRemoved
        && Objects.equals(externalId, another.externalId)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code owningEntity}, {@code format}, {@code id}, {@code isRemoved}, {@code externalId}, {@code name}, {@code description}, {@code provenance}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + owningEntity.hashCode();
    h += (h << 5) + format.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Boolean.hashCode(isRemoved);
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalSpecification{");
    builder.append("owningEntity=").append(owningEntity);
    builder.append(", ");
    builder.append("format=").append(format);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("isRemoved=").append(isRemoved);
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PhysicalSpecification {
    EntityReference owningEntity;
    DataFormatKind format;
    Optional<Long> id = Optional.empty();
    boolean isRemoved;
    boolean isRemovedIsSet;
    Optional<String> externalId = Optional.empty();
    String name;
    String description;
    String provenance;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("owningEntity")
    public void setOwningEntity(EntityReference owningEntity) {
      this.owningEntity = owningEntity;
    }
    @JsonProperty("format")
    public void setFormat(DataFormatKind format) {
      this.format = format;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("isRemoved")
    public void setIsRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      this.isRemovedIsSet = true;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @Override
    public EntityReference owningEntity() { throw new UnsupportedOperationException(); }
    @Override
    public DataFormatKind format() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isRemoved() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalSpecification fromJson(Json json) {
    ImmutablePhysicalSpecification.Builder builder = ImmutablePhysicalSpecification.builder();
    if (json.owningEntity != null) {
      builder.owningEntity(json.owningEntity);
    }
    if (json.format != null) {
      builder.format(json.format);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.isRemovedIsSet) {
      builder.isRemoved(json.isRemoved);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecification} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecification instance
   */
  public static ImmutablePhysicalSpecification copyOf(PhysicalSpecification instance) {
    if (instance instanceof ImmutablePhysicalSpecification) {
      return (ImmutablePhysicalSpecification) instance;
    }
    return ImmutablePhysicalSpecification.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecification ImmutablePhysicalSpecification}.
   * @return A new ImmutablePhysicalSpecification builder
   */
  public static ImmutablePhysicalSpecification.Builder builder() {
    return new ImmutablePhysicalSpecification.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecification ImmutablePhysicalSpecification}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_OWNING_ENTITY = 0x1L;
    private static final long INIT_BIT_FORMAT = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private static final long OPT_BIT_IS_REMOVED = 0x1L;
    private long initBits = 0xfL;
    private long optBits;

    private EntityReference owningEntity;
    private DataFormatKind format;
    private Long id;
    private boolean isRemoved;
    private String externalId;
    private String name;
    private String description;
    private String provenance;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IsRemovedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IsRemovedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ExternalIdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ExternalIdProvider instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ProvenanceProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProvenanceProvider instance) {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification.PhysicalSpecification} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecification instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof IsRemovedProvider) {
        IsRemovedProvider instance = (IsRemovedProvider) object;
        isRemoved(instance.isRemoved());
      }
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof PhysicalSpecification) {
        PhysicalSpecification instance = (PhysicalSpecification) object;
        owningEntity(instance.owningEntity());
        format(instance.format());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#owningEntity() owningEntity} attribute.
     * @param owningEntity The value for owningEntity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owningEntity")
    public final Builder owningEntity(EntityReference owningEntity) {
      this.owningEntity = Objects.requireNonNull(owningEntity, "owningEntity");
      initBits &= ~INIT_BIT_OWNING_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#format() format} attribute.
     * @param format The value for format 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("format")
    public final Builder format(DataFormatKind format) {
      this.format = Objects.requireNonNull(format, "format");
      initBits &= ~INIT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#isRemoved() isRemoved} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecification#isRemoved() isRemoved}.</em>
     * @param isRemoved The value for isRemoved 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isRemoved")
    public final Builder isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      optBits |= OPT_BIT_IS_REMOVED;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecification#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecification#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#name() name} attribute.
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
     * Initializes the value for the {@link PhysicalSpecification#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecification#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecification#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecification#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Builds a new {@link ImmutablePhysicalSpecification ImmutablePhysicalSpecification}.
     * @return An immutable instance of PhysicalSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecification build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecification(this);
    }

    private boolean isRemovedIsSet() {
      return (optBits & OPT_BIT_IS_REMOVED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_OWNING_ENTITY) != 0) attributes.add("owningEntity");
      if ((initBits & INIT_BIT_FORMAT) != 0) attributes.add("format");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build PhysicalSpecification, some of required attributes are not set " + attributes;
    }
  }
}
