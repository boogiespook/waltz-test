package com.khartec.waltz.model.measurable_rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MeasurableRating}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasurableRating.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MeasurableRating"})
public final class ImmutableMeasurableRating
    extends MeasurableRating {
  private final EntityReference entityReference;
  private final long measurableId;
  private final char rating;
  private final @Nullable LocalDate plannedDate;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutableMeasurableRating(ImmutableMeasurableRating.Builder builder) {
    this.entityReference = builder.entityReference;
    this.measurableId = builder.measurableId;
    this.rating = builder.rating;
    this.plannedDate = builder.plannedDate;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.provenance = initShim.provenance();
    this.initShim = null;
  }

  private ImmutableMeasurableRating(
      EntityReference entityReference,
      long measurableId,
      char rating,
      @Nullable LocalDate plannedDate,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.entityReference = entityReference;
    this.measurableId = measurableId;
    this.rating = rating;
    this.plannedDate = plannedDate;
    this.description = description;
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
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableMeasurableRating.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.provenance = Objects.requireNonNull(ImmutableMeasurableRating.super.provenance(), "provenance");
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
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build MeasurableRating, attribute initializers form cycle" + attributes;
    }
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
  public @Nullable LocalDate plannedDate() {
    return plannedDate;
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
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableMeasurableRating(
        newValue,
        this.measurableId,
        this.rating,
        this.plannedDate,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#measurableId() measurableId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withMeasurableId(long value) {
    if (this.measurableId == value) return this;
    return new ImmutableMeasurableRating(
        this.entityReference,
        value,
        this.rating,
        this.plannedDate,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withRating(char value) {
    if (this.rating == value) return this;
    return new ImmutableMeasurableRating(
        this.entityReference,
        this.measurableId,
        value,
        this.plannedDate,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#plannedDate() plannedDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for plannedDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withPlannedDate(@Nullable LocalDate value) {
    if (this.plannedDate == value) return this;
    return new ImmutableMeasurableRating(
        this.entityReference,
        this.measurableId,
        this.rating,
        value,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMeasurableRating(
        this.entityReference,
        this.measurableId,
        this.rating,
        this.plannedDate,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableMeasurableRating(
        this.entityReference,
        this.measurableId,
        this.rating,
        this.plannedDate,
        this.description,
        newValue,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableMeasurableRating(
        this.entityReference,
        this.measurableId,
        this.rating,
        this.plannedDate,
        this.description,
        this.lastUpdatedAt,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRating#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRating withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableMeasurableRating(
        this.entityReference,
        this.measurableId,
        this.rating,
        this.plannedDate,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasurableRating} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasurableRating
        && equalTo((ImmutableMeasurableRating) another);
  }

  private boolean equalTo(ImmutableMeasurableRating another) {
    return entityReference.equals(another.entityReference)
        && measurableId == another.measurableId
        && rating == another.rating
        && Objects.equals(plannedDate, another.plannedDate)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code measurableId}, {@code rating}, {@code plannedDate}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Long.hashCode(measurableId);
    h += (h << 5) + Character.hashCode(rating);
    h += (h << 5) + Objects.hashCode(plannedDate);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MeasurableRating} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MeasurableRating{"
        + "entityReference=" + entityReference
        + ", measurableId=" + measurableId
        + ", rating=" + rating
        + ", plannedDate=" + plannedDate
        + ", description=" + description
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + ", provenance=" + provenance
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends MeasurableRating {
    EntityReference entityReference;
    long measurableId;
    boolean measurableIdIsSet;
    char rating;
    boolean ratingIsSet;
    LocalDate plannedDate;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String provenance;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("measurableId")
    public void setMeasurableId(long measurableId) {
      this.measurableId = measurableId;
      this.measurableIdIsSet = true;
    }
    @JsonProperty("rating")
    public void setRating(char rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("plannedDate")
    public void setPlannedDate(@Nullable LocalDate plannedDate) {
      this.plannedDate = plannedDate;
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
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public long measurableId() { throw new UnsupportedOperationException(); }
    @Override
    public char rating() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate plannedDate() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
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
  static ImmutableMeasurableRating fromJson(Json json) {
    ImmutableMeasurableRating.Builder builder = ImmutableMeasurableRating.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.measurableIdIsSet) {
      builder.measurableId(json.measurableId);
    }
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.plannedDate != null) {
      builder.plannedDate(json.plannedDate);
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
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasurableRating} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasurableRating instance
   */
  public static ImmutableMeasurableRating copyOf(MeasurableRating instance) {
    if (instance instanceof ImmutableMeasurableRating) {
      return (ImmutableMeasurableRating) instance;
    }
    return ImmutableMeasurableRating.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMeasurableRating ImmutableMeasurableRating}.
   * @return A new ImmutableMeasurableRating builder
   */
  public static ImmutableMeasurableRating.Builder builder() {
    return new ImmutableMeasurableRating.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMeasurableRating ImmutableMeasurableRating}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_MEASURABLE_ID = 0x2L;
    private static final long INIT_BIT_RATING = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private EntityReference entityReference;
    private long measurableId;
    private char rating;
    private LocalDate plannedDate;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_rating.MeasurableRating} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MeasurableRating instance) {
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
      if (object instanceof MeasurableRating) {
        MeasurableRating instance = (MeasurableRating) object;
        rating(instance.rating());
        measurableId(instance.measurableId());
        @Nullable LocalDate plannedDateValue = instance.plannedDate();
        if (plannedDateValue != null) {
          plannedDate(plannedDateValue);
        }
        entityReference(instance.entityReference());
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link MeasurableRating#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link MeasurableRating#measurableId() measurableId} attribute.
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
     * Initializes the value for the {@link MeasurableRating#rating() rating} attribute.
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
     * Initializes the value for the {@link MeasurableRating#plannedDate() plannedDate} attribute.
     * @param plannedDate The value for plannedDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("plannedDate")
    public final Builder plannedDate(@Nullable LocalDate plannedDate) {
      this.plannedDate = plannedDate;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRating#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRating#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableRating#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRating#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link MeasurableRating#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableRating#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableMeasurableRating ImmutableMeasurableRating}.
     * @return An immutable instance of MeasurableRating
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMeasurableRating build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMeasurableRating(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_MEASURABLE_ID) != 0) attributes.add("measurableId");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build MeasurableRating, some of required attributes are not set " + attributes;
    }
  }
}
