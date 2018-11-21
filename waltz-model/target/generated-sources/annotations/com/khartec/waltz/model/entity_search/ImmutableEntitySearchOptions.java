package com.khartec.waltz.model.entity_search;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityLifecycleStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntitySearchOptions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntitySearchOptions.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntitySearchOptions"})
public final class ImmutableEntitySearchOptions
    extends EntitySearchOptions {
  private final List<EntityKind> entityKinds;
  private final List<EntityLifecycleStatus> entityLifecycleStatuses;
  private final int limit;
  private final String userId;

  private ImmutableEntitySearchOptions(ImmutableEntitySearchOptions.Builder builder) {
    this.entityKinds = createUnmodifiableList(true, builder.entityKinds);
    if (builder.entityLifecycleStatusesIsSet()) {
      initShim.entityLifecycleStatuses(createUnmodifiableList(true, builder.entityLifecycleStatuses));
    }
    if (builder.limitIsSet()) {
      initShim.limit(builder.limit);
    }
    if (builder.userId != null) {
      initShim.userId(builder.userId);
    }
    this.entityLifecycleStatuses = initShim.entityLifecycleStatuses();
    this.limit = initShim.limit();
    this.userId = initShim.userId();
    this.initShim = null;
  }

  private ImmutableEntitySearchOptions(
      List<EntityKind> entityKinds,
      List<EntityLifecycleStatus> entityLifecycleStatuses,
      int limit,
      String userId) {
    this.entityKinds = entityKinds;
    this.entityLifecycleStatuses = entityLifecycleStatuses;
    this.limit = limit;
    this.userId = userId;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private List<EntityLifecycleStatus> entityLifecycleStatuses;
    private int entityLifecycleStatusesBuildStage;

    List<EntityLifecycleStatus> entityLifecycleStatuses() {
      if (entityLifecycleStatusesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (entityLifecycleStatusesBuildStage == STAGE_UNINITIALIZED) {
        entityLifecycleStatusesBuildStage = STAGE_INITIALIZING;
        this.entityLifecycleStatuses = createUnmodifiableList(false, createSafeList(ImmutableEntitySearchOptions.super.entityLifecycleStatuses(), true, false));
        entityLifecycleStatusesBuildStage = STAGE_INITIALIZED;
      }
      return this.entityLifecycleStatuses;
    }

    void entityLifecycleStatuses(List<EntityLifecycleStatus> entityLifecycleStatuses) {
      this.entityLifecycleStatuses = entityLifecycleStatuses;
      entityLifecycleStatusesBuildStage = STAGE_INITIALIZED;
    }
    private int limit;
    private int limitBuildStage;

    int limit() {
      if (limitBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (limitBuildStage == STAGE_UNINITIALIZED) {
        limitBuildStage = STAGE_INITIALIZING;
        this.limit = ImmutableEntitySearchOptions.super.limit();
        limitBuildStage = STAGE_INITIALIZED;
      }
      return this.limit;
    }

    void limit(int limit) {
      this.limit = limit;
      limitBuildStage = STAGE_INITIALIZED;
    }
    private String userId;
    private int userIdBuildStage;

    String userId() {
      if (userIdBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (userIdBuildStage == STAGE_UNINITIALIZED) {
        userIdBuildStage = STAGE_INITIALIZING;
        this.userId = Objects.requireNonNull(ImmutableEntitySearchOptions.super.userId(), "userId");
        userIdBuildStage = STAGE_INITIALIZED;
      }
      return this.userId;
    }

    void userId(String userId) {
      this.userId = userId;
      userIdBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (entityLifecycleStatusesBuildStage == STAGE_INITIALIZING) attributes.add("entityLifecycleStatuses");
      if (limitBuildStage == STAGE_INITIALIZING) attributes.add("limit");
      if (userIdBuildStage == STAGE_INITIALIZING) attributes.add("userId");
      return "Cannot build EntitySearchOptions, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code entityKinds} attribute
   */
  @JsonProperty("entityKinds")
  @Override
  public List<EntityKind> entityKinds() {
    return entityKinds;
  }

  /**
   * @return The value of the {@code entityLifecycleStatuses} attribute
   */
  @JsonProperty("entityLifecycleStatuses")
  @Override
  public List<EntityLifecycleStatus> entityLifecycleStatuses() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.entityLifecycleStatuses()
        : this.entityLifecycleStatuses;
  }

  /**
   * @return The value of the {@code limit} attribute
   */
  @JsonProperty("limit")
  @Override
  public int limit() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.limit()
        : this.limit;
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @JsonProperty("userId")
  @Override
  public String userId() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.userId()
        : this.userId;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntitySearchOptions#entityKinds() entityKinds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySearchOptions withEntityKinds(EntityKind... elements) {
    List<EntityKind> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableEntitySearchOptions(newValue, this.entityLifecycleStatuses, this.limit, this.userId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntitySearchOptions#entityKinds() entityKinds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of entityKinds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySearchOptions withEntityKinds(Iterable<? extends EntityKind> elements) {
    if (this.entityKinds == elements) return this;
    List<EntityKind> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEntitySearchOptions(newValue, this.entityLifecycleStatuses, this.limit, this.userId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntitySearchOptions#entityLifecycleStatuses() entityLifecycleStatuses}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySearchOptions withEntityLifecycleStatuses(EntityLifecycleStatus... elements) {
    List<EntityLifecycleStatus> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableEntitySearchOptions(this.entityKinds, newValue, this.limit, this.userId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntitySearchOptions#entityLifecycleStatuses() entityLifecycleStatuses}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of entityLifecycleStatuses elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySearchOptions withEntityLifecycleStatuses(Iterable<? extends EntityLifecycleStatus> elements) {
    if (this.entityLifecycleStatuses == elements) return this;
    List<EntityLifecycleStatus> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEntitySearchOptions(this.entityKinds, newValue, this.limit, this.userId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntitySearchOptions#limit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySearchOptions withLimit(int value) {
    if (this.limit == value) return this;
    return new ImmutableEntitySearchOptions(this.entityKinds, this.entityLifecycleStatuses, value, this.userId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntitySearchOptions#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySearchOptions withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableEntitySearchOptions(this.entityKinds, this.entityLifecycleStatuses, this.limit, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntitySearchOptions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntitySearchOptions
        && equalTo((ImmutableEntitySearchOptions) another);
  }

  private boolean equalTo(ImmutableEntitySearchOptions another) {
    return entityKinds.equals(another.entityKinds)
        && entityLifecycleStatuses.equals(another.entityLifecycleStatuses)
        && limit == another.limit
        && userId.equals(another.userId);
  }

  /**
   * Computes a hash code from attributes: {@code entityKinds}, {@code entityLifecycleStatuses}, {@code limit}, {@code userId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityKinds.hashCode();
    h += (h << 5) + entityLifecycleStatuses.hashCode();
    h += (h << 5) + limit;
    h += (h << 5) + userId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntitySearchOptions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntitySearchOptions{"
        + "entityKinds=" + entityKinds
        + ", entityLifecycleStatuses=" + entityLifecycleStatuses
        + ", limit=" + limit
        + ", userId=" + userId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntitySearchOptions {
    List<EntityKind> entityKinds = Collections.emptyList();
    List<EntityLifecycleStatus> entityLifecycleStatuses = Collections.emptyList();
    boolean entityLifecycleStatusesIsSet;
    int limit;
    boolean limitIsSet;
    String userId;
    @JsonProperty("entityKinds")
    public void setEntityKinds(List<EntityKind> entityKinds) {
      this.entityKinds = entityKinds;
    }
    @JsonProperty("entityLifecycleStatuses")
    public void setEntityLifecycleStatuses(List<EntityLifecycleStatus> entityLifecycleStatuses) {
      this.entityLifecycleStatuses = entityLifecycleStatuses;
      this.entityLifecycleStatusesIsSet = true;
    }
    @JsonProperty("limit")
    public void setLimit(int limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @Override
    public List<EntityKind> entityKinds() { throw new UnsupportedOperationException(); }
    @Override
    public List<EntityLifecycleStatus> entityLifecycleStatuses() { throw new UnsupportedOperationException(); }
    @Override
    public int limit() { throw new UnsupportedOperationException(); }
    @Override
    public String userId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntitySearchOptions fromJson(Json json) {
    ImmutableEntitySearchOptions.Builder builder = ImmutableEntitySearchOptions.builder();
    if (json.entityKinds != null) {
      builder.addAllEntityKinds(json.entityKinds);
    }
    if (json.entityLifecycleStatusesIsSet) {
      builder.addAllEntityLifecycleStatuses(json.entityLifecycleStatuses);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntitySearchOptions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntitySearchOptions instance
   */
  public static ImmutableEntitySearchOptions copyOf(EntitySearchOptions instance) {
    if (instance instanceof ImmutableEntitySearchOptions) {
      return (ImmutableEntitySearchOptions) instance;
    }
    return ImmutableEntitySearchOptions.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntitySearchOptions ImmutableEntitySearchOptions}.
   * @return A new ImmutableEntitySearchOptions builder
   */
  public static ImmutableEntitySearchOptions.Builder builder() {
    return new ImmutableEntitySearchOptions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntitySearchOptions ImmutableEntitySearchOptions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long OPT_BIT_ENTITY_LIFECYCLE_STATUSES = 0x1L;
    private static final long OPT_BIT_LIMIT = 0x2L;
    private long optBits;

    private List<EntityKind> entityKinds = new ArrayList<EntityKind>();
    private List<EntityLifecycleStatus> entityLifecycleStatuses = new ArrayList<EntityLifecycleStatus>();
    private int limit;
    private String userId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntitySearchOptions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntitySearchOptions instance) {
      Objects.requireNonNull(instance, "instance");
      addAllEntityKinds(instance.entityKinds());
      addAllEntityLifecycleStatuses(instance.entityLifecycleStatuses());
      limit(instance.limit());
      userId(instance.userId());
      return this;
    }

    /**
     * Adds one element to {@link EntitySearchOptions#entityKinds() entityKinds} list.
     * @param element A entityKinds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntityKinds(EntityKind element) {
      this.entityKinds.add(Objects.requireNonNull(element, "entityKinds element"));
      return this;
    }

    /**
     * Adds elements to {@link EntitySearchOptions#entityKinds() entityKinds} list.
     * @param elements An array of entityKinds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntityKinds(EntityKind... elements) {
      for (EntityKind element : elements) {
        this.entityKinds.add(Objects.requireNonNull(element, "entityKinds element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link EntitySearchOptions#entityKinds() entityKinds} list.
     * @param elements An iterable of entityKinds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityKinds")
    public final Builder entityKinds(Iterable<? extends EntityKind> elements) {
      this.entityKinds.clear();
      return addAllEntityKinds(elements);
    }

    /**
     * Adds elements to {@link EntitySearchOptions#entityKinds() entityKinds} list.
     * @param elements An iterable of entityKinds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEntityKinds(Iterable<? extends EntityKind> elements) {
      for (EntityKind element : elements) {
        this.entityKinds.add(Objects.requireNonNull(element, "entityKinds element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link EntitySearchOptions#entityLifecycleStatuses() entityLifecycleStatuses} list.
     * @param element A entityLifecycleStatuses element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntityLifecycleStatuses(EntityLifecycleStatus element) {
      this.entityLifecycleStatuses.add(Objects.requireNonNull(element, "entityLifecycleStatuses element"));
      optBits |= OPT_BIT_ENTITY_LIFECYCLE_STATUSES;
      return this;
    }

    /**
     * Adds elements to {@link EntitySearchOptions#entityLifecycleStatuses() entityLifecycleStatuses} list.
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
     * Sets or replaces all elements for {@link EntitySearchOptions#entityLifecycleStatuses() entityLifecycleStatuses} list.
     * @param elements An iterable of entityLifecycleStatuses elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatuses")
    public final Builder entityLifecycleStatuses(Iterable<? extends EntityLifecycleStatus> elements) {
      this.entityLifecycleStatuses.clear();
      return addAllEntityLifecycleStatuses(elements);
    }

    /**
     * Adds elements to {@link EntitySearchOptions#entityLifecycleStatuses() entityLifecycleStatuses} list.
     * @param elements An iterable of entityLifecycleStatuses elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEntityLifecycleStatuses(Iterable<? extends EntityLifecycleStatus> elements) {
      for (EntityLifecycleStatus element : elements) {
        this.entityLifecycleStatuses.add(Objects.requireNonNull(element, "entityLifecycleStatuses element"));
      }
      optBits |= OPT_BIT_ENTITY_LIFECYCLE_STATUSES;
      return this;
    }

    /**
     * Initializes the value for the {@link EntitySearchOptions#limit() limit} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntitySearchOptions#limit() limit}.</em>
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("limit")
    public final Builder limit(int limit) {
      this.limit = limit;
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the value for the {@link EntitySearchOptions#userId() userId} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntitySearchOptions#userId() userId}.</em>
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userId")
    public final Builder userId(String userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntitySearchOptions ImmutableEntitySearchOptions}.
     * @return An immutable instance of EntitySearchOptions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntitySearchOptions build() {
      return new ImmutableEntitySearchOptions(this);
    }

    private boolean entityLifecycleStatusesIsSet() {
      return (optBits & OPT_BIT_ENTITY_LIFECYCLE_STATUSES) != 0;
    }

    private boolean limitIsSet() {
      return (optBits & OPT_BIT_LIMIT) != 0;
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
