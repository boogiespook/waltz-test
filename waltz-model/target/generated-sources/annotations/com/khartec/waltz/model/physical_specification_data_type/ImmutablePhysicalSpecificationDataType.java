package com.khartec.waltz.model.physical_specification_data_type;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecificationDataType}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecificationDataType.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecificationDataType"})
public final class ImmutablePhysicalSpecificationDataType
    extends PhysicalSpecificationDataType {
  private final long specificationId;
  private final long dataTypeId;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutablePhysicalSpecificationDataType(ImmutablePhysicalSpecificationDataType.Builder builder) {
    this.specificationId = builder.specificationId;
    this.dataTypeId = builder.dataTypeId;
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

  private ImmutablePhysicalSpecificationDataType(
      long specificationId,
      long dataTypeId,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.specificationId = specificationId;
    this.dataTypeId = dataTypeId;
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutablePhysicalSpecificationDataType.super.lastUpdatedAt(), "lastUpdatedAt");
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
        this.provenance = Objects.requireNonNull(ImmutablePhysicalSpecificationDataType.super.provenance(), "provenance");
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
      return "Cannot build PhysicalSpecificationDataType, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code specificationId} attribute
   */
  @JsonProperty("specificationId")
  @Override
  public long specificationId() {
    return specificationId;
  }

  /**
   * @return The value of the {@code dataTypeId} attribute
   */
  @JsonProperty("dataTypeId")
  @Override
  public long dataTypeId() {
    return dataTypeId;
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
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationDataType#specificationId() specificationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specificationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationDataType withSpecificationId(long value) {
    if (this.specificationId == value) return this;
    return new ImmutablePhysicalSpecificationDataType(value, this.dataTypeId, this.lastUpdatedAt, this.lastUpdatedBy, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationDataType#dataTypeId() dataTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationDataType withDataTypeId(long value) {
    if (this.dataTypeId == value) return this;
    return new ImmutablePhysicalSpecificationDataType(this.specificationId, value, this.lastUpdatedAt, this.lastUpdatedBy, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationDataType#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationDataType withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutablePhysicalSpecificationDataType(this.specificationId, this.dataTypeId, newValue, this.lastUpdatedBy, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationDataType#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationDataType withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutablePhysicalSpecificationDataType(this.specificationId, this.dataTypeId, this.lastUpdatedAt, newValue, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationDataType#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationDataType withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutablePhysicalSpecificationDataType(this.specificationId, this.dataTypeId, this.lastUpdatedAt, this.lastUpdatedBy, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecificationDataType} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecificationDataType
        && equalTo((ImmutablePhysicalSpecificationDataType) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecificationDataType another) {
    return specificationId == another.specificationId
        && dataTypeId == another.dataTypeId
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code specificationId}, {@code dataTypeId}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(specificationId);
    h += (h << 5) + Long.hashCode(dataTypeId);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecificationDataType} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalSpecificationDataType{"
        + "specificationId=" + specificationId
        + ", dataTypeId=" + dataTypeId
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
  static final class Json
      extends PhysicalSpecificationDataType {
    long specificationId;
    boolean specificationIdIsSet;
    long dataTypeId;
    boolean dataTypeIdIsSet;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String provenance;
    @JsonProperty("specificationId")
    public void setSpecificationId(long specificationId) {
      this.specificationId = specificationId;
      this.specificationIdIsSet = true;
    }
    @JsonProperty("dataTypeId")
    public void setDataTypeId(long dataTypeId) {
      this.dataTypeId = dataTypeId;
      this.dataTypeIdIsSet = true;
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
    public long specificationId() { throw new UnsupportedOperationException(); }
    @Override
    public long dataTypeId() { throw new UnsupportedOperationException(); }
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
  static ImmutablePhysicalSpecificationDataType fromJson(Json json) {
    ImmutablePhysicalSpecificationDataType.Builder builder = ImmutablePhysicalSpecificationDataType.builder();
    if (json.specificationIdIsSet) {
      builder.specificationId(json.specificationId);
    }
    if (json.dataTypeIdIsSet) {
      builder.dataTypeId(json.dataTypeId);
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
   * Creates an immutable copy of a {@link PhysicalSpecificationDataType} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecificationDataType instance
   */
  public static ImmutablePhysicalSpecificationDataType copyOf(PhysicalSpecificationDataType instance) {
    if (instance instanceof ImmutablePhysicalSpecificationDataType) {
      return (ImmutablePhysicalSpecificationDataType) instance;
    }
    return ImmutablePhysicalSpecificationDataType.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecificationDataType ImmutablePhysicalSpecificationDataType}.
   * @return A new ImmutablePhysicalSpecificationDataType builder
   */
  public static ImmutablePhysicalSpecificationDataType.Builder builder() {
    return new ImmutablePhysicalSpecificationDataType.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecificationDataType ImmutablePhysicalSpecificationDataType}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SPECIFICATION_ID = 0x1L;
    private static final long INIT_BIT_DATA_TYPE_ID = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private long initBits = 0x7L;

    private long specificationId;
    private long dataTypeId;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification_data_type.PhysicalSpecificationDataType} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecificationDataType instance) {
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof PhysicalSpecificationDataType) {
        PhysicalSpecificationDataType instance = (PhysicalSpecificationDataType) object;
        specificationId(instance.specificationId());
        dataTypeId(instance.dataTypeId());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationDataType#specificationId() specificationId} attribute.
     * @param specificationId The value for specificationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specificationId")
    public final Builder specificationId(long specificationId) {
      this.specificationId = specificationId;
      initBits &= ~INIT_BIT_SPECIFICATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationDataType#dataTypeId() dataTypeId} attribute.
     * @param dataTypeId The value for dataTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataTypeId")
    public final Builder dataTypeId(long dataTypeId) {
      this.dataTypeId = dataTypeId;
      initBits &= ~INIT_BIT_DATA_TYPE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationDataType#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecificationDataType#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationDataType#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link PhysicalSpecificationDataType#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PhysicalSpecificationDataType#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecificationDataType ImmutablePhysicalSpecificationDataType}.
     * @return An immutable instance of PhysicalSpecificationDataType
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecificationDataType build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecificationDataType(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SPECIFICATION_ID) != 0) attributes.add("specificationId");
      if ((initBits & INIT_BIT_DATA_TYPE_ID) != 0) attributes.add("dataTypeId");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build PhysicalSpecificationDataType, some of required attributes are not set " + attributes;
    }
  }
}
