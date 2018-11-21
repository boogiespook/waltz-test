package com.khartec.waltz.model.measurable_rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdate;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SaveMeasurableRatingCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSaveMeasurableRatingCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SaveMeasurableRatingCommand"})
public final class ImmutableSaveMeasurableRatingCommand
    extends SaveMeasurableRatingCommand {
  private final char rating;
  private final LocalDate plannedDate;
  private final EntityReference entityReference;
  private final long measurableId;
  private final LastUpdate lastUpdate;
  private final @Nullable String description;
  private final String provenance;

  private ImmutableSaveMeasurableRatingCommand(ImmutableSaveMeasurableRatingCommand.Builder builder) {
    this.rating = builder.rating;
    this.plannedDate = builder.plannedDate;
    this.entityReference = builder.entityReference;
    this.measurableId = builder.measurableId;
    this.lastUpdate = builder.lastUpdate;
    this.description = builder.description;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableSaveMeasurableRatingCommand(
      char rating,
      LocalDate plannedDate,
      EntityReference entityReference,
      long measurableId,
      LastUpdate lastUpdate,
      @Nullable String description,
      String provenance) {
    this.rating = rating;
    this.plannedDate = plannedDate;
    this.entityReference = entityReference;
    this.measurableId = measurableId;
    this.lastUpdate = lastUpdate;
    this.description = description;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public char rating() {
    return rating;
  }

  /**
   * @return The value of the {@code plannedDate} attribute
   */
  @JsonProperty("plannedDate")
  @Override
  public Optional<LocalDate> plannedDate() {
    return Optional.ofNullable(plannedDate);
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code measurableId} attribute
   */
  @JsonProperty("measurableId")
  @Override
  public long measurableId() {
    return measurableId;
  }

  /**
   * @return The value of the {@code lastUpdate} attribute
   */
  @JsonProperty("lastUpdate")
  @Override
  public LastUpdate lastUpdate() {
    return lastUpdate;
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
    return provenance;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveMeasurableRatingCommand#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withRating(char value) {
    if (this.rating == value) return this;
    return new ImmutableSaveMeasurableRatingCommand(
        value,
        this.plannedDate,
        this.entityReference,
        this.measurableId,
        this.lastUpdate,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SaveMeasurableRatingCommand#plannedDate() plannedDate} attribute.
   * @param value The value for plannedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withPlannedDate(LocalDate value) {
    LocalDate newValue = Objects.requireNonNull(value, "plannedDate");
    if (this.plannedDate == newValue) return this;
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        newValue,
        this.entityReference,
        this.measurableId,
        this.lastUpdate,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SaveMeasurableRatingCommand#plannedDate() plannedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for plannedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withPlannedDate(Optional<? extends LocalDate> optional) {
    LocalDate value = optional.orElse(null);
    if (this.plannedDate == value) return this;
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        value,
        this.entityReference,
        this.measurableId,
        this.lastUpdate,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveMeasurableRatingCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        this.plannedDate,
        newValue,
        this.measurableId,
        this.lastUpdate,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveMeasurableRatingCommand#measurableId() measurableId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withMeasurableId(long value) {
    if (this.measurableId == value) return this;
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        this.plannedDate,
        this.entityReference,
        value,
        this.lastUpdate,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveMeasurableRatingCommand#lastUpdate() lastUpdate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withLastUpdate(LastUpdate value) {
    if (this.lastUpdate == value) return this;
    LastUpdate newValue = Objects.requireNonNull(value, "lastUpdate");
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        this.plannedDate,
        this.entityReference,
        this.measurableId,
        newValue,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveMeasurableRatingCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        this.plannedDate,
        this.entityReference,
        this.measurableId,
        this.lastUpdate,
        value,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveMeasurableRatingCommand#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveMeasurableRatingCommand withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableSaveMeasurableRatingCommand(
        this.rating,
        this.plannedDate,
        this.entityReference,
        this.measurableId,
        this.lastUpdate,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSaveMeasurableRatingCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSaveMeasurableRatingCommand
        && equalTo((ImmutableSaveMeasurableRatingCommand) another);
  }

  private boolean equalTo(ImmutableSaveMeasurableRatingCommand another) {
    return rating == another.rating
        && Objects.equals(plannedDate, another.plannedDate)
        && entityReference.equals(another.entityReference)
        && measurableId == another.measurableId
        && lastUpdate.equals(another.lastUpdate)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code rating}, {@code plannedDate}, {@code entityReference}, {@code measurableId}, {@code lastUpdate}, {@code description}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Character.hashCode(rating);
    h += (h << 5) + Objects.hashCode(plannedDate);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Long.hashCode(measurableId);
    h += (h << 5) + lastUpdate.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SaveMeasurableRatingCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SaveMeasurableRatingCommand{");
    builder.append("rating=").append(rating);
    if (plannedDate != null) {
      builder.append(", ");
      builder.append("plannedDate=").append(plannedDate);
    }
    builder.append(", ");
    builder.append("entityReference=").append(entityReference);
    builder.append(", ");
    builder.append("measurableId=").append(measurableId);
    builder.append(", ");
    builder.append("lastUpdate=").append(lastUpdate);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
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
  static final class Json extends SaveMeasurableRatingCommand {
    char rating;
    boolean ratingIsSet;
    Optional<LocalDate> plannedDate = Optional.empty();
    EntityReference entityReference;
    long measurableId;
    boolean measurableIdIsSet;
    LastUpdate lastUpdate;
    String description;
    String provenance;
    @JsonProperty("rating")
    public void setRating(char rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("plannedDate")
    public void setPlannedDate(Optional<LocalDate> plannedDate) {
      this.plannedDate = plannedDate;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("measurableId")
    public void setMeasurableId(long measurableId) {
      this.measurableId = measurableId;
      this.measurableIdIsSet = true;
    }
    @JsonProperty("lastUpdate")
    public void setLastUpdate(LastUpdate lastUpdate) {
      this.lastUpdate = lastUpdate;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public char rating() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDate> plannedDate() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public long measurableId() { throw new UnsupportedOperationException(); }
    @Override
    public LastUpdate lastUpdate() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
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
  static ImmutableSaveMeasurableRatingCommand fromJson(Json json) {
    ImmutableSaveMeasurableRatingCommand.Builder builder = ImmutableSaveMeasurableRatingCommand.builder();
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.plannedDate != null) {
      builder.plannedDate(json.plannedDate);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.measurableIdIsSet) {
      builder.measurableId(json.measurableId);
    }
    if (json.lastUpdate != null) {
      builder.lastUpdate(json.lastUpdate);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SaveMeasurableRatingCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SaveMeasurableRatingCommand instance
   */
  public static ImmutableSaveMeasurableRatingCommand copyOf(SaveMeasurableRatingCommand instance) {
    if (instance instanceof ImmutableSaveMeasurableRatingCommand) {
      return (ImmutableSaveMeasurableRatingCommand) instance;
    }
    return ImmutableSaveMeasurableRatingCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSaveMeasurableRatingCommand ImmutableSaveMeasurableRatingCommand}.
   * @return A new ImmutableSaveMeasurableRatingCommand builder
   */
  public static ImmutableSaveMeasurableRatingCommand.Builder builder() {
    return new ImmutableSaveMeasurableRatingCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSaveMeasurableRatingCommand ImmutableSaveMeasurableRatingCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_MEASURABLE_ID = 0x4L;
    private static final long INIT_BIT_LAST_UPDATE = 0x8L;
    private long initBits = 0xfL;

    private char rating;
    private LocalDate plannedDate;
    private EntityReference entityReference;
    private long measurableId;
    private LastUpdate lastUpdate;
    private String description;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_rating.MeasurableRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MeasurableRatingCommand instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_rating.SaveMeasurableRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SaveMeasurableRatingCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof MeasurableRatingCommand) {
        MeasurableRatingCommand instance = (MeasurableRatingCommand) object;
        measurableId(instance.measurableId());
        entityReference(instance.entityReference());
        lastUpdate(instance.lastUpdate());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof SaveMeasurableRatingCommand) {
        SaveMeasurableRatingCommand instance = (SaveMeasurableRatingCommand) object;
        rating(instance.rating());
        Optional<LocalDate> plannedDateOptional = instance.plannedDate();
        if (plannedDateOptional.isPresent()) {
          plannedDate(plannedDateOptional);
        }
      }
    }

    /**
     * Initializes the value for the {@link SaveMeasurableRatingCommand#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(char rating) {
      this.rating = rating;
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the optional value {@link SaveMeasurableRatingCommand#plannedDate() plannedDate} to plannedDate.
     * @param plannedDate The value for plannedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder plannedDate(LocalDate plannedDate) {
      this.plannedDate = Objects.requireNonNull(plannedDate, "plannedDate");
      return this;
    }

    /**
     * Initializes the optional value {@link SaveMeasurableRatingCommand#plannedDate() plannedDate} to plannedDate.
     * @param plannedDate The value for plannedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("plannedDate")
    public final Builder plannedDate(Optional<? extends LocalDate> plannedDate) {
      this.plannedDate = plannedDate.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SaveMeasurableRatingCommand#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link SaveMeasurableRatingCommand#measurableId() measurableId} attribute.
     * @param measurableId The value for measurableId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableId")
    public final Builder measurableId(long measurableId) {
      this.measurableId = measurableId;
      initBits &= ~INIT_BIT_MEASURABLE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SaveMeasurableRatingCommand#lastUpdate() lastUpdate} attribute.
     * @param lastUpdate The value for lastUpdate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdate")
    public final Builder lastUpdate(LastUpdate lastUpdate) {
      this.lastUpdate = Objects.requireNonNull(lastUpdate, "lastUpdate");
      initBits &= ~INIT_BIT_LAST_UPDATE;
      return this;
    }

    /**
     * Initializes the value for the {@link SaveMeasurableRatingCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link SaveMeasurableRatingCommand#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SaveMeasurableRatingCommand#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSaveMeasurableRatingCommand ImmutableSaveMeasurableRatingCommand}.
     * @return An immutable instance of SaveMeasurableRatingCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSaveMeasurableRatingCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSaveMeasurableRatingCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_MEASURABLE_ID) != 0) attributes.add("measurableId");
      if ((initBits & INIT_BIT_LAST_UPDATE) != 0) attributes.add("lastUpdate");
      return "Cannot build SaveMeasurableRatingCommand, some of required attributes are not set " + attributes;
    }
  }
}
