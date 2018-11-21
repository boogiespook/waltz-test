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
 * Immutable implementation of {@link SetAttributeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSetAttributeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SetAttributeCommand"})
public final class ImmutableSetAttributeCommand extends SetAttributeCommand {
  private final EntityReference entityReference;
  private final String value;
  private final String name;

  private ImmutableSetAttributeCommand(
      EntityReference entityReference,
      String value,
      String name) {
    this.entityReference = entityReference;
    this.value = value;
    this.name = name;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public String value() {
    return value;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SetAttributeCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSetAttributeCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableSetAttributeCommand(newValue, this.value, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SetAttributeCommand#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSetAttributeCommand withValue(String value) {
    if (this.value.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "value");
    return new ImmutableSetAttributeCommand(this.entityReference, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SetAttributeCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSetAttributeCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSetAttributeCommand(this.entityReference, this.value, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSetAttributeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSetAttributeCommand
        && equalTo((ImmutableSetAttributeCommand) another);
  }

  private boolean equalTo(ImmutableSetAttributeCommand another) {
    return entityReference.equals(another.entityReference)
        && value.equals(another.value)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code value}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + value.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SetAttributeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SetAttributeCommand{"
        + "entityReference=" + entityReference
        + ", value=" + value
        + ", name=" + name
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SetAttributeCommand {
    EntityReference entityReference;
    String value;
    String name;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("value")
    public void setValue(String value) {
      this.value = value;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public String value() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSetAttributeCommand fromJson(Json json) {
    ImmutableSetAttributeCommand.Builder builder = ImmutableSetAttributeCommand.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SetAttributeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SetAttributeCommand instance
   */
  public static ImmutableSetAttributeCommand copyOf(SetAttributeCommand instance) {
    if (instance instanceof ImmutableSetAttributeCommand) {
      return (ImmutableSetAttributeCommand) instance;
    }
    return ImmutableSetAttributeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSetAttributeCommand ImmutableSetAttributeCommand}.
   * @return A new ImmutableSetAttributeCommand builder
   */
  public static ImmutableSetAttributeCommand.Builder builder() {
    return new ImmutableSetAttributeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSetAttributeCommand ImmutableSetAttributeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private EntityReference entityReference;
    private String value;
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.SetAttributeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SetAttributeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.NameProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NameProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof SetAttributeCommand) {
        SetAttributeCommand instance = (SetAttributeCommand) object;
        value(instance.value());
        entityReference(instance.entityReference());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link SetAttributeCommand#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link SetAttributeCommand#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link SetAttributeCommand#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSetAttributeCommand ImmutableSetAttributeCommand}.
     * @return An immutable instance of SetAttributeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSetAttributeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSetAttributeCommand(entityReference, value, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SetAttributeCommand, some of required attributes are not set " + attributes;
    }
  }
}
