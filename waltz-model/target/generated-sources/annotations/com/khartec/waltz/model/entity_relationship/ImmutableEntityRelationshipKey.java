package com.khartec.waltz.model.entity_relationship;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityRelationshipKey}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityRelationshipKey.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityRelationshipKey"})
public final class ImmutableEntityRelationshipKey
    extends EntityRelationshipKey {
  private final EntityReference a;
  private final EntityReference b;
  private final RelationshipKind relationshipKind;

  private ImmutableEntityRelationshipKey(
      EntityReference a,
      EntityReference b,
      RelationshipKind relationshipKind) {
    this.a = a;
    this.b = b;
    this.relationshipKind = relationshipKind;
  }

  /**
   * @return The value of the {@code a} attribute
   */
  @JsonProperty("a")
  @Override
  public EntityReference a() {
    return a;
  }

  /**
   * @return The value of the {@code b} attribute
   */
  @JsonProperty("b")
  @Override
  public EntityReference b() {
    return b;
  }

  /**
   * @return The value of the {@code relationshipKind} attribute
   */
  @JsonProperty("relationshipKind")
  @Override
  public RelationshipKind relationshipKind() {
    return relationshipKind;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationshipKey#a() a} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for a
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationshipKey withA(EntityReference value) {
    if (this.a == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "a");
    return new ImmutableEntityRelationshipKey(newValue, this.b, this.relationshipKind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationshipKey#b() b} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for b
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationshipKey withB(EntityReference value) {
    if (this.b == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "b");
    return new ImmutableEntityRelationshipKey(this.a, newValue, this.relationshipKind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationshipKey#relationshipKind() relationshipKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationshipKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationshipKey withRelationshipKind(RelationshipKind value) {
    if (this.relationshipKind == value) return this;
    RelationshipKind newValue = Objects.requireNonNull(value, "relationshipKind");
    return new ImmutableEntityRelationshipKey(this.a, this.b, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityRelationshipKey} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityRelationshipKey
        && equalTo((ImmutableEntityRelationshipKey) another);
  }

  private boolean equalTo(ImmutableEntityRelationshipKey another) {
    return a.equals(another.a)
        && b.equals(another.b)
        && relationshipKind.equals(another.relationshipKind);
  }

  /**
   * Computes a hash code from attributes: {@code a}, {@code b}, {@code relationshipKind}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + a.hashCode();
    h += (h << 5) + b.hashCode();
    h += (h << 5) + relationshipKind.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityRelationshipKey} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityRelationshipKey{"
        + "a=" + a
        + ", b=" + b
        + ", relationshipKind=" + relationshipKind
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityRelationshipKey {
    EntityReference a;
    EntityReference b;
    RelationshipKind relationshipKind;
    @JsonProperty("a")
    public void setA(EntityReference a) {
      this.a = a;
    }
    @JsonProperty("b")
    public void setB(EntityReference b) {
      this.b = b;
    }
    @JsonProperty("relationshipKind")
    public void setRelationshipKind(RelationshipKind relationshipKind) {
      this.relationshipKind = relationshipKind;
    }
    @Override
    public EntityReference a() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference b() { throw new UnsupportedOperationException(); }
    @Override
    public RelationshipKind relationshipKind() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityRelationshipKey fromJson(Json json) {
    ImmutableEntityRelationshipKey.Builder builder = ImmutableEntityRelationshipKey.builder();
    if (json.a != null) {
      builder.a(json.a);
    }
    if (json.b != null) {
      builder.b(json.b);
    }
    if (json.relationshipKind != null) {
      builder.relationshipKind(json.relationshipKind);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityRelationshipKey} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityRelationshipKey instance
   */
  public static ImmutableEntityRelationshipKey copyOf(EntityRelationshipKey instance) {
    if (instance instanceof ImmutableEntityRelationshipKey) {
      return (ImmutableEntityRelationshipKey) instance;
    }
    return ImmutableEntityRelationshipKey.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityRelationshipKey ImmutableEntityRelationshipKey}.
   * @return A new ImmutableEntityRelationshipKey builder
   */
  public static ImmutableEntityRelationshipKey.Builder builder() {
    return new ImmutableEntityRelationshipKey.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityRelationshipKey ImmutableEntityRelationshipKey}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_A = 0x1L;
    private static final long INIT_BIT_B = 0x2L;
    private static final long INIT_BIT_RELATIONSHIP_KIND = 0x4L;
    private long initBits = 0x7L;

    private EntityReference a;
    private EntityReference b;
    private RelationshipKind relationshipKind;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityRelationshipKey} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityRelationshipKey instance) {
      Objects.requireNonNull(instance, "instance");
      a(instance.a());
      b(instance.b());
      relationshipKind(instance.relationshipKind());
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationshipKey#a() a} attribute.
     * @param a The value for a 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("a")
    public final Builder a(EntityReference a) {
      this.a = Objects.requireNonNull(a, "a");
      initBits &= ~INIT_BIT_A;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationshipKey#b() b} attribute.
     * @param b The value for b 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("b")
    public final Builder b(EntityReference b) {
      this.b = Objects.requireNonNull(b, "b");
      initBits &= ~INIT_BIT_B;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationshipKey#relationshipKind() relationshipKind} attribute.
     * @param relationshipKind The value for relationshipKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationshipKind")
    public final Builder relationshipKind(RelationshipKind relationshipKind) {
      this.relationshipKind = Objects.requireNonNull(relationshipKind, "relationshipKind");
      initBits &= ~INIT_BIT_RELATIONSHIP_KIND;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityRelationshipKey ImmutableEntityRelationshipKey}.
     * @return An immutable instance of EntityRelationshipKey
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityRelationshipKey build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityRelationshipKey(a, b, relationshipKind);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_A) != 0) attributes.add("a");
      if ((initBits & INIT_BIT_B) != 0) attributes.add("b");
      if ((initBits & INIT_BIT_RELATIONSHIP_KIND) != 0) attributes.add("relationshipKind");
      return "Cannot build EntityRelationshipKey, some of required attributes are not set " + attributes;
    }
  }
}
