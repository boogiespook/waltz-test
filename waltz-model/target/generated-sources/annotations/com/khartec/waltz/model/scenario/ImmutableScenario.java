package com.khartec.waltz.model.scenario;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Scenario}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableScenario.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Scenario"})
public final class ImmutableScenario extends Scenario {
  private final long roadmapId;
  private final LocalDate effectiveDate;
  private final ScenarioType scenarioType;
  private final ReleaseLifecycleStatus releaseStatus;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final EntityLifecycleStatus entityLifecycleStatus;

  private ImmutableScenario(ImmutableScenario.Builder builder) {
    this.roadmapId = builder.roadmapId;
    this.effectiveDate = builder.effectiveDate;
    this.scenarioType = builder.scenarioType;
    this.releaseStatus = builder.releaseStatus;
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

  private ImmutableScenario(
      long roadmapId,
      LocalDate effectiveDate,
      ScenarioType scenarioType,
      ReleaseLifecycleStatus releaseStatus,
      Long id,
      String name,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      EntityLifecycleStatus entityLifecycleStatus) {
    this.roadmapId = roadmapId;
    this.effectiveDate = effectiveDate;
    this.scenarioType = scenarioType;
    this.releaseStatus = releaseStatus;
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableScenario.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.entityLifecycleStatus = Objects.requireNonNull(ImmutableScenario.super.entityLifecycleStatus(), "entityLifecycleStatus");
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
      return "Cannot build Scenario, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code roadmapId} attribute
   */
  @JsonProperty("roadmapId")
  @Override
  public long roadmapId() {
    return roadmapId;
  }

  /**
   * @return The value of the {@code effectiveDate} attribute
   */
  @JsonProperty("effectiveDate")
  @Override
  public LocalDate effectiveDate() {
    return effectiveDate;
  }

  /**
   * @return The value of the {@code scenarioType} attribute
   */
  @JsonProperty("scenarioType")
  @Override
  public ScenarioType scenarioType() {
    return scenarioType;
  }

  /**
   * @return The value of the {@code releaseStatus} attribute
   */
  @JsonProperty("releaseStatus")
  @Override
  public ReleaseLifecycleStatus releaseStatus() {
    return releaseStatus;
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
   * Copy the current immutable object by setting a value for the {@link Scenario#roadmapId() roadmapId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for roadmapId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withRoadmapId(long value) {
    if (this.roadmapId == value) return this;
    return new ImmutableScenario(
        value,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#effectiveDate() effectiveDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for effectiveDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withEffectiveDate(LocalDate value) {
    if (this.effectiveDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "effectiveDate");
    return new ImmutableScenario(
        this.roadmapId,
        newValue,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#scenarioType() scenarioType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenarioType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withScenarioType(ScenarioType value) {
    if (this.scenarioType == value) return this;
    ScenarioType newValue = Objects.requireNonNull(value, "scenarioType");
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        newValue,
        this.releaseStatus,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#releaseStatus() releaseStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for releaseStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withReleaseStatus(ReleaseLifecycleStatus value) {
    if (this.releaseStatus == value) return this;
    ReleaseLifecycleStatus newValue = Objects.requireNonNull(value, "releaseStatus");
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        newValue,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Scenario#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableScenario withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        newValue,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Scenario#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableScenario withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        value,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        this.name,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        this.name,
        this.description,
        newValue,
        this.lastUpdatedBy,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        newValue,
        this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Scenario#entityLifecycleStatus() entityLifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityLifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenario withEntityLifecycleStatus(EntityLifecycleStatus value) {
    if (this.entityLifecycleStatus == value) return this;
    EntityLifecycleStatus newValue = Objects.requireNonNull(value, "entityLifecycleStatus");
    return new ImmutableScenario(
        this.roadmapId,
        this.effectiveDate,
        this.scenarioType,
        this.releaseStatus,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableScenario} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableScenario
        && equalTo((ImmutableScenario) another);
  }

  private boolean equalTo(ImmutableScenario another) {
    return roadmapId == another.roadmapId
        && effectiveDate.equals(another.effectiveDate)
        && scenarioType.equals(another.scenarioType)
        && releaseStatus.equals(another.releaseStatus)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && entityLifecycleStatus.equals(another.entityLifecycleStatus);
  }

  /**
   * Computes a hash code from attributes: {@code roadmapId}, {@code effectiveDate}, {@code scenarioType}, {@code releaseStatus}, {@code id}, {@code name}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code entityLifecycleStatus}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(roadmapId);
    h += (h << 5) + effectiveDate.hashCode();
    h += (h << 5) + scenarioType.hashCode();
    h += (h << 5) + releaseStatus.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + entityLifecycleStatus.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Scenario} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Scenario{");
    builder.append("roadmapId=").append(roadmapId);
    builder.append(", ");
    builder.append("effectiveDate=").append(effectiveDate);
    builder.append(", ");
    builder.append("scenarioType=").append(scenarioType);
    builder.append(", ");
    builder.append("releaseStatus=").append(releaseStatus);
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
  static final class Json extends Scenario {
    long roadmapId;
    boolean roadmapIdIsSet;
    LocalDate effectiveDate;
    ScenarioType scenarioType;
    ReleaseLifecycleStatus releaseStatus;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    EntityLifecycleStatus entityLifecycleStatus;
    @JsonProperty("roadmapId")
    public void setRoadmapId(long roadmapId) {
      this.roadmapId = roadmapId;
      this.roadmapIdIsSet = true;
    }
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(LocalDate effectiveDate) {
      this.effectiveDate = effectiveDate;
    }
    @JsonProperty("scenarioType")
    public void setScenarioType(ScenarioType scenarioType) {
      this.scenarioType = scenarioType;
    }
    @JsonProperty("releaseStatus")
    public void setReleaseStatus(ReleaseLifecycleStatus releaseStatus) {
      this.releaseStatus = releaseStatus;
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
    public long roadmapId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate effectiveDate() { throw new UnsupportedOperationException(); }
    @Override
    public ScenarioType scenarioType() { throw new UnsupportedOperationException(); }
    @Override
    public ReleaseLifecycleStatus releaseStatus() { throw new UnsupportedOperationException(); }
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
  static ImmutableScenario fromJson(Json json) {
    ImmutableScenario.Builder builder = ImmutableScenario.builder();
    if (json.roadmapIdIsSet) {
      builder.roadmapId(json.roadmapId);
    }
    if (json.effectiveDate != null) {
      builder.effectiveDate(json.effectiveDate);
    }
    if (json.scenarioType != null) {
      builder.scenarioType(json.scenarioType);
    }
    if (json.releaseStatus != null) {
      builder.releaseStatus(json.releaseStatus);
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
   * Creates an immutable copy of a {@link Scenario} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Scenario instance
   */
  public static ImmutableScenario copyOf(Scenario instance) {
    if (instance instanceof ImmutableScenario) {
      return (ImmutableScenario) instance;
    }
    return ImmutableScenario.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableScenario ImmutableScenario}.
   * @return A new ImmutableScenario builder
   */
  public static ImmutableScenario.Builder builder() {
    return new ImmutableScenario.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableScenario ImmutableScenario}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ROADMAP_ID = 0x1L;
    private static final long INIT_BIT_EFFECTIVE_DATE = 0x2L;
    private static final long INIT_BIT_SCENARIO_TYPE = 0x4L;
    private static final long INIT_BIT_RELEASE_STATUS = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x20L;
    private long initBits = 0x3fL;

    private long roadmapId;
    private LocalDate effectiveDate;
    private ScenarioType scenarioType;
    private ReleaseLifecycleStatus releaseStatus;
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.scenario.Scenario} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Scenario instance) {
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
      if (object instanceof Scenario) {
        Scenario instance = (Scenario) object;
        releaseStatus(instance.releaseStatus());
        scenarioType(instance.scenarioType());
        roadmapId(instance.roadmapId());
        effectiveDate(instance.effectiveDate());
      }
    }

    /**
     * Initializes the value for the {@link Scenario#roadmapId() roadmapId} attribute.
     * @param roadmapId The value for roadmapId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("roadmapId")
    public final Builder roadmapId(long roadmapId) {
      this.roadmapId = roadmapId;
      initBits &= ~INIT_BIT_ROADMAP_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Scenario#effectiveDate() effectiveDate} attribute.
     * @param effectiveDate The value for effectiveDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveDate")
    public final Builder effectiveDate(LocalDate effectiveDate) {
      this.effectiveDate = Objects.requireNonNull(effectiveDate, "effectiveDate");
      initBits &= ~INIT_BIT_EFFECTIVE_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link Scenario#scenarioType() scenarioType} attribute.
     * @param scenarioType The value for scenarioType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scenarioType")
    public final Builder scenarioType(ScenarioType scenarioType) {
      this.scenarioType = Objects.requireNonNull(scenarioType, "scenarioType");
      initBits &= ~INIT_BIT_SCENARIO_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link Scenario#releaseStatus() releaseStatus} attribute.
     * @param releaseStatus The value for releaseStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("releaseStatus")
    public final Builder releaseStatus(ReleaseLifecycleStatus releaseStatus) {
      this.releaseStatus = Objects.requireNonNull(releaseStatus, "releaseStatus");
      initBits &= ~INIT_BIT_RELEASE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Scenario#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Scenario#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Scenario#name() name} attribute.
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
     * Initializes the value for the {@link Scenario#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link Scenario#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Scenario#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link Scenario#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link Scenario#entityLifecycleStatus() entityLifecycleStatus} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Scenario#entityLifecycleStatus() entityLifecycleStatus}.</em>
     * @param entityLifecycleStatus The value for entityLifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatus")
    public final Builder entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = Objects.requireNonNull(entityLifecycleStatus, "entityLifecycleStatus");
      return this;
    }

    /**
     * Builds a new {@link ImmutableScenario ImmutableScenario}.
     * @return An immutable instance of Scenario
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableScenario build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableScenario(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ROADMAP_ID) != 0) attributes.add("roadmapId");
      if ((initBits & INIT_BIT_EFFECTIVE_DATE) != 0) attributes.add("effectiveDate");
      if ((initBits & INIT_BIT_SCENARIO_TYPE) != 0) attributes.add("scenarioType");
      if ((initBits & INIT_BIT_RELEASE_STATUS) != 0) attributes.add("releaseStatus");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build Scenario, some of required attributes are not set " + attributes;
    }
  }
}
