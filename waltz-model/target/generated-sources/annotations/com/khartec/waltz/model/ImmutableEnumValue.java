package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EnumValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEnumValue.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EnumValue"})
public final class ImmutableEnumValue extends EnumValue {
  private final String type;
  private final String key;
  private final String icon;
  private final @Nullable String description;
  private final String name;
  private final int position;

  private ImmutableEnumValue(
      String type,
      String key,
      String icon,
      @Nullable String description,
      String name,
      int position) {
    this.type = type;
    this.key = key;
    this.icon = icon;
    this.description = description;
    this.name = name;
    this.position = position;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public String type() {
    return type;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public String key() {
    return key;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
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
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public int position() {
    return position;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnumValue#type() type} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnumValue withType(String value) {
    if (this.type.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "type");
    return new ImmutableEnumValue(newValue, this.key, this.icon, this.description, this.name, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnumValue#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnumValue withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "key");
    return new ImmutableEnumValue(this.type, newValue, this.icon, this.description, this.name, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnumValue#icon() icon} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for icon
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnumValue withIcon(String value) {
    if (this.icon.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "icon");
    return new ImmutableEnumValue(this.type, this.key, newValue, this.description, this.name, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnumValue#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnumValue withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEnumValue(this.type, this.key, this.icon, value, this.name, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnumValue#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnumValue withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableEnumValue(this.type, this.key, this.icon, this.description, newValue, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EnumValue#position() position} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEnumValue withPosition(int value) {
    if (this.position == value) return this;
    return new ImmutableEnumValue(this.type, this.key, this.icon, this.description, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEnumValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEnumValue
        && equalTo((ImmutableEnumValue) another);
  }

  private boolean equalTo(ImmutableEnumValue another) {
    return type.equals(another.type)
        && key.equals(another.key)
        && icon.equals(another.icon)
        && Objects.equals(description, another.description)
        && name.equals(another.name)
        && position == another.position;
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code key}, {@code icon}, {@code description}, {@code name}, {@code position}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + key.hashCode();
    h += (h << 5) + icon.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + position;
    return h;
  }

  /**
   * Prints the immutable value {@code EnumValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EnumValue{"
        + "type=" + type
        + ", key=" + key
        + ", icon=" + icon
        + ", description=" + description
        + ", name=" + name
        + ", position=" + position
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EnumValue {
    String type;
    String key;
    String icon;
    String description;
    String name;
    int position;
    boolean positionIsSet;
    @JsonProperty("type")
    public void setType(String type) {
      this.type = type;
    }
    @JsonProperty("key")
    public void setKey(String key) {
      this.key = key;
    }
    @JsonProperty("icon")
    public void setIcon(String icon) {
      this.icon = icon;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("position")
    public void setPosition(int position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @Override
    public String type() { throw new UnsupportedOperationException(); }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
    @Override
    public String icon() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public int position() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEnumValue fromJson(Json json) {
    ImmutableEnumValue.Builder builder = ImmutableEnumValue.builder();
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.icon != null) {
      builder.icon(json.icon);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EnumValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EnumValue instance
   */
  public static ImmutableEnumValue copyOf(EnumValue instance) {
    if (instance instanceof ImmutableEnumValue) {
      return (ImmutableEnumValue) instance;
    }
    return ImmutableEnumValue.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEnumValue ImmutableEnumValue}.
   * @return A new ImmutableEnumValue builder
   */
  public static ImmutableEnumValue.Builder builder() {
    return new ImmutableEnumValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEnumValue ImmutableEnumValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_KEY = 0x2L;
    private static final long INIT_BIT_ICON = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private static final long INIT_BIT_POSITION = 0x10L;
    private long initBits = 0x1fL;

    private String type;
    private String key;
    private String icon;
    private String description;
    private String name;
    private int position;

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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.PositionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PositionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EnumValue} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EnumValue instance) {
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
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof IconProvider) {
        IconProvider instance = (IconProvider) object;
        icon(instance.icon());
      }
      if (object instanceof PositionProvider) {
        PositionProvider instance = (PositionProvider) object;
        position(instance.position());
      }
      if (object instanceof EnumValue) {
        EnumValue instance = (EnumValue) object;
        type(instance.type());
        key(instance.key());
      }
    }

    /**
     * Initializes the value for the {@link EnumValue#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(String type) {
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link EnumValue#key() key} attribute.
     * @param key The value for key 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("key")
    public final Builder key(String key) {
      this.key = Objects.requireNonNull(key, "key");
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link EnumValue#icon() icon} attribute.
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
     * Initializes the value for the {@link EnumValue#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link EnumValue#name() name} attribute.
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
     * Initializes the value for the {@link EnumValue#position() position} attribute.
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
     * Builds a new {@link ImmutableEnumValue ImmutableEnumValue}.
     * @return An immutable instance of EnumValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEnumValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEnumValue(type, key, icon, description, name, position);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_ICON) != 0) attributes.add("icon");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      return "Cannot build EnumValue, some of required attributes are not set " + attributes;
    }
  }
}
