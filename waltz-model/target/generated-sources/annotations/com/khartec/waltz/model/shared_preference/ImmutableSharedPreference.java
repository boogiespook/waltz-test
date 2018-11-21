package com.khartec.waltz.model.shared_preference;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.LastUpdatedProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SharedPreference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSharedPreference.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SharedPreference"})
public final class ImmutableSharedPreference
    extends SharedPreference {
  private final String key;
  private final String category;
  private final String value;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableSharedPreference(ImmutableSharedPreference.Builder builder) {
    this.key = builder.key;
    this.category = builder.category;
    this.value = builder.value;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.lastUpdatedAt = builder.lastUpdatedAt != null
        ? builder.lastUpdatedAt
        : Objects.requireNonNull(super.lastUpdatedAt(), "lastUpdatedAt");
  }

  private ImmutableSharedPreference(
      String key,
      String category,
      String value,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.key = key;
    this.category = category;
    this.value = value;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
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
   * @return The value of the {@code lastUpdatedAt} attribute
   */
  @JsonProperty("lastUpdatedAt")
  @Override
  public LocalDateTime lastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * @return The value of the {@code lastUpdatedBy} attribute
   */
  @JsonProperty("lastUpdatedBy")
  @Override
  public String lastUpdatedBy() {
    return lastUpdatedBy;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreference#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreference withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "key");
    return new ImmutableSharedPreference(newValue, this.category, this.value, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreference#category() category} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreference withCategory(String value) {
    if (this.category.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "category");
    return new ImmutableSharedPreference(this.key, newValue, this.value, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreference#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreference withValue(String value) {
    if (this.value.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "value");
    return new ImmutableSharedPreference(this.key, this.category, newValue, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreference#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreference withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableSharedPreference(this.key, this.category, this.value, newValue, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SharedPreference#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSharedPreference withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableSharedPreference(this.key, this.category, this.value, this.lastUpdatedAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSharedPreference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSharedPreference
        && equalTo((ImmutableSharedPreference) another);
  }

  private boolean equalTo(ImmutableSharedPreference another) {
    return key.equals(another.key)
        && category.equals(another.category)
        && value.equals(another.value)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code category}, {@code value}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + category.hashCode();
    h += (h << 5) + value.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SharedPreference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SharedPreference{"
        + "key=" + key
        + ", category=" + category
        + ", value=" + value
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SharedPreference {
    String key;
    String category;
    String value;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
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
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
    @Override
    public String category() { throw new UnsupportedOperationException(); }
    @Override
    public String value() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSharedPreference fromJson(Json json) {
    ImmutableSharedPreference.Builder builder = ImmutableSharedPreference.builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SharedPreference} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SharedPreference instance
   */
  public static ImmutableSharedPreference copyOf(SharedPreference instance) {
    if (instance instanceof ImmutableSharedPreference) {
      return (ImmutableSharedPreference) instance;
    }
    return ImmutableSharedPreference.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSharedPreference ImmutableSharedPreference}.
   * @return A new ImmutableSharedPreference builder
   */
  public static ImmutableSharedPreference.Builder builder() {
    return new ImmutableSharedPreference.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSharedPreference ImmutableSharedPreference}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_CATEGORY = 0x2L;
    private static final long INIT_BIT_VALUE = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private String key;
    private String category;
    private String value;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LastUpdatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastUpdatedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.shared_preference.SharedPreference} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SharedPreference instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof SharedPreference) {
        SharedPreference instance = (SharedPreference) object;
        category(instance.category());
        value(instance.value());
        key(instance.key());
      }
    }

    /**
     * Initializes the value for the {@link SharedPreference#key() key} attribute.
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
     * Initializes the value for the {@link SharedPreference#category() category} attribute.
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
     * Initializes the value for the {@link SharedPreference#value() value} attribute.
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
     * Initializes the value for the {@link SharedPreference#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SharedPreference#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link SharedPreference#lastUpdatedBy() lastUpdatedBy} attribute.
     * @param lastUpdatedBy The value for lastUpdatedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedBy")
    public final Builder lastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = Objects.requireNonNull(lastUpdatedBy, "lastUpdatedBy");
      initBits &= ~INIT_BIT_LAST_UPDATED_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSharedPreference ImmutableSharedPreference}.
     * @return An immutable instance of SharedPreference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSharedPreference build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSharedPreference(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_CATEGORY) != 0) attributes.add("category");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build SharedPreference, some of required attributes are not set " + attributes;
    }
  }
}
