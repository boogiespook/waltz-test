package com.khartec.waltz.model.taxonomy_management;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link TaxonomyChangePreview}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTaxonomyChangePreview.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "TaxonomyChangePreview"})
public final class ImmutableTaxonomyChangePreview
    extends TaxonomyChangePreview {
  private final TaxonomyChangeCommand command;
  private final List<TaxonomyChangeImpact> impacts;

  private ImmutableTaxonomyChangePreview(
      TaxonomyChangeCommand command,
      List<TaxonomyChangeImpact> impacts) {
    this.command = command;
    this.impacts = impacts;
  }

  /**
   * @return The value of the {@code command} attribute
   */
  @JsonProperty("command")
  @Override
  public TaxonomyChangeCommand command() {
    return command;
  }

  /**
   * @return The value of the {@code impacts} attribute
   */
  @JsonProperty("impacts")
  @Override
  public List<TaxonomyChangeImpact> impacts() {
    return impacts;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangePreview#command() command} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for command
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangePreview withCommand(TaxonomyChangeCommand value) {
    if (this.command == value) return this;
    TaxonomyChangeCommand newValue = Objects.requireNonNull(value, "command");
    return new ImmutableTaxonomyChangePreview(newValue, this.impacts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TaxonomyChangePreview#impacts() impacts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaxonomyChangePreview withImpacts(TaxonomyChangeImpact... elements) {
    List<TaxonomyChangeImpact> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTaxonomyChangePreview(this.command, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TaxonomyChangePreview#impacts() impacts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of impacts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaxonomyChangePreview withImpacts(Iterable<? extends TaxonomyChangeImpact> elements) {
    if (this.impacts == elements) return this;
    List<TaxonomyChangeImpact> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTaxonomyChangePreview(this.command, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTaxonomyChangePreview} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTaxonomyChangePreview
        && equalTo((ImmutableTaxonomyChangePreview) another);
  }

  private boolean equalTo(ImmutableTaxonomyChangePreview another) {
    return command.equals(another.command)
        && impacts.equals(another.impacts);
  }

  /**
   * Computes a hash code from attributes: {@code command}, {@code impacts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + command.hashCode();
    h += (h << 5) + impacts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TaxonomyChangePreview} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TaxonomyChangePreview{"
        + "command=" + command
        + ", impacts=" + impacts
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TaxonomyChangePreview {
    TaxonomyChangeCommand command;
    List<TaxonomyChangeImpact> impacts = Collections.emptyList();
    @JsonProperty("command")
    public void setCommand(TaxonomyChangeCommand command) {
      this.command = command;
    }
    @JsonProperty("impacts")
    public void setImpacts(List<TaxonomyChangeImpact> impacts) {
      this.impacts = impacts;
    }
    @Override
    public TaxonomyChangeCommand command() { throw new UnsupportedOperationException(); }
    @Override
    public List<TaxonomyChangeImpact> impacts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTaxonomyChangePreview fromJson(Json json) {
    ImmutableTaxonomyChangePreview.Builder builder = ImmutableTaxonomyChangePreview.builder();
    if (json.command != null) {
      builder.command(json.command);
    }
    if (json.impacts != null) {
      builder.addAllImpacts(json.impacts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TaxonomyChangePreview} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TaxonomyChangePreview instance
   */
  public static ImmutableTaxonomyChangePreview copyOf(TaxonomyChangePreview instance) {
    if (instance instanceof ImmutableTaxonomyChangePreview) {
      return (ImmutableTaxonomyChangePreview) instance;
    }
    return ImmutableTaxonomyChangePreview.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTaxonomyChangePreview ImmutableTaxonomyChangePreview}.
   * @return A new ImmutableTaxonomyChangePreview builder
   */
  public static ImmutableTaxonomyChangePreview.Builder builder() {
    return new ImmutableTaxonomyChangePreview.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTaxonomyChangePreview ImmutableTaxonomyChangePreview}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_COMMAND = 0x1L;
    private long initBits = 0x1L;

    private TaxonomyChangeCommand command;
    private List<TaxonomyChangeImpact> impacts = new ArrayList<TaxonomyChangeImpact>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TaxonomyChangePreview} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TaxonomyChangePreview instance) {
      Objects.requireNonNull(instance, "instance");
      command(instance.command());
      addAllImpacts(instance.impacts());
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangePreview#command() command} attribute.
     * @param command The value for command 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("command")
    public final Builder command(TaxonomyChangeCommand command) {
      this.command = Objects.requireNonNull(command, "command");
      initBits &= ~INIT_BIT_COMMAND;
      return this;
    }

    /**
     * Adds one element to {@link TaxonomyChangePreview#impacts() impacts} list.
     * @param element A impacts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addImpacts(TaxonomyChangeImpact element) {
      this.impacts.add(Objects.requireNonNull(element, "impacts element"));
      return this;
    }

    /**
     * Adds elements to {@link TaxonomyChangePreview#impacts() impacts} list.
     * @param elements An array of impacts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addImpacts(TaxonomyChangeImpact... elements) {
      for (TaxonomyChangeImpact element : elements) {
        this.impacts.add(Objects.requireNonNull(element, "impacts element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TaxonomyChangePreview#impacts() impacts} list.
     * @param elements An iterable of impacts elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("impacts")
    public final Builder impacts(Iterable<? extends TaxonomyChangeImpact> elements) {
      this.impacts.clear();
      return addAllImpacts(elements);
    }

    /**
     * Adds elements to {@link TaxonomyChangePreview#impacts() impacts} list.
     * @param elements An iterable of impacts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllImpacts(Iterable<? extends TaxonomyChangeImpact> elements) {
      for (TaxonomyChangeImpact element : elements) {
        this.impacts.add(Objects.requireNonNull(element, "impacts element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableTaxonomyChangePreview ImmutableTaxonomyChangePreview}.
     * @return An immutable instance of TaxonomyChangePreview
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTaxonomyChangePreview build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTaxonomyChangePreview(command, createUnmodifiableList(true, impacts));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_COMMAND) != 0) attributes.add("command");
      return "Cannot build TaxonomyChangePreview, some of required attributes are not set " + attributes;
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
