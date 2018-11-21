package com.khartec.waltz.model.perspective;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PerspectiveRatingValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerspectiveRatingValue.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PerspectiveRatingValue"})
public final class ImmutablePerspectiveRatingValue
    extends PerspectiveRatingValue {
  private final char rating;
  private final long measurableX;
  private final long measurableY;

  private ImmutablePerspectiveRatingValue(char rating, long measurableX, long measurableY) {
    this.rating = rating;
    this.measurableX = measurableX;
    this.measurableY = measurableY;
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
   * @return The value of the {@code measurableX} attribute
   */
  @JsonProperty("measurableX")
  @Override
  public long measurableX() {
    return measurableX;
  }

  /**
   * @return The value of the {@code measurableY} attribute
   */
  @JsonProperty("measurableY")
  @Override
  public long measurableY() {
    return measurableY;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRatingValue#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRatingValue withRating(char value) {
    if (this.rating == value) return this;
    return new ImmutablePerspectiveRatingValue(value, this.measurableX, this.measurableY);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRatingValue#measurableX() measurableX} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableX
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRatingValue withMeasurableX(long value) {
    if (this.measurableX == value) return this;
    return new ImmutablePerspectiveRatingValue(this.rating, value, this.measurableY);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRatingValue#measurableY() measurableY} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableY
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRatingValue withMeasurableY(long value) {
    if (this.measurableY == value) return this;
    return new ImmutablePerspectiveRatingValue(this.rating, this.measurableX, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerspectiveRatingValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerspectiveRatingValue
        && equalTo((ImmutablePerspectiveRatingValue) another);
  }

  private boolean equalTo(ImmutablePerspectiveRatingValue another) {
    return rating == another.rating
        && measurableX == another.measurableX
        && measurableY == another.measurableY;
  }

  /**
   * Computes a hash code from attributes: {@code rating}, {@code measurableX}, {@code measurableY}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Character.hashCode(rating);
    h += (h << 5) + Long.hashCode(measurableX);
    h += (h << 5) + Long.hashCode(measurableY);
    return h;
  }

  /**
   * Prints the immutable value {@code PerspectiveRatingValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PerspectiveRatingValue{"
        + "rating=" + rating
        + ", measurableX=" + measurableX
        + ", measurableY=" + measurableY
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PerspectiveRatingValue {
    char rating;
    boolean ratingIsSet;
    long measurableX;
    boolean measurableXIsSet;
    long measurableY;
    boolean measurableYIsSet;
    @JsonProperty("rating")
    public void setRating(char rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("measurableX")
    public void setMeasurableX(long measurableX) {
      this.measurableX = measurableX;
      this.measurableXIsSet = true;
    }
    @JsonProperty("measurableY")
    public void setMeasurableY(long measurableY) {
      this.measurableY = measurableY;
      this.measurableYIsSet = true;
    }
    @Override
    public char rating() { throw new UnsupportedOperationException(); }
    @Override
    public long measurableX() { throw new UnsupportedOperationException(); }
    @Override
    public long measurableY() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePerspectiveRatingValue fromJson(Json json) {
    ImmutablePerspectiveRatingValue.Builder builder = ImmutablePerspectiveRatingValue.builder();
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.measurableXIsSet) {
      builder.measurableX(json.measurableX);
    }
    if (json.measurableYIsSet) {
      builder.measurableY(json.measurableY);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PerspectiveRatingValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PerspectiveRatingValue instance
   */
  public static ImmutablePerspectiveRatingValue copyOf(PerspectiveRatingValue instance) {
    if (instance instanceof ImmutablePerspectiveRatingValue) {
      return (ImmutablePerspectiveRatingValue) instance;
    }
    return ImmutablePerspectiveRatingValue.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerspectiveRatingValue ImmutablePerspectiveRatingValue}.
   * @return A new ImmutablePerspectiveRatingValue builder
   */
  public static ImmutablePerspectiveRatingValue.Builder builder() {
    return new ImmutablePerspectiveRatingValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerspectiveRatingValue ImmutablePerspectiveRatingValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING = 0x1L;
    private static final long INIT_BIT_MEASURABLE_X = 0x2L;
    private static final long INIT_BIT_MEASURABLE_Y = 0x4L;
    private long initBits = 0x7L;

    private char rating;
    private long measurableX;
    private long measurableY;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PerspectiveRatingValue} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PerspectiveRatingValue instance) {
      Objects.requireNonNull(instance, "instance");
      rating(instance.rating());
      measurableX(instance.measurableX());
      measurableY(instance.measurableY());
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveRatingValue#rating() rating} attribute.
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
     * Initializes the value for the {@link PerspectiveRatingValue#measurableX() measurableX} attribute.
     * @param measurableX The value for measurableX 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableX")
    public final Builder measurableX(long measurableX) {
      this.measurableX = measurableX;
      initBits &= ~INIT_BIT_MEASURABLE_X;
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveRatingValue#measurableY() measurableY} attribute.
     * @param measurableY The value for measurableY 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableY")
    public final Builder measurableY(long measurableY) {
      this.measurableY = measurableY;
      initBits &= ~INIT_BIT_MEASURABLE_Y;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerspectiveRatingValue ImmutablePerspectiveRatingValue}.
     * @return An immutable instance of PerspectiveRatingValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerspectiveRatingValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerspectiveRatingValue(rating, measurableX, measurableY);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_MEASURABLE_X) != 0) attributes.add("measurableX");
      if ((initBits & INIT_BIT_MEASURABLE_Y) != 0) attributes.add("measurableY");
      return "Cannot build PerspectiveRatingValue, some of required attributes are not set " + attributes;
    }
  }
}
