package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyInstanceQuestionResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyInstanceQuestionResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyInstanceQuestionResponse"})
public final class ImmutableSurveyInstanceQuestionResponse
    extends SurveyInstanceQuestionResponse {
  private final Long surveyInstanceId;
  private final Long personId;
  private final LocalDateTime lastUpdatedAt;
  private final SurveyQuestionResponse questionResponse;

  private ImmutableSurveyInstanceQuestionResponse(
      Long surveyInstanceId,
      Long personId,
      LocalDateTime lastUpdatedAt,
      SurveyQuestionResponse questionResponse) {
    this.surveyInstanceId = surveyInstanceId;
    this.personId = personId;
    this.lastUpdatedAt = lastUpdatedAt;
    this.questionResponse = questionResponse;
  }

  /**
   * @return The value of the {@code surveyInstanceId} attribute
   */
  @JsonProperty("surveyInstanceId")
  @Override
  public Long surveyInstanceId() {
    return surveyInstanceId;
  }

  /**
   * @return The value of the {@code personId} attribute
   */
  @JsonProperty("personId")
  @Override
  public Long personId() {
    return personId;
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
   * @return The value of the {@code questionResponse} attribute
   */
  @JsonProperty("questionResponse")
  @Override
  public SurveyQuestionResponse questionResponse() {
    return questionResponse;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceQuestionResponse#surveyInstanceId() surveyInstanceId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyInstanceId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceQuestionResponse withSurveyInstanceId(Long value) {
    if (this.surveyInstanceId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyInstanceId");
    return new ImmutableSurveyInstanceQuestionResponse(newValue, this.personId, this.lastUpdatedAt, this.questionResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceQuestionResponse#personId() personId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceQuestionResponse withPersonId(Long value) {
    if (this.personId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "personId");
    return new ImmutableSurveyInstanceQuestionResponse(this.surveyInstanceId, newValue, this.lastUpdatedAt, this.questionResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceQuestionResponse#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceQuestionResponse withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableSurveyInstanceQuestionResponse(this.surveyInstanceId, this.personId, newValue, this.questionResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceQuestionResponse#questionResponse() questionResponse} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for questionResponse
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceQuestionResponse withQuestionResponse(SurveyQuestionResponse value) {
    if (this.questionResponse == value) return this;
    SurveyQuestionResponse newValue = Objects.requireNonNull(value, "questionResponse");
    return new ImmutableSurveyInstanceQuestionResponse(this.surveyInstanceId, this.personId, this.lastUpdatedAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyInstanceQuestionResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyInstanceQuestionResponse
        && equalTo((ImmutableSurveyInstanceQuestionResponse) another);
  }

  private boolean equalTo(ImmutableSurveyInstanceQuestionResponse another) {
    return surveyInstanceId.equals(another.surveyInstanceId)
        && personId.equals(another.personId)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && questionResponse.equals(another.questionResponse);
  }

  /**
   * Computes a hash code from attributes: {@code surveyInstanceId}, {@code personId}, {@code lastUpdatedAt}, {@code questionResponse}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyInstanceId.hashCode();
    h += (h << 5) + personId.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + questionResponse.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyInstanceQuestionResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SurveyInstanceQuestionResponse{"
        + "surveyInstanceId=" + surveyInstanceId
        + ", personId=" + personId
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", questionResponse=" + questionResponse
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyInstanceQuestionResponse {
    Long surveyInstanceId;
    Long personId;
    LocalDateTime lastUpdatedAt;
    SurveyQuestionResponse questionResponse;
    @JsonProperty("surveyInstanceId")
    public void setSurveyInstanceId(Long surveyInstanceId) {
      this.surveyInstanceId = surveyInstanceId;
    }
    @JsonProperty("personId")
    public void setPersonId(Long personId) {
      this.personId = personId;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("questionResponse")
    public void setQuestionResponse(SurveyQuestionResponse questionResponse) {
      this.questionResponse = questionResponse;
    }
    @Override
    public Long surveyInstanceId() { throw new UnsupportedOperationException(); }
    @Override
    public Long personId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyQuestionResponse questionResponse() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyInstanceQuestionResponse fromJson(Json json) {
    ImmutableSurveyInstanceQuestionResponse.Builder builder = ImmutableSurveyInstanceQuestionResponse.builder();
    if (json.surveyInstanceId != null) {
      builder.surveyInstanceId(json.surveyInstanceId);
    }
    if (json.personId != null) {
      builder.personId(json.personId);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.questionResponse != null) {
      builder.questionResponse(json.questionResponse);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyInstanceQuestionResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyInstanceQuestionResponse instance
   */
  public static ImmutableSurveyInstanceQuestionResponse copyOf(SurveyInstanceQuestionResponse instance) {
    if (instance instanceof ImmutableSurveyInstanceQuestionResponse) {
      return (ImmutableSurveyInstanceQuestionResponse) instance;
    }
    return ImmutableSurveyInstanceQuestionResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyInstanceQuestionResponse ImmutableSurveyInstanceQuestionResponse}.
   * @return A new ImmutableSurveyInstanceQuestionResponse builder
   */
  public static ImmutableSurveyInstanceQuestionResponse.Builder builder() {
    return new ImmutableSurveyInstanceQuestionResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyInstanceQuestionResponse ImmutableSurveyInstanceQuestionResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_INSTANCE_ID = 0x1L;
    private static final long INIT_BIT_PERSON_ID = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_AT = 0x4L;
    private static final long INIT_BIT_QUESTION_RESPONSE = 0x8L;
    private long initBits = 0xfL;

    private Long surveyInstanceId;
    private Long personId;
    private LocalDateTime lastUpdatedAt;
    private SurveyQuestionResponse questionResponse;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyInstanceQuestionResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyInstanceQuestionResponse instance) {
      Objects.requireNonNull(instance, "instance");
      surveyInstanceId(instance.surveyInstanceId());
      personId(instance.personId());
      lastUpdatedAt(instance.lastUpdatedAt());
      questionResponse(instance.questionResponse());
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceQuestionResponse#surveyInstanceId() surveyInstanceId} attribute.
     * @param surveyInstanceId The value for surveyInstanceId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyInstanceId")
    public final Builder surveyInstanceId(Long surveyInstanceId) {
      this.surveyInstanceId = Objects.requireNonNull(surveyInstanceId, "surveyInstanceId");
      initBits &= ~INIT_BIT_SURVEY_INSTANCE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceQuestionResponse#personId() personId} attribute.
     * @param personId The value for personId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("personId")
    public final Builder personId(Long personId) {
      this.personId = Objects.requireNonNull(personId, "personId");
      initBits &= ~INIT_BIT_PERSON_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceQuestionResponse#lastUpdatedAt() lastUpdatedAt} attribute.
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      initBits &= ~INIT_BIT_LAST_UPDATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceQuestionResponse#questionResponse() questionResponse} attribute.
     * @param questionResponse The value for questionResponse 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionResponse")
    public final Builder questionResponse(SurveyQuestionResponse questionResponse) {
      this.questionResponse = Objects.requireNonNull(questionResponse, "questionResponse");
      initBits &= ~INIT_BIT_QUESTION_RESPONSE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyInstanceQuestionResponse ImmutableSurveyInstanceQuestionResponse}.
     * @return An immutable instance of SurveyInstanceQuestionResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyInstanceQuestionResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyInstanceQuestionResponse(surveyInstanceId, personId, lastUpdatedAt, questionResponse);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_INSTANCE_ID) != 0) attributes.add("surveyInstanceId");
      if ((initBits & INIT_BIT_PERSON_ID) != 0) attributes.add("personId");
      if ((initBits & INIT_BIT_LAST_UPDATED_AT) != 0) attributes.add("lastUpdatedAt");
      if ((initBits & INIT_BIT_QUESTION_RESPONSE) != 0) attributes.add("questionResponse");
      return "Cannot build SurveyInstanceQuestionResponse, some of required attributes are not set " + attributes;
    }
  }
}
