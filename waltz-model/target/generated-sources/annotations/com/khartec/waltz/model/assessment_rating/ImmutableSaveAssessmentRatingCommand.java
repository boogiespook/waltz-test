package com.khartec.waltz.model.assessment_rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SaveAssessmentRatingCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSaveAssessmentRatingCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SaveAssessmentRatingCommand"})
public final class ImmutableSaveAssessmentRatingCommand
    extends SaveAssessmentRatingCommand {
  private final long ratingId;
  private final EntityReference entityReference;
  private final long assessmentDefinitionId;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final @Nullable String description;
  private final String provenance;

  private ImmutableSaveAssessmentRatingCommand(ImmutableSaveAssessmentRatingCommand.Builder builder) {
    this.ratingId = builder.ratingId;
    this.entityReference = builder.entityReference;
    this.assessmentDefinitionId = builder.assessmentDefinitionId;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.description = builder.description;
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.provenance = initShim.provenance();
    this.initShim = null;
  }

  private ImmutableSaveAssessmentRatingCommand(
      long ratingId,
      EntityReference entityReference,
      long assessmentDefinitionId,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      @Nullable String description,
      String provenance) {
    this.ratingId = ratingId;
    this.entityReference = entityReference;
    this.assessmentDefinitionId = assessmentDefinitionId;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.description = description;
    this.provenance = provenance;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableSaveAssessmentRatingCommand.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableSaveAssessmentRatingCommand.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build SaveAssessmentRatingCommand, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code ratingId} attribute
   */
  @JsonProperty("ratingId")
  @Override
  public long ratingId() {
    return ratingId;
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
    InitShim shim = this.initShim;
    return shim != null
        ? shim.lastUpdatedAt()
        : this.lastUpdatedAt;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.provenance()
        : this.provenance;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#ratingId() ratingId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withRatingId(long value) {
    if (this.ratingId == value) return this;
    return new ImmutableSaveAssessmentRatingCommand(
        value,
        this.entityReference,
        this.assessmentDefinitionId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableSaveAssessmentRatingCommand(
        this.ratingId,
        newValue,
        this.assessmentDefinitionId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#assessmentDefinitionId() assessmentDefinitionId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assessmentDefinitionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withAssessmentDefinitionId(long value) {
    if (this.assessmentDefinitionId == value) return this;
    return new ImmutableSaveAssessmentRatingCommand(
        this.ratingId,
        this.entityReference,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableSaveAssessmentRatingCommand(
        this.ratingId,
        this.entityReference,
        this.assessmentDefinitionId,
        newValue,
        this.lastUpdatedBy,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableSaveAssessmentRatingCommand(
        this.ratingId,
        this.entityReference,
        this.assessmentDefinitionId,
        this.lastUpdatedAt,
        newValue,
        this.description,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSaveAssessmentRatingCommand(
        this.ratingId,
        this.entityReference,
        this.assessmentDefinitionId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        value,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveAssessmentRatingCommand#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveAssessmentRatingCommand withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableSaveAssessmentRatingCommand(
        this.ratingId,
        this.entityReference,
        this.assessmentDefinitionId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSaveAssessmentRatingCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSaveAssessmentRatingCommand
        && equalTo((ImmutableSaveAssessmentRatingCommand) another);
  }

  private boolean equalTo(ImmutableSaveAssessmentRatingCommand another) {
    return ratingId == another.ratingId
        && entityReference.equals(another.entityReference)
        && assessmentDefinitionId == another.assessmentDefinitionId
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code ratingId}, {@code entityReference}, {@code assessmentDefinitionId}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code description}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(ratingId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Long.hashCode(assessmentDefinitionId);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SaveAssessmentRatingCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SaveAssessmentRatingCommand{"
        + "ratingId=" + ratingId
        + ", entityReference=" + entityReference
        + ", assessmentDefinitionId=" + assessmentDefinitionId
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + ", description=" + description
        + ", provenance=" + provenance
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SaveAssessmentRatingCommand {
    long ratingId;
    boolean ratingIdIsSet;
    EntityReference entityReference;
    long assessmentDefinitionId;
    boolean assessmentDefinitionIdIsSet;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String description;
    String provenance;
    @JsonProperty("ratingId")
    public void setRatingId(long ratingId) {
      this.ratingId = ratingId;
      this.ratingIdIsSet = true;
    }
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
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long ratingId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public long assessmentDefinitionId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSaveAssessmentRatingCommand fromJson(Json json) {
    ImmutableSaveAssessmentRatingCommand.Builder builder = ImmutableSaveAssessmentRatingCommand.builder();
    if (json.ratingIdIsSet) {
      builder.ratingId(json.ratingId);
    }
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
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SaveAssessmentRatingCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SaveAssessmentRatingCommand instance
   */
  public static ImmutableSaveAssessmentRatingCommand copyOf(SaveAssessmentRatingCommand instance) {
    if (instance instanceof ImmutableSaveAssessmentRatingCommand) {
      return (ImmutableSaveAssessmentRatingCommand) instance;
    }
    return ImmutableSaveAssessmentRatingCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSaveAssessmentRatingCommand ImmutableSaveAssessmentRatingCommand}.
   * @return A new ImmutableSaveAssessmentRatingCommand builder
   */
  public static ImmutableSaveAssessmentRatingCommand.Builder builder() {
    return new ImmutableSaveAssessmentRatingCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSaveAssessmentRatingCommand ImmutableSaveAssessmentRatingCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_ASSESSMENT_DEFINITION_ID = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private long ratingId;
    private EntityReference entityReference;
    private long assessmentDefinitionId;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String description;
    private String provenance;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ProvenanceProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProvenanceProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.assessment_rating.SaveAssessmentRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SaveAssessmentRatingCommand instance) {
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
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof SaveAssessmentRatingCommand) {
        SaveAssessmentRatingCommand instance = (SaveAssessmentRatingCommand) object;
        ratingId(instance.ratingId());
      }
    }

    /**
     * Initializes the value for the {@link SaveAssessmentRatingCommand#ratingId() ratingId} attribute.
     * @param ratingId The value for ratingId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratingId")
    public final Builder ratingId(long ratingId) {
      this.ratingId = ratingId;
      initBits &= ~INIT_BIT_RATING_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SaveAssessmentRatingCommand#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link SaveAssessmentRatingCommand#assessmentDefinitionId() assessmentDefinitionId} attribute.
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
     * Initializes the value for the {@link SaveAssessmentRatingCommand#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SaveAssessmentRatingCommand#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link SaveAssessmentRatingCommand#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link SaveAssessmentRatingCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link SaveAssessmentRatingCommand#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SaveAssessmentRatingCommand#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSaveAssessmentRatingCommand ImmutableSaveAssessmentRatingCommand}.
     * @return An immutable instance of SaveAssessmentRatingCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSaveAssessmentRatingCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSaveAssessmentRatingCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING_ID) != 0) attributes.add("ratingId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_ASSESSMENT_DEFINITION_ID) != 0) attributes.add("assessmentDefinitionId");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build SaveAssessmentRatingCommand, some of required attributes are not set " + attributes;
    }
  }
}
