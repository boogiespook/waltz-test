package com.khartec.waltz.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SharedPreferenceKeyAndCategory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSharedPreferenceKeyAndCategory.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SharedPreferenceKeyAndCategory"})
public final class ImmutableSharedPreferenceKeyAndCategory
    extends SharedPreferenceKeyAndCategory {
  private final String key;
  private final String category;

  private ImmutableSharedPreferenceKeyAndCategory(String key, String category) {
    this.key = key;
    this.category = category;
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
   * Copy the current immutable object by setting a value for the {@link SharedPreferenceKeyAndCategory#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreferenceKeyAndCategory withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "key");
    return new ImmutableSharedPreferenceKeyAndCategory(newValue, this.category);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreferenceKeyAndCategory#category() category} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreferenceKeyAndCategory withCategory(String value) {
    if (this.category.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "category");
    return new ImmutableSharedPreferenceKeyAndCategory(this.key, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSharedPreferenceKeyAndCategory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSharedPreferenceKeyAndCategory
        && equalTo((ImmutableSharedPreferenceKeyAndCategory) another);
  }

  private boolean equalTo(ImmutableSharedPreferenceKeyAndCategory another) {
    return key.equals(another.key)
        && category.equals(another.category);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code category}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + category.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SharedPreferenceKeyAndCategory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SharedPreferenceKeyAndCategory{"
        + "key=" + key
        + ", category=" + category
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SharedPreferenceKeyAndCategory {
    String key;
    String category;
    @JsonProperty("key")
    public void setKey(String key) {
      this.key = key;
    }
    @JsonProperty("category")
    public void setCategory(String category) {
      this.category = category;
    }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
    @Override
    public String category() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSharedPreferenceKeyAndCategory fromJson(Json json) {
    ImmutableSharedPreferenceKeyAndCategory.Builder builder = ImmutableSharedPreferenceKeyAndCategory.builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SharedPreferenceKeyAndCategory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SharedPreferenceKeyAndCategory instance
   */
  public static ImmutableSharedPreferenceKeyAndCategory copyOf(SharedPreferenceKeyAndCategory instance) {
    if (instance instanceof ImmutableSharedPreferenceKeyAndCategory) {
      return (ImmutableSharedPreferenceKeyAndCategory) instance;
    }
    return ImmutableSharedPreferenceKeyAndCategory.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSharedPreferenceKeyAndCategory ImmutableSharedPreferenceKeyAndCategory}.
   * @return A new ImmutableSharedPreferenceKeyAndCategory builder
   */
  public static ImmutableSharedPreferenceKeyAndCategory.Builder builder() {
    return new ImmutableSharedPreferenceKeyAndCategory.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSharedPreferenceKeyAndCategory ImmutableSharedPreferenceKeyAndCategory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_CATEGORY = 0x2L;
    private long initBits = 0x3L;

    private String key;
    private String category;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SharedPreferenceKeyAndCategory} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SharedPreferenceKeyAndCategory instance) {
      Objects.requireNonNull(instance, "instance");
      key(instance.key());
      category(instance.category());
      return this;
    }

    /**
     * Initializes the value for the {@link SharedPreferenceKeyAndCategory#key() key} attribute.
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
     * Initializes the value for the {@link SharedPreferenceKeyAndCategory#category() category} attribute.
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
     * Builds a new {@link ImmutableSharedPreferenceKeyAndCategory ImmutableSharedPreferenceKeyAndCategory}.
     * @return An immutable instance of SharedPreferenceKeyAndCategory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSharedPreferenceKeyAndCategory build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSharedPreferenceKeyAndCategory(key, category);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_CATEGORY) != 0) attributes.add("category");
      return "Cannot build SharedPreferenceKeyAndCategory, some of required attributes are not set " + attributes;
    }
  }
}
