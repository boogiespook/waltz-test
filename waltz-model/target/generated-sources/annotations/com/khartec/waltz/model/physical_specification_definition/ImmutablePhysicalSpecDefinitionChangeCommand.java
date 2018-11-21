package com.khartec.waltz.model.physical_specification_definition;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecDefinitionChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecDefinitionChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecDefinitionChangeCommand"})
public final class ImmutablePhysicalSpecDefinitionChangeCommand
    extends PhysicalSpecDefinitionChangeCommand {
  private final String version;
  private final ReleaseLifecycleStatus status;
  private final String delimiter;
  private final PhysicalSpecDefinitionType type;
  private final Long id;

  private ImmutablePhysicalSpecDefinitionChangeCommand(
      String version,
      ReleaseLifecycleStatus status,
      String delimiter,
      PhysicalSpecDefinitionType type,
      Long id) {
    this.version = version;
    this.status = status;
    this.delimiter = delimiter;
    this.type = type;
    this.id = id;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    return version;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public ReleaseLifecycleStatus status() {
    return status;
  }

  /**
   * @return The value of the {@code delimiter} attribute
   */
  @JsonProperty("delimiter")
  @Override
  public Optional<String> delimiter() {
    return Optional.ofNullable(delimiter);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public PhysicalSpecDefinitionType type() {
    return type;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionChangeCommand#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "version");
    return new ImmutablePhysicalSpecDefinitionChangeCommand(newValue, this.status, this.delimiter, this.type, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionChangeCommand#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withStatus(ReleaseLifecycleStatus value) {
    if (this.status == value) return this;
    ReleaseLifecycleStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutablePhysicalSpecDefinitionChangeCommand(this.version, newValue, this.delimiter, this.type, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinitionChangeCommand#delimiter() delimiter} attribute.
   * @param value The value for delimiter
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withDelimiter(String value) {
    String newValue = Objects.requireNonNull(value, "delimiter");
    if (Objects.equals(this.delimiter, newValue)) return this;
    return new ImmutablePhysicalSpecDefinitionChangeCommand(this.version, this.status, newValue, this.type, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinitionChangeCommand#delimiter() delimiter} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for delimiter
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withDelimiter(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.delimiter, value)) return this;
    return new ImmutablePhysicalSpecDefinitionChangeCommand(this.version, this.status, value, this.type, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionChangeCommand#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withType(PhysicalSpecDefinitionType value) {
    if (this.type == value) return this;
    PhysicalSpecDefinitionType newValue = Objects.requireNonNull(value, "type");
    return new ImmutablePhysicalSpecDefinitionChangeCommand(this.version, this.status, this.delimiter, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinitionChangeCommand#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePhysicalSpecDefinitionChangeCommand(this.version, this.status, this.delimiter, this.type, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinitionChangeCommand#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionChangeCommand withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePhysicalSpecDefinitionChangeCommand(this.version, this.status, this.delimiter, this.type, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecDefinitionChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecDefinitionChangeCommand
        && equalTo((ImmutablePhysicalSpecDefinitionChangeCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecDefinitionChangeCommand another) {
    return version.equals(another.version)
        && status.equals(another.status)
        && Objects.equals(delimiter, another.delimiter)
        && type.equals(another.type)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code status}, {@code delimiter}, {@code type}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + version.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + Objects.hashCode(delimiter);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecDefinitionChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalSpecDefinitionChangeCommand{");
    builder.append("version=").append(version);
    builder.append(", ");
    builder.append("status=").append(status);
    if (delimiter != null) {
      builder.append(", ");
      builder.append("delimiter=").append(delimiter);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  static final class Json
      extends PhysicalSpecDefinitionChangeCommand {
    String version;
    ReleaseLifecycleStatus status;
    Optional<String> delimiter = Optional.empty();
    PhysicalSpecDefinitionType type;
    Optional<Long> id = Optional.empty();
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @JsonProperty("status")
    public void setStatus(ReleaseLifecycleStatus status) {
      this.status = status;
    }
    @JsonProperty("delimiter")
    public void setDelimiter(Optional<String> delimiter) {
      this.delimiter = delimiter;
    }
    @JsonProperty("type")
    public void setType(PhysicalSpecDefinitionType type) {
      this.type = type;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
    @Override
    public ReleaseLifecycleStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> delimiter() { throw new UnsupportedOperationException(); }
    @Override
    public PhysicalSpecDefinitionType type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalSpecDefinitionChangeCommand fromJson(Json json) {
    ImmutablePhysicalSpecDefinitionChangeCommand.Builder builder = ImmutablePhysicalSpecDefinitionChangeCommand.builder();
    if (json.version != null) {
      builder.version(json.version);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.delimiter != null) {
      builder.delimiter(json.delimiter);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecDefinitionChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecDefinitionChangeCommand instance
   */
  public static ImmutablePhysicalSpecDefinitionChangeCommand copyOf(PhysicalSpecDefinitionChangeCommand instance) {
    if (instance instanceof ImmutablePhysicalSpecDefinitionChangeCommand) {
      return (ImmutablePhysicalSpecDefinitionChangeCommand) instance;
    }
    return ImmutablePhysicalSpecDefinitionChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecDefinitionChangeCommand ImmutablePhysicalSpecDefinitionChangeCommand}.
   * @return A new ImmutablePhysicalSpecDefinitionChangeCommand builder
   */
  public static ImmutablePhysicalSpecDefinitionChangeCommand.Builder builder() {
    return new ImmutablePhysicalSpecDefinitionChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecDefinitionChangeCommand ImmutablePhysicalSpecDefinitionChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_VERSION = 0x1L;
    private static final long INIT_BIT_STATUS = 0x2L;
    private static final long INIT_BIT_TYPE = 0x4L;
    private long initBits = 0x7L;

    private String version;
    private ReleaseLifecycleStatus status;
    private String delimiter;
    private PhysicalSpecDefinitionType type;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification_definition.PhysicalSpecDefinitionChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecDefinitionChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof PhysicalSpecDefinitionChangeCommand) {
        PhysicalSpecDefinitionChangeCommand instance = (PhysicalSpecDefinitionChangeCommand) object;
        type(instance.type());
        version(instance.version());
        Optional<String> delimiterOptional = instance.delimiter();
        if (delimiterOptional.isPresent()) {
          delimiter(delimiterOptional);
        }
        status(instance.status());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionChangeCommand#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(String version) {
      this.version = Objects.requireNonNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionChangeCommand#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(ReleaseLifecycleStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionChangeCommand#delimiter() delimiter} to delimiter.
     * @param delimiter The value for delimiter
     * @return {@code this} builder for chained invocation
     */
    public final Builder delimiter(String delimiter) {
      this.delimiter = Objects.requireNonNull(delimiter, "delimiter");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionChangeCommand#delimiter() delimiter} to delimiter.
     * @param delimiter The value for delimiter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("delimiter")
    public final Builder delimiter(Optional<String> delimiter) {
      this.delimiter = delimiter.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionChangeCommand#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(PhysicalSpecDefinitionType type) {
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecDefinitionChangeCommand ImmutablePhysicalSpecDefinitionChangeCommand}.
     * @return An immutable instance of PhysicalSpecDefinitionChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecDefinitionChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecDefinitionChangeCommand(version, status, delimiter, type, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      return "Cannot build PhysicalSpecDefinitionChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
