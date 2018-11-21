package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link IdSelectionOptions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIdSelectionOptions.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "IdSelectionOptions"})
public final class ImmutableIdSelectionOptions extends IdSelectionOptions {
  private final EntityReference entityReference;
  private final HierarchyQueryScope scope;
  private final Set<EntityLifecycleStatus> entityLifecycleStatuses;

  private ImmutableIdSelectionOptions(ImmutableIdSelectionOptions.Builder builder) {
    this.entityReference = builder.entityReference;
    this.scope = builder.scope;
    this.entityLifecycleStatuses = builder.entityLifecycleStatusesIsSet()
        ? createUnmodifiableEnumSet(builder.entityLifecycleStatuses)
        : createUnmodifiableEnumSet(super.entityLifecycleStatuses());
  }

  private ImmutableIdSelectionOptions(
      EntityReference entityReference,
      HierarchyQueryScope scope,
      Set<EntityLifecycleStatus> entityLifecycleStatuses) {
    this.entityReference = entityReference;
    this.scope = scope;
    this.entityLifecycleStatuses = entityLifecycleStatuses;
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public HierarchyQueryScope scope() {
    return scope;
  }

  /**
   * @return The value of the {@code entityLifecycleStatuses} attribute
   */
  @JsonProperty("entityLifecycleStatuses")
  @Override
  public Set<EntityLifecycleStatus> entityLifecycleStatuses() {
    return entityLifecycleStatuses;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link IdSelectionOptions#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableIdSelectionOptions withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableIdSelectionOptions(newValue, this.scope, this.entityLifecycleStatuses);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link IdSelectionOptions#scope() scope} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scope
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableIdSelectionOptions withScope(HierarchyQueryScope value) {
    if (this.scope == value) return this;
    HierarchyQueryScope newValue = Objects.requireNonNull(value, "scope");
    return new ImmutableIdSelectionOptions(this.entityReference, newValue, this.entityLifecycleStatuses);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link IdSelectionOptions#entityLifecycleStatuses() entityLifecycleStatuses}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdSelectionOptions withEntityLifecycleStatuses(EntityLifecycleStatus... elements) {
    Set<EntityLifecycleStatus> newValue = createUnmodifiableEnumSet(Arrays.asList(elements));
    return new ImmutableIdSelectionOptions(this.entityReference, this.scope, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link IdSelectionOptions#entityLifecycleStatuses() entityLifecycleStatuses}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of entityLifecycleStatuses elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdSelectionOptions withEntityLifecycleStatuses(Iterable<EntityLifecycleStatus> elements) {
    if (this.entityLifecycleStatuses == elements) return this;
    Set<EntityLifecycleStatus> newValue = createUnmodifiableEnumSet(elements);
    return new ImmutableIdSelectionOptions(this.entityReference, this.scope, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIdSelectionOptions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIdSelectionOptions
        && equalTo((ImmutableIdSelectionOptions) another);
  }

  private boolean equalTo(ImmutableIdSelectionOptions another) {
    return entityReference.equals(another.entityReference)
        && scope.equals(another.scope)
        && entityLifecycleStatuses.equals(another.entityLifecycleStatuses);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code scope}, {@code entityLifecycleStatuses}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + scope.hashCode();
    h += (h << 5) + entityLifecycleStatuses.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code IdSelectionOptions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "IdSelectionOptions{"
        + "entityReference=" + entityReference
        + ", scope=" + scope
        + ", entityLifecycleStatuses=" + entityLifecycleStatuses
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends IdSelectionOptions {
    EntityReference entityReference;
    HierarchyQueryScope scope;
    Set<EntityLifecycleStatus> entityLifecycleStatuses = Collections.emptySet();
    boolean entityLifecycleStatusesIsSet;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("scope")
    public void setScope(HierarchyQueryScope scope) {
      this.scope = scope;
    }
    @JsonProperty("entityLifecycleStatuses")
    public void setEntityLifecycleStatuses(Set<EntityLifecycleStatus> entityLifecycleStatuses) {
      this.entityLifecycleStatuses = entityLifecycleStatuses;
      this.entityLifecycleStatusesIsSet = true;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public HierarchyQueryScope scope() { throw new UnsupportedOperationException(); }
    @Override
    public Set<EntityLifecycleStatus> entityLifecycleStatuses() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableIdSelectionOptions fromJson(Json json) {
    ImmutableIdSelectionOptions.Builder builder = ImmutableIdSelectionOptions.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.scope != null) {
      builder.scope(json.scope);
    }
    if (json.entityLifecycleStatusesIsSet) {
      builder.addAllEntityLifecycleStatuses(json.entityLifecycleStatuses);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link IdSelectionOptions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable IdSelectionOptions instance
   */
  public static ImmutableIdSelectionOptions copyOf(IdSelectionOptions instance) {
    if (instance instanceof ImmutableIdSelectionOptions) {
      return (ImmutableIdSelectionOptions) instance;
    }
    return ImmutableIdSelectionOptions.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableIdSelectionOptions ImmutableIdSelectionOptions}.
   * @return A new ImmutableIdSelectionOptions builder
   */
  public static ImmutableIdSelectionOptions.Builder builder() {
    return new ImmutableIdSelectionOptions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableIdSelectionOptions ImmutableIdSelectionOptions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_SCOPE = 0x2L;
    private static final long OPT_BIT_ENTITY_LIFECYCLE_STATUSES = 0x1L;
    private long initBits = 0x3L;
    private long optBits;

    private EntityReference entityReference;
    private HierarchyQueryScope scope;
    private EnumSet<EntityLifecycleStatus> entityLifecycleStatuses = EnumSet.noneOf(EntityLifecycleStatus.class);

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code IdSelectionOptions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdSelectionOptions instance) {
      Objects.requireNonNull(instance, "instance");
      entityReference(instance.entityReference());
      scope(instance.scope());
      addAllEntityLifecycleStatuses(instance.entityLifecycleStatuses());
      return this;
    }

    /**
     * Initializes the value for the {@link IdSelectionOptions#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link IdSelectionOptions#scope() scope} attribute.
     * @param scope The value for scope 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(HierarchyQueryScope scope) {
      this.scope = Objects.requireNonNull(scope, "scope");
      initBits &= ~INIT_BIT_SCOPE;
      return this;
    }

    /**
     * Adds one element to {@link IdSelectionOptions#entityLifecycleStatuses() entityLifecycleStatuses} set.
     * @param element A entityLifecycleStatuses element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntityLifecycleStatuses(EntityLifecycleStatus element) {
      this.entityLifecycleStatuses.add(Objects.requireNonNull(element, "entityLifecycleStatuses element"));
      optBits |= OPT_BIT_ENTITY_LIFECYCLE_STATUSES;
      return this;
    }

    /**
     * Adds elements to {@link IdSelectionOptions#entityLifecycleStatuses() entityLifecycleStatuses} set.
     * @param elements An array of entityLifecycleStatuses elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntityLifecycleStatuses(EntityLifecycleStatus... elements) {
      for (EntityLifecycleStatus element : elements) {
        this.entityLifecycleStatuses.add(Objects.requireNonNull(element, "entityLifecycleStatuses element"));
      }
      optBits |= OPT_BIT_ENTITY_LIFECYCLE_STATUSES;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link IdSelectionOptions#entityLifecycleStatuses() entityLifecycleStatuses} set.
     * @param elements An iterable of entityLifecycleStatuses elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatuses")
    public final Builder entityLifecycleStatuses(Iterable<EntityLifecycleStatus> elements) {
      this.entityLifecycleStatuses.clear();
      return addAllEntityLifecycleStatuses(elements);
    }

    /**
     * Adds elements to {@link IdSelectionOptions#entityLifecycleStatuses() entityLifecycleStatuses} set.
     * @param elements An iterable of entityLifecycleStatuses elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEntityLifecycleStatuses(Iterable<EntityLifecycleStatus> elements) {
      for (EntityLifecycleStatus element : elements) {
        this.entityLifecycleStatuses.add(Objects.requireNonNull(element, "entityLifecycleStatuses element"));
      }
      optBits |= OPT_BIT_ENTITY_LIFECYCLE_STATUSES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableIdSelectionOptions ImmutableIdSelectionOptions}.
     * @return An immutable instance of IdSelectionOptions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableIdSelectionOptions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableIdSelectionOptions(this);
    }

    private boolean entityLifecycleStatusesIsSet() {
      return (optBits & OPT_BIT_ENTITY_LIFECYCLE_STATUSES) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_SCOPE) != 0) attributes.add("scope");
      return "Cannot build IdSelectionOptions, some of required attributes are not set " + attributes;
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

  private static <T extends Enum<T>> Set<T> createUnmodifiableEnumSet(Iterable<T> iterable) {
    if (iterable instanceof EnumSet<?>) {
      return Collections.unmodifiableSet(EnumSet.copyOf((EnumSet<T>) iterable));
    }
    List<T> list = createSafeList(iterable, true, false);
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default: return Collections.unmodifiableSet(EnumSet.copyOf(list));
    }
  }
}
