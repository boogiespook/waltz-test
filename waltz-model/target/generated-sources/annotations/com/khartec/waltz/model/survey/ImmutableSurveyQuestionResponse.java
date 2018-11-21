package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyQuestionResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyQuestionResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyQuestionResponse"})
public final class ImmutableSurveyQuestionResponse
    extends SurveyQuestionResponse {
  private final Long questionId;
  private final String comment;
  private final String stringResponse;
  private final Double numberResponse;
  private final Boolean booleanResponse;
  private final LocalDate dateResponse;
  private final EntityReference entityResponse;

  private ImmutableSurveyQuestionResponse(
      Long questionId,
      String comment,
      String stringResponse,
      Double numberResponse,
      Boolean booleanResponse,
      LocalDate dateResponse,
      EntityReference entityResponse) {
    this.questionId = questionId;
    this.comment = comment;
    this.stringResponse = stringResponse;
    this.numberResponse = numberResponse;
    this.booleanResponse = booleanResponse;
    this.dateResponse = dateResponse;
    this.entityResponse = entityResponse;
  }

  /**
   * @return The value of the {@code questionId} attribute
   */
  @JsonProperty("questionId")
  @Override
  public Long questionId() {
    return questionId;
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code stringResponse} attribute
   */
  @JsonProperty("stringResponse")
  @Override
  public Optional<String> stringResponse() {
    return Optional.ofNullable(stringResponse);
  }

  /**
   * @return The value of the {@code numberResponse} attribute
   */
  @JsonProperty("numberResponse")
  @Override
  public Optional<Double> numberResponse() {
    return Optional.ofNullable(numberResponse);
  }

  /**
   * @return The value of the {@code booleanResponse} attribute
   */
  @JsonProperty("booleanResponse")
  @Override
  public Optional<Boolean> booleanResponse() {
    return Optional.ofNullable(booleanResponse);
  }

  /**
   * @return The value of the {@code dateResponse} attribute
   */
  @JsonProperty("dateResponse")
  @Override
  public Optional<LocalDate> dateResponse() {
    return Optional.ofNullable(dateResponse);
  }

  /**
   * @return The value of the {@code entityResponse} attribute
   */
  @JsonProperty("entityResponse")
  @Override
  public Optional<EntityReference> entityResponse() {
    return Optional.ofNullable(entityResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestionResponse#questionId() questionId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for questionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withQuestionId(Long value) {
    if (this.questionId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "questionId");
    return new ImmutableSurveyQuestionResponse(
        newValue,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionResponse#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withComment(String value) {
    String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        newValue,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionResponse#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withComment(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        value,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionResponse#stringResponse() stringResponse} attribute.
   * @param value The value for stringResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withStringResponse(String value) {
    String newValue = Objects.requireNonNull(value, "stringResponse");
    if (Objects.equals(this.stringResponse, newValue)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        newValue,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionResponse#stringResponse() stringResponse} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stringResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withStringResponse(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.stringResponse, value)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        value,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionResponse#numberResponse() numberResponse} attribute.
   * @param value The value for numberResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withNumberResponse(double value) {
    Double newValue = value;
    if (Objects.equals(this.numberResponse, newValue)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        newValue,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionResponse#numberResponse() numberResponse} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withNumberResponse(Optional<Double> optional) {
    Double value = optional.orElse(null);
    if (Objects.equals(this.numberResponse, value)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        value,
        this.booleanResponse,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionResponse#booleanResponse() booleanResponse} attribute.
   * @param value The value for booleanResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withBooleanResponse(boolean value) {
    Boolean newValue = value;
    if (Objects.equals(this.booleanResponse, newValue)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        newValue,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionResponse#booleanResponse() booleanResponse} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for booleanResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withBooleanResponse(Optional<Boolean> optional) {
    Boolean value = optional.orElse(null);
    if (Objects.equals(this.booleanResponse, value)) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        value,
        this.dateResponse,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionResponse#dateResponse() dateResponse} attribute.
   * @param value The value for dateResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withDateResponse(LocalDate value) {
    LocalDate newValue = Objects.requireNonNull(value, "dateResponse");
    if (this.dateResponse == newValue) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        newValue,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionResponse#dateResponse() dateResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withDateResponse(Optional<? extends LocalDate> optional) {
    LocalDate value = optional.orElse(null);
    if (this.dateResponse == value) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        value,
        this.entityResponse);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestionResponse#entityResponse() entityResponse} attribute.
   * @param value The value for entityResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withEntityResponse(EntityReference value) {
    EntityReference newValue = Objects.requireNonNull(value, "entityResponse");
    if (this.entityResponse == newValue) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestionResponse#entityResponse() entityResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entityResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestionResponse withEntityResponse(Optional<? extends EntityReference> optional) {
    EntityReference value = optional.orElse(null);
    if (this.entityResponse == value) return this;
    return new ImmutableSurveyQuestionResponse(
        this.questionId,
        this.comment,
        this.stringResponse,
        this.numberResponse,
        this.booleanResponse,
        this.dateResponse,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyQuestionResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyQuestionResponse
        && equalTo((ImmutableSurveyQuestionResponse) another);
  }

  private boolean equalTo(ImmutableSurveyQuestionResponse another) {
    return questionId.equals(another.questionId)
        && Objects.equals(comment, another.comment)
        && Objects.equals(stringResponse, another.stringResponse)
        && Objects.equals(numberResponse, another.numberResponse)
        && Objects.equals(booleanResponse, another.booleanResponse)
        && Objects.equals(dateResponse, another.dateResponse)
        && Objects.equals(entityResponse, another.entityResponse);
  }

  /**
   * Computes a hash code from attributes: {@code questionId}, {@code comment}, {@code stringResponse}, {@code numberResponse}, {@code booleanResponse}, {@code dateResponse}, {@code entityResponse}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + questionId.hashCode();
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(stringResponse);
    h += (h << 5) + Objects.hashCode(numberResponse);
    h += (h << 5) + Objects.hashCode(booleanResponse);
    h += (h << 5) + Objects.hashCode(dateResponse);
    h += (h << 5) + Objects.hashCode(entityResponse);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyQuestionResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyQuestionResponse{");
    builder.append("questionId=").append(questionId);
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (stringResponse != null) {
      builder.append(", ");
      builder.append("stringResponse=").append(stringResponse);
    }
    if (numberResponse != null) {
      builder.append(", ");
      builder.append("numberResponse=").append(numberResponse);
    }
    if (booleanResponse != null) {
      builder.append(", ");
      builder.append("booleanResponse=").append(booleanResponse);
    }
    if (dateResponse != null) {
      builder.append(", ");
      builder.append("dateResponse=").append(dateResponse);
    }
    if (entityResponse != null) {
      builder.append(", ");
      builder.append("entityResponse=").append(entityResponse);
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
  static final class Json extends SurveyQuestionResponse {
    Long questionId;
    Optional<String> comment = Optional.empty();
    Optional<String> stringResponse = Optional.empty();
    Optional<Double> numberResponse = Optional.empty();
    Optional<Boolean> booleanResponse = Optional.empty();
    Optional<LocalDate> dateResponse = Optional.empty();
    Optional<EntityReference> entityResponse = Optional.empty();
    @JsonProperty("questionId")
    public void setQuestionId(Long questionId) {
      this.questionId = questionId;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
    }
    @JsonProperty("stringResponse")
    public void setStringResponse(Optional<String> stringResponse) {
      this.stringResponse = stringResponse;
    }
    @JsonProperty("numberResponse")
    public void setNumberResponse(Optional<Double> numberResponse) {
      this.numberResponse = numberResponse;
    }
    @JsonProperty("booleanResponse")
    public void setBooleanResponse(Optional<Boolean> booleanResponse) {
      this.booleanResponse = booleanResponse;
    }
    @JsonProperty("dateResponse")
    public void setDateResponse(Optional<LocalDate> dateResponse) {
      this.dateResponse = dateResponse;
    }
    @JsonProperty("entityResponse")
    public void setEntityResponse(Optional<EntityReference> entityResponse) {
      this.entityResponse = entityResponse;
    }
    @Override
    public Long questionId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> stringResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> numberResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> booleanResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDate> dateResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EntityReference> entityResponse() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyQuestionResponse fromJson(Json json) {
    ImmutableSurveyQuestionResponse.Builder builder = ImmutableSurveyQuestionResponse.builder();
    if (json.questionId != null) {
      builder.questionId(json.questionId);
    }
    if (json.comment != null) {
      builder.comment(json.comment);
    }
    if (json.stringResponse != null) {
      builder.stringResponse(json.stringResponse);
    }
    if (json.numberResponse != null) {
      builder.numberResponse(json.numberResponse);
    }
    if (json.booleanResponse != null) {
      builder.booleanResponse(json.booleanResponse);
    }
    if (json.dateResponse != null) {
      builder.dateResponse(json.dateResponse);
    }
    if (json.entityResponse != null) {
      builder.entityResponse(json.entityResponse);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyQuestionResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyQuestionResponse instance
   */
  public static ImmutableSurveyQuestionResponse copyOf(SurveyQuestionResponse instance) {
    if (instance instanceof ImmutableSurveyQuestionResponse) {
      return (ImmutableSurveyQuestionResponse) instance;
    }
    return ImmutableSurveyQuestionResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyQuestionResponse ImmutableSurveyQuestionResponse}.
   * @return A new ImmutableSurveyQuestionResponse builder
   */
  public static ImmutableSurveyQuestionResponse.Builder builder() {
    return new ImmutableSurveyQuestionResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyQuestionResponse ImmutableSurveyQuestionResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_QUESTION_ID = 0x1L;
    private long initBits = 0x1L;

    private Long questionId;
    private String comment;
    private String stringResponse;
    private Double numberResponse;
    private Boolean booleanResponse;
    private LocalDate dateResponse;
    private EntityReference entityResponse;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyQuestionResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyQuestionResponse instance) {
      Objects.requireNonNull(instance, "instance");
      questionId(instance.questionId());
      Optional<String> commentOptional = instance.comment();
      if (commentOptional.isPresent()) {
        comment(commentOptional);
      }
      Optional<String> stringResponseOptional = instance.stringResponse();
      if (stringResponseOptional.isPresent()) {
        stringResponse(stringResponseOptional);
      }
      Optional<Double> numberResponseOptional = instance.numberResponse();
      if (numberResponseOptional.isPresent()) {
        numberResponse(numberResponseOptional);
      }
      Optional<Boolean> booleanResponseOptional = instance.booleanResponse();
      if (booleanResponseOptional.isPresent()) {
        booleanResponse(booleanResponseOptional);
      }
      Optional<LocalDate> dateResponseOptional = instance.dateResponse();
      if (dateResponseOptional.isPresent()) {
        dateResponse(dateResponseOptional);
      }
      Optional<EntityReference> entityResponseOptional = instance.entityResponse();
      if (entityResponseOptional.isPresent()) {
        entityResponse(entityResponseOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestionResponse#questionId() questionId} attribute.
     * @param questionId The value for questionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionId")
    public final Builder questionId(Long questionId) {
      this.questionId = Objects.requireNonNull(questionId, "questionId");
      initBits &= ~INIT_BIT_QUESTION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      this.comment = Objects.requireNonNull(comment, "comment");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      this.comment = comment.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#stringResponse() stringResponse} to stringResponse.
     * @param stringResponse The value for stringResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder stringResponse(String stringResponse) {
      this.stringResponse = Objects.requireNonNull(stringResponse, "stringResponse");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#stringResponse() stringResponse} to stringResponse.
     * @param stringResponse The value for stringResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stringResponse")
    public final Builder stringResponse(Optional<String> stringResponse) {
      this.stringResponse = stringResponse.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#numberResponse() numberResponse} to numberResponse.
     * @param numberResponse The value for numberResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberResponse(double numberResponse) {
      this.numberResponse = numberResponse;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#numberResponse() numberResponse} to numberResponse.
     * @param numberResponse The value for numberResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberResponse")
    public final Builder numberResponse(Optional<Double> numberResponse) {
      this.numberResponse = numberResponse.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#booleanResponse() booleanResponse} to booleanResponse.
     * @param booleanResponse The value for booleanResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder booleanResponse(boolean booleanResponse) {
      this.booleanResponse = booleanResponse;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#booleanResponse() booleanResponse} to booleanResponse.
     * @param booleanResponse The value for booleanResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("booleanResponse")
    public final Builder booleanResponse(Optional<Boolean> booleanResponse) {
      this.booleanResponse = booleanResponse.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#dateResponse() dateResponse} to dateResponse.
     * @param dateResponse The value for dateResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateResponse(LocalDate dateResponse) {
      this.dateResponse = Objects.requireNonNull(dateResponse, "dateResponse");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#dateResponse() dateResponse} to dateResponse.
     * @param dateResponse The value for dateResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateResponse")
    public final Builder dateResponse(Optional<? extends LocalDate> dateResponse) {
      this.dateResponse = dateResponse.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#entityResponse() entityResponse} to entityResponse.
     * @param entityResponse The value for entityResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder entityResponse(EntityReference entityResponse) {
      this.entityResponse = Objects.requireNonNull(entityResponse, "entityResponse");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestionResponse#entityResponse() entityResponse} to entityResponse.
     * @param entityResponse The value for entityResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityResponse")
    public final Builder entityResponse(Optional<? extends EntityReference> entityResponse) {
      this.entityResponse = entityResponse.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyQuestionResponse ImmutableSurveyQuestionResponse}.
     * @return An immutable instance of SurveyQuestionResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyQuestionResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyQuestionResponse(
          questionId,
          comment,
          stringResponse,
          numberResponse,
          booleanResponse,
          dateResponse,
          entityResponse);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_QUESTION_ID) != 0) attributes.add("questionId");
      return "Cannot build SurveyQuestionResponse, some of required attributes are not set " + attributes;
    }
  }
}
