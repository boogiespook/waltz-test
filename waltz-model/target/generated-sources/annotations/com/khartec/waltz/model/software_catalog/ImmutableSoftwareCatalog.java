package com.khartec.waltz.model.software_catalog;

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
 * Immutable implementation of {@link SoftwareCatalog}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSoftwareCatalog.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SoftwareCatalog"})
public final class ImmutableSoftwareCatalog extends SoftwareCatalog {
  private final List<SoftwareUsage> usages;
  private final List<SoftwarePackage> packages;

  private ImmutableSoftwareCatalog(
      List<SoftwareUsage> usages,
      List<SoftwarePackage> packages) {
    this.usages = usages;
    this.packages = packages;
  }

  /**
   * @return The value of the {@code usages} attribute
   */
  @JsonProperty("usages")
  @Override
  public List<SoftwareUsage> usages() {
    return usages;
  }

  /**
   * @return The value of the {@code packages} attribute
   */
  @JsonProperty("packages")
  @Override
  public List<SoftwarePackage> packages() {
    return packages;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareCatalog#usages() usages}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwareCatalog withUsages(SoftwareUsage... elements) {
    List<SoftwareUsage> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSoftwareCatalog(newValue, this.packages);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareCatalog#usages() usages}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of usages elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwareCatalog withUsages(Iterable<? extends SoftwareUsage> elements) {
    if (this.usages == elements) return this;
    List<SoftwareUsage> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSoftwareCatalog(newValue, this.packages);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareCatalog#packages() packages}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwareCatalog withPackages(SoftwarePackage... elements) {
    List<SoftwarePackage> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSoftwareCatalog(this.usages, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareCatalog#packages() packages}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of packages elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwareCatalog withPackages(Iterable<? extends SoftwarePackage> elements) {
    if (this.packages == elements) return this;
    List<SoftwarePackage> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSoftwareCatalog(this.usages, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSoftwareCatalog} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSoftwareCatalog
        && equalTo((ImmutableSoftwareCatalog) another);
  }

  private boolean equalTo(ImmutableSoftwareCatalog another) {
    return usages.equals(another.usages)
        && packages.equals(another.packages);
  }

  /**
   * Computes a hash code from attributes: {@code usages}, {@code packages}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + usages.hashCode();
    h += (h << 5) + packages.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SoftwareCatalog} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SoftwareCatalog{"
        + "usages=" + usages
        + ", packages=" + packages
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SoftwareCatalog {
    List<SoftwareUsage> usages = Collections.emptyList();
    List<SoftwarePackage> packages = Collections.emptyList();
    @JsonProperty("usages")
    public void setUsages(List<SoftwareUsage> usages) {
      this.usages = usages;
    }
    @JsonProperty("packages")
    public void setPackages(List<SoftwarePackage> packages) {
      this.packages = packages;
    }
    @Override
    public List<SoftwareUsage> usages() { throw new UnsupportedOperationException(); }
    @Override
    public List<SoftwarePackage> packages() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSoftwareCatalog fromJson(Json json) {
    ImmutableSoftwareCatalog.Builder builder = ImmutableSoftwareCatalog.builder();
    if (json.usages != null) {
      builder.addAllUsages(json.usages);
    }
    if (json.packages != null) {
      builder.addAllPackages(json.packages);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SoftwareCatalog} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SoftwareCatalog instance
   */
  public static ImmutableSoftwareCatalog copyOf(SoftwareCatalog instance) {
    if (instance instanceof ImmutableSoftwareCatalog) {
      return (ImmutableSoftwareCatalog) instance;
    }
    return ImmutableSoftwareCatalog.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSoftwareCatalog ImmutableSoftwareCatalog}.
   * @return A new ImmutableSoftwareCatalog builder
   */
  public static ImmutableSoftwareCatalog.Builder builder() {
    return new ImmutableSoftwareCatalog.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSoftwareCatalog ImmutableSoftwareCatalog}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private List<SoftwareUsage> usages = new ArrayList<SoftwareUsage>();
    private List<SoftwarePackage> packages = new ArrayList<SoftwarePackage>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SoftwareCatalog} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SoftwareCatalog instance) {
      Objects.requireNonNull(instance, "instance");
      addAllUsages(instance.usages());
      addAllPackages(instance.packages());
      return this;
    }

    /**
     * Adds one element to {@link SoftwareCatalog#usages() usages} list.
     * @param element A usages element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUsages(SoftwareUsage element) {
      this.usages.add(Objects.requireNonNull(element, "usages element"));
      return this;
    }

    /**
     * Adds elements to {@link SoftwareCatalog#usages() usages} list.
     * @param elements An array of usages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUsages(SoftwareUsage... elements) {
      for (SoftwareUsage element : elements) {
        this.usages.add(Objects.requireNonNull(element, "usages element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SoftwareCatalog#usages() usages} list.
     * @param elements An iterable of usages elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usages")
    public final Builder usages(Iterable<? extends SoftwareUsage> elements) {
      this.usages.clear();
      return addAllUsages(elements);
    }

    /**
     * Adds elements to {@link SoftwareCatalog#usages() usages} list.
     * @param elements An iterable of usages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllUsages(Iterable<? extends SoftwareUsage> elements) {
      for (SoftwareUsage element : elements) {
        this.usages.add(Objects.requireNonNull(element, "usages element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link SoftwareCatalog#packages() packages} list.
     * @param element A packages element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPackages(SoftwarePackage element) {
      this.packages.add(Objects.requireNonNull(element, "packages element"));
      return this;
    }

    /**
     * Adds elements to {@link SoftwareCatalog#packages() packages} list.
     * @param elements An array of packages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPackages(SoftwarePackage... elements) {
      for (SoftwarePackage element : elements) {
        this.packages.add(Objects.requireNonNull(element, "packages element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SoftwareCatalog#packages() packages} list.
     * @param elements An iterable of packages elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packages")
    public final Builder packages(Iterable<? extends SoftwarePackage> elements) {
      this.packages.clear();
      return addAllPackages(elements);
    }

    /**
     * Adds elements to {@link SoftwareCatalog#packages() packages} list.
     * @param elements An iterable of packages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPackages(Iterable<? extends SoftwarePackage> elements) {
      for (SoftwarePackage element : elements) {
        this.packages.add(Objects.requireNonNull(element, "packages element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableSoftwareCatalog ImmutableSoftwareCatalog}.
     * @return An immutable instance of SoftwareCatalog
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSoftwareCatalog build() {
      return new ImmutableSoftwareCatalog(createUnmodifiableList(true, usages), createUnmodifiableList(true, packages));
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
