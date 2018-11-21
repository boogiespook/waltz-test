package com.khartec.waltz.model.performance_metric.sample;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MetricSample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMetricSample.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MetricSample"})
public final class ImmutableMetricSample
    extends MetricSample {
  private final long metricId;
  private final LocalDate collectionDate;
  private final LocalDate effectiveDate;
  private final SampleType sampleType;
  private final String createdBy;
  private final String provenance;

  private ImmutableMetricSample(
      long metricId,
      LocalDate collectionDate,
      LocalDate effectiveDate,
      SampleType sampleType,
      String createdBy,
      String provenance) {
    this.metricId = metricId;
    this.collectionDate = collectionDate;
    this.effectiveDate = effectiveDate;
    this.sampleType = sampleType;
    this.createdBy = createdBy;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code metricId} attribute
   */
  @JsonProperty("metricId")
  @Override
  public long metricId() {
    return metricId;
  }

  /**
   * @return The value of the {@code collectionDate} attribute
   */
  @JsonProperty("collectionDate")
  @Override
  public LocalDate collectionDate() {
    return collectionDate;
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
   * @return The value of the {@code sampleType} attribute
   */
  @JsonProperty("sampleType")
  @Override
  public SampleType sampleType() {
    return sampleType;
  }

  /**
   * @return The value of the {@code createdBy} attribute
   */
  @JsonProperty("createdBy")
  @Override
  public String createdBy() {
    return createdBy;
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
   * Copy the current immutable object by setting a value for the {@link MetricSample#metricId() metricId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for metricId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricSample withMetricId(long value) {
    if (this.metricId == value) return this;
    return new ImmutableMetricSample(
        value,
        this.collectionDate,
        this.effectiveDate,
        this.sampleType,
        this.createdBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricSample#collectionDate() collectionDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for collectionDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricSample withCollectionDate(LocalDate value) {
    if (this.collectionDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "collectionDate");
    return new ImmutableMetricSample(this.metricId, newValue, this.effectiveDate, this.sampleType, this.createdBy, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricSample#effectiveDate() effectiveDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for effectiveDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricSample withEffectiveDate(LocalDate value) {
    if (this.effectiveDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "effectiveDate");
    return new ImmutableMetricSample(this.metricId, this.collectionDate, newValue, this.sampleType, this.createdBy, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricSample#sampleType() sampleType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sampleType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricSample withSampleType(SampleType value) {
    if (this.sampleType == value) return this;
    SampleType newValue = Objects.requireNonNull(value, "sampleType");
    return new ImmutableMetricSample(
        this.metricId,
        this.collectionDate,
        this.effectiveDate,
        newValue,
        this.createdBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricSample#createdBy() createdBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricSample withCreatedBy(String value) {
    if (this.createdBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "createdBy");
    return new ImmutableMetricSample(
        this.metricId,
        this.collectionDate,
        this.effectiveDate,
        this.sampleType,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricSample#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricSample withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableMetricSample(
        this.metricId,
        this.collectionDate,
        this.effectiveDate,
        this.sampleType,
        this.createdBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMetricSample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMetricSample
        && equalTo((ImmutableMetricSample) another);
  }

  private boolean equalTo(ImmutableMetricSample another) {
    return metricId == another.metricId
        && collectionDate.equals(another.collectionDate)
        && effectiveDate.equals(another.effectiveDate)
        && sampleType.equals(another.sampleType)
        && createdBy.equals(another.createdBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code metricId}, {@code collectionDate}, {@code effectiveDate}, {@code sampleType}, {@code createdBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(metricId);
    h += (h << 5) + collectionDate.hashCode();
    h += (h << 5) + effectiveDate.hashCode();
    h += (h << 5) + sampleType.hashCode();
    h += (h << 5) + createdBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MetricSample} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MetricSample{"
        + "metricId=" + metricId
        + ", collectionDate=" + collectionDate
        + ", effectiveDate=" + effectiveDate
        + ", sampleType=" + sampleType
        + ", createdBy=" + createdBy
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
  static final class Json extends MetricSample {
    long metricId;
    boolean metricIdIsSet;
    LocalDate collectionDate;
    LocalDate effectiveDate;
    SampleType sampleType;
    String createdBy;
    String provenance;
    @JsonProperty("metricId")
    public void setMetricId(long metricId) {
      this.metricId = metricId;
      this.metricIdIsSet = true;
    }
    @JsonProperty("collectionDate")
    public void setCollectionDate(LocalDate collectionDate) {
      this.collectionDate = collectionDate;
    }
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(LocalDate effectiveDate) {
      this.effectiveDate = effectiveDate;
    }
    @JsonProperty("sampleType")
    public void setSampleType(SampleType sampleType) {
      this.sampleType = sampleType;
    }
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long metricId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate collectionDate() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate effectiveDate() { throw new UnsupportedOperationException(); }
    @Override
    public SampleType sampleType() { throw new UnsupportedOperationException(); }
    @Override
    public String createdBy() { throw new UnsupportedOperationException(); }
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
  static ImmutableMetricSample fromJson(Json json) {
    ImmutableMetricSample.Builder builder = ImmutableMetricSample.builder();
    if (json.metricIdIsSet) {
      builder.metricId(json.metricId);
    }
    if (json.collectionDate != null) {
      builder.collectionDate(json.collectionDate);
    }
    if (json.effectiveDate != null) {
      builder.effectiveDate(json.effectiveDate);
    }
    if (json.sampleType != null) {
      builder.sampleType(json.sampleType);
    }
    if (json.createdBy != null) {
      builder.createdBy(json.createdBy);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MetricSample} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MetricSample instance
   */
  public static ImmutableMetricSample copyOf(MetricSample instance) {
    if (instance instanceof ImmutableMetricSample) {
      return (ImmutableMetricSample) instance;
    }
    return ImmutableMetricSample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMetricSample ImmutableMetricSample}.
   * @return A new ImmutableMetricSample builder
   */
  public static ImmutableMetricSample.Builder builder() {
    return new ImmutableMetricSample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMetricSample ImmutableMetricSample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_METRIC_ID = 0x1L;
    private static final long INIT_BIT_COLLECTION_DATE = 0x2L;
    private static final long INIT_BIT_EFFECTIVE_DATE = 0x4L;
    private static final long INIT_BIT_SAMPLE_TYPE = 0x8L;
    private static final long INIT_BIT_CREATED_BY = 0x10L;
    private static final long INIT_BIT_PROVENANCE = 0x20L;
    private long initBits = 0x3fL;

    private long metricId;
    private LocalDate collectionDate;
    private LocalDate effectiveDate;
    private SampleType sampleType;
    private String createdBy;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MetricSample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MetricSample instance) {
      Objects.requireNonNull(instance, "instance");
      metricId(instance.metricId());
      collectionDate(instance.collectionDate());
      effectiveDate(instance.effectiveDate());
      sampleType(instance.sampleType());
      createdBy(instance.createdBy());
      provenance(instance.provenance());
      return this;
    }

    /**
     * Initializes the value for the {@link MetricSample#metricId() metricId} attribute.
     * @param metricId The value for metricId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("metricId")
    public final Builder metricId(long metricId) {
      this.metricId = metricId;
      initBits &= ~INIT_BIT_METRIC_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MetricSample#collectionDate() collectionDate} attribute.
     * @param collectionDate The value for collectionDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collectionDate")
    public final Builder collectionDate(LocalDate collectionDate) {
      this.collectionDate = Objects.requireNonNull(collectionDate, "collectionDate");
      initBits &= ~INIT_BIT_COLLECTION_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link MetricSample#effectiveDate() effectiveDate} attribute.
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
     * Initializes the value for the {@link MetricSample#sampleType() sampleType} attribute.
     * @param sampleType The value for sampleType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sampleType")
    public final Builder sampleType(SampleType sampleType) {
      this.sampleType = Objects.requireNonNull(sampleType, "sampleType");
      initBits &= ~INIT_BIT_SAMPLE_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link MetricSample#createdBy() createdBy} attribute.
     * @param createdBy The value for createdBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdBy")
    public final Builder createdBy(String createdBy) {
      this.createdBy = Objects.requireNonNull(createdBy, "createdBy");
      initBits &= ~INIT_BIT_CREATED_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link MetricSample#provenance() provenance} attribute.
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      initBits &= ~INIT_BIT_PROVENANCE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMetricSample ImmutableMetricSample}.
     * @return An immutable instance of MetricSample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMetricSample build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMetricSample(metricId, collectionDate, effectiveDate, sampleType, createdBy, provenance);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_METRIC_ID) != 0) attributes.add("metricId");
      if ((initBits & INIT_BIT_COLLECTION_DATE) != 0) attributes.add("collectionDate");
      if ((initBits & INIT_BIT_EFFECTIVE_DATE) != 0) attributes.add("effectiveDate");
      if ((initBits & INIT_BIT_SAMPLE_TYPE) != 0) attributes.add("sampleType");
      if ((initBits & INIT_BIT_CREATED_BY) != 0) attributes.add("createdBy");
      if ((initBits & INIT_BIT_PROVENANCE) != 0) attributes.add("provenance");
      return "Cannot build MetricSample, some of required attributes are not set " + attributes;
    }
  }
}
