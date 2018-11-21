package com.khartec.waltz.model.attestation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdSelectionOptions;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
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
 * Immutable implementation of {@link AttestationRunCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttestationRunCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AttestationRunCreateCommand"})
public final class ImmutableAttestationRunCreateCommand
    extends AttestationRunCreateCommand {
  private final EntityKind targetEntityKind;
  private final IdSelectionOptions selectionOptions;
  private final Set<Long> involvementKindIds;
  private final EntityKind attestedEntityKind;
  private final Long attestedEntityId;
  private final LocalDate issuedOn;
  private final LocalDate dueDate;
  private final String name;
  private final @Nullable String description;

  private ImmutableAttestationRunCreateCommand(ImmutableAttestationRunCreateCommand.Builder builder) {
    this.targetEntityKind = builder.targetEntityKind;
    this.selectionOptions = builder.selectionOptions;
    this.involvementKindIds = createUnmodifiableSet(builder.involvementKindIds);
    this.attestedEntityKind = builder.attestedEntityKind;
    this.attestedEntityId = builder.attestedEntityId;
    this.dueDate = builder.dueDate;
    this.name = builder.name;
    this.description = builder.description;
    this.issuedOn = builder.issuedOn != null
        ? builder.issuedOn
        : Objects.requireNonNull(super.issuedOn(), "issuedOn");
  }

  private ImmutableAttestationRunCreateCommand(
      EntityKind targetEntityKind,
      IdSelectionOptions selectionOptions,
      Set<Long> involvementKindIds,
      EntityKind attestedEntityKind,
      Long attestedEntityId,
      LocalDate issuedOn,
      LocalDate dueDate,
      String name,
      @Nullable String description) {
    this.targetEntityKind = targetEntityKind;
    this.selectionOptions = selectionOptions;
    this.involvementKindIds = involvementKindIds;
    this.attestedEntityKind = attestedEntityKind;
    this.attestedEntityId = attestedEntityId;
    this.issuedOn = issuedOn;
    this.dueDate = dueDate;
    this.name = name;
    this.description = description;
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
   * @return The value of the {@code attestedEntityId} attribute
   */
  @JsonProperty("attestedEntityId")
  @Override
  public Optional<Long> attestedEntityId() {
    return Optional.ofNullable(attestedEntityId);
  }

  /**
   * @return The value of the {@code issuedOn} attribute
   */
  @JsonProperty("issuedOn")
  @Override
  public LocalDate issuedOn() {
    return issuedOn;
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
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#targetEntityKind() targetEntityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for targetEntityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withTargetEntityKind(EntityKind value) {
    if (this.targetEntityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "targetEntityKind");
    return new ImmutableAttestationRunCreateCommand(
        newValue,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#selectionOptions() selectionOptions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for selectionOptions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withSelectionOptions(IdSelectionOptions value) {
    if (this.selectionOptions == value) return this;
    IdSelectionOptions newValue = Objects.requireNonNull(value, "selectionOptions");
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        newValue,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AttestationRunCreateCommand#involvementKindIds() involvementKindIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withInvolvementKindIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    Set<Long> newValue = createUnmodifiableSet(wrappedList);
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        newValue,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AttestationRunCreateCommand#involvementKindIds() involvementKindIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of involvementKindIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withInvolvementKindIds(Iterable<Long> elements) {
    if (this.involvementKindIds == elements) return this;
    Set<Long> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        newValue,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#attestedEntityKind() attestedEntityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attestedEntityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withAttestedEntityKind(EntityKind value) {
    if (this.attestedEntityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "attestedEntityKind");
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        newValue,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationRunCreateCommand#attestedEntityId() attestedEntityId} attribute.
   * @param value The value for attestedEntityId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withAttestedEntityId(long value) {
    Long newValue = value;
    if (Objects.equals(this.attestedEntityId, newValue)) return this;
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        newValue,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationRunCreateCommand#attestedEntityId() attestedEntityId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestedEntityId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withAttestedEntityId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.attestedEntityId, value)) return this;
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        value,
        this.issuedOn,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#issuedOn() issuedOn} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for issuedOn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withIssuedOn(LocalDate value) {
    if (this.issuedOn == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "issuedOn");
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityId,
        newValue,
        this.dueDate,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#dueDate() dueDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dueDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withDueDate(LocalDate value) {
    if (this.dueDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "dueDate");
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunCreateCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunCreateCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAttestationRunCreateCommand(
        this.targetEntityKind,
        this.selectionOptions,
        this.involvementKindIds,
        this.attestedEntityKind,
        this.attestedEntityId,
        this.issuedOn,
        this.dueDate,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttestationRunCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttestationRunCreateCommand
        && equalTo((ImmutableAttestationRunCreateCommand) another);
  }

  private boolean equalTo(ImmutableAttestationRunCreateCommand another) {
    return targetEntityKind.equals(another.targetEntityKind)
        && selectionOptions.equals(another.selectionOptions)
        && involvementKindIds.equals(another.involvementKindIds)
        && attestedEntityKind.equals(another.attestedEntityKind)
        && Objects.equals(attestedEntityId, another.attestedEntityId)
        && issuedOn.equals(another.issuedOn)
        && dueDate.equals(another.dueDate)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code targetEntityKind}, {@code selectionOptions}, {@code involvementKindIds}, {@code attestedEntityKind}, {@code attestedEntityId}, {@code issuedOn}, {@code dueDate}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + targetEntityKind.hashCode();
    h += (h << 5) + selectionOptions.hashCode();
    h += (h << 5) + involvementKindIds.hashCode();
    h += (h << 5) + attestedEntityKind.hashCode();
    h += (h << 5) + Objects.hashCode(attestedEntityId);
    h += (h << 5) + issuedOn.hashCode();
    h += (h << 5) + dueDate.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code AttestationRunCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AttestationRunCreateCommand{");
    builder.append("targetEntityKind=").append(targetEntityKind);
    builder.append(", ");
    builder.append("selectionOptions=").append(selectionOptions);
    builder.append(", ");
    builder.append("involvementKindIds=").append(involvementKindIds);
    builder.append(", ");
    builder.append("attestedEntityKind=").append(attestedEntityKind);
    if (attestedEntityId != null) {
      builder.append(", ");
      builder.append("attestedEntityId=").append(attestedEntityId);
    }
    builder.append(", ");
    builder.append("issuedOn=").append(issuedOn);
    builder.append(", ");
    builder.append("dueDate=").append(dueDate);
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
  static final class Json extends AttestationRunCreateCommand {
    EntityKind targetEntityKind;
    IdSelectionOptions selectionOptions;
    Set<Long> involvementKindIds = Collections.emptySet();
    EntityKind attestedEntityKind;
    Optional<Long> attestedEntityId = Optional.empty();
    LocalDate issuedOn;
    LocalDate dueDate;
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
    @JsonProperty("attestedEntityId")
    public void setAttestedEntityId(Optional<Long> attestedEntityId) {
      this.attestedEntityId = attestedEntityId;
    }
    @JsonProperty("issuedOn")
    public void setIssuedOn(LocalDate issuedOn) {
      this.issuedOn = issuedOn;
    }
    @JsonProperty("dueDate")
    public void setDueDate(LocalDate dueDate) {
      this.dueDate = dueDate;
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
    public Optional<Long> attestedEntityId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate issuedOn() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate dueDate() { throw new UnsupportedOperationException(); }
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
  static ImmutableAttestationRunCreateCommand fromJson(Json json) {
    ImmutableAttestationRunCreateCommand.Builder builder = ImmutableAttestationRunCreateCommand.builder();
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
    if (json.attestedEntityId != null) {
      builder.attestedEntityId(json.attestedEntityId);
    }
    if (json.issuedOn != null) {
      builder.issuedOn(json.issuedOn);
    }
    if (json.dueDate != null) {
      builder.dueDate(json.dueDate);
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
   * Creates an immutable copy of a {@link AttestationRunCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AttestationRunCreateCommand instance
   */
  public static ImmutableAttestationRunCreateCommand copyOf(AttestationRunCreateCommand instance) {
    if (instance instanceof ImmutableAttestationRunCreateCommand) {
      return (ImmutableAttestationRunCreateCommand) instance;
    }
    return ImmutableAttestationRunCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttestationRunCreateCommand ImmutableAttestationRunCreateCommand}.
   * @return A new ImmutableAttestationRunCreateCommand builder
   */
  public static ImmutableAttestationRunCreateCommand.Builder builder() {
    return new ImmutableAttestationRunCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttestationRunCreateCommand ImmutableAttestationRunCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TARGET_ENTITY_KIND = 0x1L;
    private static final long INIT_BIT_SELECTION_OPTIONS = 0x2L;
    private static final long INIT_BIT_ATTESTED_ENTITY_KIND = 0x4L;
    private static final long INIT_BIT_DUE_DATE = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private long initBits = 0x1fL;

    private EntityKind targetEntityKind;
    private IdSelectionOptions selectionOptions;
    private List<Long> involvementKindIds = new ArrayList<Long>();
    private EntityKind attestedEntityKind;
    private Long attestedEntityId;
    private LocalDate issuedOn;
    private LocalDate dueDate;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.attestation.AttestationRunCreateCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AttestationRunCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof AttestationRunCreateCommand) {
        AttestationRunCreateCommand instance = (AttestationRunCreateCommand) object;
        attestedEntityKind(instance.attestedEntityKind());
        Optional<Long> attestedEntityIdOptional = instance.attestedEntityId();
        if (attestedEntityIdOptional.isPresent()) {
          attestedEntityId(attestedEntityIdOptional);
        }
        dueDate(instance.dueDate());
        selectionOptions(instance.selectionOptions());
        addAllInvolvementKindIds(instance.involvementKindIds());
        targetEntityKind(instance.targetEntityKind());
        issuedOn(instance.issuedOn());
      }
    }

    /**
     * Initializes the value for the {@link AttestationRunCreateCommand#targetEntityKind() targetEntityKind} attribute.
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
     * Initializes the value for the {@link AttestationRunCreateCommand#selectionOptions() selectionOptions} attribute.
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
     * Adds one element to {@link AttestationRunCreateCommand#involvementKindIds() involvementKindIds} set.
     * @param element A involvementKindIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInvolvementKindIds(long element) {
      this.involvementKindIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AttestationRunCreateCommand#involvementKindIds() involvementKindIds} set.
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
     * Sets or replaces all elements for {@link AttestationRunCreateCommand#involvementKindIds() involvementKindIds} set.
     * @param elements An iterable of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("involvementKindIds")
    public final Builder involvementKindIds(Iterable<Long> elements) {
      this.involvementKindIds.clear();
      return addAllInvolvementKindIds(elements);
    }

    /**
     * Adds elements to {@link AttestationRunCreateCommand#involvementKindIds() involvementKindIds} set.
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
     * Initializes the value for the {@link AttestationRunCreateCommand#attestedEntityKind() attestedEntityKind} attribute.
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
     * Initializes the optional value {@link AttestationRunCreateCommand#attestedEntityId() attestedEntityId} to attestedEntityId.
     * @param attestedEntityId The value for attestedEntityId
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestedEntityId(long attestedEntityId) {
      this.attestedEntityId = attestedEntityId;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationRunCreateCommand#attestedEntityId() attestedEntityId} to attestedEntityId.
     * @param attestedEntityId The value for attestedEntityId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestedEntityId")
    public final Builder attestedEntityId(Optional<Long> attestedEntityId) {
      this.attestedEntityId = attestedEntityId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRunCreateCommand#issuedOn() issuedOn} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AttestationRunCreateCommand#issuedOn() issuedOn}.</em>
     * @param issuedOn The value for issuedOn 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuedOn")
    public final Builder issuedOn(LocalDate issuedOn) {
      this.issuedOn = Objects.requireNonNull(issuedOn, "issuedOn");
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRunCreateCommand#dueDate() dueDate} attribute.
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
     * Initializes the value for the {@link AttestationRunCreateCommand#name() name} attribute.
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
     * Initializes the value for the {@link AttestationRunCreateCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttestationRunCreateCommand ImmutableAttestationRunCreateCommand}.
     * @return An immutable instance of AttestationRunCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttestationRunCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttestationRunCreateCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TARGET_ENTITY_KIND) != 0) attributes.add("targetEntityKind");
      if ((initBits & INIT_BIT_SELECTION_OPTIONS) != 0) attributes.add("selectionOptions");
      if ((initBits & INIT_BIT_ATTESTED_ENTITY_KIND) != 0) attributes.add("attestedEntityKind");
      if ((initBits & INIT_BIT_DUE_DATE) != 0) attributes.add("dueDate");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build AttestationRunCreateCommand, some of required attributes are not set " + attributes;
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
