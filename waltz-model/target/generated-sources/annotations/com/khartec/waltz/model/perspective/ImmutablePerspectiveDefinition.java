package com.khartec.waltz.model.perspective;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.RagNamesProvider;
import com.khartec.waltz.model.rating.RagName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PerspectiveDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerspectiveDefinition.builder()}.
 */
@SuppressWarnings({"all", "deprecation"})
@Generated({"Immutables.generator", "PerspectiveDefinition"})
public final class ImmutablePerspectiveDefinition
    extends PerspectiveDefinition {
  private final long categoryX;
  private final long categoryY;
  private final long ratingSchemeId;
  private final List<RagName> ragNames;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutablePerspectiveDefinition(ImmutablePerspectiveDefinition.Builder builder) {
    this.categoryX = builder.categoryX;
    this.categoryY = builder.categoryY;
    this.ratingSchemeId = builder.ratingSchemeId;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.ragNames = builder.ragNamesIsSet()
        ? createUnmodifiableList(true, builder.ragNames)
        : createUnmodifiableList(false, createSafeList(super.ragNames(), true, false));
  }

  private ImmutablePerspectiveDefinition(
      long categoryX,
      long categoryY,
      long ratingSchemeId,
      List<RagName> ragNames,
      Long id,
      String name,
      @Nullable String description) {
    this.categoryX = categoryX;
    this.categoryY = categoryY;
    this.ratingSchemeId = ratingSchemeId;
    this.ragNames = ragNames;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code categoryX} attribute
   */
  @JsonProperty("categoryX")
  @Override
  public long categoryX() {
    return categoryX;
  }

  /**
   * @return The value of the {@code categoryY} attribute
   */
  @JsonProperty("categoryY")
  @Override
  public long categoryY() {
    return categoryY;
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
   * @return The value of the {@code ragNames} attribute
   */
  @JsonProperty("ragNames")
  @Deprecated
  @Override
  public List<RagName> ragNames() {
    return ragNames;
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
   * Copy the current immutable object by setting a value for the {@link PerspectiveDefinition#categoryX() categoryX} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for categoryX
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveDefinition withCategoryX(long value) {
    if (this.categoryX == value) return this;
    return new ImmutablePerspectiveDefinition(value, this.categoryY, this.ratingSchemeId, this.ragNames, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveDefinition#categoryY() categoryY} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for categoryY
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveDefinition withCategoryY(long value) {
    if (this.categoryY == value) return this;
    return new ImmutablePerspectiveDefinition(this.categoryX, value, this.ratingSchemeId, this.ragNames, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveDefinition#ratingSchemeId() ratingSchemeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingSchemeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveDefinition withRatingSchemeId(long value) {
    if (this.ratingSchemeId == value) return this;
    return new ImmutablePerspectiveDefinition(this.categoryX, this.categoryY, value, this.ragNames, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PerspectiveDefinition#ragNames() ragNames}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @Deprecated
  public final ImmutablePerspectiveDefinition withRagNames(RagName... elements) {
    List<RagName> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutablePerspectiveDefinition(
        this.categoryX,
        this.categoryY,
        this.ratingSchemeId,
        newValue,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PerspectiveDefinition#ragNames() ragNames}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of ragNames elements to set
   * @return A modified copy of {@code this} object
   */
  @Deprecated
  public final ImmutablePerspectiveDefinition withRagNames(Iterable<? extends RagName> elements) {
    if (this.ragNames == elements) return this;
    List<RagName> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutablePerspectiveDefinition(
        this.categoryX,
        this.categoryY,
        this.ratingSchemeId,
        newValue,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PerspectiveDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerspectiveDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePerspectiveDefinition(
        this.categoryX,
        this.categoryY,
        this.ratingSchemeId,
        this.ragNames,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PerspectiveDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerspectiveDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePerspectiveDefinition(
        this.categoryX,
        this.categoryY,
        this.ratingSchemeId,
        this.ragNames,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveDefinition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveDefinition withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePerspectiveDefinition(
        this.categoryX,
        this.categoryY,
        this.ratingSchemeId,
        this.ragNames,
        this.id,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveDefinition#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveDefinition withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePerspectiveDefinition(this.categoryX, this.categoryY, this.ratingSchemeId, this.ragNames, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerspectiveDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerspectiveDefinition
        && equalTo((ImmutablePerspectiveDefinition) another);
  }

  private boolean equalTo(ImmutablePerspectiveDefinition another) {
    return categoryX == another.categoryX
        && categoryY == another.categoryY
        && ratingSchemeId == another.ratingSchemeId
        && ragNames.equals(another.ragNames)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code categoryX}, {@code categoryY}, {@code ratingSchemeId}, {@code ragNames}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(categoryX);
    h += (h << 5) + Long.hashCode(categoryY);
    h += (h << 5) + Long.hashCode(ratingSchemeId);
    h += (h << 5) + ragNames.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code PerspectiveDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PerspectiveDefinition{");
    builder.append("categoryX=").append(categoryX);
    builder.append(", ");
    builder.append("categoryY=").append(categoryY);
    builder.append(", ");
    builder.append("ratingSchemeId=").append(ratingSchemeId);
    builder.append(", ");
    builder.append("ragNames=").append(ragNames);
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
  static final class Json extends PerspectiveDefinition {
    long categoryX;
    boolean categoryXIsSet;
    long categoryY;
    boolean categoryYIsSet;
    long ratingSchemeId;
    boolean ratingSchemeIdIsSet;
    List<RagName> ragNames = Collections.emptyList();
    boolean ragNamesIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("categoryX")
    public void setCategoryX(long categoryX) {
      this.categoryX = categoryX;
      this.categoryXIsSet = true;
    }
    @JsonProperty("categoryY")
    public void setCategoryY(long categoryY) {
      this.categoryY = categoryY;
      this.categoryYIsSet = true;
    }
    @JsonProperty("ratingSchemeId")
    public void setRatingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      this.ratingSchemeIdIsSet = true;
    }
    @JsonProperty("ragNames")
    public void setRagNames(List<RagName> ragNames) {
      this.ragNames = ragNames;
      this.ragNamesIsSet = true;
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
    public long categoryX() { throw new UnsupportedOperationException(); }
    @Override
    public long categoryY() { throw new UnsupportedOperationException(); }
    @Override
    public long ratingSchemeId() { throw new UnsupportedOperationException(); }
    @Override
    public List<RagName> ragNames() { throw new UnsupportedOperationException(); }
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
  static ImmutablePerspectiveDefinition fromJson(Json json) {
    ImmutablePerspectiveDefinition.Builder builder = ImmutablePerspectiveDefinition.builder();
    if (json.categoryXIsSet) {
      builder.categoryX(json.categoryX);
    }
    if (json.categoryYIsSet) {
      builder.categoryY(json.categoryY);
    }
    if (json.ratingSchemeIdIsSet) {
      builder.ratingSchemeId(json.ratingSchemeId);
    }
    if (json.ragNamesIsSet) {
      builder.addAllRagNames(json.ragNames);
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
   * Creates an immutable copy of a {@link PerspectiveDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PerspectiveDefinition instance
   */
  public static ImmutablePerspectiveDefinition copyOf(PerspectiveDefinition instance) {
    if (instance instanceof ImmutablePerspectiveDefinition) {
      return (ImmutablePerspectiveDefinition) instance;
    }
    return ImmutablePerspectiveDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerspectiveDefinition ImmutablePerspectiveDefinition}.
   * @return A new ImmutablePerspectiveDefinition builder
   */
  public static ImmutablePerspectiveDefinition.Builder builder() {
    return new ImmutablePerspectiveDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerspectiveDefinition ImmutablePerspectiveDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CATEGORY_X = 0x1L;
    private static final long INIT_BIT_CATEGORY_Y = 0x2L;
    private static final long INIT_BIT_RATING_SCHEME_ID = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_RAG_NAMES = 0x1L;
    private long initBits = 0xfL;
    private long optBits;

    private long categoryX;
    private long categoryY;
    private long ratingSchemeId;
    private List<RagName> ragNames = new ArrayList<RagName>();
    private Long id;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.perspective.PerspectiveDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PerspectiveDefinition instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.RagNamesProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RagNamesProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof PerspectiveDefinition) {
        PerspectiveDefinition instance = (PerspectiveDefinition) object;
        ratingSchemeId(instance.ratingSchemeId());
        categoryX(instance.categoryX());
        if ((bits & 0x1L) == 0) {
          addAllRagNames(instance.ragNames());
          bits |= 0x1L;
        }
        categoryY(instance.categoryY());
      }
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
      if (object instanceof RagNamesProvider) {
        RagNamesProvider instance = (RagNamesProvider) object;
        if ((bits & 0x1L) == 0) {
          addAllRagNames(instance.ragNames());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link PerspectiveDefinition#categoryX() categoryX} attribute.
     * @param categoryX The value for categoryX 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("categoryX")
    public final Builder categoryX(long categoryX) {
      this.categoryX = categoryX;
      initBits &= ~INIT_BIT_CATEGORY_X;
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveDefinition#categoryY() categoryY} attribute.
     * @param categoryY The value for categoryY 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("categoryY")
    public final Builder categoryY(long categoryY) {
      this.categoryY = categoryY;
      initBits &= ~INIT_BIT_CATEGORY_Y;
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveDefinition#ratingSchemeId() ratingSchemeId} attribute.
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
     * Adds one element to {@link PerspectiveDefinition#ragNames() ragNames} list.
     * @param element A ragNames element
     * @return {@code this} builder for use in a chained invocation
     */
    @Deprecated
    public final Builder addRagNames(RagName element) {
      this.ragNames.add(Objects.requireNonNull(element, "ragNames element"));
      optBits |= OPT_BIT_RAG_NAMES;
      return this;
    }

    /**
     * Adds elements to {@link PerspectiveDefinition#ragNames() ragNames} list.
     * @param elements An array of ragNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    @Deprecated
    public final Builder addRagNames(RagName... elements) {
      for (RagName element : elements) {
        this.ragNames.add(Objects.requireNonNull(element, "ragNames element"));
      }
      optBits |= OPT_BIT_RAG_NAMES;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PerspectiveDefinition#ragNames() ragNames} list.
     * @param elements An iterable of ragNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ragNames")
    @Deprecated
    public final Builder ragNames(Iterable<? extends RagName> elements) {
      this.ragNames.clear();
      return addAllRagNames(elements);
    }

    /**
     * Adds elements to {@link PerspectiveDefinition#ragNames() ragNames} list.
     * @param elements An iterable of ragNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    @Deprecated
    public final Builder addAllRagNames(Iterable<? extends RagName> elements) {
      for (RagName element : elements) {
        this.ragNames.add(Objects.requireNonNull(element, "ragNames element"));
      }
      optBits |= OPT_BIT_RAG_NAMES;
      return this;
    }

    /**
     * Initializes the optional value {@link PerspectiveDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PerspectiveDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveDefinition#name() name} attribute.
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
     * Initializes the value for the {@link PerspectiveDefinition#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerspectiveDefinition ImmutablePerspectiveDefinition}.
     * @return An immutable instance of PerspectiveDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerspectiveDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerspectiveDefinition(this);
    }

    private boolean ragNamesIsSet() {
      return (optBits & OPT_BIT_RAG_NAMES) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CATEGORY_X) != 0) attributes.add("categoryX");
      if ((initBits & INIT_BIT_CATEGORY_Y) != 0) attributes.add("categoryY");
      if ((initBits & INIT_BIT_RATING_SCHEME_ID) != 0) attributes.add("ratingSchemeId");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PerspectiveDefinition, some of required attributes are not set " + attributes;
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
