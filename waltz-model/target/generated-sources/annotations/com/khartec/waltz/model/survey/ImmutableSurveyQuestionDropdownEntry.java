package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyQuestionDropdownEntry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyQuestionDropdownEntry.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyQuestionDropdownEntry"})
public final class ImmutableSurveyQuestionDropdownEntry
    extends SurveyQuestionDropdownEntry {
  private final Long questionId;
  private final String value;
  private final int position;
  private final Long id;

  private ImmutableSurveyQuestionDropdownEntry(Long questionId, String value, int position, Long id) {
    this.questionId = questionId;
    this.value = value;
    this.position = position;
    this.id = id;
  }

  /**
   * @return The value of the {@code questionId} attribute
   */
  @JsonProperty("questionId")
  @Override
  public Optional<Long> questionId() {
    return Optional.ofNullable(questionId);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public String value() {
    return value;
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public int position() {
    return position;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionDropdownEntry#questionId() questionId} attribute.
   * @param value The value for questionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionDropdownEntry withQuestionId(long value) {
    Long newValue = value;
    if (Objects.equals(this.questionId, newValue)) return this;
    return new ImmutableSurveyQuestionDropdownEntry(newValue, this.value, this.position, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionDropdownEntry#questionId() questionId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for questionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionDropdownEntry withQuestionId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.questionId, value)) return this;
    return new ImmutableSurveyQuestionDropdownEntry(value, this.value, this.position, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestionDropdownEntry#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestionDropdownEntry withValue(String value) {
    if (this.value.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "value");
    return new ImmutableSurveyQuestionDropdownEntry(this.questionId, newValue, this.position, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestionDropdownEntry#position() position} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestionDropdownEntry withPosition(int value) {
    if (this.position == value) return this;
    return new ImmutableSurveyQuestionDropdownEntry(this.questionId, this.value, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionDropdownEntry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionDropdownEntry withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyQuestionDropdownEntry(this.questionId, this.value, this.position, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionDropdownEntry#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionDropdownEntry withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyQuestionDropdownEntry(this.questionId, this.value, this.position, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyQuestionDropdownEntry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyQuestionDropdownEntry
        && equalTo((ImmutableSurveyQuestionDropdownEntry) another);
  }

  private boolean equalTo(ImmutableSurveyQuestionDropdownEntry another) {
    return Objects.equals(questionId, another.questionId)
        && value.equals(another.value)
        && position == another.position
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code questionId}, {@code value}, {@code position}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(questionId);
    h += (h << 5) + value.hashCode();
    h += (h << 5) + position;
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyQuestionDropdownEntry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyQuestionDropdownEntry{");
    if (questionId != null) {
      builder.append("questionId=").append(questionId);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("value=").append(value);
    builder.append(", ");
    builder.append("position=").append(position);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyQuestionDropdownEntry {
    Optional<Long> questionId = Optional.empty();
    String value;
    int position;
    boolean positionIsSet;
    Optional<Long> id = Optional.empty();
    @JsonProperty("questionId")
    public void setQuestionId(Optional<Long> questionId) {
      this.questionId = questionId;
    }
    @JsonProperty("value")
    public void setValue(String value) {
      this.value = value;
    }
    @JsonProperty("position")
    public void setPosition(int position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public Optional<Long> questionId() { throw new UnsupportedOperationException(); }
    @Override
    public String value() { throw new UnsupportedOperationException(); }
    @Override
    public int position() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyQuestionDropdownEntry fromJson(Json json) {
    ImmutableSurveyQuestionDropdownEntry.Builder builder = ImmutableSurveyQuestionDropdownEntry.builder();
    if (json.questionId != null) {
      builder.questionId(json.questionId);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyQuestionDropdownEntry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyQuestionDropdownEntry instance
   */
  public static ImmutableSurveyQuestionDropdownEntry copyOf(SurveyQuestionDropdownEntry instance) {
    if (instance instanceof ImmutableSurveyQuestionDropdownEntry) {
      return (ImmutableSurveyQuestionDropdownEntry) instance;
    }
    return ImmutableSurveyQuestionDropdownEntry.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyQuestionDropdownEntry ImmutableSurveyQuestionDropdownEntry}.
   * @return A new ImmutableSurveyQuestionDropdownEntry builder
   */
  public static ImmutableSurveyQuestionDropdownEntry.Builder builder() {
    return new ImmutableSurveyQuestionDropdownEntry.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyQuestionDropdownEntry ImmutableSurveyQuestionDropdownEntry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_VALUE = 0x1L;
    private static final long INIT_BIT_POSITION = 0x2L;
    private long initBits = 0x3L;

    private Long questionId;
    private String value;
    private int position;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyQuestionDropdownEntry} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyQuestionDropdownEntry instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof SurveyQuestionDropdownEntry) {
        SurveyQuestionDropdownEntry instance = (SurveyQuestionDropdownEntry) object;
        value(instance.value());
        Optional<Long> questionIdOptional = instance.questionId();
        if (questionIdOptional.isPresent()) {
          questionId(questionIdOptional);
        }
        position(instance.position());
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
    }

    /**
     * Initializes the optional value {@link SurveyQuestionDropdownEntry#questionId() questionId} to questionId.
     * @param questionId The value for questionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder questionId(long questionId) {
      this.questionId = questionId;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionDropdownEntry#questionId() questionId} to questionId.
     * @param questionId The value for questionId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionId")
    public final Builder questionId(Optional<Long> questionId) {
      this.questionId = questionId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestionDropdownEntry#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestionDropdownEntry#position() position} attribute.
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(int position) {
      this.position = position;
      initBits &= ~INIT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionDropdownEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionDropdownEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyQuestionDropdownEntry ImmutableSurveyQuestionDropdownEntry}.
     * @return An immutable instance of SurveyQuestionDropdownEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyQuestionDropdownEntry build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyQuestionDropdownEntry(questionId, value, position, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      return "Cannot build SurveyQuestionDropdownEntry, some of required attributes are not set " + attributes;
    }
  }
}
