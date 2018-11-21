package com.khartec.waltz.model.measurable_relationship;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MeasurableRelationship}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasurableRelationship.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MeasurableRelationship"})
public final class ImmutableMeasurableRelationship
    extends MeasurableRelationship {
  private final long measurableA;
  private final long measurableB;
  private final MeasurableRelationshipKind relationshipKind;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final @Nullable String description;
  private final String provenance;

  private ImmutableMeasurableRelationship(ImmutableMeasurableRelationship.Builder builder) {
    this.measurableA = builder.measurableA;
    this.measurableB = builder.measurableB;
    this.relationshipKind = builder.relationshipKind;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.description = builder.description;
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

  private ImmutableMeasurableRelationship(
      long measurableA,
      long measurableB,
      MeasurableRelationshipKind relationshipKind,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      @Nullable String description,
      String provenance) {
    this.measurableA = measurableA;
    this.measurableB = measurableB;
    this.relationshipKind = relationshipKind;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.description = description;
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableMeasurableRelationship.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.provenance = Objects.requireNonNull(ImmutableMeasurableRelationship.super.provenance(), "provenance");
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
      return "Cannot build MeasurableRelationship, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code measurableA} attribute
   */
  @JsonProperty("measurableA")
  @Override
  public long measurableA() {
    return measurableA;
  }

  /**
   * @return The value of the {@code measurableB} attribute
   */
  @JsonProperty("measurableB")
  @Override
  public long measurableB() {
    return measurableB;
  }

  /**
   * @return The value of the {@code relationshipKind} attribute
   */
  @JsonProperty("relationshipKind")
  @Override
  public MeasurableRelationshipKind relationshipKind() {
    return relationshipKind;
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
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#measurableA() measurableA} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableA
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withMeasurableA(long value) {
    if (this.measurableA == value) return this;
    return new ImmutableMeasurableRelationship(
        value,
        this.measurableB,
        this.relationshipKind,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#measurableB() measurableB} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableB
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withMeasurableB(long value) {
    if (this.measurableB == value) return this;
    return new ImmutableMeasurableRelationship(
        this.measurableA,
        value,
        this.relationshipKind,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#relationshipKind() relationshipKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationshipKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withRelationshipKind(MeasurableRelationshipKind value) {
    if (this.relationshipKind == value) return this;
    MeasurableRelationshipKind newValue = Objects.requireNonNull(value, "relationshipKind");
    return new ImmutableMeasurableRelationship(
        this.measurableA,
        this.measurableB,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableMeasurableRelationship(
        this.measurableA,
        this.measurableB,
        this.relationshipKind,
        newValue,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableMeasurableRelationship(
        this.measurableA,
        this.measurableB,
        this.relationshipKind,
        this.lastUpdatedAt,
        newValue,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMeasurableRelationship(
        this.measurableA,
        this.measurableB,
        this.relationshipKind,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        value,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRelationship#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRelationship withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableMeasurableRelationship(
        this.measurableA,
        this.measurableB,
        this.relationshipKind,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasurableRelationship} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasurableRelationship
        && equalTo((ImmutableMeasurableRelationship) another);
  }

  private boolean equalTo(ImmutableMeasurableRelationship another) {
    return measurableA == another.measurableA
        && measurableB == another.measurableB
        && relationshipKind.equals(another.relationshipKind)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code measurableA}, {@code measurableB}, {@code relationshipKind}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code description}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(measurableA);
    h += (h << 5) + Long.hashCode(measurableB);
    h += (h << 5) + relationshipKind.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MeasurableRelationship} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MeasurableRelationship{"
        + "measurableA=" + measurableA
        + ", measurableB=" + measurableB
        + ", relationshipKind=" + relationshipKind
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + ", description=" + description
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
  static final class Json extends MeasurableRelationship {
    long measurableA;
    boolean measurableAIsSet;
    long measurableB;
    boolean measurableBIsSet;
    MeasurableRelationshipKind relationshipKind;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String description;
    String provenance;
    @JsonProperty("measurableA")
    public void setMeasurableA(long measurableA) {
      this.measurableA = measurableA;
      this.measurableAIsSet = true;
    }
    @JsonProperty("measurableB")
    public void setMeasurableB(long measurableB) {
      this.measurableB = measurableB;
      this.measurableBIsSet = true;
    }
    @JsonProperty("relationshipKind")
    public void setRelationshipKind(MeasurableRelationshipKind relationshipKind) {
      this.relationshipKind = relationshipKind;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
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
    public long measurableA() { throw new UnsupportedOperationException(); }
    @Override
    public long measurableB() { throw new UnsupportedOperationException(); }
    @Override
    public MeasurableRelationshipKind relationshipKind() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
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
  static ImmutableMeasurableRelationship fromJson(Json json) {
    ImmutableMeasurableRelationship.Builder builder = ImmutableMeasurableRelationship.builder();
    if (json.measurableAIsSet) {
      builder.measurableA(json.measurableA);
    }
    if (json.measurableBIsSet) {
      builder.measurableB(json.measurableB);
    }
    if (json.relationshipKind != null) {
      builder.relationshipKind(json.relationshipKind);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
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
   * Creates an immutable copy of a {@link MeasurableRelationship} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasurableRelationship instance
   */
  public static ImmutableMeasurableRelationship copyOf(MeasurableRelationship instance) {
    if (instance instanceof ImmutableMeasurableRelationship) {
      return (ImmutableMeasurableRelationship) instance;
    }
    return ImmutableMeasurableRelationship.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMeasurableRelationship ImmutableMeasurableRelationship}.
   * @return A new ImmutableMeasurableRelationship builder
   */
  public static ImmutableMeasurableRelationship.Builder builder() {
    return new ImmutableMeasurableRelationship.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMeasurableRelationship ImmutableMeasurableRelationship}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_MEASURABLE_A = 0x1L;
    private static final long INIT_BIT_MEASURABLE_B = 0x2L;
    private static final long INIT_BIT_RELATIONSHIP_KIND = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private long measurableA;
    private long measurableB;
    private MeasurableRelationshipKind relationshipKind;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String description;
    private String provenance;

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_relationship.MeasurableRelationship} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MeasurableRelationship instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
      if (object instanceof MeasurableRelationship) {
        MeasurableRelationship instance = (MeasurableRelationship) object;
        measurableB(instance.measurableB());
        measurableA(instance.measurableA());
        relationshipKind(instance.relationshipKind());
      }
    }

    /**
     * Initializes the value for the {@link MeasurableRelationship#measurableA() measurableA} attribute.
     * @param measurableA The value for measurableA 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableA")
    public final Builder measurableA(long measurableA) {
      this.measurableA = measurableA;
      initBits &= ~INIT_BIT_MEASURABLE_A;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRelationship#measurableB() measurableB} attribute.
     * @param measurableB The value for measurableB 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableB")
    public final Builder measurableB(long measurableB) {
      this.measurableB = measurableB;
      initBits &= ~INIT_BIT_MEASURABLE_B;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRelationship#relationshipKind() relationshipKind} attribute.
     * @param relationshipKind The value for relationshipKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationshipKind")
    public final Builder relationshipKind(MeasurableRelationshipKind relationshipKind) {
      this.relationshipKind = Objects.requireNonNull(relationshipKind, "relationshipKind");
      initBits &= ~INIT_BIT_RELATIONSHIP_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRelationship#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableRelationship#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRelationship#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link MeasurableRelationship#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRelationship#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableRelationship#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableMeasurableRelationship ImmutableMeasurableRelationship}.
     * @return An immutable instance of MeasurableRelationship
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMeasurableRelationship build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMeasurableRelationship(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_MEASURABLE_A) != 0) attributes.add("measurableA");
      if ((initBits & INIT_BIT_MEASURABLE_B) != 0) attributes.add("measurableB");
      if ((initBits & INIT_BIT_RELATIONSHIP_KIND) != 0) attributes.add("relationshipKind");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build MeasurableRelationship, some of required attributes are not set " + attributes;
    }
  }
}
