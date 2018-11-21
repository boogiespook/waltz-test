package com.khartec.waltz.model.entity_workflow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
 * Immutable implementation of {@link EntityWorkflowTransition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityWorkflowTransition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityWorkflowTransition"})
public final class ImmutableEntityWorkflowTransition
    extends EntityWorkflowTransition {
  private final long workflowId;
  private final EntityReference entityReference;
  private final @Nullable String fromState;
  private final String toState;
  private final @Nullable String reason;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutableEntityWorkflowTransition(ImmutableEntityWorkflowTransition.Builder builder) {
    this.workflowId = builder.workflowId;
    this.entityReference = builder.entityReference;
    this.fromState = builder.fromState;
    this.toState = builder.toState;
    this.reason = builder.reason;
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

  private ImmutableEntityWorkflowTransition(
      long workflowId,
      EntityReference entityReference,
      @Nullable String fromState,
      String toState,
      @Nullable String reason,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.workflowId = workflowId;
    this.entityReference = entityReference;
    this.fromState = fromState;
    this.toState = toState;
    this.reason = reason;
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableEntityWorkflowTransition.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.provenance = Objects.requireNonNull(ImmutableEntityWorkflowTransition.super.provenance(), "provenance");
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
      return "Cannot build EntityWorkflowTransition, attribute initializers form cycle" + attributes;
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
   * @return The value of the {@code fromState} attribute
   */
  @JsonProperty("fromState")
  @Override
  public @Nullable String fromState() {
    return fromState;
  }

  /**
   * @return The value of the {@code toState} attribute
   */
  @JsonProperty("toState")
  @Override
  public String toState() {
    return toState;
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public @Nullable String reason() {
    return reason;
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
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#workflowId() workflowId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for workflowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withWorkflowId(long value) {
    if (this.workflowId == value) return this;
    return new ImmutableEntityWorkflowTransition(
        value,
        this.entityReference,
        this.fromState,
        this.toState,
        this.reason,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        newValue,
        this.fromState,
        this.toState,
        this.reason,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#fromState() fromState} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fromState (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withFromState(@Nullable String value) {
    if (Objects.equals(this.fromState, value)) return this;
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        this.entityReference,
        value,
        this.toState,
        this.reason,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#toState() toState} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for toState
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withToState(String value) {
    if (this.toState.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "toState");
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        this.entityReference,
        this.fromState,
        newValue,
        this.reason,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#reason() reason} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reason (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withReason(@Nullable String value) {
    if (Objects.equals(this.reason, value)) return this;
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        this.entityReference,
        this.fromState,
        this.toState,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        this.entityReference,
        this.fromState,
        this.toState,
        this.reason,
        newValue,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        this.entityReference,
        this.fromState,
        this.toState,
        this.reason,
        this.lastUpdatedAt,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityWorkflowTransition#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityWorkflowTransition withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityWorkflowTransition(
        this.workflowId,
        this.entityReference,
        this.fromState,
        this.toState,
        this.reason,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityWorkflowTransition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityWorkflowTransition
        && equalTo((ImmutableEntityWorkflowTransition) another);
  }

  private boolean equalTo(ImmutableEntityWorkflowTransition another) {
    return workflowId == another.workflowId
        && entityReference.equals(another.entityReference)
        && Objects.equals(fromState, another.fromState)
        && toState.equals(another.toState)
        && Objects.equals(reason, another.reason)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code workflowId}, {@code entityReference}, {@code fromState}, {@code toState}, {@code reason}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(workflowId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Objects.hashCode(fromState);
    h += (h << 5) + toState.hashCode();
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityWorkflowTransition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityWorkflowTransition{"
        + "workflowId=" + workflowId
        + ", entityReference=" + entityReference
        + ", fromState=" + fromState
        + ", toState=" + toState
        + ", reason=" + reason
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
  static final class Json extends EntityWorkflowTransition {
    long workflowId;
    boolean workflowIdIsSet;
    EntityReference entityReference;
    String fromState;
    String toState;
    String reason;
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
    @JsonProperty("fromState")
    public void setFromState(@Nullable String fromState) {
      this.fromState = fromState;
    }
    @JsonProperty("toState")
    public void setToState(String toState) {
      this.toState = toState;
    }
    @JsonProperty("reason")
    public void setReason(@Nullable String reason) {
      this.reason = reason;
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
    public String fromState() { throw new UnsupportedOperationException(); }
    @Override
    public String toState() { throw new UnsupportedOperationException(); }
    @Override
    public String reason() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityWorkflowTransition fromJson(Json json) {
    ImmutableEntityWorkflowTransition.Builder builder = ImmutableEntityWorkflowTransition.builder();
    if (json.workflowIdIsSet) {
      builder.workflowId(json.workflowId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.fromState != null) {
      builder.fromState(json.fromState);
    }
    if (json.toState != null) {
      builder.toState(json.toState);
    }
    if (json.reason != null) {
      builder.reason(json.reason);
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
   * Creates an immutable copy of a {@link EntityWorkflowTransition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityWorkflowTransition instance
   */
  public static ImmutableEntityWorkflowTransition copyOf(EntityWorkflowTransition instance) {
    if (instance instanceof ImmutableEntityWorkflowTransition) {
      return (ImmutableEntityWorkflowTransition) instance;
    }
    return ImmutableEntityWorkflowTransition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityWorkflowTransition ImmutableEntityWorkflowTransition}.
   * @return A new ImmutableEntityWorkflowTransition builder
   */
  public static ImmutableEntityWorkflowTransition.Builder builder() {
    return new ImmutableEntityWorkflowTransition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityWorkflowTransition ImmutableEntityWorkflowTransition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_WORKFLOW_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_TO_STATE = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private long workflowId;
    private EntityReference entityReference;
    private String fromState;
    private String toState;
    private String reason;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String provenance;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_workflow.EntityWorkflowTransition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityWorkflowTransition instance) {
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
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof EntityWorkflowTransition) {
        EntityWorkflowTransition instance = (EntityWorkflowTransition) object;
        @Nullable String reasonValue = instance.reason();
        if (reasonValue != null) {
          reason(reasonValue);
        }
        @Nullable String fromStateValue = instance.fromState();
        if (fromStateValue != null) {
          fromState(fromStateValue);
        }
        toState(instance.toState());
        entityReference(instance.entityReference());
        workflowId(instance.workflowId());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link EntityWorkflowTransition#workflowId() workflowId} attribute.
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
     * Initializes the value for the {@link EntityWorkflowTransition#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link EntityWorkflowTransition#fromState() fromState} attribute.
     * @param fromState The value for fromState (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fromState")
    public final Builder fromState(@Nullable String fromState) {
      this.fromState = fromState;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowTransition#toState() toState} attribute.
     * @param toState The value for toState 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("toState")
    public final Builder toState(String toState) {
      this.toState = Objects.requireNonNull(toState, "toState");
      initBits &= ~INIT_BIT_TO_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowTransition#reason() reason} attribute.
     * @param reason The value for reason (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(@Nullable String reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowTransition#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityWorkflowTransition#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityWorkflowTransition#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link EntityWorkflowTransition#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityWorkflowTransition#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityWorkflowTransition ImmutableEntityWorkflowTransition}.
     * @return An immutable instance of EntityWorkflowTransition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityWorkflowTransition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityWorkflowTransition(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_WORKFLOW_ID) != 0) attributes.add("workflowId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_TO_STATE) != 0) attributes.add("toState");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build EntityWorkflowTransition, some of required attributes are not set " + attributes;
    }
  }
}
