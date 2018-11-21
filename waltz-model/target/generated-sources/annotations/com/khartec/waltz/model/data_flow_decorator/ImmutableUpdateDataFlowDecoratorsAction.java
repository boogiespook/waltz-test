package com.khartec.waltz.model.data_flow_decorator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UpdateDataFlowDecoratorsAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdateDataFlowDecoratorsAction.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UpdateDataFlowDecoratorsAction"})
public final class ImmutableUpdateDataFlowDecoratorsAction
    extends UpdateDataFlowDecoratorsAction {
  private final Set<EntityReference> addedDecorators;
  private final Set<EntityReference> removedDecorators;
  private final Long flowId;

  private ImmutableUpdateDataFlowDecoratorsAction(
      Set<EntityReference> addedDecorators,
      Set<EntityReference> removedDecorators,
      Long flowId) {
    this.addedDecorators = addedDecorators;
    this.removedDecorators = removedDecorators;
    this.flowId = flowId;
  }

  /**
   * @return The value of the {@code addedDecorators} attribute
   */
  @JsonProperty("addedDecorators")
  @Override
  public Set<EntityReference> addedDecorators() {
    return addedDecorators;
  }

  /**
   * @return The value of the {@code removedDecorators} attribute
   */
  @JsonProperty("removedDecorators")
  @Override
  public Set<EntityReference> removedDecorators() {
    return removedDecorators;
  }

  /**
   * @return The value of the {@code flowId} attribute
   */
  @JsonProperty("flowId")
  @Override
  public Long flowId() {
    return flowId;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateDataFlowDecoratorsAction#addedDecorators() addedDecorators}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateDataFlowDecoratorsAction withAddedDecorators(EntityReference... elements) {
    Set<EntityReference> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableUpdateDataFlowDecoratorsAction(newValue, this.removedDecorators, this.flowId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateDataFlowDecoratorsAction#addedDecorators() addedDecorators}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of addedDecorators elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateDataFlowDecoratorsAction withAddedDecorators(Iterable<? extends EntityReference> elements) {
    if (this.addedDecorators == elements) return this;
    Set<EntityReference> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableUpdateDataFlowDecoratorsAction(newValue, this.removedDecorators, this.flowId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateDataFlowDecoratorsAction#removedDecorators() removedDecorators}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateDataFlowDecoratorsAction withRemovedDecorators(EntityReference... elements) {
    Set<EntityReference> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableUpdateDataFlowDecoratorsAction(this.addedDecorators, newValue, this.flowId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateDataFlowDecoratorsAction#removedDecorators() removedDecorators}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of removedDecorators elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateDataFlowDecoratorsAction withRemovedDecorators(Iterable<? extends EntityReference> elements) {
    if (this.removedDecorators == elements) return this;
    Set<EntityReference> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableUpdateDataFlowDecoratorsAction(this.addedDecorators, newValue, this.flowId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UpdateDataFlowDecoratorsAction#flowId() flowId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for flowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUpdateDataFlowDecoratorsAction withFlowId(Long value) {
    if (this.flowId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "flowId");
    return new ImmutableUpdateDataFlowDecoratorsAction(this.addedDecorators, this.removedDecorators, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdateDataFlowDecoratorsAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdateDataFlowDecoratorsAction
        && equalTo((ImmutableUpdateDataFlowDecoratorsAction) another);
  }

  private boolean equalTo(ImmutableUpdateDataFlowDecoratorsAction another) {
    return addedDecorators.equals(another.addedDecorators)
        && removedDecorators.equals(another.removedDecorators)
        && flowId.equals(another.flowId);
  }

  /**
   * Computes a hash code from attributes: {@code addedDecorators}, {@code removedDecorators}, {@code flowId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + addedDecorators.hashCode();
    h += (h << 5) + removedDecorators.hashCode();
    h += (h << 5) + flowId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UpdateDataFlowDecoratorsAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UpdateDataFlowDecoratorsAction{"
        + "addedDecorators=" + addedDecorators
        + ", removedDecorators=" + removedDecorators
        + ", flowId=" + flowId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UpdateDataFlowDecoratorsAction {
    Set<EntityReference> addedDecorators = Collections.emptySet();
    Set<EntityReference> removedDecorators = Collections.emptySet();
    Long flowId;
    @JsonProperty("addedDecorators")
    public void setAddedDecorators(Set<EntityReference> addedDecorators) {
      this.addedDecorators = addedDecorators;
    }
    @JsonProperty("removedDecorators")
    public void setRemovedDecorators(Set<EntityReference> removedDecorators) {
      this.removedDecorators = removedDecorators;
    }
    @JsonProperty("flowId")
    public void setFlowId(Long flowId) {
      this.flowId = flowId;
    }
    @Override
    public Set<EntityReference> addedDecorators() { throw new UnsupportedOperationException(); }
    @Override
    public Set<EntityReference> removedDecorators() { throw new UnsupportedOperationException(); }
    @Override
    public Long flowId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUpdateDataFlowDecoratorsAction fromJson(Json json) {
    ImmutableUpdateDataFlowDecoratorsAction.Builder builder = ImmutableUpdateDataFlowDecoratorsAction.builder();
    if (json.addedDecorators != null) {
      builder.addAllAddedDecorators(json.addedDecorators);
    }
    if (json.removedDecorators != null) {
      builder.addAllRemovedDecorators(json.removedDecorators);
    }
    if (json.flowId != null) {
      builder.flowId(json.flowId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UpdateDataFlowDecoratorsAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdateDataFlowDecoratorsAction instance
   */
  public static ImmutableUpdateDataFlowDecoratorsAction copyOf(UpdateDataFlowDecoratorsAction instance) {
    if (instance instanceof ImmutableUpdateDataFlowDecoratorsAction) {
      return (ImmutableUpdateDataFlowDecoratorsAction) instance;
    }
    return ImmutableUpdateDataFlowDecoratorsAction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdateDataFlowDecoratorsAction ImmutableUpdateDataFlowDecoratorsAction}.
   * @return A new ImmutableUpdateDataFlowDecoratorsAction builder
   */
  public static ImmutableUpdateDataFlowDecoratorsAction.Builder builder() {
    return new ImmutableUpdateDataFlowDecoratorsAction.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdateDataFlowDecoratorsAction ImmutableUpdateDataFlowDecoratorsAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_FLOW_ID = 0x1L;
    private long initBits = 0x1L;

    private List<EntityReference> addedDecorators = new ArrayList<EntityReference>();
    private List<EntityReference> removedDecorators = new ArrayList<EntityReference>();
    private Long flowId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UpdateDataFlowDecoratorsAction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UpdateDataFlowDecoratorsAction instance) {
      Objects.requireNonNull(instance, "instance");
      addAllAddedDecorators(instance.addedDecorators());
      addAllRemovedDecorators(instance.removedDecorators());
      flowId(instance.flowId());
      return this;
    }

    /**
     * Adds one element to {@link UpdateDataFlowDecoratorsAction#addedDecorators() addedDecorators} set.
     * @param element A addedDecorators element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAddedDecorators(EntityReference element) {
      this.addedDecorators.add(Objects.requireNonNull(element, "addedDecorators element"));
      return this;
    }

    /**
     * Adds elements to {@link UpdateDataFlowDecoratorsAction#addedDecorators() addedDecorators} set.
     * @param elements An array of addedDecorators elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAddedDecorators(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.addedDecorators.add(Objects.requireNonNull(element, "addedDecorators element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UpdateDataFlowDecoratorsAction#addedDecorators() addedDecorators} set.
     * @param elements An iterable of addedDecorators elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addedDecorators")
    public final Builder addedDecorators(Iterable<? extends EntityReference> elements) {
      this.addedDecorators.clear();
      return addAllAddedDecorators(elements);
    }

    /**
     * Adds elements to {@link UpdateDataFlowDecoratorsAction#addedDecorators() addedDecorators} set.
     * @param elements An iterable of addedDecorators elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAddedDecorators(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.addedDecorators.add(Objects.requireNonNull(element, "addedDecorators element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link UpdateDataFlowDecoratorsAction#removedDecorators() removedDecorators} set.
     * @param element A removedDecorators element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRemovedDecorators(EntityReference element) {
      this.removedDecorators.add(Objects.requireNonNull(element, "removedDecorators element"));
      return this;
    }

    /**
     * Adds elements to {@link UpdateDataFlowDecoratorsAction#removedDecorators() removedDecorators} set.
     * @param elements An array of removedDecorators elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRemovedDecorators(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.removedDecorators.add(Objects.requireNonNull(element, "removedDecorators element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UpdateDataFlowDecoratorsAction#removedDecorators() removedDecorators} set.
     * @param elements An iterable of removedDecorators elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("removedDecorators")
    public final Builder removedDecorators(Iterable<? extends EntityReference> elements) {
      this.removedDecorators.clear();
      return addAllRemovedDecorators(elements);
    }

    /**
     * Adds elements to {@link UpdateDataFlowDecoratorsAction#removedDecorators() removedDecorators} set.
     * @param elements An iterable of removedDecorators elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRemovedDecorators(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.removedDecorators.add(Objects.requireNonNull(element, "removedDecorators element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link UpdateDataFlowDecoratorsAction#flowId() flowId} attribute.
     * @param flowId The value for flowId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("flowId")
    public final Builder flowId(Long flowId) {
      this.flowId = Objects.requireNonNull(flowId, "flowId");
      initBits &= ~INIT_BIT_FLOW_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdateDataFlowDecoratorsAction ImmutableUpdateDataFlowDecoratorsAction}.
     * @return An immutable instance of UpdateDataFlowDecoratorsAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdateDataFlowDecoratorsAction build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUpdateDataFlowDecoratorsAction(createUnmodifiableSet(addedDecorators), createUnmodifiableSet(removedDecorators), flowId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_FLOW_ID) != 0) attributes.add("flowId");
      return "Cannot build UpdateDataFlowDecoratorsAction, some of required attributes are not set " + attributes;
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
