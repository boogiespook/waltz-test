package com.khartec.waltz.model.scenario;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ScenarioRatingItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableScenarioRatingItem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ScenarioRatingItem"})
public final class ImmutableScenarioRatingItem extends ScenarioRatingItem {
  private final long scenarioId;
  private final char rating;
  private final EntityReference item;
  private final EntityReference row;
  private final EntityReference column;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableScenarioRatingItem(ImmutableScenarioRatingItem.Builder builder) {
    this.scenarioId = builder.scenarioId;
    this.rating = builder.rating;
    this.item = builder.item;
    this.row = builder.row;
    this.column = builder.column;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.lastUpdatedAt = builder.lastUpdatedAt != null
        ? builder.lastUpdatedAt
        : Objects.requireNonNull(super.lastUpdatedAt(), "lastUpdatedAt");
  }

  private ImmutableScenarioRatingItem(
      long scenarioId,
      char rating,
      EntityReference item,
      EntityReference row,
      EntityReference column,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.scenarioId = scenarioId;
    this.rating = rating;
    this.item = item;
    this.row = row;
    this.column = column;
    this.description = description;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
  }

  /**
   * @return The value of the {@code scenarioId} attribute
   */
  @JsonProperty("scenarioId")
  @Override
  public long scenarioId() {
    return scenarioId;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public char rating() {
    return rating;
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public EntityReference item() {
    return item;
  }

  /**
   * @return The value of the {@code row} attribute
   */
  @JsonProperty("row")
  @Override
  public EntityReference row() {
    return row;
  }

  /**
   * @return The value of the {@code column} attribute
   */
  @JsonProperty("column")
  @Override
  public EntityReference column() {
    return column;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * @return The value of the {@code lastUpdatedAt} attribute
   */
  @JsonProperty("lastUpdatedAt")
  @Override
  public LocalDateTime lastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * @return The value of the {@code lastUpdatedBy} attribute
   */
  @JsonProperty("lastUpdatedBy")
  @Override
  public String lastUpdatedBy() {
    return lastUpdatedBy;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#scenarioId() scenarioId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenarioId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withScenarioId(long value) {
    if (this.scenarioId == value) return this;
    return new ImmutableScenarioRatingItem(
        value,
        this.rating,
        this.item,
        this.row,
        this.column,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withRating(char value) {
    if (this.rating == value) return this;
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        value,
        this.item,
        this.row,
        this.column,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#item() item} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for item
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withItem(EntityReference value) {
    if (this.item == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "item");
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        this.rating,
        newValue,
        this.row,
        this.column,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#row() row} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for row
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withRow(EntityReference value) {
    if (this.row == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "row");
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        this.rating,
        this.item,
        newValue,
        this.column,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#column() column} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for column
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withColumn(EntityReference value) {
    if (this.column == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "column");
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        this.rating,
        this.item,
        this.row,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        this.rating,
        this.item,
        this.row,
        this.column,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        this.rating,
        this.item,
        this.row,
        this.column,
        this.description,
        newValue,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioRatingItem#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioRatingItem withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableScenarioRatingItem(
        this.scenarioId,
        this.rating,
        this.item,
        this.row,
        this.column,
        this.description,
        this.lastUpdatedAt,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableScenarioRatingItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableScenarioRatingItem
        && equalTo((ImmutableScenarioRatingItem) another);
  }

  private boolean equalTo(ImmutableScenarioRatingItem another) {
    return scenarioId == another.scenarioId
        && rating == another.rating
        && item.equals(another.item)
        && row.equals(another.row)
        && column.equals(another.column)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code scenarioId}, {@code rating}, {@code item}, {@code row}, {@code column}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(scenarioId);
    h += (h << 5) + Character.hashCode(rating);
    h += (h << 5) + item.hashCode();
    h += (h << 5) + row.hashCode();
    h += (h << 5) + column.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ScenarioRatingItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ScenarioRatingItem{"
        + "scenarioId=" + scenarioId
        + ", rating=" + rating
        + ", item=" + item
        + ", row=" + row
        + ", column=" + column
        + ", description=" + description
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ScenarioRatingItem {
    long scenarioId;
    boolean scenarioIdIsSet;
    char rating;
    boolean ratingIsSet;
    EntityReference item;
    EntityReference row;
    EntityReference column;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("scenarioId")
    public void setScenarioId(long scenarioId) {
      this.scenarioId = scenarioId;
      this.scenarioIdIsSet = true;
    }
    @JsonProperty("rating")
    public void setRating(char rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(EntityReference item) {
      this.item = item;
    }
    @JsonProperty("row")
    public void setRow(EntityReference row) {
      this.row = row;
    }
    @JsonProperty("column")
    public void setColumn(EntityReference column) {
      this.column = column;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @Override
    public long scenarioId() { throw new UnsupportedOperationException(); }
    @Override
    public char rating() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference item() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference row() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference column() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableScenarioRatingItem fromJson(Json json) {
    ImmutableScenarioRatingItem.Builder builder = ImmutableScenarioRatingItem.builder();
    if (json.scenarioIdIsSet) {
      builder.scenarioId(json.scenarioId);
    }
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.item != null) {
      builder.item(json.item);
    }
    if (json.row != null) {
      builder.row(json.row);
    }
    if (json.column != null) {
      builder.column(json.column);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ScenarioRatingItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ScenarioRatingItem instance
   */
  public static ImmutableScenarioRatingItem copyOf(ScenarioRatingItem instance) {
    if (instance instanceof ImmutableScenarioRatingItem) {
      return (ImmutableScenarioRatingItem) instance;
    }
    return ImmutableScenarioRatingItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableScenarioRatingItem ImmutableScenarioRatingItem}.
   * @return A new ImmutableScenarioRatingItem builder
   */
  public static ImmutableScenarioRatingItem.Builder builder() {
    return new ImmutableScenarioRatingItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableScenarioRatingItem ImmutableScenarioRatingItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SCENARIO_ID = 0x1L;
    private static final long INIT_BIT_RATING = 0x2L;
    private static final long INIT_BIT_ITEM = 0x4L;
    private static final long INIT_BIT_ROW = 0x8L;
    private static final long INIT_BIT_COLUMN = 0x10L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x20L;
    private long initBits = 0x3fL;

    private long scenarioId;
    private char rating;
    private EntityReference item;
    private EntityReference row;
    private EntityReference column;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LastUpdatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastUpdatedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.scenario.ScenarioRatingItem} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ScenarioRatingItem instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof ScenarioRatingItem) {
        ScenarioRatingItem instance = (ScenarioRatingItem) object;
        rating(instance.rating());
        column(instance.column());
        item(instance.item());
        row(instance.row());
        scenarioId(instance.scenarioId());
      }
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#scenarioId() scenarioId} attribute.
     * @param scenarioId The value for scenarioId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scenarioId")
    public final Builder scenarioId(long scenarioId) {
      this.scenarioId = scenarioId;
      initBits &= ~INIT_BIT_SCENARIO_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(char rating) {
      this.rating = rating;
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(EntityReference item) {
      this.item = Objects.requireNonNull(item, "item");
      initBits &= ~INIT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#row() row} attribute.
     * @param row The value for row 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("row")
    public final Builder row(EntityReference row) {
      this.row = Objects.requireNonNull(row, "row");
      initBits &= ~INIT_BIT_ROW;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#column() column} attribute.
     * @param column The value for column 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("column")
    public final Builder column(EntityReference column) {
      this.column = Objects.requireNonNull(column, "column");
      initBits &= ~INIT_BIT_COLUMN;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ScenarioRatingItem#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioRatingItem#lastUpdatedBy() lastUpdatedBy} attribute.
     * @param lastUpdatedBy The value for lastUpdatedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedBy")
    public final Builder lastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = Objects.requireNonNull(lastUpdatedBy, "lastUpdatedBy");
      initBits &= ~INIT_BIT_LAST_UPDATED_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableScenarioRatingItem ImmutableScenarioRatingItem}.
     * @return An immutable instance of ScenarioRatingItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableScenarioRatingItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableScenarioRatingItem(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SCENARIO_ID) != 0) attributes.add("scenarioId");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_ITEM) != 0) attributes.add("item");
      if ((initBits & INIT_BIT_ROW) != 0) attributes.add("row");
      if ((initBits & INIT_BIT_COLUMN) != 0) attributes.add("column");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build ScenarioRatingItem, some of required attributes are not set " + attributes;
    }
  }
}
