package com.khartec.waltz.model.logical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.tally.TallyPack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LogicalFlowStatistics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogicalFlowStatistics.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LogicalFlowStatistics"})
public final class ImmutableLogicalFlowStatistics
    extends LogicalFlowStatistics {
  private final LogicalFlowMeasures appCounts;
  private final LogicalFlowMeasures flowCounts;
  private final List<TallyPack<String>> dataTypeCounts;

  private ImmutableLogicalFlowStatistics(
      LogicalFlowMeasures appCounts,
      LogicalFlowMeasures flowCounts,
      List<TallyPack<String>> dataTypeCounts) {
    this.appCounts = appCounts;
    this.flowCounts = flowCounts;
    this.dataTypeCounts = dataTypeCounts;
  }

  /**
   * @return The value of the {@code appCounts} attribute
   */
  @JsonProperty("appCounts")
  @Override
  public LogicalFlowMeasures appCounts() {
    return appCounts;
  }

  /**
   * @return The value of the {@code flowCounts} attribute
   */
  @JsonProperty("flowCounts")
  @Override
  public LogicalFlowMeasures flowCounts() {
    return flowCounts;
  }

  /**
   * @return The value of the {@code dataTypeCounts} attribute
   */
  @JsonProperty("dataTypeCounts")
  @Override
  public List<TallyPack<String>> dataTypeCounts() {
    return dataTypeCounts;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowStatistics#appCounts() appCounts} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appCounts
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowStatistics withAppCounts(LogicalFlowMeasures value) {
    if (this.appCounts == value) return this;
    LogicalFlowMeasures newValue = Objects.requireNonNull(value, "appCounts");
    return new ImmutableLogicalFlowStatistics(newValue, this.flowCounts, this.dataTypeCounts);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowStatistics#flowCounts() flowCounts} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for flowCounts
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowStatistics withFlowCounts(LogicalFlowMeasures value) {
    if (this.flowCounts == value) return this;
    LogicalFlowMeasures newValue = Objects.requireNonNull(value, "flowCounts");
    return new ImmutableLogicalFlowStatistics(this.appCounts, newValue, this.dataTypeCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LogicalFlowStatistics#dataTypeCounts() dataTypeCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableLogicalFlowStatistics withDataTypeCounts(TallyPack<String>... elements) {
    List<TallyPack<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableLogicalFlowStatistics(this.appCounts, this.flowCounts, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LogicalFlowStatistics#dataTypeCounts() dataTypeCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of dataTypeCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalFlowStatistics withDataTypeCounts(Iterable<? extends TallyPack<String>> elements) {
    if (this.dataTypeCounts == elements) return this;
    List<TallyPack<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableLogicalFlowStatistics(this.appCounts, this.flowCounts, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogicalFlowStatistics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogicalFlowStatistics
        && equalTo((ImmutableLogicalFlowStatistics) another);
  }

  private boolean equalTo(ImmutableLogicalFlowStatistics another) {
    return appCounts.equals(another.appCounts)
        && flowCounts.equals(another.flowCounts)
        && dataTypeCounts.equals(another.dataTypeCounts);
  }

  /**
   * Computes a hash code from attributes: {@code appCounts}, {@code flowCounts}, {@code dataTypeCounts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + appCounts.hashCode();
    h += (h << 5) + flowCounts.hashCode();
    h += (h << 5) + dataTypeCounts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LogicalFlowStatistics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "LogicalFlowStatistics{"
        + "appCounts=" + appCounts
        + ", flowCounts=" + flowCounts
        + ", dataTypeCounts=" + dataTypeCounts
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LogicalFlowStatistics {
    LogicalFlowMeasures appCounts;
    LogicalFlowMeasures flowCounts;
    List<TallyPack<String>> dataTypeCounts = Collections.emptyList();
    @JsonProperty("appCounts")
    public void setAppCounts(LogicalFlowMeasures appCounts) {
      this.appCounts = appCounts;
    }
    @JsonProperty("flowCounts")
    public void setFlowCounts(LogicalFlowMeasures flowCounts) {
      this.flowCounts = flowCounts;
    }
    @JsonProperty("dataTypeCounts")
    public void setDataTypeCounts(List<TallyPack<String>> dataTypeCounts) {
      this.dataTypeCounts = dataTypeCounts;
    }
    @Override
    public LogicalFlowMeasures appCounts() { throw new UnsupportedOperationException(); }
    @Override
    public LogicalFlowMeasures flowCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<TallyPack<String>> dataTypeCounts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLogicalFlowStatistics fromJson(Json json) {
    ImmutableLogicalFlowStatistics.Builder builder = ImmutableLogicalFlowStatistics.builder();
    if (json.appCounts != null) {
      builder.appCounts(json.appCounts);
    }
    if (json.flowCounts != null) {
      builder.flowCounts(json.flowCounts);
    }
    if (json.dataTypeCounts != null) {
      builder.addAllDataTypeCounts(json.dataTypeCounts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LogicalFlowStatistics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LogicalFlowStatistics instance
   */
  public static ImmutableLogicalFlowStatistics copyOf(LogicalFlowStatistics instance) {
    if (instance instanceof ImmutableLogicalFlowStatistics) {
      return (ImmutableLogicalFlowStatistics) instance;
    }
    return ImmutableLogicalFlowStatistics.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogicalFlowStatistics ImmutableLogicalFlowStatistics}.
   * @return A new ImmutableLogicalFlowStatistics builder
   */
  public static ImmutableLogicalFlowStatistics.Builder builder() {
    return new ImmutableLogicalFlowStatistics.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogicalFlowStatistics ImmutableLogicalFlowStatistics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APP_COUNTS = 0x1L;
    private static final long INIT_BIT_FLOW_COUNTS = 0x2L;
    private long initBits = 0x3L;

    private LogicalFlowMeasures appCounts;
    private LogicalFlowMeasures flowCounts;
    private List<TallyPack<String>> dataTypeCounts = new ArrayList<TallyPack<String>>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LogicalFlowStatistics} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LogicalFlowStatistics instance) {
      Objects.requireNonNull(instance, "instance");
      appCounts(instance.appCounts());
      flowCounts(instance.flowCounts());
      addAllDataTypeCounts(instance.dataTypeCounts());
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowStatistics#appCounts() appCounts} attribute.
     * @param appCounts The value for appCounts 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appCounts")
    public final Builder appCounts(LogicalFlowMeasures appCounts) {
      this.appCounts = Objects.requireNonNull(appCounts, "appCounts");
      initBits &= ~INIT_BIT_APP_COUNTS;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowStatistics#flowCounts() flowCounts} attribute.
     * @param flowCounts The value for flowCounts 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("flowCounts")
    public final Builder flowCounts(LogicalFlowMeasures flowCounts) {
      this.flowCounts = Objects.requireNonNull(flowCounts, "flowCounts");
      initBits &= ~INIT_BIT_FLOW_COUNTS;
      return this;
    }

    /**
     * Adds one element to {@link LogicalFlowStatistics#dataTypeCounts() dataTypeCounts} list.
     * @param element A dataTypeCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDataTypeCounts(TallyPack<String> element) {
      this.dataTypeCounts.add(Objects.requireNonNull(element, "dataTypeCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link LogicalFlowStatistics#dataTypeCounts() dataTypeCounts} list.
     * @param elements An array of dataTypeCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addDataTypeCounts(TallyPack<String>... elements) {
      for (TallyPack<String> element : elements) {
        this.dataTypeCounts.add(Objects.requireNonNull(element, "dataTypeCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LogicalFlowStatistics#dataTypeCounts() dataTypeCounts} list.
     * @param elements An iterable of dataTypeCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataTypeCounts")
    public final Builder dataTypeCounts(Iterable<? extends TallyPack<String>> elements) {
      this.dataTypeCounts.clear();
      return addAllDataTypeCounts(elements);
    }

    /**
     * Adds elements to {@link LogicalFlowStatistics#dataTypeCounts() dataTypeCounts} list.
     * @param elements An iterable of dataTypeCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDataTypeCounts(Iterable<? extends TallyPack<String>> elements) {
      for (TallyPack<String> element : elements) {
        this.dataTypeCounts.add(Objects.requireNonNull(element, "dataTypeCounts element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableLogicalFlowStatistics ImmutableLogicalFlowStatistics}.
     * @return An immutable instance of LogicalFlowStatistics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLogicalFlowStatistics build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLogicalFlowStatistics(appCounts, flowCounts, createUnmodifiableList(true, dataTypeCounts));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APP_COUNTS) != 0) attributes.add("appCounts");
      if ((initBits & INIT_BIT_FLOW_COUNTS) != 0) attributes.add("flowCounts");
      return "Cannot build LogicalFlowStatistics, some of required attributes are not set " + attributes;
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
