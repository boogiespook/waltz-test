package com.khartec.waltz.model.settings;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.NameProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Setting}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSetting.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Setting"})
public final class ImmutableSetting extends Setting {
  private final String value;
  private final boolean restricted;
  private final String name;

  private ImmutableSetting(ImmutableSetting.Builder builder) {
    this.value = builder.value;
    this.name = builder.name;
    this.restricted = builder.restrictedIsSet()
        ? builder.restricted
        : super.restricted();
  }

  private ImmutableSetting(String value, boolean restricted, String name) {
    this.value = value;
    this.restricted = restricted;
    this.name = name;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code restricted} attribute
   */
  @JsonProperty("restricted")
  @Override
  public boolean restricted() {
    return restricted;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Setting#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSetting withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableSetting(newValue, this.restricted, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Setting#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSetting withValue(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableSetting(value, this.restricted, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Setting#restricted() restricted} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for restricted
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSetting withRestricted(boolean value) {
    if (this.restricted == value) return this;
    return new ImmutableSetting(this.value, value, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Setting#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSetting withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSetting(this.value, this.restricted, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSetting} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSetting
        && equalTo((ImmutableSetting) another);
  }

  private boolean equalTo(ImmutableSetting another) {
    return Objects.equals(value, another.value)
        && restricted == another.restricted
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code value}, {@code restricted}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Boolean.hashCode(restricted);
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Setting} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Setting{");
    if (value != null) {
      builder.append("value=").append(value);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("restricted=").append(restricted);
    builder.append(", ");
    builder.append("name=").append(name);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Setting {
    Optional<String> value = Optional.empty();
    boolean restricted;
    boolean restrictedIsSet;
    String name;
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
    }
    @JsonProperty("restricted")
    public void setRestricted(boolean restricted) {
      this.restricted = restricted;
      this.restrictedIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public boolean restricted() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSetting fromJson(Json json) {
    ImmutableSetting.Builder builder = ImmutableSetting.builder();
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.restrictedIsSet) {
      builder.restricted(json.restricted);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Setting} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Setting instance
   */
  public static ImmutableSetting copyOf(Setting instance) {
    if (instance instanceof ImmutableSetting) {
      return (ImmutableSetting) instance;
    }
    return ImmutableSetting.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSetting ImmutableSetting}.
   * @return A new ImmutableSetting builder
   */
  public static ImmutableSetting.Builder builder() {
    return new ImmutableSetting.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSetting ImmutableSetting}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_RESTRICTED = 0x1L;
    private long initBits = 0x1L;
    private long optBits;

    private String value;
    private boolean restricted;
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.settings.Setting} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Setting instance) {
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
      if (object instanceof Setting) {
        Setting instance = (Setting) object;
        Optional<String> valueOptional = instance.value();
        if (valueOptional.isPresent()) {
          value(valueOptional);
        }
        restricted(instance.restricted());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the optional value {@link Setting#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      return this;
    }

    /**
     * Initializes the optional value {@link Setting#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      this.value = value.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Setting#restricted() restricted} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Setting#restricted() restricted}.</em>
     * @param restricted The value for restricted 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("restricted")
    public final Builder restricted(boolean restricted) {
      this.restricted = restricted;
      optBits |= OPT_BIT_RESTRICTED;
      return this;
    }

    /**
     * Initializes the value for the {@link Setting#name() name} attribute.
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
     * Builds a new {@link ImmutableSetting ImmutableSetting}.
     * @return An immutable instance of Setting
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSetting build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSetting(this);
    }

    private boolean restrictedIsSet() {
      return (optBits & OPT_BIT_RESTRICTED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build Setting, some of required attributes are not set " + attributes;
    }
  }
}
