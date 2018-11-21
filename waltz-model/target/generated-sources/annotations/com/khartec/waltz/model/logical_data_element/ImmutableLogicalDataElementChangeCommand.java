package com.khartec.waltz.model.logical_data_element;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LogicalDataElementChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogicalDataElementChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LogicalDataElementChangeCommand"})
public final class ImmutableLogicalDataElementChangeCommand
    extends LogicalDataElementChangeCommand {
  private final EntityReference newLogicalDataElement;

  private ImmutableLogicalDataElementChangeCommand(EntityReference newLogicalDataElement) {
    this.newLogicalDataElement = newLogicalDataElement;
  }

  /**
   * @return The value of the {@code newLogicalDataElement} attribute
   */
  @JsonProperty("newLogicalDataElement")
  @Override
  public Optional<EntityReference> newLogicalDataElement() {
    return Optional.ofNullable(newLogicalDataElement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link LogicalDataElementChangeCommand#newLogicalDataElement() newLogicalDataElement} attribute.
   * @param value The value for newLogicalDataElement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalDataElementChangeCommand withNewLogicalDataElement(EntityReference value) {
    EntityReference newValue = Objects.requireNonNull(value, "newLogicalDataElement");
    if (this.newLogicalDataElement == newValue) return this;
    return new ImmutableLogicalDataElementChangeCommand(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link LogicalDataElementChangeCommand#newLogicalDataElement() newLogicalDataElement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for newLogicalDataElement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalDataElementChangeCommand withNewLogicalDataElement(Optional<? extends EntityReference> optional) {
    EntityReference value = optional.orElse(null);
    if (this.newLogicalDataElement == value) return this;
    return new ImmutableLogicalDataElementChangeCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogicalDataElementChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogicalDataElementChangeCommand
        && equalTo((ImmutableLogicalDataElementChangeCommand) another);
  }

  private boolean equalTo(ImmutableLogicalDataElementChangeCommand another) {
    return Objects.equals(newLogicalDataElement, another.newLogicalDataElement);
  }

  /**
   * Computes a hash code from attributes: {@code newLogicalDataElement}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(newLogicalDataElement);
    return h;
  }

  /**
   * Prints the immutable value {@code LogicalDataElementChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("LogicalDataElementChangeCommand{");
    if (newLogicalDataElement != null) {
      builder.append("newLogicalDataElement=").append(newLogicalDataElement);
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
  static final class Json extends LogicalDataElementChangeCommand {
    Optional<EntityReference> newLogicalDataElement = Optional.empty();
    @JsonProperty("newLogicalDataElement")
    public void setNewLogicalDataElement(Optional<EntityReference> newLogicalDataElement) {
      this.newLogicalDataElement = newLogicalDataElement;
    }
    @Override
    public Optional<EntityReference> newLogicalDataElement() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLogicalDataElementChangeCommand fromJson(Json json) {
    ImmutableLogicalDataElementChangeCommand.Builder builder = ImmutableLogicalDataElementChangeCommand.builder();
    if (json.newLogicalDataElement != null) {
      builder.newLogicalDataElement(json.newLogicalDataElement);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LogicalDataElementChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LogicalDataElementChangeCommand instance
   */
  public static ImmutableLogicalDataElementChangeCommand copyOf(LogicalDataElementChangeCommand instance) {
    if (instance instanceof ImmutableLogicalDataElementChangeCommand) {
      return (ImmutableLogicalDataElementChangeCommand) instance;
    }
    return ImmutableLogicalDataElementChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogicalDataElementChangeCommand ImmutableLogicalDataElementChangeCommand}.
   * @return A new ImmutableLogicalDataElementChangeCommand builder
   */
  public static ImmutableLogicalDataElementChangeCommand.Builder builder() {
    return new ImmutableLogicalDataElementChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogicalDataElementChangeCommand ImmutableLogicalDataElementChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private EntityReference newLogicalDataElement;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LogicalDataElementChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LogicalDataElementChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<EntityReference> newLogicalDataElementOptional = instance.newLogicalDataElement();
      if (newLogicalDataElementOptional.isPresent()) {
        newLogicalDataElement(newLogicalDataElementOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalDataElementChangeCommand#newLogicalDataElement() newLogicalDataElement} to newLogicalDataElement.
     * @param newLogicalDataElement The value for newLogicalDataElement
     * @return {@code this} builder for chained invocation
     */
    public final Builder newLogicalDataElement(EntityReference newLogicalDataElement) {
      this.newLogicalDataElement = Objects.requireNonNull(newLogicalDataElement, "newLogicalDataElement");
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalDataElementChangeCommand#newLogicalDataElement() newLogicalDataElement} to newLogicalDataElement.
     * @param newLogicalDataElement The value for newLogicalDataElement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newLogicalDataElement")
    public final Builder newLogicalDataElement(Optional<? extends EntityReference> newLogicalDataElement) {
      this.newLogicalDataElement = newLogicalDataElement.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableLogicalDataElementChangeCommand ImmutableLogicalDataElementChangeCommand}.
     * @return An immutable instance of LogicalDataElementChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLogicalDataElementChangeCommand build() {
      return new ImmutableLogicalDataElementChangeCommand(newLogicalDataElement);
    }
  }
}
