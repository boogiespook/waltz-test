package com.khartec.waltz.model.physical_specification_definition;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.FieldDataType;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecDefinitionFieldChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecDefinitionFieldChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecDefinitionFieldChangeCommand"})
public final class ImmutablePhysicalSpecDefinitionFieldChangeCommand
    extends PhysicalSpecDefinitionFieldChangeCommand {
  private final int position;
  private final FieldDataType type;
  private final Long logicalDataElementId;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutablePhysicalSpecDefinitionFieldChangeCommand(
      int position,
      FieldDataType type,
      Long logicalDataElementId,
      Long id,
      String name,
      @Nullable String description) {
    this.position = position;
    this.type = type;
    this.logicalDataElementId = logicalDataElementId;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public int position() {
    return position;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public FieldDataType type() {
    return type;
  }

  /**
   * @return The value of the {@code logicalDataElementId} attribute
   */
  @JsonProperty("logicalDataElementId")
  @Override
  public Optional<Long> logicalDataElementId() {
    return Optional.ofNullable(logicalDataElementId);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
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
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionFieldChangeCommand#position() position} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withPosition(int value) {
    if (this.position == value) return this;
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(value, this.type, this.logicalDataElementId, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionFieldChangeCommand#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withType(FieldDataType value) {
    if (this.type == value) return this;
    FieldDataType newValue = Objects.requireNonNull(value, "type");
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, newValue, this.logicalDataElementId, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinitionFieldChangeCommand#logicalDataElementId() logicalDataElementId} attribute.
   * @param value The value for logicalDataElementId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withLogicalDataElementId(long value) {
    Long newValue = value;
    if (Objects.equals(this.logicalDataElementId, newValue)) return this;
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, this.type, newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinitionFieldChangeCommand#logicalDataElementId() logicalDataElementId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for logicalDataElementId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withLogicalDataElementId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.logicalDataElementId, value)) return this;
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, this.type, value, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinitionFieldChangeCommand#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, this.type, this.logicalDataElementId, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinitionFieldChangeCommand#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, this.type, this.logicalDataElementId, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionFieldChangeCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, this.type, this.logicalDataElementId, this.id, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionFieldChangeCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionFieldChangeCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(this.position, this.type, this.logicalDataElementId, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecDefinitionFieldChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecDefinitionFieldChangeCommand
        && equalTo((ImmutablePhysicalSpecDefinitionFieldChangeCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecDefinitionFieldChangeCommand another) {
    return position == another.position
        && type.equals(another.type)
        && Objects.equals(logicalDataElementId, another.logicalDataElementId)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code position}, {@code type}, {@code logicalDataElementId}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + position;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(logicalDataElementId);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecDefinitionFieldChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalSpecDefinitionFieldChangeCommand{");
    builder.append("position=").append(position);
    builder.append(", ");
    builder.append("type=").append(type);
    if (logicalDataElementId != null) {
      builder.append(", ");
      builder.append("logicalDataElementId=").append(logicalDataElementId);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
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
      extends PhysicalSpecDefinitionFieldChangeCommand {
    int position;
    boolean positionIsSet;
    FieldDataType type;
    Optional<Long> logicalDataElementId = Optional.empty();
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("position")
    public void setPosition(int position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(FieldDataType type) {
      this.type = type;
    }
    @JsonProperty("logicalDataElementId")
    public void setLogicalDataElementId(Optional<Long> logicalDataElementId) {
      this.logicalDataElementId = logicalDataElementId;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public int position() { throw new UnsupportedOperationException(); }
    @Override
    public FieldDataType type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> logicalDataElementId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
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
  static ImmutablePhysicalSpecDefinitionFieldChangeCommand fromJson(Json json) {
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder builder = ImmutablePhysicalSpecDefinitionFieldChangeCommand.builder();
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.logicalDataElementId != null) {
      builder.logicalDataElementId(json.logicalDataElementId);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecDefinitionFieldChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecDefinitionFieldChangeCommand instance
   */
  public static ImmutablePhysicalSpecDefinitionFieldChangeCommand copyOf(PhysicalSpecDefinitionFieldChangeCommand instance) {
    if (instance instanceof ImmutablePhysicalSpecDefinitionFieldChangeCommand) {
      return (ImmutablePhysicalSpecDefinitionFieldChangeCommand) instance;
    }
    return ImmutablePhysicalSpecDefinitionFieldChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecDefinitionFieldChangeCommand ImmutablePhysicalSpecDefinitionFieldChangeCommand}.
   * @return A new ImmutablePhysicalSpecDefinitionFieldChangeCommand builder
   */
  public static ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder builder() {
    return new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecDefinitionFieldChangeCommand ImmutablePhysicalSpecDefinitionFieldChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_POSITION = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private int position;
    private FieldDataType type;
    private Long logicalDataElementId;
    private Long id;
    private String name;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification_definition.PhysicalSpecDefinitionFieldChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecDefinitionFieldChangeCommand instance) {
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
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof PhysicalSpecDefinitionFieldChangeCommand) {
        PhysicalSpecDefinitionFieldChangeCommand instance = (PhysicalSpecDefinitionFieldChangeCommand) object;
        type(instance.type());
        Optional<Long> logicalDataElementIdOptional = instance.logicalDataElementId();
        if (logicalDataElementIdOptional.isPresent()) {
          logicalDataElementId(logicalDataElementIdOptional);
        }
        position(instance.position());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionFieldChangeCommand#position() position} attribute.
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(int position) {
      this.position = position;
      initBits &= ~INIT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionFieldChangeCommand#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(FieldDataType type) {
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionFieldChangeCommand#logicalDataElementId() logicalDataElementId} to logicalDataElementId.
     * @param logicalDataElementId The value for logicalDataElementId
     * @return {@code this} builder for chained invocation
     */
    public final Builder logicalDataElementId(long logicalDataElementId) {
      this.logicalDataElementId = logicalDataElementId;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionFieldChangeCommand#logicalDataElementId() logicalDataElementId} to logicalDataElementId.
     * @param logicalDataElementId The value for logicalDataElementId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("logicalDataElementId")
    public final Builder logicalDataElementId(Optional<Long> logicalDataElementId) {
      this.logicalDataElementId = logicalDataElementId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionFieldChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionFieldChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionFieldChangeCommand#name() name} attribute.
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
     * Initializes the value for the {@link PhysicalSpecDefinitionFieldChangeCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecDefinitionFieldChangeCommand ImmutablePhysicalSpecDefinitionFieldChangeCommand}.
     * @return An immutable instance of PhysicalSpecDefinitionFieldChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecDefinitionFieldChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecDefinitionFieldChangeCommand(position, type, logicalDataElementId, id, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PhysicalSpecDefinitionFieldChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
