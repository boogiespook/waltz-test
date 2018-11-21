package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link FlowAttributes}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlowAttributes.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FlowAttributes"})
public final class ImmutableFlowAttributes extends FlowAttributes {
  private final TransportKind transport;
  private final FrequencyKind frequency;
  private final Criticality criticality;
  private final int basisOffset;
  private final @Nullable String description;

  private ImmutableFlowAttributes(
      TransportKind transport,
      FrequencyKind frequency,
      Criticality criticality,
      int basisOffset,
      @Nullable String description) {
    this.transport = transport;
    this.frequency = frequency;
    this.criticality = criticality;
    this.basisOffset = basisOffset;
    this.description = description;
  }

  /**
   * @return The value of the {@code transport} attribute
   */
  @JsonProperty("transport")
  @Override
  public TransportKind transport() {
    return transport;
  }

  /**
   * @return The value of the {@code frequency} attribute
   */
  @JsonProperty("frequency")
  @Override
  public FrequencyKind frequency() {
    return frequency;
  }

  /**
   * @return The value of the {@code criticality} attribute
   */
  @JsonProperty("criticality")
  @Override
  public Criticality criticality() {
    return criticality;
  }

  /**
   * @return The value of the {@code basisOffset} attribute
   */
  @JsonProperty("basisOffset")
  @Override
  public int basisOffset() {
    return basisOffset;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowAttributes#transport() transport} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transport
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowAttributes withTransport(TransportKind value) {
    if (this.transport == value) return this;
    TransportKind newValue = Objects.requireNonNull(value, "transport");
    return new ImmutableFlowAttributes(newValue, this.frequency, this.criticality, this.basisOffset, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowAttributes#frequency() frequency} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for frequency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowAttributes withFrequency(FrequencyKind value) {
    if (this.frequency == value) return this;
    FrequencyKind newValue = Objects.requireNonNull(value, "frequency");
    return new ImmutableFlowAttributes(this.transport, newValue, this.criticality, this.basisOffset, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowAttributes#criticality() criticality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for criticality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowAttributes withCriticality(Criticality value) {
    if (this.criticality == value) return this;
    Criticality newValue = Objects.requireNonNull(value, "criticality");
    return new ImmutableFlowAttributes(this.transport, this.frequency, newValue, this.basisOffset, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowAttributes#basisOffset() basisOffset} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for basisOffset
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowAttributes withBasisOffset(int value) {
    if (this.basisOffset == value) return this;
    return new ImmutableFlowAttributes(this.transport, this.frequency, this.criticality, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowAttributes#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowAttributes withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableFlowAttributes(this.transport, this.frequency, this.criticality, this.basisOffset, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlowAttributes} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlowAttributes
        && equalTo((ImmutableFlowAttributes) another);
  }

  private boolean equalTo(ImmutableFlowAttributes another) {
    return transport.equals(another.transport)
        && frequency.equals(another.frequency)
        && criticality.equals(another.criticality)
        && basisOffset == another.basisOffset
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code transport}, {@code frequency}, {@code criticality}, {@code basisOffset}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transport.hashCode();
    h += (h << 5) + frequency.hashCode();
    h += (h << 5) + criticality.hashCode();
    h += (h << 5) + basisOffset;
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code FlowAttributes} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "FlowAttributes{"
        + "transport=" + transport
        + ", frequency=" + frequency
        + ", criticality=" + criticality
        + ", basisOffset=" + basisOffset
        + ", description=" + description
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends FlowAttributes {
    TransportKind transport;
    FrequencyKind frequency;
    Criticality criticality;
    int basisOffset;
    boolean basisOffsetIsSet;
    String description;
    @JsonProperty("transport")
    public void setTransport(TransportKind transport) {
      this.transport = transport;
    }
    @JsonProperty("frequency")
    public void setFrequency(FrequencyKind frequency) {
      this.frequency = frequency;
    }
    @JsonProperty("criticality")
    public void setCriticality(Criticality criticality) {
      this.criticality = criticality;
    }
    @JsonProperty("basisOffset")
    public void setBasisOffset(int basisOffset) {
      this.basisOffset = basisOffset;
      this.basisOffsetIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public TransportKind transport() { throw new UnsupportedOperationException(); }
    @Override
    public FrequencyKind frequency() { throw new UnsupportedOperationException(); }
    @Override
    public Criticality criticality() { throw new UnsupportedOperationException(); }
    @Override
    public int basisOffset() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFlowAttributes fromJson(Json json) {
    ImmutableFlowAttributes.Builder builder = ImmutableFlowAttributes.builder();
    if (json.transport != null) {
      builder.transport(json.transport);
    }
    if (json.frequency != null) {
      builder.frequency(json.frequency);
    }
    if (json.criticality != null) {
      builder.criticality(json.criticality);
    }
    if (json.basisOffsetIsSet) {
      builder.basisOffset(json.basisOffset);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FlowAttributes} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FlowAttributes instance
   */
  public static ImmutableFlowAttributes copyOf(FlowAttributes instance) {
    if (instance instanceof ImmutableFlowAttributes) {
      return (ImmutableFlowAttributes) instance;
    }
    return ImmutableFlowAttributes.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFlowAttributes ImmutableFlowAttributes}.
   * @return A new ImmutableFlowAttributes builder
   */
  public static ImmutableFlowAttributes.Builder builder() {
    return new ImmutableFlowAttributes.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFlowAttributes ImmutableFlowAttributes}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TRANSPORT = 0x1L;
    private static final long INIT_BIT_FREQUENCY = 0x2L;
    private static final long INIT_BIT_CRITICALITY = 0x4L;
    private static final long INIT_BIT_BASIS_OFFSET = 0x8L;
    private long initBits = 0xfL;

    private TransportKind transport;
    private FrequencyKind frequency;
    private Criticality criticality;
    private int basisOffset;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_flow.FlowAttributes} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FlowAttributes instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof FlowAttributes) {
        FlowAttributes instance = (FlowAttributes) object;
        criticality(instance.criticality());
        basisOffset(instance.basisOffset());
        transport(instance.transport());
        frequency(instance.frequency());
      }
    }

    /**
     * Initializes the value for the {@link FlowAttributes#transport() transport} attribute.
     * @param transport The value for transport 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transport")
    public final Builder transport(TransportKind transport) {
      this.transport = Objects.requireNonNull(transport, "transport");
      initBits &= ~INIT_BIT_TRANSPORT;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowAttributes#frequency() frequency} attribute.
     * @param frequency The value for frequency 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequency")
    public final Builder frequency(FrequencyKind frequency) {
      this.frequency = Objects.requireNonNull(frequency, "frequency");
      initBits &= ~INIT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowAttributes#criticality() criticality} attribute.
     * @param criticality The value for criticality 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criticality")
    public final Builder criticality(Criticality criticality) {
      this.criticality = Objects.requireNonNull(criticality, "criticality");
      initBits &= ~INIT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowAttributes#basisOffset() basisOffset} attribute.
     * @param basisOffset The value for basisOffset 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basisOffset")
    public final Builder basisOffset(int basisOffset) {
      this.basisOffset = basisOffset;
      initBits &= ~INIT_BIT_BASIS_OFFSET;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowAttributes#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFlowAttributes ImmutableFlowAttributes}.
     * @return An immutable instance of FlowAttributes
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFlowAttributes build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFlowAttributes(transport, frequency, criticality, basisOffset, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TRANSPORT) != 0) attributes.add("transport");
      if ((initBits & INIT_BIT_FREQUENCY) != 0) attributes.add("frequency");
      if ((initBits & INIT_BIT_CRITICALITY) != 0) attributes.add("criticality");
      if ((initBits & INIT_BIT_BASIS_OFFSET) != 0) attributes.add("basisOffset");
      return "Cannot build FlowAttributes, some of required attributes are not set " + attributes;
    }
  }
}
