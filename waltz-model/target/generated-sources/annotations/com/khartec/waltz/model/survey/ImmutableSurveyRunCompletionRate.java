package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyRunCompletionRate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyRunCompletionRate.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyRunCompletionRate"})
public final class ImmutableSurveyRunCompletionRate
    extends SurveyRunCompletionRate {
  private final int notStartedCount;
  private final int inProgressCount;
  private final int completedCount;
  private final int expiredCount;

  private ImmutableSurveyRunCompletionRate(int notStartedCount, int inProgressCount, int completedCount, int expiredCount) {
    this.notStartedCount = notStartedCount;
    this.inProgressCount = inProgressCount;
    this.completedCount = completedCount;
    this.expiredCount = expiredCount;
  }

  /**
   * @return The value of the {@code notStartedCount} attribute
   */
  @JsonProperty("notStartedCount")
  @Override
  public int notStartedCount() {
    return notStartedCount;
  }

  /**
   * @return The value of the {@code inProgressCount} attribute
   */
  @JsonProperty("inProgressCount")
  @Override
  public int inProgressCount() {
    return inProgressCount;
  }

  /**
   * @return The value of the {@code completedCount} attribute
   */
  @JsonProperty("completedCount")
  @Override
  public int completedCount() {
    return completedCount;
  }

  /**
   * @return The value of the {@code expiredCount} attribute
   */
  @JsonProperty("expiredCount")
  @Override
  public int expiredCount() {
    return expiredCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunCompletionRate#notStartedCount() notStartedCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for notStartedCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunCompletionRate withNotStartedCount(int value) {
    if (this.notStartedCount == value) return this;
    return new ImmutableSurveyRunCompletionRate(value, this.inProgressCount, this.completedCount, this.expiredCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunCompletionRate#inProgressCount() inProgressCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for inProgressCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunCompletionRate withInProgressCount(int value) {
    if (this.inProgressCount == value) return this;
    return new ImmutableSurveyRunCompletionRate(this.notStartedCount, value, this.completedCount, this.expiredCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunCompletionRate#completedCount() completedCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for completedCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunCompletionRate withCompletedCount(int value) {
    if (this.completedCount == value) return this;
    return new ImmutableSurveyRunCompletionRate(this.notStartedCount, this.inProgressCount, value, this.expiredCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunCompletionRate#expiredCount() expiredCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expiredCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunCompletionRate withExpiredCount(int value) {
    if (this.expiredCount == value) return this;
    return new ImmutableSurveyRunCompletionRate(this.notStartedCount, this.inProgressCount, this.completedCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyRunCompletionRate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyRunCompletionRate
        && equalTo((ImmutableSurveyRunCompletionRate) another);
  }

  private boolean equalTo(ImmutableSurveyRunCompletionRate another) {
    return notStartedCount == another.notStartedCount
        && inProgressCount == another.inProgressCount
        && completedCount == another.completedCount
        && expiredCount == another.expiredCount;
  }

  /**
   * Computes a hash code from attributes: {@code notStartedCount}, {@code inProgressCount}, {@code completedCount}, {@code expiredCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + notStartedCount;
    h += (h << 5) + inProgressCount;
    h += (h << 5) + completedCount;
    h += (h << 5) + expiredCount;
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyRunCompletionRate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SurveyRunCompletionRate{"
        + "notStartedCount=" + notStartedCount
        + ", inProgressCount=" + inProgressCount
        + ", completedCount=" + completedCount
        + ", expiredCount=" + expiredCount
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyRunCompletionRate {
    int notStartedCount;
    boolean notStartedCountIsSet;
    int inProgressCount;
    boolean inProgressCountIsSet;
    int completedCount;
    boolean completedCountIsSet;
    int expiredCount;
    boolean expiredCountIsSet;
    @JsonProperty("notStartedCount")
    public void setNotStartedCount(int notStartedCount) {
      this.notStartedCount = notStartedCount;
      this.notStartedCountIsSet = true;
    }
    @JsonProperty("inProgressCount")
    public void setInProgressCount(int inProgressCount) {
      this.inProgressCount = inProgressCount;
      this.inProgressCountIsSet = true;
    }
    @JsonProperty("completedCount")
    public void setCompletedCount(int completedCount) {
      this.completedCount = completedCount;
      this.completedCountIsSet = true;
    }
    @JsonProperty("expiredCount")
    public void setExpiredCount(int expiredCount) {
      this.expiredCount = expiredCount;
      this.expiredCountIsSet = true;
    }
    @Override
    public int notStartedCount() { throw new UnsupportedOperationException(); }
    @Override
    public int inProgressCount() { throw new UnsupportedOperationException(); }
    @Override
    public int completedCount() { throw new UnsupportedOperationException(); }
    @Override
    public int expiredCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyRunCompletionRate fromJson(Json json) {
    ImmutableSurveyRunCompletionRate.Builder builder = ImmutableSurveyRunCompletionRate.builder();
    if (json.notStartedCountIsSet) {
      builder.notStartedCount(json.notStartedCount);
    }
    if (json.inProgressCountIsSet) {
      builder.inProgressCount(json.inProgressCount);
    }
    if (json.completedCountIsSet) {
      builder.completedCount(json.completedCount);
    }
    if (json.expiredCountIsSet) {
      builder.expiredCount(json.expiredCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyRunCompletionRate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyRunCompletionRate instance
   */
  public static ImmutableSurveyRunCompletionRate copyOf(SurveyRunCompletionRate instance) {
    if (instance instanceof ImmutableSurveyRunCompletionRate) {
      return (ImmutableSurveyRunCompletionRate) instance;
    }
    return ImmutableSurveyRunCompletionRate.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyRunCompletionRate ImmutableSurveyRunCompletionRate}.
   * @return A new ImmutableSurveyRunCompletionRate builder
   */
  public static ImmutableSurveyRunCompletionRate.Builder builder() {
    return new ImmutableSurveyRunCompletionRate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyRunCompletionRate ImmutableSurveyRunCompletionRate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NOT_STARTED_COUNT = 0x1L;
    private static final long INIT_BIT_IN_PROGRESS_COUNT = 0x2L;
    private static final long INIT_BIT_COMPLETED_COUNT = 0x4L;
    private static final long INIT_BIT_EXPIRED_COUNT = 0x8L;
    private long initBits = 0xfL;

    private int notStartedCount;
    private int inProgressCount;
    private int completedCount;
    private int expiredCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyRunCompletionRate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyRunCompletionRate instance) {
      Objects.requireNonNull(instance, "instance");
      notStartedCount(instance.notStartedCount());
      inProgressCount(instance.inProgressCount());
      completedCount(instance.completedCount());
      expiredCount(instance.expiredCount());
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunCompletionRate#notStartedCount() notStartedCount} attribute.
     * @param notStartedCount The value for notStartedCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("notStartedCount")
    public final Builder notStartedCount(int notStartedCount) {
      this.notStartedCount = notStartedCount;
      initBits &= ~INIT_BIT_NOT_STARTED_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunCompletionRate#inProgressCount() inProgressCount} attribute.
     * @param inProgressCount The value for inProgressCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inProgressCount")
    public final Builder inProgressCount(int inProgressCount) {
      this.inProgressCount = inProgressCount;
      initBits &= ~INIT_BIT_IN_PROGRESS_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunCompletionRate#completedCount() completedCount} attribute.
     * @param completedCount The value for completedCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("completedCount")
    public final Builder completedCount(int completedCount) {
      this.completedCount = completedCount;
      initBits &= ~INIT_BIT_COMPLETED_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunCompletionRate#expiredCount() expiredCount} attribute.
     * @param expiredCount The value for expiredCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expiredCount")
    public final Builder expiredCount(int expiredCount) {
      this.expiredCount = expiredCount;
      initBits &= ~INIT_BIT_EXPIRED_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyRunCompletionRate ImmutableSurveyRunCompletionRate}.
     * @return An immutable instance of SurveyRunCompletionRate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyRunCompletionRate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyRunCompletionRate(notStartedCount, inProgressCount, completedCount, expiredCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NOT_STARTED_COUNT) != 0) attributes.add("notStartedCount");
      if ((initBits & INIT_BIT_IN_PROGRESS_COUNT) != 0) attributes.add("inProgressCount");
      if ((initBits & INIT_BIT_COMPLETED_COUNT) != 0) attributes.add("completedCount");
      if ((initBits & INIT_BIT_EXPIRED_COUNT) != 0) attributes.add("expiredCount");
      return "Cannot build SurveyRunCompletionRate, some of required attributes are not set " + attributes;
    }
  }
}
