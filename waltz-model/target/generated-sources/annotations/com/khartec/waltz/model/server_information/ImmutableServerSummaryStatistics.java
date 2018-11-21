package com.khartec.waltz.model.server_information;

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
 * Immutable implementation of {@link ServerSummaryStatistics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableServerSummaryStatistics.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ServerSummaryStatistics"})
public final class ImmutableServerSummaryStatistics
    extends ServerSummaryStatistics {
  private final long virtualCount;
  private final long physicalCount;
  private final List<Tally<String>> environmentCounts;
  private final List<Tally<String>> operatingSystemCounts;
  private final List<Tally<String>> locationCounts;
  private final List<Tally<String>> operatingSystemEndOfLifeStatusCounts;
  private final List<Tally<String>> hardwareEndOfLifeStatusCounts;
  private final long totalCount;

  private ImmutableServerSummaryStatistics(ImmutableServerSummaryStatistics.Builder builder) {
    this.virtualCount = builder.virtualCount;
    this.physicalCount = builder.physicalCount;
    this.environmentCounts = createUnmodifiableList(true, builder.environmentCounts);
    this.operatingSystemCounts = createUnmodifiableList(true, builder.operatingSystemCounts);
    this.locationCounts = createUnmodifiableList(true, builder.locationCounts);
    this.operatingSystemEndOfLifeStatusCounts = createUnmodifiableList(true, builder.operatingSystemEndOfLifeStatusCounts);
    this.hardwareEndOfLifeStatusCounts = createUnmodifiableList(true, builder.hardwareEndOfLifeStatusCounts);
    this.totalCount = builder.totalCountIsSet()
        ? builder.totalCount
        : super.totalCount();
  }

  private ImmutableServerSummaryStatistics(
      long virtualCount,
      long physicalCount,
      List<Tally<String>> environmentCounts,
      List<Tally<String>> operatingSystemCounts,
      List<Tally<String>> locationCounts,
      List<Tally<String>> operatingSystemEndOfLifeStatusCounts,
      List<Tally<String>> hardwareEndOfLifeStatusCounts,
      long totalCount) {
    this.virtualCount = virtualCount;
    this.physicalCount = physicalCount;
    this.environmentCounts = environmentCounts;
    this.operatingSystemCounts = operatingSystemCounts;
    this.locationCounts = locationCounts;
    this.operatingSystemEndOfLifeStatusCounts = operatingSystemEndOfLifeStatusCounts;
    this.hardwareEndOfLifeStatusCounts = hardwareEndOfLifeStatusCounts;
    this.totalCount = totalCount;
  }

  /**
   * @return The value of the {@code virtualCount} attribute
   */
  @JsonProperty("virtualCount")
  @Override
  public long virtualCount() {
    return virtualCount;
  }

  /**
   * @return The value of the {@code physicalCount} attribute
   */
  @JsonProperty("physicalCount")
  @Override
  public long physicalCount() {
    return physicalCount;
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
   * @return The value of the {@code operatingSystemCounts} attribute
   */
  @JsonProperty("operatingSystemCounts")
  @Override
  public List<Tally<String>> operatingSystemCounts() {
    return operatingSystemCounts;
  }

  /**
   * @return The value of the {@code locationCounts} attribute
   */
  @JsonProperty("locationCounts")
  @Override
  public List<Tally<String>> locationCounts() {
    return locationCounts;
  }

  /**
   * @return The value of the {@code operatingSystemEndOfLifeStatusCounts} attribute
   */
  @JsonProperty("operatingSystemEndOfLifeStatusCounts")
  @Override
  public List<Tally<String>> operatingSystemEndOfLifeStatusCounts() {
    return operatingSystemEndOfLifeStatusCounts;
  }

  /**
   * @return The value of the {@code hardwareEndOfLifeStatusCounts} attribute
   */
  @JsonProperty("hardwareEndOfLifeStatusCounts")
  @Override
  public List<Tally<String>> hardwareEndOfLifeStatusCounts() {
    return hardwareEndOfLifeStatusCounts;
  }

  /**
   * @return The value of the {@code totalCount} attribute
   */
  @JsonProperty("totalCount")
  @Override
  public long totalCount() {
    return totalCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerSummaryStatistics#virtualCount() virtualCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for virtualCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerSummaryStatistics withVirtualCount(long value) {
    if (this.virtualCount == value) return this;
    return new ImmutableServerSummaryStatistics(
        value,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerSummaryStatistics#physicalCount() physicalCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for physicalCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerSummaryStatistics withPhysicalCount(long value) {
    if (this.physicalCount == value) return this;
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        value,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#environmentCounts() environmentCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableServerSummaryStatistics withEnvironmentCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        newValue,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#environmentCounts() environmentCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of environmentCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerSummaryStatistics withEnvironmentCounts(Iterable<? extends Tally<String>> elements) {
    if (this.environmentCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        newValue,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#operatingSystemCounts() operatingSystemCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableServerSummaryStatistics withOperatingSystemCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        newValue,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#operatingSystemCounts() operatingSystemCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of operatingSystemCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerSummaryStatistics withOperatingSystemCounts(Iterable<? extends Tally<String>> elements) {
    if (this.operatingSystemCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        newValue,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#locationCounts() locationCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableServerSummaryStatistics withLocationCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        newValue,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#locationCounts() locationCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of locationCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerSummaryStatistics withLocationCounts(Iterable<? extends Tally<String>> elements) {
    if (this.locationCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        newValue,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#operatingSystemEndOfLifeStatusCounts() operatingSystemEndOfLifeStatusCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableServerSummaryStatistics withOperatingSystemEndOfLifeStatusCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        newValue,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#operatingSystemEndOfLifeStatusCounts() operatingSystemEndOfLifeStatusCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of operatingSystemEndOfLifeStatusCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerSummaryStatistics withOperatingSystemEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
    if (this.operatingSystemEndOfLifeStatusCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        newValue,
        this.hardwareEndOfLifeStatusCounts,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#hardwareEndOfLifeStatusCounts() hardwareEndOfLifeStatusCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableServerSummaryStatistics withHardwareEndOfLifeStatusCounts(Tally<String>... elements) {
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        newValue,
        this.totalCount);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ServerSummaryStatistics#hardwareEndOfLifeStatusCounts() hardwareEndOfLifeStatusCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of hardwareEndOfLifeStatusCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerSummaryStatistics withHardwareEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
    if (this.hardwareEndOfLifeStatusCounts == elements) return this;
    List<Tally<String>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        newValue,
        this.totalCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerSummaryStatistics#totalCount() totalCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerSummaryStatistics withTotalCount(long value) {
    if (this.totalCount == value) return this;
    return new ImmutableServerSummaryStatistics(
        this.virtualCount,
        this.physicalCount,
        this.environmentCounts,
        this.operatingSystemCounts,
        this.locationCounts,
        this.operatingSystemEndOfLifeStatusCounts,
        this.hardwareEndOfLifeStatusCounts,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableServerSummaryStatistics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableServerSummaryStatistics
        && equalTo((ImmutableServerSummaryStatistics) another);
  }

  private boolean equalTo(ImmutableServerSummaryStatistics another) {
    return virtualCount == another.virtualCount
        && physicalCount == another.physicalCount
        && environmentCounts.equals(another.environmentCounts)
        && operatingSystemCounts.equals(another.operatingSystemCounts)
        && locationCounts.equals(another.locationCounts)
        && operatingSystemEndOfLifeStatusCounts.equals(another.operatingSystemEndOfLifeStatusCounts)
        && hardwareEndOfLifeStatusCounts.equals(another.hardwareEndOfLifeStatusCounts)
        && totalCount == another.totalCount;
  }

  /**
   * Computes a hash code from attributes: {@code virtualCount}, {@code physicalCount}, {@code environmentCounts}, {@code operatingSystemCounts}, {@code locationCounts}, {@code operatingSystemEndOfLifeStatusCounts}, {@code hardwareEndOfLifeStatusCounts}, {@code totalCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(virtualCount);
    h += (h << 5) + Long.hashCode(physicalCount);
    h += (h << 5) + environmentCounts.hashCode();
    h += (h << 5) + operatingSystemCounts.hashCode();
    h += (h << 5) + locationCounts.hashCode();
    h += (h << 5) + operatingSystemEndOfLifeStatusCounts.hashCode();
    h += (h << 5) + hardwareEndOfLifeStatusCounts.hashCode();
    h += (h << 5) + Long.hashCode(totalCount);
    return h;
  }

  /**
   * Prints the immutable value {@code ServerSummaryStatistics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ServerSummaryStatistics{"
        + "virtualCount=" + virtualCount
        + ", physicalCount=" + physicalCount
        + ", environmentCounts=" + environmentCounts
        + ", operatingSystemCounts=" + operatingSystemCounts
        + ", locationCounts=" + locationCounts
        + ", operatingSystemEndOfLifeStatusCounts=" + operatingSystemEndOfLifeStatusCounts
        + ", hardwareEndOfLifeStatusCounts=" + hardwareEndOfLifeStatusCounts
        + ", totalCount=" + totalCount
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ServerSummaryStatistics {
    long virtualCount;
    boolean virtualCountIsSet;
    long physicalCount;
    boolean physicalCountIsSet;
    List<Tally<String>> environmentCounts = Collections.emptyList();
    List<Tally<String>> operatingSystemCounts = Collections.emptyList();
    List<Tally<String>> locationCounts = Collections.emptyList();
    List<Tally<String>> operatingSystemEndOfLifeStatusCounts = Collections.emptyList();
    List<Tally<String>> hardwareEndOfLifeStatusCounts = Collections.emptyList();
    long totalCount;
    boolean totalCountIsSet;
    @JsonProperty("virtualCount")
    public void setVirtualCount(long virtualCount) {
      this.virtualCount = virtualCount;
      this.virtualCountIsSet = true;
    }
    @JsonProperty("physicalCount")
    public void setPhysicalCount(long physicalCount) {
      this.physicalCount = physicalCount;
      this.physicalCountIsSet = true;
    }
    @JsonProperty("environmentCounts")
    public void setEnvironmentCounts(List<Tally<String>> environmentCounts) {
      this.environmentCounts = environmentCounts;
    }
    @JsonProperty("operatingSystemCounts")
    public void setOperatingSystemCounts(List<Tally<String>> operatingSystemCounts) {
      this.operatingSystemCounts = operatingSystemCounts;
    }
    @JsonProperty("locationCounts")
    public void setLocationCounts(List<Tally<String>> locationCounts) {
      this.locationCounts = locationCounts;
    }
    @JsonProperty("operatingSystemEndOfLifeStatusCounts")
    public void setOperatingSystemEndOfLifeStatusCounts(List<Tally<String>> operatingSystemEndOfLifeStatusCounts) {
      this.operatingSystemEndOfLifeStatusCounts = operatingSystemEndOfLifeStatusCounts;
    }
    @JsonProperty("hardwareEndOfLifeStatusCounts")
    public void setHardwareEndOfLifeStatusCounts(List<Tally<String>> hardwareEndOfLifeStatusCounts) {
      this.hardwareEndOfLifeStatusCounts = hardwareEndOfLifeStatusCounts;
    }
    @JsonProperty("totalCount")
    public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
      this.totalCountIsSet = true;
    }
    @Override
    public long virtualCount() { throw new UnsupportedOperationException(); }
    @Override
    public long physicalCount() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> environmentCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> operatingSystemCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> locationCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> operatingSystemEndOfLifeStatusCounts() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<String>> hardwareEndOfLifeStatusCounts() { throw new UnsupportedOperationException(); }
    @Override
    public long totalCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableServerSummaryStatistics fromJson(Json json) {
    ImmutableServerSummaryStatistics.Builder builder = ImmutableServerSummaryStatistics.builder();
    if (json.virtualCountIsSet) {
      builder.virtualCount(json.virtualCount);
    }
    if (json.physicalCountIsSet) {
      builder.physicalCount(json.physicalCount);
    }
    if (json.environmentCounts != null) {
      builder.addAllEnvironmentCounts(json.environmentCounts);
    }
    if (json.operatingSystemCounts != null) {
      builder.addAllOperatingSystemCounts(json.operatingSystemCounts);
    }
    if (json.locationCounts != null) {
      builder.addAllLocationCounts(json.locationCounts);
    }
    if (json.operatingSystemEndOfLifeStatusCounts != null) {
      builder.addAllOperatingSystemEndOfLifeStatusCounts(json.operatingSystemEndOfLifeStatusCounts);
    }
    if (json.hardwareEndOfLifeStatusCounts != null) {
      builder.addAllHardwareEndOfLifeStatusCounts(json.hardwareEndOfLifeStatusCounts);
    }
    if (json.totalCountIsSet) {
      builder.totalCount(json.totalCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ServerSummaryStatistics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ServerSummaryStatistics instance
   */
  public static ImmutableServerSummaryStatistics copyOf(ServerSummaryStatistics instance) {
    if (instance instanceof ImmutableServerSummaryStatistics) {
      return (ImmutableServerSummaryStatistics) instance;
    }
    return ImmutableServerSummaryStatistics.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableServerSummaryStatistics ImmutableServerSummaryStatistics}.
   * @return A new ImmutableServerSummaryStatistics builder
   */
  public static ImmutableServerSummaryStatistics.Builder builder() {
    return new ImmutableServerSummaryStatistics.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableServerSummaryStatistics ImmutableServerSummaryStatistics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_VIRTUAL_COUNT = 0x1L;
    private static final long INIT_BIT_PHYSICAL_COUNT = 0x2L;
    private static final long OPT_BIT_TOTAL_COUNT = 0x1L;
    private long initBits = 0x3L;
    private long optBits;

    private long virtualCount;
    private long physicalCount;
    private List<Tally<String>> environmentCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> operatingSystemCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> locationCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> operatingSystemEndOfLifeStatusCounts = new ArrayList<Tally<String>>();
    private List<Tally<String>> hardwareEndOfLifeStatusCounts = new ArrayList<Tally<String>>();
    private long totalCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ServerSummaryStatistics} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ServerSummaryStatistics instance) {
      Objects.requireNonNull(instance, "instance");
      virtualCount(instance.virtualCount());
      physicalCount(instance.physicalCount());
      addAllEnvironmentCounts(instance.environmentCounts());
      addAllOperatingSystemCounts(instance.operatingSystemCounts());
      addAllLocationCounts(instance.locationCounts());
      addAllOperatingSystemEndOfLifeStatusCounts(instance.operatingSystemEndOfLifeStatusCounts());
      addAllHardwareEndOfLifeStatusCounts(instance.hardwareEndOfLifeStatusCounts());
      totalCount(instance.totalCount());
      return this;
    }

    /**
     * Initializes the value for the {@link ServerSummaryStatistics#virtualCount() virtualCount} attribute.
     * @param virtualCount The value for virtualCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("virtualCount")
    public final Builder virtualCount(long virtualCount) {
      this.virtualCount = virtualCount;
      initBits &= ~INIT_BIT_VIRTUAL_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerSummaryStatistics#physicalCount() physicalCount} attribute.
     * @param physicalCount The value for physicalCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("physicalCount")
    public final Builder physicalCount(long physicalCount) {
      this.physicalCount = physicalCount;
      initBits &= ~INIT_BIT_PHYSICAL_COUNT;
      return this;
    }

    /**
     * Adds one element to {@link ServerSummaryStatistics#environmentCounts() environmentCounts} list.
     * @param element A environmentCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEnvironmentCounts(Tally<String> element) {
      this.environmentCounts.add(Objects.requireNonNull(element, "environmentCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#environmentCounts() environmentCounts} list.
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
     * Sets or replaces all elements for {@link ServerSummaryStatistics#environmentCounts() environmentCounts} list.
     * @param elements An iterable of environmentCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("environmentCounts")
    public final Builder environmentCounts(Iterable<? extends Tally<String>> elements) {
      this.environmentCounts.clear();
      return addAllEnvironmentCounts(elements);
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#environmentCounts() environmentCounts} list.
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
     * Adds one element to {@link ServerSummaryStatistics#operatingSystemCounts() operatingSystemCounts} list.
     * @param element A operatingSystemCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOperatingSystemCounts(Tally<String> element) {
      this.operatingSystemCounts.add(Objects.requireNonNull(element, "operatingSystemCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#operatingSystemCounts() operatingSystemCounts} list.
     * @param elements An array of operatingSystemCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addOperatingSystemCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.operatingSystemCounts.add(Objects.requireNonNull(element, "operatingSystemCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ServerSummaryStatistics#operatingSystemCounts() operatingSystemCounts} list.
     * @param elements An iterable of operatingSystemCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operatingSystemCounts")
    public final Builder operatingSystemCounts(Iterable<? extends Tally<String>> elements) {
      this.operatingSystemCounts.clear();
      return addAllOperatingSystemCounts(elements);
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#operatingSystemCounts() operatingSystemCounts} list.
     * @param elements An iterable of operatingSystemCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOperatingSystemCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.operatingSystemCounts.add(Objects.requireNonNull(element, "operatingSystemCounts element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link ServerSummaryStatistics#locationCounts() locationCounts} list.
     * @param element A locationCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLocationCounts(Tally<String> element) {
      this.locationCounts.add(Objects.requireNonNull(element, "locationCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#locationCounts() locationCounts} list.
     * @param elements An array of locationCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addLocationCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.locationCounts.add(Objects.requireNonNull(element, "locationCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ServerSummaryStatistics#locationCounts() locationCounts} list.
     * @param elements An iterable of locationCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationCounts")
    public final Builder locationCounts(Iterable<? extends Tally<String>> elements) {
      this.locationCounts.clear();
      return addAllLocationCounts(elements);
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#locationCounts() locationCounts} list.
     * @param elements An iterable of locationCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllLocationCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.locationCounts.add(Objects.requireNonNull(element, "locationCounts element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link ServerSummaryStatistics#operatingSystemEndOfLifeStatusCounts() operatingSystemEndOfLifeStatusCounts} list.
     * @param element A operatingSystemEndOfLifeStatusCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOperatingSystemEndOfLifeStatusCounts(Tally<String> element) {
      this.operatingSystemEndOfLifeStatusCounts.add(Objects.requireNonNull(element, "operatingSystemEndOfLifeStatusCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#operatingSystemEndOfLifeStatusCounts() operatingSystemEndOfLifeStatusCounts} list.
     * @param elements An array of operatingSystemEndOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addOperatingSystemEndOfLifeStatusCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.operatingSystemEndOfLifeStatusCounts.add(Objects.requireNonNull(element, "operatingSystemEndOfLifeStatusCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ServerSummaryStatistics#operatingSystemEndOfLifeStatusCounts() operatingSystemEndOfLifeStatusCounts} list.
     * @param elements An iterable of operatingSystemEndOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operatingSystemEndOfLifeStatusCounts")
    public final Builder operatingSystemEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
      this.operatingSystemEndOfLifeStatusCounts.clear();
      return addAllOperatingSystemEndOfLifeStatusCounts(elements);
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#operatingSystemEndOfLifeStatusCounts() operatingSystemEndOfLifeStatusCounts} list.
     * @param elements An iterable of operatingSystemEndOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOperatingSystemEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.operatingSystemEndOfLifeStatusCounts.add(Objects.requireNonNull(element, "operatingSystemEndOfLifeStatusCounts element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link ServerSummaryStatistics#hardwareEndOfLifeStatusCounts() hardwareEndOfLifeStatusCounts} list.
     * @param element A hardwareEndOfLifeStatusCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addHardwareEndOfLifeStatusCounts(Tally<String> element) {
      this.hardwareEndOfLifeStatusCounts.add(Objects.requireNonNull(element, "hardwareEndOfLifeStatusCounts element"));
      return this;
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#hardwareEndOfLifeStatusCounts() hardwareEndOfLifeStatusCounts} list.
     * @param elements An array of hardwareEndOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder addHardwareEndOfLifeStatusCounts(Tally<String>... elements) {
      for (Tally<String> element : elements) {
        this.hardwareEndOfLifeStatusCounts.add(Objects.requireNonNull(element, "hardwareEndOfLifeStatusCounts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ServerSummaryStatistics#hardwareEndOfLifeStatusCounts() hardwareEndOfLifeStatusCounts} list.
     * @param elements An iterable of hardwareEndOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hardwareEndOfLifeStatusCounts")
    public final Builder hardwareEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
      this.hardwareEndOfLifeStatusCounts.clear();
      return addAllHardwareEndOfLifeStatusCounts(elements);
    }

    /**
     * Adds elements to {@link ServerSummaryStatistics#hardwareEndOfLifeStatusCounts() hardwareEndOfLifeStatusCounts} list.
     * @param elements An iterable of hardwareEndOfLifeStatusCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllHardwareEndOfLifeStatusCounts(Iterable<? extends Tally<String>> elements) {
      for (Tally<String> element : elements) {
        this.hardwareEndOfLifeStatusCounts.add(Objects.requireNonNull(element, "hardwareEndOfLifeStatusCounts element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link ServerSummaryStatistics#totalCount() totalCount} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ServerSummaryStatistics#totalCount() totalCount}.</em>
     * @param totalCount The value for totalCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("totalCount")
    public final Builder totalCount(long totalCount) {
      this.totalCount = totalCount;
      optBits |= OPT_BIT_TOTAL_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableServerSummaryStatistics ImmutableServerSummaryStatistics}.
     * @return An immutable instance of ServerSummaryStatistics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableServerSummaryStatistics build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableServerSummaryStatistics(this);
    }

    private boolean totalCountIsSet() {
      return (optBits & OPT_BIT_TOTAL_COUNT) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_VIRTUAL_COUNT) != 0) attributes.add("virtualCount");
      if ((initBits & INIT_BIT_PHYSICAL_COUNT) != 0) attributes.add("physicalCount");
      return "Cannot build ServerSummaryStatistics, some of required attributes are not set " + attributes;
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
