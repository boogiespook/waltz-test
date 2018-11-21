package com.khartec.waltz.model.entity_workflow;

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
 * Immutable implementation of {@link EntityWorkflowState}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityWorkflowState.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityWorkflowState"})
public final class ImmutableEntityWorkflowState
    extends EntityWorkflowState {
  private final long workflowId;
  private final EntityReference entityReference;
  private final String state;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutableEntityWorkflowState(ImmutableEntityWorkflowState.Builder builder) {
    this.workflowId = builder.workflowId;
    this.entityReference = builder.entityReference;
    this.state = builder.state;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
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

  private ImmutableEntityWorkflowState(
      long workflowId,
      EntityReference entityReference,
      String state,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.workflowId = workflowId;
    this.entityReference = entityReference;
    this.state = state;
    this.description = description;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableEntityWorkflowState.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.provenance = Objects.requireNonNull(ImmutableEntityWorkflowState.super.provenance(), "provenance");
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
      return "Cannot build EntityWorkflowState, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code workflowId} attribute
   */
  @JsonProperty("workflowId")
  @Override
  public long workflowId() {
    return workflowId;
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
   * @return The value of the {@code state} attribute
   */
  @JsonProperty("state")
  @Override
  public String state() {
    return state;
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
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#workflowId() workflowId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for workflowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withWorkflowId(long value) {
    if (this.workflowId == value) return this;
    return new ImmutableEntityWorkflowState(
        value,
        this.entityReference,
        this.state,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntityWorkflowState(
        this.workflowId,
        newValue,
        this.state,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#state() state} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for state
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withState(String value) {
    if (this.state.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "state");
    return new ImmutableEntityWorkflowState(
        this.workflowId,
        this.entityReference,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityWorkflowState(
        this.workflowId,
        this.entityReference,
        this.state,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableEntityWorkflowState(
        this.workflowId,
        this.entityReference,
        this.state,
        this.description,
        newValue,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableEntityWorkflowState(
        this.workflowId,
        this.entityReference,
        this.state,
        this.description,
        this.lastUpdatedAt,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowState#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowState withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityWorkflowState(
        this.workflowId,
        this.entityReference,
        this.state,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityWorkflowState} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityWorkflowState
        && equalTo((ImmutableEntityWorkflowState) another);
  }

  private boolean equalTo(ImmutableEntityWorkflowState another) {
    return workflowId == another.workflowId
        && entityReference.equals(another.entityReference)
        && state.equals(another.state)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code workflowId}, {@code entityReference}, {@code state}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(workflowId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + state.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityWorkflowState} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityWorkflowState{"
        + "workflowId=" + workflowId
        + ", entityReference=" + entityReference
        + ", state=" + state
        + ", description=" + description
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
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
  static final class Json extends EntityWorkflowState {
    long workflowId;
    boolean workflowIdIsSet;
    EntityReference entityReference;
    String state;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String provenance;
    @JsonProperty("workflowId")
    public void setWorkflowId(long workflowId) {
      this.workflowId = workflowId;
      this.workflowIdIsSet = true;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("state")
    public void setState(String state) {
      this.state = state;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long workflowId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public String state() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityWorkflowState fromJson(Json json) {
    ImmutableEntityWorkflowState.Builder builder = ImmutableEntityWorkflowState.builder();
    if (json.workflowIdIsSet) {
      builder.workflowId(json.workflowId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.state != null) {
      builder.state(json.state);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityWorkflowState} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityWorkflowState instance
   */
  public static ImmutableEntityWorkflowState copyOf(EntityWorkflowState instance) {
    if (instance instanceof ImmutableEntityWorkflowState) {
      return (ImmutableEntityWorkflowState) instance;
    }
    return ImmutableEntityWorkflowState.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityWorkflowState ImmutableEntityWorkflowState}.
   * @return A new ImmutableEntityWorkflowState builder
   */
  public static ImmutableEntityWorkflowState.Builder builder() {
    return new ImmutableEntityWorkflowState.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityWorkflowState ImmutableEntityWorkflowState}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_WORKFLOW_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_STATE = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private long workflowId;
    private EntityReference entityReference;
    private String state;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_workflow.EntityWorkflowState} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityWorkflowState instance) {
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

    private void from(Object object) {
      if (object instanceof EntityWorkflowState) {
        EntityWorkflowState instance = (EntityWorkflowState) object;
        entityReference(instance.entityReference());
        workflowId(instance.workflowId());
        state(instance.state());
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
    }

    /**
     * Initializes the value for the {@link EntityWorkflowState#workflowId() workflowId} attribute.
     * @param workflowId The value for workflowId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("workflowId")
    public final Builder workflowId(long workflowId) {
      this.workflowId = workflowId;
      initBits &= ~INIT_BIT_WORKFLOW_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowState#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link EntityWorkflowState#state() state} attribute.
     * @param state The value for state 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("state")
    public final Builder state(String state) {
      this.state = Objects.requireNonNull(state, "state");
      initBits &= ~INIT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowState#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowState#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityWorkflowState#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowState#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link EntityWorkflowState#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityWorkflowState#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityWorkflowState ImmutableEntityWorkflowState}.
     * @return An immutable instance of EntityWorkflowState
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityWorkflowState build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityWorkflowState(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_WORKFLOW_ID) != 0) attributes.add("workflowId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_STATE) != 0) attributes.add("state");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build EntityWorkflowState, some of required attributes are not set " + attributes;
    }
  }
}
