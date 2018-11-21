package com.khartec.waltz.model.attestation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IdSelectionOptions;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.WaltzEntity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AttestationRun}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttestationRun.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AttestationRun"})
public final class ImmutableAttestationRun extends AttestationRun {
  private final EntityKind targetEntityKind;
  private final IdSelectionOptions selectionOptions;
  private final Set<Long> involvementKindIds;
  private final EntityKind attestedEntityKind;
  private final EntityReference attestedEntityRef;
  private final String issuedBy;
  private final LocalDate issuedOn;
  private final LocalDate dueDate;
  private final EntityReference entityReference;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableAttestationRun(ImmutableAttestationRun.Builder builder) {
    this.targetEntityKind = builder.targetEntityKind;
    this.selectionOptions = builder.selectionOptions;
    this.involvementKindIds = createUnmodifiableSet(builder.involvementKindIds);
    this.attestedEntityKind = builder.attestedEntityKind;
    this.attestedEntityRef = builder.attestedEntityRef;
    this.issuedBy = builder.issuedBy;
    this.dueDate = builder.dueDate;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    if (builder.issuedOn != null) {
      initShim.issuedOn(builder.issuedOn);
    }
    if (builder.entityReference != null) {
      initShim.entityReference(builder.entityReference);
    }
    this.issuedOn = initShim.issuedOn();
    this.entityReference = initShim.entityReference();
    this.initShim = null;
  }

  private ImmutableAttestationRun(
      EntityKind targetEntityKind,
      IdSelectionOptions selectionOptions,
      Set<Long> involvementKindIds,
      EntityKind attestedEntityKind,
      EntityReference attestedEntityRef,
      String issuedBy,
      LocalDate issuedOn,
      LocalDate dueDate,
      EntityReference entityReference,
      Long id,
      String name,
      @Nullable String description) {
    this.targetEntityKind = targetEntityKind;
    this.selectionOptions = selectionOptions;
    this.involvementKindIds = involvementKindIds;
    this.attestedEntityKind = attestedEntityKind;
    this.attestedEntityRef = attestedEntityRef;
    this.issuedBy = issuedBy;
    this.issuedOn = issuedOn;
    this.dueDate = dueDate;
    this.entityReference = entityReference;
    this.id = id;
    this.name = name;
    this.description = description;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private LocalDate issuedOn;
    private int issuedOnBuildStage;

    LocalDate issuedOn() {
      if (issuedOnBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (issuedOnBuildStage == STAGE_UNINITIALIZED) {
        issuedOnBuildStage = STAGE_INITIALIZING;
        this.issuedOn = Objects.requireNonNull(ImmutableAttestationRun.super.issuedOn(), "issuedOn");
        issuedOnBuildStage = STAGE_INITIALIZED;
      }
      return this.issuedOn;
    }

    void issuedOn(LocalDate issuedOn) {
      this.issuedOn = issuedOn;
      issuedOnBuildStage = STAGE_INITIALIZED;
    }
    private EntityReference entityReference;
    private int entityReferenceBuildStage;

    EntityReference entityReference() {
      if (entityReferenceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (entityReferenceBuildStage == STAGE_UNINITIALIZED) {
        entityReferenceBuildStage = STAGE_INITIALIZING;
        this.entityReference = Objects.requireNonNull(ImmutableAttestationRun.super.entityReference(), "entityReference");
        entityReferenceBuildStage = STAGE_INITIALIZED;
      }
      return this.entityReference;
    }

    void entityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
      entityReferenceBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (issuedOnBuildStage == STAGE_INITIALIZING) attributes.add("issuedOn");
      if (entityReferenceBuildStage == STAGE_INITIALIZING) attributes.add("entityReference");
      return "Cannot build AttestationRun, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code targetEntityKind} attribute
   */
  @JsonProperty("targetEntityKind")
  @Override
  public EntityKind targetEntityKind() {
    return targetEntityKind;
  }

  /**
   * @return The value of the {@code selectionOptions} attribute
   */
  @JsonProperty("selectionOptions")
  @Override
  public IdSelectionOptions selectionOptions() {
    return selectionOptions;
  }

  /**
   * @return The value of the {@code involvementKindIds} attribute
   */
  @JsonProperty("involvementKindIds")
  @Override
  public Set<Long> involvementKindIds() {
    return involvementKindIds;
  }

  /**
   * @return The value of the {@code attestedEntityKind} attribute
   */
  @JsonProperty("attestedEntityKind")
  @Override
  public EntityKind attestedEntityKind() {
    return attestedEntityKind;
  }

  /**
   * @return The value of the {@code attestedEntityRef} attribute
   */
  @JsonProperty("attestedEntityRef")
  @Override
  public Optional<EntityReference> attestedEntityRef() {
    return Optional.ofNullable(attestedEntityRef);
  }

  /**
   * @return The value of the {@code issuedBy} attribute
   */
  @JsonProperty("issuedBy")
  @Override
  public String issuedBy() {
    return issuedBy;
  }

  /**
   * @return The value of the {@code issuedOn} attribute
   */
  @JsonProperty("issuedOn")
  @Override
  public LocalDate issuedOn() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.issuedOn()
        : this.issuedOn;
  }

  /**
   * @return The value of the {@code dueDate} attribute
   */
  @JsonProperty("dueDate")
  @Override
  public LocalDate dueDate() {
    return dueDate;
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.entityReference()
        : this.entityReference;
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
   * Copy the current immutable object by setting a value for the {@link AttestationRun#targetEntityKind() targetEntityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for targetEntityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withTargetEntityKind(EntityKind value) {
    if (this.targetEntityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "targetEntityKind");
    return new ImmutableAttestationRun(
        newValue,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#selectionOptions() selectionOptions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for selectionOptions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withSelectionOptions(IdSelectionOptions value) {
    if (this.selectionOptions == value) return this;
    IdSelectionOptions newValue = Objects.requireNonNull(value, "selectionOptions");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        newValue,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AttestationRun#involvementKindIds() involvementKindIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRun withInvolvementKindIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    Set<Long> newValue = createUnmodifiableSet(wrappedList);
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        newValue,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AttestationRun#involvementKindIds() involvementKindIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of involvementKindIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRun withInvolvementKindIds(Iterable<Long> elements) {
    if (this.involvementKindIds == elements) return this;
    Set<Long> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        newValue,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#attestedEntityKind() attestedEntityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attestedEntityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withAttestedEntityKind(EntityKind value) {
    if (this.attestedEntityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "attestedEntityKind");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        newValue,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationRun#attestedEntityRef() attestedEntityRef} attribute.
   * @param value The value for attestedEntityRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRun withAttestedEntityRef(EntityReference value) {
    EntityReference newValue = Objects.requireNonNull(value, "attestedEntityRef");
    if (this.attestedEntityRef == newValue) return this;
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        newValue,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationRun#attestedEntityRef() attestedEntityRef} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestedEntityRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRun withAttestedEntityRef(Optional<? extends EntityReference> optional) {
    EntityReference value = optional.orElse(null);
    if (this.attestedEntityRef == value) return this;
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        value,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#issuedBy() issuedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for issuedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withIssuedBy(String value) {
    if (this.issuedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "issuedBy");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        newValue,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#issuedOn() issuedOn} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for issuedOn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withIssuedOn(LocalDate value) {
    if (this.issuedOn == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "issuedOn");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        newValue,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#dueDate() dueDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dueDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withDueDate(LocalDate value) {
    if (this.dueDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "dueDate");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        newValue,
        this.entityReference,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        newValue,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationRun#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRun withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationRun#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRun withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRun#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRun withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAttestationRun(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityRef,
        this.issuedBy,
        this.issuedOn,
        this.dueDate,
        this.entityReference,
        this.id,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttestationRun} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttestationRun
        && equalTo((ImmutableAttestationRun) another);
  }

  private boolean equalTo(ImmutableAttestationRun another) {
    return targetEntityKind.equals(another.targetEntityKind)
        && selectionOptions.equals(another.selectionOptions)
        && involvementKindIds.equals(another.involvementKindIds)
        && attestedEntityKind.equals(another.attestedEntityKind)
        && Objects.equals(attestedEntityRef, another.attestedEntityRef)
        && issuedBy.equals(another.issuedBy)
        && issuedOn.equals(another.issuedOn)
        && dueDate.equals(another.dueDate)
        && entityReference.equals(another.entityReference)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code targetEntityKind}, {@code selectionOptions}, {@code involvementKindIds}, {@code attestedEntityKind}, {@code attestedEntityRef}, {@code issuedBy}, {@code issuedOn}, {@code dueDate}, {@code entityReference}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + targetEntityKind.hashCode();
    h += (h << 5) + selectionOptions.hashCode();
    h += (h << 5) + involvementKindIds.hashCode();
    h += (h << 5) + attestedEntityKind.hashCode();
    h += (h << 5) + Objects.hashCode(attestedEntityRef);
    h += (h << 5) + issuedBy.hashCode();
    h += (h << 5) + issuedOn.hashCode();
    h += (h << 5) + dueDate.hashCode();
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code AttestationRun} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AttestationRun{");
    builder.append("targetEntityKind=").append(targetEntityKind);
    builder.append(", ");
    builder.append("selectionOptions=").append(selectionOptions);
    builder.append(", ");
    builder.append("involvementKindIds=").append(involvementKindIds);
    builder.append(", ");
    builder.append("attestedEntityKind=").append(attestedEntityKind);
    if (attestedEntityRef != null) {
      builder.append(", ");
      builder.append("attestedEntityRef=").append(attestedEntityRef);
    }
    builder.append(", ");
    builder.append("issuedBy=").append(issuedBy);
    builder.append(", ");
    builder.append("issuedOn=").append(issuedOn);
    builder.append(", ");
    builder.append("dueDate=").append(dueDate);
    builder.append(", ");
    builder.append("entityReference=").append(entityReference);
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
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AttestationRun {
    EntityKind targetEntityKind;
    IdSelectionOptions selectionOptions;
    Set<Long> involvementKindIds = Collections.emptySet();
    EntityKind attestedEntityKind;
    Optional<EntityReference> attestedEntityRef = Optional.empty();
    String issuedBy;
    LocalDate issuedOn;
    LocalDate dueDate;
    EntityReference entityReference;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("targetEntityKind")
    public void setTargetEntityKind(EntityKind targetEntityKind) {
      this.targetEntityKind = targetEntityKind;
    }
    @JsonProperty("selectionOptions")
    public void setSelectionOptions(IdSelectionOptions selectionOptions) {
      this.selectionOptions = selectionOptions;
    }
    @JsonProperty("involvementKindIds")
    public void setInvolvementKindIds(Set<Long> involvementKindIds) {
      this.involvementKindIds = involvementKindIds;
    }
    @JsonProperty("attestedEntityKind")
    public void setAttestedEntityKind(EntityKind attestedEntityKind) {
      this.attestedEntityKind = attestedEntityKind;
    }
    @JsonProperty("attestedEntityRef")
    public void setAttestedEntityRef(Optional<EntityReference> attestedEntityRef) {
      this.attestedEntityRef = attestedEntityRef;
    }
    @JsonProperty("issuedBy")
    public void setIssuedBy(String issuedBy) {
      this.issuedBy = issuedBy;
    }
    @JsonProperty("issuedOn")
    public void setIssuedOn(LocalDate issuedOn) {
      this.issuedOn = issuedOn;
    }
    @JsonProperty("dueDate")
    public void setDueDate(LocalDate dueDate) {
      this.dueDate = dueDate;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
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
    @Override
    public EntityKind targetEntityKind() { throw new UnsupportedOperationException(); }
    @Override
    public IdSelectionOptions selectionOptions() { throw new UnsupportedOperationException(); }
    @Override
    public Set<Long> involvementKindIds() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind attestedEntityKind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EntityReference> attestedEntityRef() { throw new UnsupportedOperationException(); }
    @Override
    public String issuedBy() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate issuedOn() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate dueDate() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAttestationRun fromJson(Json json) {
    ImmutableAttestationRun.Builder builder = ImmutableAttestationRun.builder();
    if (json.targetEntityKind != null) {
      builder.targetEntityKind(json.targetEntityKind);
    }
    if (json.selectionOptions != null) {
      builder.selectionOptions(json.selectionOptions);
    }
    if (json.involvementKindIds != null) {
      builder.addAllInvolvementKindIds(json.involvementKindIds);
    }
    if (json.attestedEntityKind != null) {
      builder.attestedEntityKind(json.attestedEntityKind);
    }
    if (json.attestedEntityRef != null) {
      builder.attestedEntityRef(json.attestedEntityRef);
    }
    if (json.issuedBy != null) {
      builder.issuedBy(json.issuedBy);
    }
    if (json.issuedOn != null) {
      builder.issuedOn(json.issuedOn);
    }
    if (json.dueDate != null) {
      builder.dueDate(json.dueDate);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AttestationRun} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AttestationRun instance
   */
  public static ImmutableAttestationRun copyOf(AttestationRun instance) {
    if (instance instanceof ImmutableAttestationRun) {
      return (ImmutableAttestationRun) instance;
    }
    return ImmutableAttestationRun.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttestationRun ImmutableAttestationRun}.
   * @return A new ImmutableAttestationRun builder
   */
  public static ImmutableAttestationRun.Builder builder() {
    return new ImmutableAttestationRun.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttestationRun ImmutableAttestationRun}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TARGET_ENTITY_KIND = 0x1L;
    private static final long INIT_BIT_SELECTION_OPTIONS = 0x2L;
    private static final long INIT_BIT_ATTESTED_ENTITY_KIND = 0x4L;
    private static final long INIT_BIT_ISSUED_BY = 0x8L;
    private static final long INIT_BIT_DUE_DATE = 0x10L;
    private static final long INIT_BIT_NAME = 0x20L;
    private long initBits = 0x3fL;

    private EntityKind targetEntityKind;
    private IdSelectionOptions selectionOptions;
    private List<Long> involvementKindIds = new ArrayList<Long>();
    private EntityKind attestedEntityKind;
    private EntityReference attestedEntityRef;
    private String issuedBy;
    private LocalDate issuedOn;
    private LocalDate dueDate;
    private EntityReference entityReference;
    private Long id;
    private String name;
    private String description;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.WaltzEntity} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WaltzEntity instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.attestation.AttestationRun} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AttestationRun instance) {
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
      if (object instanceof WaltzEntity) {
        WaltzEntity instance = (WaltzEntity) object;
        if ((bits & 0x1L) == 0) {
          entityReference(instance.entityReference());
          bits |= 0x1L;
        }
      }
      if (object instanceof AttestationRun) {
        AttestationRun instance = (AttestationRun) object;
        attestedEntityKind(instance.attestedEntityKind());
        if ((bits & 0x1L) == 0) {
          entityReference(instance.entityReference());
          bits |= 0x1L;
        }
        issuedBy(instance.issuedBy());
        dueDate(instance.dueDate());
        selectionOptions(instance.selectionOptions());
        Optional<EntityReference> attestedEntityRefOptional = instance.attestedEntityRef();
        if (attestedEntityRefOptional.isPresent()) {
          attestedEntityRef(attestedEntityRefOptional);
        }
        addAllInvolvementKindIds(instance.involvementKindIds());
        targetEntityKind(instance.targetEntityKind());
        issuedOn(instance.issuedOn());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link AttestationRun#targetEntityKind() targetEntityKind} attribute.
     * @param targetEntityKind The value for targetEntityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetEntityKind")
    public final Builder targetEntityKind(EntityKind targetEntityKind) {
      this.targetEntityKind = Objects.requireNonNull(targetEntityKind, "targetEntityKind");
      initBits &= ~INIT_BIT_TARGET_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#selectionOptions() selectionOptions} attribute.
     * @param selectionOptions The value for selectionOptions 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("selectionOptions")
    public final Builder selectionOptions(IdSelectionOptions selectionOptions) {
      this.selectionOptions = Objects.requireNonNull(selectionOptions, "selectionOptions");
      initBits &= ~INIT_BIT_SELECTION_OPTIONS;
      return this;
    }

    /**
     * Adds one element to {@link AttestationRun#involvementKindIds() involvementKindIds} set.
     * @param element A involvementKindIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInvolvementKindIds(long element) {
      this.involvementKindIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AttestationRun#involvementKindIds() involvementKindIds} set.
     * @param elements An array of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInvolvementKindIds(long... elements) {
      for (long element : elements) {
        this.involvementKindIds.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AttestationRun#involvementKindIds() involvementKindIds} set.
     * @param elements An iterable of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("involvementKindIds")
    public final Builder involvementKindIds(Iterable<Long> elements) {
      this.involvementKindIds.clear();
      return addAllInvolvementKindIds(elements);
    }

    /**
     * Adds elements to {@link AttestationRun#involvementKindIds() involvementKindIds} set.
     * @param elements An iterable of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInvolvementKindIds(Iterable<Long> elements) {
      for (long element : elements) {
        this.involvementKindIds.add(Objects.requireNonNull(element, "involvementKindIds element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#attestedEntityKind() attestedEntityKind} attribute.
     * @param attestedEntityKind The value for attestedEntityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestedEntityKind")
    public final Builder attestedEntityKind(EntityKind attestedEntityKind) {
      this.attestedEntityKind = Objects.requireNonNull(attestedEntityKind, "attestedEntityKind");
      initBits &= ~INIT_BIT_ATTESTED_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationRun#attestedEntityRef() attestedEntityRef} to attestedEntityRef.
     * @param attestedEntityRef The value for attestedEntityRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestedEntityRef(EntityReference attestedEntityRef) {
      this.attestedEntityRef = Objects.requireNonNull(attestedEntityRef, "attestedEntityRef");
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationRun#attestedEntityRef() attestedEntityRef} to attestedEntityRef.
     * @param attestedEntityRef The value for attestedEntityRef
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestedEntityRef")
    public final Builder attestedEntityRef(Optional<? extends EntityReference> attestedEntityRef) {
      this.attestedEntityRef = attestedEntityRef.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#issuedBy() issuedBy} attribute.
     * @param issuedBy The value for issuedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuedBy")
    public final Builder issuedBy(String issuedBy) {
      this.issuedBy = Objects.requireNonNull(issuedBy, "issuedBy");
      initBits &= ~INIT_BIT_ISSUED_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#issuedOn() issuedOn} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AttestationRun#issuedOn() issuedOn}.</em>
     * @param issuedOn The value for issuedOn 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuedOn")
    public final Builder issuedOn(LocalDate issuedOn) {
      this.issuedOn = Objects.requireNonNull(issuedOn, "issuedOn");
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#dueDate() dueDate} attribute.
     * @param dueDate The value for dueDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDate")
    public final Builder dueDate(LocalDate dueDate) {
      this.dueDate = Objects.requireNonNull(dueDate, "dueDate");
      initBits &= ~INIT_BIT_DUE_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#entityReference() entityReference} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AttestationRun#entityReference() entityReference}.</em>
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationRun#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationRun#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRun#name() name} attribute.
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
     * Initializes the value for the {@link AttestationRun#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttestationRun ImmutableAttestationRun}.
     * @return An immutable instance of AttestationRun
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttestationRun build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttestationRun(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TARGET_ENTITY_KIND) != 0) attributes.add("targetEntityKind");
      if ((initBits & INIT_BIT_SELECTION_OPTIONS) != 0) attributes.add("selectionOptions");
      if ((initBits & INIT_BIT_ATTESTED_ENTITY_KIND) != 0) attributes.add("attestedEntityKind");
      if ((initBits & INIT_BIT_ISSUED_BY) != 0) attributes.add("issuedBy");
      if ((initBits & INIT_BIT_DUE_DATE) != 0) attributes.add("dueDate");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build AttestationRun, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  /** Unmodifiable set constructed from list to avoid rehashing. */
  private static <T> Set<T> createUnmodifiableSet(List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default:
      Set<T> set = new LinkedHashSet<T>(list.size());
      set.addAll(list);
      return Collections.unmodifiableSet(set);
    }
  }
}
