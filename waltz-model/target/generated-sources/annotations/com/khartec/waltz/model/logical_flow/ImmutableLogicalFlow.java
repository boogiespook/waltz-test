package com.khartec.waltz.model.logical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastAttestedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LogicalFlow}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogicalFlow.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LogicalFlow"})
public final class ImmutableLogicalFlow extends LogicalFlow {
  private final EntityReference source;
  private final EntityReference target;
  private final Long id;
  private final String provenance;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final LocalDateTime lastAttestedAt;
  private final String lastAttestedBy;
  private final EntityLifecycleStatus entityLifecycleStatus;

  private ImmutableLogicalFlow(ImmutableLogicalFlow.Builder builder) {
    this.source = builder.source;
    this.target = builder.target;
    this.id = builder.id;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.lastAttestedAt = builder.lastAttestedAt;
    this.lastAttestedBy = builder.lastAttestedBy;
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    if (builder.entityLifecycleStatus != null) {
      initShim.entityLifecycleStatus(builder.entityLifecycleStatus);
    }
    this.provenance = initShim.provenance();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.entityLifecycleStatus = initShim.entityLifecycleStatus();
    this.initShim = null;
  }

  private ImmutableLogicalFlow(
      EntityReference source,
      EntityReference target,
      Long id,
      String provenance,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      LocalDateTime lastAttestedAt,
      String lastAttestedBy,
      EntityLifecycleStatus entityLifecycleStatus) {
    this.source = source;
    this.target = target;
    this.id = id;
    this.provenance = provenance;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.lastAttestedAt = lastAttestedAt;
    this.lastAttestedBy = lastAttestedBy;
    this.entityLifecycleStatus = entityLifecycleStatus;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableLogicalFlow.super.provenance(), "provenance");
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableLogicalFlow.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.entityLifecycleStatus = Objects.requireNonNull(ImmutableLogicalFlow.super.entityLifecycleStatus(), "entityLifecycleStatus");
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
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) attributes.add("entityLifecycleStatus");
      return "Cannot build LogicalFlow, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public EntityReference source() {
    return source;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public EntityReference target() {
    return target;
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
   * @return The value of the {@code lastAttestedAt} attribute
   */
  @JsonProperty("lastAttestedAt")
  @Override
  public Optional<LocalDateTime> lastAttestedAt() {
    return Optional.ofNullable(lastAttestedAt);
  }

  /**
   * @return The value of the {@code lastAttestedBy} attribute
   */
  @JsonProperty("lastAttestedBy")
  @Override
  public Optional<String> lastAttestedBy() {
    return Optional.ofNullable(lastAttestedBy);
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
   * Copy the current immutable object by setting a value for the {@link LogicalFlow#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlow withSource(EntityReference value) {
    if (this.source == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "source");
    return new ImmutableLogicalFlow(
        newValue,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlow#target() target} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for target
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlow withTarget(EntityReference value) {
    if (this.target == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "target");
    return new ImmutableLogicalFlow(
        this.source,
        newValue,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link LogicalFlow#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlow withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        newValue,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link LogicalFlow#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlow withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        value,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlow#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlow withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlow#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlow withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        newValue,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlow#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlow withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        newValue,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link LogicalFlow#lastAttestedAt() lastAttestedAt} attribute.
   * @param value The value for lastAttestedAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlow withLastAttestedAt(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "lastAttestedAt");
    if (this.lastAttestedAt == newValue) return this;
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link LogicalFlow#lastAttestedAt() lastAttestedAt} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastAttestedAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlow withLastAttestedAt(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.lastAttestedAt == value) return this;
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        value,
        this.lastAttestedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link LogicalFlow#lastAttestedBy() lastAttestedBy} attribute.
   * @param value The value for lastAttestedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlow withLastAttestedBy(String value) {
    String newValue = Objects.requireNonNull(value, "lastAttestedBy");
    if (Objects.equals(this.lastAttestedBy, newValue)) return this;
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        newValue,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link LogicalFlow#lastAttestedBy() lastAttestedBy} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastAttestedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlow withLastAttestedBy(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.lastAttestedBy, value)) return this;
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        value,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlow#entityLifecycleStatus() entityLifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityLifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlow withEntityLifecycleStatus(EntityLifecycleStatus value) {
    if (this.entityLifecycleStatus == value) return this;
    EntityLifecycleStatus newValue = Objects.requireNonNull(value, "entityLifecycleStatus");
    return new ImmutableLogicalFlow(
        this.source,
        this.target,
        this.id,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogicalFlow} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogicalFlow
        && equalTo((ImmutableLogicalFlow) another);
  }

  private boolean equalTo(ImmutableLogicalFlow another) {
    return source.equals(another.source)
        && target.equals(another.target)
        && Objects.equals(id, another.id)
        && provenance.equals(another.provenance)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && Objects.equals(lastAttestedAt, another.lastAttestedAt)
        && Objects.equals(lastAttestedBy, another.lastAttestedBy)
        && entityLifecycleStatus.equals(another.entityLifecycleStatus);
  }

  /**
   * Computes a hash code from attributes: {@code source}, {@code target}, {@code id}, {@code provenance}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code lastAttestedAt}, {@code lastAttestedBy}, {@code entityLifecycleStatus}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + source.hashCode();
    h += (h << 5) + target.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + Objects.hashCode(lastAttestedAt);
    h += (h << 5) + Objects.hashCode(lastAttestedBy);
    h += (h << 5) + entityLifecycleStatus.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LogicalFlow} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("LogicalFlow{");
    builder.append("source=").append(source);
    builder.append(", ");
    builder.append("target=").append(target);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    if (lastAttestedAt != null) {
      builder.append(", ");
      builder.append("lastAttestedAt=").append(lastAttestedAt);
    }
    if (lastAttestedBy != null) {
      builder.append(", ");
      builder.append("lastAttestedBy=").append(lastAttestedBy);
    }
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
  static final class Json extends LogicalFlow {
    EntityReference source;
    EntityReference target;
    Optional<Long> id = Optional.empty();
    String provenance;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    Optional<LocalDateTime> lastAttestedAt = Optional.empty();
    Optional<String> lastAttestedBy = Optional.empty();
    EntityLifecycleStatus entityLifecycleStatus;
    @JsonProperty("source")
    public void setSource(EntityReference source) {
      this.source = source;
    }
    @JsonProperty("target")
    public void setTarget(EntityReference target) {
      this.target = target;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
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
    @JsonProperty("lastAttestedAt")
    public void setLastAttestedAt(Optional<LocalDateTime> lastAttestedAt) {
      this.lastAttestedAt = lastAttestedAt;
    }
    @JsonProperty("lastAttestedBy")
    public void setLastAttestedBy(Optional<String> lastAttestedBy) {
      this.lastAttestedBy = lastAttestedBy;
    }
    @JsonProperty("entityLifecycleStatus")
    public void setEntityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
    }
    @Override
    public EntityReference source() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDateTime> lastAttestedAt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> lastAttestedBy() { throw new UnsupportedOperationException(); }
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
  static ImmutableLogicalFlow fromJson(Json json) {
    ImmutableLogicalFlow.Builder builder = ImmutableLogicalFlow.builder();
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.target != null) {
      builder.target(json.target);
    }
    if (json.id != null) {
      builder.id(json.id);
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
    if (json.lastAttestedAt != null) {
      builder.lastAttestedAt(json.lastAttestedAt);
    }
    if (json.lastAttestedBy != null) {
      builder.lastAttestedBy(json.lastAttestedBy);
    }
    if (json.entityLifecycleStatus != null) {
      builder.entityLifecycleStatus(json.entityLifecycleStatus);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LogicalFlow} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LogicalFlow instance
   */
  public static ImmutableLogicalFlow copyOf(LogicalFlow instance) {
    if (instance instanceof ImmutableLogicalFlow) {
      return (ImmutableLogicalFlow) instance;
    }
    return ImmutableLogicalFlow.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogicalFlow ImmutableLogicalFlow}.
   * @return A new ImmutableLogicalFlow builder
   */
  public static ImmutableLogicalFlow.Builder builder() {
    return new ImmutableLogicalFlow.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogicalFlow ImmutableLogicalFlow}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_TARGET = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private long initBits = 0x7L;

    private EntityReference source;
    private EntityReference target;
    private Long id;
    private String provenance;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private LocalDateTime lastAttestedAt;
    private String lastAttestedBy;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LastAttestedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastAttestedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.logical_flow.LogicalFlow} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LogicalFlow instance) {
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
      if (object instanceof LastAttestedProvider) {
        LastAttestedProvider instance = (LastAttestedProvider) object;
        Optional<LocalDateTime> lastAttestedAtOptional = instance.lastAttestedAt();
        if (lastAttestedAtOptional.isPresent()) {
          lastAttestedAt(lastAttestedAtOptional);
        }
        Optional<String> lastAttestedByOptional = instance.lastAttestedBy();
        if (lastAttestedByOptional.isPresent()) {
          lastAttestedBy(lastAttestedByOptional);
        }
      }
      if (object instanceof LogicalFlow) {
        LogicalFlow instance = (LogicalFlow) object;
        source(instance.source());
        target(instance.target());
      }
    }

    /**
     * Initializes the value for the {@link LogicalFlow#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(EntityReference source) {
      this.source = Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlow#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(EntityReference target) {
      this.target = Objects.requireNonNull(target, "target");
      initBits &= ~INIT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalFlow#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalFlow#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlow#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalFlow#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlow#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalFlow#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlow#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the optional value {@link LogicalFlow#lastAttestedAt() lastAttestedAt} to lastAttestedAt.
     * @param lastAttestedAt The value for lastAttestedAt
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastAttestedAt(LocalDateTime lastAttestedAt) {
      this.lastAttestedAt = Objects.requireNonNull(lastAttestedAt, "lastAttestedAt");
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalFlow#lastAttestedAt() lastAttestedAt} to lastAttestedAt.
     * @param lastAttestedAt The value for lastAttestedAt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastAttestedAt")
    public final Builder lastAttestedAt(Optional<? extends LocalDateTime> lastAttestedAt) {
      this.lastAttestedAt = lastAttestedAt.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalFlow#lastAttestedBy() lastAttestedBy} to lastAttestedBy.
     * @param lastAttestedBy The value for lastAttestedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastAttestedBy(String lastAttestedBy) {
      this.lastAttestedBy = Objects.requireNonNull(lastAttestedBy, "lastAttestedBy");
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalFlow#lastAttestedBy() lastAttestedBy} to lastAttestedBy.
     * @param lastAttestedBy The value for lastAttestedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastAttestedBy")
    public final Builder lastAttestedBy(Optional<String> lastAttestedBy) {
      this.lastAttestedBy = lastAttestedBy.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlow#entityLifecycleStatus() entityLifecycleStatus} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalFlow#entityLifecycleStatus() entityLifecycleStatus}.</em>
     * @param entityLifecycleStatus The value for entityLifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatus")
    public final Builder entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = Objects.requireNonNull(entityLifecycleStatus, "entityLifecycleStatus");
      return this;
    }

    /**
     * Builds a new {@link ImmutableLogicalFlow ImmutableLogicalFlow}.
     * @return An immutable instance of LogicalFlow
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLogicalFlow build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLogicalFlow(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SOURCE) != 0) attributes.add("source");
      if ((initBits & INIT_BIT_TARGET) != 0) attributes.add("target");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build LogicalFlow, some of required attributes are not set " + attributes;
    }
  }
}
