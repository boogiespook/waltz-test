package com.khartec.waltz.model.complexity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ComplexityScore}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComplexityScore.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ComplexityScore"})
public final class ImmutableComplexityScore extends ComplexityScore {
  private final long id;
  private final double score;
  private final ComplexityKind kind;

  private ImmutableComplexityScore(long id, double score, ComplexityKind kind) {
    this.id = id;
    this.score = score;
    this.kind = kind;
  }

  /**
   * Id of the item being scored
   * @return
   */
  @JsonProperty("id")
  @Override
  public long id() {
    return id;
  }

  /**
   * score, typically between 0 and 1
   * @return
   */
  @JsonProperty("score")
  @Override
  public double score() {
    return score;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public ComplexityKind kind() {
    return kind;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ComplexityScore#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComplexityScore withId(long value) {
    if (this.id == value) return this;
    return new ImmutableComplexityScore(value, this.score, this.kind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ComplexityScore#score() score} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for score
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComplexityScore withScore(double value) {
    if (Double.doubleToLongBits(this.score) == Double.doubleToLongBits(value)) return this;
    return new ImmutableComplexityScore(this.id, value, this.kind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ComplexityScore#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComplexityScore withKind(ComplexityKind value) {
    if (this.kind == value) return this;
    ComplexityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableComplexityScore(this.id, this.score, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComplexityScore} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComplexityScore
        && equalTo((ImmutableComplexityScore) another);
  }

  private boolean equalTo(ImmutableComplexityScore another) {
    return id == another.id
        && Double.doubleToLongBits(score) == Double.doubleToLongBits(another.score)
        && kind.equals(another.kind);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code score}, {@code kind}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(id);
    h += (h << 5) + Double.hashCode(score);
    h += (h << 5) + kind.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ComplexityScore} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ComplexityScore{"
        + "id=" + id
        + ", score=" + score
        + ", kind=" + kind
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ComplexityScore {
    long id;
    boolean idIsSet;
    double score;
    boolean scoreIsSet;
    ComplexityKind kind;
    @JsonProperty("id")
    public void setId(long id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("score")
    public void setScore(double score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(ComplexityKind kind) {
      this.kind = kind;
    }
    @Override
    public long id() { throw new UnsupportedOperationException(); }
    @Override
    public double score() { throw new UnsupportedOperationException(); }
    @Override
    public ComplexityKind kind() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableComplexityScore fromJson(Json json) {
    ImmutableComplexityScore.Builder builder = ImmutableComplexityScore.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ComplexityScore} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ComplexityScore instance
   */
  public static ImmutableComplexityScore copyOf(ComplexityScore instance) {
    if (instance instanceof ImmutableComplexityScore) {
      return (ImmutableComplexityScore) instance;
    }
    return ImmutableComplexityScore.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableComplexityScore ImmutableComplexityScore}.
   * @return A new ImmutableComplexityScore builder
   */
  public static ImmutableComplexityScore.Builder builder() {
    return new ImmutableComplexityScore.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableComplexityScore ImmutableComplexityScore}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_SCORE = 0x2L;
    private static final long INIT_BIT_KIND = 0x4L;
    private long initBits = 0x7L;

    private long id;
    private double score;
    private ComplexityKind kind;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ComplexityScore} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ComplexityScore instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      score(instance.score());
      kind(instance.kind());
      return this;
    }

    /**
     * Initializes the value for the {@link ComplexityScore#id() id} attribute.
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
     * Initializes the value for the {@link ComplexityScore#score() score} attribute.
     * @param score The value for score 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("score")
    public final Builder score(double score) {
      this.score = score;
      initBits &= ~INIT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the value for the {@link ComplexityScore#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(ComplexityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Builds a new {@link ImmutableComplexityScore ImmutableComplexityScore}.
     * @return An immutable instance of ComplexityScore
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableComplexityScore build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableComplexityScore(id, score, kind);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_SCORE) != 0) attributes.add("score");
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      return "Cannot build ComplexityScore, some of required attributes are not set " + attributes;
    }
  }
}
