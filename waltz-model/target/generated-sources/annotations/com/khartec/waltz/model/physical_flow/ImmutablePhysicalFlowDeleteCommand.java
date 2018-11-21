package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowDeleteCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowDeleteCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowDeleteCommand"})
public final class ImmutablePhysicalFlowDeleteCommand
    extends PhysicalFlowDeleteCommand {
  private final long flowId;

  private ImmutablePhysicalFlowDeleteCommand(long flowId) {
    this.flowId = flowId;
  }

  /**
   * @return The value of the {@code flowId} attribute
   */
  @JsonProperty("flowId")
  @Override
  public long flowId() {
    return flowId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowDeleteCommand#flowId() flowId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for flowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowDeleteCommand withFlowId(long value) {
    if (this.flowId == value) return this;
    return new ImmutablePhysicalFlowDeleteCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowDeleteCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowDeleteCommand
        && equalTo((ImmutablePhysicalFlowDeleteCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowDeleteCommand another) {
    return flowId == another.flowId;
  }

  /**
   * Computes a hash code from attributes: {@code flowId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(flowId);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowDeleteCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalFlowDeleteCommand{"
        + "flowId=" + flowId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PhysicalFlowDeleteCommand {
    long flowId;
    boolean flowIdIsSet;
    @JsonProperty("flowId")
    public void setFlowId(long flowId) {
      this.flowId = flowId;
      this.flowIdIsSet = true;
    }
    @Override
    public long flowId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlowDeleteCommand fromJson(Json json) {
    ImmutablePhysicalFlowDeleteCommand.Builder builder = ImmutablePhysicalFlowDeleteCommand.builder();
    if (json.flowIdIsSet) {
      builder.flowId(json.flowId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalFlowDeleteCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowDeleteCommand instance
   */
  public static ImmutablePhysicalFlowDeleteCommand copyOf(PhysicalFlowDeleteCommand instance) {
    if (instance instanceof ImmutablePhysicalFlowDeleteCommand) {
      return (ImmutablePhysicalFlowDeleteCommand) instance;
    }
    return ImmutablePhysicalFlowDeleteCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowDeleteCommand ImmutablePhysicalFlowDeleteCommand}.
   * @return A new ImmutablePhysicalFlowDeleteCommand builder
   */
  public static ImmutablePhysicalFlowDeleteCommand.Builder builder() {
    return new ImmutablePhysicalFlowDeleteCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowDeleteCommand ImmutablePhysicalFlowDeleteCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_FLOW_ID = 0x1L;
    private long initBits = 0x1L;

    private long flowId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalFlowDeleteCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowDeleteCommand instance) {
      Objects.requireNonNull(instance, "instance");
      flowId(instance.flowId());
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowDeleteCommand#flowId() flowId} attribute.
     * @param flowId The value for flowId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("flowId")
    public final Builder flowId(long flowId) {
      this.flowId = flowId;
      initBits &= ~INIT_BIT_FLOW_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowDeleteCommand ImmutablePhysicalFlowDeleteCommand}.
     * @return An immutable instance of PhysicalFlowDeleteCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowDeleteCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowDeleteCommand(flowId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_FLOW_ID) != 0) attributes.add("flowId");
      return "Cannot build PhysicalFlowDeleteCommand, some of required attributes are not set " + attributes;
    }
  }
}
