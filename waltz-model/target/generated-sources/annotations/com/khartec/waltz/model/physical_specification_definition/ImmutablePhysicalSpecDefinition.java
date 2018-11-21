package com.khartec.waltz.model.physical_specification_definition;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecDefinition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecDefinition"})
public final class ImmutablePhysicalSpecDefinition
    extends PhysicalSpecDefinition {
  private final long specificationId;
  private final String version;
  private final String delimiter;
  private final PhysicalSpecDefinitionType type;
  private final ReleaseLifecycleStatus status;
  private final Long id;
  private final LocalDateTime createdAt;
  private final String createdBy;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutablePhysicalSpecDefinition(ImmutablePhysicalSpecDefinition.Builder builder) {
    this.specificationId = builder.specificationId;
    this.version = builder.version;
    this.delimiter = builder.delimiter;
    this.type = builder.type;
    this.status = builder.status;
    this.id = builder.id;
    this.createdBy = builder.createdBy;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.createdAt != null) {
      initShim.createdAt(builder.createdAt);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.createdAt = initShim.createdAt();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.provenance = initShim.provenance();
    this.initShim = null;
  }

  private ImmutablePhysicalSpecDefinition(
      long specificationId,
      String version,
      String delimiter,
      PhysicalSpecDefinitionType type,
      ReleaseLifecycleStatus status,
      Long id,
      LocalDateTime createdAt,
      String createdBy,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.specificationId = specificationId;
    this.version = version;
    this.delimiter = delimiter;
    this.type = type;
    this.status = status;
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.provenance = provenance;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private LocalDateTime createdAt;
    private int createdAtBuildStage;

    LocalDateTime createdAt() {
      if (createdAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (createdAtBuildStage == STAGE_UNINITIALIZED) {
        createdAtBuildStage = STAGE_INITIALIZING;
        this.createdAt = Objects.requireNonNull(ImmutablePhysicalSpecDefinition.super.createdAt(), "createdAt");
        createdAtBuildStage = STAGE_INITIALIZED;
      }
      return this.createdAt;
    }

    void createdAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
      createdAtBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutablePhysicalSpecDefinition.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutablePhysicalSpecDefinition.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (createdAtBuildStage == STAGE_INITIALIZING) attributes.add("createdAt");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build PhysicalSpecDefinition, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code specificationId} attribute
   */
  @JsonProperty("specificationId")
  @Override
  public long specificationId() {
    return specificationId;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    return version;
  }

  /**
   * @return The value of the {@code delimiter} attribute
   */
  @JsonProperty("delimiter")
  @Override
  public Optional<String> delimiter() {
    return Optional.ofNullable(delimiter);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public PhysicalSpecDefinitionType type() {
    return type;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public ReleaseLifecycleStatus status() {
    return status;
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
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty("createdAt")
  @Override
  public LocalDateTime createdAt() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.createdAt()
        : this.createdAt;
  }

  /**
   * @return The value of the {@code createdBy} attribute
   */
  @JsonProperty("createdBy")
  @Override
  public String createdBy() {
    return createdBy;
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
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#specificationId() specificationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specificationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withSpecificationId(long value) {
    if (this.specificationId == value) return this;
    return new ImmutablePhysicalSpecDefinition(
        value,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "version");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        newValue,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinition#delimiter() delimiter} attribute.
   * @param value The value for delimiter
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withDelimiter(String value) {
    String newValue = Objects.requireNonNull(value, "delimiter");
    if (Objects.equals(this.delimiter, newValue)) return this;
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        newValue,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinition#delimiter() delimiter} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for delimiter
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withDelimiter(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.delimiter, value)) return this;
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        value,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withType(PhysicalSpecDefinitionType value) {
    if (this.type == value) return this;
    PhysicalSpecDefinitionType newValue = Objects.requireNonNull(value, "type");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        newValue,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withStatus(ReleaseLifecycleStatus value) {
    if (this.status == value) return this;
    ReleaseLifecycleStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        newValue,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        newValue,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        value,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        newValue,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#createdBy() createdBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withCreatedBy(String value) {
    if (this.createdBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "createdBy");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        newValue,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinition#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinition withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutablePhysicalSpecDefinition(
        this.specificationId,
        this.version,
        this.delimiter,
        this.type,
        this.status,
        this.id,
        this.createdAt,
        this.createdBy,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecDefinition
        && equalTo((ImmutablePhysicalSpecDefinition) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecDefinition another) {
    return specificationId == another.specificationId
        && version.equals(another.version)
        && Objects.equals(delimiter, another.delimiter)
        && type.equals(another.type)
        && status.equals(another.status)
        && Objects.equals(id, another.id)
        && createdAt.equals(another.createdAt)
        && createdBy.equals(another.createdBy)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code specificationId}, {@code version}, {@code delimiter}, {@code type}, {@code status}, {@code id}, {@code createdAt}, {@code createdBy}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(specificationId);
    h += (h << 5) + version.hashCode();
    h += (h << 5) + Objects.hashCode(delimiter);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + createdBy.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalSpecDefinition{");
    builder.append("specificationId=").append(specificationId);
    builder.append(", ");
    builder.append("version=").append(version);
    if (delimiter != null) {
      builder.append(", ");
      builder.append("delimiter=").append(delimiter);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    builder.append(", ");
    builder.append("status=").append(status);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("createdAt=").append(createdAt);
    builder.append(", ");
    builder.append("createdBy=").append(createdBy);
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      extends PhysicalSpecDefinition {
    long specificationId;
    boolean specificationIdIsSet;
    String version;
    Optional<String> delimiter = Optional.empty();
    PhysicalSpecDefinitionType type;
    ReleaseLifecycleStatus status;
    Optional<Long> id = Optional.empty();
    LocalDateTime createdAt;
    String createdBy;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String provenance;
    @JsonProperty("specificationId")
    public void setSpecificationId(long specificationId) {
      this.specificationId = specificationId;
      this.specificationIdIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @JsonProperty("delimiter")
    public void setDelimiter(Optional<String> delimiter) {
      this.delimiter = delimiter;
    }
    @JsonProperty("type")
    public void setType(PhysicalSpecDefinitionType type) {
      this.type = type;
    }
    @JsonProperty("status")
    public void setStatus(ReleaseLifecycleStatus status) {
      this.status = status;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long specificationId() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> delimiter() { throw new UnsupportedOperationException(); }
    @Override
    public PhysicalSpecDefinitionType type() { throw new UnsupportedOperationException(); }
    @Override
    public ReleaseLifecycleStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime createdAt() { throw new UnsupportedOperationException(); }
    @Override
    public String createdBy() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalSpecDefinition fromJson(Json json) {
    ImmutablePhysicalSpecDefinition.Builder builder = ImmutablePhysicalSpecDefinition.builder();
    if (json.specificationIdIsSet) {
      builder.specificationId(json.specificationId);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    if (json.delimiter != null) {
      builder.delimiter(json.delimiter);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    if (json.createdBy != null) {
      builder.createdBy(json.createdBy);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecDefinition instance
   */
  public static ImmutablePhysicalSpecDefinition copyOf(PhysicalSpecDefinition instance) {
    if (instance instanceof ImmutablePhysicalSpecDefinition) {
      return (ImmutablePhysicalSpecDefinition) instance;
    }
    return ImmutablePhysicalSpecDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecDefinition ImmutablePhysicalSpecDefinition}.
   * @return A new ImmutablePhysicalSpecDefinition builder
   */
  public static ImmutablePhysicalSpecDefinition.Builder builder() {
    return new ImmutablePhysicalSpecDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecDefinition ImmutablePhysicalSpecDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SPECIFICATION_ID = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private static final long INIT_BIT_TYPE = 0x4L;
    private static final long INIT_BIT_STATUS = 0x8L;
    private static final long INIT_BIT_CREATED_BY = 0x10L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x20L;
    private long initBits = 0x3fL;

    private long specificationId;
    private String version;
    private String delimiter;
    private PhysicalSpecDefinitionType type;
    private ReleaseLifecycleStatus status;
    private Long id;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.CreatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CreatedProvider instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification_definition.PhysicalSpecDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecDefinition instance) {
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

    private void from(Object object) {
      if (object instanceof CreatedProvider) {
        CreatedProvider instance = (CreatedProvider) object;
        createdAt(instance.createdAt());
        createdBy(instance.createdBy());
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof PhysicalSpecDefinition) {
        PhysicalSpecDefinition instance = (PhysicalSpecDefinition) object;
        specificationId(instance.specificationId());
        type(instance.type());
        version(instance.version());
        Optional<String> delimiterOptional = instance.delimiter();
        if (delimiterOptional.isPresent()) {
          delimiter(delimiterOptional);
        }
        status(instance.status());
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
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#specificationId() specificationId} attribute.
     * @param specificationId The value for specificationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specificationId")
    public final Builder specificationId(long specificationId) {
      this.specificationId = specificationId;
      initBits &= ~INIT_BIT_SPECIFICATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(String version) {
      this.version = Objects.requireNonNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinition#delimiter() delimiter} to delimiter.
     * @param delimiter The value for delimiter
     * @return {@code this} builder for chained invocation
     */
    public final Builder delimiter(String delimiter) {
      this.delimiter = Objects.requireNonNull(delimiter, "delimiter");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinition#delimiter() delimiter} to delimiter.
     * @param delimiter The value for delimiter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("delimiter")
    public final Builder delimiter(Optional<String> delimiter) {
      this.delimiter = delimiter.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(PhysicalSpecDefinitionType type) {
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(ReleaseLifecycleStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#createdAt() createdAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecDefinition#createdAt() createdAt}.</em>
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#createdBy() createdBy} attribute.
     * @param createdBy The value for createdBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdBy")
    public final Builder createdBy(String createdBy) {
      this.createdBy = Objects.requireNonNull(createdBy, "createdBy");
      initBits &= ~INIT_BIT_CREATED_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecDefinition#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinition#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link PhysicalSpecDefinition#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecDefinition#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecDefinition ImmutablePhysicalSpecDefinition}.
     * @return An immutable instance of PhysicalSpecDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecDefinition(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SPECIFICATION_ID) != 0) attributes.add("specificationId");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_CREATED_BY) != 0) attributes.add("createdBy");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build PhysicalSpecDefinition, some of required attributes are not set " + attributes;
    }
  }
}
