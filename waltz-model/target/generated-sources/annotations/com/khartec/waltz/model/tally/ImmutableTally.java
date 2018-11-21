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
 * Immutable implementation of {@link Tally}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTally.<T>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Tally<T>"})
public final class ImmutableTally<T> extends Tally<T> {
  private final T id;
  private final double count;

  private ImmutableTally(T id, double count) {
    this.id = id;
    this.count = count;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public T id() {
    return id;
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public double count() {
    return count;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tally#id() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTally<T> withId(T value) {
    if (this.id == value) return this;
    T newValue = Objects.requireNonNull(value, "id");
    return new ImmutableTally<T>(newValue, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tally#count() count} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTally<T> withCount(double value) {
    if (Double.doubleToLongBits(this.count) == Double.doubleToLongBits(value)) return this;
    return new ImmutableTally<T>(this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTally} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTally<?>
        && equalTo((ImmutableTally<T>) another);
  }

  private boolean equalTo(ImmutableTally<T> another) {
    return id.equals(another.id)
        && Double.doubleToLongBits(count) == Double.doubleToLongBits(another.count);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + Double.hashCode(count);
    return h;
  }

  /**
   * Prints the immutable value {@code Tally} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Tally{"
        + "id=" + id
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
  static final class Json<T> extends Tally<T> {
    T id;
    double count;
    boolean countIsSet;
    @JsonProperty("id")
    public void setId(T id) {
      this.id = id;
    }
    @JsonProperty("count")
    public void setCount(double count) {
      this.count = count;
      this.countIsSet = true;
    }
    @Override
    public T id() { throw new UnsupportedOperationException(); }
    @Override
    public double count() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param <T> generic parameter T
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static <T> ImmutableTally<T> fromJson(Json<T> json) {
    ImmutableTally.Builder<T> builder = ImmutableTally.<T>builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Tally} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <T> generic parameter T
   * @param instance The instance to copy
   * @return A copied immutable Tally instance
   */
  public static <T> ImmutableTally<T> copyOf(Tally<T> instance) {
    if (instance instanceof ImmutableTally<?>) {
      return (ImmutableTally<T>) instance;
    }
    return ImmutableTally.<T>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTally ImmutableTally}.
   * @param <T> generic parameter T
   * @return A new ImmutableTally builder
   */
  public static <T> ImmutableTally.Builder<T> builder() {
    return new ImmutableTally.Builder<T>();
  }

  /**
   * Builds instances of type {@link ImmutableTally ImmutableTally}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<T> {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_COUNT = 0x2L;
    private long initBits = 0x3L;

    private T id;
    private double count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Tally} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> from(Tally<T> instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link Tally#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder<T> id(T id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Tally#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder<T> count(double count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTally ImmutableTally}.
     * @return An immutable instance of Tally
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTally<T> build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTally<T>(id, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build Tally, some of required attributes are not set " + attributes;
    }
  }
}
