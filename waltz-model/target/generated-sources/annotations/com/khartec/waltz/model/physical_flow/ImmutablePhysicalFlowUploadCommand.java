package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowUploadCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowUploadCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowUploadCommand"})
public final class ImmutablePhysicalFlowUploadCommand
    extends PhysicalFlowUploadCommand {
  private final String source;
  private final String target;
  private final String owner;
  private final String name;
  private final String format;
  private final @Nullable String specDescription;
  private final @Nullable String specExternalId;
  private final String basisOffset;
  private final String criticality;
  private final String description;
  private final @Nullable String externalId;
  private final String frequency;
  private final String transport;
  private final String dataType;

  private ImmutablePhysicalFlowUploadCommand(
      String source,
      String target,
      String owner,
      String name,
      String format,
      @Nullable String specDescription,
      @Nullable String specExternalId,
      String basisOffset,
      String criticality,
      String description,
      @Nullable String externalId,
      String frequency,
      String transport,
      String dataType) {
    this.source = source;
    this.target = target;
    this.owner = owner;
    this.name = name;
    this.format = format;
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
  public String source() {
    return source;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public String target() {
    return target;
  }

  /**
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public String owner() {
    return owner;
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
   * @return The value of the {@code format} attribute
   */
  @JsonProperty("format")
  @Override
  public String format() {
    return format;
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
  public String basisOffset() {
    return basisOffset;
  }

  /**
   * @return The value of the {@code criticality} attribute
   */
  @JsonProperty("criticality")
  @Override
  public String criticality() {
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
  public String frequency() {
    return frequency;
  }

  /**
   * @return The value of the {@code transport} attribute
   */
  @JsonProperty("transport")
  @Override
  public String transport() {
    return transport;
  }

  /**
   * @return The value of the {@code dataType} attribute
   */
  @JsonProperty("dataType")
  @Override
  public String dataType() {
    return dataType;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#source() source} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withSource(String value) {
    if (this.source.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "source");
    return new ImmutablePhysicalFlowUploadCommand(
        newValue,
        this.target,
        this.owner,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#target() target} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for target
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withTarget(String value) {
    if (this.target.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "target");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        newValue,
        this.owner,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#owner() owner} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for owner
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withOwner(String value) {
    if (this.owner.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "owner");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        newValue,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        newValue,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#format() format} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for format
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withFormat(String value) {
    if (this.format.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "format");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#specDescription() specDescription} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specDescription (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withSpecDescription(@Nullable String value) {
    if (Objects.equals(this.specDescription, value)) return this;
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#specExternalId() specExternalId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specExternalId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withSpecExternalId(@Nullable String value) {
    if (Objects.equals(this.specExternalId, value)) return this;
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#basisOffset() basisOffset} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for basisOffset
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withBasisOffset(String value) {
    if (this.basisOffset.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "basisOffset");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
        this.specDescription,
        this.specExternalId,
        newValue,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#criticality() criticality} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for criticality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withCriticality(String value) {
    if (this.criticality.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "criticality");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        newValue,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "description");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#externalId() externalId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for externalId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withExternalId(@Nullable String value) {
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
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
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#frequency() frequency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for frequency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withFrequency(String value) {
    if (this.frequency.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "frequency");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        newValue,
        this.transport,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#transport() transport} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transport
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withTransport(String value) {
    if (this.transport.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "transport");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        newValue,
        this.dataType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowUploadCommand#dataType() dataType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowUploadCommand withDataType(String value) {
    if (this.dataType.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dataType");
    return new ImmutablePhysicalFlowUploadCommand(
        this.source,
        this.target,
        this.owner,
        this.name,
        this.format,
        this.specDescription,
        this.specExternalId,
        this.basisOffset,
        this.criticality,
        this.description,
        this.externalId,
        this.frequency,
        this.transport,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowUploadCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowUploadCommand
        && equalTo((ImmutablePhysicalFlowUploadCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowUploadCommand another) {
    return source.equals(another.source)
        && target.equals(another.target)
        && owner.equals(another.owner)
        && name.equals(another.name)
        && format.equals(another.format)
        && Objects.equals(specDescription, another.specDescription)
        && Objects.equals(specExternalId, another.specExternalId)
        && basisOffset.equals(another.basisOffset)
        && criticality.equals(another.criticality)
        && description.equals(another.description)
        && Objects.equals(externalId, another.externalId)
        && frequency.equals(another.frequency)
        && transport.equals(another.transport)
        && dataType.equals(another.dataType);
  }

  /**
   * Computes a hash code from attributes: {@code source}, {@code target}, {@code owner}, {@code name}, {@code format}, {@code specDescription}, {@code specExternalId}, {@code basisOffset}, {@code criticality}, {@code description}, {@code externalId}, {@code frequency}, {@code transport}, {@code dataType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + source.hashCode();
    h += (h << 5) + target.hashCode();
    h += (h << 5) + owner.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + format.hashCode();
    h += (h << 5) + Objects.hashCode(specDescription);
    h += (h << 5) + Objects.hashCode(specExternalId);
    h += (h << 5) + basisOffset.hashCode();
    h += (h << 5) + criticality.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + frequency.hashCode();
    h += (h << 5) + transport.hashCode();
    h += (h << 5) + dataType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowUploadCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalFlowUploadCommand{"
        + "source=" + source
        + ", target=" + target
        + ", owner=" + owner
        + ", name=" + name
        + ", format=" + format
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
  static final class Json extends PhysicalFlowUploadCommand {
    String source;
    String target;
    String owner;
    String name;
    String format;
    String specDescription;
    String specExternalId;
    String basisOffset;
    String criticality;
    String description;
    String externalId;
    String frequency;
    String transport;
    String dataType;
    @JsonProperty("source")
    public void setSource(String source) {
      this.source = source;
    }
    @JsonProperty("target")
    public void setTarget(String target) {
      this.target = target;
    }
    @JsonProperty("owner")
    public void setOwner(String owner) {
      this.owner = owner;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("format")
    public void setFormat(String format) {
      this.format = format;
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
    public void setBasisOffset(String basisOffset) {
      this.basisOffset = basisOffset;
    }
    @JsonProperty("criticality")
    public void setCriticality(String criticality) {
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
    public void setFrequency(String frequency) {
      this.frequency = frequency;
    }
    @JsonProperty("transport")
    public void setTransport(String transport) {
      this.transport = transport;
    }
    @JsonProperty("dataType")
    public void setDataType(String dataType) {
      this.dataType = dataType;
    }
    @Override
    public String source() { throw new UnsupportedOperationException(); }
    @Override
    public String target() { throw new UnsupportedOperationException(); }
    @Override
    public String owner() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String format() { throw new UnsupportedOperationException(); }
    @Override
    public String specDescription() { throw new UnsupportedOperationException(); }
    @Override
    public String specExternalId() { throw new UnsupportedOperationException(); }
    @Override
    public String basisOffset() { throw new UnsupportedOperationException(); }
    @Override
    public String criticality() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String externalId() { throw new UnsupportedOperationException(); }
    @Override
    public String frequency() { throw new UnsupportedOperationException(); }
    @Override
    public String transport() { throw new UnsupportedOperationException(); }
    @Override
    public String dataType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlowUploadCommand fromJson(Json json) {
    ImmutablePhysicalFlowUploadCommand.Builder builder = ImmutablePhysicalFlowUploadCommand.builder();
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.target != null) {
      builder.target(json.target);
    }
    if (json.owner != null) {
      builder.owner(json.owner);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.format != null) {
      builder.format(json.format);
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
   * Creates an immutable copy of a {@link PhysicalFlowUploadCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowUploadCommand instance
   */
  public static ImmutablePhysicalFlowUploadCommand copyOf(PhysicalFlowUploadCommand instance) {
    if (instance instanceof ImmutablePhysicalFlowUploadCommand) {
      return (ImmutablePhysicalFlowUploadCommand) instance;
    }
    return ImmutablePhysicalFlowUploadCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowUploadCommand ImmutablePhysicalFlowUploadCommand}.
   * @return A new ImmutablePhysicalFlowUploadCommand builder
   */
  public static ImmutablePhysicalFlowUploadCommand.Builder builder() {
    return new ImmutablePhysicalFlowUploadCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowUploadCommand ImmutablePhysicalFlowUploadCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_TARGET = 0x2L;
    private static final long INIT_BIT_OWNER = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private static final long INIT_BIT_FORMAT = 0x10L;
    private static final long INIT_BIT_BASIS_OFFSET = 0x20L;
    private static final long INIT_BIT_CRITICALITY = 0x40L;
    private static final long INIT_BIT_DESCRIPTION = 0x80L;
    private static final long INIT_BIT_FREQUENCY = 0x100L;
    private static final long INIT_BIT_TRANSPORT = 0x200L;
    private static final long INIT_BIT_DATA_TYPE = 0x400L;
    private long initBits = 0x7ffL;

    private String source;
    private String target;
    private String owner;
    private String name;
    private String format;
    private String specDescription;
    private String specExternalId;
    private String basisOffset;
    private String criticality;
    private String description;
    private String externalId;
    private String frequency;
    private String transport;
    private String dataType;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_flow.PhysicalFlowUploadCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowUploadCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        if ((bits & 0x1L) == 0) {
          description(instance.description());
          bits |= 0x1L;
        }
      }
      if (object instanceof PhysicalFlowUploadCommand) {
        PhysicalFlowUploadCommand instance = (PhysicalFlowUploadCommand) object;
        owner(instance.owner());
        dataType(instance.dataType());
        format(instance.format());
        criticality(instance.criticality());
        if ((bits & 0x1L) == 0) {
          description(instance.description());
          bits |= 0x1L;
        }
        @Nullable String externalIdValue = instance.externalId();
        if (externalIdValue != null) {
          externalId(externalIdValue);
        }
        source(instance.source());
        transport(instance.transport());
        target(instance.target());
        frequency(instance.frequency());
        basisOffset(instance.basisOffset());
        name(instance.name());
        @Nullable String specExternalIdValue = instance.specExternalId();
        if (specExternalIdValue != null) {
          specExternalId(specExternalIdValue);
        }
        @Nullable String specDescriptionValue = instance.specDescription();
        if (specDescriptionValue != null) {
          specDescription(specDescriptionValue);
        }
      }
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(String source) {
      this.source = Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(String target) {
      this.target = Objects.requireNonNull(target, "target");
      initBits &= ~INIT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#owner() owner} attribute.
     * @param owner The value for owner 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owner")
    public final Builder owner(String owner) {
      this.owner = Objects.requireNonNull(owner, "owner");
      initBits &= ~INIT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#name() name} attribute.
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
     * Initializes the value for the {@link PhysicalFlowUploadCommand#format() format} attribute.
     * @param format The value for format 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("format")
    public final Builder format(String format) {
      this.format = Objects.requireNonNull(format, "format");
      initBits &= ~INIT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#specDescription() specDescription} attribute.
     * @param specDescription The value for specDescription (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specDescription")
    public final Builder specDescription(@Nullable String specDescription) {
      this.specDescription = specDescription;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#specExternalId() specExternalId} attribute.
     * @param specExternalId The value for specExternalId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specExternalId")
    public final Builder specExternalId(@Nullable String specExternalId) {
      this.specExternalId = specExternalId;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#basisOffset() basisOffset} attribute.
     * @param basisOffset The value for basisOffset 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basisOffset")
    public final Builder basisOffset(String basisOffset) {
      this.basisOffset = Objects.requireNonNull(basisOffset, "basisOffset");
      initBits &= ~INIT_BIT_BASIS_OFFSET;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#criticality() criticality} attribute.
     * @param criticality The value for criticality 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criticality")
    public final Builder criticality(String criticality) {
      this.criticality = Objects.requireNonNull(criticality, "criticality");
      initBits &= ~INIT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#description() description} attribute.
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
     * Initializes the value for the {@link PhysicalFlowUploadCommand#externalId() externalId} attribute.
     * @param externalId The value for externalId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(@Nullable String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#frequency() frequency} attribute.
     * @param frequency The value for frequency 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequency")
    public final Builder frequency(String frequency) {
      this.frequency = Objects.requireNonNull(frequency, "frequency");
      initBits &= ~INIT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#transport() transport} attribute.
     * @param transport The value for transport 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transport")
    public final Builder transport(String transport) {
      this.transport = Objects.requireNonNull(transport, "transport");
      initBits &= ~INIT_BIT_TRANSPORT;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowUploadCommand#dataType() dataType} attribute.
     * @param dataType The value for dataType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataType")
    public final Builder dataType(String dataType) {
      this.dataType = Objects.requireNonNull(dataType, "dataType");
      initBits &= ~INIT_BIT_DATA_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowUploadCommand ImmutablePhysicalFlowUploadCommand}.
     * @return An immutable instance of PhysicalFlowUploadCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowUploadCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowUploadCommand(
          source,
          target,
          owner,
          name,
          format,
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
      if ((initBits & INIT_BIT_SOURCE) != 0) attributes.add("source");
      if ((initBits & INIT_BIT_TARGET) != 0) attributes.add("target");
      if ((initBits & INIT_BIT_OWNER) != 0) attributes.add("owner");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_FORMAT) != 0) attributes.add("format");
      if ((initBits & INIT_BIT_BASIS_OFFSET) != 0) attributes.add("basisOffset");
      if ((initBits & INIT_BIT_CRITICALITY) != 0) attributes.add("criticality");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_FREQUENCY) != 0) attributes.add("frequency");
      if ((initBits & INIT_BIT_TRANSPORT) != 0) attributes.add("transport");
      if ((initBits & INIT_BIT_DATA_TYPE) != 0) attributes.add("dataType");
      return "Cannot build PhysicalFlowUploadCommand, some of required attributes are not set " + attributes;
    }
  }
}
