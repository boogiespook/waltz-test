package com.khartec.waltz.model.tally;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link TallyPack}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTallyPack.<T>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "TallyPack<T>"})
public final class ImmutableTallyPack<T> extends TallyPack<T> {
  private final EntityReference entityReference;
  private final List<Tally<T>> tallies;
  private final LocalDateTime lastUpdatedAt;

  private ImmutableTallyPack(ImmutableTallyPack.Builder<T> builder) {
    this.entityReference = builder.entityReference;
    this.tallies = createUnmodifiableList(true, builder.tallies);
    this.lastUpdatedAt = builder.lastUpdatedAt != null
        ? builder.lastUpdatedAt
        : Objects.requireNonNull(super.lastUpdatedAt(), "lastUpdatedAt");
  }

  private ImmutableTallyPack(
      EntityReference entityReference,
      List<Tally<T>> tallies,
      LocalDateTime lastUpdatedAt) {
    this.entityReference = entityReference;
    this.tallies = tallies;
    this.lastUpdatedAt = lastUpdatedAt;
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
   * @return The value of the {@code tallies} attribute
   */
  @JsonProperty("tallies")
  @Override
  public List<Tally<T>> tallies() {
    return tallies;
  }

  /**
   * @return The value of the {@code lastUpdatedAt} attribute
   */
  @JsonProperty("lastUpdatedAt")
  @Override
  public LocalDateTime lastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TallyPack#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTallyPack<T> withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableTallyPack<T>(newValue, this.tallies, this.lastUpdatedAt);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TallyPack#tallies() tallies}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  @SafeVarargs
  public final ImmutableTallyPack<T> withTallies(Tally<T>... elements) {
    List<Tally<T>> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTallyPack<T>(this.entityReference, newValue, this.lastUpdatedAt);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TallyPack#tallies() tallies}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of tallies elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTallyPack<T> withTallies(Iterable<? extends Tally<T>> elements) {
    if (this.tallies == elements) return this;
    List<Tally<T>> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTallyPack<T>(this.entityReference, newValue, this.lastUpdatedAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TallyPack#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTallyPack<T> withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableTallyPack<T>(this.entityReference, this.tallies, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTallyPack} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTallyPack<?>
        && equalTo((ImmutableTallyPack<T>) another);
  }

  private boolean equalTo(ImmutableTallyPack<T> another) {
    return entityReference.equals(another.entityReference)
        && tallies.equals(another.tallies)
        && lastUpdatedAt.equals(another.lastUpdatedAt);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code tallies}, {@code lastUpdatedAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + tallies.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TallyPack} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TallyPack{"
        + "entityReference=" + entityReference
        + ", tallies=" + tallies
        + ", lastUpdatedAt=" + lastUpdatedAt
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json<T> extends TallyPack<T> {
    EntityReference entityReference;
    List<Tally<T>> tallies = Collections.emptyList();
    LocalDateTime lastUpdatedAt;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("tallies")
    public void setTallies(List<Tally<T>> tallies) {
      this.tallies = tallies;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public List<Tally<T>> tallies() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param <T> generic parameter T
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static <T> ImmutableTallyPack<T> fromJson(Json<T> json) {
    ImmutableTallyPack.Builder<T> builder = ImmutableTallyPack.<T>builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.tallies != null) {
      builder.addAllTallies(json.tallies);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TallyPack} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <T> generic parameter T
   * @param instance The instance to copy
   * @return A copied immutable TallyPack instance
   */
  public static <T> ImmutableTallyPack<T> copyOf(TallyPack<T> instance) {
    if (instance instanceof ImmutableTallyPack<?>) {
      return (ImmutableTallyPack<T>) instance;
    }
    return ImmutableTallyPack.<T>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTallyPack ImmutableTallyPack}.
   * @param <T> generic parameter T
   * @return A new ImmutableTallyPack builder
   */
  public static <T> ImmutableTallyPack.Builder<T> builder() {
    return new ImmutableTallyPack.Builder<T>();
  }

  /**
   * Builds instances of type {@link ImmutableTallyPack ImmutableTallyPack}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<T> {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private long initBits = 0x1L;

    private EntityReference entityReference;
    private List<Tally<T>> tallies = new ArrayList<Tally<T>>();
    private LocalDateTime lastUpdatedAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TallyPack} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> from(TallyPack<T> instance) {
      Objects.requireNonNull(instance, "instance");
      entityReference(instance.entityReference());
      addAllTallies(instance.tallies());
      lastUpdatedAt(instance.lastUpdatedAt());
      return this;
    }

    /**
     * Initializes the value for the {@link TallyPack#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder<T> entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Adds one element to {@link TallyPack#tallies() tallies} list.
     * @param element A tallies element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> addTallies(Tally<T> element) {
      this.tallies.add(Objects.requireNonNull(element, "tallies element"));
      return this;
    }

    /**
     * Adds elements to {@link TallyPack#tallies() tallies} list.
     * @param elements An array of tallies elements
     * @return {@code this} builder for use in a chained invocation
     */
    @SafeVarargs
    public final Builder<T> addTallies(Tally<T>... elements) {
      for (Tally<T> element : elements) {
        this.tallies.add(Objects.requireNonNull(element, "tallies element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TallyPack#tallies() tallies} list.
     * @param elements An iterable of tallies elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tallies")
    public final Builder<T> tallies(Iterable<? extends Tally<T>> elements) {
      this.tallies.clear();
      return addAllTallies(elements);
    }

    /**
     * Adds elements to {@link TallyPack#tallies() tallies} list.
     * @param elements An iterable of tallies elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> addAllTallies(Iterable<? extends Tally<T>> elements) {
      for (Tally<T> element : elements) {
        this.tallies.add(Objects.requireNonNull(element, "tallies element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link TallyPack#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TallyPack#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder<T> lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Builds a new {@link ImmutableTallyPack ImmutableTallyPack}.
     * @return An immutable instance of TallyPack
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTallyPack<T> build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTallyPack<T>(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      return "Cannot build TallyPack, some of required attributes are not set " + attributes;
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
