package com.khartec.waltz.web.action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UpdateAppCapabilitiesAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdateAppCapabilitiesAction.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UpdateAppCapabilitiesAction"})
@Deprecated
public final class ImmutableUpdateAppCapabilitiesAction
    extends UpdateAppCapabilitiesAction {
  private final List<EntityReference> additions;
  private final List<EntityReference> removals;

  private ImmutableUpdateAppCapabilitiesAction(
      List<EntityReference> additions,
      List<EntityReference> removals) {
    this.additions = additions;
    this.removals = removals;
  }

  /**
   * @return The value of the {@code additions} attribute
   */
  @JsonProperty("additions")
  @Override
  public List<EntityReference> additions() {
    return additions;
  }

  /**
   * @return The value of the {@code removals} attribute
   */
  @JsonProperty("removals")
  @Override
  public List<EntityReference> removals() {
    return removals;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateAppCapabilitiesAction#additions() additions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateAppCapabilitiesAction withAdditions(EntityReference... elements) {
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableUpdateAppCapabilitiesAction(newValue, this.removals);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateAppCapabilitiesAction#additions() additions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of additions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateAppCapabilitiesAction withAdditions(Iterable<? extends EntityReference> elements) {
    if (this.additions == elements) return this;
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableUpdateAppCapabilitiesAction(newValue, this.removals);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateAppCapabilitiesAction#removals() removals}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateAppCapabilitiesAction withRemovals(EntityReference... elements) {
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableUpdateAppCapabilitiesAction(this.additions, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateAppCapabilitiesAction#removals() removals}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of removals elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateAppCapabilitiesAction withRemovals(Iterable<? extends EntityReference> elements) {
    if (this.removals == elements) return this;
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableUpdateAppCapabilitiesAction(this.additions, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdateAppCapabilitiesAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdateAppCapabilitiesAction
        && equalTo((ImmutableUpdateAppCapabilitiesAction) another);
  }

  private boolean equalTo(ImmutableUpdateAppCapabilitiesAction another) {
    return additions.equals(another.additions)
        && removals.equals(another.removals);
  }

  /**
   * Computes a hash code from attributes: {@code additions}, {@code removals}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + additions.hashCode();
    h += (h << 5) + removals.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UpdateAppCapabilitiesAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UpdateAppCapabilitiesAction{"
        + "additions=" + additions
        + ", removals=" + removals
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UpdateAppCapabilitiesAction {
    List<EntityReference> additions = Collections.emptyList();
    List<EntityReference> removals = Collections.emptyList();
    @JsonProperty("additions")
    public void setAdditions(List<EntityReference> additions) {
      this.additions = additions;
    }
    @JsonProperty("removals")
    public void setRemovals(List<EntityReference> removals) {
      this.removals = removals;
    }
    @Override
    public List<EntityReference> additions() { throw new UnsupportedOperationException(); }
    @Override
    public List<EntityReference> removals() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUpdateAppCapabilitiesAction fromJson(Json json) {
    ImmutableUpdateAppCapabilitiesAction.Builder builder = ImmutableUpdateAppCapabilitiesAction.builder();
    if (json.additions != null) {
      builder.addAllAdditions(json.additions);
    }
    if (json.removals != null) {
      builder.addAllRemovals(json.removals);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UpdateAppCapabilitiesAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdateAppCapabilitiesAction instance
   */
  public static ImmutableUpdateAppCapabilitiesAction copyOf(UpdateAppCapabilitiesAction instance) {
    if (instance instanceof ImmutableUpdateAppCapabilitiesAction) {
      return (ImmutableUpdateAppCapabilitiesAction) instance;
    }
    return ImmutableUpdateAppCapabilitiesAction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdateAppCapabilitiesAction ImmutableUpdateAppCapabilitiesAction}.
   * @return A new ImmutableUpdateAppCapabilitiesAction builder
   */
  public static ImmutableUpdateAppCapabilitiesAction.Builder builder() {
    return new ImmutableUpdateAppCapabilitiesAction.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdateAppCapabilitiesAction ImmutableUpdateAppCapabilitiesAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private List<EntityReference> additions = new ArrayList<EntityReference>();
    private List<EntityReference> removals = new ArrayList<EntityReference>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UpdateAppCapabilitiesAction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UpdateAppCapabilitiesAction instance) {
      Objects.requireNonNull(instance, "instance");
      addAllAdditions(instance.additions());
      addAllRemovals(instance.removals());
      return this;
    }

    /**
     * Adds one element to {@link UpdateAppCapabilitiesAction#additions() additions} list.
     * @param element A additions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdditions(EntityReference element) {
      this.additions.add(Objects.requireNonNull(element, "additions element"));
      return this;
    }

    /**
     * Adds elements to {@link UpdateAppCapabilitiesAction#additions() additions} list.
     * @param elements An array of additions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdditions(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.additions.add(Objects.requireNonNull(element, "additions element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UpdateAppCapabilitiesAction#additions() additions} list.
     * @param elements An iterable of additions elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additions")
    public final Builder additions(Iterable<? extends EntityReference> elements) {
      this.additions.clear();
      return addAllAdditions(elements);
    }

    /**
     * Adds elements to {@link UpdateAppCapabilitiesAction#additions() additions} list.
     * @param elements An iterable of additions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdditions(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.additions.add(Objects.requireNonNull(element, "additions element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link UpdateAppCapabilitiesAction#removals() removals} list.
     * @param element A removals element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRemovals(EntityReference element) {
      this.removals.add(Objects.requireNonNull(element, "removals element"));
      return this;
    }

    /**
     * Adds elements to {@link UpdateAppCapabilitiesAction#removals() removals} list.
     * @param elements An array of removals elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRemovals(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.removals.add(Objects.requireNonNull(element, "removals element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UpdateAppCapabilitiesAction#removals() removals} list.
     * @param elements An iterable of removals elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("removals")
    public final Builder removals(Iterable<? extends EntityReference> elements) {
      this.removals.clear();
      return addAllRemovals(elements);
    }

    /**
     * Adds elements to {@link UpdateAppCapabilitiesAction#removals() removals} list.
     * @param elements An iterable of removals elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRemovals(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.removals.add(Objects.requireNonNull(element, "removals element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdateAppCapabilitiesAction ImmutableUpdateAppCapabilitiesAction}.
     * @return An immutable instance of UpdateAppCapabilitiesAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdateAppCapabilitiesAction build() {
      return new ImmutableUpdateAppCapabilitiesAction(createUnmodifiableList(true, additions), createUnmodifiableList(true, removals));
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
