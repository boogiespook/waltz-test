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
 * Immutable implementation of {@link SurveyQuestion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyQuestion.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyQuestion"})
public final class ImmutableSurveyQuestion extends SurveyQuestion {
  private final Long surveyTemplateId;
  private final String questionText;
  private final String helpText;
  private final SurveyQuestionFieldType fieldType;
  private final String sectionName;
  private final Integer position;
  private final boolean isMandatory;
  private final Boolean allowComment;
  private final Long id;

  private ImmutableSurveyQuestion(ImmutableSurveyQuestion.Builder builder) {
    this.surveyTemplateId = builder.surveyTemplateId;
    this.questionText = builder.questionText;
    this.helpText = builder.helpText;
    this.fieldType = builder.fieldType;
    this.sectionName = builder.sectionName;
    this.id = builder.id;
    if (builder.position != null) {
      initShim.position(builder.position);
    }
    if (builder.isMandatoryIsSet()) {
      initShim.isMandatory(builder.isMandatory);
    }
    if (builder.allowComment != null) {
      initShim.allowComment(builder.allowComment);
    }
    this.position = initShim.position();
    this.isMandatory = initShim.isMandatory();
    this.allowComment = initShim.allowComment();
    this.initShim = null;
  }

  private ImmutableSurveyQuestion(
      Long surveyTemplateId,
      String questionText,
      String helpText,
      SurveyQuestionFieldType fieldType,
      String sectionName,
      Integer position,
      boolean isMandatory,
      Boolean allowComment,
      Long id) {
    this.surveyTemplateId = surveyTemplateId;
    this.questionText = questionText;
    this.helpText = helpText;
    this.fieldType = fieldType;
    this.sectionName = sectionName;
    this.position = position;
    this.isMandatory = isMandatory;
    this.allowComment = allowComment;
    this.id = id;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private Integer position;
    private int positionBuildStage;

    Integer position() {
      if (positionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (positionBuildStage == STAGE_UNINITIALIZED) {
        positionBuildStage = STAGE_INITIALIZING;
        this.position = Objects.requireNonNull(ImmutableSurveyQuestion.super.position(), "position");
        positionBuildStage = STAGE_INITIALIZED;
      }
      return this.position;
    }

    void position(Integer position) {
      this.position = position;
      positionBuildStage = STAGE_INITIALIZED;
    }
    private boolean isMandatory;
    private int isMandatoryBuildStage;

    boolean isMandatory() {
      if (isMandatoryBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isMandatoryBuildStage == STAGE_UNINITIALIZED) {
        isMandatoryBuildStage = STAGE_INITIALIZING;
        this.isMandatory = ImmutableSurveyQuestion.super.isMandatory();
        isMandatoryBuildStage = STAGE_INITIALIZED;
      }
      return this.isMandatory;
    }

    void isMandatory(boolean isMandatory) {
      this.isMandatory = isMandatory;
      isMandatoryBuildStage = STAGE_INITIALIZED;
    }
    private Boolean allowComment;
    private int allowCommentBuildStage;

    Boolean allowComment() {
      if (allowCommentBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (allowCommentBuildStage == STAGE_UNINITIALIZED) {
        allowCommentBuildStage = STAGE_INITIALIZING;
        this.allowComment = Objects.requireNonNull(ImmutableSurveyQuestion.super.allowComment(), "allowComment");
        allowCommentBuildStage = STAGE_INITIALIZED;
      }
      return this.allowComment;
    }

    void allowComment(Boolean allowComment) {
      this.allowComment = allowComment;
      allowCommentBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (positionBuildStage == STAGE_INITIALIZING) attributes.add("position");
      if (isMandatoryBuildStage == STAGE_INITIALIZING) attributes.add("isMandatory");
      if (allowCommentBuildStage == STAGE_INITIALIZING) attributes.add("allowComment");
      return "Cannot build SurveyQuestion, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code surveyTemplateId} attribute
   */
  @JsonProperty("surveyTemplateId")
  @Override
  public Long surveyTemplateId() {
    return surveyTemplateId;
  }

  /**
   * @return The value of the {@code questionText} attribute
   */
  @JsonProperty("questionText")
  @Override
  public String questionText() {
    return questionText;
  }

  /**
   * @return The value of the {@code helpText} attribute
   */
  @JsonProperty("helpText")
  @Override
  public Optional<String> helpText() {
    return Optional.ofNullable(helpText);
  }

  /**
   * @return The value of the {@code fieldType} attribute
   */
  @JsonProperty("fieldType")
  @Override
  public SurveyQuestionFieldType fieldType() {
    return fieldType;
  }

  /**
   * @return The value of the {@code sectionName} attribute
   */
  @JsonProperty("sectionName")
  @Override
  public Optional<String> sectionName() {
    return Optional.ofNullable(sectionName);
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public Integer position() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.position()
        : this.position;
  }

  /**
   * @return The value of the {@code isMandatory} attribute
   */
  @JsonProperty("isMandatory")
  @Override
  public boolean isMandatory() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isMandatory()
        : this.isMandatory;
  }

  /**
   * @return The value of the {@code allowComment} attribute
   */
  @JsonProperty("allowComment")
  @Override
  public Boolean allowComment() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.allowComment()
        : this.allowComment;
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
   * Copy the current immutable object by setting a value for the {@link SurveyQuestion#surveyTemplateId() surveyTemplateId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyTemplateId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestion withSurveyTemplateId(Long value) {
    if (this.surveyTemplateId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyTemplateId");
    return new ImmutableSurveyQuestion(
        newValue,
        this.questionText,
        this.helpText,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestion#questionText() questionText} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for questionText
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestion withQuestionText(String value) {
    if (this.questionText.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "questionText");
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        newValue,
        this.helpText,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestion#helpText() helpText} attribute.
   * @param value The value for helpText
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestion withHelpText(String value) {
    String newValue = Objects.requireNonNull(value, "helpText");
    if (Objects.equals(this.helpText, newValue)) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        newValue,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestion#helpText() helpText} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for helpText
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestion withHelpText(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.helpText, value)) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        value,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestion#fieldType() fieldType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fieldType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestion withFieldType(SurveyQuestionFieldType value) {
    if (this.fieldType == value) return this;
    SurveyQuestionFieldType newValue = Objects.requireNonNull(value, "fieldType");
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        newValue,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestion#sectionName() sectionName} attribute.
   * @param value The value for sectionName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestion withSectionName(String value) {
    String newValue = Objects.requireNonNull(value, "sectionName");
    if (Objects.equals(this.sectionName, newValue)) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        newValue,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestion#sectionName() sectionName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sectionName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestion withSectionName(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.sectionName, value)) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        value,
        this.position,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestion#position() position} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestion withPosition(Integer value) {
    if (this.position.equals(value)) return this;
    Integer newValue = Objects.requireNonNull(value, "position");
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        this.sectionName,
        newValue,
        this.isMandatory,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestion#isMandatory() isMandatory} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isMandatory
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestion withIsMandatory(boolean value) {
    if (this.isMandatory == value) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        this.sectionName,
        this.position,
        value,
        this.allowComment,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyQuestion#allowComment() allowComment} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for allowComment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyQuestion withAllowComment(Boolean value) {
    if (this.allowComment.equals(value)) return this;
    Boolean newValue = Objects.requireNonNull(value, "allowComment");
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyQuestion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestion withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyQuestion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyQuestion withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyQuestion(
        this.surveyTemplateId,
        this.questionText,
        this.helpText,
        this.fieldType,
        this.sectionName,
        this.position,
        this.isMandatory,
        this.allowComment,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyQuestion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyQuestion
        && equalTo((ImmutableSurveyQuestion) another);
  }

  private boolean equalTo(ImmutableSurveyQuestion another) {
    return surveyTemplateId.equals(another.surveyTemplateId)
        && questionText.equals(another.questionText)
        && Objects.equals(helpText, another.helpText)
        && fieldType.equals(another.fieldType)
        && Objects.equals(sectionName, another.sectionName)
        && position.equals(another.position)
        && isMandatory == another.isMandatory
        && allowComment.equals(another.allowComment)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code surveyTemplateId}, {@code questionText}, {@code helpText}, {@code fieldType}, {@code sectionName}, {@code position}, {@code isMandatory}, {@code allowComment}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyTemplateId.hashCode();
    h += (h << 5) + questionText.hashCode();
    h += (h << 5) + Objects.hashCode(helpText);
    h += (h << 5) + fieldType.hashCode();
    h += (h << 5) + Objects.hashCode(sectionName);
    h += (h << 5) + position.hashCode();
    h += (h << 5) + Boolean.hashCode(isMandatory);
    h += (h << 5) + allowComment.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyQuestion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyQuestion{");
    builder.append("surveyTemplateId=").append(surveyTemplateId);
    builder.append(", ");
    builder.append("questionText=").append(questionText);
    if (helpText != null) {
      builder.append(", ");
      builder.append("helpText=").append(helpText);
    }
    builder.append(", ");
    builder.append("fieldType=").append(fieldType);
    if (sectionName != null) {
      builder.append(", ");
      builder.append("sectionName=").append(sectionName);
    }
    builder.append(", ");
    builder.append("position=").append(position);
    builder.append(", ");
    builder.append("isMandatory=").append(isMandatory);
    builder.append(", ");
    builder.append("allowComment=").append(allowComment);
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
  static final class Json extends SurveyQuestion {
    Long surveyTemplateId;
    String questionText;
    Optional<String> helpText = Optional.empty();
    SurveyQuestionFieldType fieldType;
    Optional<String> sectionName = Optional.empty();
    Integer position;
    boolean isMandatory;
    boolean isMandatoryIsSet;
    Boolean allowComment;
    Optional<Long> id = Optional.empty();
    @JsonProperty("surveyTemplateId")
    public void setSurveyTemplateId(Long surveyTemplateId) {
      this.surveyTemplateId = surveyTemplateId;
    }
    @JsonProperty("questionText")
    public void setQuestionText(String questionText) {
      this.questionText = questionText;
    }
    @JsonProperty("helpText")
    public void setHelpText(Optional<String> helpText) {
      this.helpText = helpText;
    }
    @JsonProperty("fieldType")
    public void setFieldType(SurveyQuestionFieldType fieldType) {
      this.fieldType = fieldType;
    }
    @JsonProperty("sectionName")
    public void setSectionName(Optional<String> sectionName) {
      this.sectionName = sectionName;
    }
    @JsonProperty("position")
    public void setPosition(Integer position) {
      this.position = position;
    }
    @JsonProperty("isMandatory")
    public void setIsMandatory(boolean isMandatory) {
      this.isMandatory = isMandatory;
      this.isMandatoryIsSet = true;
    }
    @JsonProperty("allowComment")
    public void setAllowComment(Boolean allowComment) {
      this.allowComment = allowComment;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public Long surveyTemplateId() { throw new UnsupportedOperationException(); }
    @Override
    public String questionText() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> helpText() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyQuestionFieldType fieldType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sectionName() { throw new UnsupportedOperationException(); }
    @Override
    public Integer position() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isMandatory() { throw new UnsupportedOperationException(); }
    @Override
    public Boolean allowComment() { throw new UnsupportedOperationException(); }
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
  static ImmutableSurveyQuestion fromJson(Json json) {
    ImmutableSurveyQuestion.Builder builder = ImmutableSurveyQuestion.builder();
    if (json.surveyTemplateId != null) {
      builder.surveyTemplateId(json.surveyTemplateId);
    }
    if (json.questionText != null) {
      builder.questionText(json.questionText);
    }
    if (json.helpText != null) {
      builder.helpText(json.helpText);
    }
    if (json.fieldType != null) {
      builder.fieldType(json.fieldType);
    }
    if (json.sectionName != null) {
      builder.sectionName(json.sectionName);
    }
    if (json.position != null) {
      builder.position(json.position);
    }
    if (json.isMandatoryIsSet) {
      builder.isMandatory(json.isMandatory);
    }
    if (json.allowComment != null) {
      builder.allowComment(json.allowComment);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyQuestion} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyQuestion instance
   */
  public static ImmutableSurveyQuestion copyOf(SurveyQuestion instance) {
    if (instance instanceof ImmutableSurveyQuestion) {
      return (ImmutableSurveyQuestion) instance;
    }
    return ImmutableSurveyQuestion.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyQuestion ImmutableSurveyQuestion}.
   * @return A new ImmutableSurveyQuestion builder
   */
  public static ImmutableSurveyQuestion.Builder builder() {
    return new ImmutableSurveyQuestion.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyQuestion ImmutableSurveyQuestion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_TEMPLATE_ID = 0x1L;
    private static final long INIT_BIT_QUESTION_TEXT = 0x2L;
    private static final long INIT_BIT_FIELD_TYPE = 0x4L;
    private static final long OPT_BIT_IS_MANDATORY = 0x1L;
    private long initBits = 0x7L;
    private long optBits;

    private Long surveyTemplateId;
    private String questionText;
    private String helpText;
    private SurveyQuestionFieldType fieldType;
    private String sectionName;
    private Integer position;
    private boolean isMandatory;
    private Boolean allowComment;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyQuestion} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyQuestion instance) {
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
      if (object instanceof SurveyQuestion) {
        SurveyQuestion instance = (SurveyQuestion) object;
        Optional<String> sectionNameOptional = instance.sectionName();
        if (sectionNameOptional.isPresent()) {
          sectionName(sectionNameOptional);
        }
        Optional<String> helpTextOptional = instance.helpText();
        if (helpTextOptional.isPresent()) {
          helpText(helpTextOptional);
        }
        position(instance.position());
        allowComment(instance.allowComment());
        fieldType(instance.fieldType());
        surveyTemplateId(instance.surveyTemplateId());
        questionText(instance.questionText());
        isMandatory(instance.isMandatory());
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
     * Initializes the value for the {@link SurveyQuestion#surveyTemplateId() surveyTemplateId} attribute.
     * @param surveyTemplateId The value for surveyTemplateId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyTemplateId")
    public final Builder surveyTemplateId(Long surveyTemplateId) {
      this.surveyTemplateId = Objects.requireNonNull(surveyTemplateId, "surveyTemplateId");
      initBits &= ~INIT_BIT_SURVEY_TEMPLATE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestion#questionText() questionText} attribute.
     * @param questionText The value for questionText 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionText")
    public final Builder questionText(String questionText) {
      this.questionText = Objects.requireNonNull(questionText, "questionText");
      initBits &= ~INIT_BIT_QUESTION_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestion#helpText() helpText} to helpText.
     * @param helpText The value for helpText
     * @return {@code this} builder for chained invocation
     */
    public final Builder helpText(String helpText) {
      this.helpText = Objects.requireNonNull(helpText, "helpText");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestion#helpText() helpText} to helpText.
     * @param helpText The value for helpText
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("helpText")
    public final Builder helpText(Optional<String> helpText) {
      this.helpText = helpText.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestion#fieldType() fieldType} attribute.
     * @param fieldType The value for fieldType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fieldType")
    public final Builder fieldType(SurveyQuestionFieldType fieldType) {
      this.fieldType = Objects.requireNonNull(fieldType, "fieldType");
      initBits &= ~INIT_BIT_FIELD_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestion#sectionName() sectionName} to sectionName.
     * @param sectionName The value for sectionName
     * @return {@code this} builder for chained invocation
     */
    public final Builder sectionName(String sectionName) {
      this.sectionName = Objects.requireNonNull(sectionName, "sectionName");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestion#sectionName() sectionName} to sectionName.
     * @param sectionName The value for sectionName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sectionName")
    public final Builder sectionName(Optional<String> sectionName) {
      this.sectionName = sectionName.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestion#position() position} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SurveyQuestion#position() position}.</em>
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(Integer position) {
      this.position = Objects.requireNonNull(position, "position");
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestion#isMandatory() isMandatory} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SurveyQuestion#isMandatory() isMandatory}.</em>
     * @param isMandatory The value for isMandatory 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isMandatory")
    public final Builder isMandatory(boolean isMandatory) {
      this.isMandatory = isMandatory;
      optBits |= OPT_BIT_IS_MANDATORY;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyQuestion#allowComment() allowComment} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SurveyQuestion#allowComment() allowComment}.</em>
     * @param allowComment The value for allowComment 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowComment")
    public final Builder allowComment(Boolean allowComment) {
      this.allowComment = Objects.requireNonNull(allowComment, "allowComment");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyQuestion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyQuestion ImmutableSurveyQuestion}.
     * @return An immutable instance of SurveyQuestion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyQuestion build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyQuestion(this);
    }

    private boolean isMandatoryIsSet() {
      return (optBits & OPT_BIT_IS_MANDATORY) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_TEMPLATE_ID) != 0) attributes.add("surveyTemplateId");
      if ((initBits & INIT_BIT_QUESTION_TEXT) != 0) attributes.add("questionText");
      if ((initBits & INIT_BIT_FIELD_TYPE) != 0) attributes.add("fieldType");
      return "Cannot build SurveyQuestion, some of required attributes are not set " + attributes;
    }
  }
}
