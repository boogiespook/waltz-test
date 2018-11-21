package com.khartec.waltz.model.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SystemChangeSet}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSystemChangeSet.<V, K>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SystemChangeSet<V, K>"})
public final class ImmutableSystemChangeSet<V, K> extends SystemChangeSet<V, K> {
  private final List<V> updates;
  private final List<K> deletes;
  private final List<V> inserts;

  private ImmutableSystemChangeSet(List<V> updates, List<K> deletes, List<V> inserts) {
    this.updates = updates;
    this.deletes = deletes;
    this.inserts = inserts;
  }

  /**
   * @return The value of the {@code updates} attribute
   */
  @Override
  public List<V> updates() {
    return updates;
  }

  /**
   * @return The value of the {@code deletes} attribute
   */
  @Override
  public List<K> deletes() {
    return deletes;
  }

  /**
   * @return The value of the {@code inserts} attribute
   */
  @Override
  public List<V> inserts() {
    return inserts;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SystemChangeSet#updates() updates}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableSystemChangeSet<V, K> withUpdates(V... elements) {
    List<V> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSystemChangeSet<V, K>(newValue, this.deletes, this.inserts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SystemChangeSet#updates() updates}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of updates elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSystemChangeSet<V, K> withUpdates(Iterable<? extends V> elements) {
    if (this.updates == elements) return this;
    List<V> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSystemChangeSet<V, K>(newValue, this.deletes, this.inserts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SystemChangeSet#deletes() deletes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableSystemChangeSet<V, K> withDeletes(K... elements) {
    List<K> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSystemChangeSet<V, K>(this.updates, newValue, this.inserts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SystemChangeSet#deletes() deletes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of deletes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSystemChangeSet<V, K> withDeletes(Iterable<? extends K> elements) {
    if (this.deletes == elements) return this;
    List<K> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSystemChangeSet<V, K>(this.updates, newValue, this.inserts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SystemChangeSet#inserts() inserts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableSystemChangeSet<V, K> withInserts(V... elements) {
    List<V> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSystemChangeSet<V, K>(this.updates, this.deletes, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SystemChangeSet#inserts() inserts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of inserts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSystemChangeSet<V, K> withInserts(Iterable<? extends V> elements) {
    if (this.inserts == elements) return this;
    List<V> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSystemChangeSet<V, K>(this.updates, this.deletes, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSystemChangeSet} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSystemChangeSet<?, ?>
        && equalTo((ImmutableSystemChangeSet<V, K>) another);
  }

  private boolean equalTo(ImmutableSystemChangeSet<V, K> another) {
    return updates.equals(another.updates)
        && deletes.equals(another.deletes)
        && inserts.equals(another.inserts);
  }

  /**
   * Computes a hash code from attributes: {@code updates}, {@code deletes}, {@code inserts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + updates.hashCode();
    h += (h << 5) + deletes.hashCode();
    h += (h << 5) + inserts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SystemChangeSet} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SystemChangeSet{"
        + "updates=" + updates
        + ", deletes=" + deletes
        + ", inserts=" + inserts
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link SystemChangeSet} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <V> generic parameter V
   * @param <K> generic parameter K
   * @param instance The instance to copy
   * @return A copied immutable SystemChangeSet instance
   */
  public static <V, K> ImmutableSystemChangeSet<V, K> copyOf(SystemChangeSet<V, K> instance) {
    if (instance instanceof ImmutableSystemChangeSet<?, ?>) {
      return (ImmutableSystemChangeSet<V, K>) instance;
    }
    return ImmutableSystemChangeSet.<V, K>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSystemChangeSet ImmutableSystemChangeSet}.
   * @param <V> generic parameter V
   * @param <K> generic parameter K
   * @return A new ImmutableSystemChangeSet builder
   */
  public static <V, K> ImmutableSystemChangeSet.Builder<V, K> builder() {
    return new ImmutableSystemChangeSet.Builder<V, K>();
  }

  /**
   * Builds instances of type {@link ImmutableSystemChangeSet ImmutableSystemChangeSet}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<V, K> {
    private List<V> updates = new ArrayList<V>();
    private List<K> deletes = new ArrayList<K>();
    private List<V> inserts = new ArrayList<V>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SystemChangeSet} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> from(SystemChangeSet<V, K> instance) {
      Objects.requireNonNull(instance, "instance");
      addAllUpdates(instance.updates());
      addAllDeletes(instance.deletes());
      addAllInserts(instance.inserts());
      return this;
    }

    /**
     * Adds one element to {@link SystemChangeSet#updates() updates} list.
     * @param element A updates element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> addUpdates(V element) {
      this.updates.add(Objects.requireNonNull(element, "updates element"));
      return this;
    }

    /**
     * Adds elements to {@link SystemChangeSet#updates() updates} list.
     * @param elements An array of updates elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder<V, K> addUpdates(V... elements) {
      for (V element : elements) {
        this.updates.add(Objects.requireNonNull(element, "updates element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SystemChangeSet#updates() updates} list.
     * @param elements An iterable of updates elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> updates(Iterable<? extends V> elements) {
      this.updates.clear();
      return addAllUpdates(elements);
    }

    /**
     * Adds elements to {@link SystemChangeSet#updates() updates} list.
     * @param elements An iterable of updates elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> addAllUpdates(Iterable<? extends V> elements) {
      for (V element : elements) {
        this.updates.add(Objects.requireNonNull(element, "updates element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link SystemChangeSet#deletes() deletes} list.
     * @param element A deletes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> addDeletes(K element) {
      this.deletes.add(Objects.requireNonNull(element, "deletes element"));
      return this;
    }

    /**
     * Adds elements to {@link SystemChangeSet#deletes() deletes} list.
     * @param elements An array of deletes elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder<V, K> addDeletes(K... elements) {
      for (K element : elements) {
        this.deletes.add(Objects.requireNonNull(element, "deletes element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SystemChangeSet#deletes() deletes} list.
     * @param elements An iterable of deletes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> deletes(Iterable<? extends K> elements) {
      this.deletes.clear();
      return addAllDeletes(elements);
    }

    /**
     * Adds elements to {@link SystemChangeSet#deletes() deletes} list.
     * @param elements An iterable of deletes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> addAllDeletes(Iterable<? extends K> elements) {
      for (K element : elements) {
        this.deletes.add(Objects.requireNonNull(element, "deletes element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link SystemChangeSet#inserts() inserts} list.
     * @param element A inserts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> addInserts(V element) {
      this.inserts.add(Objects.requireNonNull(element, "inserts element"));
      return this;
    }

    /**
     * Adds elements to {@link SystemChangeSet#inserts() inserts} list.
     * @param elements An array of inserts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder<V, K> addInserts(V... elements) {
      for (V element : elements) {
        this.inserts.add(Objects.requireNonNull(element, "inserts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SystemChangeSet#inserts() inserts} list.
     * @param elements An iterable of inserts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> inserts(Iterable<? extends V> elements) {
      this.inserts.clear();
      return addAllInserts(elements);
    }

    /**
     * Adds elements to {@link SystemChangeSet#inserts() inserts} list.
     * @param elements An iterable of inserts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<V, K> addAllInserts(Iterable<? extends V> elements) {
      for (V element : elements) {
        this.inserts.add(Objects.requireNonNull(element, "inserts element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableSystemChangeSet ImmutableSystemChangeSet}.
     * @return An immutable instance of SystemChangeSet
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSystemChangeSet<V, K> build() {
      return new ImmutableSystemChangeSet<V, K>(
          createUnmodifiableList(true, updates),
          createUnmodifiableList(true, deletes),
          createUnmodifiableList(true, inserts));
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
