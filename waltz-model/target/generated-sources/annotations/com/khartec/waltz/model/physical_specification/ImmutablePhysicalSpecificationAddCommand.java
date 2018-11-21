package com.khartec.waltz.model.physical_specification;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecificationAddCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecificationAddCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecificationAddCommand"})
public final class ImmutablePhysicalSpecificationAddCommand
    extends PhysicalSpecificationAddCommand {
  private final EntityReference owningEntity;
  private final DataFormatKind format;
  private final String externalId;
  private final String name;
  private final @Nullable String description;

  private ImmutablePhysicalSpecificationAddCommand(
      EntityReference owningEntity,
      DataFormatKind format,
      String externalId,
      String name,
      @Nullable String description) {
    this.owningEntity = owningEntity;
    this.format = format;
    this.externalId = externalId;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code owningEntity} attribute
   */
  @JsonProperty("owningEntity")
  @Override
  public EntityReference owningEntity() {
    return owningEntity;
  }

  /**
   * @return The value of the {@code format} attribute
   */
  @JsonProperty("format")
  @Override
  public DataFormatKind format() {
    return format;
  }

  /**
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
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
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationAddCommand#owningEntity() owningEntity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for owningEntity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationAddCommand withOwningEntity(EntityReference value) {
    if (this.owningEntity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "owningEntity");
    return new ImmutablePhysicalSpecificationAddCommand(newValue, this.format, this.externalId, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationAddCommand#format() format} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for format
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationAddCommand withFormat(DataFormatKind value) {
    if (this.format == value) return this;
    DataFormatKind newValue = Objects.requireNonNull(value, "format");
    return new ImmutablePhysicalSpecificationAddCommand(this.owningEntity, newValue, this.externalId, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecificationAddCommand#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecificationAddCommand withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutablePhysicalSpecificationAddCommand(this.owningEntity, this.format, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecificationAddCommand#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecificationAddCommand withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutablePhysicalSpecificationAddCommand(this.owningEntity, this.format, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationAddCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationAddCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalSpecificationAddCommand(this.owningEntity, this.format, this.externalId, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationAddCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationAddCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePhysicalSpecificationAddCommand(this.owningEntity, this.format, this.externalId, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecificationAddCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecificationAddCommand
        && equalTo((ImmutablePhysicalSpecificationAddCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecificationAddCommand another) {
    return owningEntity.equals(another.owningEntity)
        && format.equals(another.format)
        && Objects.equals(externalId, another.externalId)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code owningEntity}, {@code format}, {@code externalId}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + owningEntity.hashCode();
    h += (h << 5) + format.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecificationAddCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalSpecificationAddCommand{");
    builder.append("owningEntity=").append(owningEntity);
    builder.append(", ");
    builder.append("format=").append(format);
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
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
      extends PhysicalSpecificationAddCommand {
    EntityReference owningEntity;
    DataFormatKind format;
    Optional<String> externalId = Optional.empty();
    String name;
    String description;
    @JsonProperty("owningEntity")
    public void setOwningEntity(EntityReference owningEntity) {
      this.owningEntity = owningEntity;
    }
    @JsonProperty("format")
    public void setFormat(DataFormatKind format) {
      this.format = format;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
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
    public EntityReference owningEntity() { throw new UnsupportedOperationException(); }
    @Override
    public DataFormatKind format() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
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
  static ImmutablePhysicalSpecificationAddCommand fromJson(Json json) {
    ImmutablePhysicalSpecificationAddCommand.Builder builder = ImmutablePhysicalSpecificationAddCommand.builder();
    if (json.owningEntity != null) {
      builder.owningEntity(json.owningEntity);
    }
    if (json.format != null) {
      builder.format(json.format);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
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
   * Creates an immutable copy of a {@link PhysicalSpecificationAddCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecificationAddCommand instance
   */
  public static ImmutablePhysicalSpecificationAddCommand copyOf(PhysicalSpecificationAddCommand instance) {
    if (instance instanceof ImmutablePhysicalSpecificationAddCommand) {
      return (ImmutablePhysicalSpecificationAddCommand) instance;
    }
    return ImmutablePhysicalSpecificationAddCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecificationAddCommand ImmutablePhysicalSpecificationAddCommand}.
   * @return A new ImmutablePhysicalSpecificationAddCommand builder
   */
  public static ImmutablePhysicalSpecificationAddCommand.Builder builder() {
    return new ImmutablePhysicalSpecificationAddCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecificationAddCommand ImmutablePhysicalSpecificationAddCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_OWNING_ENTITY = 0x1L;
    private static final long INIT_BIT_FORMAT = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private EntityReference owningEntity;
    private DataFormatKind format;
    private String externalId;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ExternalIdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ExternalIdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification.PhysicalSpecificationAddCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecificationAddCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof PhysicalSpecificationAddCommand) {
        PhysicalSpecificationAddCommand instance = (PhysicalSpecificationAddCommand) object;
        owningEntity(instance.owningEntity());
        format(instance.format());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationAddCommand#owningEntity() owningEntity} attribute.
     * @param owningEntity The value for owningEntity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owningEntity")
    public final Builder owningEntity(EntityReference owningEntity) {
      this.owningEntity = Objects.requireNonNull(owningEntity, "owningEntity");
      initBits &= ~INIT_BIT_OWNING_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationAddCommand#format() format} attribute.
     * @param format The value for format 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("format")
    public final Builder format(DataFormatKind format) {
      this.format = Objects.requireNonNull(format, "format");
      initBits &= ~INIT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecificationAddCommand#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecificationAddCommand#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationAddCommand#name() name} attribute.
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
     * Initializes the value for the {@link PhysicalSpecificationAddCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecificationAddCommand ImmutablePhysicalSpecificationAddCommand}.
     * @return An immutable instance of PhysicalSpecificationAddCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecificationAddCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecificationAddCommand(owningEntity, format, externalId, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_OWNING_ENTITY) != 0) attributes.add("owningEntity");
      if ((initBits & INIT_BIT_FORMAT) != 0) attributes.add("format");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PhysicalSpecificationAddCommand, some of required attributes are not set " + attributes;
    }
  }
}
