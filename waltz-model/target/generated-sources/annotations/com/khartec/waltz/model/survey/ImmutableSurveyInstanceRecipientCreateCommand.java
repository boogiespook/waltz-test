package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyInstanceRecipientCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyInstanceRecipientCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyInstanceRecipientCreateCommand"})
public final class ImmutableSurveyInstanceRecipientCreateCommand
    extends SurveyInstanceRecipientCreateCommand {
  private final Long surveyInstanceId;
  private final Long personId;

  private ImmutableSurveyInstanceRecipientCreateCommand(Long surveyInstanceId, Long personId) {
    this.surveyInstanceId = surveyInstanceId;
    this.personId = personId;
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
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceRecipientCreateCommand#surveyInstanceId() surveyInstanceId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyInstanceId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceRecipientCreateCommand withSurveyInstanceId(Long value) {
    if (this.surveyInstanceId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyInstanceId");
    return new ImmutableSurveyInstanceRecipientCreateCommand(newValue, this.personId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceRecipientCreateCommand#personId() personId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceRecipientCreateCommand withPersonId(Long value) {
    if (this.personId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "personId");
    return new ImmutableSurveyInstanceRecipientCreateCommand(this.surveyInstanceId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyInstanceRecipientCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyInstanceRecipientCreateCommand
        && equalTo((ImmutableSurveyInstanceRecipientCreateCommand) another);
  }

  private boolean equalTo(ImmutableSurveyInstanceRecipientCreateCommand another) {
    return surveyInstanceId.equals(another.surveyInstanceId)
        && personId.equals(another.personId);
  }

  /**
   * Computes a hash code from attributes: {@code surveyInstanceId}, {@code personId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyInstanceId.hashCode();
    h += (h << 5) + personId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyInstanceRecipientCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SurveyInstanceRecipientCreateCommand{"
        + "surveyInstanceId=" + surveyInstanceId
        + ", personId=" + personId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyInstanceRecipientCreateCommand {
    Long surveyInstanceId;
    Long personId;
    @JsonProperty("surveyInstanceId")
    public void setSurveyInstanceId(Long surveyInstanceId) {
      this.surveyInstanceId = surveyInstanceId;
    }
    @JsonProperty("personId")
    public void setPersonId(Long personId) {
      this.personId = personId;
    }
    @Override
    public Long surveyInstanceId() { throw new UnsupportedOperationException(); }
    @Override
    public Long personId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyInstanceRecipientCreateCommand fromJson(Json json) {
    ImmutableSurveyInstanceRecipientCreateCommand.Builder builder = ImmutableSurveyInstanceRecipientCreateCommand.builder();
    if (json.surveyInstanceId != null) {
      builder.surveyInstanceId(json.surveyInstanceId);
    }
    if (json.personId != null) {
      builder.personId(json.personId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyInstanceRecipientCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyInstanceRecipientCreateCommand instance
   */
  public static ImmutableSurveyInstanceRecipientCreateCommand copyOf(SurveyInstanceRecipientCreateCommand instance) {
    if (instance instanceof ImmutableSurveyInstanceRecipientCreateCommand) {
      return (ImmutableSurveyInstanceRecipientCreateCommand) instance;
    }
    return ImmutableSurveyInstanceRecipientCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyInstanceRecipientCreateCommand ImmutableSurveyInstanceRecipientCreateCommand}.
   * @return A new ImmutableSurveyInstanceRecipientCreateCommand builder
   */
  public static ImmutableSurveyInstanceRecipientCreateCommand.Builder builder() {
    return new ImmutableSurveyInstanceRecipientCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyInstanceRecipientCreateCommand ImmutableSurveyInstanceRecipientCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_INSTANCE_ID = 0x1L;
    private static final long INIT_BIT_PERSON_ID = 0x2L;
    private long initBits = 0x3L;

    private Long surveyInstanceId;
    private Long personId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyInstanceRecipientCreateCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyInstanceRecipientCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      surveyInstanceId(instance.surveyInstanceId());
      personId(instance.personId());
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceRecipientCreateCommand#surveyInstanceId() surveyInstanceId} attribute.
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
     * Initializes the value for the {@link SurveyInstanceRecipientCreateCommand#personId() personId} attribute.
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
     * Builds a new {@link ImmutableSurveyInstanceRecipientCreateCommand ImmutableSurveyInstanceRecipientCreateCommand}.
     * @return An immutable instance of SurveyInstanceRecipientCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyInstanceRecipientCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyInstanceRecipientCreateCommand(surveyInstanceId, personId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_INSTANCE_ID) != 0) attributes.add("surveyInstanceId");
      if ((initBits & INIT_BIT_PERSON_ID) != 0) attributes.add("personId");
      return "Cannot build SurveyInstanceRecipientCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
