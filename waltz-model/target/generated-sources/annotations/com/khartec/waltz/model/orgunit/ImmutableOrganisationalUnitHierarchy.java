package com.khartec.waltz.model.orgunit;

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
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link OrganisationalUnitHierarchy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganisationalUnitHierarchy.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "OrganisationalUnitHierarchy"})
public final class ImmutableOrganisationalUnitHierarchy
    extends OrganisationalUnitHierarchy {
  private final List<OrganisationalUnit> parents;
  private final List<OrganisationalUnit> children;
  private final OrganisationalUnit unit;

  private ImmutableOrganisationalUnitHierarchy(
      List<OrganisationalUnit> parents,
      List<OrganisationalUnit> children,
      OrganisationalUnit unit) {
    this.parents = parents;
    this.children = children;
    this.unit = unit;
  }

  /**
   * @return The value of the {@code parents} attribute
   */
  @JsonProperty("parents")
  @Override
  public List<OrganisationalUnit> parents() {
    return parents;
  }

  /**
   * @return The value of the {@code children} attribute
   */
  @JsonProperty("children")
  @Override
  public List<OrganisationalUnit> children() {
    return children;
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public OrganisationalUnit unit() {
    return unit;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link OrganisationalUnitHierarchy#parents() parents}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnitHierarchy withParents(OrganisationalUnit... elements) {
    List<OrganisationalUnit> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableOrganisationalUnitHierarchy(newValue, this.children, this.unit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link OrganisationalUnitHierarchy#parents() parents}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of parents elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnitHierarchy withParents(Iterable<? extends OrganisationalUnit> elements) {
    if (this.parents == elements) return this;
    List<OrganisationalUnit> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableOrganisationalUnitHierarchy(newValue, this.children, this.unit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link OrganisationalUnitHierarchy#children() children}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnitHierarchy withChildren(OrganisationalUnit... elements) {
    List<OrganisationalUnit> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableOrganisationalUnitHierarchy(this.parents, newValue, this.unit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link OrganisationalUnitHierarchy#children() children}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of children elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnitHierarchy withChildren(Iterable<? extends OrganisationalUnit> elements) {
    if (this.children == elements) return this;
    List<OrganisationalUnit> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableOrganisationalUnitHierarchy(this.parents, newValue, this.unit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrganisationalUnitHierarchy#unit() unit} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for unit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganisationalUnitHierarchy withUnit(OrganisationalUnit value) {
    if (this.unit == value) return this;
    OrganisationalUnit newValue = Objects.requireNonNull(value, "unit");
    return new ImmutableOrganisationalUnitHierarchy(this.parents, this.children, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganisationalUnitHierarchy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganisationalUnitHierarchy
        && equalTo((ImmutableOrganisationalUnitHierarchy) another);
  }

  private boolean equalTo(ImmutableOrganisationalUnitHierarchy another) {
    return parents.equals(another.parents)
        && children.equals(another.children)
        && unit.equals(another.unit);
  }

  /**
   * Computes a hash code from attributes: {@code parents}, {@code children}, {@code unit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + parents.hashCode();
    h += (h << 5) + children.hashCode();
    h += (h << 5) + unit.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code OrganisationalUnitHierarchy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "OrganisationalUnitHierarchy{"
        + "parents=" + parents
        + ", children=" + children
        + ", unit=" + unit
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends OrganisationalUnitHierarchy {
    List<OrganisationalUnit> parents = Collections.emptyList();
    List<OrganisationalUnit> children = Collections.emptyList();
    OrganisationalUnit unit;
    @JsonProperty("parents")
    public void setParents(List<OrganisationalUnit> parents) {
      this.parents = parents;
    }
    @JsonProperty("children")
    public void setChildren(List<OrganisationalUnit> children) {
      this.children = children;
    }
    @JsonProperty("unit")
    public void setUnit(OrganisationalUnit unit) {
      this.unit = unit;
    }
    @Override
    public List<OrganisationalUnit> parents() { throw new UnsupportedOperationException(); }
    @Override
    public List<OrganisationalUnit> children() { throw new UnsupportedOperationException(); }
    @Override
    public OrganisationalUnit unit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOrganisationalUnitHierarchy fromJson(Json json) {
    ImmutableOrganisationalUnitHierarchy.Builder builder = ImmutableOrganisationalUnitHierarchy.builder();
    if (json.parents != null) {
      builder.addAllParents(json.parents);
    }
    if (json.children != null) {
      builder.addAllChildren(json.children);
    }
    if (json.unit != null) {
      builder.unit(json.unit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OrganisationalUnitHierarchy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OrganisationalUnitHierarchy instance
   */
  public static ImmutableOrganisationalUnitHierarchy copyOf(OrganisationalUnitHierarchy instance) {
    if (instance instanceof ImmutableOrganisationalUnitHierarchy) {
      return (ImmutableOrganisationalUnitHierarchy) instance;
    }
    return ImmutableOrganisationalUnitHierarchy.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOrganisationalUnitHierarchy ImmutableOrganisationalUnitHierarchy}.
   * @return A new ImmutableOrganisationalUnitHierarchy builder
   */
  public static ImmutableOrganisationalUnitHierarchy.Builder builder() {
    return new ImmutableOrganisationalUnitHierarchy.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOrganisationalUnitHierarchy ImmutableOrganisationalUnitHierarchy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_UNIT = 0x1L;
    private long initBits = 0x1L;

    private List<OrganisationalUnit> parents = new ArrayList<OrganisationalUnit>();
    private List<OrganisationalUnit> children = new ArrayList<OrganisationalUnit>();
    private OrganisationalUnit unit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OrganisationalUnitHierarchy} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(OrganisationalUnitHierarchy instance) {
      Objects.requireNonNull(instance, "instance");
      addAllParents(instance.parents());
      addAllChildren(instance.children());
      unit(instance.unit());
      return this;
    }

    /**
     * Adds one element to {@link OrganisationalUnitHierarchy#parents() parents} list.
     * @param element A parents element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParents(OrganisationalUnit element) {
      this.parents.add(Objects.requireNonNull(element, "parents element"));
      return this;
    }

    /**
     * Adds elements to {@link OrganisationalUnitHierarchy#parents() parents} list.
     * @param elements An array of parents elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParents(OrganisationalUnit... elements) {
      for (OrganisationalUnit element : elements) {
        this.parents.add(Objects.requireNonNull(element, "parents element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link OrganisationalUnitHierarchy#parents() parents} list.
     * @param elements An iterable of parents elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parents")
    public final Builder parents(Iterable<? extends OrganisationalUnit> elements) {
      this.parents.clear();
      return addAllParents(elements);
    }

    /**
     * Adds elements to {@link OrganisationalUnitHierarchy#parents() parents} list.
     * @param elements An iterable of parents elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParents(Iterable<? extends OrganisationalUnit> elements) {
      for (OrganisationalUnit element : elements) {
        this.parents.add(Objects.requireNonNull(element, "parents element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link OrganisationalUnitHierarchy#children() children} list.
     * @param element A children element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChildren(OrganisationalUnit element) {
      this.children.add(Objects.requireNonNull(element, "children element"));
      return this;
    }

    /**
     * Adds elements to {@link OrganisationalUnitHierarchy#children() children} list.
     * @param elements An array of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChildren(OrganisationalUnit... elements) {
      for (OrganisationalUnit element : elements) {
        this.children.add(Objects.requireNonNull(element, "children element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link OrganisationalUnitHierarchy#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("children")
    public final Builder children(Iterable<? extends OrganisationalUnit> elements) {
      this.children.clear();
      return addAllChildren(elements);
    }

    /**
     * Adds elements to {@link OrganisationalUnitHierarchy#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllChildren(Iterable<? extends OrganisationalUnit> elements) {
      for (OrganisationalUnit element : elements) {
        this.children.add(Objects.requireNonNull(element, "children element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link OrganisationalUnitHierarchy#unit() unit} attribute.
     * @param unit The value for unit 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unit")
    public final Builder unit(OrganisationalUnit unit) {
      this.unit = Objects.requireNonNull(unit, "unit");
      initBits &= ~INIT_BIT_UNIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOrganisationalUnitHierarchy ImmutableOrganisationalUnitHierarchy}.
     * @return An immutable instance of OrganisationalUnitHierarchy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOrganisationalUnitHierarchy build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOrganisationalUnitHierarchy(createUnmodifiableList(true, parents), createUnmodifiableList(true, children), unit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_UNIT) != 0) attributes.add("unit");
      return "Cannot build OrganisationalUnitHierarchy, some of required attributes are not set " + attributes;
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
