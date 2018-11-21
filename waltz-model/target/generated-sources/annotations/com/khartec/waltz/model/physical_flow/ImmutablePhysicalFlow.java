package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.LastAttestedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlow}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlow.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlow"})
public final class ImmutablePhysicalFlow extends PhysicalFlow {
  private final long logicalFlowId;
  private final long specificationId;
  private final FrequencyKind frequency;
  private final int basisOffset;
  private final TransportKind transport;
  private final Long specificationDefinitionId;
  private final Criticality criticality;
  private final Long id;
  private final boolean isRemoved;
  private final @Nullable String description;
  private final String provenance;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final LocalDateTime lastAttestedAt;
  private final String lastAttestedBy;
  private final String externalId;

  private ImmutablePhysicalFlow(ImmutablePhysicalFlow.Builder builder) {
    this.logicalFlowId = builder.logicalFlowId;
    this.specificationId = builder.specificationId;
    this.frequency = builder.frequency;
    this.basisOffset = builder.basisOffset;
    this.transport = builder.transport;
    this.specificationDefinitionId = builder.specificationDefinitionId;
    this.criticality = builder.criticality;
    this.id = builder.id;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.lastAttestedAt = builder.lastAttestedAt;
    this.lastAttestedBy = builder.lastAttestedBy;
    this.externalId = builder.externalId;
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

  private ImmutablePhysicalFlow(
      long logicalFlowId,
      long specificationId,
      FrequencyKind frequency,
      int basisOffset,
      TransportKind transport,
      Long specificationDefinitionId,
      Criticality criticality,
      Long id,
      boolean isRemoved,
      @Nullable String description,
      String provenance,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      LocalDateTime lastAttestedAt,
      String lastAttestedBy,
      String externalId) {
    this.logicalFlowId = logicalFlowId;
    this.specificationId = specificationId;
    this.frequency = frequency;
    this.basisOffset = basisOffset;
    this.transport = transport;
    this.specificationDefinitionId = specificationDefinitionId;
    this.criticality = criticality;
    this.id = id;
    this.isRemoved = isRemoved;
    this.description = description;
    this.provenance = provenance;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.lastAttestedAt = lastAttestedAt;
    this.lastAttestedBy = lastAttestedBy;
    this.externalId = externalId;
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
        this.isRemoved = ImmutablePhysicalFlow.super.isRemoved();
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
        this.provenance = Objects.requireNonNull(ImmutablePhysicalFlow.super.provenance(), "provenance");
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutablePhysicalFlow.super.lastUpdatedAt(), "lastUpdatedAt");
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
      return "Cannot build PhysicalFlow, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code logicalFlowId} attribute
   */
  @JsonProperty("logicalFlowId")
  @Override
  public long logicalFlowId() {
    return logicalFlowId;
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
   * @return The value of the {@code frequency} attribute
   */
  @JsonProperty("frequency")
  @Override
  public FrequencyKind frequency() {
    return frequency;
  }

  /**
   * @return The value of the {@code basisOffset} attribute
   */
  @JsonProperty("basisOffset")
  @Override
  public int basisOffset() {
    return basisOffset;
  }

  /**
   * @return The value of the {@code transport} attribute
   */
  @JsonProperty("transport")
  @Override
  public TransportKind transport() {
    return transport;
  }

  /**
   * @return The value of the {@code specificationDefinitionId} attribute
   */
  @JsonProperty("specificationDefinitionId")
  @Override
  public Optional<Long> specificationDefinitionId() {
    return Optional.ofNullable(specificationDefinitionId);
  }

  /**
   * @return The value of the {@code criticality} attribute
   */
  @JsonProperty("criticality")
  @Override
  public Criticality criticality() {
    return criticality;
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
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#logicalFlowId() logicalFlowId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for logicalFlowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withLogicalFlowId(long value) {
    if (this.logicalFlowId == value) return this;
    return new ImmutablePhysicalFlow(
        value,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#specificationId() specificationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specificationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withSpecificationId(long value) {
    if (this.specificationId == value) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        value,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#frequency() frequency} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for frequency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withFrequency(FrequencyKind value) {
    if (this.frequency == value) return this;
    FrequencyKind newValue = Objects.requireNonNull(value, "frequency");
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        newValue,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#basisOffset() basisOffset} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for basisOffset
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withBasisOffset(int value) {
    if (this.basisOffset == value) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        value,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#transport() transport} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transport
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withTransport(TransportKind value) {
    if (this.transport == value) return this;
    TransportKind newValue = Objects.requireNonNull(value, "transport");
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        newValue,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlow#specificationDefinitionId() specificationDefinitionId} attribute.
   * @param value The value for specificationDefinitionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withSpecificationDefinitionId(long value) {
    Long newValue = value;
    if (Objects.equals(this.specificationDefinitionId, newValue)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        newValue,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlow#specificationDefinitionId() specificationDefinitionId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specificationDefinitionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withSpecificationDefinitionId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.specificationDefinitionId, value)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        value,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#criticality() criticality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for criticality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withCriticality(Criticality value) {
    if (this.criticality == value) return this;
    Criticality newValue = Objects.requireNonNull(value, "criticality");
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        newValue,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlow#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        newValue,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlow#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        value,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#isRemoved() isRemoved} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRemoved
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withIsRemoved(boolean value) {
    if (this.isRemoved == value) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        value,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        value,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        newValue,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlow#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlow withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        newValue,
        this.lastAttestedAt,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlow#lastAttestedAt() lastAttestedAt} attribute.
   * @param value The value for lastAttestedAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withLastAttestedAt(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "lastAttestedAt");
    if (this.lastAttestedAt == newValue) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlow#lastAttestedAt() lastAttestedAt} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastAttestedAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withLastAttestedAt(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.lastAttestedAt == value) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        value,
        this.lastAttestedBy,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlow#lastAttestedBy() lastAttestedBy} attribute.
   * @param value The value for lastAttestedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withLastAttestedBy(String value) {
    String newValue = Objects.requireNonNull(value, "lastAttestedBy");
    if (Objects.equals(this.lastAttestedBy, newValue)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        newValue,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlow#lastAttestedBy() lastAttestedBy} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastAttestedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withLastAttestedBy(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.lastAttestedBy, value)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        value,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlow#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlow#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlow withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutablePhysicalFlow(
        this.logicalFlowId,
        this.specificationId,
        this.frequency,
        this.basisOffset,
        this.transport,
        this.specificationDefinitionId,
        this.criticality,
        this.id,
        this.isRemoved,
        this.description,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.lastAttestedAt,
        this.lastAttestedBy,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlow} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlow
        && equalTo((ImmutablePhysicalFlow) another);
  }

  private boolean equalTo(ImmutablePhysicalFlow another) {
    return logicalFlowId == another.logicalFlowId
        && specificationId == another.specificationId
        && frequency.equals(another.frequency)
        && basisOffset == another.basisOffset
        && transport.equals(another.transport)
        && Objects.equals(specificationDefinitionId, another.specificationDefinitionId)
        && criticality.equals(another.criticality)
        && Objects.equals(id, another.id)
        && isRemoved == another.isRemoved
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && Objects.equals(lastAttestedAt, another.lastAttestedAt)
        && Objects.equals(lastAttestedBy, another.lastAttestedBy)
        && Objects.equals(externalId, another.externalId);
  }

  /**
   * Computes a hash code from attributes: {@code logicalFlowId}, {@code specificationId}, {@code frequency}, {@code basisOffset}, {@code transport}, {@code specificationDefinitionId}, {@code criticality}, {@code id}, {@code isRemoved}, {@code description}, {@code provenance}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code lastAttestedAt}, {@code lastAttestedBy}, {@code externalId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(logicalFlowId);
    h += (h << 5) + Long.hashCode(specificationId);
    h += (h << 5) + frequency.hashCode();
    h += (h << 5) + basisOffset;
    h += (h << 5) + transport.hashCode();
    h += (h << 5) + Objects.hashCode(specificationDefinitionId);
    h += (h << 5) + criticality.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Boolean.hashCode(isRemoved);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + Objects.hashCode(lastAttestedAt);
    h += (h << 5) + Objects.hashCode(lastAttestedBy);
    h += (h << 5) + Objects.hashCode(externalId);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlow} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalFlow{");
    builder.append("logicalFlowId=").append(logicalFlowId);
    builder.append(", ");
    builder.append("specificationId=").append(specificationId);
    builder.append(", ");
    builder.append("frequency=").append(frequency);
    builder.append(", ");
    builder.append("basisOffset=").append(basisOffset);
    builder.append(", ");
    builder.append("transport=").append(transport);
    if (specificationDefinitionId != null) {
      builder.append(", ");
      builder.append("specificationDefinitionId=").append(specificationDefinitionId);
    }
    builder.append(", ");
    builder.append("criticality=").append(criticality);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("isRemoved=").append(isRemoved);
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
    if (lastAttestedAt != null) {
      builder.append(", ");
      builder.append("lastAttestedAt=").append(lastAttestedAt);
    }
    if (lastAttestedBy != null) {
      builder.append(", ");
      builder.append("lastAttestedBy=").append(lastAttestedBy);
    }
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PhysicalFlow {
    long logicalFlowId;
    boolean logicalFlowIdIsSet;
    long specificationId;
    boolean specificationIdIsSet;
    FrequencyKind frequency;
    int basisOffset;
    boolean basisOffsetIsSet;
    TransportKind transport;
    Optional<Long> specificationDefinitionId = Optional.empty();
    Criticality criticality;
    Optional<Long> id = Optional.empty();
    boolean isRemoved;
    boolean isRemovedIsSet;
    String description;
    String provenance;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    Optional<LocalDateTime> lastAttestedAt = Optional.empty();
    Optional<String> lastAttestedBy = Optional.empty();
    Optional<String> externalId = Optional.empty();
    @JsonProperty("logicalFlowId")
    public void setLogicalFlowId(long logicalFlowId) {
      this.logicalFlowId = logicalFlowId;
      this.logicalFlowIdIsSet = true;
    }
    @JsonProperty("specificationId")
    public void setSpecificationId(long specificationId) {
      this.specificationId = specificationId;
      this.specificationIdIsSet = true;
    }
    @JsonProperty("frequency")
    public void setFrequency(FrequencyKind frequency) {
      this.frequency = frequency;
    }
    @JsonProperty("basisOffset")
    public void setBasisOffset(int basisOffset) {
      this.basisOffset = basisOffset;
      this.basisOffsetIsSet = true;
    }
    @JsonProperty("transport")
    public void setTransport(TransportKind transport) {
      this.transport = transport;
    }
    @JsonProperty("specificationDefinitionId")
    public void setSpecificationDefinitionId(Optional<Long> specificationDefinitionId) {
      this.specificationDefinitionId = specificationDefinitionId;
    }
    @JsonProperty("criticality")
    public void setCriticality(Criticality criticality) {
      this.criticality = criticality;
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
    @JsonProperty("lastAttestedAt")
    public void setLastAttestedAt(Optional<LocalDateTime> lastAttestedAt) {
      this.lastAttestedAt = lastAttestedAt;
    }
    @JsonProperty("lastAttestedBy")
    public void setLastAttestedBy(Optional<String> lastAttestedBy) {
      this.lastAttestedBy = lastAttestedBy;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @Override
    public long logicalFlowId() { throw new UnsupportedOperationException(); }
    @Override
    public long specificationId() { throw new UnsupportedOperationException(); }
    @Override
    public FrequencyKind frequency() { throw new UnsupportedOperationException(); }
    @Override
    public int basisOffset() { throw new UnsupportedOperationException(); }
    @Override
    public TransportKind transport() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> specificationDefinitionId() { throw new UnsupportedOperationException(); }
    @Override
    public Criticality criticality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isRemoved() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
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
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlow fromJson(Json json) {
    ImmutablePhysicalFlow.Builder builder = ImmutablePhysicalFlow.builder();
    if (json.logicalFlowIdIsSet) {
      builder.logicalFlowId(json.logicalFlowId);
    }
    if (json.specificationIdIsSet) {
      builder.specificationId(json.specificationId);
    }
    if (json.frequency != null) {
      builder.frequency(json.frequency);
    }
    if (json.basisOffsetIsSet) {
      builder.basisOffset(json.basisOffset);
    }
    if (json.transport != null) {
      builder.transport(json.transport);
    }
    if (json.specificationDefinitionId != null) {
      builder.specificationDefinitionId(json.specificationDefinitionId);
    }
    if (json.criticality != null) {
      builder.criticality(json.criticality);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.isRemovedIsSet) {
      builder.isRemoved(json.isRemoved);
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
    if (json.lastAttestedAt != null) {
      builder.lastAttestedAt(json.lastAttestedAt);
    }
    if (json.lastAttestedBy != null) {
      builder.lastAttestedBy(json.lastAttestedBy);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalFlow} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlow instance
   */
  public static ImmutablePhysicalFlow copyOf(PhysicalFlow instance) {
    if (instance instanceof ImmutablePhysicalFlow) {
      return (ImmutablePhysicalFlow) instance;
    }
    return ImmutablePhysicalFlow.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlow ImmutablePhysicalFlow}.
   * @return A new ImmutablePhysicalFlow builder
   */
  public static ImmutablePhysicalFlow.Builder builder() {
    return new ImmutablePhysicalFlow.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlow ImmutablePhysicalFlow}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_LOGICAL_FLOW_ID = 0x1L;
    private static final long INIT_BIT_SPECIFICATION_ID = 0x2L;
    private static final long INIT_BIT_FREQUENCY = 0x4L;
    private static final long INIT_BIT_BASIS_OFFSET = 0x8L;
    private static final long INIT_BIT_TRANSPORT = 0x10L;
    private static final long INIT_BIT_CRITICALITY = 0x20L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x40L;
    private static final long OPT_BIT_IS_REMOVED = 0x1L;
    private long initBits = 0x7fL;
    private long optBits;

    private long logicalFlowId;
    private long specificationId;
    private FrequencyKind frequency;
    private int basisOffset;
    private TransportKind transport;
    private Long specificationDefinitionId;
    private Criticality criticality;
    private Long id;
    private boolean isRemoved;
    private String description;
    private String provenance;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private LocalDateTime lastAttestedAt;
    private String lastAttestedBy;
    private String externalId;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_flow.PhysicalFlow} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlow instance) {
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
      if (object instanceof LastAttestedProvider) {
        LastAttestedProvider instance = (LastAttestedProvider) object;
        Optional<String> lastAttestedByOptional = instance.lastAttestedBy();
        if (lastAttestedByOptional.isPresent()) {
          lastAttestedBy(lastAttestedByOptional);
        }
        Optional<LocalDateTime> lastAttestedAtOptional = instance.lastAttestedAt();
        if (lastAttestedAtOptional.isPresent()) {
          lastAttestedAt(lastAttestedAtOptional);
        }
      }
      if (object instanceof PhysicalFlow) {
        PhysicalFlow instance = (PhysicalFlow) object;
        specificationId(instance.specificationId());
        basisOffset(instance.basisOffset());
        logicalFlowId(instance.logicalFlowId());
        Optional<Long> specificationDefinitionIdOptional = instance.specificationDefinitionId();
        if (specificationDefinitionIdOptional.isPresent()) {
          specificationDefinitionId(specificationDefinitionIdOptional);
        }
        criticality(instance.criticality());
        transport(instance.transport());
        frequency(instance.frequency());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#logicalFlowId() logicalFlowId} attribute.
     * @param logicalFlowId The value for logicalFlowId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("logicalFlowId")
    public final Builder logicalFlowId(long logicalFlowId) {
      this.logicalFlowId = logicalFlowId;
      initBits &= ~INIT_BIT_LOGICAL_FLOW_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#specificationId() specificationId} attribute.
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
     * Initializes the value for the {@link PhysicalFlow#frequency() frequency} attribute.
     * @param frequency The value for frequency 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequency")
    public final Builder frequency(FrequencyKind frequency) {
      this.frequency = Objects.requireNonNull(frequency, "frequency");
      initBits &= ~INIT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#basisOffset() basisOffset} attribute.
     * @param basisOffset The value for basisOffset 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basisOffset")
    public final Builder basisOffset(int basisOffset) {
      this.basisOffset = basisOffset;
      initBits &= ~INIT_BIT_BASIS_OFFSET;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#transport() transport} attribute.
     * @param transport The value for transport 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transport")
    public final Builder transport(TransportKind transport) {
      this.transport = Objects.requireNonNull(transport, "transport");
      initBits &= ~INIT_BIT_TRANSPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#specificationDefinitionId() specificationDefinitionId} to specificationDefinitionId.
     * @param specificationDefinitionId The value for specificationDefinitionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder specificationDefinitionId(long specificationDefinitionId) {
      this.specificationDefinitionId = specificationDefinitionId;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#specificationDefinitionId() specificationDefinitionId} to specificationDefinitionId.
     * @param specificationDefinitionId The value for specificationDefinitionId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specificationDefinitionId")
    public final Builder specificationDefinitionId(Optional<Long> specificationDefinitionId) {
      this.specificationDefinitionId = specificationDefinitionId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#criticality() criticality} attribute.
     * @param criticality The value for criticality 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criticality")
    public final Builder criticality(Criticality criticality) {
      this.criticality = Objects.requireNonNull(criticality, "criticality");
      initBits &= ~INIT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#isRemoved() isRemoved} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalFlow#isRemoved() isRemoved}.</em>
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
     * Initializes the value for the {@link PhysicalFlow#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalFlow#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalFlow#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlow#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the optional value {@link PhysicalFlow#lastAttestedAt() lastAttestedAt} to lastAttestedAt.
     * @param lastAttestedAt The value for lastAttestedAt
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastAttestedAt(LocalDateTime lastAttestedAt) {
      this.lastAttestedAt = Objects.requireNonNull(lastAttestedAt, "lastAttestedAt");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#lastAttestedAt() lastAttestedAt} to lastAttestedAt.
     * @param lastAttestedAt The value for lastAttestedAt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastAttestedAt")
    public final Builder lastAttestedAt(Optional<? extends LocalDateTime> lastAttestedAt) {
      this.lastAttestedAt = lastAttestedAt.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#lastAttestedBy() lastAttestedBy} to lastAttestedBy.
     * @param lastAttestedBy The value for lastAttestedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastAttestedBy(String lastAttestedBy) {
      this.lastAttestedBy = Objects.requireNonNull(lastAttestedBy, "lastAttestedBy");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#lastAttestedBy() lastAttestedBy} to lastAttestedBy.
     * @param lastAttestedBy The value for lastAttestedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastAttestedBy")
    public final Builder lastAttestedBy(Optional<String> lastAttestedBy) {
      this.lastAttestedBy = lastAttestedBy.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlow#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlow ImmutablePhysicalFlow}.
     * @return An immutable instance of PhysicalFlow
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlow build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlow(this);
    }

    private boolean isRemovedIsSet() {
      return (optBits & OPT_BIT_IS_REMOVED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_LOGICAL_FLOW_ID) != 0) attributes.add("logicalFlowId");
      if ((initBits & INIT_BIT_SPECIFICATION_ID) != 0) attributes.add("specificationId");
      if ((initBits & INIT_BIT_FREQUENCY) != 0) attributes.add("frequency");
      if ((initBits & INIT_BIT_BASIS_OFFSET) != 0) attributes.add("basisOffset");
      if ((initBits & INIT_BIT_TRANSPORT) != 0) attributes.add("transport");
      if ((initBits & INIT_BIT_CRITICALITY) != 0) attributes.add("criticality");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build PhysicalFlow, some of required attributes are not set " + attributes;
    }
  }
}
