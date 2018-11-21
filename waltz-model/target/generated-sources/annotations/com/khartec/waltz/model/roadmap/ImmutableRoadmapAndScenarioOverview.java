package com.khartec.waltz.model.roadmap;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.scenario.Scenario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RoadmapAndScenarioOverview}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoadmapAndScenarioOverview.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RoadmapAndScenarioOverview"})
public final class ImmutableRoadmapAndScenarioOverview
    extends RoadmapAndScenarioOverview {
  private final Roadmap roadmap;
  private final Collection<Scenario> scenarios;

  private ImmutableRoadmapAndScenarioOverview(
      Roadmap roadmap,
      Collection<Scenario> scenarios) {
    this.roadmap = roadmap;
    this.scenarios = scenarios;
  }

  /**
   * @return The value of the {@code roadmap} attribute
   */
  @JsonProperty("roadmap")
  @Override
  public Roadmap roadmap() {
    return roadmap;
  }

  /**
   * @return The value of the {@code scenarios} attribute
   */
  @JsonProperty("scenarios")
  @Override
  public Collection<Scenario> scenarios() {
    return scenarios;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapAndScenarioOverview#roadmap() roadmap} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for roadmap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapAndScenarioOverview withRoadmap(Roadmap value) {
    if (this.roadmap == value) return this;
    Roadmap newValue = Objects.requireNonNull(value, "roadmap");
    return new ImmutableRoadmapAndScenarioOverview(newValue, this.scenarios);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoadmapAndScenarioOverview#scenarios() scenarios} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenarios
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoadmapAndScenarioOverview withScenarios(Collection<Scenario> value) {
    if (this.scenarios == value) return this;
    Collection<Scenario> newValue = Objects.requireNonNull(value, "scenarios");
    return new ImmutableRoadmapAndScenarioOverview(this.roadmap, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoadmapAndScenarioOverview} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoadmapAndScenarioOverview
        && equalTo((ImmutableRoadmapAndScenarioOverview) another);
  }

  private boolean equalTo(ImmutableRoadmapAndScenarioOverview another) {
    return roadmap.equals(another.roadmap)
        && scenarios.equals(another.scenarios);
  }

  /**
   * Computes a hash code from attributes: {@code roadmap}, {@code scenarios}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + roadmap.hashCode();
    h += (h << 5) + scenarios.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoadmapAndScenarioOverview} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RoadmapAndScenarioOverview{"
        + "roadmap=" + roadmap
        + ", scenarios=" + scenarios
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RoadmapAndScenarioOverview {
    Roadmap roadmap;
    Collection<Scenario> scenarios;
    @JsonProperty("roadmap")
    public void setRoadmap(Roadmap roadmap) {
      this.roadmap = roadmap;
    }
    @JsonProperty("scenarios")
    public void setScenarios(Collection<Scenario> scenarios) {
      this.scenarios = scenarios;
    }
    @Override
    public Roadmap roadmap() { throw new UnsupportedOperationException(); }
    @Override
    public Collection<Scenario> scenarios() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRoadmapAndScenarioOverview fromJson(Json json) {
    ImmutableRoadmapAndScenarioOverview.Builder builder = ImmutableRoadmapAndScenarioOverview.builder();
    if (json.roadmap != null) {
      builder.roadmap(json.roadmap);
    }
    if (json.scenarios != null) {
      builder.scenarios(json.scenarios);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoadmapAndScenarioOverview} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoadmapAndScenarioOverview instance
   */
  public static ImmutableRoadmapAndScenarioOverview copyOf(RoadmapAndScenarioOverview instance) {
    if (instance instanceof ImmutableRoadmapAndScenarioOverview) {
      return (ImmutableRoadmapAndScenarioOverview) instance;
    }
    return ImmutableRoadmapAndScenarioOverview.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoadmapAndScenarioOverview ImmutableRoadmapAndScenarioOverview}.
   * @return A new ImmutableRoadmapAndScenarioOverview builder
   */
  public static ImmutableRoadmapAndScenarioOverview.Builder builder() {
    return new ImmutableRoadmapAndScenarioOverview.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoadmapAndScenarioOverview ImmutableRoadmapAndScenarioOverview}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ROADMAP = 0x1L;
    private static final long INIT_BIT_SCENARIOS = 0x2L;
    private long initBits = 0x3L;

    private Roadmap roadmap;
    private Collection<Scenario> scenarios;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RoadmapAndScenarioOverview} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RoadmapAndScenarioOverview instance) {
      Objects.requireNonNull(instance, "instance");
      roadmap(instance.roadmap());
      scenarios(instance.scenarios());
      return this;
    }

    /**
     * Initializes the value for the {@link RoadmapAndScenarioOverview#roadmap() roadmap} attribute.
     * @param roadmap The value for roadmap 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("roadmap")
    public final Builder roadmap(Roadmap roadmap) {
      this.roadmap = Objects.requireNonNull(roadmap, "roadmap");
      initBits &= ~INIT_BIT_ROADMAP;
      return this;
    }

    /**
     * Initializes the value for the {@link RoadmapAndScenarioOverview#scenarios() scenarios} attribute.
     * @param scenarios The value for scenarios 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scenarios")
    public final Builder scenarios(Collection<Scenario> scenarios) {
      this.scenarios = Objects.requireNonNull(scenarios, "scenarios");
      initBits &= ~INIT_BIT_SCENARIOS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoadmapAndScenarioOverview ImmutableRoadmapAndScenarioOverview}.
     * @return An immutable instance of RoadmapAndScenarioOverview
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoadmapAndScenarioOverview build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoadmapAndScenarioOverview(roadmap, scenarios);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ROADMAP) != 0) attributes.add("roadmap");
      if ((initBits & INIT_BIT_SCENARIOS) != 0) attributes.add("scenarios");
      return "Cannot build RoadmapAndScenarioOverview, some of required attributes are not set " + attributes;
    }
  }
}
