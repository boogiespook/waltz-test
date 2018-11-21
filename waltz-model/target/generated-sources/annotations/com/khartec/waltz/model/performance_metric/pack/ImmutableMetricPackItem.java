package com.khartec.waltz.model.performance_metric.pack;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.checkpoint.CheckpointGoal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MetricPackItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMetricPackItem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MetricPackItem"})
public final class ImmutableMetricPackItem
    extends MetricPackItem {
  private final long definitionId;
  private final String sectionName;
  private final double baseLine;
  private final List<CheckpointGoal> goals;
  private final Long id;

  private ImmutableMetricPackItem(
      long definitionId,
      String sectionName,
      double baseLine,
      List<CheckpointGoal> goals,
      Long id) {
    this.definitionId = definitionId;
    this.sectionName = sectionName;
    this.baseLine = baseLine;
    this.goals = goals;
    this.id = id;
  }

  /**
   * @return The value of the {@code definitionId} attribute
   */
  @JsonProperty("definitionId")
  @Override
  public long definitionId() {
    return definitionId;
  }

  /**
   * @return The value of the {@code sectionName} attribute
   */
  @JsonProperty("sectionName")
  @Override
  public String sectionName() {
    return sectionName;
  }

  /**
   * @return The value of the {@code baseLine} attribute
   */
  @JsonProperty("baseLine")
  @Override
  public double baseLine() {
    return baseLine;
  }

  /**
   * @return The value of the {@code goals} attribute
   */
  @JsonProperty("goals")
  @Override
  public List<CheckpointGoal> goals() {
    return goals;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricPackItem#definitionId() definitionId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for definitionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricPackItem withDefinitionId(long value) {
    if (this.definitionId == value) return this;
    return new ImmutableMetricPackItem(value, this.sectionName, this.baseLine, this.goals, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricPackItem#sectionName() sectionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sectionName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricPackItem withSectionName(String value) {
    if (this.sectionName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "sectionName");
    return new ImmutableMetricPackItem(this.definitionId, newValue, this.baseLine, this.goals, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricPackItem#baseLine() baseLine} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for baseLine
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricPackItem withBaseLine(double value) {
    if (Double.doubleToLongBits(this.baseLine) == Double.doubleToLongBits(value)) return this;
    return new ImmutableMetricPackItem(this.definitionId, this.sectionName, value, this.goals, this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPackItem#goals() goals}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPackItem withGoals(CheckpointGoal... elements) {
    List<CheckpointGoal> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMetricPackItem(this.definitionId, this.sectionName, this.baseLine, newValue, this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPackItem#goals() goals}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of goals elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPackItem withGoals(Iterable<? extends CheckpointGoal> elements) {
    if (this.goals == elements) return this;
    List<CheckpointGoal> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMetricPackItem(this.definitionId, this.sectionName, this.baseLine, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MetricPackItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPackItem withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMetricPackItem(this.definitionId, this.sectionName, this.baseLine, this.goals, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MetricPackItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPackItem withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMetricPackItem(this.definitionId, this.sectionName, this.baseLine, this.goals, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMetricPackItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMetricPackItem
        && equalTo((ImmutableMetricPackItem) another);
  }

  private boolean equalTo(ImmutableMetricPackItem another) {
    return definitionId == another.definitionId
        && sectionName.equals(another.sectionName)
        && Double.doubleToLongBits(baseLine) == Double.doubleToLongBits(another.baseLine)
        && goals.equals(another.goals)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code definitionId}, {@code sectionName}, {@code baseLine}, {@code goals}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(definitionId);
    h += (h << 5) + sectionName.hashCode();
    h += (h << 5) + Double.hashCode(baseLine);
    h += (h << 5) + goals.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MetricPackItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MetricPackItem{");
    builder.append("definitionId=").append(definitionId);
    builder.append(", ");
    builder.append("sectionName=").append(sectionName);
    builder.append(", ");
    builder.append("baseLine=").append(baseLine);
    builder.append(", ");
    builder.append("goals=").append(goals);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends MetricPackItem {
    long definitionId;
    boolean definitionIdIsSet;
    String sectionName;
    double baseLine;
    boolean baseLineIsSet;
    List<CheckpointGoal> goals = Collections.emptyList();
    Optional<Long> id = Optional.empty();
    @JsonProperty("definitionId")
    public void setDefinitionId(long definitionId) {
      this.definitionId = definitionId;
      this.definitionIdIsSet = true;
    }
    @JsonProperty("sectionName")
    public void setSectionName(String sectionName) {
      this.sectionName = sectionName;
    }
    @JsonProperty("baseLine")
    public void setBaseLine(double baseLine) {
      this.baseLine = baseLine;
      this.baseLineIsSet = true;
    }
    @JsonProperty("goals")
    public void setGoals(List<CheckpointGoal> goals) {
      this.goals = goals;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public long definitionId() { throw new UnsupportedOperationException(); }
    @Override
    public String sectionName() { throw new UnsupportedOperationException(); }
    @Override
    public double baseLine() { throw new UnsupportedOperationException(); }
    @Override
    public List<CheckpointGoal> goals() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMetricPackItem fromJson(Json json) {
    ImmutableMetricPackItem.Builder builder = ImmutableMetricPackItem.builder();
    if (json.definitionIdIsSet) {
      builder.definitionId(json.definitionId);
    }
    if (json.sectionName != null) {
      builder.sectionName(json.sectionName);
    }
    if (json.baseLineIsSet) {
      builder.baseLine(json.baseLine);
    }
    if (json.goals != null) {
      builder.addAllGoals(json.goals);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MetricPackItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MetricPackItem instance
   */
  public static ImmutableMetricPackItem copyOf(MetricPackItem instance) {
    if (instance instanceof ImmutableMetricPackItem) {
      return (ImmutableMetricPackItem) instance;
    }
    return ImmutableMetricPackItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMetricPackItem ImmutableMetricPackItem}.
   * @return A new ImmutableMetricPackItem builder
   */
  public static ImmutableMetricPackItem.Builder builder() {
    return new ImmutableMetricPackItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMetricPackItem ImmutableMetricPackItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DEFINITION_ID = 0x1L;
    private static final long INIT_BIT_SECTION_NAME = 0x2L;
    private static final long INIT_BIT_BASE_LINE = 0x4L;
    private long initBits = 0x7L;

    private long definitionId;
    private String sectionName;
    private double baseLine;
    private List<CheckpointGoal> goals = new ArrayList<CheckpointGoal>();
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.performance_metric.pack.MetricPackItem} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MetricPackItem instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof MetricPackItem) {
        MetricPackItem instance = (MetricPackItem) object;
        sectionName(instance.sectionName());
        baseLine(instance.baseLine());
        definitionId(instance.definitionId());
        addAllGoals(instance.goals());
      }
    }

    /**
     * Initializes the value for the {@link MetricPackItem#definitionId() definitionId} attribute.
     * @param definitionId The value for definitionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionId")
    public final Builder definitionId(long definitionId) {
      this.definitionId = definitionId;
      initBits &= ~INIT_BIT_DEFINITION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MetricPackItem#sectionName() sectionName} attribute.
     * @param sectionName The value for sectionName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sectionName")
    public final Builder sectionName(String sectionName) {
      this.sectionName = Objects.requireNonNull(sectionName, "sectionName");
      initBits &= ~INIT_BIT_SECTION_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link MetricPackItem#baseLine() baseLine} attribute.
     * @param baseLine The value for baseLine 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("baseLine")
    public final Builder baseLine(double baseLine) {
      this.baseLine = baseLine;
      initBits &= ~INIT_BIT_BASE_LINE;
      return this;
    }

    /**
     * Adds one element to {@link MetricPackItem#goals() goals} list.
     * @param element A goals element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGoals(CheckpointGoal element) {
      this.goals.add(Objects.requireNonNull(element, "goals element"));
      return this;
    }

    /**
     * Adds elements to {@link MetricPackItem#goals() goals} list.
     * @param elements An array of goals elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGoals(CheckpointGoal... elements) {
      for (CheckpointGoal element : elements) {
        this.goals.add(Objects.requireNonNull(element, "goals element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MetricPackItem#goals() goals} list.
     * @param elements An iterable of goals elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("goals")
    public final Builder goals(Iterable<? extends CheckpointGoal> elements) {
      this.goals.clear();
      return addAllGoals(elements);
    }

    /**
     * Adds elements to {@link MetricPackItem#goals() goals} list.
     * @param elements An iterable of goals elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGoals(Iterable<? extends CheckpointGoal> elements) {
      for (CheckpointGoal element : elements) {
        this.goals.add(Objects.requireNonNull(element, "goals element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MetricPackItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link MetricPackItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableMetricPackItem ImmutableMetricPackItem}.
     * @return An immutable instance of MetricPackItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMetricPackItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMetricPackItem(definitionId, sectionName, baseLine, createUnmodifiableList(true, goals), id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DEFINITION_ID) != 0) attributes.add("definitionId");
      if ((initBits & INIT_BIT_SECTION_NAME) != 0) attributes.add("sectionName");
      if ((initBits & INIT_BIT_BASE_LINE) != 0) attributes.add("baseLine");
      return "Cannot build MetricPackItem, some of required attributes are not set " + attributes;
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
