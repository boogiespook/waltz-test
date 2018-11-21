package com.khartec.waltz.model.change_initiative;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.OrganisationalUnitIdProvider;
import com.khartec.waltz.model.ParentIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.application.LifecyclePhase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ChangeInitiative}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChangeInitiative.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ChangeInitiative"})
public final class ImmutableChangeInitiative
    extends ChangeInitiative {
  private final ChangeInitiativeKind changeInitiativeKind;
  private final LifecyclePhase lifecyclePhase;
  private final Date lastUpdate;
  private final Date startDate;
  private final Date endDate;
  private final EntityKind kind;
  private final String externalId;
  private final Long parentId;
  private final String name;
  private final Long id;
  private final @Nullable String description;
  private final String provenance;
  private final Long organisationalUnitId;

  private ImmutableChangeInitiative(ImmutableChangeInitiative.Builder builder) {
    this.changeInitiativeKind = builder.changeInitiativeKind;
    this.lifecyclePhase = builder.lifecyclePhase;
    this.lastUpdate = builder.lastUpdate;
    this.startDate = builder.startDate;
    this.endDate = builder.endDate;
    this.externalId = builder.externalId;
    this.parentId = builder.parentId;
    this.name = builder.name;
    this.id = builder.id;
    this.description = builder.description;
    this.organisationalUnitId = builder.organisationalUnitId;
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.kind = initShim.kind();
    this.provenance = initShim.provenance();
    this.initShim = null;
  }

  private ImmutableChangeInitiative(
      ChangeInitiativeKind changeInitiativeKind,
      LifecyclePhase lifecyclePhase,
      Date lastUpdate,
      Date startDate,
      Date endDate,
      EntityKind kind,
      String externalId,
      Long parentId,
      String name,
      Long id,
      @Nullable String description,
      String provenance,
      Long organisationalUnitId) {
    this.changeInitiativeKind = changeInitiativeKind;
    this.lifecyclePhase = lifecyclePhase;
    this.lastUpdate = lastUpdate;
    this.startDate = startDate;
    this.endDate = endDate;
    this.kind = kind;
    this.externalId = externalId;
    this.parentId = parentId;
    this.name = name;
    this.id = id;
    this.description = description;
    this.provenance = provenance;
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
        this.kind = Objects.requireNonNull(ImmutableChangeInitiative.super.kind(), "kind");
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
        this.provenance = Objects.requireNonNull(ImmutableChangeInitiative.super.provenance(), "provenance");
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
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build ChangeInitiative, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code changeInitiativeKind} attribute
   */
  @JsonProperty("changeInitiativeKind")
  @Override
  public ChangeInitiativeKind changeInitiativeKind() {
    return changeInitiativeKind;
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
   * @return The value of the {@code lastUpdate} attribute
   */
  @JsonProperty("lastUpdate")
  @Override
  public Optional<Date> lastUpdate() {
    return Optional.ofNullable(lastUpdate);
  }

  /**
   * @return The value of the {@code startDate} attribute
   */
  @JsonProperty("startDate")
  @Override
  public Date startDate() {
    return startDate;
  }

  /**
   * @return The value of the {@code endDate} attribute
   */
  @JsonProperty("endDate")
  @Override
  public Date endDate() {
    return endDate;
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
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
  }

  /**
   * @return The value of the {@code parentId} attribute
   */
  @JsonProperty("parentId")
  @Override
  public Optional<Long> parentId() {
    return Optional.ofNullable(parentId);
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
   * @return The value of the {@code organisationalUnitId} attribute
   */
  @JsonProperty("organisationalUnitId")
  @Override
  public Long organisationalUnitId() {
    return organisationalUnitId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#changeInitiativeKind() changeInitiativeKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for changeInitiativeKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withChangeInitiativeKind(ChangeInitiativeKind value) {
    if (this.changeInitiativeKind == value) return this;
    ChangeInitiativeKind newValue = Objects.requireNonNull(value, "changeInitiativeKind");
    return new ImmutableChangeInitiative(
        newValue,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#lifecyclePhase() lifecyclePhase} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lifecyclePhase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withLifecyclePhase(LifecyclePhase value) {
    if (this.lifecyclePhase == value) return this;
    LifecyclePhase newValue = Objects.requireNonNull(value, "lifecyclePhase");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        newValue,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChangeInitiative#lastUpdate() lastUpdate} attribute.
   * @param value The value for lastUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withLastUpdate(Date value) {
    Date newValue = Objects.requireNonNull(value, "lastUpdate");
    if (this.lastUpdate == newValue) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        newValue,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChangeInitiative#lastUpdate() lastUpdate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withLastUpdate(Optional<? extends Date> optional) {
    Date value = optional.orElse(null);
    if (this.lastUpdate == value) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        value,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#startDate() startDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for startDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withStartDate(Date value) {
    if (this.startDate == value) return this;
    Date newValue = Objects.requireNonNull(value, "startDate");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        newValue,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#endDate() endDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for endDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withEndDate(Date value) {
    if (this.endDate == value) return this;
    Date newValue = Objects.requireNonNull(value, "endDate");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        newValue,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        newValue,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChangeInitiative#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        newValue,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChangeInitiative#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        value,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChangeInitiative#parentId() parentId} attribute.
   * @param value The value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withParentId(long value) {
    Long newValue = value;
    if (Objects.equals(this.parentId, newValue)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        newValue,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChangeInitiative#parentId() parentId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withParentId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.parentId, value)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        value,
        this.name,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        newValue,
        this.id,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChangeInitiative#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        newValue,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChangeInitiative#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeInitiative withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        value,
        this.description,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        value,
        this.provenance,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        newValue,
        this.organisationalUnitId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeInitiative#organisationalUnitId() organisationalUnitId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organisationalUnitId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeInitiative withOrganisationalUnitId(Long value) {
    if (this.organisationalUnitId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "organisationalUnitId");
    return new ImmutableChangeInitiative(
        this.changeInitiativeKind,
        this.lifecyclePhase,
        this.lastUpdate,
        this.startDate,
        this.endDate,
        this.kind,
        this.externalId,
        this.parentId,
        this.name,
        this.id,
        this.description,
        this.provenance,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChangeInitiative} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChangeInitiative
        && equalTo((ImmutableChangeInitiative) another);
  }

  private boolean equalTo(ImmutableChangeInitiative another) {
    return changeInitiativeKind.equals(another.changeInitiativeKind)
        && lifecyclePhase.equals(another.lifecyclePhase)
        && Objects.equals(lastUpdate, another.lastUpdate)
        && startDate.equals(another.startDate)
        && endDate.equals(another.endDate)
        && kind.equals(another.kind)
        && Objects.equals(externalId, another.externalId)
        && Objects.equals(parentId, another.parentId)
        && name.equals(another.name)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance)
        && organisationalUnitId.equals(another.organisationalUnitId);
  }

  /**
   * Computes a hash code from attributes: {@code changeInitiativeKind}, {@code lifecyclePhase}, {@code lastUpdate}, {@code startDate}, {@code endDate}, {@code kind}, {@code externalId}, {@code parentId}, {@code name}, {@code id}, {@code description}, {@code provenance}, {@code organisationalUnitId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + changeInitiativeKind.hashCode();
    h += (h << 5) + lifecyclePhase.hashCode();
    h += (h << 5) + Objects.hashCode(lastUpdate);
    h += (h << 5) + startDate.hashCode();
    h += (h << 5) + endDate.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + Objects.hashCode(parentId);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + organisationalUnitId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ChangeInitiative} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ChangeInitiative{");
    builder.append("changeInitiativeKind=").append(changeInitiativeKind);
    builder.append(", ");
    builder.append("lifecyclePhase=").append(lifecyclePhase);
    if (lastUpdate != null) {
      builder.append(", ");
      builder.append("lastUpdate=").append(lastUpdate);
    }
    builder.append(", ");
    builder.append("startDate=").append(startDate);
    builder.append(", ");
    builder.append("endDate=").append(endDate);
    builder.append(", ");
    builder.append("kind=").append(kind);
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    if (parentId != null) {
      builder.append(", ");
      builder.append("parentId=").append(parentId);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("provenance=").append(provenance);
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
  static final class Json extends ChangeInitiative {
    ChangeInitiativeKind changeInitiativeKind;
    LifecyclePhase lifecyclePhase;
    Optional<Date> lastUpdate = Optional.empty();
    Date startDate;
    Date endDate;
    EntityKind kind;
    Optional<String> externalId = Optional.empty();
    Optional<Long> parentId = Optional.empty();
    String name;
    Optional<Long> id = Optional.empty();
    String description;
    String provenance;
    Long organisationalUnitId;
    @JsonProperty("changeInitiativeKind")
    public void setChangeInitiativeKind(ChangeInitiativeKind changeInitiativeKind) {
      this.changeInitiativeKind = changeInitiativeKind;
    }
    @JsonProperty("lifecyclePhase")
    public void setLifecyclePhase(LifecyclePhase lifecyclePhase) {
      this.lifecyclePhase = lifecyclePhase;
    }
    @JsonProperty("lastUpdate")
    public void setLastUpdate(Optional<Date> lastUpdate) {
      this.lastUpdate = lastUpdate;
    }
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
      this.startDate = startDate;
    }
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
      this.endDate = endDate;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("parentId")
    public void setParentId(Optional<Long> parentId) {
      this.parentId = parentId;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("organisationalUnitId")
    public void setOrganisationalUnitId(Long organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
    }
    @Override
    public ChangeInitiativeKind changeInitiativeKind() { throw new UnsupportedOperationException(); }
    @Override
    public LifecyclePhase lifecyclePhase() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastUpdate() { throw new UnsupportedOperationException(); }
    @Override
    public Date startDate() { throw new UnsupportedOperationException(); }
    @Override
    public Date endDate() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> parentId() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
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
  static ImmutableChangeInitiative fromJson(Json json) {
    ImmutableChangeInitiative.Builder builder = ImmutableChangeInitiative.builder();
    if (json.changeInitiativeKind != null) {
      builder.changeInitiativeKind(json.changeInitiativeKind);
    }
    if (json.lifecyclePhase != null) {
      builder.lifecyclePhase(json.lifecyclePhase);
    }
    if (json.lastUpdate != null) {
      builder.lastUpdate(json.lastUpdate);
    }
    if (json.startDate != null) {
      builder.startDate(json.startDate);
    }
    if (json.endDate != null) {
      builder.endDate(json.endDate);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.parentId != null) {
      builder.parentId(json.parentId);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.organisationalUnitId != null) {
      builder.organisationalUnitId(json.organisationalUnitId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChangeInitiative} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChangeInitiative instance
   */
  public static ImmutableChangeInitiative copyOf(ChangeInitiative instance) {
    if (instance instanceof ImmutableChangeInitiative) {
      return (ImmutableChangeInitiative) instance;
    }
    return ImmutableChangeInitiative.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableChangeInitiative ImmutableChangeInitiative}.
   * @return A new ImmutableChangeInitiative builder
   */
  public static ImmutableChangeInitiative.Builder builder() {
    return new ImmutableChangeInitiative.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableChangeInitiative ImmutableChangeInitiative}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CHANGE_INITIATIVE_KIND = 0x1L;
    private static final long INIT_BIT_LIFECYCLE_PHASE = 0x2L;
    private static final long INIT_BIT_START_DATE = 0x4L;
    private static final long INIT_BIT_END_DATE = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private static final long INIT_BIT_ORGANISATIONAL_UNIT_ID = 0x20L;
    private long initBits = 0x3fL;

    private ChangeInitiativeKind changeInitiativeKind;
    private LifecyclePhase lifecyclePhase;
    private Date lastUpdate;
    private Date startDate;
    private Date endDate;
    private EntityKind kind;
    private String externalId;
    private Long parentId;
    private String name;
    private Long id;
    private String description;
    private String provenance;
    private Long organisationalUnitId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.change_initiative.ChangeInitiative} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ChangeInitiative instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ParentIdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ParentIdProvider instance) {
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
      if (object instanceof ChangeInitiative) {
        ChangeInitiative instance = (ChangeInitiative) object;
        endDate(instance.endDate());
        lifecyclePhase(instance.lifecyclePhase());
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
        changeInitiativeKind(instance.changeInitiativeKind());
        startDate(instance.startDate());
        Optional<Date> lastUpdateOptional = instance.lastUpdate();
        if (lastUpdateOptional.isPresent()) {
          lastUpdate(lastUpdateOptional);
        }
      }
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof ParentIdProvider) {
        ParentIdProvider instance = (ParentIdProvider) object;
        Optional<Long> parentIdOptional = instance.parentId();
        if (parentIdOptional.isPresent()) {
          parentId(parentIdOptional);
        }
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
        provenance(instance.provenance());
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
     * Initializes the value for the {@link ChangeInitiative#changeInitiativeKind() changeInitiativeKind} attribute.
     * @param changeInitiativeKind The value for changeInitiativeKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("changeInitiativeKind")
    public final Builder changeInitiativeKind(ChangeInitiativeKind changeInitiativeKind) {
      this.changeInitiativeKind = Objects.requireNonNull(changeInitiativeKind, "changeInitiativeKind");
      initBits &= ~INIT_BIT_CHANGE_INITIATIVE_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#lifecyclePhase() lifecyclePhase} attribute.
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
     * Initializes the optional value {@link ChangeInitiative#lastUpdate() lastUpdate} to lastUpdate.
     * @param lastUpdate The value for lastUpdate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastUpdate(Date lastUpdate) {
      this.lastUpdate = Objects.requireNonNull(lastUpdate, "lastUpdate");
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeInitiative#lastUpdate() lastUpdate} to lastUpdate.
     * @param lastUpdate The value for lastUpdate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdate")
    public final Builder lastUpdate(Optional<? extends Date> lastUpdate) {
      this.lastUpdate = lastUpdate.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#startDate() startDate} attribute.
     * @param startDate The value for startDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("startDate")
    public final Builder startDate(Date startDate) {
      this.startDate = Objects.requireNonNull(startDate, "startDate");
      initBits &= ~INIT_BIT_START_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#endDate() endDate} attribute.
     * @param endDate The value for endDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endDate")
    public final Builder endDate(Date endDate) {
      this.endDate = Objects.requireNonNull(endDate, "endDate");
      initBits &= ~INIT_BIT_END_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ChangeInitiative#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeInitiative#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeInitiative#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeInitiative#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentId(long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeInitiative#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentId")
    public final Builder parentId(Optional<Long> parentId) {
      this.parentId = parentId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#name() name} attribute.
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
     * Initializes the optional value {@link ChangeInitiative#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeInitiative#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ChangeInitiative#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeInitiative#organisationalUnitId() organisationalUnitId} attribute.
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
     * Builds a new {@link ImmutableChangeInitiative ImmutableChangeInitiative}.
     * @return An immutable instance of ChangeInitiative
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableChangeInitiative build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableChangeInitiative(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CHANGE_INITIATIVE_KIND) != 0) attributes.add("changeInitiativeKind");
      if ((initBits & INIT_BIT_LIFECYCLE_PHASE) != 0) attributes.add("lifecyclePhase");
      if ((initBits & INIT_BIT_START_DATE) != 0) attributes.add("startDate");
      if ((initBits & INIT_BIT_END_DATE) != 0) attributes.add("endDate");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ORGANISATIONAL_UNIT_ID) != 0) attributes.add("organisationalUnitId");
      return "Cannot build ChangeInitiative, some of required attributes are not set " + attributes;
    }
  }
}
