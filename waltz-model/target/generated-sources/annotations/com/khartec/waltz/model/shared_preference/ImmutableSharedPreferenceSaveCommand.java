package com.khartec.waltz.model.shared_preference;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SharedPreferenceSaveCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSharedPreferenceSaveCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SharedPreferenceSaveCommand"})
public final class ImmutableSharedPreferenceSaveCommand
    extends SharedPreferenceSaveCommand {
  private final String key;
  private final String category;
  private final String value;

  private ImmutableSharedPreferenceSaveCommand(String key, String category, String value) {
    this.key = key;
    this.category = category;
    this.value = value;
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public String category() {
    return category;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public String value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreferenceSaveCommand#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreferenceSaveCommand withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "key");
    return new ImmutableSharedPreferenceSaveCommand(newValue, this.category, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreferenceSaveCommand#category() category} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreferenceSaveCommand withCategory(String value) {
    if (this.category.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "category");
    return new ImmutableSharedPreferenceSaveCommand(this.key, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreferenceSaveCommand#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreferenceSaveCommand withValue(String value) {
    if (this.value.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "value");
    return new ImmutableSharedPreferenceSaveCommand(this.key, this.category, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSharedPreferenceSaveCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSharedPreferenceSaveCommand
        && equalTo((ImmutableSharedPreferenceSaveCommand) another);
  }

  private boolean equalTo(ImmutableSharedPreferenceSaveCommand another) {
    return key.equals(another.key)
        && category.equals(another.category)
        && value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code category}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + category.hashCode();
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SharedPreferenceSaveCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SharedPreferenceSaveCommand{"
        + "key=" + key
        + ", category=" + category
        + ", value=" + value
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SharedPreferenceSaveCommand {
    String key;
    String category;
    String value;
    @JsonProperty("key")
    public void setKey(String key) {
      this.key = key;
    }
    @JsonProperty("category")
    public void setCategory(String category) {
      this.category = category;
    }
    @JsonProperty("value")
    public void setValue(String value) {
      this.value = value;
    }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
    @Override
    public String category() { throw new UnsupportedOperationException(); }
    @Override
    public String value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSharedPreferenceSaveCommand fromJson(Json json) {
    ImmutableSharedPreferenceSaveCommand.Builder builder = ImmutableSharedPreferenceSaveCommand.builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SharedPreferenceSaveCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SharedPreferenceSaveCommand instance
   */
  public static ImmutableSharedPreferenceSaveCommand copyOf(SharedPreferenceSaveCommand instance) {
    if (instance instanceof ImmutableSharedPreferenceSaveCommand) {
      return (ImmutableSharedPreferenceSaveCommand) instance;
    }
    return ImmutableSharedPreferenceSaveCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSharedPreferenceSaveCommand ImmutableSharedPreferenceSaveCommand}.
   * @return A new ImmutableSharedPreferenceSaveCommand builder
   */
  public static ImmutableSharedPreferenceSaveCommand.Builder builder() {
    return new ImmutableSharedPreferenceSaveCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSharedPreferenceSaveCommand ImmutableSharedPreferenceSaveCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_CATEGORY = 0x2L;
    private static final long INIT_BIT_VALUE = 0x4L;
    private long initBits = 0x7L;

    private String key;
    private String category;
    private String value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SharedPreferenceSaveCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SharedPreferenceSaveCommand instance) {
      Objects.requireNonNull(instance, "instance");
      key(instance.key());
      category(instance.category());
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link SharedPreferenceSaveCommand#key() key} attribute.
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
     * Initializes the value for the {@link SharedPreferenceSaveCommand#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(String category) {
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link SharedPreferenceSaveCommand#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSharedPreferenceSaveCommand ImmutableSharedPreferenceSaveCommand}.
     * @return An immutable instance of SharedPreferenceSaveCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSharedPreferenceSaveCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSharedPreferenceSaveCommand(key, category, value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_CATEGORY) != 0) attributes.add("category");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build SharedPreferenceSaveCommand, some of required attributes are not set " + attributes;
    }
  }
}
