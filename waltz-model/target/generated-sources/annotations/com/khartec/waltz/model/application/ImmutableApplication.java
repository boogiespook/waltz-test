package com.khartec.waltz.model.application;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.OrganisationalUnitIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.rating.RagRating;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Application}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableApplication.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Application"})
public final class ImmutableApplication extends Application {
  private final String assetCode;
  private final String parentAssetCode;
  private final ApplicationKind applicationKind;
  private final LifecyclePhase lifecyclePhase;
  private final RagRating overallRating;
  private final LocalDateTime plannedRetirementDate;
  private final LocalDateTime actualRetirementDate;
  private final EntityKind kind;
  private final String provenance;
  private final Criticality businessCriticality;
  private final Long id;
  private final boolean isRemoved;
  private final String name;
  private final @Nullable String description;
  private final EntityLifecycleStatus entityLifecycleStatus;
  private final Long organisationalUnitId;

  private ImmutableApplication(ImmutableApplication.Builder builder) {
    this.assetCode = builder.assetCode;
    this.parentAssetCode = builder.parentAssetCode;
    this.applicationKind = builder.applicationKind;
    this.lifecyclePhase = builder.lifecyclePhase;
    this.overallRating = builder.overallRating;
    this.plannedRetirementDate = builder.plannedRetirementDate;
    this.actualRetirementDate = builder.actualRetirementDate;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.organisationalUnitId = builder.organisationalUnitId;
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.businessCriticality != null) {
      initShim.businessCriticality(builder.businessCriticality);
    }
    if (builder.isRemovedIsSet()) {
      initShim.isRemoved(builder.isRemoved);
    }
    if (builder.entityLifecycleStatus != null) {
      initShim.entityLifecycleStatus(builder.entityLifecycleStatus);
    }
    this.kind = initShim.kind();
    this.provenance = initShim.provenance();
    this.businessCriticality = initShim.businessCriticality();
    this.isRemoved = initShim.isRemoved();
    this.entityLifecycleStatus = initShim.entityLifecycleStatus();
    this.initShim = null;
  }

  private ImmutableApplication(
      String assetCode,
      String parentAssetCode,
      ApplicationKind applicationKind,
      LifecyclePhase lifecyclePhase,
      RagRating overallRating,
      LocalDateTime plannedRetirementDate,
      LocalDateTime actualRetirementDate,
      EntityKind kind,
      String provenance,
      Criticality businessCriticality,
      Long id,
      boolean isRemoved,
      String name,
      @Nullable String description,
      EntityLifecycleStatus entityLifecycleStatus,
      Long organisationalUnitId) {
    this.assetCode = assetCode;
    this.parentAssetCode = parentAssetCode;
    this.applicationKind = applicationKind;
    this.lifecyclePhase = lifecyclePhase;
    this.overallRating = overallRating;
    this.plannedRetirementDate = plannedRetirementDate;
    this.actualRetirementDate = actualRetirementDate;
    this.kind = kind;
    this.provenance = provenance;
    this.businessCriticality = businessCriticality;
    this.id = id;
    this.isRemoved = isRemoved;
    this.name = name;
    this.description = description;
    this.entityLifecycleStatus = entityLifecycleStatus;
    this.organisationalUnitId = organisationalUnitId;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private EntityKind kind;
    private int kindBuildStage;

    EntityKind kind() {
      if (kindBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (kindBuildStage == STAGE_UNINITIALIZED) {
        kindBuildStage = STAGE_INITIALIZING;
        this.kind = Objects.requireNonNull(ImmutableApplication.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableApplication.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private Criticality businessCriticality;
    private int businessCriticalityBuildStage;

    Criticality businessCriticality() {
      if (businessCriticalityBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (businessCriticalityBuildStage == STAGE_UNINITIALIZED) {
        businessCriticalityBuildStage = STAGE_INITIALIZING;
        this.businessCriticality = Objects.requireNonNull(ImmutableApplication.super.businessCriticality(), "businessCriticality");
        businessCriticalityBuildStage = STAGE_INITIALIZED;
      }
      return this.businessCriticality;
    }

    void businessCriticality(Criticality businessCriticality) {
      this.businessCriticality = businessCriticality;
      businessCriticalityBuildStage = STAGE_INITIALIZED;
    }
    private boolean isRemoved;
    private int isRemovedBuildStage;

    boolean isRemoved() {
      if (isRemovedBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isRemovedBuildStage == STAGE_UNINITIALIZED) {
        isRemovedBuildStage = STAGE_INITIALIZING;
        this.isRemoved = ImmutableApplication.super.isRemoved();
        isRemovedBuildStage = STAGE_INITIALIZED;
      }
      return this.isRemoved;
    }

    void isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      isRemovedBuildStage = STAGE_INITIALIZED;
    }
    private EntityLifecycleStatus entityLifecycleStatus;
    private int entityLifecycleStatusBuildStage;

    EntityLifecycleStatus entityLifecycleStatus() {
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (entityLifecycleStatusBuildStage == STAGE_UNINITIALIZED) {
        entityLifecycleStatusBuildStage = STAGE_INITIALIZING;
        this.entityLifecycleStatus = Objects.requireNonNull(ImmutableApplication.super.entityLifecycleStatus(), "entityLifecycleStatus");
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
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (businessCriticalityBuildStage == STAGE_INITIALIZING) attributes.add("businessCriticality");
      if (isRemovedBuildStage == STAGE_INITIALIZING) attributes.add("isRemoved");
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) attributes.add("entityLifecycleStatus");
      return "Cannot build Application, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code assetCode} attribute
   */
  @JsonProperty("assetCode")
  @Override
  public Optional<String> assetCode() {
    return Optional.ofNullable(assetCode);
  }

  /**
   * @return The value of the {@code parentAssetCode} attribute
   */
  @JsonProperty("parentAssetCode")
  @Override
  public Optional<String> parentAssetCode() {
    return Optional.ofNullable(parentAssetCode);
  }

  /**
   * @return The value of the {@code applicationKind} attribute
   */
  @JsonProperty("applicationKind")
  @Override
  public ApplicationKind applicationKind() {
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
   * @return The value of the {@code overallRating} attribute
   */
  @JsonProperty("overallRating")
  @Override
  public RagRating overallRating() {
    return overallRating;
  }

  /**
   * @return The value of the {@code plannedRetirementDate} attribute
   */
  @JsonProperty("plannedRetirementDate")
  @Override
  public Optional<LocalDateTime> plannedRetirementDate() {
    return Optional.ofNullable(plannedRetirementDate);
  }

  /**
   * @return The value of the {@code actualRetirementDate} attribute
   */
  @JsonProperty("actualRetirementDate")
  @Override
  public Optional<LocalDateTime> actualRetirementDate() {
    return Optional.ofNullable(actualRetirementDate);
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
   * @return The value of the {@code businessCriticality} attribute
   */
  @JsonProperty("businessCriticality")
  @Override
  public Criticality businessCriticality() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.businessCriticality()
        : this.businessCriticality;
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
   * @return The value of the {@code organisationalUnitId} attribute
   */
  @JsonProperty("organisationalUnitId")
  @Override
  public Long organisationalUnitId() {
    return organisationalUnitId;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Application#assetCode() assetCode} attribute.
   * @param value The value for assetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withAssetCode(String value) {
    String newValue = Objects.requireNonNull(value, "assetCode");
    if (Objects.equals(this.assetCode, newValue)) return this;
    return new ImmutableApplication(
        newValue,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Application#assetCode() assetCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withAssetCode(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.assetCode, value)) return this;
    return new ImmutableApplication(
        value,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Application#parentAssetCode() parentAssetCode} attribute.
   * @param value The value for parentAssetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withParentAssetCode(String value) {
    String newValue = Objects.requireNonNull(value, "parentAssetCode");
    if (Objects.equals(this.parentAssetCode, newValue)) return this;
    return new ImmutableApplication(
        this.assetCode,
        newValue,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Application#parentAssetCode() parentAssetCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentAssetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withParentAssetCode(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.parentAssetCode, value)) return this;
    return new ImmutableApplication(
        this.assetCode,
        value,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#applicationKind() applicationKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withApplicationKind(ApplicationKind value) {
    if (this.applicationKind == value) return this;
    ApplicationKind newValue = Objects.requireNonNull(value, "applicationKind");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        newValue,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#lifecyclePhase() lifecyclePhase} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lifecyclePhase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withLifecyclePhase(LifecyclePhase value) {
    if (this.lifecyclePhase == value) return this;
    LifecyclePhase newValue = Objects.requireNonNull(value, "lifecyclePhase");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        newValue,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#overallRating() overallRating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for overallRating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withOverallRating(RagRating value) {
    if (this.overallRating == value) return this;
    RagRating newValue = Objects.requireNonNull(value, "overallRating");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        newValue,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Application#plannedRetirementDate() plannedRetirementDate} attribute.
   * @param value The value for plannedRetirementDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withPlannedRetirementDate(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "plannedRetirementDate");
    if (this.plannedRetirementDate == newValue) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        newValue,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Application#plannedRetirementDate() plannedRetirementDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for plannedRetirementDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withPlannedRetirementDate(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.plannedRetirementDate == value) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        value,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Application#actualRetirementDate() actualRetirementDate} attribute.
   * @param value The value for actualRetirementDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withActualRetirementDate(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "actualRetirementDate");
    if (this.actualRetirementDate == newValue) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        newValue,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Application#actualRetirementDate() actualRetirementDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actualRetirementDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withActualRetirementDate(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.actualRetirementDate == value) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        value,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        newValue,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        newValue,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#businessCriticality() businessCriticality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for businessCriticality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withBusinessCriticality(Criticality value) {
    if (this.businessCriticality == value) return this;
    Criticality newValue = Objects.requireNonNull(value, "businessCriticality");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        newValue,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Application#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        newValue,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Application#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplication withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        value,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#isRemoved() isRemoved} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRemoved
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withIsRemoved(boolean value) {
    if (this.isRemoved == value) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        value,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        newValue,
        this.description,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        value,
        this.entityLifecycleStatus,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#entityLifecycleStatus() entityLifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityLifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withEntityLifecycleStatus(EntityLifecycleStatus value) {
    if (this.entityLifecycleStatus == value) return this;
    EntityLifecycleStatus newValue = Objects.requireNonNull(value, "entityLifecycleStatus");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        newValue,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Application#organisationalUnitId() organisationalUnitId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organisationalUnitId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplication withOrganisationalUnitId(Long value) {
    if (this.organisationalUnitId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "organisationalUnitId");
    return new ImmutableApplication(
        this.assetCode,
        this.parentAssetCode,
        this.applicationKind,
        this.lifecyclePhase,
        this.overallRating,
        this.plannedRetirementDate,
        this.actualRetirementDate,
        this.kind,
        this.provenance,
        this.businessCriticality,
        this.id,
        this.isRemoved,
        this.name,
        this.description,
        this.entityLifecycleStatus,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableApplication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableApplication
        && equalTo((ImmutableApplication) another);
  }

  private boolean equalTo(ImmutableApplication another) {
    return Objects.equals(assetCode, another.assetCode)
        && Objects.equals(parentAssetCode, another.parentAssetCode)
        && applicationKind.equals(another.applicationKind)
        && lifecyclePhase.equals(another.lifecyclePhase)
        && overallRating.equals(another.overallRating)
        && Objects.equals(plannedRetirementDate, another.plannedRetirementDate)
        && Objects.equals(actualRetirementDate, another.actualRetirementDate)
        && kind.equals(another.kind)
        && provenance.equals(another.provenance)
        && businessCriticality.equals(another.businessCriticality)
        && Objects.equals(id, another.id)
        && isRemoved == another.isRemoved
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && entityLifecycleStatus.equals(another.entityLifecycleStatus)
        && organisationalUnitId.equals(another.organisationalUnitId);
  }

  /**
   * Computes a hash code from attributes: {@code assetCode}, {@code parentAssetCode}, {@code applicationKind}, {@code lifecyclePhase}, {@code overallRating}, {@code plannedRetirementDate}, {@code actualRetirementDate}, {@code kind}, {@code provenance}, {@code businessCriticality}, {@code id}, {@code isRemoved}, {@code name}, {@code description}, {@code entityLifecycleStatus}, {@code organisationalUnitId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(assetCode);
    h += (h << 5) + Objects.hashCode(parentAssetCode);
    h += (h << 5) + applicationKind.hashCode();
    h += (h << 5) + lifecyclePhase.hashCode();
    h += (h << 5) + overallRating.hashCode();
    h += (h << 5) + Objects.hashCode(plannedRetirementDate);
    h += (h << 5) + Objects.hashCode(actualRetirementDate);
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + businessCriticality.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Boolean.hashCode(isRemoved);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + entityLifecycleStatus.hashCode();
    h += (h << 5) + organisationalUnitId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Application} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Application{");
    if (assetCode != null) {
      builder.append("assetCode=").append(assetCode);
    }
    if (parentAssetCode != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("parentAssetCode=").append(parentAssetCode);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("applicationKind=").append(applicationKind);
    builder.append(", ");
    builder.append("lifecyclePhase=").append(lifecyclePhase);
    builder.append(", ");
    builder.append("overallRating=").append(overallRating);
    if (plannedRetirementDate != null) {
      builder.append(", ");
      builder.append("plannedRetirementDate=").append(plannedRetirementDate);
    }
    if (actualRetirementDate != null) {
      builder.append(", ");
      builder.append("actualRetirementDate=").append(actualRetirementDate);
    }
    builder.append(", ");
    builder.append("kind=").append(kind);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    builder.append(", ");
    builder.append("businessCriticality=").append(businessCriticality);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("isRemoved=").append(isRemoved);
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("entityLifecycleStatus=").append(entityLifecycleStatus);
    builder.append(", ");
    builder.append("organisationalUnitId=").append(organisationalUnitId);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Application {
    Optional<String> assetCode = Optional.empty();
    Optional<String> parentAssetCode = Optional.empty();
    ApplicationKind applicationKind;
    LifecyclePhase lifecyclePhase;
    RagRating overallRating;
    Optional<LocalDateTime> plannedRetirementDate = Optional.empty();
    Optional<LocalDateTime> actualRetirementDate = Optional.empty();
    EntityKind kind;
    String provenance;
    Criticality businessCriticality;
    Optional<Long> id = Optional.empty();
    boolean isRemoved;
    boolean isRemovedIsSet;
    String name;
    String description;
    EntityLifecycleStatus entityLifecycleStatus;
    Long organisationalUnitId;
    @JsonProperty("assetCode")
    public void setAssetCode(Optional<String> assetCode) {
      this.assetCode = assetCode;
    }
    @JsonProperty("parentAssetCode")
    public void setParentAssetCode(Optional<String> parentAssetCode) {
      this.parentAssetCode = parentAssetCode;
    }
    @JsonProperty("applicationKind")
    public void setApplicationKind(ApplicationKind applicationKind) {
      this.applicationKind = applicationKind;
    }
    @JsonProperty("lifecyclePhase")
    public void setLifecyclePhase(LifecyclePhase lifecyclePhase) {
      this.lifecyclePhase = lifecyclePhase;
    }
    @JsonProperty("overallRating")
    public void setOverallRating(RagRating overallRating) {
      this.overallRating = overallRating;
    }
    @JsonProperty("plannedRetirementDate")
    public void setPlannedRetirementDate(Optional<LocalDateTime> plannedRetirementDate) {
      this.plannedRetirementDate = plannedRetirementDate;
    }
    @JsonProperty("actualRetirementDate")
    public void setActualRetirementDate(Optional<LocalDateTime> actualRetirementDate) {
      this.actualRetirementDate = actualRetirementDate;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("businessCriticality")
    public void setBusinessCriticality(Criticality businessCriticality) {
      this.businessCriticality = businessCriticality;
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
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("entityLifecycleStatus")
    public void setEntityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
    }
    @JsonProperty("organisationalUnitId")
    public void setOrganisationalUnitId(Long organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
    }
    @Override
    public Optional<String> assetCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> parentAssetCode() { throw new UnsupportedOperationException(); }
    @Override
    public ApplicationKind applicationKind() { throw new UnsupportedOperationException(); }
    @Override
    public LifecyclePhase lifecyclePhase() { throw new UnsupportedOperationException(); }
    @Override
    public RagRating overallRating() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDateTime> plannedRetirementDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDateTime> actualRetirementDate() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public Criticality businessCriticality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isRemoved() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public EntityLifecycleStatus entityLifecycleStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Long organisationalUnitId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableApplication fromJson(Json json) {
    ImmutableApplication.Builder builder = ImmutableApplication.builder();
    if (json.assetCode != null) {
      builder.assetCode(json.assetCode);
    }
    if (json.parentAssetCode != null) {
      builder.parentAssetCode(json.parentAssetCode);
    }
    if (json.applicationKind != null) {
      builder.applicationKind(json.applicationKind);
    }
    if (json.lifecyclePhase != null) {
      builder.lifecyclePhase(json.lifecyclePhase);
    }
    if (json.overallRating != null) {
      builder.overallRating(json.overallRating);
    }
    if (json.plannedRetirementDate != null) {
      builder.plannedRetirementDate(json.plannedRetirementDate);
    }
    if (json.actualRetirementDate != null) {
      builder.actualRetirementDate(json.actualRetirementDate);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.businessCriticality != null) {
      builder.businessCriticality(json.businessCriticality);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.isRemovedIsSet) {
      builder.isRemoved(json.isRemoved);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.entityLifecycleStatus != null) {
      builder.entityLifecycleStatus(json.entityLifecycleStatus);
    }
    if (json.organisationalUnitId != null) {
      builder.organisationalUnitId(json.organisationalUnitId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Application} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Application instance
   */
  public static ImmutableApplication copyOf(Application instance) {
    if (instance instanceof ImmutableApplication) {
      return (ImmutableApplication) instance;
    }
    return ImmutableApplication.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableApplication ImmutableApplication}.
   * @return A new ImmutableApplication builder
   */
  public static ImmutableApplication.Builder builder() {
    return new ImmutableApplication.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableApplication ImmutableApplication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APPLICATION_KIND = 0x1L;
    private static final long INIT_BIT_LIFECYCLE_PHASE = 0x2L;
    private static final long INIT_BIT_OVERALL_RATING = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private static final long INIT_BIT_ORGANISATIONAL_UNIT_ID = 0x10L;
    private static final long OPT_BIT_IS_REMOVED = 0x1L;
    private long initBits = 0x1fL;
    private long optBits;

    private String assetCode;
    private String parentAssetCode;
    private ApplicationKind applicationKind;
    private LifecyclePhase lifecyclePhase;
    private RagRating overallRating;
    private LocalDateTime plannedRetirementDate;
    private LocalDateTime actualRetirementDate;
    private EntityKind kind;
    private String provenance;
    private Criticality businessCriticality;
    private Long id;
    private boolean isRemoved;
    private String name;
    private String description;
    private EntityLifecycleStatus entityLifecycleStatus;
    private Long organisationalUnitId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.application.Application} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Application instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.OrganisationalUnitIdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(OrganisationalUnitIdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof Application) {
        Application instance = (Application) object;
        Optional<String> parentAssetCodeOptional = instance.parentAssetCode();
        if (parentAssetCodeOptional.isPresent()) {
          parentAssetCode(parentAssetCodeOptional);
        }
        applicationKind(instance.applicationKind());
        Optional<LocalDateTime> plannedRetirementDateOptional = instance.plannedRetirementDate();
        if (plannedRetirementDateOptional.isPresent()) {
          plannedRetirementDate(plannedRetirementDateOptional);
        }
        Optional<String> assetCodeOptional = instance.assetCode();
        if (assetCodeOptional.isPresent()) {
          assetCode(assetCodeOptional);
        }
        overallRating(instance.overallRating());
        if ((bits & 0x2L) == 0) {
          provenance(instance.provenance());
          bits |= 0x2L;
        }
        businessCriticality(instance.businessCriticality());
        lifecyclePhase(instance.lifecyclePhase());
        Optional<LocalDateTime> actualRetirementDateOptional = instance.actualRetirementDate();
        if (actualRetirementDateOptional.isPresent()) {
          actualRetirementDate(actualRetirementDateOptional);
        }
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
      }
      if (object instanceof IsRemovedProvider) {
        IsRemovedProvider instance = (IsRemovedProvider) object;
        isRemoved(instance.isRemoved());
      }
      if (object instanceof EntityLifecycleStatusProvider) {
        EntityLifecycleStatusProvider instance = (EntityLifecycleStatusProvider) object;
        entityLifecycleStatus(instance.entityLifecycleStatus());
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
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
        if ((bits & 0x2L) == 0) {
          provenance(instance.provenance());
          bits |= 0x2L;
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof OrganisationalUnitIdProvider) {
        OrganisationalUnitIdProvider instance = (OrganisationalUnitIdProvider) object;
        organisationalUnitId(instance.organisationalUnitId());
      }
    }

    /**
     * Initializes the optional value {@link Application#assetCode() assetCode} to assetCode.
     * @param assetCode The value for assetCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder assetCode(String assetCode) {
      this.assetCode = Objects.requireNonNull(assetCode, "assetCode");
      return this;
    }

    /**
     * Initializes the optional value {@link Application#assetCode() assetCode} to assetCode.
     * @param assetCode The value for assetCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assetCode")
    public final Builder assetCode(Optional<String> assetCode) {
      this.assetCode = assetCode.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Application#parentAssetCode() parentAssetCode} to parentAssetCode.
     * @param parentAssetCode The value for parentAssetCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentAssetCode(String parentAssetCode) {
      this.parentAssetCode = Objects.requireNonNull(parentAssetCode, "parentAssetCode");
      return this;
    }

    /**
     * Initializes the optional value {@link Application#parentAssetCode() parentAssetCode} to parentAssetCode.
     * @param parentAssetCode The value for parentAssetCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentAssetCode")
    public final Builder parentAssetCode(Optional<String> parentAssetCode) {
      this.parentAssetCode = parentAssetCode.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Application#applicationKind() applicationKind} attribute.
     * @param applicationKind The value for applicationKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationKind")
    public final Builder applicationKind(ApplicationKind applicationKind) {
      this.applicationKind = Objects.requireNonNull(applicationKind, "applicationKind");
      initBits &= ~INIT_BIT_APPLICATION_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link Application#lifecyclePhase() lifecyclePhase} attribute.
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
     * Initializes the value for the {@link Application#overallRating() overallRating} attribute.
     * @param overallRating The value for overallRating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("overallRating")
    public final Builder overallRating(RagRating overallRating) {
      this.overallRating = Objects.requireNonNull(overallRating, "overallRating");
      initBits &= ~INIT_BIT_OVERALL_RATING;
      return this;
    }

    /**
     * Initializes the optional value {@link Application#plannedRetirementDate() plannedRetirementDate} to plannedRetirementDate.
     * @param plannedRetirementDate The value for plannedRetirementDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder plannedRetirementDate(LocalDateTime plannedRetirementDate) {
      this.plannedRetirementDate = Objects.requireNonNull(plannedRetirementDate, "plannedRetirementDate");
      return this;
    }

    /**
     * Initializes the optional value {@link Application#plannedRetirementDate() plannedRetirementDate} to plannedRetirementDate.
     * @param plannedRetirementDate The value for plannedRetirementDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("plannedRetirementDate")
    public final Builder plannedRetirementDate(Optional<? extends LocalDateTime> plannedRetirementDate) {
      this.plannedRetirementDate = plannedRetirementDate.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Application#actualRetirementDate() actualRetirementDate} to actualRetirementDate.
     * @param actualRetirementDate The value for actualRetirementDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder actualRetirementDate(LocalDateTime actualRetirementDate) {
      this.actualRetirementDate = Objects.requireNonNull(actualRetirementDate, "actualRetirementDate");
      return this;
    }

    /**
     * Initializes the optional value {@link Application#actualRetirementDate() actualRetirementDate} to actualRetirementDate.
     * @param actualRetirementDate The value for actualRetirementDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actualRetirementDate")
    public final Builder actualRetirementDate(Optional<? extends LocalDateTime> actualRetirementDate) {
      this.actualRetirementDate = actualRetirementDate.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Application#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Application#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the value for the {@link Application#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Application#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link Application#businessCriticality() businessCriticality} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Application#businessCriticality() businessCriticality}.</em>
     * @param businessCriticality The value for businessCriticality 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("businessCriticality")
    public final Builder businessCriticality(Criticality businessCriticality) {
      this.businessCriticality = Objects.requireNonNull(businessCriticality, "businessCriticality");
      return this;
    }

    /**
     * Initializes the optional value {@link Application#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Application#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Application#isRemoved() isRemoved} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Application#isRemoved() isRemoved}.</em>
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
     * Initializes the value for the {@link Application#name() name} attribute.
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
     * Initializes the value for the {@link Application#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link Application#entityLifecycleStatus() entityLifecycleStatus} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Application#entityLifecycleStatus() entityLifecycleStatus}.</em>
     * @param entityLifecycleStatus The value for entityLifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatus")
    public final Builder entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = Objects.requireNonNull(entityLifecycleStatus, "entityLifecycleStatus");
      return this;
    }

    /**
     * Initializes the value for the {@link Application#organisationalUnitId() organisationalUnitId} attribute.
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
     * Builds a new {@link ImmutableApplication ImmutableApplication}.
     * @return An immutable instance of Application
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableApplication build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableApplication(this);
    }

    private boolean isRemovedIsSet() {
      return (optBits & OPT_BIT_IS_REMOVED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APPLICATION_KIND) != 0) attributes.add("applicationKind");
      if ((initBits & INIT_BIT_LIFECYCLE_PHASE) != 0) attributes.add("lifecyclePhase");
      if ((initBits & INIT_BIT_OVERALL_RATING) != 0) attributes.add("overallRating");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ORGANISATIONAL_UNIT_ID) != 0) attributes.add("organisationalUnitId");
      return "Cannot build Application, some of required attributes are not set " + attributes;
    }
  }
}
