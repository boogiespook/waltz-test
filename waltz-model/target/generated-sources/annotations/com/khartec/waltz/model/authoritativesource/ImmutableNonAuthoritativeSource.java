package com.khartec.waltz.model.authoritativesource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link NonAuthoritativeSource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNonAuthoritativeSource.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "NonAuthoritativeSource"})
public final class ImmutableNonAuthoritativeSource
    extends NonAuthoritativeSource {
  private final EntityReference sourceReference;
  private final long dataTypeId;
  private final int count;

  private ImmutableNonAuthoritativeSource(EntityReference sourceReference, long dataTypeId, int count) {
    this.sourceReference = sourceReference;
    this.dataTypeId = dataTypeId;
    this.count = count;
  }

  /**
   * @return The value of the {@code sourceReference} attribute
   */
  @JsonProperty("sourceReference")
  @Override
  public EntityReference sourceReference() {
    return sourceReference;
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
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public int count() {
    return count;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NonAuthoritativeSource#sourceReference() sourceReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sourceReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNonAuthoritativeSource withSourceReference(EntityReference value) {
    if (this.sourceReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "sourceReference");
    return new ImmutableNonAuthoritativeSource(newValue, this.dataTypeId, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NonAuthoritativeSource#dataTypeId() dataTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNonAuthoritativeSource withDataTypeId(long value) {
    if (this.dataTypeId == value) return this;
    return new ImmutableNonAuthoritativeSource(this.sourceReference, value, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NonAuthoritativeSource#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNonAuthoritativeSource withCount(int value) {
    if (this.count == value) return this;
    return new ImmutableNonAuthoritativeSource(this.sourceReference, this.dataTypeId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNonAuthoritativeSource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNonAuthoritativeSource
        && equalTo((ImmutableNonAuthoritativeSource) another);
  }

  private boolean equalTo(ImmutableNonAuthoritativeSource another) {
    return sourceReference.equals(another.sourceReference)
        && dataTypeId == another.dataTypeId
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code sourceReference}, {@code dataTypeId}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sourceReference.hashCode();
    h += (h << 5) + Long.hashCode(dataTypeId);
    h += (h << 5) + count;
    return h;
  }

  /**
   * Prints the immutable value {@code NonAuthoritativeSource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "NonAuthoritativeSource{"
        + "sourceReference=" + sourceReference
        + ", dataTypeId=" + dataTypeId
        + ", count=" + count
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends NonAuthoritativeSource {
    EntityReference sourceReference;
    long dataTypeId;
    boolean dataTypeIdIsSet;
    int count;
    boolean countIsSet;
    @JsonProperty("sourceReference")
    public void setSourceReference(EntityReference sourceReference) {
      this.sourceReference = sourceReference;
    }
    @JsonProperty("dataTypeId")
    public void setDataTypeId(long dataTypeId) {
      this.dataTypeId = dataTypeId;
      this.dataTypeIdIsSet = true;
    }
    @JsonProperty("count")
    public void setCount(int count) {
      this.count = count;
      this.countIsSet = true;
    }
    @Override
    public EntityReference sourceReference() { throw new UnsupportedOperationException(); }
    @Override
    public long dataTypeId() { throw new UnsupportedOperationException(); }
    @Override
    public int count() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNonAuthoritativeSource fromJson(Json json) {
    ImmutableNonAuthoritativeSource.Builder builder = ImmutableNonAuthoritativeSource.builder();
    if (json.sourceReference != null) {
      builder.sourceReference(json.sourceReference);
    }
    if (json.dataTypeIdIsSet) {
      builder.dataTypeId(json.dataTypeId);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NonAuthoritativeSource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NonAuthoritativeSource instance
   */
  public static ImmutableNonAuthoritativeSource copyOf(NonAuthoritativeSource instance) {
    if (instance instanceof ImmutableNonAuthoritativeSource) {
      return (ImmutableNonAuthoritativeSource) instance;
    }
    return ImmutableNonAuthoritativeSource.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNonAuthoritativeSource ImmutableNonAuthoritativeSource}.
   * @return A new ImmutableNonAuthoritativeSource builder
   */
  public static ImmutableNonAuthoritativeSource.Builder builder() {
    return new ImmutableNonAuthoritativeSource.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNonAuthoritativeSource ImmutableNonAuthoritativeSource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SOURCE_REFERENCE = 0x1L;
    private static final long INIT_BIT_DATA_TYPE_ID = 0x2L;
    private static final long INIT_BIT_COUNT = 0x4L;
    private long initBits = 0x7L;

    private EntityReference sourceReference;
    private long dataTypeId;
    private int count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NonAuthoritativeSource} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NonAuthoritativeSource instance) {
      Objects.requireNonNull(instance, "instance");
      sourceReference(instance.sourceReference());
      dataTypeId(instance.dataTypeId());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link NonAuthoritativeSource#sourceReference() sourceReference} attribute.
     * @param sourceReference The value for sourceReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceReference")
    public final Builder sourceReference(EntityReference sourceReference) {
      this.sourceReference = Objects.requireNonNull(sourceReference, "sourceReference");
      initBits &= ~INIT_BIT_SOURCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link NonAuthoritativeSource#dataTypeId() dataTypeId} attribute.
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
     * Initializes the value for the {@link NonAuthoritativeSource#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(int count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNonAuthoritativeSource ImmutableNonAuthoritativeSource}.
     * @return An immutable instance of NonAuthoritativeSource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNonAuthoritativeSource build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNonAuthoritativeSource(sourceReference, dataTypeId, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SOURCE_REFERENCE) != 0) attributes.add("sourceReference");
      if ((initBits & INIT_BIT_DATA_TYPE_ID) != 0) attributes.add("dataTypeId");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build NonAuthoritativeSource, some of required attributes are not set " + attributes;
    }
  }
}
