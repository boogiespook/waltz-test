package com.khartec.waltz.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.survey.SurveyQuestion;
import com.khartec.waltz.model.survey.SurveyQuestionDropdownEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyQuestionInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyQuestionInfo.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyQuestionInfo"})
public final class ImmutableSurveyQuestionInfo extends SurveyQuestionInfo {
  private final SurveyQuestion question;
  private final List<SurveyQuestionDropdownEntry> dropdownEntries;

  private ImmutableSurveyQuestionInfo(
      SurveyQuestion question,
      List<SurveyQuestionDropdownEntry> dropdownEntries) {
    this.question = question;
    this.dropdownEntries = dropdownEntries;
  }

  /**
   * @return The value of the {@code question} attribute
   */
  @JsonProperty("question")
  @Override
  public SurveyQuestion question() {
    return question;
  }

  /**
   * @return The value of the {@code dropdownEntries} attribute
   */
  @JsonProperty("dropdownEntries")
  @Override
  public List<SurveyQuestionDropdownEntry> dropdownEntries() {
    return dropdownEntries;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestionInfo#question() question} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for question
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestionInfo withQuestion(SurveyQuestion value) {
    if (this.question == value) return this;
    SurveyQuestion newValue = Objects.requireNonNull(value, "question");
    return new ImmutableSurveyQuestionInfo(newValue, this.dropdownEntries);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SurveyQuestionInfo#dropdownEntries() dropdownEntries}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionInfo withDropdownEntries(SurveyQuestionDropdownEntry... elements) {
    List<SurveyQuestionDropdownEntry> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSurveyQuestionInfo(this.question, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SurveyQuestionInfo#dropdownEntries() dropdownEntries}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of dropdownEntries elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionInfo withDropdownEntries(Iterable<? extends SurveyQuestionDropdownEntry> elements) {
    if (this.dropdownEntries == elements) return this;
    List<SurveyQuestionDropdownEntry> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSurveyQuestionInfo(this.question, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyQuestionInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyQuestionInfo
        && equalTo((ImmutableSurveyQuestionInfo) another);
  }

  private boolean equalTo(ImmutableSurveyQuestionInfo another) {
    return question.equals(another.question)
        && dropdownEntries.equals(another.dropdownEntries);
  }

  /**
   * Computes a hash code from attributes: {@code question}, {@code dropdownEntries}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + question.hashCode();
    h += (h << 5) + dropdownEntries.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyQuestionInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SurveyQuestionInfo{"
        + "question=" + question
        + ", dropdownEntries=" + dropdownEntries
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyQuestionInfo {
    SurveyQuestion question;
    List<SurveyQuestionDropdownEntry> dropdownEntries = Collections.emptyList();
    @JsonProperty("question")
    public void setQuestion(SurveyQuestion question) {
      this.question = question;
    }
    @JsonProperty("dropdownEntries")
    public void setDropdownEntries(List<SurveyQuestionDropdownEntry> dropdownEntries) {
      this.dropdownEntries = dropdownEntries;
    }
    @Override
    public SurveyQuestion question() { throw new UnsupportedOperationException(); }
    @Override
    public List<SurveyQuestionDropdownEntry> dropdownEntries() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyQuestionInfo fromJson(Json json) {
    ImmutableSurveyQuestionInfo.Builder builder = ImmutableSurveyQuestionInfo.builder();
    if (json.question != null) {
      builder.question(json.question);
    }
    if (json.dropdownEntries != null) {
      builder.addAllDropdownEntries(json.dropdownEntries);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyQuestionInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyQuestionInfo instance
   */
  public static ImmutableSurveyQuestionInfo copyOf(SurveyQuestionInfo instance) {
    if (instance instanceof ImmutableSurveyQuestionInfo) {
      return (ImmutableSurveyQuestionInfo) instance;
    }
    return ImmutableSurveyQuestionInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyQuestionInfo ImmutableSurveyQuestionInfo}.
   * @return A new ImmutableSurveyQuestionInfo builder
   */
  public static ImmutableSurveyQuestionInfo.Builder builder() {
    return new ImmutableSurveyQuestionInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyQuestionInfo ImmutableSurveyQuestionInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_QUESTION = 0x1L;
    private long initBits = 0x1L;

    private SurveyQuestion question;
    private List<SurveyQuestionDropdownEntry> dropdownEntries = new ArrayList<SurveyQuestionDropdownEntry>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyQuestionInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyQuestionInfo instance) {
      Objects.requireNonNull(instance, "instance");
      question(instance.question());
      addAllDropdownEntries(instance.dropdownEntries());
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestionInfo#question() question} attribute.
     * @param question The value for question 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("question")
    public final Builder question(SurveyQuestion question) {
      this.question = Objects.requireNonNull(question, "question");
      initBits &= ~INIT_BIT_QUESTION;
      return this;
    }

    /**
     * Adds one element to {@link SurveyQuestionInfo#dropdownEntries() dropdownEntries} list.
     * @param element A dropdownEntries element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDropdownEntries(SurveyQuestionDropdownEntry element) {
      this.dropdownEntries.add(Objects.requireNonNull(element, "dropdownEntries element"));
      return this;
    }

    /**
     * Adds elements to {@link SurveyQuestionInfo#dropdownEntries() dropdownEntries} list.
     * @param elements An array of dropdownEntries elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDropdownEntries(SurveyQuestionDropdownEntry... elements) {
      for (SurveyQuestionDropdownEntry element : elements) {
        this.dropdownEntries.add(Objects.requireNonNull(element, "dropdownEntries element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SurveyQuestionInfo#dropdownEntries() dropdownEntries} list.
     * @param elements An iterable of dropdownEntries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dropdownEntries")
    public final Builder dropdownEntries(Iterable<? extends SurveyQuestionDropdownEntry> elements) {
      this.dropdownEntries.clear();
      return addAllDropdownEntries(elements);
    }

    /**
     * Adds elements to {@link SurveyQuestionInfo#dropdownEntries() dropdownEntries} list.
     * @param elements An iterable of dropdownEntries elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDropdownEntries(Iterable<? extends SurveyQuestionDropdownEntry> elements) {
      for (SurveyQuestionDropdownEntry element : elements) {
        this.dropdownEntries.add(Objects.requireNonNull(element, "dropdownEntries element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyQuestionInfo ImmutableSurveyQuestionInfo}.
     * @return An immutable instance of SurveyQuestionInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyQuestionInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyQuestionInfo(question, createUnmodifiableList(true, dropdownEntries));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_QUESTION) != 0) attributes.add("question");
      return "Cannot build SurveyQuestionInfo, some of required attributes are not set " + attributes;
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
