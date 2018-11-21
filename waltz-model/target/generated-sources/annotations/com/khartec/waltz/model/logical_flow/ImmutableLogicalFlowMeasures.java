package com.khartec.waltz.model.logical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LogicalFlowMeasures}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogicalFlowMeasures.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LogicalFlowMeasures"})
public final class ImmutableLogicalFlowMeasures
    extends LogicalFlowMeasures {
  private final double inbound;
  private final double outbound;
  private final double intra;

  private ImmutableLogicalFlowMeasures(double inbound, double outbound, double intra) {
    this.inbound = inbound;
    this.outbound = outbound;
    this.intra = intra;
  }

  /**
   * @return The value of the {@code inbound} attribute
   */
  @JsonProperty("inbound")
  @Override
  public double inbound() {
    return inbound;
  }

  /**
   * @return The value of the {@code outbound} attribute
   */
  @JsonProperty("outbound")
  @Override
  public double outbound() {
    return outbound;
  }

  /**
   * @return The value of the {@code intra} attribute
   */
  @JsonProperty("intra")
  @Override
  public double intra() {
    return intra;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowMeasures#inbound() inbound} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for inbound
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowMeasures withInbound(double value) {
    if (Double.doubleToLongBits(this.inbound) == Double.doubleToLongBits(value)) return this;
    return new ImmutableLogicalFlowMeasures(value, this.outbound, this.intra);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowMeasures#outbound() outbound} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outbound
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowMeasures withOutbound(double value) {
    if (Double.doubleToLongBits(this.outbound) == Double.doubleToLongBits(value)) return this;
    return new ImmutableLogicalFlowMeasures(this.inbound, value, this.intra);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowMeasures#intra() intra} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for intra
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowMeasures withIntra(double value) {
    if (Double.doubleToLongBits(this.intra) == Double.doubleToLongBits(value)) return this;
    return new ImmutableLogicalFlowMeasures(this.inbound, this.outbound, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogicalFlowMeasures} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogicalFlowMeasures
        && equalTo((ImmutableLogicalFlowMeasures) another);
  }

  private boolean equalTo(ImmutableLogicalFlowMeasures another) {
    return Double.doubleToLongBits(inbound) == Double.doubleToLongBits(another.inbound)
        && Double.doubleToLongBits(outbound) == Double.doubleToLongBits(another.outbound)
        && Double.doubleToLongBits(intra) == Double.doubleToLongBits(another.intra);
  }

  /**
   * Computes a hash code from attributes: {@code inbound}, {@code outbound}, {@code intra}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Double.hashCode(inbound);
    h += (h << 5) + Double.hashCode(outbound);
    h += (h << 5) + Double.hashCode(intra);
    return h;
  }

  /**
   * Prints the immutable value {@code LogicalFlowMeasures} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "LogicalFlowMeasures{"
        + "inbound=" + inbound
        + ", outbound=" + outbound
        + ", intra=" + intra
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LogicalFlowMeasures {
    double inbound;
    boolean inboundIsSet;
    double outbound;
    boolean outboundIsSet;
    double intra;
    boolean intraIsSet;
    @JsonProperty("inbound")
    public void setInbound(double inbound) {
      this.inbound = inbound;
      this.inboundIsSet = true;
    }
    @JsonProperty("outbound")
    public void setOutbound(double outbound) {
      this.outbound = outbound;
      this.outboundIsSet = true;
    }
    @JsonProperty("intra")
    public void setIntra(double intra) {
      this.intra = intra;
      this.intraIsSet = true;
    }
    @Override
    public double inbound() { throw new UnsupportedOperationException(); }
    @Override
    public double outbound() { throw new UnsupportedOperationException(); }
    @Override
    public double intra() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLogicalFlowMeasures fromJson(Json json) {
    ImmutableLogicalFlowMeasures.Builder builder = ImmutableLogicalFlowMeasures.builder();
    if (json.inboundIsSet) {
      builder.inbound(json.inbound);
    }
    if (json.outboundIsSet) {
      builder.outbound(json.outbound);
    }
    if (json.intraIsSet) {
      builder.intra(json.intra);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LogicalFlowMeasures} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LogicalFlowMeasures instance
   */
  public static ImmutableLogicalFlowMeasures copyOf(LogicalFlowMeasures instance) {
    if (instance instanceof ImmutableLogicalFlowMeasures) {
      return (ImmutableLogicalFlowMeasures) instance;
    }
    return ImmutableLogicalFlowMeasures.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogicalFlowMeasures ImmutableLogicalFlowMeasures}.
   * @return A new ImmutableLogicalFlowMeasures builder
   */
  public static ImmutableLogicalFlowMeasures.Builder builder() {
    return new ImmutableLogicalFlowMeasures.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogicalFlowMeasures ImmutableLogicalFlowMeasures}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_INBOUND = 0x1L;
    private static final long INIT_BIT_OUTBOUND = 0x2L;
    private static final long INIT_BIT_INTRA = 0x4L;
    private long initBits = 0x7L;

    private double inbound;
    private double outbound;
    private double intra;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LogicalFlowMeasures} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LogicalFlowMeasures instance) {
      Objects.requireNonNull(instance, "instance");
      inbound(instance.inbound());
      outbound(instance.outbound());
      intra(instance.intra());
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowMeasures#inbound() inbound} attribute.
     * @param inbound The value for inbound 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inbound")
    public final Builder inbound(double inbound) {
      this.inbound = inbound;
      initBits &= ~INIT_BIT_INBOUND;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowMeasures#outbound() outbound} attribute.
     * @param outbound The value for outbound 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outbound")
    public final Builder outbound(double outbound) {
      this.outbound = outbound;
      initBits &= ~INIT_BIT_OUTBOUND;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowMeasures#intra() intra} attribute.
     * @param intra The value for intra 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intra")
    public final Builder intra(double intra) {
      this.intra = intra;
      initBits &= ~INIT_BIT_INTRA;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLogicalFlowMeasures ImmutableLogicalFlowMeasures}.
     * @return An immutable instance of LogicalFlowMeasures
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLogicalFlowMeasures build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLogicalFlowMeasures(inbound, outbound, intra);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_INBOUND) != 0) attributes.add("inbound");
      if ((initBits & INIT_BIT_OUTBOUND) != 0) attributes.add("outbound");
      if ((initBits & INIT_BIT_INTRA) != 0) attributes.add("intra");
      return "Cannot build LogicalFlowMeasures, some of required attributes are not set " + attributes;
    }
  }
}
