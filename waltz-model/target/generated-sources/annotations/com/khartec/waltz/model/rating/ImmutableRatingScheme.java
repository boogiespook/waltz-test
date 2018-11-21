package com.khartec.waltz.model.rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RatingScheme}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRatingScheme.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RatingScheme"})
public final class ImmutableRatingScheme extends RatingScheme {
  private final List<RagName> ratings;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableRatingScheme(ImmutableRatingScheme.Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.ratings = builder.ratingsIsSet()
        ? createUnmodifiableList(true, builder.ratings)
        : createUnmodifiableList(false, createSafeList(super.ratings(), true, false));
  }

  private ImmutableRatingScheme(
      List<RagName> ratings,
      Long id,
      String name,
      @Nullable String description) {
    this.ratings = ratings;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code ratings} attribute
   */
  @JsonProperty("ratings")
  @Override
  public List<RagName> ratings() {
    return ratings;
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
   * Copy the current immutable object with elements that replace the content of {@link RatingScheme#ratings() ratings}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatingScheme withRatings(RagName... elements) {
    List<RagName> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableRatingScheme(newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RatingScheme#ratings() ratings}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of ratings elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatingScheme withRatings(Iterable<? extends RagName> elements) {
    if (this.ratings == elements) return this;
    List<RagName> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableRatingScheme(newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RatingScheme#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatingScheme withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRatingScheme(this.ratings, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RatingScheme#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatingScheme withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRatingScheme(this.ratings, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RatingScheme#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRatingScheme withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableRatingScheme(this.ratings, this.id, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RatingScheme#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRatingScheme withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRatingScheme(this.ratings, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRatingScheme} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRatingScheme
        && equalTo((ImmutableRatingScheme) another);
  }

  private boolean equalTo(ImmutableRatingScheme another) {
    return ratings.equals(another.ratings)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code ratings}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + ratings.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code RatingScheme} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RatingScheme{");
    builder.append("ratings=").append(ratings);
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
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RatingScheme {
    List<RagName> ratings = Collections.emptyList();
    boolean ratingsIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("ratings")
    public void setRatings(List<RagName> ratings) {
      this.ratings = ratings;
      this.ratingsIsSet = true;
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
    @Override
    public List<RagName> ratings() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRatingScheme fromJson(Json json) {
    ImmutableRatingScheme.Builder builder = ImmutableRatingScheme.builder();
    if (json.ratingsIsSet) {
      builder.addAllRatings(json.ratings);
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RatingScheme} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RatingScheme instance
   */
  public static ImmutableRatingScheme copyOf(RatingScheme instance) {
    if (instance instanceof ImmutableRatingScheme) {
      return (ImmutableRatingScheme) instance;
    }
    return ImmutableRatingScheme.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRatingScheme ImmutableRatingScheme}.
   * @return A new ImmutableRatingScheme builder
   */
  public static ImmutableRatingScheme.Builder builder() {
    return new ImmutableRatingScheme.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRatingScheme ImmutableRatingScheme}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_RATINGS = 0x1L;
    private long initBits = 0x1L;
    private long optBits;

    private List<RagName> ratings = new ArrayList<RagName>();
    private Long id;
    private String name;
    private String description;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.rating.RatingScheme} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RatingScheme instance) {
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
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof RatingScheme) {
        RatingScheme instance = (RatingScheme) object;
        addAllRatings(instance.ratings());
      }
    }

    /**
     * Adds one element to {@link RatingScheme#ratings() ratings} list.
     * @param element A ratings element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRatings(RagName element) {
      this.ratings.add(Objects.requireNonNull(element, "ratings element"));
      optBits |= OPT_BIT_RATINGS;
      return this;
    }

    /**
     * Adds elements to {@link RatingScheme#ratings() ratings} list.
     * @param elements An array of ratings elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRatings(RagName... elements) {
      for (RagName element : elements) {
        this.ratings.add(Objects.requireNonNull(element, "ratings element"));
      }
      optBits |= OPT_BIT_RATINGS;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RatingScheme#ratings() ratings} list.
     * @param elements An iterable of ratings elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratings")
    public final Builder ratings(Iterable<? extends RagName> elements) {
      this.ratings.clear();
      return addAllRatings(elements);
    }

    /**
     * Adds elements to {@link RatingScheme#ratings() ratings} list.
     * @param elements An iterable of ratings elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRatings(Iterable<? extends RagName> elements) {
      for (RagName element : elements) {
        this.ratings.add(Objects.requireNonNull(element, "ratings element"));
      }
      optBits |= OPT_BIT_RATINGS;
      return this;
    }

    /**
     * Initializes the optional value {@link RatingScheme#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link RatingScheme#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link RatingScheme#name() name} attribute.
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
     * Initializes the value for the {@link RatingScheme#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRatingScheme ImmutableRatingScheme}.
     * @return An immutable instance of RatingScheme
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRatingScheme build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRatingScheme(this);
    }

    private boolean ratingsIsSet() {
      return (optBits & OPT_BIT_RATINGS) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build RatingScheme, some of required attributes are not set " + attributes;
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
