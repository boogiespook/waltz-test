package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.command.CommandOutcome;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowUploadCommandResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowUploadCommandResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowUploadCommandResponse"})
public final class ImmutablePhysicalFlowUploadCommandResponse
    extends PhysicalFlowUploadCommandResponse {
  private final @Nullable EntityReference entityReference;
  private final PhysicalFlowParsed parsedFlow;
  private final Map<String, String> errors;
  private final PhysicalFlowUploadCommand originalCommand;
  private final CommandOutcome outcome;
  private final String message;

  private ImmutablePhysicalFlowUploadCommandResponse(ImmutablePhysicalFlowUploadCommandResponse.Builder builder) {
    this.entityReference = builder.entityReference;
    this.parsedFlow = builder.parsedFlow;
    this.errors = createUnmodifiableMap(false, false, builder.errors);
    this.originalCommand = builder.originalCommand;
    this.message = builder.message;
    this.outcome = builder.outcome != null
        ? builder.outcome
        : Objects.requireNonNull(super.outcome(), "outcome");
  }

  private ImmutablePhysicalFlowUploadCommandResponse(
      @Nullable EntityReference entityReference,
      PhysicalFlowParsed parsedFlow,
      Map<String, String> errors,
      PhysicalFlowUploadCommand originalCommand,
      CommandOutcome outcome,
      String message) {
    this.entityReference = entityReference;
    this.parsedFlow = parsedFlow;
    this.errors = errors;
    this.originalCommand = originalCommand;
    this.outcome = outcome;
    this.message = message;
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public @Nullable EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code parsedFlow} attribute
   */
  @JsonProperty("parsedFlow")
  @Override
  public PhysicalFlowParsed parsedFlow() {
    return parsedFlow;
  }

  /**
   * @return The value of the {@code errors} attribute
   */
  @JsonProperty("errors")
  @Override
  public Map<String, String> errors() {
    return errors;
  }

  /**
   * @return The value of the {@code originalCommand} attribute
   */
  @JsonProperty("originalCommand")
  @Override
  public PhysicalFlowUploadCommand originalCommand() {
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommandResponse#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withEntityReference(@Nullable EntityReference value) {
    if (this.entityReference == value) return this;
    return new ImmutablePhysicalFlowUploadCommandResponse(value, this.parsedFlow, this.errors, this.originalCommand, this.outcome, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommandResponse#parsedFlow() parsedFlow} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parsedFlow
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withParsedFlow(PhysicalFlowParsed value) {
    if (this.parsedFlow == value) return this;
    PhysicalFlowParsed newValue = Objects.requireNonNull(value, "parsedFlow");
    return new ImmutablePhysicalFlowUploadCommandResponse(this.entityReference, newValue, this.errors, this.originalCommand, this.outcome, this.message);
  }

  /**
   * Copy the current immutable object by replacing the {@link PhysicalFlowUploadCommandResponse#errors() errors} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the errors map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withErrors(Map<String, ? extends String> entries) {
    if (this.errors == entries) return this;
    Map<String, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutablePhysicalFlowUploadCommandResponse(
        this.entityReference,
        this.parsedFlow,
        newValue,
        this.originalCommand,
        this.outcome,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommandResponse#originalCommand() originalCommand} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originalCommand
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withOriginalCommand(PhysicalFlowUploadCommand value) {
    if (this.originalCommand == value) return this;
    PhysicalFlowUploadCommand newValue = Objects.requireNonNull(value, "originalCommand");
    return new ImmutablePhysicalFlowUploadCommandResponse(this.entityReference, this.parsedFlow, this.errors, newValue, this.outcome, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommandResponse#outcome() outcome} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withOutcome(CommandOutcome value) {
    if (this.outcome == value) return this;
    CommandOutcome newValue = Objects.requireNonNull(value, "outcome");
    return new ImmutablePhysicalFlowUploadCommandResponse(
        this.entityReference,
        this.parsedFlow,
        this.errors,
        this.originalCommand,
        newValue,
        this.message);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalFlowUploadCommandResponse#message() message} attribute.
   * @param value The value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withMessage(String value) {
    String newValue = Objects.requireNonNull(value, "message");
    if (Objects.equals(this.message, newValue)) return this;
    return new ImmutablePhysicalFlowUploadCommandResponse(
        this.entityReference,
        this.parsedFlow,
        this.errors,
        this.originalCommand,
        this.outcome,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalFlowUploadCommandResponse#message() message} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommandResponse withMessage(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.message, value)) return this;
    return new ImmutablePhysicalFlowUploadCommandResponse(this.entityReference, this.parsedFlow, this.errors, this.originalCommand, this.outcome, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowUploadCommandResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowUploadCommandResponse
        && equalTo((ImmutablePhysicalFlowUploadCommandResponse) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowUploadCommandResponse another) {
    return Objects.equals(entityReference, another.entityReference)
        && parsedFlow.equals(another.parsedFlow)
        && errors.equals(another.errors)
        && originalCommand.equals(another.originalCommand)
        && outcome.equals(another.outcome)
        && Objects.equals(message, another.message);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code parsedFlow}, {@code errors}, {@code originalCommand}, {@code outcome}, {@code message}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(entityReference);
    h += (h << 5) + parsedFlow.hashCode();
    h += (h << 5) + errors.hashCode();
    h += (h << 5) + originalCommand.hashCode();
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + Objects.hashCode(message);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowUploadCommandResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalFlowUploadCommandResponse{");
    if (entityReference != null) {
      builder.append("entityReference=").append(entityReference);
    }
    if (builder.length() > 34) builder.append(", ");
    builder.append("parsedFlow=").append(parsedFlow);
    builder.append(", ");
    builder.append("errors=").append(errors);
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
  static final class Json extends PhysicalFlowUploadCommandResponse {
    EntityReference entityReference;
    PhysicalFlowParsed parsedFlow;
    Map<String, String> errors = Collections.emptyMap();
    PhysicalFlowUploadCommand originalCommand;
    CommandOutcome outcome;
    Optional<String> message = Optional.empty();
    @JsonProperty("entityReference")
    public void setEntityReference(@Nullable EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("parsedFlow")
    public void setParsedFlow(PhysicalFlowParsed parsedFlow) {
      this.parsedFlow = parsedFlow;
    }
    @JsonProperty("errors")
    public void setErrors(Map<String, String> errors) {
      this.errors = errors;
    }
    @JsonProperty("originalCommand")
    public void setOriginalCommand(PhysicalFlowUploadCommand originalCommand) {
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
    public PhysicalFlowParsed parsedFlow() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, String> errors() { throw new UnsupportedOperationException(); }
    @Override
    public PhysicalFlowUploadCommand originalCommand() { throw new UnsupportedOperationException(); }
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
  static ImmutablePhysicalFlowUploadCommandResponse fromJson(Json json) {
    ImmutablePhysicalFlowUploadCommandResponse.Builder builder = ImmutablePhysicalFlowUploadCommandResponse.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.parsedFlow != null) {
      builder.parsedFlow(json.parsedFlow);
    }
    if (json.errors != null) {
      builder.putAllErrors(json.errors);
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
   * Creates an immutable copy of a {@link PhysicalFlowUploadCommandResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowUploadCommandResponse instance
   */
  public static ImmutablePhysicalFlowUploadCommandResponse copyOf(PhysicalFlowUploadCommandResponse instance) {
    if (instance instanceof ImmutablePhysicalFlowUploadCommandResponse) {
      return (ImmutablePhysicalFlowUploadCommandResponse) instance;
    }
    return ImmutablePhysicalFlowUploadCommandResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowUploadCommandResponse ImmutablePhysicalFlowUploadCommandResponse}.
   * @return A new ImmutablePhysicalFlowUploadCommandResponse builder
   */
  public static ImmutablePhysicalFlowUploadCommandResponse.Builder builder() {
    return new ImmutablePhysicalFlowUploadCommandResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowUploadCommandResponse ImmutablePhysicalFlowUploadCommandResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PARSED_FLOW = 0x1L;
    private static final long INIT_BIT_ORIGINAL_COMMAND = 0x2L;
    private long initBits = 0x3L;

    private EntityReference entityReference;
    private PhysicalFlowParsed parsedFlow;
    private Map<String, String> errors = new LinkedHashMap<String, String>();
    private PhysicalFlowUploadCommand originalCommand;
    private CommandOutcome outcome;
    private String message;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalFlowUploadCommandResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowUploadCommandResponse instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable EntityReference entityReferenceValue = instance.entityReference();
      if (entityReferenceValue != null) {
        entityReference(entityReferenceValue);
      }
      parsedFlow(instance.parsedFlow());
      putAllErrors(instance.errors());
      originalCommand(instance.originalCommand());
      outcome(instance.outcome());
      Optional<String> messageOptional = instance.message();
      if (messageOptional.isPresent()) {
        message(messageOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommandResponse#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(@Nullable EntityReference entityReference) {
      this.entityReference = entityReference;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommandResponse#parsedFlow() parsedFlow} attribute.
     * @param parsedFlow The value for parsedFlow 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parsedFlow")
    public final Builder parsedFlow(PhysicalFlowParsed parsedFlow) {
      this.parsedFlow = Objects.requireNonNull(parsedFlow, "parsedFlow");
      initBits &= ~INIT_BIT_PARSED_FLOW;
      return this;
    }

    /**
     * Put one entry to the {@link PhysicalFlowUploadCommandResponse#errors() errors} map.
     * @param key The key in the errors map
     * @param value The associated value in the errors map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putErrors(String key, String value) {
      this.errors.put(
          Objects.requireNonNull(key, "errors key"),
          Objects.requireNonNull(value, "errors value"));
      return this;
    }

    /**
     * Put one entry to the {@link PhysicalFlowUploadCommandResponse#errors() errors} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putErrors(Map.Entry<String, ? extends String> entry) {
      String k = entry.getKey();
      String v = entry.getValue();
      this.errors.put(
          Objects.requireNonNull(k, "errors key"),
          Objects.requireNonNull(v, "errors value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PhysicalFlowUploadCommandResponse#errors() errors} map. Nulls are not permitted
     * @param errors The entries that will be added to the errors map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("errors")
    public final Builder errors(Map<String, ? extends String> errors) {
      this.errors.clear();
      return putAllErrors(errors);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PhysicalFlowUploadCommandResponse#errors() errors} map. Nulls are not permitted
     * @param errors The entries that will be added to the errors map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllErrors(Map<String, ? extends String> errors) {
      for (Map.Entry<String, ? extends String> entry : errors.entrySet()) {
        String k = entry.getKey();
        String v = entry.getValue();
        this.errors.put(
            Objects.requireNonNull(k, "errors key"),
            Objects.requireNonNull(v, "errors value"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommandResponse#originalCommand() originalCommand} attribute.
     * @param originalCommand The value for originalCommand 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("originalCommand")
    public final Builder originalCommand(PhysicalFlowUploadCommand originalCommand) {
      this.originalCommand = Objects.requireNonNull(originalCommand, "originalCommand");
      initBits &= ~INIT_BIT_ORIGINAL_COMMAND;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommandResponse#outcome() outcome} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalFlowUploadCommandResponse#outcome() outcome}.</em>
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(CommandOutcome outcome) {
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlowUploadCommandResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for chained invocation
     */
    public final Builder message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalFlowUploadCommandResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(Optional<String> message) {
      this.message = message.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowUploadCommandResponse ImmutablePhysicalFlowUploadCommandResponse}.
     * @return An immutable instance of PhysicalFlowUploadCommandResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowUploadCommandResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowUploadCommandResponse(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_PARSED_FLOW) != 0) attributes.add("parsedFlow");
      if ((initBits & INIT_BIT_ORIGINAL_COMMAND) != 0) attributes.add("originalCommand");
      return "Cannot build PhysicalFlowUploadCommandResponse, some of required attributes are not set " + attributes;
    }
  }

  private static <K, V> Map<K, V> createUnmodifiableMap(boolean checkNulls, boolean skipNulls, Map<? extends K, ? extends V> map) {
    switch (map.size()) {
    case 0: return Collections.emptyMap();
    case 1: {
      Map.Entry<? extends K, ? extends V> e = map.entrySet().iterator().next();
      K k = e.getKey();
      V v = e.getValue();
      if (checkNulls) {
        Objects.requireNonNull(k, "key");
        Objects.requireNonNull(v, "value");
      }
      if (skipNulls && (k == null || v == null)) {
        return Collections.emptyMap();
      }
      return Collections.singletonMap(k, v);
    }
    default: {
      Map<K, V> linkedMap = new LinkedHashMap<K, V>(map.size());
      if (skipNulls || checkNulls) {
        for (Map.Entry<? extends K, ? extends V> e : map.entrySet()) {
          K k = e.getKey();
          V v = e.getValue();
          if (skipNulls) {
            if (k == null || v == null) continue;
          } else if (checkNulls) {
            Objects.requireNonNull(k, "key");
            Objects.requireNonNull(v, "value");
          }
          linkedMap.put(k, v);
        }
      } else {
        linkedMap.putAll(map);
      }
      return Collections.unmodifiableMap(linkedMap);
    }
    }
  }
}
