package com.khartec.waltz.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.roadmap.Roadmap;
import com.khartec.waltz.model.scenario.Scenario;
import com.khartec.waltz.model.scenario.ScenarioAxisItem;
import com.khartec.waltz.model.scenario.ScenarioRatingItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link FullScenario}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFullScenario.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FullScenario"})
public final class ImmutableFullScenario extends FullScenario {
  private final Roadmap roadmap;
  private final Scenario scenario;
  private final Collection<ScenarioAxisItem> axisDefinitions;
  private final Collection<ScenarioRatingItem> ratings;

  private ImmutableFullScenario(
      Roadmap roadmap,
      Scenario scenario,
      Collection<ScenarioAxisItem> axisDefinitions,
      Collection<ScenarioRatingItem> ratings) {
    this.roadmap = roadmap;
    this.scenario = scenario;
    this.axisDefinitions = axisDefinitions;
    this.ratings = ratings;
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
   * @return The value of the {@code scenario} attribute
   */
  @JsonProperty("scenario")
  @Override
  public Scenario scenario() {
    return scenario;
  }

  /**
   * @return The value of the {@code axisDefinitions} attribute
   */
  @JsonProperty("axisDefinitions")
  @Override
  public Collection<ScenarioAxisItem> axisDefinitions() {
    return axisDefinitions;
  }

  /**
   * @return The value of the {@code ratings} attribute
   */
  @JsonProperty("ratings")
  @Override
  public Collection<ScenarioRatingItem> ratings() {
    return ratings;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FullScenario#roadmap() roadmap} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for roadmap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFullScenario withRoadmap(Roadmap value) {
    if (this.roadmap == value) return this;
    Roadmap newValue = Objects.requireNonNull(value, "roadmap");
    return new ImmutableFullScenario(newValue, this.scenario, this.axisDefinitions, this.ratings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FullScenario#scenario() scenario} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenario
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFullScenario withScenario(Scenario value) {
    if (this.scenario == value) return this;
    Scenario newValue = Objects.requireNonNull(value, "scenario");
    return new ImmutableFullScenario(this.roadmap, newValue, this.axisDefinitions, this.ratings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FullScenario#axisDefinitions() axisDefinitions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for axisDefinitions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFullScenario withAxisDefinitions(Collection<ScenarioAxisItem> value) {
    if (this.axisDefinitions == value) return this;
    Collection<ScenarioAxisItem> newValue = Objects.requireNonNull(value, "axisDefinitions");
    return new ImmutableFullScenario(this.roadmap, this.scenario, newValue, this.ratings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FullScenario#ratings() ratings} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratings
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFullScenario withRatings(Collection<ScenarioRatingItem> value) {
    if (this.ratings == value) return this;
    Collection<ScenarioRatingItem> newValue = Objects.requireNonNull(value, "ratings");
    return new ImmutableFullScenario(this.roadmap, this.scenario, this.axisDefinitions, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFullScenario} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFullScenario
        && equalTo((ImmutableFullScenario) another);
  }

  private boolean equalTo(ImmutableFullScenario another) {
    return roadmap.equals(another.roadmap)
        && scenario.equals(another.scenario)
        && axisDefinitions.equals(another.axisDefinitions)
        && ratings.equals(another.ratings);
  }

  /**
   * Computes a hash code from attributes: {@code roadmap}, {@code scenario}, {@code axisDefinitions}, {@code ratings}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + roadmap.hashCode();
    h += (h << 5) + scenario.hashCode();
    h += (h << 5) + axisDefinitions.hashCode();
    h += (h << 5) + ratings.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code FullScenario} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "FullScenario{"
        + "roadmap=" + roadmap
        + ", scenario=" + scenario
        + ", axisDefinitions=" + axisDefinitions
        + ", ratings=" + ratings
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends FullScenario {
    Roadmap roadmap;
    Scenario scenario;
    Collection<ScenarioAxisItem> axisDefinitions;
    Collection<ScenarioRatingItem> ratings;
    @JsonProperty("roadmap")
    public void setRoadmap(Roadmap roadmap) {
      this.roadmap = roadmap;
    }
    @JsonProperty("scenario")
    public void setScenario(Scenario scenario) {
      this.scenario = scenario;
    }
    @JsonProperty("axisDefinitions")
    public void setAxisDefinitions(Collection<ScenarioAxisItem> axisDefinitions) {
      this.axisDefinitions = axisDefinitions;
    }
    @JsonProperty("ratings")
    public void setRatings(Collection<ScenarioRatingItem> ratings) {
      this.ratings = ratings;
    }
    @Override
    public Roadmap roadmap() { throw new UnsupportedOperationException(); }
    @Override
    public Scenario scenario() { throw new UnsupportedOperationException(); }
    @Override
    public Collection<ScenarioAxisItem> axisDefinitions() { throw new UnsupportedOperationException(); }
    @Override
    public Collection<ScenarioRatingItem> ratings() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFullScenario fromJson(Json json) {
    ImmutableFullScenario.Builder builder = ImmutableFullScenario.builder();
    if (json.roadmap != null) {
      builder.roadmap(json.roadmap);
    }
    if (json.scenario != null) {
      builder.scenario(json.scenario);
    }
    if (json.axisDefinitions != null) {
      builder.axisDefinitions(json.axisDefinitions);
    }
    if (json.ratings != null) {
      builder.ratings(json.ratings);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FullScenario} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FullScenario instance
   */
  public static ImmutableFullScenario copyOf(FullScenario instance) {
    if (instance instanceof ImmutableFullScenario) {
      return (ImmutableFullScenario) instance;
    }
    return ImmutableFullScenario.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFullScenario ImmutableFullScenario}.
   * @return A new ImmutableFullScenario builder
   */
  public static ImmutableFullScenario.Builder builder() {
    return new ImmutableFullScenario.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFullScenario ImmutableFullScenario}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ROADMAP = 0x1L;
    private static final long INIT_BIT_SCENARIO = 0x2L;
    private static final long INIT_BIT_AXIS_DEFINITIONS = 0x4L;
    private static final long INIT_BIT_RATINGS = 0x8L;
    private long initBits = 0xfL;

    private Roadmap roadmap;
    private Scenario scenario;
    private Collection<ScenarioAxisItem> axisDefinitions;
    private Collection<ScenarioRatingItem> ratings;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FullScenario} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FullScenario instance) {
      Objects.requireNonNull(instance, "instance");
      roadmap(instance.roadmap());
      scenario(instance.scenario());
      axisDefinitions(instance.axisDefinitions());
      ratings(instance.ratings());
      return this;
    }

    /**
     * Initializes the value for the {@link FullScenario#roadmap() roadmap} attribute.
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
     * Initializes the value for the {@link FullScenario#scenario() scenario} attribute.
     * @param scenario The value for scenario 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scenario")
    public final Builder scenario(Scenario scenario) {
      this.scenario = Objects.requireNonNull(scenario, "scenario");
      initBits &= ~INIT_BIT_SCENARIO;
      return this;
    }

    /**
     * Initializes the value for the {@link FullScenario#axisDefinitions() axisDefinitions} attribute.
     * @param axisDefinitions The value for axisDefinitions 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("axisDefinitions")
    public final Builder axisDefinitions(Collection<ScenarioAxisItem> axisDefinitions) {
      this.axisDefinitions = Objects.requireNonNull(axisDefinitions, "axisDefinitions");
      initBits &= ~INIT_BIT_AXIS_DEFINITIONS;
      return this;
    }

    /**
     * Initializes the value for the {@link FullScenario#ratings() ratings} attribute.
     * @param ratings The value for ratings 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratings")
    public final Builder ratings(Collection<ScenarioRatingItem> ratings) {
      this.ratings = Objects.requireNonNull(ratings, "ratings");
      initBits &= ~INIT_BIT_RATINGS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFullScenario ImmutableFullScenario}.
     * @return An immutable instance of FullScenario
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFullScenario build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFullScenario(roadmap, scenario, axisDefinitions, ratings);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ROADMAP) != 0) attributes.add("roadmap");
      if ((initBits & INIT_BIT_SCENARIO) != 0) attributes.add("scenario");
      if ((initBits & INIT_BIT_AXIS_DEFINITIONS) != 0) attributes.add("axisDefinitions");
      if ((initBits & INIT_BIT_RATINGS) != 0) attributes.add("ratings");
      return "Cannot build FullScenario, some of required attributes are not set " + attributes;
    }
  }
}
