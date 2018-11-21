package com.khartec.waltz.model.assessment_rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RemoveAssessmentRatingCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRemoveAssessmentRatingCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RemoveAssessmentRatingCommand"})
public final class ImmutableRemoveAssessmentRatingCommand
    extends RemoveAssessmentRatingCommand {
  private final EntityReference entityReference;
  private final long assessmentDefinitionId;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableRemoveAssessmentRatingCommand(ImmutableRemoveAssessmentRatingCommand.Builder builder) {
    this.entityReference = builder.entityReference;
    this.assessmentDefinitionId = builder.assessmentDefinitionId;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.lastUpdatedAt = builder.lastUpdatedAt != null
        ? builder.lastUpdatedAt
        : Objects.requireNonNull(super.lastUpdatedAt(), "lastUpdatedAt");
  }

  private ImmutableRemoveAssessmentRatingCommand(
      EntityReference entityReference,
      long assessmentDefinitionId,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.entityReference = entityReference;
    this.assessmentDefinitionId = assessmentDefinitionId;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
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
   * @return The value of the {@code assessmentDefinitionId} attribute
   */
  @JsonProperty("assessmentDefinitionId")
  @Override
  public long assessmentDefinitionId() {
    return assessmentDefinitionId;
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
   * @return The value of the {@code lastUpdatedBy} attribute
   */
  @JsonProperty("lastUpdatedBy")
  @Override
  public String lastUpdatedBy() {
    return lastUpdatedBy;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveAssessmentRatingCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveAssessmentRatingCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableRemoveAssessmentRatingCommand(newValue, this.assessmentDefinitionId, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveAssessmentRatingCommand#assessmentDefinitionId() assessmentDefinitionId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assessmentDefinitionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveAssessmentRatingCommand withAssessmentDefinitionId(long value) {
    if (this.assessmentDefinitionId == value) return this;
    return new ImmutableRemoveAssessmentRatingCommand(this.entityReference, value, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveAssessmentRatingCommand#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveAssessmentRatingCommand withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableRemoveAssessmentRatingCommand(this.entityReference, this.assessmentDefinitionId, newValue, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveAssessmentRatingCommand#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveAssessmentRatingCommand withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableRemoveAssessmentRatingCommand(this.entityReference, this.assessmentDefinitionId, this.lastUpdatedAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRemoveAssessmentRatingCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRemoveAssessmentRatingCommand
        && equalTo((ImmutableRemoveAssessmentRatingCommand) another);
  }

  private boolean equalTo(ImmutableRemoveAssessmentRatingCommand another) {
    return entityReference.equals(another.entityReference)
        && assessmentDefinitionId == another.assessmentDefinitionId
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code assessmentDefinitionId}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Long.hashCode(assessmentDefinitionId);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RemoveAssessmentRatingCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RemoveAssessmentRatingCommand{"
        + "entityReference=" + entityReference
        + ", assessmentDefinitionId=" + assessmentDefinitionId
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RemoveAssessmentRatingCommand {
    EntityReference entityReference;
    long assessmentDefinitionId;
    boolean assessmentDefinitionIdIsSet;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("assessmentDefinitionId")
    public void setAssessmentDefinitionId(long assessmentDefinitionId) {
      this.assessmentDefinitionId = assessmentDefinitionId;
      this.assessmentDefinitionIdIsSet = true;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public long assessmentDefinitionId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRemoveAssessmentRatingCommand fromJson(Json json) {
    ImmutableRemoveAssessmentRatingCommand.Builder builder = ImmutableRemoveAssessmentRatingCommand.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.assessmentDefinitionIdIsSet) {
      builder.assessmentDefinitionId(json.assessmentDefinitionId);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RemoveAssessmentRatingCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RemoveAssessmentRatingCommand instance
   */
  public static ImmutableRemoveAssessmentRatingCommand copyOf(RemoveAssessmentRatingCommand instance) {
    if (instance instanceof ImmutableRemoveAssessmentRatingCommand) {
      return (ImmutableRemoveAssessmentRatingCommand) instance;
    }
    return ImmutableRemoveAssessmentRatingCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRemoveAssessmentRatingCommand ImmutableRemoveAssessmentRatingCommand}.
   * @return A new ImmutableRemoveAssessmentRatingCommand builder
   */
  public static ImmutableRemoveAssessmentRatingCommand.Builder builder() {
    return new ImmutableRemoveAssessmentRatingCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRemoveAssessmentRatingCommand ImmutableRemoveAssessmentRatingCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_ASSESSMENT_DEFINITION_ID = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private long initBits = 0x7L;

    private EntityReference entityReference;
    private long assessmentDefinitionId;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.assessment_rating.AssessmentRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AssessmentRatingCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LastUpdatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastUpdatedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.assessment_rating.RemoveAssessmentRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RemoveAssessmentRatingCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof AssessmentRatingCommand) {
        AssessmentRatingCommand instance = (AssessmentRatingCommand) object;
        assessmentDefinitionId(instance.assessmentDefinitionId());
        entityReference(instance.entityReference());
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
    }

    /**
     * Initializes the value for the {@link RemoveAssessmentRatingCommand#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link RemoveAssessmentRatingCommand#assessmentDefinitionId() assessmentDefinitionId} attribute.
     * @param assessmentDefinitionId The value for assessmentDefinitionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assessmentDefinitionId")
    public final Builder assessmentDefinitionId(long assessmentDefinitionId) {
      this.assessmentDefinitionId = assessmentDefinitionId;
      initBits &= ~INIT_BIT_ASSESSMENT_DEFINITION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link RemoveAssessmentRatingCommand#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RemoveAssessmentRatingCommand#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link RemoveAssessmentRatingCommand#lastUpdatedBy() lastUpdatedBy} attribute.
     * @param lastUpdatedBy The value for lastUpdatedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedBy")
    public final Builder lastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = Objects.requireNonNull(lastUpdatedBy, "lastUpdatedBy");
      initBits &= ~INIT_BIT_LAST_UPDATED_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRemoveAssessmentRatingCommand ImmutableRemoveAssessmentRatingCommand}.
     * @return An immutable instance of RemoveAssessmentRatingCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRemoveAssessmentRatingCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRemoveAssessmentRatingCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_ASSESSMENT_DEFINITION_ID) != 0) attributes.add("assessmentDefinitionId");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build RemoveAssessmentRatingCommand, some of required attributes are not set " + attributes;
    }
  }
}
