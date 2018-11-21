package com.khartec.waltz.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdSelectionOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityStatisticQueryOptions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityStatisticQueryOptions.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityStatisticQueryOptions"})
public final class ImmutableEntityStatisticQueryOptions
    extends EntityStatisticQueryOptions {
  private final IdSelectionOptions selector;
  private final List<Long> statisticIds;

  private ImmutableEntityStatisticQueryOptions(IdSelectionOptions selector, List<Long> statisticIds) {
    this.selector = selector;
    this.statisticIds = statisticIds;
  }

  /**
   * @return The value of the {@code selector} attribute
   */
  @JsonProperty("selector")
  @Override
  public IdSelectionOptions selector() {
    return selector;
  }

  /**
   * @return The value of the {@code statisticIds} attribute
   */
  @JsonProperty("statisticIds")
  @Override
  public List<Long> statisticIds() {
    return statisticIds;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticQueryOptions#selector() selector} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for selector
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticQueryOptions withSelector(IdSelectionOptions value) {
    if (this.selector == value) return this;
    IdSelectionOptions newValue = Objects.requireNonNull(value, "selector");
    return new ImmutableEntityStatisticQueryOptions(newValue, this.statisticIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntityStatisticQueryOptions#statisticIds() statisticIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticQueryOptions withStatisticIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    List<Long> newValue = createUnmodifiableList(false, wrappedList);
    return new ImmutableEntityStatisticQueryOptions(this.selector, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntityStatisticQueryOptions#statisticIds() statisticIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of statisticIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticQueryOptions withStatisticIds(Iterable<Long> elements) {
    if (this.statisticIds == elements) return this;
    List<Long> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEntityStatisticQueryOptions(this.selector, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityStatisticQueryOptions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityStatisticQueryOptions
        && equalTo((ImmutableEntityStatisticQueryOptions) another);
  }

  private boolean equalTo(ImmutableEntityStatisticQueryOptions another) {
    return selector.equals(another.selector)
        && statisticIds.equals(another.statisticIds);
  }

  /**
   * Computes a hash code from attributes: {@code selector}, {@code statisticIds}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + selector.hashCode();
    h += (h << 5) + statisticIds.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityStatisticQueryOptions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityStatisticQueryOptions{"
        + "selector=" + selector
        + ", statisticIds=" + statisticIds
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityStatisticQueryOptions {
    IdSelectionOptions selector;
    List<Long> statisticIds = Collections.emptyList();
    @JsonProperty("selector")
    public void setSelector(IdSelectionOptions selector) {
      this.selector = selector;
    }
    @JsonProperty("statisticIds")
    public void setStatisticIds(List<Long> statisticIds) {
      this.statisticIds = statisticIds;
    }
    @Override
    public IdSelectionOptions selector() { throw new UnsupportedOperationException(); }
    @Override
    public List<Long> statisticIds() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityStatisticQueryOptions fromJson(Json json) {
    ImmutableEntityStatisticQueryOptions.Builder builder = ImmutableEntityStatisticQueryOptions.builder();
    if (json.selector != null) {
      builder.selector(json.selector);
    }
    if (json.statisticIds != null) {
      builder.addAllStatisticIds(json.statisticIds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityStatisticQueryOptions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityStatisticQueryOptions instance
   */
  public static ImmutableEntityStatisticQueryOptions copyOf(EntityStatisticQueryOptions instance) {
    if (instance instanceof ImmutableEntityStatisticQueryOptions) {
      return (ImmutableEntityStatisticQueryOptions) instance;
    }
    return ImmutableEntityStatisticQueryOptions.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityStatisticQueryOptions ImmutableEntityStatisticQueryOptions}.
   * @return A new ImmutableEntityStatisticQueryOptions builder
   */
  public static ImmutableEntityStatisticQueryOptions.Builder builder() {
    return new ImmutableEntityStatisticQueryOptions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityStatisticQueryOptions ImmutableEntityStatisticQueryOptions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SELECTOR = 0x1L;
    private long initBits = 0x1L;

    private IdSelectionOptions selector;
    private List<Long> statisticIds = new ArrayList<Long>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityStatisticQueryOptions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityStatisticQueryOptions instance) {
      Objects.requireNonNull(instance, "instance");
      selector(instance.selector());
      addAllStatisticIds(instance.statisticIds());
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticQueryOptions#selector() selector} attribute.
     * @param selector The value for selector 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("selector")
    public final Builder selector(IdSelectionOptions selector) {
      this.selector = Objects.requireNonNull(selector, "selector");
      initBits &= ~INIT_BIT_SELECTOR;
      return this;
    }

    /**
     * Adds one element to {@link EntityStatisticQueryOptions#statisticIds() statisticIds} list.
     * @param element A statisticIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addStatisticIds(long element) {
      this.statisticIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link EntityStatisticQueryOptions#statisticIds() statisticIds} list.
     * @param elements An array of statisticIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addStatisticIds(long... elements) {
      for (long element : elements) {
        this.statisticIds.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link EntityStatisticQueryOptions#statisticIds() statisticIds} list.
     * @param elements An iterable of statisticIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statisticIds")
    public final Builder statisticIds(Iterable<Long> elements) {
      this.statisticIds.clear();
      return addAllStatisticIds(elements);
    }

    /**
     * Adds elements to {@link EntityStatisticQueryOptions#statisticIds() statisticIds} list.
     * @param elements An iterable of statisticIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllStatisticIds(Iterable<Long> elements) {
      for (long element : elements) {
        this.statisticIds.add(Objects.requireNonNull(element, "statisticIds element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityStatisticQueryOptions ImmutableEntityStatisticQueryOptions}.
     * @return An immutable instance of EntityStatisticQueryOptions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityStatisticQueryOptions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityStatisticQueryOptions(selector, createUnmodifiableList(true, statisticIds));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SELECTOR) != 0) attributes.add("selector");
      return "Cannot build EntityStatisticQueryOptions, some of required attributes are not set " + attributes;
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
