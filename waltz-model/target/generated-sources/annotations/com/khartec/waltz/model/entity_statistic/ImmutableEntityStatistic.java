package com.khartec.waltz.model.entity_statistic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityStatistic}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityStatistic.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityStatistic"})
public final class ImmutableEntityStatistic extends EntityStatistic {
  private final EntityStatisticDefinition definition;
  private final EntityStatisticValue value;

  private ImmutableEntityStatistic(
      EntityStatisticDefinition definition,
      EntityStatisticValue value) {
    this.definition = definition;
    this.value = value;
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public EntityStatisticDefinition definition() {
    return definition;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public EntityStatisticValue value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatistic#definition() definition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for definition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatistic withDefinition(EntityStatisticDefinition value) {
    if (this.definition == value) return this;
    EntityStatisticDefinition newValue = Objects.requireNonNull(value, "definition");
    return new ImmutableEntityStatistic(newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatistic#value() value} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatistic withValue(EntityStatisticValue value) {
    if (this.value == value) return this;
    EntityStatisticValue newValue = Objects.requireNonNull(value, "value");
    return new ImmutableEntityStatistic(this.definition, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityStatistic} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityStatistic
        && equalTo((ImmutableEntityStatistic) another);
  }

  private boolean equalTo(ImmutableEntityStatistic another) {
    return definition.equals(another.definition)
        && value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code definition}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + definition.hashCode();
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityStatistic} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityStatistic{"
        + "definition=" + definition
        + ", value=" + value
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityStatistic {
    EntityStatisticDefinition definition;
    EntityStatisticValue value;
    @JsonProperty("definition")
    public void setDefinition(EntityStatisticDefinition definition) {
      this.definition = definition;
    }
    @JsonProperty("value")
    public void setValue(EntityStatisticValue value) {
      this.value = value;
    }
    @Override
    public EntityStatisticDefinition definition() { throw new UnsupportedOperationException(); }
    @Override
    public EntityStatisticValue value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityStatistic fromJson(Json json) {
    ImmutableEntityStatistic.Builder builder = ImmutableEntityStatistic.builder();
    if (json.definition != null) {
      builder.definition(json.definition);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityStatistic} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityStatistic instance
   */
  public static ImmutableEntityStatistic copyOf(EntityStatistic instance) {
    if (instance instanceof ImmutableEntityStatistic) {
      return (ImmutableEntityStatistic) instance;
    }
    return ImmutableEntityStatistic.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityStatistic ImmutableEntityStatistic}.
   * @return A new ImmutableEntityStatistic builder
   */
  public static ImmutableEntityStatistic.Builder builder() {
    return new ImmutableEntityStatistic.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityStatistic ImmutableEntityStatistic}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DEFINITION = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private long initBits = 0x3L;

    private EntityStatisticDefinition definition;
    private EntityStatisticValue value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityStatistic} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityStatistic instance) {
      Objects.requireNonNull(instance, "instance");
      definition(instance.definition());
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatistic#definition() definition} attribute.
     * @param definition The value for definition 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(EntityStatisticDefinition definition) {
      this.definition = Objects.requireNonNull(definition, "definition");
      initBits &= ~INIT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatistic#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(EntityStatisticValue value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityStatistic ImmutableEntityStatistic}.
     * @return An immutable instance of EntityStatistic
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityStatistic build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityStatistic(definition, value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DEFINITION) != 0) attributes.add("definition");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build EntityStatistic, some of required attributes are not set " + attributes;
    }
  }
}
