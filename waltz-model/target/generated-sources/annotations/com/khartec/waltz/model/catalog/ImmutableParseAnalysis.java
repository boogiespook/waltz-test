package com.khartec.waltz.model.catalog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ParseAnalysis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParseAnalysis.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ParseAnalysis"})
public final class ImmutableParseAnalysis extends ParseAnalysis {
  private final char quoteChar;
  private final char delimiterChar;
  private final List<Integer> fieldCounts;

  private ImmutableParseAnalysis(char quoteChar, char delimiterChar, List<Integer> fieldCounts) {
    this.quoteChar = quoteChar;
    this.delimiterChar = delimiterChar;
    this.fieldCounts = fieldCounts;
  }

  /**
   * @return The value of the {@code quoteChar} attribute
   */
  @Override
  public char quoteChar() {
    return quoteChar;
  }

  /**
   * @return The value of the {@code delimiterChar} attribute
   */
  @Override
  public char delimiterChar() {
    return delimiterChar;
  }

  /**
   * @return The value of the {@code fieldCounts} attribute
   */
  @Override
  public List<Integer> fieldCounts() {
    return fieldCounts;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ParseAnalysis#quoteChar() quoteChar} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quoteChar
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParseAnalysis withQuoteChar(char value) {
    if (this.quoteChar == value) return this;
    return new ImmutableParseAnalysis(value, this.delimiterChar, this.fieldCounts);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ParseAnalysis#delimiterChar() delimiterChar} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for delimiterChar
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParseAnalysis withDelimiterChar(char value) {
    if (this.delimiterChar == value) return this;
    return new ImmutableParseAnalysis(this.quoteChar, value, this.fieldCounts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ParseAnalysis#fieldCounts() fieldCounts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParseAnalysis withFieldCounts(int... elements) {
    ArrayList<Integer> wrappedList = new ArrayList<Integer>(elements.length);
    for (int element : elements) {
      wrappedList.add(element);
    }
    List<Integer> newValue = createUnmodifiableList(false, wrappedList);
    return new ImmutableParseAnalysis(this.quoteChar, this.delimiterChar, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ParseAnalysis#fieldCounts() fieldCounts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of fieldCounts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParseAnalysis withFieldCounts(Iterable<Integer> elements) {
    if (this.fieldCounts == elements) return this;
    List<Integer> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableParseAnalysis(this.quoteChar, this.delimiterChar, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParseAnalysis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParseAnalysis
        && equalTo((ImmutableParseAnalysis) another);
  }

  private boolean equalTo(ImmutableParseAnalysis another) {
    return quoteChar == another.quoteChar
        && delimiterChar == another.delimiterChar
        && fieldCounts.equals(another.fieldCounts);
  }

  /**
   * Computes a hash code from attributes: {@code quoteChar}, {@code delimiterChar}, {@code fieldCounts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Character.hashCode(quoteChar);
    h += (h << 5) + Character.hashCode(delimiterChar);
    h += (h << 5) + fieldCounts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ParseAnalysis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ParseAnalysis{"
        + "quoteChar=" + quoteChar
        + ", delimiterChar=" + delimiterChar
        + ", fieldCounts=" + fieldCounts
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link ParseAnalysis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ParseAnalysis instance
   */
  public static ImmutableParseAnalysis copyOf(ParseAnalysis instance) {
    if (instance instanceof ImmutableParseAnalysis) {
      return (ImmutableParseAnalysis) instance;
    }
    return ImmutableParseAnalysis.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableParseAnalysis ImmutableParseAnalysis}.
   * @return A new ImmutableParseAnalysis builder
   */
  public static ImmutableParseAnalysis.Builder builder() {
    return new ImmutableParseAnalysis.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableParseAnalysis ImmutableParseAnalysis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_QUOTE_CHAR = 0x1L;
    private static final long INIT_BIT_DELIMITER_CHAR = 0x2L;
    private long initBits = 0x3L;

    private char quoteChar;
    private char delimiterChar;
    private List<Integer> fieldCounts = new ArrayList<Integer>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ParseAnalysis} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ParseAnalysis instance) {
      Objects.requireNonNull(instance, "instance");
      quoteChar(instance.quoteChar());
      delimiterChar(instance.delimiterChar());
      addAllFieldCounts(instance.fieldCounts());
      return this;
    }

    /**
     * Initializes the value for the {@link ParseAnalysis#quoteChar() quoteChar} attribute.
     * @param quoteChar The value for quoteChar 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder quoteChar(char quoteChar) {
      this.quoteChar = quoteChar;
      initBits &= ~INIT_BIT_QUOTE_CHAR;
      return this;
    }

    /**
     * Initializes the value for the {@link ParseAnalysis#delimiterChar() delimiterChar} attribute.
     * @param delimiterChar The value for delimiterChar 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder delimiterChar(char delimiterChar) {
      this.delimiterChar = delimiterChar;
      initBits &= ~INIT_BIT_DELIMITER_CHAR;
      return this;
    }

    /**
     * Adds one element to {@link ParseAnalysis#fieldCounts() fieldCounts} list.
     * @param element A fieldCounts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addFieldCounts(int element) {
      this.fieldCounts.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ParseAnalysis#fieldCounts() fieldCounts} list.
     * @param elements An array of fieldCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addFieldCounts(int... elements) {
      for (int element : elements) {
        this.fieldCounts.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ParseAnalysis#fieldCounts() fieldCounts} list.
     * @param elements An iterable of fieldCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fieldCounts(Iterable<Integer> elements) {
      this.fieldCounts.clear();
      return addAllFieldCounts(elements);
    }

    /**
     * Adds elements to {@link ParseAnalysis#fieldCounts() fieldCounts} list.
     * @param elements An iterable of fieldCounts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllFieldCounts(Iterable<Integer> elements) {
      for (int element : elements) {
        this.fieldCounts.add(Objects.requireNonNull(element, "fieldCounts element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableParseAnalysis ImmutableParseAnalysis}.
     * @return An immutable instance of ParseAnalysis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableParseAnalysis build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableParseAnalysis(quoteChar, delimiterChar, createUnmodifiableList(true, fieldCounts));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_QUOTE_CHAR) != 0) attributes.add("quoteChar");
      if ((initBits & INIT_BIT_DELIMITER_CHAR) != 0) attributes.add("delimiterChar");
      return "Cannot build ParseAnalysis, some of required attributes are not set " + attributes;
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
