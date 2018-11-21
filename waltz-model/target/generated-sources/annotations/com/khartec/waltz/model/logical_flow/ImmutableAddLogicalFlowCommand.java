package com.khartec.waltz.model.logical_flow;

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
 * Immutable implementation of {@link AddLogicalFlowCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAddLogicalFlowCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AddLogicalFlowCommand"})
public final class ImmutableAddLogicalFlowCommand
    extends AddLogicalFlowCommand {
  private final EntityReference source;
  private final EntityReference target;

  private ImmutableAddLogicalFlowCommand(EntityReference source, EntityReference target) {
    this.source = source;
    this.target = target;
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public EntityReference source() {
    return source;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public EntityReference target() {
    return target;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddLogicalFlowCommand#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddLogicalFlowCommand withSource(EntityReference value) {
    if (this.source == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "source");
    return new ImmutableAddLogicalFlowCommand(newValue, this.target);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AddLogicalFlowCommand#target() target} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for target
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddLogicalFlowCommand withTarget(EntityReference value) {
    if (this.target == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "target");
    return new ImmutableAddLogicalFlowCommand(this.source, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAddLogicalFlowCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAddLogicalFlowCommand
        && equalTo((ImmutableAddLogicalFlowCommand) another);
  }

  private boolean equalTo(ImmutableAddLogicalFlowCommand another) {
    return source.equals(another.source)
        && target.equals(another.target);
  }

  /**
   * Computes a hash code from attributes: {@code source}, {@code target}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + source.hashCode();
    h += (h << 5) + target.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AddLogicalFlowCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AddLogicalFlowCommand{"
        + "source=" + source
        + ", target=" + target
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AddLogicalFlowCommand {
    EntityReference source;
    EntityReference target;
    @JsonProperty("source")
    public void setSource(EntityReference source) {
      this.source = source;
    }
    @JsonProperty("target")
    public void setTarget(EntityReference target) {
      this.target = target;
    }
    @Override
    public EntityReference source() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference target() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAddLogicalFlowCommand fromJson(Json json) {
    ImmutableAddLogicalFlowCommand.Builder builder = ImmutableAddLogicalFlowCommand.builder();
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.target != null) {
      builder.target(json.target);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AddLogicalFlowCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AddLogicalFlowCommand instance
   */
  public static ImmutableAddLogicalFlowCommand copyOf(AddLogicalFlowCommand instance) {
    if (instance instanceof ImmutableAddLogicalFlowCommand) {
      return (ImmutableAddLogicalFlowCommand) instance;
    }
    return ImmutableAddLogicalFlowCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAddLogicalFlowCommand ImmutableAddLogicalFlowCommand}.
   * @return A new ImmutableAddLogicalFlowCommand builder
   */
  public static ImmutableAddLogicalFlowCommand.Builder builder() {
    return new ImmutableAddLogicalFlowCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAddLogicalFlowCommand ImmutableAddLogicalFlowCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_TARGET = 0x2L;
    private long initBits = 0x3L;

    private EntityReference source;
    private EntityReference target;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AddLogicalFlowCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AddLogicalFlowCommand instance) {
      Objects.requireNonNull(instance, "instance");
      source(instance.source());
      target(instance.target());
      return this;
    }

    /**
     * Initializes the value for the {@link AddLogicalFlowCommand#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(EntityReference source) {
      this.source = Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the value for the {@link AddLogicalFlowCommand#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(EntityReference target) {
      this.target = Objects.requireNonNull(target, "target");
      initBits &= ~INIT_BIT_TARGET;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAddLogicalFlowCommand ImmutableAddLogicalFlowCommand}.
     * @return An immutable instance of AddLogicalFlowCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAddLogicalFlowCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAddLogicalFlowCommand(source, target);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SOURCE) != 0) attributes.add("source");
      if ((initBits & INIT_BIT_TARGET) != 0) attributes.add("target");
      return "Cannot build AddLogicalFlowCommand, some of required attributes are not set " + attributes;
    }
  }
}
