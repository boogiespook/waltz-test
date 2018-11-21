package com.khartec.waltz.model.scenario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link CloneScenarioCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCloneScenarioCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "CloneScenarioCommand"})
public final class ImmutableCloneScenarioCommand extends CloneScenarioCommand {
  private final long scenarioId;
  private final String userId;
  private final String newName;

  private ImmutableCloneScenarioCommand(long scenarioId, String userId, String newName) {
    this.scenarioId = scenarioId;
    this.userId = userId;
    this.newName = newName;
  }

  /**
   * @return The value of the {@code scenarioId} attribute
   */
  @Override
  public long scenarioId() {
    return scenarioId;
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @Override
  public String userId() {
    return userId;
  }

  /**
   * @return The value of the {@code newName} attribute
   */
  @Override
  public String newName() {
    return newName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CloneScenarioCommand#scenarioId() scenarioId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenarioId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCloneScenarioCommand withScenarioId(long value) {
    if (this.scenarioId == value) return this;
    return new ImmutableCloneScenarioCommand(value, this.userId, this.newName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CloneScenarioCommand#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCloneScenarioCommand withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableCloneScenarioCommand(this.scenarioId, newValue, this.newName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CloneScenarioCommand#newName() newName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCloneScenarioCommand withNewName(String value) {
    if (this.newName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "newName");
    return new ImmutableCloneScenarioCommand(this.scenarioId, this.userId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCloneScenarioCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCloneScenarioCommand
        && equalTo((ImmutableCloneScenarioCommand) another);
  }

  private boolean equalTo(ImmutableCloneScenarioCommand another) {
    return scenarioId == another.scenarioId
        && userId.equals(another.userId)
        && newName.equals(another.newName);
  }

  /**
   * Computes a hash code from attributes: {@code scenarioId}, {@code userId}, {@code newName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(scenarioId);
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + newName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CloneScenarioCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CloneScenarioCommand{"
        + "scenarioId=" + scenarioId
        + ", userId=" + userId
        + ", newName=" + newName
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link CloneScenarioCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CloneScenarioCommand instance
   */
  public static ImmutableCloneScenarioCommand copyOf(CloneScenarioCommand instance) {
    if (instance instanceof ImmutableCloneScenarioCommand) {
      return (ImmutableCloneScenarioCommand) instance;
    }
    return ImmutableCloneScenarioCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCloneScenarioCommand ImmutableCloneScenarioCommand}.
   * @return A new ImmutableCloneScenarioCommand builder
   */
  public static ImmutableCloneScenarioCommand.Builder builder() {
    return new ImmutableCloneScenarioCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCloneScenarioCommand ImmutableCloneScenarioCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SCENARIO_ID = 0x1L;
    private static final long INIT_BIT_USER_ID = 0x2L;
    private static final long INIT_BIT_NEW_NAME = 0x4L;
    private long initBits = 0x7L;

    private long scenarioId;
    private String userId;
    private String newName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CloneScenarioCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CloneScenarioCommand instance) {
      Objects.requireNonNull(instance, "instance");
      scenarioId(instance.scenarioId());
      userId(instance.userId());
      newName(instance.newName());
      return this;
    }

    /**
     * Initializes the value for the {@link CloneScenarioCommand#scenarioId() scenarioId} attribute.
     * @param scenarioId The value for scenarioId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder scenarioId(long scenarioId) {
      this.scenarioId = scenarioId;
      initBits &= ~INIT_BIT_SCENARIO_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link CloneScenarioCommand#userId() userId} attribute.
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userId(String userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      initBits &= ~INIT_BIT_USER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link CloneScenarioCommand#newName() newName} attribute.
     * @param newName The value for newName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder newName(String newName) {
      this.newName = Objects.requireNonNull(newName, "newName");
      initBits &= ~INIT_BIT_NEW_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCloneScenarioCommand ImmutableCloneScenarioCommand}.
     * @return An immutable instance of CloneScenarioCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCloneScenarioCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCloneScenarioCommand(scenarioId, userId, newName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SCENARIO_ID) != 0) attributes.add("scenarioId");
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_NEW_NAME) != 0) attributes.add("newName");
      return "Cannot build CloneScenarioCommand, some of required attributes are not set " + attributes;
    }
  }
}
