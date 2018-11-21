package com.khartec.waltz.model.complexity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ComplexityRating}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComplexityRating.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ComplexityRating"})
public final class ImmutableComplexityRating extends ComplexityRating {
  private final long id;
  private final ComplexityScore serverComplexity;
  private final ComplexityScore connectionComplexity;
  private final ComplexityScore measurableComplexity;
  private final double overallScore;

  private ImmutableComplexityRating(
      long id,
      ComplexityScore serverComplexity,
      ComplexityScore connectionComplexity,
      ComplexityScore measurableComplexity) {
    this.id = id;
    this.serverComplexity = serverComplexity;
    this.connectionComplexity = connectionComplexity;
    this.measurableComplexity = measurableComplexity;
    this.overallScore = super.overallScore();
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
   * @return The value of the {@code serverComplexity} attribute
   */
  @JsonProperty("serverComplexity")
  @Override
  public Optional<ComplexityScore> serverComplexity() {
    return Optional.ofNullable(serverComplexity);
  }

  /**
   * @return The value of the {@code connectionComplexity} attribute
   */
  @JsonProperty("connectionComplexity")
  @Override
  public Optional<ComplexityScore> connectionComplexity() {
    return Optional.ofNullable(connectionComplexity);
  }

  /**
   * @return The value of the {@code measurableComplexity} attribute
   */
  @JsonProperty("measurableComplexity")
  @Override
  public Optional<ComplexityScore> measurableComplexity() {
    return Optional.ofNullable(measurableComplexity);
  }

  /**
   * @return The computed-at-construction value of the {@code overallScore} attribute
   */
  @JsonProperty("overallScore")
  @Override
  public double overallScore() {
    return overallScore;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ComplexityRating#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComplexityRating withId(long value) {
    if (this.id == value) return this;
    return new ImmutableComplexityRating(value, this.serverComplexity, this.connectionComplexity, this.measurableComplexity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ComplexityRating#serverComplexity() serverComplexity} attribute.
   * @param value The value for serverComplexity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComplexityRating withServerComplexity(ComplexityScore value) {
    ComplexityScore newValue = Objects.requireNonNull(value, "serverComplexity");
    if (this.serverComplexity == newValue) return this;
    return new ImmutableComplexityRating(this.id, newValue, this.connectionComplexity, this.measurableComplexity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ComplexityRating#serverComplexity() serverComplexity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serverComplexity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComplexityRating withServerComplexity(Optional<? extends ComplexityScore> optional) {
    ComplexityScore value = optional.orElse(null);
    if (this.serverComplexity == value) return this;
    return new ImmutableComplexityRating(this.id, value, this.connectionComplexity, this.measurableComplexity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ComplexityRating#connectionComplexity() connectionComplexity} attribute.
   * @param value The value for connectionComplexity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComplexityRating withConnectionComplexity(ComplexityScore value) {
    ComplexityScore newValue = Objects.requireNonNull(value, "connectionComplexity");
    if (this.connectionComplexity == newValue) return this;
    return new ImmutableComplexityRating(this.id, this.serverComplexity, newValue, this.measurableComplexity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ComplexityRating#connectionComplexity() connectionComplexity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for connectionComplexity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComplexityRating withConnectionComplexity(Optional<? extends ComplexityScore> optional) {
    ComplexityScore value = optional.orElse(null);
    if (this.connectionComplexity == value) return this;
    return new ImmutableComplexityRating(this.id, this.serverComplexity, value, this.measurableComplexity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ComplexityRating#measurableComplexity() measurableComplexity} attribute.
   * @param value The value for measurableComplexity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComplexityRating withMeasurableComplexity(ComplexityScore value) {
    ComplexityScore newValue = Objects.requireNonNull(value, "measurableComplexity");
    if (this.measurableComplexity == newValue) return this;
    return new ImmutableComplexityRating(this.id, this.serverComplexity, this.connectionComplexity, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ComplexityRating#measurableComplexity() measurableComplexity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measurableComplexity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComplexityRating withMeasurableComplexity(Optional<? extends ComplexityScore> optional) {
    ComplexityScore value = optional.orElse(null);
    if (this.measurableComplexity == value) return this;
    return new ImmutableComplexityRating(this.id, this.serverComplexity, this.connectionComplexity, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComplexityRating} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComplexityRating
        && equalTo((ImmutableComplexityRating) another);
  }

  private boolean equalTo(ImmutableComplexityRating another) {
    return id == another.id
        && Objects.equals(serverComplexity, another.serverComplexity)
        && Objects.equals(connectionComplexity, another.connectionComplexity)
        && Objects.equals(measurableComplexity, another.measurableComplexity)
        && Double.doubleToLongBits(overallScore) == Double.doubleToLongBits(another.overallScore);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code serverComplexity}, {@code connectionComplexity}, {@code measurableComplexity}, {@code overallScore}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(id);
    h += (h << 5) + Objects.hashCode(serverComplexity);
    h += (h << 5) + Objects.hashCode(connectionComplexity);
    h += (h << 5) + Objects.hashCode(measurableComplexity);
    h += (h << 5) + Double.hashCode(overallScore);
    return h;
  }

  /**
   * Prints the immutable value {@code ComplexityRating} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ComplexityRating{");
    builder.append("id=").append(id);
    if (serverComplexity != null) {
      builder.append(", ");
      builder.append("serverComplexity=").append(serverComplexity);
    }
    if (connectionComplexity != null) {
      builder.append(", ");
      builder.append("connectionComplexity=").append(connectionComplexity);
    }
    if (measurableComplexity != null) {
      builder.append(", ");
      builder.append("measurableComplexity=").append(measurableComplexity);
    }
    builder.append(", ");
    builder.append("overallScore=").append(overallScore);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ComplexityRating {
    long id;
    boolean idIsSet;
    Optional<ComplexityScore> serverComplexity = Optional.empty();
    Optional<ComplexityScore> connectionComplexity = Optional.empty();
    Optional<ComplexityScore> measurableComplexity = Optional.empty();
    @JsonProperty("id")
    public void setId(long id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("serverComplexity")
    public void setServerComplexity(Optional<ComplexityScore> serverComplexity) {
      this.serverComplexity = serverComplexity;
    }
    @JsonProperty("connectionComplexity")
    public void setConnectionComplexity(Optional<ComplexityScore> connectionComplexity) {
      this.connectionComplexity = connectionComplexity;
    }
    @JsonProperty("measurableComplexity")
    public void setMeasurableComplexity(Optional<ComplexityScore> measurableComplexity) {
      this.measurableComplexity = measurableComplexity;
    }
    @Override
    public long id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ComplexityScore> serverComplexity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ComplexityScore> connectionComplexity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ComplexityScore> measurableComplexity() { throw new UnsupportedOperationException(); }
    @Override
    public double overallScore() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableComplexityRating fromJson(Json json) {
    ImmutableComplexityRating.Builder builder = ImmutableComplexityRating.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.serverComplexity != null) {
      builder.serverComplexity(json.serverComplexity);
    }
    if (json.connectionComplexity != null) {
      builder.connectionComplexity(json.connectionComplexity);
    }
    if (json.measurableComplexity != null) {
      builder.measurableComplexity(json.measurableComplexity);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ComplexityRating} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ComplexityRating instance
   */
  public static ImmutableComplexityRating copyOf(ComplexityRating instance) {
    if (instance instanceof ImmutableComplexityRating) {
      return (ImmutableComplexityRating) instance;
    }
    return ImmutableComplexityRating.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableComplexityRating ImmutableComplexityRating}.
   * @return A new ImmutableComplexityRating builder
   */
  public static ImmutableComplexityRating.Builder builder() {
    return new ImmutableComplexityRating.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableComplexityRating ImmutableComplexityRating}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1L;

    private long id;
    private ComplexityScore serverComplexity;
    private ComplexityScore connectionComplexity;
    private ComplexityScore measurableComplexity;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ComplexityRating} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ComplexityRating instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      Optional<ComplexityScore> serverComplexityOptional = instance.serverComplexity();
      if (serverComplexityOptional.isPresent()) {
        serverComplexity(serverComplexityOptional);
      }
      Optional<ComplexityScore> connectionComplexityOptional = instance.connectionComplexity();
      if (connectionComplexityOptional.isPresent()) {
        connectionComplexity(connectionComplexityOptional);
      }
      Optional<ComplexityScore> measurableComplexityOptional = instance.measurableComplexity();
      if (measurableComplexityOptional.isPresent()) {
        measurableComplexity(measurableComplexityOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link ComplexityRating#id() id} attribute.
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
     * Initializes the optional value {@link ComplexityRating#serverComplexity() serverComplexity} to serverComplexity.
     * @param serverComplexity The value for serverComplexity
     * @return {@code this} builder for chained invocation
     */
    public final Builder serverComplexity(ComplexityScore serverComplexity) {
      this.serverComplexity = Objects.requireNonNull(serverComplexity, "serverComplexity");
      return this;
    }

    /**
     * Initializes the optional value {@link ComplexityRating#serverComplexity() serverComplexity} to serverComplexity.
     * @param serverComplexity The value for serverComplexity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serverComplexity")
    public final Builder serverComplexity(Optional<? extends ComplexityScore> serverComplexity) {
      this.serverComplexity = serverComplexity.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link ComplexityRating#connectionComplexity() connectionComplexity} to connectionComplexity.
     * @param connectionComplexity The value for connectionComplexity
     * @return {@code this} builder for chained invocation
     */
    public final Builder connectionComplexity(ComplexityScore connectionComplexity) {
      this.connectionComplexity = Objects.requireNonNull(connectionComplexity, "connectionComplexity");
      return this;
    }

    /**
     * Initializes the optional value {@link ComplexityRating#connectionComplexity() connectionComplexity} to connectionComplexity.
     * @param connectionComplexity The value for connectionComplexity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("connectionComplexity")
    public final Builder connectionComplexity(Optional<? extends ComplexityScore> connectionComplexity) {
      this.connectionComplexity = connectionComplexity.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link ComplexityRating#measurableComplexity() measurableComplexity} to measurableComplexity.
     * @param measurableComplexity The value for measurableComplexity
     * @return {@code this} builder for chained invocation
     */
    public final Builder measurableComplexity(ComplexityScore measurableComplexity) {
      this.measurableComplexity = Objects.requireNonNull(measurableComplexity, "measurableComplexity");
      return this;
    }

    /**
     * Initializes the optional value {@link ComplexityRating#measurableComplexity() measurableComplexity} to measurableComplexity.
     * @param measurableComplexity The value for measurableComplexity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableComplexity")
    public final Builder measurableComplexity(Optional<? extends ComplexityScore> measurableComplexity) {
      this.measurableComplexity = measurableComplexity.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableComplexityRating ImmutableComplexityRating}.
     * @return An immutable instance of ComplexityRating
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableComplexityRating build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableComplexityRating(id, serverComplexity, connectionComplexity, measurableComplexity);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build ComplexityRating, some of required attributes are not set " + attributes;
    }
  }
}
