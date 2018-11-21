package com.khartec.waltz.jobs.tools.importers;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.khartec.waltz.model.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ScenarioRatingRow}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableScenarioRatingRow.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ScenarioRatingRow"})
@Immutable
public final class ImmutableScenarioRatingRow extends ScenarioRatingRow {
  private final String roadmap;
  private final String scenario;
  private final String column;
  private final String row;
  private final String assetCode;
  private final String rating;
  private final @Nullable String description;
  private final String providedBy;

  private ImmutableScenarioRatingRow(
      String roadmap,
      String scenario,
      String column,
      String row,
      String assetCode,
      String rating,
      @Nullable String description,
      String providedBy) {
    this.roadmap = roadmap;
    this.scenario = scenario;
    this.column = column;
    this.row = row;
    this.assetCode = assetCode;
    this.rating = rating;
    this.description = description;
    this.providedBy = providedBy;
  }

  /**
   * @return The value of the {@code roadmap} attribute
   */
  @Override
  public String roadmap() {
    return roadmap;
  }

  /**
   * @return The value of the {@code scenario} attribute
   */
  @Override
  public String scenario() {
    return scenario;
  }

  /**
   * @return The value of the {@code column} attribute
   */
  @Override
  public String column() {
    return column;
  }

  /**
   * @return The value of the {@code row} attribute
   */
  @Override
  public String row() {
    return row;
  }

  /**
   * @return The value of the {@code assetCode} attribute
   */
  @Override
  public String assetCode() {
    return assetCode;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @Override
  public String rating() {
    return rating;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * @return The value of the {@code providedBy} attribute
   */
  @Override
  public String providedBy() {
    return providedBy;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#roadmap() roadmap} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for roadmap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withRoadmap(String value) {
    if (this.roadmap.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "roadmap");
    return new ImmutableScenarioRatingRow(
        newValue,
        this.scenario,
        this.column,
        this.row,
        this.assetCode,
        this.rating,
        this.description,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#scenario() scenario} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenario
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withScenario(String value) {
    if (this.scenario.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "scenario");
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        newValue,
        this.column,
        this.row,
        this.assetCode,
        this.rating,
        this.description,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#column() column} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for column
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withColumn(String value) {
    if (this.column.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "column");
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        this.scenario,
        newValue,
        this.row,
        this.assetCode,
        this.rating,
        this.description,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#row() row} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for row
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withRow(String value) {
    if (this.row.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "row");
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        this.scenario,
        this.column,
        newValue,
        this.assetCode,
        this.rating,
        this.description,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#assetCode() assetCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assetCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withAssetCode(String value) {
    if (this.assetCode.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "assetCode");
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        this.scenario,
        this.column,
        this.row,
        newValue,
        this.rating,
        this.description,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#rating() rating} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withRating(String value) {
    if (this.rating.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        this.scenario,
        this.column,
        this.row,
        this.assetCode,
        newValue,
        this.description,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        this.scenario,
        this.column,
        this.row,
        this.assetCode,
        this.rating,
        value,
        this.providedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingRow#providedBy() providedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for providedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingRow withProvidedBy(String value) {
    if (this.providedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "providedBy");
    return new ImmutableScenarioRatingRow(
        this.roadmap,
        this.scenario,
        this.column,
        this.row,
        this.assetCode,
        this.rating,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableScenarioRatingRow} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableScenarioRatingRow
        && equalTo((ImmutableScenarioRatingRow) another);
  }

  private boolean equalTo(ImmutableScenarioRatingRow another) {
    return roadmap.equals(another.roadmap)
        && scenario.equals(another.scenario)
        && column.equals(another.column)
        && row.equals(another.row)
        && assetCode.equals(another.assetCode)
        && rating.equals(another.rating)
        && Objects.equals(description, another.description)
        && providedBy.equals(another.providedBy);
  }

  /**
   * Computes a hash code from attributes: {@code roadmap}, {@code scenario}, {@code column}, {@code row}, {@code assetCode}, {@code rating}, {@code description}, {@code providedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + roadmap.hashCode();
    h += (h << 5) + scenario.hashCode();
    h += (h << 5) + column.hashCode();
    h += (h << 5) + row.hashCode();
    h += (h << 5) + assetCode.hashCode();
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + providedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ScenarioRatingRow} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ScenarioRatingRow")
        .omitNullValues()
        .add("roadmap", roadmap)
        .add("scenario", scenario)
        .add("column", column)
        .add("row", row)
        .add("assetCode", assetCode)
        .add("rating", rating)
        .add("description", description)
        .add("providedBy", providedBy)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ScenarioRatingRow} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ScenarioRatingRow instance
   */
  public static ImmutableScenarioRatingRow copyOf(ScenarioRatingRow instance) {
    if (instance instanceof ImmutableScenarioRatingRow) {
      return (ImmutableScenarioRatingRow) instance;
    }
    return ImmutableScenarioRatingRow.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableScenarioRatingRow ImmutableScenarioRatingRow}.
   * @return A new ImmutableScenarioRatingRow builder
   */
  public static ImmutableScenarioRatingRow.Builder builder() {
    return new ImmutableScenarioRatingRow.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableScenarioRatingRow ImmutableScenarioRatingRow}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ROADMAP = 0x1L;
    private static final long INIT_BIT_SCENARIO = 0x2L;
    private static final long INIT_BIT_COLUMN = 0x4L;
    private static final long INIT_BIT_ROW = 0x8L;
    private static final long INIT_BIT_ASSET_CODE = 0x10L;
    private static final long INIT_BIT_RATING = 0x20L;
    private static final long INIT_BIT_PROVIDED_BY = 0x40L;
    private long initBits = 0x7fL;

    private @javax.annotation.Nullable String roadmap;
    private @javax.annotation.Nullable String scenario;
    private @javax.annotation.Nullable String column;
    private @javax.annotation.Nullable String row;
    private @javax.annotation.Nullable String assetCode;
    private @javax.annotation.Nullable String rating;
    private @javax.annotation.Nullable String description;
    private @javax.annotation.Nullable String providedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ScenarioRatingRow} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ScenarioRatingRow instance) {
      Objects.requireNonNull(instance, "instance");
      roadmap(instance.roadmap());
      scenario(instance.scenario());
      column(instance.column());
      row(instance.row());
      assetCode(instance.assetCode());
      rating(instance.rating());
      @Nullable String descriptionValue = instance.description();
      if (descriptionValue != null) {
        description(descriptionValue);
      }
      providedBy(instance.providedBy());
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#roadmap() roadmap} attribute.
     * @param roadmap The value for roadmap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roadmap(String roadmap) {
      this.roadmap = Objects.requireNonNull(roadmap, "roadmap");
      initBits &= ~INIT_BIT_ROADMAP;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#scenario() scenario} attribute.
     * @param scenario The value for scenario 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder scenario(String scenario) {
      this.scenario = Objects.requireNonNull(scenario, "scenario");
      initBits &= ~INIT_BIT_SCENARIO;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#column() column} attribute.
     * @param column The value for column 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder column(String column) {
      this.column = Objects.requireNonNull(column, "column");
      initBits &= ~INIT_BIT_COLUMN;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#row() row} attribute.
     * @param row The value for row 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder row(String row) {
      this.row = Objects.requireNonNull(row, "row");
      initBits &= ~INIT_BIT_ROW;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#assetCode() assetCode} attribute.
     * @param assetCode The value for assetCode 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder assetCode(String assetCode) {
      this.assetCode = Objects.requireNonNull(assetCode, "assetCode");
      initBits &= ~INIT_BIT_ASSET_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rating(String rating) {
      this.rating = Objects.requireNonNull(rating, "rating");
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingRow#providedBy() providedBy} attribute.
     * @param providedBy The value for providedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder providedBy(String providedBy) {
      this.providedBy = Objects.requireNonNull(providedBy, "providedBy");
      initBits &= ~INIT_BIT_PROVIDED_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableScenarioRatingRow ImmutableScenarioRatingRow}.
     * @return An immutable instance of ScenarioRatingRow
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableScenarioRatingRow build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableScenarioRatingRow(roadmap, scenario, column, row, assetCode, rating, description, providedBy);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ROADMAP) != 0) attributes.add("roadmap");
      if ((initBits & INIT_BIT_SCENARIO) != 0) attributes.add("scenario");
      if ((initBits & INIT_BIT_COLUMN) != 0) attributes.add("column");
      if ((initBits & INIT_BIT_ROW) != 0) attributes.add("row");
      if ((initBits & INIT_BIT_ASSET_CODE) != 0) attributes.add("assetCode");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_PROVIDED_BY) != 0) attributes.add("providedBy");
      return "Cannot build ScenarioRatingRow, some of required attributes are not set " + attributes;
    }
  }
}
