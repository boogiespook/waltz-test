package com.khartec.waltz.model.entity_enum;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityEnumValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityEnumValue.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityEnumValue"})
public final class ImmutableEntityEnumValue extends EntityEnumValue {
  private final long definitionId;
  private final EntityReference entityReference;
  private final String enumValueKey;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutableEntityEnumValue(ImmutableEntityEnumValue.Builder builder) {
    this.definitionId = builder.definitionId;
    this.entityReference = builder.entityReference;
    this.enumValueKey = builder.enumValueKey;
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

  private ImmutableEntityEnumValue(
      long definitionId,
      EntityReference entityReference,
      String enumValueKey,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.definitionId = definitionId;
    this.entityReference = entityReference;
    this.enumValueKey = enumValueKey;
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableEntityEnumValue.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.provenance = Objects.requireNonNull(ImmutableEntityEnumValue.super.provenance(), "provenance");
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
      return "Cannot build EntityEnumValue, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code definitionId} attribute
   */
  @JsonProperty("definitionId")
  @Override
  public long definitionId() {
    return definitionId;
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
   * @return The value of the {@code enumValueKey} attribute
   */
  @JsonProperty("enumValueKey")
  @Override
  public String enumValueKey() {
    return enumValueKey;
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
   * Copy the current immutable object by setting a value for the {@link EntityEnumValue#definitionId() definitionId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for definitionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumValue withDefinitionId(long value) {
    if (this.definitionId == value) return this;
    return new ImmutableEntityEnumValue(
        value,
        this.entityReference,
        this.enumValueKey,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumValue#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumValue withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntityEnumValue(
        this.definitionId,
        newValue,
        this.enumValueKey,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumValue#enumValueKey() enumValueKey} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for enumValueKey
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumValue withEnumValueKey(String value) {
    if (this.enumValueKey.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "enumValueKey");
    return new ImmutableEntityEnumValue(
        this.definitionId,
        this.entityReference,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumValue#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumValue withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableEntityEnumValue(
        this.definitionId,
        this.entityReference,
        this.enumValueKey,
        newValue,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumValue#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumValue withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableEntityEnumValue(
        this.definitionId,
        this.entityReference,
        this.enumValueKey,
        this.lastUpdatedAt,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityEnumValue#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityEnumValue withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityEnumValue(
        this.definitionId,
        this.entityReference,
        this.enumValueKey,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityEnumValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityEnumValue
        && equalTo((ImmutableEntityEnumValue) another);
  }

  private boolean equalTo(ImmutableEntityEnumValue another) {
    return definitionId == another.definitionId
        && entityReference.equals(another.entityReference)
        && enumValueKey.equals(another.enumValueKey)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code definitionId}, {@code entityReference}, {@code enumValueKey}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(definitionId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + enumValueKey.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityEnumValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityEnumValue{"
        + "definitionId=" + definitionId
        + ", entityReference=" + entityReference
        + ", enumValueKey=" + enumValueKey
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
  static final class Json extends EntityEnumValue {
    long definitionId;
    boolean definitionIdIsSet;
    EntityReference entityReference;
    String enumValueKey;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String provenance;
    @JsonProperty("definitionId")
    public void setDefinitionId(long definitionId) {
      this.definitionId = definitionId;
      this.definitionIdIsSet = true;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("enumValueKey")
    public void setEnumValueKey(String enumValueKey) {
      this.enumValueKey = enumValueKey;
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
    public long definitionId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public String enumValueKey() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityEnumValue fromJson(Json json) {
    ImmutableEntityEnumValue.Builder builder = ImmutableEntityEnumValue.builder();
    if (json.definitionIdIsSet) {
      builder.definitionId(json.definitionId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.enumValueKey != null) {
      builder.enumValueKey(json.enumValueKey);
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
   * Creates an immutable copy of a {@link EntityEnumValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityEnumValue instance
   */
  public static ImmutableEntityEnumValue copyOf(EntityEnumValue instance) {
    if (instance instanceof ImmutableEntityEnumValue) {
      return (ImmutableEntityEnumValue) instance;
    }
    return ImmutableEntityEnumValue.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityEnumValue ImmutableEntityEnumValue}.
   * @return A new ImmutableEntityEnumValue builder
   */
  public static ImmutableEntityEnumValue.Builder builder() {
    return new ImmutableEntityEnumValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityEnumValue ImmutableEntityEnumValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DEFINITION_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_ENUM_VALUE_KEY = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private long definitionId;
    private EntityReference entityReference;
    private String enumValueKey;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_enum.EntityEnumValue} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityEnumValue instance) {
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
      if (object instanceof EntityEnumValue) {
        EntityEnumValue instance = (EntityEnumValue) object;
        enumValueKey(instance.enumValueKey());
        entityReference(instance.entityReference());
        definitionId(instance.definitionId());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link EntityEnumValue#definitionId() definitionId} attribute.
     * @param definitionId The value for definitionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionId")
    public final Builder definitionId(long definitionId) {
      this.definitionId = definitionId;
      initBits &= ~INIT_BIT_DEFINITION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumValue#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link EntityEnumValue#enumValueKey() enumValueKey} attribute.
     * @param enumValueKey The value for enumValueKey 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enumValueKey")
    public final Builder enumValueKey(String enumValueKey) {
      this.enumValueKey = Objects.requireNonNull(enumValueKey, "enumValueKey");
      initBits &= ~INIT_BIT_ENUM_VALUE_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumValue#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityEnumValue#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityEnumValue#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link EntityEnumValue#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityEnumValue#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityEnumValue ImmutableEntityEnumValue}.
     * @return An immutable instance of EntityEnumValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityEnumValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityEnumValue(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DEFINITION_ID) != 0) attributes.add("definitionId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_ENUM_VALUE_KEY) != 0) attributes.add("enumValueKey");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build EntityEnumValue, some of required attributes are not set " + attributes;
    }
  }
}
