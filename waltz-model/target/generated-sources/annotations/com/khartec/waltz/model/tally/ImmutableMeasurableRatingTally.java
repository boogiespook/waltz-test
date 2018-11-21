package com.khartec.waltz.model.tally;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MeasurableRatingTally}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasurableRatingTally.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MeasurableRatingTally"})
public final class ImmutableMeasurableRatingTally extends MeasurableRatingTally {
  private final long id;
  private final char rating;
  private final long count;

  private ImmutableMeasurableRatingTally(long id, char rating, long count) {
    this.id = id;
    this.rating = rating;
    this.count = count;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public long id() {
    return id;
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
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public long count() {
    return count;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRatingTally#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRatingTally withId(long value) {
    if (this.id == value) return this;
    return new ImmutableMeasurableRatingTally(value, this.rating, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRatingTally#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRatingTally withRating(char value) {
    if (this.rating == value) return this;
    return new ImmutableMeasurableRatingTally(this.id, value, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableRatingTally#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableRatingTally withCount(long value) {
    if (this.count == value) return this;
    return new ImmutableMeasurableRatingTally(this.id, this.rating, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasurableRatingTally} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasurableRatingTally
        && equalTo((ImmutableMeasurableRatingTally) another);
  }

  private boolean equalTo(ImmutableMeasurableRatingTally another) {
    return id == another.id
        && rating == another.rating
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code rating}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(id);
    h += (h << 5) + Character.hashCode(rating);
    h += (h << 5) + Long.hashCode(count);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasurableRatingTally} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MeasurableRatingTally{"
        + "id=" + id
        + ", rating=" + rating
        + ", count=" + count
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends MeasurableRatingTally {
    long id;
    boolean idIsSet;
    char rating;
    boolean ratingIsSet;
    long count;
    boolean countIsSet;
    @JsonProperty("id")
    public void setId(long id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("rating")
    public void setRating(char rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("count")
    public void setCount(long count) {
      this.count = count;
      this.countIsSet = true;
    }
    @Override
    public long id() { throw new UnsupportedOperationException(); }
    @Override
    public char rating() { throw new UnsupportedOperationException(); }
    @Override
    public long count() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasurableRatingTally fromJson(Json json) {
    ImmutableMeasurableRatingTally.Builder builder = ImmutableMeasurableRatingTally.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasurableRatingTally} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasurableRatingTally instance
   */
  public static ImmutableMeasurableRatingTally copyOf(MeasurableRatingTally instance) {
    if (instance instanceof ImmutableMeasurableRatingTally) {
      return (ImmutableMeasurableRatingTally) instance;
    }
    return ImmutableMeasurableRatingTally.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMeasurableRatingTally ImmutableMeasurableRatingTally}.
   * @return A new ImmutableMeasurableRatingTally builder
   */
  public static ImmutableMeasurableRatingTally.Builder builder() {
    return new ImmutableMeasurableRatingTally.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMeasurableRatingTally ImmutableMeasurableRatingTally}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_RATING = 0x2L;
    private static final long INIT_BIT_COUNT = 0x4L;
    private long initBits = 0x7L;

    private long id;
    private char rating;
    private long count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MeasurableRatingTally} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MeasurableRatingTally instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      rating(instance.rating());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRatingTally#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(long id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableRatingTally#rating() rating} attribute.
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
     * Initializes the value for the {@link MeasurableRatingTally#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(long count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMeasurableRatingTally ImmutableMeasurableRatingTally}.
     * @return An immutable instance of MeasurableRatingTally
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMeasurableRatingTally build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMeasurableRatingTally(id, rating, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build MeasurableRatingTally, some of required attributes are not set " + attributes;
    }
  }
}
