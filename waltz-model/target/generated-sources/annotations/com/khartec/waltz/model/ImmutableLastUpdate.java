package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LastUpdate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLastUpdate.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LastUpdate"})
public final class ImmutableLastUpdate extends LastUpdate {
  private final LocalDateTime at;
  private final String by;

  private ImmutableLastUpdate(ImmutableLastUpdate.Builder builder) {
    this.by = builder.by;
    this.at = builder.at != null
        ? builder.at
        : Objects.requireNonNull(super.at(), "at");
  }

  private ImmutableLastUpdate(LocalDateTime at, String by) {
    this.at = at;
    this.by = by;
  }

  /**
   * @return The value of the {@code at} attribute
   */
  @JsonProperty("at")
  @Override
  public LocalDateTime at() {
    return at;
  }

  /**
   * @return The value of the {@code by} attribute
   */
  @JsonProperty("by")
  @Override
  public String by() {
    return by;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LastUpdate#at() at} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for at
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLastUpdate withAt(LocalDateTime value) {
    if (this.at == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "at");
    return new ImmutableLastUpdate(newValue, this.by);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LastUpdate#by() by} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for by
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLastUpdate withBy(String value) {
    if (this.by.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "by");
    return new ImmutableLastUpdate(this.at, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLastUpdate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLastUpdate
        && equalTo((ImmutableLastUpdate) another);
  }

  private boolean equalTo(ImmutableLastUpdate another) {
    return at.equals(another.at)
        && by.equals(another.by);
  }

  /**
   * Computes a hash code from attributes: {@code at}, {@code by}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + at.hashCode();
    h += (h << 5) + by.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LastUpdate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "LastUpdate{"
        + "at=" + at
        + ", by=" + by
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LastUpdate {
    LocalDateTime at;
    String by;
    @JsonProperty("at")
    public void setAt(LocalDateTime at) {
      this.at = at;
    }
    @JsonProperty("by")
    public void setBy(String by) {
      this.by = by;
    }
    @Override
    public LocalDateTime at() { throw new UnsupportedOperationException(); }
    @Override
    public String by() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLastUpdate fromJson(Json json) {
    ImmutableLastUpdate.Builder builder = ImmutableLastUpdate.builder();
    if (json.at != null) {
      builder.at(json.at);
    }
    if (json.by != null) {
      builder.by(json.by);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LastUpdate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LastUpdate instance
   */
  public static ImmutableLastUpdate copyOf(LastUpdate instance) {
    if (instance instanceof ImmutableLastUpdate) {
      return (ImmutableLastUpdate) instance;
    }
    return ImmutableLastUpdate.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLastUpdate ImmutableLastUpdate}.
   * @return A new ImmutableLastUpdate builder
   */
  public static ImmutableLastUpdate.Builder builder() {
    return new ImmutableLastUpdate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLastUpdate ImmutableLastUpdate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_BY = 0x1L;
    private long initBits = 0x1L;

    private LocalDateTime at;
    private String by;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LastUpdate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastUpdate instance) {
      Objects.requireNonNull(instance, "instance");
      at(instance.at());
      by(instance.by());
      return this;
    }

    /**
     * Initializes the value for the {@link LastUpdate#at() at} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LastUpdate#at() at}.</em>
     * @param at The value for at 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("at")
    public final Builder at(LocalDateTime at) {
      this.at = Objects.requireNonNull(at, "at");
      return this;
    }

    /**
     * Initializes the value for the {@link LastUpdate#by() by} attribute.
     * @param by The value for by 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("by")
    public final Builder by(String by) {
      this.by = Objects.requireNonNull(by, "by");
      initBits &= ~INIT_BIT_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLastUpdate ImmutableLastUpdate}.
     * @return An immutable instance of LastUpdate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLastUpdate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLastUpdate(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_BY) != 0) attributes.add("by");
      return "Cannot build LastUpdate, some of required attributes are not set " + attributes;
    }
  }
}
