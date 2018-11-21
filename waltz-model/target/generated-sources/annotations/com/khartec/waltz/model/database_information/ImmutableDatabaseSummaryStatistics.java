package com.khartec.waltz.model.database_information;

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
 * Immutable implementation of {@link DatabaseSummaryStatistics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDatabaseSummaryStatistics.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DatabaseSummaryStatistics"})
public final class ImmutableDatabaseSummaryStatistics
    extends DatabaseSummaryStatistics {
  private final List<Tally<String>> environmentCounts;
  private final List<Tally<String>> vendorCounts;
  private final List<Tally<String>> endOfLifeStatusCounts;

  private ImmutableDatabaseSummaryStatistics(
      List<Tally<String>> environmentCounts,
      List<Tally<String>> vendorCounts,
      List<Tally<String>> endOfLifeStatusCounts) {
    this.environmentCounts = environmentCounts;
    this.vendorCounts = vendorCounts;
    this.endOfLifeStatusCounts = endOfLifeStatusCounts;
  }

  /**
   * @return The value of the {@code environmentCounts} attribute
   */
  @JsonProperty("environmentCounts")
  @Override
  public List<Tally<String>> environmentCounts() {
    return environmentCounts;
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
   * @return The value of the {@code endOfLifeStatusCounts} attribute
   */
  @JsonProperty("endOfLifeStatusCounts")
  @Override
  public List<Tally<String>> endOfLifeStatusCounts() {
    return endOfLifeStatusCounts;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DatabaseSummaryStatistics#environmentCounts() environmentCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableDatabaseSummaryStatistics withEnvironmentCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableDatabaseSummaryStatistics(newValue, this.vendorCounts, this.endOfLifeStatusCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DatabaseSummaryStatistics#environmentCounts() environmentCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of environmentCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDatabaseSummaryStatistics withEnvironmentCounts(Iterable<? extends Tally<String>> elements) {
    if (this.environmentCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDatabaseSummaryStatistics(newValue, this.vendorCounts, this.endOfLifeStatusCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DatabaseSummaryStatistics#vendorCounts() vendorCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableDatabaseSummaryStatistics withVendorCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableDatabaseSummaryStatistics(this.environmentCounts, newValue, this.endOfLifeStatusCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DatabaseSummaryStatistics#vendorCounts() vendorCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of vendorCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDatabaseSummaryStatistics withVendorCounts(Iterable<? extends Tally<String>> elements) {
    if (this.vendorCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDatabaseSummaryStatistics(this.environmentCounts, newValue, this.endOfLifeStatusCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DatabaseSummaryStatistics#endOfLifeStatusCounts() endOfLifeStatusCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableDatabaseSummaryStatistics withEndOfLifeStatusCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableDatabaseSummaryStatistics(this.environmentCounts, this.vendorCounts, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DatabaseSummaryStatistics#endOfLifeStatusCounts() endOfLifeStatusCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of endOfLifeStatusCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDatabaseSummaryStatistics withEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
    if (this.endOfLifeStatusCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDatabaseSummaryStatistics(this.environmentCounts, this.vendorCounts, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDatabaseSummaryStatistics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDatabaseSummaryStatistics
        && equalTo((ImmutableDatabaseSummaryStatistics) another);
  }

  private boolean equalTo(ImmutableDatabaseSummaryStatistics another) {
    return environmentCounts.equals(another.environmentCounts)
        && vendorCounts.equals(another.vendorCounts)
        && endOfLifeStatusCounts.equals(another.endOfLifeStatusCounts);
  }

  /**
   * Computes a hash code from attributes: {@code environmentCounts}, {@code vendorCounts}, {@code endOfLifeStatusCounts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + environmentCounts.hashCode();
    h += (h << 5) + vendorCounts.hashCode();
    h += (h << 5) + endOfLifeStatusCounts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DatabaseSummaryStatistics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DatabaseSummaryStatistics{"
        + "environmentCounts=" + environmentCounts
        + ", vendorCounts=" + vendorCounts
        + ", endOfLifeStatusCounts=" + endOfLifeStatusCounts
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends DatabaseSummaryStatistics {
    List<Tally<String>> environmentCounts = Collections.emptyList();
    List<Tally<String>> vendorCounts = Collections.emptyList();
    List<Tally<String>> endOfLifeStatusCounts = Collections.emptyList();
    @JsonProperty("environmentCounts")
    public void setEnvironmentCounts(List<Tally<String>> environmentCounts) {
      this.environmentCounts = environmentCounts;
    }
    @JsonProperty("vendorCounts")
    public void setVendorCounts(List<Tally<String>> vendorCounts) {
      this.vendorCounts = vendorCounts;
    }
    @JsonProperty("endOfLifeStatusCounts")
    public void setEndOfLifeStatusCounts(List<Tally<String>> endOfLifeStatusCounts) {
      this.endOfLifeStatusCounts = endOfLifeStatusCounts;
    }
    @Override
    public List<Tally<String>> environmentCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> vendorCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> endOfLifeStatusCounts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDatabaseSummaryStatistics fromJson(Json json) {
    ImmutableDatabaseSummaryStatistics.Builder builder = ImmutableDatabaseSummaryStatistics.builder();
    if (json.environmentCounts != null) {
      builder.addAllEnvironmentCounts(json.environmentCounts);
    }
    if (json.vendorCounts != null) {
      builder.addAllVendorCounts(json.vendorCounts);
    }
    if (json.endOfLifeStatusCounts != null) {
      builder.addAllEndOfLifeStatusCounts(json.endOfLifeStatusCounts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DatabaseSummaryStatistics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DatabaseSummaryStatistics instance
   */
  public static ImmutableDatabaseSummaryStatistics copyOf(DatabaseSummaryStatistics instance) {
    if (instance instanceof ImmutableDatabaseSummaryStatistics) {
      return (ImmutableDatabaseSummaryStatistics) instance;
    }
    return ImmutableDatabaseSummaryStatistics.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDatabaseSummaryStatistics ImmutableDatabaseSummaryStatistics}.
   * @return A new ImmutableDatabaseSummaryStatistics builder
   */
  public static ImmutableDatabaseSummaryStatistics.Builder builder() {
    return new ImmutableDatabaseSummaryStatistics.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDatabaseSummaryStatistics ImmutableDatabaseSummaryStatistics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private List<Tally<String>> environmentCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> vendorCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> endOfLifeStatusCounts = new ArrayList<Tally<String>>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DatabaseSummaryStatistics} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DatabaseSummaryStatistics instance) {
      Objects.requireNonNull(instance, "instance");
      addAllEnvironmentCounts(instance.environmentCounts());
      addAllVendorCounts(instance.vendorCounts());
      addAllEndOfLifeStatusCounts(instance.endOfLifeStatusCounts());
      return this;
    }

    /**
     * Adds one element to {@link DatabaseSummaryStatistics#environmentCounts() environmentCounts} list.
     * @param element A environmentCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEnvironmentCounts(Tally<String> element) {
      this.environmentCounts.add(Objects.requireNonNull(element, "environmentCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link DatabaseSummaryStatistics#environmentCounts() environmentCounts} list.
     * @param elements An array of environmentCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addEnvironmentCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.environmentCounts.add(Objects.requireNonNull(element, "environmentCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link DatabaseSummaryStatistics#environmentCounts() environmentCounts} list.
     * @param elements An iterable of environmentCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("environmentCounts")
    public final Builder environmentCounts(Iterable<? extends Tally<String>> elements) {
      this.environmentCounts.clear();
      return addAllEnvironmentCounts(elements);
    }

    /**
     * Adds elements to {@link DatabaseSummaryStatistics#environmentCounts() environmentCounts} list.
     * @param elements An iterable of environmentCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEnvironmentCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.environmentCounts.add(Objects.requireNonNull(element, "environmentCounts element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link DatabaseSummaryStatistics#vendorCounts() vendorCounts} list.
     * @param element A vendorCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addVendorCounts(Tally<String> element) {
      this.vendorCounts.add(Objects.requireNonNull(element, "vendorCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link DatabaseSummaryStatistics#vendorCounts() vendorCounts} list.
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
     * Sets or replaces all elements for {@link DatabaseSummaryStatistics#vendorCounts() vendorCounts} list.
     * @param elements An iterable of vendorCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("vendorCounts")
    public final Builder vendorCounts(Iterable<? extends Tally<String>> elements) {
      this.vendorCounts.clear();
      return addAllVendorCounts(elements);
    }

    /**
     * Adds elements to {@link DatabaseSummaryStatistics#vendorCounts() vendorCounts} list.
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
     * Adds one element to {@link DatabaseSummaryStatistics#endOfLifeStatusCounts() endOfLifeStatusCounts} list.
     * @param element A endOfLifeStatusCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEndOfLifeStatusCounts(Tally<String> element) {
      this.endOfLifeStatusCounts.add(Objects.requireNonNull(element, "endOfLifeStatusCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link DatabaseSummaryStatistics#endOfLifeStatusCounts() endOfLifeStatusCounts} list.
     * @param elements An array of endOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addEndOfLifeStatusCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.endOfLifeStatusCounts.add(Objects.requireNonNull(element, "endOfLifeStatusCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link DatabaseSummaryStatistics#endOfLifeStatusCounts() endOfLifeStatusCounts} list.
     * @param elements An iterable of endOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endOfLifeStatusCounts")
    public final Builder endOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
      this.endOfLifeStatusCounts.clear();
      return addAllEndOfLifeStatusCounts(elements);
    }

    /**
     * Adds elements to {@link DatabaseSummaryStatistics#endOfLifeStatusCounts() endOfLifeStatusCounts} list.
     * @param elements An iterable of endOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.endOfLifeStatusCounts.add(Objects.requireNonNull(element, "endOfLifeStatusCounts element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableDatabaseSummaryStatistics ImmutableDatabaseSummaryStatistics}.
     * @return An immutable instance of DatabaseSummaryStatistics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDatabaseSummaryStatistics build() {
      return new ImmutableDatabaseSummaryStatistics(
          createUnmodifiableList(true, environmentCounts),
          createUnmodifiableList(true, vendorCounts),
          createUnmodifiableList(true, endOfLifeStatusCounts));
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
