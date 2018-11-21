package com.khartec.waltz.model.performance_metric.pack;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.checkpoint.Checkpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MetricPack}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMetricPack.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MetricPack"})
public final class ImmutableMetricPack extends MetricPack {
  private final List<Checkpoint> checkpoints;
  private final List<MetricPackItem> items;
  private final List<EntityReference> relatedReferences;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableMetricPack(
      List<Checkpoint> checkpoints,
      List<MetricPackItem> items,
      List<EntityReference> relatedReferences,
      Long id,
      String name,
      @Nullable String description) {
    this.checkpoints = checkpoints;
    this.items = items;
    this.relatedReferences = relatedReferences;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code checkpoints} attribute
   */
  @JsonProperty("checkpoints")
  @Override
  public List<Checkpoint> checkpoints() {
    return checkpoints;
  }

  /**
   * @return The value of the {@code items} attribute
   */
  @JsonProperty("items")
  @Override
  public List<MetricPackItem> items() {
    return items;
  }

  /**
   * @return The value of the {@code relatedReferences} attribute
   */
  @JsonProperty("relatedReferences")
  @Override
  public List<EntityReference> relatedReferences() {
    return relatedReferences;
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
   * Copy the current immutable object with elements that replace the content of {@link MetricPack#checkpoints() checkpoints}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withCheckpoints(Checkpoint... elements) {
    List<Checkpoint> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMetricPack(newValue, this.items, this.relatedReferences, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPack#checkpoints() checkpoints}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of checkpoints elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withCheckpoints(Iterable<? extends Checkpoint> elements) {
    if (this.checkpoints == elements) return this;
    List<Checkpoint> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMetricPack(newValue, this.items, this.relatedReferences, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPack#items() items}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withItems(MetricPackItem... elements) {
    List<MetricPackItem> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMetricPack(this.checkpoints, newValue, this.relatedReferences, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPack#items() items}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of items elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withItems(Iterable<? extends MetricPackItem> elements) {
    if (this.items == elements) return this;
    List<MetricPackItem> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMetricPack(this.checkpoints, newValue, this.relatedReferences, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPack#relatedReferences() relatedReferences}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withRelatedReferences(EntityReference... elements) {
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMetricPack(this.checkpoints, this.items, newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MetricPack#relatedReferences() relatedReferences}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of relatedReferences elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withRelatedReferences(Iterable<? extends EntityReference> elements) {
    if (this.relatedReferences == elements) return this;
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMetricPack(this.checkpoints, this.items, newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MetricPack#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMetricPack(this.checkpoints, this.items, this.relatedReferences, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MetricPack#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMetricPack withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMetricPack(this.checkpoints, this.items, this.relatedReferences, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricPack#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricPack withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableMetricPack(this.checkpoints, this.items, this.relatedReferences, this.id, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MetricPack#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricPack withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMetricPack(this.checkpoints, this.items, this.relatedReferences, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMetricPack} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMetricPack
        && equalTo((ImmutableMetricPack) another);
  }

  private boolean equalTo(ImmutableMetricPack another) {
    return checkpoints.equals(another.checkpoints)
        && items.equals(another.items)
        && relatedReferences.equals(another.relatedReferences)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code checkpoints}, {@code items}, {@code relatedReferences}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + checkpoints.hashCode();
    h += (h << 5) + items.hashCode();
    h += (h << 5) + relatedReferences.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code MetricPack} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MetricPack{");
    builder.append("checkpoints=").append(checkpoints);
    builder.append(", ");
    builder.append("items=").append(items);
    builder.append(", ");
    builder.append("relatedReferences=").append(relatedReferences);
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
  static final class Json extends MetricPack {
    List<Checkpoint> checkpoints = Collections.emptyList();
    List<MetricPackItem> items = Collections.emptyList();
    List<EntityReference> relatedReferences = Collections.emptyList();
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("checkpoints")
    public void setCheckpoints(List<Checkpoint> checkpoints) {
      this.checkpoints = checkpoints;
    }
    @JsonProperty("items")
    public void setItems(List<MetricPackItem> items) {
      this.items = items;
    }
    @JsonProperty("relatedReferences")
    public void setRelatedReferences(List<EntityReference> relatedReferences) {
      this.relatedReferences = relatedReferences;
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
    public List<Checkpoint> checkpoints() { throw new UnsupportedOperationException(); }
    @Override
    public List<MetricPackItem> items() { throw new UnsupportedOperationException(); }
    @Override
    public List<EntityReference> relatedReferences() { throw new UnsupportedOperationException(); }
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
  static ImmutableMetricPack fromJson(Json json) {
    ImmutableMetricPack.Builder builder = ImmutableMetricPack.builder();
    if (json.checkpoints != null) {
      builder.addAllCheckpoints(json.checkpoints);
    }
    if (json.items != null) {
      builder.addAllItems(json.items);
    }
    if (json.relatedReferences != null) {
      builder.addAllRelatedReferences(json.relatedReferences);
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
   * Creates an immutable copy of a {@link MetricPack} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MetricPack instance
   */
  public static ImmutableMetricPack copyOf(MetricPack instance) {
    if (instance instanceof ImmutableMetricPack) {
      return (ImmutableMetricPack) instance;
    }
    return ImmutableMetricPack.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMetricPack ImmutableMetricPack}.
   * @return A new ImmutableMetricPack builder
   */
  public static ImmutableMetricPack.Builder builder() {
    return new ImmutableMetricPack.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMetricPack ImmutableMetricPack}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();
    private List<MetricPackItem> items = new ArrayList<MetricPackItem>();
    private List<EntityReference> relatedReferences = new ArrayList<EntityReference>();
    private Long id;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.performance_metric.pack.MetricPack} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MetricPack instance) {
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

    private void from(Object object) {
      if (object instanceof MetricPack) {
        MetricPack instance = (MetricPack) object;
        addAllCheckpoints(instance.checkpoints());
        addAllItems(instance.items());
        addAllRelatedReferences(instance.relatedReferences());
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
    }

    /**
     * Adds one element to {@link MetricPack#checkpoints() checkpoints} list.
     * @param element A checkpoints element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCheckpoints(Checkpoint element) {
      this.checkpoints.add(Objects.requireNonNull(element, "checkpoints element"));
      return this;
    }

    /**
     * Adds elements to {@link MetricPack#checkpoints() checkpoints} list.
     * @param elements An array of checkpoints elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCheckpoints(Checkpoint... elements) {
      for (Checkpoint element : elements) {
        this.checkpoints.add(Objects.requireNonNull(element, "checkpoints element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MetricPack#checkpoints() checkpoints} list.
     * @param elements An iterable of checkpoints elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("checkpoints")
    public final Builder checkpoints(Iterable<? extends Checkpoint> elements) {
      this.checkpoints.clear();
      return addAllCheckpoints(elements);
    }

    /**
     * Adds elements to {@link MetricPack#checkpoints() checkpoints} list.
     * @param elements An iterable of checkpoints elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCheckpoints(Iterable<? extends Checkpoint> elements) {
      for (Checkpoint element : elements) {
        this.checkpoints.add(Objects.requireNonNull(element, "checkpoints element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link MetricPack#items() items} list.
     * @param element A items element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItems(MetricPackItem element) {
      this.items.add(Objects.requireNonNull(element, "items element"));
      return this;
    }

    /**
     * Adds elements to {@link MetricPack#items() items} list.
     * @param elements An array of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItems(MetricPackItem... elements) {
      for (MetricPackItem element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MetricPack#items() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("items")
    public final Builder items(Iterable<? extends MetricPackItem> elements) {
      this.items.clear();
      return addAllItems(elements);
    }

    /**
     * Adds elements to {@link MetricPack#items() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllItems(Iterable<? extends MetricPackItem> elements) {
      for (MetricPackItem element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link MetricPack#relatedReferences() relatedReferences} list.
     * @param element A relatedReferences element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRelatedReferences(EntityReference element) {
      this.relatedReferences.add(Objects.requireNonNull(element, "relatedReferences element"));
      return this;
    }

    /**
     * Adds elements to {@link MetricPack#relatedReferences() relatedReferences} list.
     * @param elements An array of relatedReferences elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRelatedReferences(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.relatedReferences.add(Objects.requireNonNull(element, "relatedReferences element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MetricPack#relatedReferences() relatedReferences} list.
     * @param elements An iterable of relatedReferences elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedReferences")
    public final Builder relatedReferences(Iterable<? extends EntityReference> elements) {
      this.relatedReferences.clear();
      return addAllRelatedReferences(elements);
    }

    /**
     * Adds elements to {@link MetricPack#relatedReferences() relatedReferences} list.
     * @param elements An iterable of relatedReferences elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRelatedReferences(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.relatedReferences.add(Objects.requireNonNull(element, "relatedReferences element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MetricPack#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link MetricPack#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link MetricPack#name() name} attribute.
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
     * Initializes the value for the {@link MetricPack#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMetricPack ImmutableMetricPack}.
     * @return An immutable instance of MetricPack
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMetricPack build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMetricPack(
          createUnmodifiableList(true, checkpoints),
          createUnmodifiableList(true, items),
          createUnmodifiableList(true, relatedReferences),
          id,
          name,
          description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build MetricPack, some of required attributes are not set " + attributes;
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
