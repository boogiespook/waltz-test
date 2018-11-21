package com.khartec.waltz.model.rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.PositionProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RagName}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRagName.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RagName"})
public final class ImmutableRagName extends RagName {
  private final Character rating;
  private final String color;
  private final long ratingSchemeId;
  private final boolean needsPlannedDate;
  private final boolean userSelectable;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final int position;

  private ImmutableRagName(ImmutableRagName.Builder builder) {
    this.rating = builder.rating;
    this.color = builder.color;
    this.ratingSchemeId = builder.ratingSchemeId;
    this.needsPlannedDate = builder.needsPlannedDate;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.position = builder.position;
    this.userSelectable = builder.userSelectableIsSet()
        ? builder.userSelectable
        : super.userSelectable();
  }

  private ImmutableRagName(
      Character rating,
      String color,
      long ratingSchemeId,
      boolean needsPlannedDate,
      boolean userSelectable,
      Long id,
      String name,
      @Nullable String description,
      int position) {
    this.rating = rating;
    this.color = color;
    this.ratingSchemeId = ratingSchemeId;
    this.needsPlannedDate = needsPlannedDate;
    this.userSelectable = userSelectable;
    this.id = id;
    this.name = name;
    this.description = description;
    this.position = position;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public Character rating() {
    return rating;
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @JsonProperty("color")
  @Override
  public String color() {
    return color;
  }

  /**
   * @return The value of the {@code ratingSchemeId} attribute
   */
  @JsonProperty("ratingSchemeId")
  @Override
  public long ratingSchemeId() {
    return ratingSchemeId;
  }

  /**
   * @return The value of the {@code needsPlannedDate} attribute
   */
  @JsonProperty("needsPlannedDate")
  @Override
  public boolean needsPlannedDate() {
    return needsPlannedDate;
  }

  /**
   * @return The value of the {@code userSelectable} attribute
   */
  @JsonProperty("userSelectable")
  @Override
  public boolean userSelectable() {
    return userSelectable;
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
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
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public int position() {
    return position;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#rating() rating} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withRating(Character value) {
    if (this.rating.equals(value)) return this;
    Character newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableRagName(
        newValue,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        this.id,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#color() color} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for color
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withColor(String value) {
    if (this.color.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "color");
    return new ImmutableRagName(
        this.rating,
        newValue,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        this.id,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#ratingSchemeId() ratingSchemeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingSchemeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withRatingSchemeId(long value) {
    if (this.ratingSchemeId == value) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        value,
        this.needsPlannedDate,
        this.userSelectable,
        this.id,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#needsPlannedDate() needsPlannedDate} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for needsPlannedDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withNeedsPlannedDate(boolean value) {
    if (this.needsPlannedDate == value) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        value,
        this.userSelectable,
        this.id,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#userSelectable() userSelectable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userSelectable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withUserSelectable(boolean value) {
    if (this.userSelectable == value) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        value,
        this.id,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RagName#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRagName withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        newValue,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RagName#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRagName withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        value,
        this.name,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        this.id,
        newValue,
        this.description,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        this.id,
        this.name,
        value,
        this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RagName#position() position} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRagName withPosition(int value) {
    if (this.position == value) return this;
    return new ImmutableRagName(
        this.rating,
        this.color,
        this.ratingSchemeId,
        this.needsPlannedDate,
        this.userSelectable,
        this.id,
        this.name,
        this.description,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRagName} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRagName
        && equalTo((ImmutableRagName) another);
  }

  private boolean equalTo(ImmutableRagName another) {
    return rating.equals(another.rating)
        && color.equals(another.color)
        && ratingSchemeId == another.ratingSchemeId
        && needsPlannedDate == another.needsPlannedDate
        && userSelectable == another.userSelectable
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && position == another.position;
  }

  /**
   * Computes a hash code from attributes: {@code rating}, {@code color}, {@code ratingSchemeId}, {@code needsPlannedDate}, {@code userSelectable}, {@code id}, {@code name}, {@code description}, {@code position}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + color.hashCode();
    h += (h << 5) + Long.hashCode(ratingSchemeId);
    h += (h << 5) + Boolean.hashCode(needsPlannedDate);
    h += (h << 5) + Boolean.hashCode(userSelectable);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + position;
    return h;
  }

  /**
   * Prints the immutable value {@code RagName} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RagName{");
    builder.append("rating=").append(rating);
    builder.append(", ");
    builder.append("color=").append(color);
    builder.append(", ");
    builder.append("ratingSchemeId=").append(ratingSchemeId);
    builder.append(", ");
    builder.append("needsPlannedDate=").append(needsPlannedDate);
    builder.append(", ");
    builder.append("userSelectable=").append(userSelectable);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("position=").append(position);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RagName {
    Character rating;
    String color;
    long ratingSchemeId;
    boolean ratingSchemeIdIsSet;
    boolean needsPlannedDate;
    boolean needsPlannedDateIsSet;
    boolean userSelectable;
    boolean userSelectableIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    int position;
    boolean positionIsSet;
    @JsonProperty("rating")
    public void setRating(Character rating) {
      this.rating = rating;
    }
    @JsonProperty("color")
    public void setColor(String color) {
      this.color = color;
    }
    @JsonProperty("ratingSchemeId")
    public void setRatingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      this.ratingSchemeIdIsSet = true;
    }
    @JsonProperty("needsPlannedDate")
    public void setNeedsPlannedDate(boolean needsPlannedDate) {
      this.needsPlannedDate = needsPlannedDate;
      this.needsPlannedDateIsSet = true;
    }
    @JsonProperty("userSelectable")
    public void setUserSelectable(boolean userSelectable) {
      this.userSelectable = userSelectable;
      this.userSelectableIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("position")
    public void setPosition(int position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @Override
    public Character rating() { throw new UnsupportedOperationException(); }
    @Override
    public String color() { throw new UnsupportedOperationException(); }
    @Override
    public long ratingSchemeId() { throw new UnsupportedOperationException(); }
    @Override
    public boolean needsPlannedDate() { throw new UnsupportedOperationException(); }
    @Override
    public boolean userSelectable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public int position() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRagName fromJson(Json json) {
    ImmutableRagName.Builder builder = ImmutableRagName.builder();
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    if (json.color != null) {
      builder.color(json.color);
    }
    if (json.ratingSchemeIdIsSet) {
      builder.ratingSchemeId(json.ratingSchemeId);
    }
    if (json.needsPlannedDateIsSet) {
      builder.needsPlannedDate(json.needsPlannedDate);
    }
    if (json.userSelectableIsSet) {
      builder.userSelectable(json.userSelectable);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RagName} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RagName instance
   */
  public static ImmutableRagName copyOf(RagName instance) {
    if (instance instanceof ImmutableRagName) {
      return (ImmutableRagName) instance;
    }
    return ImmutableRagName.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRagName ImmutableRagName}.
   * @return A new ImmutableRagName builder
   */
  public static ImmutableRagName.Builder builder() {
    return new ImmutableRagName.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRagName ImmutableRagName}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING = 0x1L;
    private static final long INIT_BIT_COLOR = 0x2L;
    private static final long INIT_BIT_RATING_SCHEME_ID = 0x4L;
    private static final long INIT_BIT_NEEDS_PLANNED_DATE = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private static final long INIT_BIT_POSITION = 0x20L;
    private static final long OPT_BIT_USER_SELECTABLE = 0x1L;
    private long initBits = 0x3fL;
    private long optBits;

    private Character rating;
    private String color;
    private long ratingSchemeId;
    private boolean needsPlannedDate;
    private boolean userSelectable;
    private Long id;
    private String name;
    private String description;
    private int position;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.rating.RagName} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RagName instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.NameProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NameProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.PositionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PositionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof RagName) {
        RagName instance = (RagName) object;
        rating(instance.rating());
        needsPlannedDate(instance.needsPlannedDate());
        userSelectable(instance.userSelectable());
        color(instance.color());
        ratingSchemeId(instance.ratingSchemeId());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof PositionProvider) {
        PositionProvider instance = (PositionProvider) object;
        position(instance.position());
      }
    }

    /**
     * Initializes the value for the {@link RagName#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(Character rating) {
      this.rating = Objects.requireNonNull(rating, "rating");
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#color() color} attribute.
     * @param color The value for color 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("color")
    public final Builder color(String color) {
      this.color = Objects.requireNonNull(color, "color");
      initBits &= ~INIT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#ratingSchemeId() ratingSchemeId} attribute.
     * @param ratingSchemeId The value for ratingSchemeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratingSchemeId")
    public final Builder ratingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      initBits &= ~INIT_BIT_RATING_SCHEME_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#needsPlannedDate() needsPlannedDate} attribute.
     * @param needsPlannedDate The value for needsPlannedDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("needsPlannedDate")
    public final Builder needsPlannedDate(boolean needsPlannedDate) {
      this.needsPlannedDate = needsPlannedDate;
      initBits &= ~INIT_BIT_NEEDS_PLANNED_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#userSelectable() userSelectable} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RagName#userSelectable() userSelectable}.</em>
     * @param userSelectable The value for userSelectable 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userSelectable")
    public final Builder userSelectable(boolean userSelectable) {
      this.userSelectable = userSelectable;
      optBits |= OPT_BIT_USER_SELECTABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link RagName#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link RagName#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link RagName#position() position} attribute.
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(int position) {
      this.position = position;
      initBits &= ~INIT_BIT_POSITION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRagName ImmutableRagName}.
     * @return An immutable instance of RagName
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRagName build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRagName(this);
    }

    private boolean userSelectableIsSet() {
      return (optBits & OPT_BIT_USER_SELECTABLE) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_COLOR) != 0) attributes.add("color");
      if ((initBits & INIT_BIT_RATING_SCHEME_ID) != 0) attributes.add("ratingSchemeId");
      if ((initBits & INIT_BIT_NEEDS_PLANNED_DATE) != 0) attributes.add("needsPlannedDate");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      return "Cannot build RagName, some of required attributes are not set " + attributes;
    }
  }
}
