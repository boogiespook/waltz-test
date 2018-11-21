package com.khartec.waltz.model.entity_relationship;

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
 * Immutable implementation of {@link EntityRelationshipChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityRelationshipChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityRelationshipChangeCommand"})
public final class ImmutableEntityRelationshipChangeCommand
    extends EntityRelationshipChangeCommand {
  private final Operation operation;
  private final EntityReference entityReference;
  private final RelationshipKind relationship;

  private ImmutableEntityRelationshipChangeCommand(
      Operation operation,
      EntityReference entityReference,
      RelationshipKind relationship) {
    this.operation = operation;
    this.entityReference = entityReference;
    this.relationship = relationship;
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
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public RelationshipKind relationship() {
    return relationship;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationshipChangeCommand#operation() operation} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationshipChangeCommand withOperation(Operation value) {
    if (this.operation == value) return this;
    Operation newValue = Objects.requireNonNull(value, "operation");
    return new ImmutableEntityRelationshipChangeCommand(newValue, this.entityReference, this.relationship);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationshipChangeCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationshipChangeCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntityRelationshipChangeCommand(this.operation, newValue, this.relationship);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationshipChangeCommand#relationship() relationship} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationship
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationshipChangeCommand withRelationship(RelationshipKind value) {
    if (this.relationship == value) return this;
    RelationshipKind newValue = Objects.requireNonNull(value, "relationship");
    return new ImmutableEntityRelationshipChangeCommand(this.operation, this.entityReference, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityRelationshipChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityRelationshipChangeCommand
        && equalTo((ImmutableEntityRelationshipChangeCommand) another);
  }

  private boolean equalTo(ImmutableEntityRelationshipChangeCommand another) {
    return operation.equals(another.operation)
        && entityReference.equals(another.entityReference)
        && relationship.equals(another.relationship);
  }

  /**
   * Computes a hash code from attributes: {@code operation}, {@code entityReference}, {@code relationship}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + operation.hashCode();
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + relationship.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityRelationshipChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityRelationshipChangeCommand{"
        + "operation=" + operation
        + ", entityReference=" + entityReference
        + ", relationship=" + relationship
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityRelationshipChangeCommand {
    Operation operation;
    EntityReference entityReference;
    RelationshipKind relationship;
    @JsonProperty("operation")
    public void setOperation(Operation operation) {
      this.operation = operation;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("relationship")
    public void setRelationship(RelationshipKind relationship) {
      this.relationship = relationship;
    }
    @Override
    public Operation operation() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public RelationshipKind relationship() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityRelationshipChangeCommand fromJson(Json json) {
    ImmutableEntityRelationshipChangeCommand.Builder builder = ImmutableEntityRelationshipChangeCommand.builder();
    if (json.operation != null) {
      builder.operation(json.operation);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.relationship != null) {
      builder.relationship(json.relationship);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityRelationshipChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityRelationshipChangeCommand instance
   */
  public static ImmutableEntityRelationshipChangeCommand copyOf(EntityRelationshipChangeCommand instance) {
    if (instance instanceof ImmutableEntityRelationshipChangeCommand) {
      return (ImmutableEntityRelationshipChangeCommand) instance;
    }
    return ImmutableEntityRelationshipChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityRelationshipChangeCommand ImmutableEntityRelationshipChangeCommand}.
   * @return A new ImmutableEntityRelationshipChangeCommand builder
   */
  public static ImmutableEntityRelationshipChangeCommand.Builder builder() {
    return new ImmutableEntityRelationshipChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityRelationshipChangeCommand ImmutableEntityRelationshipChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_OPERATION = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_RELATIONSHIP = 0x4L;
    private long initBits = 0x7L;

    private Operation operation;
    private EntityReference entityReference;
    private RelationshipKind relationship;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityRelationshipChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityRelationshipChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      operation(instance.operation());
      entityReference(instance.entityReference());
      relationship(instance.relationship());
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationshipChangeCommand#operation() operation} attribute.
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
     * Initializes the value for the {@link EntityRelationshipChangeCommand#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link EntityRelationshipChangeCommand#relationship() relationship} attribute.
     * @param relationship The value for relationship 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(RelationshipKind relationship) {
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      initBits &= ~INIT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityRelationshipChangeCommand ImmutableEntityRelationshipChangeCommand}.
     * @return An immutable instance of EntityRelationshipChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityRelationshipChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityRelationshipChangeCommand(operation, entityReference, relationship);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_OPERATION) != 0) attributes.add("operation");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_RELATIONSHIP) != 0) attributes.add("relationship");
      return "Cannot build EntityRelationshipChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
