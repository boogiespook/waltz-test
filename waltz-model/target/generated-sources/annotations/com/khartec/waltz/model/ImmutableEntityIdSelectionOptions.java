package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityIdSelectionOptions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityIdSelectionOptions.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityIdSelectionOptions"})
@Deprecated
public final class ImmutableEntityIdSelectionOptions extends EntityIdSelectionOptions {
  private final EntityKind desiredKind;
  private final EntityReference entityReference;
  private final HierarchyQueryScope scope;

  private ImmutableEntityIdSelectionOptions(
      EntityKind desiredKind,
      EntityReference entityReference,
      HierarchyQueryScope scope) {
    this.desiredKind = desiredKind;
    this.entityReference = entityReference;
    this.scope = scope;
  }

  /**
   * @return The value of the {@code desiredKind} attribute
   */
  @JsonProperty("desiredKind")
  @Override
  public EntityKind desiredKind() {
    return desiredKind;
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
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public HierarchyQueryScope scope() {
    return scope;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityIdSelectionOptions#desiredKind() desiredKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for desiredKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityIdSelectionOptions withDesiredKind(EntityKind value) {
    if (this.desiredKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "desiredKind");
    return new ImmutableEntityIdSelectionOptions(newValue, this.entityReference, this.scope);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityIdSelectionOptions#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityIdSelectionOptions withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntityIdSelectionOptions(this.desiredKind, newValue, this.scope);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityIdSelectionOptions#scope() scope} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scope
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityIdSelectionOptions withScope(HierarchyQueryScope value) {
    if (this.scope == value) return this;
    HierarchyQueryScope newValue = Objects.requireNonNull(value, "scope");
    return new ImmutableEntityIdSelectionOptions(this.desiredKind, this.entityReference, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityIdSelectionOptions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityIdSelectionOptions
        && equalTo((ImmutableEntityIdSelectionOptions) another);
  }

  private boolean equalTo(ImmutableEntityIdSelectionOptions another) {
    return desiredKind.equals(another.desiredKind)
        && entityReference.equals(another.entityReference)
        && scope.equals(another.scope);
  }

  /**
   * Computes a hash code from attributes: {@code desiredKind}, {@code entityReference}, {@code scope}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + desiredKind.hashCode();
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + scope.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityIdSelectionOptions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityIdSelectionOptions{"
        + "desiredKind=" + desiredKind
        + ", entityReference=" + entityReference
        + ", scope=" + scope
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityIdSelectionOptions {
    EntityKind desiredKind;
    EntityReference entityReference;
    HierarchyQueryScope scope;
    @JsonProperty("desiredKind")
    public void setDesiredKind(EntityKind desiredKind) {
      this.desiredKind = desiredKind;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("scope")
    public void setScope(HierarchyQueryScope scope) {
      this.scope = scope;
    }
    @Override
    public EntityKind desiredKind() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public HierarchyQueryScope scope() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityIdSelectionOptions fromJson(Json json) {
    ImmutableEntityIdSelectionOptions.Builder builder = ImmutableEntityIdSelectionOptions.builder();
    if (json.desiredKind != null) {
      builder.desiredKind(json.desiredKind);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.scope != null) {
      builder.scope(json.scope);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityIdSelectionOptions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityIdSelectionOptions instance
   */
  public static ImmutableEntityIdSelectionOptions copyOf(EntityIdSelectionOptions instance) {
    if (instance instanceof ImmutableEntityIdSelectionOptions) {
      return (ImmutableEntityIdSelectionOptions) instance;
    }
    return ImmutableEntityIdSelectionOptions.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityIdSelectionOptions ImmutableEntityIdSelectionOptions}.
   * @return A new ImmutableEntityIdSelectionOptions builder
   */
  public static ImmutableEntityIdSelectionOptions.Builder builder() {
    return new ImmutableEntityIdSelectionOptions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityIdSelectionOptions ImmutableEntityIdSelectionOptions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DESIRED_KIND = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_SCOPE = 0x4L;
    private long initBits = 0x7L;

    private EntityKind desiredKind;
    private EntityReference entityReference;
    private HierarchyQueryScope scope;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityIdSelectionOptions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityIdSelectionOptions instance) {
      Objects.requireNonNull(instance, "instance");
      desiredKind(instance.desiredKind());
      entityReference(instance.entityReference());
      scope(instance.scope());
      return this;
    }

    /**
     * Initializes the value for the {@link EntityIdSelectionOptions#desiredKind() desiredKind} attribute.
     * @param desiredKind The value for desiredKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("desiredKind")
    public final Builder desiredKind(EntityKind desiredKind) {
      this.desiredKind = Objects.requireNonNull(desiredKind, "desiredKind");
      initBits &= ~INIT_BIT_DESIRED_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityIdSelectionOptions#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link EntityIdSelectionOptions#scope() scope} attribute.
     * @param scope The value for scope 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(HierarchyQueryScope scope) {
      this.scope = Objects.requireNonNull(scope, "scope");
      initBits &= ~INIT_BIT_SCOPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityIdSelectionOptions ImmutableEntityIdSelectionOptions}.
     * @return An immutable instance of EntityIdSelectionOptions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityIdSelectionOptions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityIdSelectionOptions(desiredKind, entityReference, scope);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DESIRED_KIND) != 0) attributes.add("desiredKind");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_SCOPE) != 0) attributes.add("scope");
      return "Cannot build EntityIdSelectionOptions, some of required attributes are not set " + attributes;
    }
  }
}
