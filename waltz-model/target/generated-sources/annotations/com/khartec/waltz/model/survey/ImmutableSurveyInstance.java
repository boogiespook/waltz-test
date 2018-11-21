package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyInstance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyInstance.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyInstance"})
public final class ImmutableSurveyInstance extends SurveyInstance {
  private final Long surveyRunId;
  private final EntityReference surveyEntity;
  private final @Nullable String surveyEntityExternalId;
  private final SurveyInstanceStatus status;
  private final LocalDate dueDate;
  private final @Nullable LocalDateTime submittedAt;
  private final @Nullable String submittedBy;
  private final @Nullable LocalDateTime approvedAt;
  private final @Nullable String approvedBy;
  private final @Nullable Long originalInstanceId;
  private final Long id;

  private ImmutableSurveyInstance(
      Long surveyRunId,
      EntityReference surveyEntity,
      @Nullable String surveyEntityExternalId,
      SurveyInstanceStatus status,
      LocalDate dueDate,
      @Nullable LocalDateTime submittedAt,
      @Nullable String submittedBy,
      @Nullable LocalDateTime approvedAt,
      @Nullable String approvedBy,
      @Nullable Long originalInstanceId,
      Long id) {
    this.surveyRunId = surveyRunId;
    this.surveyEntity = surveyEntity;
    this.surveyEntityExternalId = surveyEntityExternalId;
    this.status = status;
    this.dueDate = dueDate;
    this.submittedAt = submittedAt;
    this.submittedBy = submittedBy;
    this.approvedAt = approvedAt;
    this.approvedBy = approvedBy;
    this.originalInstanceId = originalInstanceId;
    this.id = id;
  }

  /**
   * @return The value of the {@code surveyRunId} attribute
   */
  @JsonProperty("surveyRunId")
  @Override
  public Long surveyRunId() {
    return surveyRunId;
  }

  /**
   * @return The value of the {@code surveyEntity} attribute
   */
  @JsonProperty("surveyEntity")
  @Override
  public EntityReference surveyEntity() {
    return surveyEntity;
  }

  /**
   * @return The value of the {@code surveyEntityExternalId} attribute
   */
  @JsonProperty("surveyEntityExternalId")
  @Override
  public @Nullable String surveyEntityExternalId() {
    return surveyEntityExternalId;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public SurveyInstanceStatus status() {
    return status;
  }

  /**
   * @return The value of the {@code dueDate} attribute
   */
  @JsonProperty("dueDate")
  @Override
  public LocalDate dueDate() {
    return dueDate;
  }

  /**
   * @return The value of the {@code submittedAt} attribute
   */
  @JsonProperty("submittedAt")
  @Override
  public @Nullable LocalDateTime submittedAt() {
    return submittedAt;
  }

  /**
   * @return The value of the {@code submittedBy} attribute
   */
  @JsonProperty("submittedBy")
  @Override
  public @Nullable String submittedBy() {
    return submittedBy;
  }

  /**
   * @return The value of the {@code approvedAt} attribute
   */
  @JsonProperty("approvedAt")
  @Override
  public @Nullable LocalDateTime approvedAt() {
    return approvedAt;
  }

  /**
   * @return The value of the {@code approvedBy} attribute
   */
  @JsonProperty("approvedBy")
  @Override
  public @Nullable String approvedBy() {
    return approvedBy;
  }

  /**
   * @return The value of the {@code originalInstanceId} attribute
   */
  @JsonProperty("originalInstanceId")
  @Override
  public @Nullable Long originalInstanceId() {
    return originalInstanceId;
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
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#surveyRunId() surveyRunId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyRunId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withSurveyRunId(Long value) {
    if (this.surveyRunId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyRunId");
    return new ImmutableSurveyInstance(
        newValue,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#surveyEntity() surveyEntity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyEntity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withSurveyEntity(EntityReference value) {
    if (this.surveyEntity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "surveyEntity");
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        newValue,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#surveyEntityExternalId() surveyEntityExternalId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyEntityExternalId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withSurveyEntityExternalId(@Nullable String value) {
    if (Objects.equals(this.surveyEntityExternalId, value)) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        value,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withStatus(SurveyInstanceStatus value) {
    if (this.status == value) return this;
    SurveyInstanceStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        newValue,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#dueDate() dueDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dueDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withDueDate(LocalDate value) {
    if (this.dueDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "dueDate");
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        newValue,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#submittedAt() submittedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for submittedAt (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withSubmittedAt(@Nullable LocalDateTime value) {
    if (this.submittedAt == value) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        value,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#submittedBy() submittedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for submittedBy (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withSubmittedBy(@Nullable String value) {
    if (Objects.equals(this.submittedBy, value)) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        value,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#approvedAt() approvedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for approvedAt (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withApprovedAt(@Nullable LocalDateTime value) {
    if (this.approvedAt == value) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        value,
        this.approvedBy,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#approvedBy() approvedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for approvedBy (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withApprovedBy(@Nullable String value) {
    if (Objects.equals(this.approvedBy, value)) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        value,
        this.originalInstanceId,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstance#originalInstanceId() originalInstanceId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originalInstanceId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstance withOriginalInstanceId(@Nullable Long value) {
    if (Objects.equals(this.originalInstanceId, value)) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyInstance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstance withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyInstance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstance withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyInstance(
        this.surveyRunId,
        this.surveyEntity,
        this.surveyEntityExternalId,
        this.status,
        this.dueDate,
        this.submittedAt,
        this.submittedBy,
        this.approvedAt,
        this.approvedBy,
        this.originalInstanceId,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyInstance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyInstance
        && equalTo((ImmutableSurveyInstance) another);
  }

  private boolean equalTo(ImmutableSurveyInstance another) {
    return surveyRunId.equals(another.surveyRunId)
        && surveyEntity.equals(another.surveyEntity)
        && Objects.equals(surveyEntityExternalId, another.surveyEntityExternalId)
        && status.equals(another.status)
        && dueDate.equals(another.dueDate)
        && Objects.equals(submittedAt, another.submittedAt)
        && Objects.equals(submittedBy, another.submittedBy)
        && Objects.equals(approvedAt, another.approvedAt)
        && Objects.equals(approvedBy, another.approvedBy)
        && Objects.equals(originalInstanceId, another.originalInstanceId)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code surveyRunId}, {@code surveyEntity}, {@code surveyEntityExternalId}, {@code status}, {@code dueDate}, {@code submittedAt}, {@code submittedBy}, {@code approvedAt}, {@code approvedBy}, {@code originalInstanceId}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyRunId.hashCode();
    h += (h << 5) + surveyEntity.hashCode();
    h += (h << 5) + Objects.hashCode(surveyEntityExternalId);
    h += (h << 5) + status.hashCode();
    h += (h << 5) + dueDate.hashCode();
    h += (h << 5) + Objects.hashCode(submittedAt);
    h += (h << 5) + Objects.hashCode(submittedBy);
    h += (h << 5) + Objects.hashCode(approvedAt);
    h += (h << 5) + Objects.hashCode(approvedBy);
    h += (h << 5) + Objects.hashCode(originalInstanceId);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyInstance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyInstance{");
    builder.append("surveyRunId=").append(surveyRunId);
    builder.append(", ");
    builder.append("surveyEntity=").append(surveyEntity);
    if (surveyEntityExternalId != null) {
      builder.append(", ");
      builder.append("surveyEntityExternalId=").append(surveyEntityExternalId);
    }
    builder.append(", ");
    builder.append("status=").append(status);
    builder.append(", ");
    builder.append("dueDate=").append(dueDate);
    if (submittedAt != null) {
      builder.append(", ");
      builder.append("submittedAt=").append(submittedAt);
    }
    if (submittedBy != null) {
      builder.append(", ");
      builder.append("submittedBy=").append(submittedBy);
    }
    if (approvedAt != null) {
      builder.append(", ");
      builder.append("approvedAt=").append(approvedAt);
    }
    if (approvedBy != null) {
      builder.append(", ");
      builder.append("approvedBy=").append(approvedBy);
    }
    if (originalInstanceId != null) {
      builder.append(", ");
      builder.append("originalInstanceId=").append(originalInstanceId);
    }
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
  static final class Json extends SurveyInstance {
    Long surveyRunId;
    EntityReference surveyEntity;
    String surveyEntityExternalId;
    SurveyInstanceStatus status;
    LocalDate dueDate;
    LocalDateTime submittedAt;
    String submittedBy;
    LocalDateTime approvedAt;
    String approvedBy;
    Long originalInstanceId;
    Optional<Long> id = Optional.empty();
    @JsonProperty("surveyRunId")
    public void setSurveyRunId(Long surveyRunId) {
      this.surveyRunId = surveyRunId;
    }
    @JsonProperty("surveyEntity")
    public void setSurveyEntity(EntityReference surveyEntity) {
      this.surveyEntity = surveyEntity;
    }
    @JsonProperty("surveyEntityExternalId")
    public void setSurveyEntityExternalId(@Nullable String surveyEntityExternalId) {
      this.surveyEntityExternalId = surveyEntityExternalId;
    }
    @JsonProperty("status")
    public void setStatus(SurveyInstanceStatus status) {
      this.status = status;
    }
    @JsonProperty("dueDate")
    public void setDueDate(LocalDate dueDate) {
      this.dueDate = dueDate;
    }
    @JsonProperty("submittedAt")
    public void setSubmittedAt(@Nullable LocalDateTime submittedAt) {
      this.submittedAt = submittedAt;
    }
    @JsonProperty("submittedBy")
    public void setSubmittedBy(@Nullable String submittedBy) {
      this.submittedBy = submittedBy;
    }
    @JsonProperty("approvedAt")
    public void setApprovedAt(@Nullable LocalDateTime approvedAt) {
      this.approvedAt = approvedAt;
    }
    @JsonProperty("approvedBy")
    public void setApprovedBy(@Nullable String approvedBy) {
      this.approvedBy = approvedBy;
    }
    @JsonProperty("originalInstanceId")
    public void setOriginalInstanceId(@Nullable Long originalInstanceId) {
      this.originalInstanceId = originalInstanceId;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public Long surveyRunId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference surveyEntity() { throw new UnsupportedOperationException(); }
    @Override
    public String surveyEntityExternalId() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyInstanceStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate dueDate() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime submittedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String submittedBy() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime approvedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String approvedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Long originalInstanceId() { throw new UnsupportedOperationException(); }
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
  static ImmutableSurveyInstance fromJson(Json json) {
    ImmutableSurveyInstance.Builder builder = ImmutableSurveyInstance.builder();
    if (json.surveyRunId != null) {
      builder.surveyRunId(json.surveyRunId);
    }
    if (json.surveyEntity != null) {
      builder.surveyEntity(json.surveyEntity);
    }
    if (json.surveyEntityExternalId != null) {
      builder.surveyEntityExternalId(json.surveyEntityExternalId);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.dueDate != null) {
      builder.dueDate(json.dueDate);
    }
    if (json.submittedAt != null) {
      builder.submittedAt(json.submittedAt);
    }
    if (json.submittedBy != null) {
      builder.submittedBy(json.submittedBy);
    }
    if (json.approvedAt != null) {
      builder.approvedAt(json.approvedAt);
    }
    if (json.approvedBy != null) {
      builder.approvedBy(json.approvedBy);
    }
    if (json.originalInstanceId != null) {
      builder.originalInstanceId(json.originalInstanceId);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyInstance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyInstance instance
   */
  public static ImmutableSurveyInstance copyOf(SurveyInstance instance) {
    if (instance instanceof ImmutableSurveyInstance) {
      return (ImmutableSurveyInstance) instance;
    }
    return ImmutableSurveyInstance.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyInstance ImmutableSurveyInstance}.
   * @return A new ImmutableSurveyInstance builder
   */
  public static ImmutableSurveyInstance.Builder builder() {
    return new ImmutableSurveyInstance.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyInstance ImmutableSurveyInstance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_RUN_ID = 0x1L;
    private static final long INIT_BIT_SURVEY_ENTITY = 0x2L;
    private static final long INIT_BIT_STATUS = 0x4L;
    private static final long INIT_BIT_DUE_DATE = 0x8L;
    private long initBits = 0xfL;

    private Long surveyRunId;
    private EntityReference surveyEntity;
    private String surveyEntityExternalId;
    private SurveyInstanceStatus status;
    private LocalDate dueDate;
    private LocalDateTime submittedAt;
    private String submittedBy;
    private LocalDateTime approvedAt;
    private String approvedBy;
    private Long originalInstanceId;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyInstance} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyInstance instance) {
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
      if (object instanceof SurveyInstance) {
        SurveyInstance instance = (SurveyInstance) object;
        @Nullable String submittedByValue = instance.submittedBy();
        if (submittedByValue != null) {
          submittedBy(submittedByValue);
        }
        surveyEntity(instance.surveyEntity());
        surveyRunId(instance.surveyRunId());
        dueDate(instance.dueDate());
        @Nullable Long originalInstanceIdValue = instance.originalInstanceId();
        if (originalInstanceIdValue != null) {
          originalInstanceId(originalInstanceIdValue);
        }
        @Nullable String approvedByValue = instance.approvedBy();
        if (approvedByValue != null) {
          approvedBy(approvedByValue);
        }
        @Nullable LocalDateTime submittedAtValue = instance.submittedAt();
        if (submittedAtValue != null) {
          submittedAt(submittedAtValue);
        }
        @Nullable LocalDateTime approvedAtValue = instance.approvedAt();
        if (approvedAtValue != null) {
          approvedAt(approvedAtValue);
        }
        @Nullable String surveyEntityExternalIdValue = instance.surveyEntityExternalId();
        if (surveyEntityExternalIdValue != null) {
          surveyEntityExternalId(surveyEntityExternalIdValue);
        }
        status(instance.status());
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
     * Initializes the value for the {@link SurveyInstance#surveyRunId() surveyRunId} attribute.
     * @param surveyRunId The value for surveyRunId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyRunId")
    public final Builder surveyRunId(Long surveyRunId) {
      this.surveyRunId = Objects.requireNonNull(surveyRunId, "surveyRunId");
      initBits &= ~INIT_BIT_SURVEY_RUN_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#surveyEntity() surveyEntity} attribute.
     * @param surveyEntity The value for surveyEntity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyEntity")
    public final Builder surveyEntity(EntityReference surveyEntity) {
      this.surveyEntity = Objects.requireNonNull(surveyEntity, "surveyEntity");
      initBits &= ~INIT_BIT_SURVEY_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#surveyEntityExternalId() surveyEntityExternalId} attribute.
     * @param surveyEntityExternalId The value for surveyEntityExternalId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyEntityExternalId")
    public final Builder surveyEntityExternalId(@Nullable String surveyEntityExternalId) {
      this.surveyEntityExternalId = surveyEntityExternalId;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(SurveyInstanceStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#dueDate() dueDate} attribute.
     * @param dueDate The value for dueDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDate")
    public final Builder dueDate(LocalDate dueDate) {
      this.dueDate = Objects.requireNonNull(dueDate, "dueDate");
      initBits &= ~INIT_BIT_DUE_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#submittedAt() submittedAt} attribute.
     * @param submittedAt The value for submittedAt (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("submittedAt")
    public final Builder submittedAt(@Nullable LocalDateTime submittedAt) {
      this.submittedAt = submittedAt;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#submittedBy() submittedBy} attribute.
     * @param submittedBy The value for submittedBy (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("submittedBy")
    public final Builder submittedBy(@Nullable String submittedBy) {
      this.submittedBy = submittedBy;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#approvedAt() approvedAt} attribute.
     * @param approvedAt The value for approvedAt (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("approvedAt")
    public final Builder approvedAt(@Nullable LocalDateTime approvedAt) {
      this.approvedAt = approvedAt;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#approvedBy() approvedBy} attribute.
     * @param approvedBy The value for approvedBy (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("approvedBy")
    public final Builder approvedBy(@Nullable String approvedBy) {
      this.approvedBy = approvedBy;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstance#originalInstanceId() originalInstanceId} attribute.
     * @param originalInstanceId The value for originalInstanceId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("originalInstanceId")
    public final Builder originalInstanceId(@Nullable Long originalInstanceId) {
      this.originalInstanceId = originalInstanceId;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyInstance ImmutableSurveyInstance}.
     * @return An immutable instance of SurveyInstance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyInstance build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyInstance(
          surveyRunId,
          surveyEntity,
          surveyEntityExternalId,
          status,
          dueDate,
          submittedAt,
          submittedBy,
          approvedAt,
          approvedBy,
          originalInstanceId,
          id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_RUN_ID) != 0) attributes.add("surveyRunId");
      if ((initBits & INIT_BIT_SURVEY_ENTITY) != 0) attributes.add("surveyEntity");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_DUE_DATE) != 0) attributes.add("dueDate");
      return "Cannot build SurveyInstance, some of required attributes are not set " + attributes;
    }
  }
}
