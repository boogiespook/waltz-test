package com.khartec.waltz.model.involvement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.Operation;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityInvolvementChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityInvolvementChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityInvolvementChangeCommand"})
public final class ImmutableEntityInvolvementChangeCommand
    extends EntityInvolvementChangeCommand {
  private final Operation operation;
  private final EntityReference personEntityRef;
  private final int involvementKindId;

  private ImmutableEntityInvolvementChangeCommand(
      Operation operation,
      EntityReference personEntityRef,
      int involvementKindId) {
    this.operation = operation;
    this.personEntityRef = personEntityRef;
    this.involvementKindId = involvementKindId;
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Operation operation() {
    return operation;
  }

  /**
   * @return The value of the {@code personEntityRef} attribute
   */
  @JsonProperty("personEntityRef")
  @Override
  public EntityReference personEntityRef() {
    return personEntityRef;
  }

  /**
   * @return The value of the {@code involvementKindId} attribute
   */
  @JsonProperty("involvementKindId")
  @Override
  public int involvementKindId() {
    return involvementKindId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityInvolvementChangeCommand#operation() operation} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityInvolvementChangeCommand withOperation(Operation value) {
    if (this.operation == value) return this;
    Operation newValue = Objects.requireNonNull(value, "operation");
    return new ImmutableEntityInvolvementChangeCommand(newValue, this.personEntityRef, this.involvementKindId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityInvolvementChangeCommand#personEntityRef() personEntityRef} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personEntityRef
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityInvolvementChangeCommand withPersonEntityRef(EntityReference value) {
    if (this.personEntityRef == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "personEntityRef");
    return new ImmutableEntityInvolvementChangeCommand(this.operation, newValue, this.involvementKindId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityInvolvementChangeCommand#involvementKindId() involvementKindId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for involvementKindId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityInvolvementChangeCommand withInvolvementKindId(int value) {
    if (this.involvementKindId == value) return this;
    return new ImmutableEntityInvolvementChangeCommand(this.operation, this.personEntityRef, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityInvolvementChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityInvolvementChangeCommand
        && equalTo((ImmutableEntityInvolvementChangeCommand) another);
  }

  private boolean equalTo(ImmutableEntityInvolvementChangeCommand another) {
    return operation.equals(another.operation)
        && personEntityRef.equals(another.personEntityRef)
        && involvementKindId == another.involvementKindId;
  }

  /**
   * Computes a hash code from attributes: {@code operation}, {@code personEntityRef}, {@code involvementKindId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + operation.hashCode();
    h += (h << 5) + personEntityRef.hashCode();
    h += (h << 5) + involvementKindId;
    return h;
  }

  /**
   * Prints the immutable value {@code EntityInvolvementChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityInvolvementChangeCommand{"
        + "operation=" + operation
        + ", personEntityRef=" + personEntityRef
        + ", involvementKindId=" + involvementKindId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityInvolvementChangeCommand {
    Operation operation;
    EntityReference personEntityRef;
    int involvementKindId;
    boolean involvementKindIdIsSet;
    @JsonProperty("operation")
    public void setOperation(Operation operation) {
      this.operation = operation;
    }
    @JsonProperty("personEntityRef")
    public void setPersonEntityRef(EntityReference personEntityRef) {
      this.personEntityRef = personEntityRef;
    }
    @JsonProperty("involvementKindId")
    public void setInvolvementKindId(int involvementKindId) {
      this.involvementKindId = involvementKindId;
      this.involvementKindIdIsSet = true;
    }
    @Override
    public Operation operation() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference personEntityRef() { throw new UnsupportedOperationException(); }
    @Override
    public int involvementKindId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityInvolvementChangeCommand fromJson(Json json) {
    ImmutableEntityInvolvementChangeCommand.Builder builder = ImmutableEntityInvolvementChangeCommand.builder();
    if (json.operation != null) {
      builder.operation(json.operation);
    }
    if (json.personEntityRef != null) {
      builder.personEntityRef(json.personEntityRef);
    }
    if (json.involvementKindIdIsSet) {
      builder.involvementKindId(json.involvementKindId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityInvolvementChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityInvolvementChangeCommand instance
   */
  public static ImmutableEntityInvolvementChangeCommand copyOf(EntityInvolvementChangeCommand instance) {
    if (instance instanceof ImmutableEntityInvolvementChangeCommand) {
      return (ImmutableEntityInvolvementChangeCommand) instance;
    }
    return ImmutableEntityInvolvementChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityInvolvementChangeCommand ImmutableEntityInvolvementChangeCommand}.
   * @return A new ImmutableEntityInvolvementChangeCommand builder
   */
  public static ImmutableEntityInvolvementChangeCommand.Builder builder() {
    return new ImmutableEntityInvolvementChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityInvolvementChangeCommand ImmutableEntityInvolvementChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_OPERATION = 0x1L;
    private static final long INIT_BIT_PERSON_ENTITY_REF = 0x2L;
    private static final long INIT_BIT_INVOLVEMENT_KIND_ID = 0x4L;
    private long initBits = 0x7L;

    private Operation operation;
    private EntityReference personEntityRef;
    private int involvementKindId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityInvolvementChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityInvolvementChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      operation(instance.operation());
      personEntityRef(instance.personEntityRef());
      involvementKindId(instance.involvementKindId());
      return this;
    }

    /**
     * Initializes the value for the {@link EntityInvolvementChangeCommand#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Operation operation) {
      this.operation = Objects.requireNonNull(operation, "operation");
      initBits &= ~INIT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityInvolvementChangeCommand#personEntityRef() personEntityRef} attribute.
     * @param personEntityRef The value for personEntityRef 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("personEntityRef")
    public final Builder personEntityRef(EntityReference personEntityRef) {
      this.personEntityRef = Objects.requireNonNull(personEntityRef, "personEntityRef");
      initBits &= ~INIT_BIT_PERSON_ENTITY_REF;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityInvolvementChangeCommand#involvementKindId() involvementKindId} attribute.
     * @param involvementKindId The value for involvementKindId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("involvementKindId")
    public final Builder involvementKindId(int involvementKindId) {
      this.involvementKindId = involvementKindId;
      initBits &= ~INIT_BIT_INVOLVEMENT_KIND_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityInvolvementChangeCommand ImmutableEntityInvolvementChangeCommand}.
     * @return An immutable instance of EntityInvolvementChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityInvolvementChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityInvolvementChangeCommand(operation, personEntityRef, involvementKindId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_OPERATION) != 0) attributes.add("operation");
      if ((initBits & INIT_BIT_PERSON_ENTITY_REF) != 0) attributes.add("personEntityRef");
      if ((initBits & INIT_BIT_INVOLVEMENT_KIND_ID) != 0) attributes.add("involvementKindId");
      return "Cannot build EntityInvolvementChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
