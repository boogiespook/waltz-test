package com.khartec.waltz.model.data_flow_decorator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LogicalFlowDecorator}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogicalFlowDecorator.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LogicalFlowDecorator"})
public final class ImmutableLogicalFlowDecorator
    extends LogicalFlowDecorator {
  private final long dataFlowId;
  private final EntityReference decoratorEntity;
  private final AuthoritativenessRating rating;
  private final String provenance;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableLogicalFlowDecorator(ImmutableLogicalFlowDecorator.Builder builder) {
    this.dataFlowId = builder.dataFlowId;
    this.decoratorEntity = builder.decoratorEntity;
    this.rating = builder.rating;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.provenance = initShim.provenance();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutableLogicalFlowDecorator(
      long dataFlowId,
      EntityReference decoratorEntity,
      AuthoritativenessRating rating,
      String provenance,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.dataFlowId = dataFlowId;
    this.decoratorEntity = decoratorEntity;
    this.rating = rating;
    this.provenance = provenance;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableLogicalFlowDecorator.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableLogicalFlowDecorator.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build LogicalFlowDecorator, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code dataFlowId} attribute
   */
  @JsonProperty("dataFlowId")
  @Override
  public long dataFlowId() {
    return dataFlowId;
  }

  /**
   * @return The value of the {@code decoratorEntity} attribute
   */
  @JsonProperty("decoratorEntity")
  @Override
  public EntityReference decoratorEntity() {
    return decoratorEntity;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public AuthoritativenessRating rating() {
    return rating;
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
   * Copy the current immutable object by setting a value for the {@link LogicalFlowDecorator#dataFlowId() dataFlowId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataFlowId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowDecorator withDataFlowId(long value) {
    if (this.dataFlowId == value) return this;
    return new ImmutableLogicalFlowDecorator(
        value,
        this.decoratorEntity,
        this.rating,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowDecorator#decoratorEntity() decoratorEntity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for decoratorEntity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowDecorator withDecoratorEntity(EntityReference value) {
    if (this.decoratorEntity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "decoratorEntity");
    return new ImmutableLogicalFlowDecorator(this.dataFlowId, newValue, this.rating, this.provenance, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowDecorator#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowDecorator withRating(AuthoritativenessRating value) {
    if (this.rating == value) return this;
    AuthoritativenessRating newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableLogicalFlowDecorator(
        this.dataFlowId,
        this.decoratorEntity,
        newValue,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowDecorator#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowDecorator withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableLogicalFlowDecorator(
        this.dataFlowId,
        this.decoratorEntity,
        this.rating,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowDecorator#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowDecorator withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableLogicalFlowDecorator(
        this.dataFlowId,
        this.decoratorEntity,
        this.rating,
        this.provenance,
        newValue,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalFlowDecorator#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalFlowDecorator withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableLogicalFlowDecorator(
        this.dataFlowId,
        this.decoratorEntity,
        this.rating,
        this.provenance,
        this.lastUpdatedAt,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogicalFlowDecorator} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogicalFlowDecorator
        && equalTo((ImmutableLogicalFlowDecorator) another);
  }

  private boolean equalTo(ImmutableLogicalFlowDecorator another) {
    return dataFlowId == another.dataFlowId
        && decoratorEntity.equals(another.decoratorEntity)
        && rating.equals(another.rating)
        && provenance.equals(another.provenance)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code dataFlowId}, {@code decoratorEntity}, {@code rating}, {@code provenance}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(dataFlowId);
    h += (h << 5) + decoratorEntity.hashCode();
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LogicalFlowDecorator} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "LogicalFlowDecorator{"
        + "dataFlowId=" + dataFlowId
        + ", decoratorEntity=" + decoratorEntity
        + ", rating=" + rating
        + ", provenance=" + provenance
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
  static final class Json extends LogicalFlowDecorator {
    long dataFlowId;
    boolean dataFlowIdIsSet;
    EntityReference decoratorEntity;
    AuthoritativenessRating rating;
    String provenance;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("dataFlowId")
    public void setDataFlowId(long dataFlowId) {
      this.dataFlowId = dataFlowId;
      this.dataFlowIdIsSet = true;
    }
    @JsonProperty("decoratorEntity")
    public void setDecoratorEntity(EntityReference decoratorEntity) {
      this.decoratorEntity = decoratorEntity;
    }
    @JsonProperty("rating")
    public void setRating(AuthoritativenessRating rating) {
      this.rating = rating;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
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
    public long dataFlowId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference decoratorEntity() { throw new UnsupportedOperationException(); }
    @Override
    public AuthoritativenessRating rating() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
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
  static ImmutableLogicalFlowDecorator fromJson(Json json) {
    ImmutableLogicalFlowDecorator.Builder builder = ImmutableLogicalFlowDecorator.builder();
    if (json.dataFlowIdIsSet) {
      builder.dataFlowId(json.dataFlowId);
    }
    if (json.decoratorEntity != null) {
      builder.decoratorEntity(json.decoratorEntity);
    }
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
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
   * Creates an immutable copy of a {@link LogicalFlowDecorator} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LogicalFlowDecorator instance
   */
  public static ImmutableLogicalFlowDecorator copyOf(LogicalFlowDecorator instance) {
    if (instance instanceof ImmutableLogicalFlowDecorator) {
      return (ImmutableLogicalFlowDecorator) instance;
    }
    return ImmutableLogicalFlowDecorator.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogicalFlowDecorator ImmutableLogicalFlowDecorator}.
   * @return A new ImmutableLogicalFlowDecorator builder
   */
  public static ImmutableLogicalFlowDecorator.Builder builder() {
    return new ImmutableLogicalFlowDecorator.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogicalFlowDecorator ImmutableLogicalFlowDecorator}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DATA_FLOW_ID = 0x1L;
    private static final long INIT_BIT_DECORATOR_ENTITY = 0x2L;
    private static final long INIT_BIT_RATING = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private long dataFlowId;
    private EntityReference decoratorEntity;
    private AuthoritativenessRating rating;
    private String provenance;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.data_flow_decorator.LogicalFlowDecorator} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LogicalFlowDecorator instance) {
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
      if (object instanceof LogicalFlowDecorator) {
        LogicalFlowDecorator instance = (LogicalFlowDecorator) object;
        rating(instance.rating());
        dataFlowId(instance.dataFlowId());
        decoratorEntity(instance.decoratorEntity());
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link LogicalFlowDecorator#dataFlowId() dataFlowId} attribute.
     * @param dataFlowId The value for dataFlowId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataFlowId")
    public final Builder dataFlowId(long dataFlowId) {
      this.dataFlowId = dataFlowId;
      initBits &= ~INIT_BIT_DATA_FLOW_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowDecorator#decoratorEntity() decoratorEntity} attribute.
     * @param decoratorEntity The value for decoratorEntity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("decoratorEntity")
    public final Builder decoratorEntity(EntityReference decoratorEntity) {
      this.decoratorEntity = Objects.requireNonNull(decoratorEntity, "decoratorEntity");
      initBits &= ~INIT_BIT_DECORATOR_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowDecorator#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(AuthoritativenessRating rating) {
      this.rating = Objects.requireNonNull(rating, "rating");
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowDecorator#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalFlowDecorator#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowDecorator#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalFlowDecorator#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalFlowDecorator#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Builds a new {@link ImmutableLogicalFlowDecorator ImmutableLogicalFlowDecorator}.
     * @return An immutable instance of LogicalFlowDecorator
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLogicalFlowDecorator build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLogicalFlowDecorator(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DATA_FLOW_ID) != 0) attributes.add("dataFlowId");
      if ((initBits & INIT_BIT_DECORATOR_ENTITY) != 0) attributes.add("decoratorEntity");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build LogicalFlowDecorator, some of required attributes are not set " + attributes;
    }
  }
}
