package com.khartec.waltz.model.checkpoint;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link CheckpointGoal}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCheckpointGoal.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "CheckpointGoal"})
public final class ImmutableCheckpointGoal extends CheckpointGoal {
  private final long checkpointId;
  private final double value;
  private final GoalType goalType;

  private ImmutableCheckpointGoal(long checkpointId, double value, GoalType goalType) {
    this.checkpointId = checkpointId;
    this.value = value;
    this.goalType = goalType;
  }

  /**
   * @return The value of the {@code checkpointId} attribute
   */
  @JsonProperty("checkpointId")
  @Override
  public long checkpointId() {
    return checkpointId;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public double value() {
    return value;
  }

  /**
   * @return The value of the {@code goalType} attribute
   */
  @JsonProperty("goalType")
  @Override
  public GoalType goalType() {
    return goalType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CheckpointGoal#checkpointId() checkpointId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for checkpointId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpointGoal withCheckpointId(long value) {
    if (this.checkpointId == value) return this;
    return new ImmutableCheckpointGoal(value, this.value, this.goalType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CheckpointGoal#value() value} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpointGoal withValue(double value) {
    if (Double.doubleToLongBits(this.value) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCheckpointGoal(this.checkpointId, value, this.goalType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CheckpointGoal#goalType() goalType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for goalType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpointGoal withGoalType(GoalType value) {
    if (this.goalType == value) return this;
    GoalType newValue = Objects.requireNonNull(value, "goalType");
    return new ImmutableCheckpointGoal(this.checkpointId, this.value, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCheckpointGoal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCheckpointGoal
        && equalTo((ImmutableCheckpointGoal) another);
  }

  private boolean equalTo(ImmutableCheckpointGoal another) {
    return checkpointId == another.checkpointId
        && Double.doubleToLongBits(value) == Double.doubleToLongBits(another.value)
        && goalType.equals(another.goalType);
  }

  /**
   * Computes a hash code from attributes: {@code checkpointId}, {@code value}, {@code goalType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(checkpointId);
    h += (h << 5) + Double.hashCode(value);
    h += (h << 5) + goalType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CheckpointGoal} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CheckpointGoal{"
        + "checkpointId=" + checkpointId
        + ", value=" + value
        + ", goalType=" + goalType
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends CheckpointGoal {
    long checkpointId;
    boolean checkpointIdIsSet;
    double value;
    boolean valueIsSet;
    GoalType goalType;
    @JsonProperty("checkpointId")
    public void setCheckpointId(long checkpointId) {
      this.checkpointId = checkpointId;
      this.checkpointIdIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(double value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("goalType")
    public void setGoalType(GoalType goalType) {
      this.goalType = goalType;
    }
    @Override
    public long checkpointId() { throw new UnsupportedOperationException(); }
    @Override
    public double value() { throw new UnsupportedOperationException(); }
    @Override
    public GoalType goalType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCheckpointGoal fromJson(Json json) {
    ImmutableCheckpointGoal.Builder builder = ImmutableCheckpointGoal.builder();
    if (json.checkpointIdIsSet) {
      builder.checkpointId(json.checkpointId);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.goalType != null) {
      builder.goalType(json.goalType);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CheckpointGoal} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CheckpointGoal instance
   */
  public static ImmutableCheckpointGoal copyOf(CheckpointGoal instance) {
    if (instance instanceof ImmutableCheckpointGoal) {
      return (ImmutableCheckpointGoal) instance;
    }
    return ImmutableCheckpointGoal.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCheckpointGoal ImmutableCheckpointGoal}.
   * @return A new ImmutableCheckpointGoal builder
   */
  public static ImmutableCheckpointGoal.Builder builder() {
    return new ImmutableCheckpointGoal.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCheckpointGoal ImmutableCheckpointGoal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CHECKPOINT_ID = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private static final long INIT_BIT_GOAL_TYPE = 0x4L;
    private long initBits = 0x7L;

    private long checkpointId;
    private double value;
    private GoalType goalType;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CheckpointGoal} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CheckpointGoal instance) {
      Objects.requireNonNull(instance, "instance");
      checkpointId(instance.checkpointId());
      value(instance.value());
      goalType(instance.goalType());
      return this;
    }

    /**
     * Initializes the value for the {@link CheckpointGoal#checkpointId() checkpointId} attribute.
     * @param checkpointId The value for checkpointId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("checkpointId")
    public final Builder checkpointId(long checkpointId) {
      this.checkpointId = checkpointId;
      initBits &= ~INIT_BIT_CHECKPOINT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link CheckpointGoal#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(double value) {
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link CheckpointGoal#goalType() goalType} attribute.
     * @param goalType The value for goalType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("goalType")
    public final Builder goalType(GoalType goalType) {
      this.goalType = Objects.requireNonNull(goalType, "goalType");
      initBits &= ~INIT_BIT_GOAL_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCheckpointGoal ImmutableCheckpointGoal}.
     * @return An immutable instance of CheckpointGoal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCheckpointGoal build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCheckpointGoal(checkpointId, value, goalType);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CHECKPOINT_ID) != 0) attributes.add("checkpointId");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_GOAL_TYPE) != 0) attributes.add("goalType");
      return "Cannot build CheckpointGoal, some of required attributes are not set " + attributes;
    }
  }
}
