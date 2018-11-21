package com.khartec.waltz.model.appview;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.application.Application;
import com.khartec.waltz.model.complexity.ComplexityRating;
import com.khartec.waltz.model.orgunit.OrganisationalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppView}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppView.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppView"})
public final class ImmutableAppView extends AppView {
  private final Application app;
  private final List<String> tags;
  private final List<String> aliases;
  private final OrganisationalUnit organisationalUnit;
  private final ComplexityRating complexity;

  private ImmutableAppView(
      Application app,
      List<String> tags,
      List<String> aliases,
      OrganisationalUnit organisationalUnit,
      ComplexityRating complexity) {
    this.app = app;
    this.tags = tags;
    this.aliases = aliases;
    this.organisationalUnit = organisationalUnit;
    this.complexity = complexity;
  }

  /**
   * @return The value of the {@code app} attribute
   */
  @JsonProperty("app")
  @Override
  public Application app() {
    return app;
  }

  /**
   * @return The value of the {@code tags} attribute
   */
  @JsonProperty("tags")
  @Override
  public List<String> tags() {
    return tags;
  }

  /**
   * @return The value of the {@code aliases} attribute
   */
  @JsonProperty("aliases")
  @Override
  public List<String> aliases() {
    return aliases;
  }

  /**
   * @return The value of the {@code organisationalUnit} attribute
   */
  @JsonProperty("organisationalUnit")
  @Override
  public OrganisationalUnit organisationalUnit() {
    return organisationalUnit;
  }

  /**
   * @return The value of the {@code complexity} attribute
   */
  @JsonProperty("complexity")
  @Override
  public ComplexityRating complexity() {
    return complexity;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppView#app() app} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for app
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppView withApp(Application value) {
    if (this.app == value) return this;
    Application newValue = Objects.requireNonNull(value, "app");
    return new ImmutableAppView(newValue, this.tags, this.aliases, this.organisationalUnit, this.complexity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppView#tags() tags}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppView withTags(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppView(this.app, newValue, this.aliases, this.organisationalUnit, this.complexity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppView#tags() tags}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of tags elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppView withTags(Iterable<String> elements) {
    if (this.tags == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppView(this.app, newValue, this.aliases, this.organisationalUnit, this.complexity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppView#aliases() aliases}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppView withAliases(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppView(this.app, this.tags, newValue, this.organisationalUnit, this.complexity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppView#aliases() aliases}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of aliases elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppView withAliases(Iterable<String> elements) {
    if (this.aliases == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppView(this.app, this.tags, newValue, this.organisationalUnit, this.complexity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppView#organisationalUnit() organisationalUnit} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organisationalUnit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppView withOrganisationalUnit(OrganisationalUnit value) {
    if (this.organisationalUnit == value) return this;
    OrganisationalUnit newValue = Objects.requireNonNull(value, "organisationalUnit");
    return new ImmutableAppView(this.app, this.tags, this.aliases, newValue, this.complexity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppView#complexity() complexity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for complexity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppView withComplexity(ComplexityRating value) {
    if (this.complexity == value) return this;
    ComplexityRating newValue = Objects.requireNonNull(value, "complexity");
    return new ImmutableAppView(this.app, this.tags, this.aliases, this.organisationalUnit, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppView} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppView
        && equalTo((ImmutableAppView) another);
  }

  private boolean equalTo(ImmutableAppView another) {
    return app.equals(another.app)
        && tags.equals(another.tags)
        && aliases.equals(another.aliases)
        && organisationalUnit.equals(another.organisationalUnit)
        && complexity.equals(another.complexity);
  }

  /**
   * Computes a hash code from attributes: {@code app}, {@code tags}, {@code aliases}, {@code organisationalUnit}, {@code complexity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + app.hashCode();
    h += (h << 5) + tags.hashCode();
    h += (h << 5) + aliases.hashCode();
    h += (h << 5) + organisationalUnit.hashCode();
    h += (h << 5) + complexity.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AppView} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AppView{"
        + "app=" + app
        + ", tags=" + tags
        + ", aliases=" + aliases
        + ", organisationalUnit=" + organisationalUnit
        + ", complexity=" + complexity
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppView {
    Application app;
    List<String> tags = Collections.emptyList();
    List<String> aliases = Collections.emptyList();
    OrganisationalUnit organisationalUnit;
    ComplexityRating complexity;
    @JsonProperty("app")
    public void setApp(Application app) {
      this.app = app;
    }
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
      this.tags = tags;
    }
    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
      this.aliases = aliases;
    }
    @JsonProperty("organisationalUnit")
    public void setOrganisationalUnit(OrganisationalUnit organisationalUnit) {
      this.organisationalUnit = organisationalUnit;
    }
    @JsonProperty("complexity")
    public void setComplexity(ComplexityRating complexity) {
      this.complexity = complexity;
    }
    @Override
    public Application app() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> tags() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> aliases() { throw new UnsupportedOperationException(); }
    @Override
    public OrganisationalUnit organisationalUnit() { throw new UnsupportedOperationException(); }
    @Override
    public ComplexityRating complexity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppView fromJson(Json json) {
    ImmutableAppView.Builder builder = ImmutableAppView.builder();
    if (json.app != null) {
      builder.app(json.app);
    }
    if (json.tags != null) {
      builder.addAllTags(json.tags);
    }
    if (json.aliases != null) {
      builder.addAllAliases(json.aliases);
    }
    if (json.organisationalUnit != null) {
      builder.organisationalUnit(json.organisationalUnit);
    }
    if (json.complexity != null) {
      builder.complexity(json.complexity);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppView} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppView instance
   */
  public static ImmutableAppView copyOf(AppView instance) {
    if (instance instanceof ImmutableAppView) {
      return (ImmutableAppView) instance;
    }
    return ImmutableAppView.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppView ImmutableAppView}.
   * @return A new ImmutableAppView builder
   */
  public static ImmutableAppView.Builder builder() {
    return new ImmutableAppView.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppView ImmutableAppView}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APP = 0x1L;
    private static final long INIT_BIT_ORGANISATIONAL_UNIT = 0x2L;
    private static final long INIT_BIT_COMPLEXITY = 0x4L;
    private long initBits = 0x7L;

    private Application app;
    private List<String> tags = new ArrayList<String>();
    private List<String> aliases = new ArrayList<String>();
    private OrganisationalUnit organisationalUnit;
    private ComplexityRating complexity;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppView} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppView instance) {
      Objects.requireNonNull(instance, "instance");
      app(instance.app());
      addAllTags(instance.tags());
      addAllAliases(instance.aliases());
      organisationalUnit(instance.organisationalUnit());
      complexity(instance.complexity());
      return this;
    }

    /**
     * Initializes the value for the {@link AppView#app() app} attribute.
     * @param app The value for app 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("app")
    public final Builder app(Application app) {
      this.app = Objects.requireNonNull(app, "app");
      initBits &= ~INIT_BIT_APP;
      return this;
    }

    /**
     * Adds one element to {@link AppView#tags() tags} list.
     * @param element A tags element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTags(String element) {
      this.tags.add(Objects.requireNonNull(element, "tags element"));
      return this;
    }

    /**
     * Adds elements to {@link AppView#tags() tags} list.
     * @param elements An array of tags elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTags(String... elements) {
      for (String element : elements) {
        this.tags.add(Objects.requireNonNull(element, "tags element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppView#tags() tags} list.
     * @param elements An iterable of tags elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tags")
    public final Builder tags(Iterable<String> elements) {
      this.tags.clear();
      return addAllTags(elements);
    }

    /**
     * Adds elements to {@link AppView#tags() tags} list.
     * @param elements An iterable of tags elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTags(Iterable<String> elements) {
      for (String element : elements) {
        this.tags.add(Objects.requireNonNull(element, "tags element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link AppView#aliases() aliases} list.
     * @param element A aliases element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAliases(String element) {
      this.aliases.add(Objects.requireNonNull(element, "aliases element"));
      return this;
    }

    /**
     * Adds elements to {@link AppView#aliases() aliases} list.
     * @param elements An array of aliases elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAliases(String... elements) {
      for (String element : elements) {
        this.aliases.add(Objects.requireNonNull(element, "aliases element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppView#aliases() aliases} list.
     * @param elements An iterable of aliases elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("aliases")
    public final Builder aliases(Iterable<String> elements) {
      this.aliases.clear();
      return addAllAliases(elements);
    }

    /**
     * Adds elements to {@link AppView#aliases() aliases} list.
     * @param elements An iterable of aliases elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAliases(Iterable<String> elements) {
      for (String element : elements) {
        this.aliases.add(Objects.requireNonNull(element, "aliases element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AppView#organisationalUnit() organisationalUnit} attribute.
     * @param organisationalUnit The value for organisationalUnit 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organisationalUnit")
    public final Builder organisationalUnit(OrganisationalUnit organisationalUnit) {
      this.organisationalUnit = Objects.requireNonNull(organisationalUnit, "organisationalUnit");
      initBits &= ~INIT_BIT_ORGANISATIONAL_UNIT;
      return this;
    }

    /**
     * Initializes the value for the {@link AppView#complexity() complexity} attribute.
     * @param complexity The value for complexity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("complexity")
    public final Builder complexity(ComplexityRating complexity) {
      this.complexity = Objects.requireNonNull(complexity, "complexity");
      initBits &= ~INIT_BIT_COMPLEXITY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppView ImmutableAppView}.
     * @return An immutable instance of AppView
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppView build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppView(
          app,
          createUnmodifiableList(true, tags),
          createUnmodifiableList(true, aliases),
          organisationalUnit,
          complexity);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APP) != 0) attributes.add("app");
      if ((initBits & INIT_BIT_ORGANISATIONAL_UNIT) != 0) attributes.add("organisationalUnit");
      if ((initBits & INIT_BIT_COMPLEXITY) != 0) attributes.add("complexity");
      return "Cannot build AppView, some of required attributes are not set " + attributes;
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
