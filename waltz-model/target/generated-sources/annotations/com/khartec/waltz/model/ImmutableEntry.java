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
 * Immutable implementation of {@link Entry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntry.<K, V>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Entry<K, V>"})
public final class ImmutableEntry<K, V> extends Entry<K, V> {
  private final K key;
  private final V value;

  private ImmutableEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public K key() {
    return key;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public V value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Entry#key() key} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntry<K, V> withKey(K value) {
    if (this.key == value) return this;
    K newValue = Objects.requireNonNull(value, "key");
    return new ImmutableEntry<K, V>(newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Entry#value() value} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntry<K, V> withValue(V value) {
    if (this.value == value) return this;
    V newValue = Objects.requireNonNull(value, "value");
    return new ImmutableEntry<K, V>(this.key, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntry<?, ?>
        && equalTo((ImmutableEntry<K, V>) another);
  }

  private boolean equalTo(ImmutableEntry<K, V> another) {
    return key.equals(another.key)
        && value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Entry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Entry{"
        + "key=" + key
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
  static final class Json<K, V> extends Entry<K, V> {
    K key;
    V value;
    @JsonProperty("key")
    public void setKey(K key) {
      this.key = key;
    }
    @JsonProperty("value")
    public void setValue(V value) {
      this.value = value;
    }
    @Override
    public K key() { throw new UnsupportedOperationException(); }
    @Override
    public V value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param <K> generic parameter K
   * @param <V> generic parameter V
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static <K, V> ImmutableEntry<K, V> fromJson(Json<K, V> json) {
    ImmutableEntry.Builder<K, V> builder = ImmutableEntry.<K, V>builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Entry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <K> generic parameter K
   * @param <V> generic parameter V
   * @param instance The instance to copy
   * @return A copied immutable Entry instance
   */
  public static <K, V> ImmutableEntry<K, V> copyOf(Entry<K, V> instance) {
    if (instance instanceof ImmutableEntry<?, ?>) {
      return (ImmutableEntry<K, V>) instance;
    }
    return ImmutableEntry.<K, V>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntry ImmutableEntry}.
   * @param <K> generic parameter K
   * @param <V> generic parameter V
   * @return A new ImmutableEntry builder
   */
  public static <K, V> ImmutableEntry.Builder<K, V> builder() {
    return new ImmutableEntry.Builder<K, V>();
  }

  /**
   * Builds instances of type {@link ImmutableEntry ImmutableEntry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<K, V> {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private long initBits = 0x3L;

    private K key;
    private V value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Entry} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<K, V> from(Entry<K, V> instance) {
      Objects.requireNonNull(instance, "instance");
      key(instance.key());
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link Entry#key() key} attribute.
     * @param key The value for key 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("key")
    public final Builder<K, V> key(K key) {
      this.key = Objects.requireNonNull(key, "key");
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link Entry#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder<K, V> value(V value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntry ImmutableEntry}.
     * @return An immutable instance of Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntry<K, V> build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntry<K, V>(key, value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build Entry, some of required attributes are not set " + attributes;
    }
  }
}
