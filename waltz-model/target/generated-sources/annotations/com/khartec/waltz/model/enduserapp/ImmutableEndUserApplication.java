package com.khartec.waltz.model.enduserapp;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.application.LifecyclePhase;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EndUserApplication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEndUserApplication.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EndUserApplication"})
public final class ImmutableEndUserApplication extends EndUserApplication {
  private final Long organisationalUnitId;
  private final String applicationKind;
  private final LifecyclePhase lifecyclePhase;
  private final Criticality riskRating;
  private final String provenance;
  private final EntityKind kind;
  private final Long id;
  private final @Nullable String description;
  private final String externalId;
  private final String name;

  private ImmutableEndUserApplication(ImmutableEndUserApplication.Builder builder) {
    this.organisationalUnitId = builder.organisationalUnitId;
    this.applicationKind = builder.applicationKind;
    this.lifecyclePhase = builder.lifecyclePhase;
    this.riskRating = builder.riskRating;
    this.id = builder.id;
    this.description = builder.description;
    this.externalId = builder.externalId;
    this.name = builder.name;
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    this.provenance = initShim.provenance();
    this.kind = initShim.kind();
    this.initShim = null;
  }

  private ImmutableEndUserApplication(
      Long organisationalUnitId,
      String applicationKind,
      LifecyclePhase lifecyclePhase,
      Criticality riskRating,
      String provenance,
      EntityKind kind,
      Long id,
      @Nullable String description,
      String externalId,
      String name) {
    this.organisationalUnitId = organisationalUnitId;
    this.applicationKind = applicationKind;
    this.lifecyclePhase = lifecyclePhase;
    this.riskRating = riskRating;
    this.provenance = provenance;
    this.kind = kind;
    this.id = id;
    this.description = description;
    this.externalId = externalId;
    this.name = name;
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
        this.provenance = Objects.requireNonNull(ImmutableEndUserApplication.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private EntityKind kind;
    private int kindBuildStage;

    EntityKind kind() {
      if (kindBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (kindBuildStage == STAGE_UNINITIALIZED) {
        kindBuildStage = STAGE_INITIALIZING;
        this.kind = Objects.requireNonNull(ImmutableEndUserApplication.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      return "Cannot build EndUserApplication, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code organisationalUnitId} attribute
   */
  @JsonProperty("organisationalUnitId")
  @Override
  public Long organisationalUnitId() {
    return organisationalUnitId;
  }

  /**
   * @return The value of the {@code applicationKind} attribute
   */
  @JsonProperty("applicationKind")
  @Override
  public String applicationKind() {
    return applicationKind;
  }

  /**
   * @return The value of the {@code lifecyclePhase} attribute
   */
  @JsonProperty("lifecyclePhase")
  @Override
  public LifecyclePhase lifecyclePhase() {
    return lifecyclePhase;
  }

  /**
   * @return The value of the {@code riskRating} attribute
   */
  @JsonProperty("riskRating")
  @Override
  public Criticality riskRating() {
    return riskRating;
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
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public EntityKind kind() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.kind()
        : this.kind;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
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
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#organisationalUnitId() organisationalUnitId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organisationalUnitId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withOrganisationalUnitId(Long value) {
    if (this.organisationalUnitId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "organisationalUnitId");
    return new ImmutableEndUserApplication(
        newValue,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#applicationKind() applicationKind} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withApplicationKind(String value) {
    if (this.applicationKind.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "applicationKind");
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        newValue,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#lifecyclePhase() lifecyclePhase} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lifecyclePhase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withLifecyclePhase(LifecyclePhase value) {
    if (this.lifecyclePhase == value) return this;
    LifecyclePhase newValue = Objects.requireNonNull(value, "lifecyclePhase");
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        newValue,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#riskRating() riskRating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for riskRating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withRiskRating(Criticality value) {
    if (this.riskRating == value) return this;
    Criticality newValue = Objects.requireNonNull(value, "riskRating");
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        newValue,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        newValue,
        this.kind,
        this.id,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        newValue,
        this.id,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EndUserApplication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndUserApplication withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        newValue,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EndUserApplication#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndUserApplication withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        value,
        this.description,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        value,
        this.externalId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EndUserApplication#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndUserApplication withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EndUserApplication#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndUserApplication withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EndUserApplication#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndUserApplication withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableEndUserApplication(
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.riskRating,
        this.provenance,
        this.kind,
        this.id,
        this.description,
        this.externalId,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEndUserApplication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEndUserApplication
        && equalTo((ImmutableEndUserApplication) another);
  }

  private boolean equalTo(ImmutableEndUserApplication another) {
    return organisationalUnitId.equals(another.organisationalUnitId)
        && applicationKind.equals(another.applicationKind)
        && lifecyclePhase.equals(another.lifecyclePhase)
        && riskRating.equals(another.riskRating)
        && provenance.equals(another.provenance)
        && kind.equals(another.kind)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(externalId, another.externalId)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code organisationalUnitId}, {@code applicationKind}, {@code lifecyclePhase}, {@code riskRating}, {@code provenance}, {@code kind}, {@code id}, {@code description}, {@code externalId}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + organisationalUnitId.hashCode();
    h += (h << 5) + applicationKind.hashCode();
    h += (h << 5) + lifecyclePhase.hashCode();
    h += (h << 5) + riskRating.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EndUserApplication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EndUserApplication{");
    builder.append("organisationalUnitId=").append(organisationalUnitId);
    builder.append(", ");
    builder.append("applicationKind=").append(applicationKind);
    builder.append(", ");
    builder.append("lifecyclePhase=").append(lifecyclePhase);
    builder.append(", ");
    builder.append("riskRating=").append(riskRating);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    builder.append(", ");
    builder.append("kind=").append(kind);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EndUserApplication {
    Long organisationalUnitId;
    String applicationKind;
    LifecyclePhase lifecyclePhase;
    Criticality riskRating;
    String provenance;
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    String description;
    Optional<String> externalId = Optional.empty();
    String name;
    @JsonProperty("organisationalUnitId")
    public void setOrganisationalUnitId(Long organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
    }
    @JsonProperty("applicationKind")
    public void setApplicationKind(String applicationKind) {
      this.applicationKind = applicationKind;
    }
    @JsonProperty("lifecyclePhase")
    public void setLifecyclePhase(LifecyclePhase lifecyclePhase) {
      this.lifecyclePhase = lifecyclePhase;
    }
    @JsonProperty("riskRating")
    public void setRiskRating(Criticality riskRating) {
      this.riskRating = riskRating;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public Long organisationalUnitId() { throw new UnsupportedOperationException(); }
    @Override
    public String applicationKind() { throw new UnsupportedOperationException(); }
    @Override
    public LifecyclePhase lifecyclePhase() { throw new UnsupportedOperationException(); }
    @Override
    public Criticality riskRating() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
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
  static ImmutableEndUserApplication fromJson(Json json) {
    ImmutableEndUserApplication.Builder builder = ImmutableEndUserApplication.builder();
    if (json.organisationalUnitId != null) {
      builder.organisationalUnitId(json.organisationalUnitId);
    }
    if (json.applicationKind != null) {
      builder.applicationKind(json.applicationKind);
    }
    if (json.lifecyclePhase != null) {
      builder.lifecyclePhase(json.lifecyclePhase);
    }
    if (json.riskRating != null) {
      builder.riskRating(json.riskRating);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EndUserApplication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EndUserApplication instance
   */
  public static ImmutableEndUserApplication copyOf(EndUserApplication instance) {
    if (instance instanceof ImmutableEndUserApplication) {
      return (ImmutableEndUserApplication) instance;
    }
    return ImmutableEndUserApplication.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEndUserApplication ImmutableEndUserApplication}.
   * @return A new ImmutableEndUserApplication builder
   */
  public static ImmutableEndUserApplication.Builder builder() {
    return new ImmutableEndUserApplication.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEndUserApplication ImmutableEndUserApplication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ORGANISATIONAL_UNIT_ID = 0x1L;
    private static final long INIT_BIT_APPLICATION_KIND = 0x2L;
    private static final long INIT_BIT_LIFECYCLE_PHASE = 0x4L;
    private static final long INIT_BIT_RISK_RATING = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private long initBits = 0x1fL;

    private Long organisationalUnitId;
    private String applicationKind;
    private LifecyclePhase lifecyclePhase;
    private Criticality riskRating;
    private String provenance;
    private EntityKind kind;
    private Long id;
    private String description;
    private String externalId;
    private String name;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.enduserapp.EndUserApplication} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EndUserApplication instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EntityKindProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityKindProvider instance) {
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

    private void from(Object object) {
      long bits = 0;
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof EndUserApplication) {
        EndUserApplication instance = (EndUserApplication) object;
        applicationKind(instance.applicationKind());
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
        organisationalUnitId(instance.organisationalUnitId());
        lifecyclePhase(instance.lifecyclePhase());
        if ((bits & 0x2L) == 0) {
          kind(instance.kind());
          bits |= 0x2L;
        }
        riskRating(instance.riskRating());
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x2L) == 0) {
          kind(instance.kind());
          bits |= 0x2L;
        }
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
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link EndUserApplication#organisationalUnitId() organisationalUnitId} attribute.
     * @param organisationalUnitId The value for organisationalUnitId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organisationalUnitId")
    public final Builder organisationalUnitId(Long organisationalUnitId) {
      this.organisationalUnitId = Objects.requireNonNull(organisationalUnitId, "organisationalUnitId");
      initBits &= ~INIT_BIT_ORGANISATIONAL_UNIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#applicationKind() applicationKind} attribute.
     * @param applicationKind The value for applicationKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationKind")
    public final Builder applicationKind(String applicationKind) {
      this.applicationKind = Objects.requireNonNull(applicationKind, "applicationKind");
      initBits &= ~INIT_BIT_APPLICATION_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#lifecyclePhase() lifecyclePhase} attribute.
     * @param lifecyclePhase The value for lifecyclePhase 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lifecyclePhase")
    public final Builder lifecyclePhase(LifecyclePhase lifecyclePhase) {
      this.lifecyclePhase = Objects.requireNonNull(lifecyclePhase, "lifecyclePhase");
      initBits &= ~INIT_BIT_LIFECYCLE_PHASE;
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#riskRating() riskRating} attribute.
     * @param riskRating The value for riskRating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("riskRating")
    public final Builder riskRating(Criticality riskRating) {
      this.riskRating = Objects.requireNonNull(riskRating, "riskRating");
      initBits &= ~INIT_BIT_RISK_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EndUserApplication#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EndUserApplication#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link EndUserApplication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EndUserApplication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link EndUserApplication#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link EndUserApplication#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EndUserApplication#name() name} attribute.
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
     * Builds a new {@link ImmutableEndUserApplication ImmutableEndUserApplication}.
     * @return An immutable instance of EndUserApplication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEndUserApplication build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEndUserApplication(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ORGANISATIONAL_UNIT_ID) != 0) attributes.add("organisationalUnitId");
      if ((initBits & INIT_BIT_APPLICATION_KIND) != 0) attributes.add("applicationKind");
      if ((initBits & INIT_BIT_LIFECYCLE_PHASE) != 0) attributes.add("lifecyclePhase");
      if ((initBits & INIT_BIT_RISK_RATING) != 0) attributes.add("riskRating");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build EndUserApplication, some of required attributes are not set " + attributes;
    }
  }
}
