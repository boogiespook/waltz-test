package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link IdGroup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIdGroup.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "IdGroup"})
public final class ImmutableIdGroup extends IdGroup {
  private final Long key;
  private final List<Long> values;

  private ImmutableIdGroup(Long key, List<Long> values) {
    this.key = key;
    this.values = values;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public Long key() {
    return key;
  }

  /**
   * @return The value of the {@code values} attribute
   */
  @JsonProperty("values")
  @Override
  public List<Long> values() {
    return values;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link IdGroup#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableIdGroup withKey(Long value) {
    if (this.key.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "key");
    return new ImmutableIdGroup(newValue, this.values);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link IdGroup#values() values}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdGroup withValues(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    List<Long> newValue = createUnmodifiableList(false, wrappedList);
    return new ImmutableIdGroup(this.key, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link IdGroup#values() values}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of values elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdGroup withValues(Iterable<Long> elements) {
    if (this.values == elements) return this;
    List<Long> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableIdGroup(this.key, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIdGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIdGroup
        && equalTo((ImmutableIdGroup) another);
  }

  private boolean equalTo(ImmutableIdGroup another) {
    return key.equals(another.key)
        && values.equals(another.values);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code values}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + values.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code IdGroup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "IdGroup{"
        + "key=" + key
        + ", values=" + values
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends IdGroup {
    Long key;
    List<Long> values = Collections.emptyList();
    @JsonProperty("key")
    public void setKey(Long key) {
      this.key = key;
    }
    @JsonProperty("values")
    public void setValues(List<Long> values) {
      this.values = values;
    }
    @Override
    public Long key() { throw new UnsupportedOperationException(); }
    @Override
    public List<Long> values() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableIdGroup fromJson(Json json) {
    ImmutableIdGroup.Builder builder = ImmutableIdGroup.builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.values != null) {
      builder.addAllValues(json.values);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link IdGroup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable IdGroup instance
   */
  public static ImmutableIdGroup copyOf(IdGroup instance) {
    if (instance instanceof ImmutableIdGroup) {
      return (ImmutableIdGroup) instance;
    }
    return ImmutableIdGroup.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableIdGroup ImmutableIdGroup}.
   * @return A new ImmutableIdGroup builder
   */
  public static ImmutableIdGroup.Builder builder() {
    return new ImmutableIdGroup.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableIdGroup ImmutableIdGroup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private long initBits = 0x1L;

    private Long key;
    private List<Long> values = new ArrayList<Long>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code IdGroup} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdGroup instance) {
      Objects.requireNonNull(instance, "instance");
      key(instance.key());
      addAllValues(instance.values());
      return this;
    }

    /**
     * Initializes the value for the {@link IdGroup#key() key} attribute.
     * @param key The value for key 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("key")
    public final Builder key(Long key) {
      this.key = Objects.requireNonNull(key, "key");
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Adds one element to {@link IdGroup#values() values} list.
     * @param element A values element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addValues(long element) {
      this.values.add(element);
      return this;
    }

    /**
     * Adds elements to {@link IdGroup#values() values} list.
     * @param elements An array of values elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addValues(long... elements) {
      for (long element : elements) {
        this.values.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link IdGroup#values() values} list.
     * @param elements An iterable of values elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("values")
    public final Builder values(Iterable<Long> elements) {
      this.values.clear();
      return addAllValues(elements);
    }

    /**
     * Adds elements to {@link IdGroup#values() values} list.
     * @param elements An iterable of values elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllValues(Iterable<Long> elements) {
      for (long element : elements) {
        this.values.add(Objects.requireNonNull(element, "values element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableIdGroup ImmutableIdGroup}.
     * @return An immutable instance of IdGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableIdGroup build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableIdGroup(key, createUnmodifiableList(true, values));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      return "Cannot build IdGroup, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
