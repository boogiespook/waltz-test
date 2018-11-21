package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.physical_specification.DataFormatKind;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowParsed}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowParsed.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowParsed"})
public final class ImmutablePhysicalFlowParsed
    extends PhysicalFlowParsed {
  private final @Nullable EntityReference source;
  private final @Nullable EntityReference target;
  private final @Nullable EntityReference owner;
  private final @Nullable DataFormatKind format;
  private final String name;
  private final @Nullable String specDescription;
  private final @Nullable String specExternalId;
  private final @Nullable Integer basisOffset;
  private final @Nullable Criticality criticality;
  private final String description;
  private final @Nullable String externalId;
  private final @Nullable FrequencyKind frequency;
  private final @Nullable TransportKind transport;
  private final @Nullable EntityReference dataType;

  private ImmutablePhysicalFlowParsed(
      @Nullable EntityReference source,
      @Nullable EntityReference target,
      @Nullable EntityReference owner,
      @Nullable DataFormatKind format,
      String name,
      @Nullable String specDescription,
      @Nullable String specExternalId,
      @Nullable Integer basisOffset,
      @Nullable Criticality criticality,
      String description,
      @Nullable String externalId,
      @Nullable FrequencyKind frequency,
      @Nullable TransportKind transport,
      @Nullable EntityReference dataType) {
    this.source = source;
    this.target = target;
    this.owner = owner;
    this.format = format;
    this.name = name;
    this.specDescription = specDescription;
    this.specExternalId = specExternalId;
    this.basisOffset = basisOffset;
    this.criticality = criticality;
    this.description = description;
    this.externalId = externalId;
    this.frequency = frequency;
    this.transport = transport;
    this.dataType = dataType;
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public @Nullable EntityReference source() {
    return source;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public @Nullable EntityReference target() {
    return target;
  }

  /**
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public @Nullable EntityReference owner() {
    return owner;
  }

  /**
   * @return The value of the {@code format} attribute
   */
  @JsonProperty("format")
  @Override
  public @Nullable DataFormatKind format() {
    return format;
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
   * @return The value of the {@code specDescription} attribute
   */
  @JsonProperty("specDescription")
  @Override
  public @Nullable String specDescription() {
    return specDescription;
  }

  /**
   * @return The value of the {@code specExternalId} attribute
   */
  @JsonProperty("specExternalId")
  @Override
  public @Nullable String specExternalId() {
    return specExternalId;
  }

  /**
   * @return The value of the {@code basisOffset} attribute
   */
  @JsonProperty("basisOffset")
  @Override
  public @Nullable Integer basisOffset() {
    return basisOffset;
  }

  /**
   * @return The value of the {@code criticality} attribute
   */
  @JsonProperty("criticality")
  @Override
  public @Nullable Criticality criticality() {
    return criticality;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public @Nullable String externalId() {
    return externalId;
  }

  /**
   * @return The value of the {@code frequency} attribute
   */
  @JsonProperty("frequency")
  @Override
  public @Nullable FrequencyKind frequency() {
    return frequency;
  }

  /**
   * @return The value of the {@code transport} attribute
   */
  @JsonProperty("transport")
  @Override
  public @Nullable TransportKind transport() {
    return transport;
  }

  /**
   * @return The value of the {@code dataType} attribute
   */
  @JsonProperty("dataType")
  @Override
  public @Nullable EntityReference dataType() {
    return dataType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withSource(@Nullable EntityReference value) {
    if (this.source == value) return this;
    return new ImmutablePhysicalFlowParsed(
        value,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#target() target} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for target (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withTarget(@Nullable EntityReference value) {
    if (this.target == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        value,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#owner() owner} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for owner (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withOwner(@Nullable EntityReference value) {
    if (this.owner == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        value,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#format() format} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for format (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withFormat(@Nullable DataFormatKind value) {
    if (this.format == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        value,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        newValue,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#specDescription() specDescription} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specDescription (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withSpecDescription(@Nullable String value) {
    if (Objects.equals(this.specDescription, value)) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        value,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#specExternalId() specExternalId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specExternalId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withSpecExternalId(@Nullable String value) {
    if (Objects.equals(this.specExternalId, value)) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        value,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#basisOffset() basisOffset} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for basisOffset (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withBasisOffset(@Nullable Integer value) {
    if (Objects.equals(this.basisOffset, value)) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        value,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#criticality() criticality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for criticality (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withCriticality(@Nullable Criticality value) {
    if (this.criticality == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        value,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "description");
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        newValue,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#externalId() externalId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for externalId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withExternalId(@Nullable String value) {
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        value,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#frequency() frequency} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for frequency (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withFrequency(@Nullable FrequencyKind value) {
    if (this.frequency == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        value,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#transport() transport} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transport (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withTransport(@Nullable TransportKind value) {
    if (this.transport == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        value,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowParsed#dataType() dataType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowParsed withDataType(@Nullable EntityReference value) {
    if (this.dataType == value) return this;
    return new ImmutablePhysicalFlowParsed(
        this.source,
        this.target,
        this.owner,
        this.format,
        this.name,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowParsed} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowParsed
        && equalTo((ImmutablePhysicalFlowParsed) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowParsed another) {
    return Objects.equals(source, another.source)
        && Objects.equals(target, another.target)
        && Objects.equals(owner, another.owner)
        && Objects.equals(format, another.format)
        && name.equals(another.name)
        && Objects.equals(specDescription, another.specDescription)
        && Objects.equals(specExternalId, another.specExternalId)
        && Objects.equals(basisOffset, another.basisOffset)
        && Objects.equals(criticality, another.criticality)
        && description.equals(another.description)
        && Objects.equals(externalId, another.externalId)
        && Objects.equals(frequency, another.frequency)
        && Objects.equals(transport, another.transport)
        && Objects.equals(dataType, another.dataType);
  }

  /**
   * Computes a hash code from attributes: {@code source}, {@code target}, {@code owner}, {@code format}, {@code name}, {@code specDescription}, {@code specExternalId}, {@code basisOffset}, {@code criticality}, {@code description}, {@code externalId}, {@code frequency}, {@code transport}, {@code dataType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(owner);
    h += (h << 5) + Objects.hashCode(format);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(specDescription);
    h += (h << 5) + Objects.hashCode(specExternalId);
    h += (h << 5) + Objects.hashCode(basisOffset);
    h += (h << 5) + Objects.hashCode(criticality);
    h += (h << 5) + description.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + Objects.hashCode(frequency);
    h += (h << 5) + Objects.hashCode(transport);
    h += (h << 5) + Objects.hashCode(dataType);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowParsed} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalFlowParsed{"
        + "source=" + source
        + ", target=" + target
        + ", owner=" + owner
        + ", format=" + format
        + ", name=" + name
        + ", specDescription=" + specDescription
        + ", specExternalId=" + specExternalId
        + ", basisOffset=" + basisOffset
        + ", criticality=" + criticality
        + ", description=" + description
        + ", externalId=" + externalId
        + ", frequency=" + frequency
        + ", transport=" + transport
        + ", dataType=" + dataType
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PhysicalFlowParsed {
    EntityReference source;
    EntityReference target;
    EntityReference owner;
    DataFormatKind format;
    String name;
    String specDescription;
    String specExternalId;
    Integer basisOffset;
    Criticality criticality;
    String description;
    String externalId;
    FrequencyKind frequency;
    TransportKind transport;
    EntityReference dataType;
    @JsonProperty("source")
    public void setSource(@Nullable EntityReference source) {
      this.source = source;
    }
    @JsonProperty("target")
    public void setTarget(@Nullable EntityReference target) {
      this.target = target;
    }
    @JsonProperty("owner")
    public void setOwner(@Nullable EntityReference owner) {
      this.owner = owner;
    }
    @JsonProperty("format")
    public void setFormat(@Nullable DataFormatKind format) {
      this.format = format;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("specDescription")
    public void setSpecDescription(@Nullable String specDescription) {
      this.specDescription = specDescription;
    }
    @JsonProperty("specExternalId")
    public void setSpecExternalId(@Nullable String specExternalId) {
      this.specExternalId = specExternalId;
    }
    @JsonProperty("basisOffset")
    public void setBasisOffset(@Nullable Integer basisOffset) {
      this.basisOffset = basisOffset;
    }
    @JsonProperty("criticality")
    public void setCriticality(@Nullable Criticality criticality) {
      this.criticality = criticality;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
      this.description = description;
    }
    @JsonProperty("externalId")
    public void setExternalId(@Nullable String externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("frequency")
    public void setFrequency(@Nullable FrequencyKind frequency) {
      this.frequency = frequency;
    }
    @JsonProperty("transport")
    public void setTransport(@Nullable TransportKind transport) {
      this.transport = transport;
    }
    @JsonProperty("dataType")
    public void setDataType(@Nullable EntityReference dataType) {
      this.dataType = dataType;
    }
    @Override
    public EntityReference source() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference target() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference owner() { throw new UnsupportedOperationException(); }
    @Override
    public DataFormatKind format() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String specDescription() { throw new UnsupportedOperationException(); }
    @Override
    public String specExternalId() { throw new UnsupportedOperationException(); }
    @Override
    public Integer basisOffset() { throw new UnsupportedOperationException(); }
    @Override
    public Criticality criticality() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String externalId() { throw new UnsupportedOperationException(); }
    @Override
    public FrequencyKind frequency() { throw new UnsupportedOperationException(); }
    @Override
    public TransportKind transport() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference dataType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlowParsed fromJson(Json json) {
    ImmutablePhysicalFlowParsed.Builder builder = ImmutablePhysicalFlowParsed.builder();
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.target != null) {
      builder.target(json.target);
    }
    if (json.owner != null) {
      builder.owner(json.owner);
    }
    if (json.format != null) {
      builder.format(json.format);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.specDescription != null) {
      builder.specDescription(json.specDescription);
    }
    if (json.specExternalId != null) {
      builder.specExternalId(json.specExternalId);
    }
    if (json.basisOffset != null) {
      builder.basisOffset(json.basisOffset);
    }
    if (json.criticality != null) {
      builder.criticality(json.criticality);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.frequency != null) {
      builder.frequency(json.frequency);
    }
    if (json.transport != null) {
      builder.transport(json.transport);
    }
    if (json.dataType != null) {
      builder.dataType(json.dataType);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalFlowParsed} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowParsed instance
   */
  public static ImmutablePhysicalFlowParsed copyOf(PhysicalFlowParsed instance) {
    if (instance instanceof ImmutablePhysicalFlowParsed) {
      return (ImmutablePhysicalFlowParsed) instance;
    }
    return ImmutablePhysicalFlowParsed.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowParsed ImmutablePhysicalFlowParsed}.
   * @return A new ImmutablePhysicalFlowParsed builder
   */
  public static ImmutablePhysicalFlowParsed.Builder builder() {
    return new ImmutablePhysicalFlowParsed.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowParsed ImmutablePhysicalFlowParsed}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_DESCRIPTION = 0x2L;
    private long initBits = 0x3L;

    private EntityReference source;
    private EntityReference target;
    private EntityReference owner;
    private DataFormatKind format;
    private String name;
    private String specDescription;
    private String specExternalId;
    private Integer basisOffset;
    private Criticality criticality;
    private String description;
    private String externalId;
    private FrequencyKind frequency;
    private TransportKind transport;
    private EntityReference dataType;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalFlowParsed} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowParsed instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable EntityReference sourceValue = instance.source();
      if (sourceValue != null) {
        source(sourceValue);
      }
      @Nullable EntityReference targetValue = instance.target();
      if (targetValue != null) {
        target(targetValue);
      }
      @Nullable EntityReference ownerValue = instance.owner();
      if (ownerValue != null) {
        owner(ownerValue);
      }
      @Nullable DataFormatKind formatValue = instance.format();
      if (formatValue != null) {
        format(formatValue);
      }
      name(instance.name());
      @Nullable String specDescriptionValue = instance.specDescription();
      if (specDescriptionValue != null) {
        specDescription(specDescriptionValue);
      }
      @Nullable String specExternalIdValue = instance.specExternalId();
      if (specExternalIdValue != null) {
        specExternalId(specExternalIdValue);
      }
      @Nullable Integer basisOffsetValue = instance.basisOffset();
      if (basisOffsetValue != null) {
        basisOffset(basisOffsetValue);
      }
      @Nullable Criticality criticalityValue = instance.criticality();
      if (criticalityValue != null) {
        criticality(criticalityValue);
      }
      description(instance.description());
      @Nullable String externalIdValue = instance.externalId();
      if (externalIdValue != null) {
        externalId(externalIdValue);
      }
      @Nullable FrequencyKind frequencyValue = instance.frequency();
      if (frequencyValue != null) {
        frequency(frequencyValue);
      }
      @Nullable TransportKind transportValue = instance.transport();
      if (transportValue != null) {
        transport(transportValue);
      }
      @Nullable EntityReference dataTypeValue = instance.dataType();
      if (dataTypeValue != null) {
        dataType(dataTypeValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#source() source} attribute.
     * @param source The value for source (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(@Nullable EntityReference source) {
      this.source = source;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#target() target} attribute.
     * @param target The value for target (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(@Nullable EntityReference target) {
      this.target = target;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#owner() owner} attribute.
     * @param owner The value for owner (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owner")
    public final Builder owner(@Nullable EntityReference owner) {
      this.owner = owner;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#format() format} attribute.
     * @param format The value for format (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("format")
    public final Builder format(@Nullable DataFormatKind format) {
      this.format = format;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#name() name} attribute.
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
     * Initializes the value for the {@link PhysicalFlowParsed#specDescription() specDescription} attribute.
     * @param specDescription The value for specDescription (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specDescription")
    public final Builder specDescription(@Nullable String specDescription) {
      this.specDescription = specDescription;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#specExternalId() specExternalId} attribute.
     * @param specExternalId The value for specExternalId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specExternalId")
    public final Builder specExternalId(@Nullable String specExternalId) {
      this.specExternalId = specExternalId;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#basisOffset() basisOffset} attribute.
     * @param basisOffset The value for basisOffset (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basisOffset")
    public final Builder basisOffset(@Nullable Integer basisOffset) {
      this.basisOffset = basisOffset;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#criticality() criticality} attribute.
     * @param criticality The value for criticality (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criticality")
    public final Builder criticality(@Nullable Criticality criticality) {
      this.criticality = criticality;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#externalId() externalId} attribute.
     * @param externalId The value for externalId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(@Nullable String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#frequency() frequency} attribute.
     * @param frequency The value for frequency (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequency")
    public final Builder frequency(@Nullable FrequencyKind frequency) {
      this.frequency = frequency;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#transport() transport} attribute.
     * @param transport The value for transport (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transport")
    public final Builder transport(@Nullable TransportKind transport) {
      this.transport = transport;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowParsed#dataType() dataType} attribute.
     * @param dataType The value for dataType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataType")
    public final Builder dataType(@Nullable EntityReference dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowParsed ImmutablePhysicalFlowParsed}.
     * @return An immutable instance of PhysicalFlowParsed
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowParsed build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowParsed(
          source,
          target,
          owner,
          format,
          name,
          specDescription,
          specExternalId,
          basisOffset,
          criticality,
          description,
          externalId,
          frequency,
          transport,
          dataType);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      return "Cannot build PhysicalFlowParsed, some of required attributes are not set " + attributes;
    }
  }
}
