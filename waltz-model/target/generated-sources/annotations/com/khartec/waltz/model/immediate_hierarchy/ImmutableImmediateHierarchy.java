package com.khartec.waltz.model.immediate_hierarchy;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ImmediateHierarchy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmediateHierarchy.<T>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ImmediateHierarchy<T>"})
public final class ImmutableImmediateHierarchy<T>
    extends ImmediateHierarchy<T> {
  private final T self;
  private final T parent;
  private final List<T> children;

  private ImmutableImmediateHierarchy(T self, T parent, List<T> children) {
    this.self = self;
    this.parent = parent;
    this.children = children;
  }

  /**
   * @return The value of the {@code self} attribute
   */
  @JsonProperty("self")
  @Override
  public T self() {
    return self;
  }

  /**
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<T> parent() {
    return Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code children} attribute
   */
  @JsonProperty("children")
  @Override
  public List<T> children() {
    return children;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmediateHierarchy#self() self} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for self
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmediateHierarchy<T> withSelf(T value) {
    if (this.self == value) return this;
    T newValue = Objects.requireNonNull(value, "self");
    return new ImmutableImmediateHierarchy<T>(newValue, this.parent, this.children);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmediateHierarchy#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmediateHierarchy<T> withParent(T value) {
    T newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableImmediateHierarchy<T>(this.self, newValue, this.children);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmediateHierarchy#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmediateHierarchy<T> withParent(Optional<? extends T> optional) {
    T value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableImmediateHierarchy<T>(this.self, value, this.children);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImmediateHierarchy#children() children}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableImmediateHierarchy<T> withChildren(T... elements) {
    List<T> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableImmediateHierarchy<T>(this.self, this.parent, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImmediateHierarchy#children() children}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of children elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmediateHierarchy<T> withChildren(Iterable<? extends T> elements) {
    if (this.children == elements) return this;
    List<T> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableImmediateHierarchy<T>(this.self, this.parent, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmediateHierarchy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmediateHierarchy<?>
        && equalTo((ImmutableImmediateHierarchy<T>) another);
  }

  private boolean equalTo(ImmutableImmediateHierarchy<T> another) {
    return self.equals(another.self)
        && Objects.equals(parent, another.parent)
        && children.equals(another.children);
  }

  /**
   * Computes a hash code from attributes: {@code self}, {@code parent}, {@code children}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + self.hashCode();
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + children.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ImmediateHierarchy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImmediateHierarchy{");
    builder.append("self=").append(self);
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    builder.append(", ");
    builder.append("children=").append(children);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json<T> extends ImmediateHierarchy<T> {
    T self;
    Optional<T> parent = Optional.empty();
    List<T> children = Collections.emptyList();
    @JsonProperty("self")
    public void setSelf(T self) {
      this.self = self;
    }
    @JsonProperty("parent")
    public void setParent(Optional<T> parent) {
      this.parent = parent;
    }
    @JsonProperty("children")
    public void setChildren(List<T> children) {
      this.children = children;
    }
    @Override
    public T self() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<T> parent() { throw new UnsupportedOperationException(); }
    @Override
    public List<T> children() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param <T> generic parameter T
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static <T> ImmutableImmediateHierarchy<T> fromJson(Json<T> json) {
    ImmutableImmediateHierarchy.Builder<T> builder = ImmutableImmediateHierarchy.<T>builder();
    if (json.self != null) {
      builder.self(json.self);
    }
    if (json.parent != null) {
      builder.parent(json.parent);
    }
    if (json.children != null) {
      builder.addAllChildren(json.children);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImmediateHierarchy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <T> generic parameter T
   * @param instance The instance to copy
   * @return A copied immutable ImmediateHierarchy instance
   */
  public static <T> ImmutableImmediateHierarchy<T> copyOf(ImmediateHierarchy<T> instance) {
    if (instance instanceof ImmutableImmediateHierarchy<?>) {
      return (ImmutableImmediateHierarchy<T>) instance;
    }
    return ImmutableImmediateHierarchy.<T>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableImmediateHierarchy ImmutableImmediateHierarchy}.
   * @param <T> generic parameter T
   * @return A new ImmutableImmediateHierarchy builder
   */
  public static <T> ImmutableImmediateHierarchy.Builder<T> builder() {
    return new ImmutableImmediateHierarchy.Builder<T>();
  }

  /**
   * Builds instances of type {@link ImmutableImmediateHierarchy ImmutableImmediateHierarchy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<T> {
    private static final long INIT_BIT_SELF = 0x1L;
    private long initBits = 0x1L;

    private T self;
    private T parent;
    private List<T> children = new ArrayList<T>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ImmediateHierarchy} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> from(ImmediateHierarchy<T> instance) {
      Objects.requireNonNull(instance, "instance");
      self(instance.self());
      Optional<T> parentOptional = instance.parent();
      if (parentOptional.isPresent()) {
        parent(parentOptional);
      }
      addAllChildren(instance.children());
      return this;
    }

    /**
     * Initializes the value for the {@link ImmediateHierarchy#self() self} attribute.
     * @param self The value for self 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("self")
    public final Builder<T> self(T self) {
      this.self = Objects.requireNonNull(self, "self");
      initBits &= ~INIT_BIT_SELF;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmediateHierarchy#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder<T> parent(T parent) {
      this.parent = Objects.requireNonNull(parent, "parent");
      return this;
    }

    /**
     * Initializes the optional value {@link ImmediateHierarchy#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder<T> parent(Optional<? extends T> parent) {
      this.parent = parent.orElse(null);
      return this;
    }

    /**
     * Adds one element to {@link ImmediateHierarchy#children() children} list.
     * @param element A children element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> addChildren(T element) {
      this.children.add(Objects.requireNonNull(element, "children element"));
      return this;
    }

    /**
     * Adds elements to {@link ImmediateHierarchy#children() children} list.
     * @param elements An array of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder<T> addChildren(T... elements) {
      for (T element : elements) {
        this.children.add(Objects.requireNonNull(element, "children element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ImmediateHierarchy#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("children")
    public final Builder<T> children(Iterable<? extends T> elements) {
      this.children.clear();
      return addAllChildren(elements);
    }

    /**
     * Adds elements to {@link ImmediateHierarchy#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> addAllChildren(Iterable<? extends T> elements) {
      for (T element : elements) {
        this.children.add(Objects.requireNonNull(element, "children element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableImmediateHierarchy ImmutableImmediateHierarchy}.
     * @return An immutable instance of ImmediateHierarchy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableImmediateHierarchy<T> build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableImmediateHierarchy<T>(self, parent, createUnmodifiableList(true, children));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SELF) != 0) attributes.add("self");
      return "Cannot build ImmediateHierarchy, some of required attributes are not set " + attributes;
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
