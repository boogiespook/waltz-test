package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.physical_specification.PhysicalSpecification;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowCreateCommand"})
public final class ImmutablePhysicalFlowCreateCommand
    extends PhysicalFlowCreateCommand {
  private final PhysicalSpecification specification;
  private final long logicalFlowId;
  private final FlowAttributes flowAttributes;

  private ImmutablePhysicalFlowCreateCommand(
      PhysicalSpecification specification,
      long logicalFlowId,
      FlowAttributes flowAttributes) {
    this.specification = specification;
    this.logicalFlowId = logicalFlowId;
    this.flowAttributes = flowAttributes;
  }

  /**
   * @return The value of the {@code specification} attribute
   */
  @JsonProperty("specification")
  @Override
  public PhysicalSpecification specification() {
    return specification;
  }

  /**
   * @return The value of the {@code logicalFlowId} attribute
   */
  @JsonProperty("logicalFlowId")
  @Override
  public long logicalFlowId() {
    return logicalFlowId;
  }

  /**
   * @return The value of the {@code flowAttributes} attribute
   */
  @JsonProperty("flowAttributes")
  @Override
  public FlowAttributes flowAttributes() {
    return flowAttributes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowCreateCommand#specification() specification} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specification
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowCreateCommand withSpecification(PhysicalSpecification value) {
    if (this.specification == value) return this;
    PhysicalSpecification newValue = Objects.requireNonNull(value, "specification");
    return new ImmutablePhysicalFlowCreateCommand(newValue, this.logicalFlowId, this.flowAttributes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowCreateCommand#logicalFlowId() logicalFlowId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for logicalFlowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowCreateCommand withLogicalFlowId(long value) {
    if (this.logicalFlowId == value) return this;
    return new ImmutablePhysicalFlowCreateCommand(this.specification, value, this.flowAttributes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowCreateCommand#flowAttributes() flowAttributes} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for flowAttributes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowCreateCommand withFlowAttributes(FlowAttributes value) {
    if (this.flowAttributes == value) return this;
    FlowAttributes newValue = Objects.requireNonNull(value, "flowAttributes");
    return new ImmutablePhysicalFlowCreateCommand(this.specification, this.logicalFlowId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowCreateCommand
        && equalTo((ImmutablePhysicalFlowCreateCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowCreateCommand another) {
    return specification.equals(another.specification)
        && logicalFlowId == another.logicalFlowId
        && flowAttributes.equals(another.flowAttributes);
  }

  /**
   * Computes a hash code from attributes: {@code specification}, {@code logicalFlowId}, {@code flowAttributes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + specification.hashCode();
    h += (h << 5) + Long.hashCode(logicalFlowId);
    h += (h << 5) + flowAttributes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalFlowCreateCommand{"
        + "specification=" + specification
        + ", logicalFlowId=" + logicalFlowId
        + ", flowAttributes=" + flowAttributes
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PhysicalFlowCreateCommand {
    PhysicalSpecification specification;
    long logicalFlowId;
    boolean logicalFlowIdIsSet;
    FlowAttributes flowAttributes;
    @JsonProperty("specification")
    public void setSpecification(PhysicalSpecification specification) {
      this.specification = specification;
    }
    @JsonProperty("logicalFlowId")
    public void setLogicalFlowId(long logicalFlowId) {
      this.logicalFlowId = logicalFlowId;
      this.logicalFlowIdIsSet = true;
    }
    @JsonProperty("flowAttributes")
    public void setFlowAttributes(FlowAttributes flowAttributes) {
      this.flowAttributes = flowAttributes;
    }
    @Override
    public PhysicalSpecification specification() { throw new UnsupportedOperationException(); }
    @Override
    public long logicalFlowId() { throw new UnsupportedOperationException(); }
    @Override
    public FlowAttributes flowAttributes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlowCreateCommand fromJson(Json json) {
    ImmutablePhysicalFlowCreateCommand.Builder builder = ImmutablePhysicalFlowCreateCommand.builder();
    if (json.specification != null) {
      builder.specification(json.specification);
    }
    if (json.logicalFlowIdIsSet) {
      builder.logicalFlowId(json.logicalFlowId);
    }
    if (json.flowAttributes != null) {
      builder.flowAttributes(json.flowAttributes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalFlowCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowCreateCommand instance
   */
  public static ImmutablePhysicalFlowCreateCommand copyOf(PhysicalFlowCreateCommand instance) {
    if (instance instanceof ImmutablePhysicalFlowCreateCommand) {
      return (ImmutablePhysicalFlowCreateCommand) instance;
    }
    return ImmutablePhysicalFlowCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowCreateCommand ImmutablePhysicalFlowCreateCommand}.
   * @return A new ImmutablePhysicalFlowCreateCommand builder
   */
  public static ImmutablePhysicalFlowCreateCommand.Builder builder() {
    return new ImmutablePhysicalFlowCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowCreateCommand ImmutablePhysicalFlowCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SPECIFICATION = 0x1L;
    private static final long INIT_BIT_LOGICAL_FLOW_ID = 0x2L;
    private static final long INIT_BIT_FLOW_ATTRIBUTES = 0x4L;
    private long initBits = 0x7L;

    private PhysicalSpecification specification;
    private long logicalFlowId;
    private FlowAttributes flowAttributes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalFlowCreateCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      specification(instance.specification());
      logicalFlowId(instance.logicalFlowId());
      flowAttributes(instance.flowAttributes());
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowCreateCommand#specification() specification} attribute.
     * @param specification The value for specification 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specification")
    public final Builder specification(PhysicalSpecification specification) {
      this.specification = Objects.requireNonNull(specification, "specification");
      initBits &= ~INIT_BIT_SPECIFICATION;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowCreateCommand#logicalFlowId() logicalFlowId} attribute.
     * @param logicalFlowId The value for logicalFlowId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("logicalFlowId")
    public final Builder logicalFlowId(long logicalFlowId) {
      this.logicalFlowId = logicalFlowId;
      initBits &= ~INIT_BIT_LOGICAL_FLOW_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowCreateCommand#flowAttributes() flowAttributes} attribute.
     * @param flowAttributes The value for flowAttributes 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("flowAttributes")
    public final Builder flowAttributes(FlowAttributes flowAttributes) {
      this.flowAttributes = Objects.requireNonNull(flowAttributes, "flowAttributes");
      initBits &= ~INIT_BIT_FLOW_ATTRIBUTES;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowCreateCommand ImmutablePhysicalFlowCreateCommand}.
     * @return An immutable instance of PhysicalFlowCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowCreateCommand(specification, logicalFlowId, flowAttributes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SPECIFICATION) != 0) attributes.add("specification");
      if ((initBits & INIT_BIT_LOGICAL_FLOW_ID) != 0) attributes.add("logicalFlowId");
      if ((initBits & INIT_BIT_FLOW_ATTRIBUTES) != 0) attributes.add("flowAttributes");
      return "Cannot build PhysicalFlowCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
