package com.khartec.waltz.web.action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UpdatePhysicalSpecDataTypesAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdatePhysicalSpecDataTypesAction.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UpdatePhysicalSpecDataTypesAction"})
public final class ImmutableUpdatePhysicalSpecDataTypesAction
    extends UpdatePhysicalSpecDataTypesAction {
  private final long specificationId;
  private final Set<Long> addedDataTypeIds;
  private final Set<Long> removedDataTypeIds;

  private ImmutableUpdatePhysicalSpecDataTypesAction(
      long specificationId,
      Set<Long> addedDataTypeIds,
      Set<Long> removedDataTypeIds) {
    this.specificationId = specificationId;
    this.addedDataTypeIds = addedDataTypeIds;
    this.removedDataTypeIds = removedDataTypeIds;
  }

  /**
   * @return The value of the {@code specificationId} attribute
   */
  @JsonProperty("specificationId")
  @Override
  public long specificationId() {
    return specificationId;
  }

  /**
   * @return The value of the {@code addedDataTypeIds} attribute
   */
  @JsonProperty("addedDataTypeIds")
  @Override
  public Set<Long> addedDataTypeIds() {
    return addedDataTypeIds;
  }

  /**
   * @return The value of the {@code removedDataTypeIds} attribute
   */
  @JsonProperty("removedDataTypeIds")
  @Override
  public Set<Long> removedDataTypeIds() {
    return removedDataTypeIds;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UpdatePhysicalSpecDataTypesAction#specificationId() specificationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specificationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUpdatePhysicalSpecDataTypesAction withSpecificationId(long value) {
    if (this.specificationId == value) return this;
    return new ImmutableUpdatePhysicalSpecDataTypesAction(value, this.addedDataTypeIds, this.removedDataTypeIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdatePhysicalSpecDataTypesAction#addedDataTypeIds() addedDataTypeIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdatePhysicalSpecDataTypesAction withAddedDataTypeIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    Set<Long> newValue = createUnmodifiableSet(wrappedList);
    return new ImmutableUpdatePhysicalSpecDataTypesAction(this.specificationId, newValue, this.removedDataTypeIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdatePhysicalSpecDataTypesAction#addedDataTypeIds() addedDataTypeIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of addedDataTypeIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdatePhysicalSpecDataTypesAction withAddedDataTypeIds(Iterable<Long> elements) {
    if (this.addedDataTypeIds == elements) return this;
    Set<Long> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableUpdatePhysicalSpecDataTypesAction(this.specificationId, newValue, this.removedDataTypeIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdatePhysicalSpecDataTypesAction#removedDataTypeIds() removedDataTypeIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdatePhysicalSpecDataTypesAction withRemovedDataTypeIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    Set<Long> newValue = createUnmodifiableSet(wrappedList);
    return new ImmutableUpdatePhysicalSpecDataTypesAction(this.specificationId, this.addedDataTypeIds, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdatePhysicalSpecDataTypesAction#removedDataTypeIds() removedDataTypeIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of removedDataTypeIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdatePhysicalSpecDataTypesAction withRemovedDataTypeIds(Iterable<Long> elements) {
    if (this.removedDataTypeIds == elements) return this;
    Set<Long> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableUpdatePhysicalSpecDataTypesAction(this.specificationId, this.addedDataTypeIds, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdatePhysicalSpecDataTypesAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdatePhysicalSpecDataTypesAction
        && equalTo((ImmutableUpdatePhysicalSpecDataTypesAction) another);
  }

  private boolean equalTo(ImmutableUpdatePhysicalSpecDataTypesAction another) {
    return specificationId == another.specificationId
        && addedDataTypeIds.equals(another.addedDataTypeIds)
        && removedDataTypeIds.equals(another.removedDataTypeIds);
  }

  /**
   * Computes a hash code from attributes: {@code specificationId}, {@code addedDataTypeIds}, {@code removedDataTypeIds}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(specificationId);
    h += (h << 5) + addedDataTypeIds.hashCode();
    h += (h << 5) + removedDataTypeIds.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UpdatePhysicalSpecDataTypesAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UpdatePhysicalSpecDataTypesAction{"
        + "specificationId=" + specificationId
        + ", addedDataTypeIds=" + addedDataTypeIds
        + ", removedDataTypeIds=" + removedDataTypeIds
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UpdatePhysicalSpecDataTypesAction {
    long specificationId;
    boolean specificationIdIsSet;
    Set<Long> addedDataTypeIds = Collections.emptySet();
    Set<Long> removedDataTypeIds = Collections.emptySet();
    @JsonProperty("specificationId")
    public void setSpecificationId(long specificationId) {
      this.specificationId = specificationId;
      this.specificationIdIsSet = true;
    }
    @JsonProperty("addedDataTypeIds")
    public void setAddedDataTypeIds(Set<Long> addedDataTypeIds) {
      this.addedDataTypeIds = addedDataTypeIds;
    }
    @JsonProperty("removedDataTypeIds")
    public void setRemovedDataTypeIds(Set<Long> removedDataTypeIds) {
      this.removedDataTypeIds = removedDataTypeIds;
    }
    @Override
    public long specificationId() { throw new UnsupportedOperationException(); }
    @Override
    public Set<Long> addedDataTypeIds() { throw new UnsupportedOperationException(); }
    @Override
    public Set<Long> removedDataTypeIds() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUpdatePhysicalSpecDataTypesAction fromJson(Json json) {
    ImmutableUpdatePhysicalSpecDataTypesAction.Builder builder = ImmutableUpdatePhysicalSpecDataTypesAction.builder();
    if (json.specificationIdIsSet) {
      builder.specificationId(json.specificationId);
    }
    if (json.addedDataTypeIds != null) {
      builder.addAllAddedDataTypeIds(json.addedDataTypeIds);
    }
    if (json.removedDataTypeIds != null) {
      builder.addAllRemovedDataTypeIds(json.removedDataTypeIds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UpdatePhysicalSpecDataTypesAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdatePhysicalSpecDataTypesAction instance
   */
  public static ImmutableUpdatePhysicalSpecDataTypesAction copyOf(UpdatePhysicalSpecDataTypesAction instance) {
    if (instance instanceof ImmutableUpdatePhysicalSpecDataTypesAction) {
      return (ImmutableUpdatePhysicalSpecDataTypesAction) instance;
    }
    return ImmutableUpdatePhysicalSpecDataTypesAction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdatePhysicalSpecDataTypesAction ImmutableUpdatePhysicalSpecDataTypesAction}.
   * @return A new ImmutableUpdatePhysicalSpecDataTypesAction builder
   */
  public static ImmutableUpdatePhysicalSpecDataTypesAction.Builder builder() {
    return new ImmutableUpdatePhysicalSpecDataTypesAction.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdatePhysicalSpecDataTypesAction ImmutableUpdatePhysicalSpecDataTypesAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SPECIFICATION_ID = 0x1L;
    private long initBits = 0x1L;

    private long specificationId;
    private List<Long> addedDataTypeIds = new ArrayList<Long>();
    private List<Long> removedDataTypeIds = new ArrayList<Long>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UpdatePhysicalSpecDataTypesAction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UpdatePhysicalSpecDataTypesAction instance) {
      Objects.requireNonNull(instance, "instance");
      specificationId(instance.specificationId());
      addAllAddedDataTypeIds(instance.addedDataTypeIds());
      addAllRemovedDataTypeIds(instance.removedDataTypeIds());
      return this;
    }

    /**
     * Initializes the value for the {@link UpdatePhysicalSpecDataTypesAction#specificationId() specificationId} attribute.
     * @param specificationId The value for specificationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specificationId")
    public final Builder specificationId(long specificationId) {
      this.specificationId = specificationId;
      initBits &= ~INIT_BIT_SPECIFICATION_ID;
      return this;
    }

    /**
     * Adds one element to {@link UpdatePhysicalSpecDataTypesAction#addedDataTypeIds() addedDataTypeIds} set.
     * @param element A addedDataTypeIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAddedDataTypeIds(long element) {
      this.addedDataTypeIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UpdatePhysicalSpecDataTypesAction#addedDataTypeIds() addedDataTypeIds} set.
     * @param elements An array of addedDataTypeIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAddedDataTypeIds(long... elements) {
      for (long element : elements) {
        this.addedDataTypeIds.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UpdatePhysicalSpecDataTypesAction#addedDataTypeIds() addedDataTypeIds} set.
     * @param elements An iterable of addedDataTypeIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addedDataTypeIds")
    public final Builder addedDataTypeIds(Iterable<Long> elements) {
      this.addedDataTypeIds.clear();
      return addAllAddedDataTypeIds(elements);
    }

    /**
     * Adds elements to {@link UpdatePhysicalSpecDataTypesAction#addedDataTypeIds() addedDataTypeIds} set.
     * @param elements An iterable of addedDataTypeIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAddedDataTypeIds(Iterable<Long> elements) {
      for (long element : elements) {
        this.addedDataTypeIds.add(Objects.requireNonNull(element, "addedDataTypeIds element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link UpdatePhysicalSpecDataTypesAction#removedDataTypeIds() removedDataTypeIds} set.
     * @param element A removedDataTypeIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRemovedDataTypeIds(long element) {
      this.removedDataTypeIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UpdatePhysicalSpecDataTypesAction#removedDataTypeIds() removedDataTypeIds} set.
     * @param elements An array of removedDataTypeIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRemovedDataTypeIds(long... elements) {
      for (long element : elements) {
        this.removedDataTypeIds.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UpdatePhysicalSpecDataTypesAction#removedDataTypeIds() removedDataTypeIds} set.
     * @param elements An iterable of removedDataTypeIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("removedDataTypeIds")
    public final Builder removedDataTypeIds(Iterable<Long> elements) {
      this.removedDataTypeIds.clear();
      return addAllRemovedDataTypeIds(elements);
    }

    /**
     * Adds elements to {@link UpdatePhysicalSpecDataTypesAction#removedDataTypeIds() removedDataTypeIds} set.
     * @param elements An iterable of removedDataTypeIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRemovedDataTypeIds(Iterable<Long> elements) {
      for (long element : elements) {
        this.removedDataTypeIds.add(Objects.requireNonNull(element, "removedDataTypeIds element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdatePhysicalSpecDataTypesAction ImmutableUpdatePhysicalSpecDataTypesAction}.
     * @return An immutable instance of UpdatePhysicalSpecDataTypesAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdatePhysicalSpecDataTypesAction build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUpdatePhysicalSpecDataTypesAction(
          specificationId,
          createUnmodifiableSet(addedDataTypeIds),
          createUnmodifiableSet(removedDataTypeIds));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SPECIFICATION_ID) != 0) attributes.add("specificationId");
      return "Cannot build UpdatePhysicalSpecDataTypesAction, some of required attributes are not set " + attributes;
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

  /** Unmodifiable set constructed from list to avoid rehashing. */
  private static <T> Set<T> createUnmodifiableSet(List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default:
      Set<T> set = new LinkedHashSet<T>(list.size());
      set.addAll(list);
      return Collections.unmodifiableSet(set);
    }
  }
}
