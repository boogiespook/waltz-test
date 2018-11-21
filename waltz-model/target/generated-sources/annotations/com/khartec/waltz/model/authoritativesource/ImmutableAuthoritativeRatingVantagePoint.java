package com.khartec.waltz.model.authoritativesource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AuthoritativeRatingVantagePoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthoritativeRatingVantagePoint.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AuthoritativeRatingVantagePoint"})
public final class ImmutableAuthoritativeRatingVantagePoint
    extends AuthoritativeRatingVantagePoint {
  private final EntityReference vantagePoint;
  private final int rank;
  private final String dataTypeCode;
  private final Long applicationId;
  private final AuthoritativenessRating rating;

  private ImmutableAuthoritativeRatingVantagePoint(
      EntityReference vantagePoint,
      int rank,
      String dataTypeCode,
      Long applicationId,
      AuthoritativenessRating rating) {
    this.vantagePoint = vantagePoint;
    this.rank = rank;
    this.dataTypeCode = dataTypeCode;
    this.applicationId = applicationId;
    this.rating = rating;
  }

  /**
   * @return The value of the {@code vantagePoint} attribute
   */
  @JsonProperty("vantagePoint")
  @Override
  public EntityReference vantagePoint() {
    return vantagePoint;
  }

  /**
   * @return The value of the {@code rank} attribute
   */
  @JsonProperty("rank")
  @Override
  public int rank() {
    return rank;
  }

  /**
   * @return The value of the {@code dataTypeCode} attribute
   */
  @JsonProperty("dataTypeCode")
  @Override
  public String dataTypeCode() {
    return dataTypeCode;
  }

  /**
   * @return The value of the {@code applicationId} attribute
   */
  @JsonProperty("applicationId")
  @Override
  public Long applicationId() {
    return applicationId;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public AuthoritativenessRating rating() {
    return rating;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeRatingVantagePoint#vantagePoint() vantagePoint} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vantagePoint
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeRatingVantagePoint withVantagePoint(EntityReference value) {
    if (this.vantagePoint == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "vantagePoint");
    return new ImmutableAuthoritativeRatingVantagePoint(newValue, this.rank, this.dataTypeCode, this.applicationId, this.rating);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeRatingVantagePoint#rank() rank} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rank
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeRatingVantagePoint withRank(int value) {
    if (this.rank == value) return this;
    return new ImmutableAuthoritativeRatingVantagePoint(this.vantagePoint, value, this.dataTypeCode, this.applicationId, this.rating);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeRatingVantagePoint#dataTypeCode() dataTypeCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataTypeCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeRatingVantagePoint withDataTypeCode(String value) {
    if (this.dataTypeCode.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dataTypeCode");
    return new ImmutableAuthoritativeRatingVantagePoint(this.vantagePoint, this.rank, newValue, this.applicationId, this.rating);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeRatingVantagePoint#applicationId() applicationId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeRatingVantagePoint withApplicationId(Long value) {
    if (this.applicationId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "applicationId");
    return new ImmutableAuthoritativeRatingVantagePoint(this.vantagePoint, this.rank, this.dataTypeCode, newValue, this.rating);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeRatingVantagePoint#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeRatingVantagePoint withRating(AuthoritativenessRating value) {
    if (this.rating == value) return this;
    AuthoritativenessRating newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableAuthoritativeRatingVantagePoint(this.vantagePoint, this.rank, this.dataTypeCode, this.applicationId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthoritativeRatingVantagePoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthoritativeRatingVantagePoint
        && equalTo((ImmutableAuthoritativeRatingVantagePoint) another);
  }

  private boolean equalTo(ImmutableAuthoritativeRatingVantagePoint another) {
    return vantagePoint.equals(another.vantagePoint)
        && rank == another.rank
        && dataTypeCode.equals(another.dataTypeCode)
        && applicationId.equals(another.applicationId)
        && rating.equals(another.rating);
  }

  /**
   * Computes a hash code from attributes: {@code vantagePoint}, {@code rank}, {@code dataTypeCode}, {@code applicationId}, {@code rating}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + vantagePoint.hashCode();
    h += (h << 5) + rank;
    h += (h << 5) + dataTypeCode.hashCode();
    h += (h << 5) + applicationId.hashCode();
    h += (h << 5) + rating.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AuthoritativeRatingVantagePoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AuthoritativeRatingVantagePoint{"
        + "vantagePoint=" + vantagePoint
        + ", rank=" + rank
        + ", dataTypeCode=" + dataTypeCode
        + ", applicationId=" + applicationId
        + ", rating=" + rating
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AuthoritativeRatingVantagePoint {
    EntityReference vantagePoint;
    int rank;
    boolean rankIsSet;
    String dataTypeCode;
    Long applicationId;
    AuthoritativenessRating rating;
    @JsonProperty("vantagePoint")
    public void setVantagePoint(EntityReference vantagePoint) {
      this.vantagePoint = vantagePoint;
    }
    @JsonProperty("rank")
    public void setRank(int rank) {
      this.rank = rank;
      this.rankIsSet = true;
    }
    @JsonProperty("dataTypeCode")
    public void setDataTypeCode(String dataTypeCode) {
      this.dataTypeCode = dataTypeCode;
    }
    @JsonProperty("applicationId")
    public void setApplicationId(Long applicationId) {
      this.applicationId = applicationId;
    }
    @JsonProperty("rating")
    public void setRating(AuthoritativenessRating rating) {
      this.rating = rating;
    }
    @Override
    public EntityReference vantagePoint() { throw new UnsupportedOperationException(); }
    @Override
    public int rank() { throw new UnsupportedOperationException(); }
    @Override
    public String dataTypeCode() { throw new UnsupportedOperationException(); }
    @Override
    public Long applicationId() { throw new UnsupportedOperationException(); }
    @Override
    public AuthoritativenessRating rating() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuthoritativeRatingVantagePoint fromJson(Json json) {
    ImmutableAuthoritativeRatingVantagePoint.Builder builder = ImmutableAuthoritativeRatingVantagePoint.builder();
    if (json.vantagePoint != null) {
      builder.vantagePoint(json.vantagePoint);
    }
    if (json.rankIsSet) {
      builder.rank(json.rank);
    }
    if (json.dataTypeCode != null) {
      builder.dataTypeCode(json.dataTypeCode);
    }
    if (json.applicationId != null) {
      builder.applicationId(json.applicationId);
    }
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuthoritativeRatingVantagePoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthoritativeRatingVantagePoint instance
   */
  public static ImmutableAuthoritativeRatingVantagePoint copyOf(AuthoritativeRatingVantagePoint instance) {
    if (instance instanceof ImmutableAuthoritativeRatingVantagePoint) {
      return (ImmutableAuthoritativeRatingVantagePoint) instance;
    }
    return ImmutableAuthoritativeRatingVantagePoint.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthoritativeRatingVantagePoint ImmutableAuthoritativeRatingVantagePoint}.
   * @return A new ImmutableAuthoritativeRatingVantagePoint builder
   */
  public static ImmutableAuthoritativeRatingVantagePoint.Builder builder() {
    return new ImmutableAuthoritativeRatingVantagePoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthoritativeRatingVantagePoint ImmutableAuthoritativeRatingVantagePoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_VANTAGE_POINT = 0x1L;
    private static final long INIT_BIT_RANK = 0x2L;
    private static final long INIT_BIT_DATA_TYPE_CODE = 0x4L;
    private static final long INIT_BIT_APPLICATION_ID = 0x8L;
    private static final long INIT_BIT_RATING = 0x10L;
    private long initBits = 0x1fL;

    private EntityReference vantagePoint;
    private int rank;
    private String dataTypeCode;
    private Long applicationId;
    private AuthoritativenessRating rating;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AuthoritativeRatingVantagePoint} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuthoritativeRatingVantagePoint instance) {
      Objects.requireNonNull(instance, "instance");
      vantagePoint(instance.vantagePoint());
      rank(instance.rank());
      dataTypeCode(instance.dataTypeCode());
      applicationId(instance.applicationId());
      rating(instance.rating());
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeRatingVantagePoint#vantagePoint() vantagePoint} attribute.
     * @param vantagePoint The value for vantagePoint 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("vantagePoint")
    public final Builder vantagePoint(EntityReference vantagePoint) {
      this.vantagePoint = Objects.requireNonNull(vantagePoint, "vantagePoint");
      initBits &= ~INIT_BIT_VANTAGE_POINT;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeRatingVantagePoint#rank() rank} attribute.
     * @param rank The value for rank 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rank")
    public final Builder rank(int rank) {
      this.rank = rank;
      initBits &= ~INIT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeRatingVantagePoint#dataTypeCode() dataTypeCode} attribute.
     * @param dataTypeCode The value for dataTypeCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataTypeCode")
    public final Builder dataTypeCode(String dataTypeCode) {
      this.dataTypeCode = Objects.requireNonNull(dataTypeCode, "dataTypeCode");
      initBits &= ~INIT_BIT_DATA_TYPE_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeRatingVantagePoint#applicationId() applicationId} attribute.
     * @param applicationId The value for applicationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationId")
    public final Builder applicationId(Long applicationId) {
      this.applicationId = Objects.requireNonNull(applicationId, "applicationId");
      initBits &= ~INIT_BIT_APPLICATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeRatingVantagePoint#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(AuthoritativenessRating rating) {
      this.rating = Objects.requireNonNull(rating, "rating");
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthoritativeRatingVantagePoint ImmutableAuthoritativeRatingVantagePoint}.
     * @return An immutable instance of AuthoritativeRatingVantagePoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthoritativeRatingVantagePoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthoritativeRatingVantagePoint(vantagePoint, rank, dataTypeCode, applicationId, rating);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_VANTAGE_POINT) != 0) attributes.add("vantagePoint");
      if ((initBits & INIT_BIT_RANK) != 0) attributes.add("rank");
      if ((initBits & INIT_BIT_DATA_TYPE_CODE) != 0) attributes.add("dataTypeCode");
      if ((initBits & INIT_BIT_APPLICATION_ID) != 0) attributes.add("applicationId");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      return "Cannot build AuthoritativeRatingVantagePoint, some of required attributes are not set " + attributes;
    }
  }
}
