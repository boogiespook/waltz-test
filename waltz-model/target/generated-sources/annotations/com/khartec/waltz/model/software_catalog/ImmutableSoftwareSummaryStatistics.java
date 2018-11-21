package com.khartec.waltz.model.software_catalog;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.tally.Tally;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SoftwareSummaryStatistics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSoftwareSummaryStatistics.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SoftwareSummaryStatistics"})
public final class ImmutableSoftwareSummaryStatistics
    extends SoftwareSummaryStatistics {
  private final List<Tally<String>> vendorCounts;
  private final List<Tally<String>> maturityCounts;

  private ImmutableSoftwareSummaryStatistics(
      List<Tally<String>> vendorCounts,
      List<Tally<String>> maturityCounts) {
    this.vendorCounts = vendorCounts;
    this.maturityCounts = maturityCounts;
  }

  /**
   * @return The value of the {@code vendorCounts} attribute
   */
  @JsonProperty("vendorCounts")
  @Override
  public List<Tally<String>> vendorCounts() {
    return vendorCounts;
  }

  /**
   * @return The value of the {@code maturityCounts} attribute
   */
  @JsonProperty("maturityCounts")
  @Override
  public List<Tally<String>> maturityCounts() {
    return maturityCounts;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareSummaryStatistics#vendorCounts() vendorCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableSoftwareSummaryStatistics withVendorCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSoftwareSummaryStatistics(newValue, this.maturityCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareSummaryStatistics#vendorCounts() vendorCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of vendorCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwareSummaryStatistics withVendorCounts(Iterable<? extends Tally<String>> elements) {
    if (this.vendorCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSoftwareSummaryStatistics(newValue, this.maturityCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareSummaryStatistics#maturityCounts() maturityCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableSoftwareSummaryStatistics withMaturityCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSoftwareSummaryStatistics(this.vendorCounts, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SoftwareSummaryStatistics#maturityCounts() maturityCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of maturityCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwareSummaryStatistics withMaturityCounts(Iterable<? extends Tally<String>> elements) {
    if (this.maturityCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSoftwareSummaryStatistics(this.vendorCounts, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSoftwareSummaryStatistics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSoftwareSummaryStatistics
        && equalTo((ImmutableSoftwareSummaryStatistics) another);
  }

  private boolean equalTo(ImmutableSoftwareSummaryStatistics another) {
    return vendorCounts.equals(another.vendorCounts)
        && maturityCounts.equals(another.maturityCounts);
  }

  /**
   * Computes a hash code from attributes: {@code vendorCounts}, {@code maturityCounts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + vendorCounts.hashCode();
    h += (h << 5) + maturityCounts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SoftwareSummaryStatistics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SoftwareSummaryStatistics{"
        + "vendorCounts=" + vendorCounts
        + ", maturityCounts=" + maturityCounts
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SoftwareSummaryStatistics {
    List<Tally<String>> vendorCounts = Collections.emptyList();
    List<Tally<String>> maturityCounts = Collections.emptyList();
    @JsonProperty("vendorCounts")
    public void setVendorCounts(List<Tally<String>> vendorCounts) {
      this.vendorCounts = vendorCounts;
    }
    @JsonProperty("maturityCounts")
    public void setMaturityCounts(List<Tally<String>> maturityCounts) {
      this.maturityCounts = maturityCounts;
    }
    @Override
    public List<Tally<String>> vendorCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> maturityCounts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSoftwareSummaryStatistics fromJson(Json json) {
    ImmutableSoftwareSummaryStatistics.Builder builder = ImmutableSoftwareSummaryStatistics.builder();
    if (json.vendorCounts != null) {
      builder.addAllVendorCounts(json.vendorCounts);
    }
    if (json.maturityCounts != null) {
      builder.addAllMaturityCounts(json.maturityCounts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SoftwareSummaryStatistics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SoftwareSummaryStatistics instance
   */
  public static ImmutableSoftwareSummaryStatistics copyOf(SoftwareSummaryStatistics instance) {
    if (instance instanceof ImmutableSoftwareSummaryStatistics) {
      return (ImmutableSoftwareSummaryStatistics) instance;
    }
    return ImmutableSoftwareSummaryStatistics.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSoftwareSummaryStatistics ImmutableSoftwareSummaryStatistics}.
   * @return A new ImmutableSoftwareSummaryStatistics builder
   */
  public static ImmutableSoftwareSummaryStatistics.Builder builder() {
    return new ImmutableSoftwareSummaryStatistics.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSoftwareSummaryStatistics ImmutableSoftwareSummaryStatistics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private List<Tally<String>> vendorCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> maturityCounts = new ArrayList<Tally<String>>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SoftwareSummaryStatistics} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SoftwareSummaryStatistics instance) {
      Objects.requireNonNull(instance, "instance");
      addAllVendorCounts(instance.vendorCounts());
      addAllMaturityCounts(instance.maturityCounts());
      return this;
    }

    /**
     * Adds one element to {@link SoftwareSummaryStatistics#vendorCounts() vendorCounts} list.
     * @param element A vendorCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addVendorCounts(Tally<String> element) {
      this.vendorCounts.add(Objects.requireNonNull(element, "vendorCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link SoftwareSummaryStatistics#vendorCounts() vendorCounts} list.
     * @param elements An array of vendorCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addVendorCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.vendorCounts.add(Objects.requireNonNull(element, "vendorCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SoftwareSummaryStatistics#vendorCounts() vendorCounts} list.
     * @param elements An iterable of vendorCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("vendorCounts")
    public final Builder vendorCounts(Iterable<? extends Tally<String>> elements) {
      this.vendorCounts.clear();
      return addAllVendorCounts(elements);
    }

    /**
     * Adds elements to {@link SoftwareSummaryStatistics#vendorCounts() vendorCounts} list.
     * @param elements An iterable of vendorCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllVendorCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.vendorCounts.add(Objects.requireNonNull(element, "vendorCounts element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link SoftwareSummaryStatistics#maturityCounts() maturityCounts} list.
     * @param element A maturityCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMaturityCounts(Tally<String> element) {
      this.maturityCounts.add(Objects.requireNonNull(element, "maturityCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link SoftwareSummaryStatistics#maturityCounts() maturityCounts} list.
     * @param elements An array of maturityCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addMaturityCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.maturityCounts.add(Objects.requireNonNull(element, "maturityCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SoftwareSummaryStatistics#maturityCounts() maturityCounts} list.
     * @param elements An iterable of maturityCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maturityCounts")
    public final Builder maturityCounts(Iterable<? extends Tally<String>> elements) {
      this.maturityCounts.clear();
      return addAllMaturityCounts(elements);
    }

    /**
     * Adds elements to {@link SoftwareSummaryStatistics#maturityCounts() maturityCounts} list.
     * @param elements An iterable of maturityCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMaturityCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.maturityCounts.add(Objects.requireNonNull(element, "maturityCounts element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableSoftwareSummaryStatistics ImmutableSoftwareSummaryStatistics}.
     * @return An immutable instance of SoftwareSummaryStatistics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSoftwareSummaryStatistics build() {
      return new ImmutableSoftwareSummaryStatistics(createUnmodifiableList(true, vendorCounts), createUnmodifiableList(true, maturityCounts));
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
