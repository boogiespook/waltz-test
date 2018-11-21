package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.command.CommandOutcome;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowDeleteCommandResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowDeleteCommandResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowDeleteCommandResponse"})
public final class ImmutablePhysicalFlowDeleteCommandResponse
    extends PhysicalFlowDeleteCommandResponse {
  private final boolean isSpecificationUnused;
  private final boolean isLastPhysicalFlow;
  private final EntityReference entityReference;
  private final PhysicalFlowDeleteCommand originalCommand;
  private final CommandOutcome outcome;
  private final String message;

  private ImmutablePhysicalFlowDeleteCommandResponse(ImmutablePhysicalFlowDeleteCommandResponse.Builder builder) {
    this.isSpecificationUnused = builder.isSpecificationUnused;
    this.isLastPhysicalFlow = builder.isLastPhysicalFlow;
    this.entityReference = builder.entityReference;
    this.originalCommand = builder.originalCommand;
    this.message = builder.message;
    this.outcome = builder.outcome != null
        ? builder.outcome
        : Objects.requireNonNull(super.outcome(), "outcome");
  }

  private ImmutablePhysicalFlowDeleteCommandResponse(
      boolean isSpecificationUnused,
      boolean isLastPhysicalFlow,
      EntityReference entityReference,
      PhysicalFlowDeleteCommand originalCommand,
      CommandOutcome outcome,
      String message) {
    this.isSpecificationUnused = isSpecificationUnused;
    this.isLastPhysicalFlow = isLastPhysicalFlow;
    this.entityReference = entityReference;
    this.originalCommand = originalCommand;
    this.outcome = outcome;
    this.message = message;
  }

  /**
   * @return The value of the {@code isSpecificationUnused} attribute
   */
  @JsonProperty("isSpecificationUnused")
  @Override
  public boolean isSpecificationUnused() {
    return isSpecificationUnused;
  }

  /**
   * @return The value of the {@code isLastPhysicalFlow} attribute
   */
  @JsonProperty("isLastPhysicalFlow")
  @Override
  public boolean isLastPhysicalFlow() {
    return isLastPhysicalFlow;
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code originalCommand} attribute
   */
  @JsonProperty("originalCommand")
  @Override
  public PhysicalFlowDeleteCommand originalCommand() {
    return originalCommand;
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public CommandOutcome outcome() {
    return outcome;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public Optional<String> message() {
    return Optional.ofNullable(message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowDeleteCommandResponse#isSpecificationUnused() isSpecificationUnused} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isSpecificationUnused
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withIsSpecificationUnused(boolean value) {
    if (this.isSpecificationUnused == value) return this;
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        value,
        this.isLastPhysicalFlow,
        this.entityReference,
        this.originalCommand,
        this.outcome,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowDeleteCommandResponse#isLastPhysicalFlow() isLastPhysicalFlow} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isLastPhysicalFlow
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withIsLastPhysicalFlow(boolean value) {
    if (this.isLastPhysicalFlow == value) return this;
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        this.isSpecificationUnused,
        value,
        this.entityReference,
        this.originalCommand,
        this.outcome,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowDeleteCommandResponse#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        this.isSpecificationUnused,
        this.isLastPhysicalFlow,
        newValue,
        this.originalCommand,
        this.outcome,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowDeleteCommandResponse#originalCommand() originalCommand} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originalCommand
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withOriginalCommand(PhysicalFlowDeleteCommand value) {
    if (this.originalCommand == value) return this;
    PhysicalFlowDeleteCommand newValue = Objects.requireNonNull(value, "originalCommand");
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        this.isSpecificationUnused,
        this.isLastPhysicalFlow,
        this.entityReference,
        newValue,
        this.outcome,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowDeleteCommandResponse#outcome() outcome} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withOutcome(CommandOutcome value) {
    if (this.outcome == value) return this;
    CommandOutcome newValue = Objects.requireNonNull(value, "outcome");
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        this.isSpecificationUnused,
        this.isLastPhysicalFlow,
        this.entityReference,
        this.originalCommand,
        newValue,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlowDeleteCommandResponse#message() message} attribute.
   * @param value The value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withMessage(String value) {
    String newValue = Objects.requireNonNull(value, "message");
    if (Objects.equals(this.message, newValue)) return this;
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        this.isSpecificationUnused,
        this.isLastPhysicalFlow,
        this.entityReference,
        this.originalCommand,
        this.outcome,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlowDeleteCommandResponse#message() message} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommandResponse withMessage(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.message, value)) return this;
    return new ImmutablePhysicalFlowDeleteCommandResponse(
        this.isSpecificationUnused,
        this.isLastPhysicalFlow,
        this.entityReference,
        this.originalCommand,
        this.outcome,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowDeleteCommandResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowDeleteCommandResponse
        && equalTo((ImmutablePhysicalFlowDeleteCommandResponse) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowDeleteCommandResponse another) {
    return isSpecificationUnused == another.isSpecificationUnused
        && isLastPhysicalFlow == another.isLastPhysicalFlow
        && entityReference.equals(another.entityReference)
        && originalCommand.equals(another.originalCommand)
        && outcome.equals(another.outcome)
        && Objects.equals(message, another.message);
  }

  /**
   * Computes a hash code from attributes: {@code isSpecificationUnused}, {@code isLastPhysicalFlow}, {@code entityReference}, {@code originalCommand}, {@code outcome}, {@code message}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Boolean.hashCode(isSpecificationUnused);
    h += (h << 5) + Boolean.hashCode(isLastPhysicalFlow);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + originalCommand.hashCode();
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + Objects.hashCode(message);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowDeleteCommandResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalFlowDeleteCommandResponse{");
    builder.append("isSpecificationUnused=").append(isSpecificationUnused);
    builder.append(", ");
    builder.append("isLastPhysicalFlow=").append(isLastPhysicalFlow);
    builder.append(", ");
    builder.append("entityReference=").append(entityReference);
    builder.append(", ");
    builder.append("originalCommand=").append(originalCommand);
    builder.append(", ");
    builder.append("outcome=").append(outcome);
    if (message != null) {
      builder.append(", ");
      builder.append("message=").append(message);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PhysicalFlowDeleteCommandResponse {
    boolean isSpecificationUnused;
    boolean isSpecificationUnusedIsSet;
    boolean isLastPhysicalFlow;
    boolean isLastPhysicalFlowIsSet;
    EntityReference entityReference;
    PhysicalFlowDeleteCommand originalCommand;
    CommandOutcome outcome;
    Optional<String> message = Optional.empty();
    @JsonProperty("isSpecificationUnused")
    public void setIsSpecificationUnused(boolean isSpecificationUnused) {
      this.isSpecificationUnused = isSpecificationUnused;
      this.isSpecificationUnusedIsSet = true;
    }
    @JsonProperty("isLastPhysicalFlow")
    public void setIsLastPhysicalFlow(boolean isLastPhysicalFlow) {
      this.isLastPhysicalFlow = isLastPhysicalFlow;
      this.isLastPhysicalFlowIsSet = true;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("originalCommand")
    public void setOriginalCommand(PhysicalFlowDeleteCommand originalCommand) {
      this.originalCommand = originalCommand;
    }
    @JsonProperty("outcome")
    public void setOutcome(CommandOutcome outcome) {
      this.outcome = outcome;
    }
    @JsonProperty("message")
    public void setMessage(Optional<String> message) {
      this.message = message;
    }
    @Override
    public boolean isSpecificationUnused() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isLastPhysicalFlow() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public PhysicalFlowDeleteCommand originalCommand() { throw new UnsupportedOperationException(); }
    @Override
    public CommandOutcome outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> message() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlowDeleteCommandResponse fromJson(Json json) {
    ImmutablePhysicalFlowDeleteCommandResponse.Builder builder = ImmutablePhysicalFlowDeleteCommandResponse.builder();
    if (json.isSpecificationUnusedIsSet) {
      builder.isSpecificationUnused(json.isSpecificationUnused);
    }
    if (json.isLastPhysicalFlowIsSet) {
      builder.isLastPhysicalFlow(json.isLastPhysicalFlow);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.originalCommand != null) {
      builder.originalCommand(json.originalCommand);
    }
    if (json.outcome != null) {
      builder.outcome(json.outcome);
    }
    if (json.message != null) {
      builder.message(json.message);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalFlowDeleteCommandResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowDeleteCommandResponse instance
   */
  public static ImmutablePhysicalFlowDeleteCommandResponse copyOf(PhysicalFlowDeleteCommandResponse instance) {
    if (instance instanceof ImmutablePhysicalFlowDeleteCommandResponse) {
      return (ImmutablePhysicalFlowDeleteCommandResponse) instance;
    }
    return ImmutablePhysicalFlowDeleteCommandResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowDeleteCommandResponse ImmutablePhysicalFlowDeleteCommandResponse}.
   * @return A new ImmutablePhysicalFlowDeleteCommandResponse builder
   */
  public static ImmutablePhysicalFlowDeleteCommandResponse.Builder builder() {
    return new ImmutablePhysicalFlowDeleteCommandResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowDeleteCommandResponse ImmutablePhysicalFlowDeleteCommandResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_IS_SPECIFICATION_UNUSED = 0x1L;
    private static final long INIT_BIT_IS_LAST_PHYSICAL_FLOW = 0x2L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x4L;
    private static final long INIT_BIT_ORIGINAL_COMMAND = 0x8L;
    private long initBits = 0xfL;

    private boolean isSpecificationUnused;
    private boolean isLastPhysicalFlow;
    private EntityReference entityReference;
    private PhysicalFlowDeleteCommand originalCommand;
    private CommandOutcome outcome;
    private String message;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalFlowDeleteCommandResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowDeleteCommandResponse instance) {
      Objects.requireNonNull(instance, "instance");
      isSpecificationUnused(instance.isSpecificationUnused());
      isLastPhysicalFlow(instance.isLastPhysicalFlow());
      entityReference(instance.entityReference());
      originalCommand(instance.originalCommand());
      outcome(instance.outcome());
      Optional<String> messageOptional = instance.message();
      if (messageOptional.isPresent()) {
        message(messageOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowDeleteCommandResponse#isSpecificationUnused() isSpecificationUnused} attribute.
     * @param isSpecificationUnused The value for isSpecificationUnused 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isSpecificationUnused")
    public final Builder isSpecificationUnused(boolean isSpecificationUnused) {
      this.isSpecificationUnused = isSpecificationUnused;
      initBits &= ~INIT_BIT_IS_SPECIFICATION_UNUSED;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowDeleteCommandResponse#isLastPhysicalFlow() isLastPhysicalFlow} attribute.
     * @param isLastPhysicalFlow The value for isLastPhysicalFlow 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isLastPhysicalFlow")
    public final Builder isLastPhysicalFlow(boolean isLastPhysicalFlow) {
      this.isLastPhysicalFlow = isLastPhysicalFlow;
      initBits &= ~INIT_BIT_IS_LAST_PHYSICAL_FLOW;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowDeleteCommandResponse#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowDeleteCommandResponse#originalCommand() originalCommand} attribute.
     * @param originalCommand The value for originalCommand 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("originalCommand")
    public final Builder originalCommand(PhysicalFlowDeleteCommand originalCommand) {
      this.originalCommand = Objects.requireNonNull(originalCommand, "originalCommand");
      initBits &= ~INIT_BIT_ORIGINAL_COMMAND;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowDeleteCommandResponse#outcome() outcome} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalFlowDeleteCommandResponse#outcome() outcome}.</em>
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(CommandOutcome outcome) {
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlowDeleteCommandResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for chained invocation
     */
    public final Builder message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlowDeleteCommandResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(Optional<String> message) {
      this.message = message.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowDeleteCommandResponse ImmutablePhysicalFlowDeleteCommandResponse}.
     * @return An immutable instance of PhysicalFlowDeleteCommandResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowDeleteCommandResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowDeleteCommandResponse(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_IS_SPECIFICATION_UNUSED) != 0) attributes.add("isSpecificationUnused");
      if ((initBits & INIT_BIT_IS_LAST_PHYSICAL_FLOW) != 0) attributes.add("isLastPhysicalFlow");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_ORIGINAL_COMMAND) != 0) attributes.add("originalCommand");
      return "Cannot build PhysicalFlowDeleteCommandResponse, some of required attributes are not set " + attributes;
    }
  }
}
