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
 * Immutable implementation of {@link LeveledEntityReference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLeveledEntityReference.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LeveledEntityReference"})
public final class ImmutableLeveledEntityReference extends LeveledEntityReference {
  private final EntityReference entityReference;
  private final int level;

  private ImmutableLeveledEntityReference(EntityReference entityReference, int level) {
    this.entityReference = entityReference;
    this.level = level;
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
   * @return The value of the {@code level} attribute
   */
  @JsonProperty("level")
  @Override
  public int level() {
    return level;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LeveledEntityReference#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLeveledEntityReference withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableLeveledEntityReference(newValue, this.level);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LeveledEntityReference#level() level} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for level
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLeveledEntityReference withLevel(int value) {
    if (this.level == value) return this;
    return new ImmutableLeveledEntityReference(this.entityReference, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLeveledEntityReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLeveledEntityReference
        && equalTo((ImmutableLeveledEntityReference) another);
  }

  private boolean equalTo(ImmutableLeveledEntityReference another) {
    return entityReference.equals(another.entityReference)
        && level == another.level;
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code level}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + level;
    return h;
  }

  /**
   * Prints the immutable value {@code LeveledEntityReference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "LeveledEntityReference{"
        + "entityReference=" + entityReference
        + ", level=" + level
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LeveledEntityReference {
    EntityReference entityReference;
    int level;
    boolean levelIsSet;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("level")
    public void setLevel(int level) {
      this.level = level;
      this.levelIsSet = true;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public int level() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLeveledEntityReference fromJson(Json json) {
    ImmutableLeveledEntityReference.Builder builder = ImmutableLeveledEntityReference.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.levelIsSet) {
      builder.level(json.level);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LeveledEntityReference} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LeveledEntityReference instance
   */
  public static ImmutableLeveledEntityReference copyOf(LeveledEntityReference instance) {
    if (instance instanceof ImmutableLeveledEntityReference) {
      return (ImmutableLeveledEntityReference) instance;
    }
    return ImmutableLeveledEntityReference.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLeveledEntityReference ImmutableLeveledEntityReference}.
   * @return A new ImmutableLeveledEntityReference builder
   */
  public static ImmutableLeveledEntityReference.Builder builder() {
    return new ImmutableLeveledEntityReference.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLeveledEntityReference ImmutableLeveledEntityReference}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_LEVEL = 0x2L;
    private long initBits = 0x3L;

    private EntityReference entityReference;
    private int level;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LeveledEntityReference} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LeveledEntityReference instance) {
      Objects.requireNonNull(instance, "instance");
      entityReference(instance.entityReference());
      level(instance.level());
      return this;
    }

    /**
     * Initializes the value for the {@link LeveledEntityReference#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link LeveledEntityReference#level() level} attribute.
     * @param level The value for level 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("level")
    public final Builder level(int level) {
      this.level = level;
      initBits &= ~INIT_BIT_LEVEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLeveledEntityReference ImmutableLeveledEntityReference}.
     * @return An immutable instance of LeveledEntityReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLeveledEntityReference build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLeveledEntityReference(entityReference, level);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_LEVEL) != 0) attributes.add("level");
      return "Cannot build LeveledEntityReference, some of required attributes are not set " + attributes;
    }
  }
}
