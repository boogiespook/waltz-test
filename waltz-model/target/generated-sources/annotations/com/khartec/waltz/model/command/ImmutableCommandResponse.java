package com.khartec.waltz.model.command;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link CommandResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommandResponse.<T>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "CommandResponse<T>"})
public final class ImmutableCommandResponse<T extends Command>
    extends CommandResponse<T> {
  private final EntityReference entityReference;
  private final T originalCommand;
  private final CommandOutcome outcome;
  private final String message;

  private ImmutableCommandResponse(ImmutableCommandResponse.Builder<T> builder) {
    this.entityReference = builder.entityReference;
    this.originalCommand = builder.originalCommand;
    this.message = builder.message;
    this.outcome = builder.outcome != null
        ? builder.outcome
        : Objects.requireNonNull(super.outcome(), "outcome");
  }

  private ImmutableCommandResponse(
      EntityReference entityReference,
      T originalCommand,
      CommandOutcome outcome,
      String message) {
    this.entityReference = entityReference;
    this.originalCommand = originalCommand;
    this.outcome = outcome;
    this.message = message;
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
  public T originalCommand() {
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
   * Copy the current immutable object by setting a value for the {@link CommandResponse#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommandResponse<T> withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableCommandResponse<T>(newValue, this.originalCommand, this.outcome, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommandResponse#originalCommand() originalCommand} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originalCommand
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommandResponse<T> withOriginalCommand(T value) {
    if (this.originalCommand == value) return this;
    T newValue = Objects.requireNonNull(value, "originalCommand");
    return new ImmutableCommandResponse<T>(this.entityReference, newValue, this.outcome, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommandResponse#outcome() outcome} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommandResponse<T> withOutcome(CommandOutcome value) {
    if (this.outcome == value) return this;
    CommandOutcome newValue = Objects.requireNonNull(value, "outcome");
    return new ImmutableCommandResponse<T>(this.entityReference, this.originalCommand, newValue, this.message);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommandResponse#message() message} attribute.
   * @param value The value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommandResponse<T> withMessage(String value) {
    String newValue = Objects.requireNonNull(value, "message");
    if (Objects.equals(this.message, newValue)) return this;
    return new ImmutableCommandResponse<T>(this.entityReference, this.originalCommand, this.outcome, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommandResponse#message() message} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommandResponse<T> withMessage(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.message, value)) return this;
    return new ImmutableCommandResponse<T>(this.entityReference, this.originalCommand, this.outcome, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommandResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommandResponse<?>
        && equalTo((ImmutableCommandResponse<T>) another);
  }

  private boolean equalTo(ImmutableCommandResponse<T> another) {
    return entityReference.equals(another.entityReference)
        && originalCommand.equals(another.originalCommand)
        && outcome.equals(another.outcome)
        && Objects.equals(message, another.message);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code originalCommand}, {@code outcome}, {@code message}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + originalCommand.hashCode();
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + Objects.hashCode(message);
    return h;
  }

  /**
   * Prints the immutable value {@code CommandResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CommandResponse{");
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
  static final class Json<T extends Command>
      extends CommandResponse<T> {
    EntityReference entityReference;
    T originalCommand;
    CommandOutcome outcome;
    Optional<String> message = Optional.empty();
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("originalCommand")
    public void setOriginalCommand(T originalCommand) {
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
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public T originalCommand() { throw new UnsupportedOperationException(); }
    @Override
    public CommandOutcome outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> message() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param <T> generic parameter T
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static <T extends Command> ImmutableCommandResponse<T> fromJson(Json<T> json) {
    ImmutableCommandResponse.Builder<T> builder = ImmutableCommandResponse.<T>builder();
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
   * Creates an immutable copy of a {@link CommandResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <T> generic parameter T
   * @param instance The instance to copy
   * @return A copied immutable CommandResponse instance
   */
  public static <T extends Command> ImmutableCommandResponse<T> copyOf(CommandResponse<T> instance) {
    if (instance instanceof ImmutableCommandResponse<?>) {
      return (ImmutableCommandResponse<T>) instance;
    }
    return ImmutableCommandResponse.<T>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCommandResponse ImmutableCommandResponse}.
   * @param <T> generic parameter T
   * @return A new ImmutableCommandResponse builder
   */
  public static <T extends Command> ImmutableCommandResponse.Builder<T> builder() {
    return new ImmutableCommandResponse.Builder<T>();
  }

  /**
   * Builds instances of type {@link ImmutableCommandResponse ImmutableCommandResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<T extends Command> {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_ORIGINAL_COMMAND = 0x2L;
    private long initBits = 0x3L;

    private EntityReference entityReference;
    private T originalCommand;
    private CommandOutcome outcome;
    private String message;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CommandResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> from(CommandResponse<T> instance) {
      Objects.requireNonNull(instance, "instance");
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
     * Initializes the value for the {@link CommandResponse#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder<T> entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link CommandResponse#originalCommand() originalCommand} attribute.
     * @param originalCommand The value for originalCommand 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("originalCommand")
    public final Builder<T> originalCommand(T originalCommand) {
      this.originalCommand = Objects.requireNonNull(originalCommand, "originalCommand");
      initBits &= ~INIT_BIT_ORIGINAL_COMMAND;
      return this;
    }

    /**
     * Initializes the value for the {@link CommandResponse#outcome() outcome} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CommandResponse#outcome() outcome}.</em>
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder<T> outcome(CommandOutcome outcome) {
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      return this;
    }

    /**
     * Initializes the optional value {@link CommandResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for chained invocation
     */
    public final Builder<T> message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      return this;
    }

    /**
     * Initializes the optional value {@link CommandResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder<T> message(Optional<String> message) {
      this.message = message.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableCommandResponse ImmutableCommandResponse}.
     * @return An immutable instance of CommandResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCommandResponse<T> build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCommandResponse<T>(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_ORIGINAL_COMMAND) != 0) attributes.add("originalCommand");
      return "Cannot build CommandResponse, some of required attributes are not set " + attributes;
    }
  }
}
