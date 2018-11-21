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
 * Immutable implementation of {@link SurveyInstanceCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyInstanceCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyInstanceCreateCommand"})
public final class ImmutableSurveyInstanceCreateCommand
    extends SurveyInstanceCreateCommand {
  private final Long surveyRunId;
  private final EntityReference entityReference;
  private final LocalDate dueDate;
  private final SurveyInstanceStatus status;

  private ImmutableSurveyInstanceCreateCommand(ImmutableSurveyInstanceCreateCommand.Builder builder) {
    this.surveyRunId = builder.surveyRunId;
    this.entityReference = builder.entityReference;
    this.dueDate = builder.dueDate;
    this.status = builder.status != null
        ? builder.status
        : Objects.requireNonNull(super.status(), "status");
  }

  private ImmutableSurveyInstanceCreateCommand(
      Long surveyRunId,
      EntityReference entityReference,
      LocalDate dueDate,
      SurveyInstanceStatus status) {
    this.surveyRunId = surveyRunId;
    this.entityReference = entityReference;
    this.dueDate = dueDate;
    this.status = status;
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
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code dueDate} attribute
   */
  @JsonProperty("dueDate")
  @Override
  public Optional<LocalDate> dueDate() {
    return Optional.ofNullable(dueDate);
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
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceCreateCommand#surveyRunId() surveyRunId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyRunId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceCreateCommand withSurveyRunId(Long value) {
    if (this.surveyRunId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyRunId");
    return new ImmutableSurveyInstanceCreateCommand(newValue, this.entityReference, this.dueDate, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceCreateCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceCreateCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableSurveyInstanceCreateCommand(this.surveyRunId, newValue, this.dueDate, this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyInstanceCreateCommand#dueDate() dueDate} attribute.
   * @param value The value for dueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstanceCreateCommand withDueDate(LocalDate value) {
    LocalDate newValue = Objects.requireNonNull(value, "dueDate");
    if (this.dueDate == newValue) return this;
    return new ImmutableSurveyInstanceCreateCommand(this.surveyRunId, this.entityReference, newValue, this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyInstanceCreateCommand#dueDate() dueDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstanceCreateCommand withDueDate(Optional<? extends LocalDate> optional) {
    LocalDate value = optional.orElse(null);
    if (this.dueDate == value) return this;
    return new ImmutableSurveyInstanceCreateCommand(this.surveyRunId, this.entityReference, value, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceCreateCommand#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceCreateCommand withStatus(SurveyInstanceStatus value) {
    if (this.status == value) return this;
    SurveyInstanceStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableSurveyInstanceCreateCommand(this.surveyRunId, this.entityReference, this.dueDate, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyInstanceCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyInstanceCreateCommand
        && equalTo((ImmutableSurveyInstanceCreateCommand) another);
  }

  private boolean equalTo(ImmutableSurveyInstanceCreateCommand another) {
    return surveyRunId.equals(another.surveyRunId)
        && entityReference.equals(another.entityReference)
        && Objects.equals(dueDate, another.dueDate)
        && status.equals(another.status);
  }

  /**
   * Computes a hash code from attributes: {@code surveyRunId}, {@code entityReference}, {@code dueDate}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyRunId.hashCode();
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Objects.hashCode(dueDate);
    h += (h << 5) + status.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyInstanceCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyInstanceCreateCommand{");
    builder.append("surveyRunId=").append(surveyRunId);
    builder.append(", ");
    builder.append("entityReference=").append(entityReference);
    if (dueDate != null) {
      builder.append(", ");
      builder.append("dueDate=").append(dueDate);
    }
    builder.append(", ");
    builder.append("status=").append(status);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyInstanceCreateCommand {
    Long surveyRunId;
    EntityReference entityReference;
    Optional<LocalDate> dueDate = Optional.empty();
    SurveyInstanceStatus status;
    @JsonProperty("surveyRunId")
    public void setSurveyRunId(Long surveyRunId) {
      this.surveyRunId = surveyRunId;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("dueDate")
    public void setDueDate(Optional<LocalDate> dueDate) {
      this.dueDate = dueDate;
    }
    @JsonProperty("status")
    public void setStatus(SurveyInstanceStatus status) {
      this.status = status;
    }
    @Override
    public Long surveyRunId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDate> dueDate() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyInstanceStatus status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyInstanceCreateCommand fromJson(Json json) {
    ImmutableSurveyInstanceCreateCommand.Builder builder = ImmutableSurveyInstanceCreateCommand.builder();
    if (json.surveyRunId != null) {
      builder.surveyRunId(json.surveyRunId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.dueDate != null) {
      builder.dueDate(json.dueDate);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyInstanceCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyInstanceCreateCommand instance
   */
  public static ImmutableSurveyInstanceCreateCommand copyOf(SurveyInstanceCreateCommand instance) {
    if (instance instanceof ImmutableSurveyInstanceCreateCommand) {
      return (ImmutableSurveyInstanceCreateCommand) instance;
    }
    return ImmutableSurveyInstanceCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyInstanceCreateCommand ImmutableSurveyInstanceCreateCommand}.
   * @return A new ImmutableSurveyInstanceCreateCommand builder
   */
  public static ImmutableSurveyInstanceCreateCommand.Builder builder() {
    return new ImmutableSurveyInstanceCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyInstanceCreateCommand ImmutableSurveyInstanceCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_RUN_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private long initBits = 0x3L;

    private Long surveyRunId;
    private EntityReference entityReference;
    private LocalDate dueDate;
    private SurveyInstanceStatus status;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyInstanceCreateCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyInstanceCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      surveyRunId(instance.surveyRunId());
      entityReference(instance.entityReference());
      Optional<LocalDate> dueDateOptional = instance.dueDate();
      if (dueDateOptional.isPresent()) {
        dueDate(dueDateOptional);
      }
      status(instance.status());
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceCreateCommand#surveyRunId() surveyRunId} attribute.
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
     * Initializes the value for the {@link SurveyInstanceCreateCommand#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstanceCreateCommand#dueDate() dueDate} to dueDate.
     * @param dueDate The value for dueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder dueDate(LocalDate dueDate) {
      this.dueDate = Objects.requireNonNull(dueDate, "dueDate");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstanceCreateCommand#dueDate() dueDate} to dueDate.
     * @param dueDate The value for dueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDate")
    public final Builder dueDate(Optional<? extends LocalDate> dueDate) {
      this.dueDate = dueDate.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceCreateCommand#status() status} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SurveyInstanceCreateCommand#status() status}.</em>
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(SurveyInstanceStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyInstanceCreateCommand ImmutableSurveyInstanceCreateCommand}.
     * @return An immutable instance of SurveyInstanceCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyInstanceCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyInstanceCreateCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_RUN_ID) != 0) attributes.add("surveyRunId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      return "Cannot build SurveyInstanceCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
