package com.khartec.waltz.model.orphan;

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
 * Immutable implementation of {@link OrphanRelationship}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrphanRelationship.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "OrphanRelationship"})
public final class ImmutableOrphanRelationship extends OrphanRelationship {
  private final EntityReference entityA;
  private final EntityReference entityB;
  private final OrphanSide orphanSide;

  private ImmutableOrphanRelationship(
      EntityReference entityA,
      EntityReference entityB,
      OrphanSide orphanSide) {
    this.entityA = entityA;
    this.entityB = entityB;
    this.orphanSide = orphanSide;
  }

  /**
   * @return The value of the {@code entityA} attribute
   */
  @JsonProperty("entityA")
  @Override
  public EntityReference entityA() {
    return entityA;
  }

  /**
   * @return The value of the {@code entityB} attribute
   */
  @JsonProperty("entityB")
  @Override
  public EntityReference entityB() {
    return entityB;
  }

  /**
   * @return The value of the {@code orphanSide} attribute
   */
  @JsonProperty("orphanSide")
  @Override
  public OrphanSide orphanSide() {
    return orphanSide;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrphanRelationship#entityA() entityA} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityA
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrphanRelationship withEntityA(EntityReference value) {
    if (this.entityA == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityA");
    return new ImmutableOrphanRelationship(newValue, this.entityB, this.orphanSide);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrphanRelationship#entityB() entityB} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityB
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrphanRelationship withEntityB(EntityReference value) {
    if (this.entityB == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityB");
    return new ImmutableOrphanRelationship(this.entityA, newValue, this.orphanSide);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrphanRelationship#orphanSide() orphanSide} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for orphanSide
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrphanRelationship withOrphanSide(OrphanSide value) {
    if (this.orphanSide == value) return this;
    OrphanSide newValue = Objects.requireNonNull(value, "orphanSide");
    return new ImmutableOrphanRelationship(this.entityA, this.entityB, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrphanRelationship} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrphanRelationship
        && equalTo((ImmutableOrphanRelationship) another);
  }

  private boolean equalTo(ImmutableOrphanRelationship another) {
    return entityA.equals(another.entityA)
        && entityB.equals(another.entityB)
        && orphanSide.equals(another.orphanSide);
  }

  /**
   * Computes a hash code from attributes: {@code entityA}, {@code entityB}, {@code orphanSide}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityA.hashCode();
    h += (h << 5) + entityB.hashCode();
    h += (h << 5) + orphanSide.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code OrphanRelationship} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "OrphanRelationship{"
        + "entityA=" + entityA
        + ", entityB=" + entityB
        + ", orphanSide=" + orphanSide
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends OrphanRelationship {
    EntityReference entityA;
    EntityReference entityB;
    OrphanSide orphanSide;
    @JsonProperty("entityA")
    public void setEntityA(EntityReference entityA) {
      this.entityA = entityA;
    }
    @JsonProperty("entityB")
    public void setEntityB(EntityReference entityB) {
      this.entityB = entityB;
    }
    @JsonProperty("orphanSide")
    public void setOrphanSide(OrphanSide orphanSide) {
      this.orphanSide = orphanSide;
    }
    @Override
    public EntityReference entityA() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityB() { throw new UnsupportedOperationException(); }
    @Override
    public OrphanSide orphanSide() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOrphanRelationship fromJson(Json json) {
    ImmutableOrphanRelationship.Builder builder = ImmutableOrphanRelationship.builder();
    if (json.entityA != null) {
      builder.entityA(json.entityA);
    }
    if (json.entityB != null) {
      builder.entityB(json.entityB);
    }
    if (json.orphanSide != null) {
      builder.orphanSide(json.orphanSide);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OrphanRelationship} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OrphanRelationship instance
   */
  public static ImmutableOrphanRelationship copyOf(OrphanRelationship instance) {
    if (instance instanceof ImmutableOrphanRelationship) {
      return (ImmutableOrphanRelationship) instance;
    }
    return ImmutableOrphanRelationship.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOrphanRelationship ImmutableOrphanRelationship}.
   * @return A new ImmutableOrphanRelationship builder
   */
  public static ImmutableOrphanRelationship.Builder builder() {
    return new ImmutableOrphanRelationship.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOrphanRelationship ImmutableOrphanRelationship}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_A = 0x1L;
    private static final long INIT_BIT_ENTITY_B = 0x2L;
    private static final long INIT_BIT_ORPHAN_SIDE = 0x4L;
    private long initBits = 0x7L;

    private EntityReference entityA;
    private EntityReference entityB;
    private OrphanSide orphanSide;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OrphanRelationship} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(OrphanRelationship instance) {
      Objects.requireNonNull(instance, "instance");
      entityA(instance.entityA());
      entityB(instance.entityB());
      orphanSide(instance.orphanSide());
      return this;
    }

    /**
     * Initializes the value for the {@link OrphanRelationship#entityA() entityA} attribute.
     * @param entityA The value for entityA 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityA")
    public final Builder entityA(EntityReference entityA) {
      this.entityA = Objects.requireNonNull(entityA, "entityA");
      initBits &= ~INIT_BIT_ENTITY_A;
      return this;
    }

    /**
     * Initializes the value for the {@link OrphanRelationship#entityB() entityB} attribute.
     * @param entityB The value for entityB 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityB")
    public final Builder entityB(EntityReference entityB) {
      this.entityB = Objects.requireNonNull(entityB, "entityB");
      initBits &= ~INIT_BIT_ENTITY_B;
      return this;
    }

    /**
     * Initializes the value for the {@link OrphanRelationship#orphanSide() orphanSide} attribute.
     * @param orphanSide The value for orphanSide 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orphanSide")
    public final Builder orphanSide(OrphanSide orphanSide) {
      this.orphanSide = Objects.requireNonNull(orphanSide, "orphanSide");
      initBits &= ~INIT_BIT_ORPHAN_SIDE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOrphanRelationship ImmutableOrphanRelationship}.
     * @return An immutable instance of OrphanRelationship
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOrphanRelationship build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOrphanRelationship(entityA, entityB, orphanSide);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_A) != 0) attributes.add("entityA");
      if ((initBits & INIT_BIT_ENTITY_B) != 0) attributes.add("entityB");
      if ((initBits & INIT_BIT_ORPHAN_SIDE) != 0) attributes.add("orphanSide");
      return "Cannot build OrphanRelationship, some of required attributes are not set " + attributes;
    }
  }
}
