package com.khartec.waltz.model.entity_enum;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IconProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityEnumDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityEnumDefinition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityEnumDefinition"})
public final class ImmutableEntityEnumDefinition
    extends EntityEnumDefinition {
  private final EntityKind entityKind;
  private final String enumValueType;
  private final int position;
  private final boolean isEditable;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final String icon;

  private ImmutableEntityEnumDefinition(
      EntityKind entityKind,
      String enumValueType,
      int position,
      boolean isEditable,
      Long id,
      String name,
      @Nullable String description,
      String icon) {
    this.entityKind = entityKind;
    this.enumValueType = enumValueType;
    this.position = position;
    this.isEditable = isEditable;
    this.id = id;
    this.name = name;
    this.description = description;
    this.icon = icon;
  }

  /**
   * @return The value of the {@code entityKind} attribute
   */
  @JsonProperty("entityKind")
  @Override
  public EntityKind entityKind() {
    return entityKind;
  }

  /**
   * @return The value of the {@code enumValueType} attribute
   */
  @JsonProperty("enumValueType")
  @Override
  public String enumValueType() {
    return enumValueType;
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
   * @return The value of the {@code isEditable} attribute
   */
  @JsonProperty("isEditable")
  @Override
  public boolean isEditable() {
    return isEditable;
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
   * @return The value of the {@code icon} attribute
   */
  @JsonProperty("icon")
  @Override
  public String icon() {
    return icon;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#entityKind() entityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withEntityKind(EntityKind value) {
    if (this.entityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "entityKind");
    return new ImmutableEntityEnumDefinition(
        newValue,
        this.enumValueType,
        this.position,
        this.isEditable,
        this.id,
        this.name,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#enumValueType() enumValueType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for enumValueType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withEnumValueType(String value) {
    if (this.enumValueType.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "enumValueType");
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        newValue,
        this.position,
        this.isEditable,
        this.id,
        this.name,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#position() position} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withPosition(int value) {
    if (this.position == value) return this;
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        value,
        this.isEditable,
        this.id,
        this.name,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#isEditable() isEditable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isEditable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withIsEditable(boolean value) {
    if (this.isEditable == value) return this;
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        this.position,
        value,
        this.id,
        this.name,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityEnumDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityEnumDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        this.position,
        this.isEditable,
        newValue,
        this.name,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityEnumDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityEnumDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        this.position,
        this.isEditable,
        value,
        this.name,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        this.position,
        this.isEditable,
        this.id,
        newValue,
        this.description,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        this.position,
        this.isEditable,
        this.id,
        this.name,
        value,
        this.icon);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumDefinition#icon() icon} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for icon
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumDefinition withIcon(String value) {
    if (this.icon.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "icon");
    return new ImmutableEntityEnumDefinition(
        this.entityKind,
        this.enumValueType,
        this.position,
        this.isEditable,
        this.id,
        this.name,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityEnumDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityEnumDefinition
        && equalTo((ImmutableEntityEnumDefinition) another);
  }

  private boolean equalTo(ImmutableEntityEnumDefinition another) {
    return entityKind.equals(another.entityKind)
        && enumValueType.equals(another.enumValueType)
        && position == another.position
        && isEditable == another.isEditable
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && icon.equals(another.icon);
  }

  /**
   * Computes a hash code from attributes: {@code entityKind}, {@code enumValueType}, {@code position}, {@code isEditable}, {@code id}, {@code name}, {@code description}, {@code icon}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityKind.hashCode();
    h += (h << 5) + enumValueType.hashCode();
    h += (h << 5) + position;
    h += (h << 5) + Boolean.hashCode(isEditable);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + icon.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityEnumDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityEnumDefinition{");
    builder.append("entityKind=").append(entityKind);
    builder.append(", ");
    builder.append("enumValueType=").append(enumValueType);
    builder.append(", ");
    builder.append("position=").append(position);
    builder.append(", ");
    builder.append("isEditable=").append(isEditable);
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
    builder.append(", ");
    builder.append("icon=").append(icon);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityEnumDefinition {
    EntityKind entityKind;
    String enumValueType;
    int position;
    boolean positionIsSet;
    boolean isEditable;
    boolean isEditableIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    String icon;
    @JsonProperty("entityKind")
    public void setEntityKind(EntityKind entityKind) {
      this.entityKind = entityKind;
    }
    @JsonProperty("enumValueType")
    public void setEnumValueType(String enumValueType) {
      this.enumValueType = enumValueType;
    }
    @JsonProperty("position")
    public void setPosition(int position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @JsonProperty("isEditable")
    public void setIsEditable(boolean isEditable) {
      this.isEditable = isEditable;
      this.isEditableIsSet = true;
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
    @JsonProperty("icon")
    public void setIcon(String icon) {
      this.icon = icon;
    }
    @Override
    public EntityKind entityKind() { throw new UnsupportedOperationException(); }
    @Override
    public String enumValueType() { throw new UnsupportedOperationException(); }
    @Override
    public int position() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isEditable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String icon() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityEnumDefinition fromJson(Json json) {
    ImmutableEntityEnumDefinition.Builder builder = ImmutableEntityEnumDefinition.builder();
    if (json.entityKind != null) {
      builder.entityKind(json.entityKind);
    }
    if (json.enumValueType != null) {
      builder.enumValueType(json.enumValueType);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    if (json.isEditableIsSet) {
      builder.isEditable(json.isEditable);
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
    if (json.icon != null) {
      builder.icon(json.icon);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityEnumDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityEnumDefinition instance
   */
  public static ImmutableEntityEnumDefinition copyOf(EntityEnumDefinition instance) {
    if (instance instanceof ImmutableEntityEnumDefinition) {
      return (ImmutableEntityEnumDefinition) instance;
    }
    return ImmutableEntityEnumDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityEnumDefinition ImmutableEntityEnumDefinition}.
   * @return A new ImmutableEntityEnumDefinition builder
   */
  public static ImmutableEntityEnumDefinition.Builder builder() {
    return new ImmutableEntityEnumDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityEnumDefinition ImmutableEntityEnumDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_KIND = 0x1L;
    private static final long INIT_BIT_ENUM_VALUE_TYPE = 0x2L;
    private static final long INIT_BIT_POSITION = 0x4L;
    private static final long INIT_BIT_IS_EDITABLE = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private static final long INIT_BIT_ICON = 0x20L;
    private long initBits = 0x3fL;

    private EntityKind entityKind;
    private String enumValueType;
    private int position;
    private boolean isEditable;
    private Long id;
    private String name;
    private String description;
    private String icon;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_enum.EntityEnumDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityEnumDefinition instance) {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IconProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IconProvider instance) {
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
      if (object instanceof EntityEnumDefinition) {
        EntityEnumDefinition instance = (EntityEnumDefinition) object;
        entityKind(instance.entityKind());
        enumValueType(instance.enumValueType());
        position(instance.position());
        isEditable(instance.isEditable());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof IconProvider) {
        IconProvider instance = (IconProvider) object;
        icon(instance.icon());
      }
    }

    /**
     * Initializes the value for the {@link EntityEnumDefinition#entityKind() entityKind} attribute.
     * @param entityKind The value for entityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityKind")
    public final Builder entityKind(EntityKind entityKind) {
      this.entityKind = Objects.requireNonNull(entityKind, "entityKind");
      initBits &= ~INIT_BIT_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumDefinition#enumValueType() enumValueType} attribute.
     * @param enumValueType The value for enumValueType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enumValueType")
    public final Builder enumValueType(String enumValueType) {
      this.enumValueType = Objects.requireNonNull(enumValueType, "enumValueType");
      initBits &= ~INIT_BIT_ENUM_VALUE_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumDefinition#position() position} attribute.
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
     * Initializes the value for the {@link EntityEnumDefinition#isEditable() isEditable} attribute.
     * @param isEditable The value for isEditable 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isEditable")
    public final Builder isEditable(boolean isEditable) {
      this.isEditable = isEditable;
      initBits &= ~INIT_BIT_IS_EDITABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityEnumDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityEnumDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumDefinition#name() name} attribute.
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
     * Initializes the value for the {@link EntityEnumDefinition#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumDefinition#icon() icon} attribute.
     * @param icon The value for icon 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("icon")
    public final Builder icon(String icon) {
      this.icon = Objects.requireNonNull(icon, "icon");
      initBits &= ~INIT_BIT_ICON;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityEnumDefinition ImmutableEntityEnumDefinition}.
     * @return An immutable instance of EntityEnumDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityEnumDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityEnumDefinition(entityKind, enumValueType, position, isEditable, id, name, description, icon);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_KIND) != 0) attributes.add("entityKind");
      if ((initBits & INIT_BIT_ENUM_VALUE_TYPE) != 0) attributes.add("enumValueType");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      if ((initBits & INIT_BIT_IS_EDITABLE) != 0) attributes.add("isEditable");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ICON) != 0) attributes.add("icon");
      return "Cannot build EntityEnumDefinition, some of required attributes are not set " + attributes;
    }
  }
}
