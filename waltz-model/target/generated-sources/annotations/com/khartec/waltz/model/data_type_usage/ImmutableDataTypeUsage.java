package com.khartec.waltz.model.data_type_usage;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.usage_info.UsageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link DataTypeUsage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataTypeUsage.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DataTypeUsage"})
public final class ImmutableDataTypeUsage extends DataTypeUsage {
  private final EntityReference entityReference;
  private final Long dataTypeId;
  private final UsageInfo usage;
  private final String provenance;

  private ImmutableDataTypeUsage(ImmutableDataTypeUsage.Builder builder) {
    this.entityReference = builder.entityReference;
    this.dataTypeId = builder.dataTypeId;
    this.usage = builder.usage;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableDataTypeUsage(
      EntityReference entityReference,
      Long dataTypeId,
      UsageInfo usage,
      String provenance) {
    this.entityReference = entityReference;
    this.dataTypeId = dataTypeId;
    this.usage = usage;
    this.provenance = provenance;
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
   * @return The value of the {@code dataTypeId} attribute
   */
  @JsonProperty("dataTypeId")
  @Override
  public Long dataTypeId() {
    return dataTypeId;
  }

  /**
   * @return The value of the {@code usage} attribute
   */
  @JsonProperty("usage")
  @Override
  public UsageInfo usage() {
    return usage;
  }

  /**
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    return provenance;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataTypeUsage#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataTypeUsage withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableDataTypeUsage(newValue, this.dataTypeId, this.usage, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataTypeUsage#dataTypeId() dataTypeId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataTypeUsage withDataTypeId(Long value) {
    if (this.dataTypeId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "dataTypeId");
    return new ImmutableDataTypeUsage(this.entityReference, newValue, this.usage, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataTypeUsage#usage() usage} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for usage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataTypeUsage withUsage(UsageInfo value) {
    if (this.usage == value) return this;
    UsageInfo newValue = Objects.requireNonNull(value, "usage");
    return new ImmutableDataTypeUsage(this.entityReference, this.dataTypeId, newValue, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataTypeUsage#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataTypeUsage withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableDataTypeUsage(this.entityReference, this.dataTypeId, this.usage, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataTypeUsage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataTypeUsage
        && equalTo((ImmutableDataTypeUsage) another);
  }

  private boolean equalTo(ImmutableDataTypeUsage another) {
    return entityReference.equals(another.entityReference)
        && dataTypeId.equals(another.dataTypeId)
        && usage.equals(another.usage)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code dataTypeId}, {@code usage}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + dataTypeId.hashCode();
    h += (h << 5) + usage.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DataTypeUsage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DataTypeUsage{"
        + "entityReference=" + entityReference
        + ", dataTypeId=" + dataTypeId
        + ", usage=" + usage
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
  static final class Json extends DataTypeUsage {
    EntityReference entityReference;
    Long dataTypeId;
    UsageInfo usage;
    String provenance;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("dataTypeId")
    public void setDataTypeId(Long dataTypeId) {
      this.dataTypeId = dataTypeId;
    }
    @JsonProperty("usage")
    public void setUsage(UsageInfo usage) {
      this.usage = usage;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public Long dataTypeId() { throw new UnsupportedOperationException(); }
    @Override
    public UsageInfo usage() { throw new UnsupportedOperationException(); }
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
  static ImmutableDataTypeUsage fromJson(Json json) {
    ImmutableDataTypeUsage.Builder builder = ImmutableDataTypeUsage.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.dataTypeId != null) {
      builder.dataTypeId(json.dataTypeId);
    }
    if (json.usage != null) {
      builder.usage(json.usage);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DataTypeUsage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataTypeUsage instance
   */
  public static ImmutableDataTypeUsage copyOf(DataTypeUsage instance) {
    if (instance instanceof ImmutableDataTypeUsage) {
      return (ImmutableDataTypeUsage) instance;
    }
    return ImmutableDataTypeUsage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDataTypeUsage ImmutableDataTypeUsage}.
   * @return A new ImmutableDataTypeUsage builder
   */
  public static ImmutableDataTypeUsage.Builder builder() {
    return new ImmutableDataTypeUsage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDataTypeUsage ImmutableDataTypeUsage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_DATA_TYPE_ID = 0x2L;
    private static final long INIT_BIT_USAGE = 0x4L;
    private long initBits = 0x7L;

    private EntityReference entityReference;
    private Long dataTypeId;
    private UsageInfo usage;
    private String provenance;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.data_type_usage.DataTypeUsage} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DataTypeUsage instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof DataTypeUsage) {
        DataTypeUsage instance = (DataTypeUsage) object;
        dataTypeId(instance.dataTypeId());
        entityReference(instance.entityReference());
        usage(instance.usage());
      }
    }

    /**
     * Initializes the value for the {@link DataTypeUsage#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link DataTypeUsage#dataTypeId() dataTypeId} attribute.
     * @param dataTypeId The value for dataTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataTypeId")
    public final Builder dataTypeId(Long dataTypeId) {
      this.dataTypeId = Objects.requireNonNull(dataTypeId, "dataTypeId");
      initBits &= ~INIT_BIT_DATA_TYPE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link DataTypeUsage#usage() usage} attribute.
     * @param usage The value for usage 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usage")
    public final Builder usage(UsageInfo usage) {
      this.usage = Objects.requireNonNull(usage, "usage");
      initBits &= ~INIT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link DataTypeUsage#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DataTypeUsage#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableDataTypeUsage ImmutableDataTypeUsage}.
     * @return An immutable instance of DataTypeUsage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDataTypeUsage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDataTypeUsage(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_DATA_TYPE_ID) != 0) attributes.add("dataTypeId");
      if ((initBits & INIT_BIT_USAGE) != 0) attributes.add("usage");
      return "Cannot build DataTypeUsage, some of required attributes are not set " + attributes;
    }
  }
}
