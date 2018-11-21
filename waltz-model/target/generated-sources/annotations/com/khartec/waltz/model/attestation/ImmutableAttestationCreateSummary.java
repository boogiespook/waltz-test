package com.khartec.waltz.model.attestation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AttestationCreateSummary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttestationCreateSummary.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AttestationCreateSummary"})
public final class ImmutableAttestationCreateSummary
    extends AttestationCreateSummary {
  private final int entityCount;
  private final int instanceCount;
  private final long recipientCount;

  private ImmutableAttestationCreateSummary(int entityCount, int instanceCount, long recipientCount) {
    this.entityCount = entityCount;
    this.instanceCount = instanceCount;
    this.recipientCount = recipientCount;
  }

  /**
   * @return The value of the {@code entityCount} attribute
   */
  @JsonProperty("entityCount")
  @Override
  public int entityCount() {
    return entityCount;
  }

  /**
   * @return The value of the {@code instanceCount} attribute
   */
  @JsonProperty("instanceCount")
  @Override
  public int instanceCount() {
    return instanceCount;
  }

  /**
   * @return The value of the {@code recipientCount} attribute
   */
  @JsonProperty("recipientCount")
  @Override
  public long recipientCount() {
    return recipientCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationCreateSummary#entityCount() entityCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationCreateSummary withEntityCount(int value) {
    if (this.entityCount == value) return this;
    return new ImmutableAttestationCreateSummary(value, this.instanceCount, this.recipientCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationCreateSummary#instanceCount() instanceCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for instanceCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationCreateSummary withInstanceCount(int value) {
    if (this.instanceCount == value) return this;
    return new ImmutableAttestationCreateSummary(this.entityCount, value, this.recipientCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationCreateSummary#recipientCount() recipientCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for recipientCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationCreateSummary withRecipientCount(long value) {
    if (this.recipientCount == value) return this;
    return new ImmutableAttestationCreateSummary(this.entityCount, this.instanceCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttestationCreateSummary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttestationCreateSummary
        && equalTo((ImmutableAttestationCreateSummary) another);
  }

  private boolean equalTo(ImmutableAttestationCreateSummary another) {
    return entityCount == another.entityCount
        && instanceCount == another.instanceCount
        && recipientCount == another.recipientCount;
  }

  /**
   * Computes a hash code from attributes: {@code entityCount}, {@code instanceCount}, {@code recipientCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityCount;
    h += (h << 5) + instanceCount;
    h += (h << 5) + Long.hashCode(recipientCount);
    return h;
  }

  /**
   * Prints the immutable value {@code AttestationCreateSummary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AttestationCreateSummary{"
        + "entityCount=" + entityCount
        + ", instanceCount=" + instanceCount
        + ", recipientCount=" + recipientCount
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AttestationCreateSummary {
    int entityCount;
    boolean entityCountIsSet;
    int instanceCount;
    boolean instanceCountIsSet;
    long recipientCount;
    boolean recipientCountIsSet;
    @JsonProperty("entityCount")
    public void setEntityCount(int entityCount) {
      this.entityCount = entityCount;
      this.entityCountIsSet = true;
    }
    @JsonProperty("instanceCount")
    public void setInstanceCount(int instanceCount) {
      this.instanceCount = instanceCount;
      this.instanceCountIsSet = true;
    }
    @JsonProperty("recipientCount")
    public void setRecipientCount(long recipientCount) {
      this.recipientCount = recipientCount;
      this.recipientCountIsSet = true;
    }
    @Override
    public int entityCount() { throw new UnsupportedOperationException(); }
    @Override
    public int instanceCount() { throw new UnsupportedOperationException(); }
    @Override
    public long recipientCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAttestationCreateSummary fromJson(Json json) {
    ImmutableAttestationCreateSummary.Builder builder = ImmutableAttestationCreateSummary.builder();
    if (json.entityCountIsSet) {
      builder.entityCount(json.entityCount);
    }
    if (json.instanceCountIsSet) {
      builder.instanceCount(json.instanceCount);
    }
    if (json.recipientCountIsSet) {
      builder.recipientCount(json.recipientCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AttestationCreateSummary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AttestationCreateSummary instance
   */
  public static ImmutableAttestationCreateSummary copyOf(AttestationCreateSummary instance) {
    if (instance instanceof ImmutableAttestationCreateSummary) {
      return (ImmutableAttestationCreateSummary) instance;
    }
    return ImmutableAttestationCreateSummary.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttestationCreateSummary ImmutableAttestationCreateSummary}.
   * @return A new ImmutableAttestationCreateSummary builder
   */
  public static ImmutableAttestationCreateSummary.Builder builder() {
    return new ImmutableAttestationCreateSummary.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttestationCreateSummary ImmutableAttestationCreateSummary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_COUNT = 0x1L;
    private static final long INIT_BIT_INSTANCE_COUNT = 0x2L;
    private static final long INIT_BIT_RECIPIENT_COUNT = 0x4L;
    private long initBits = 0x7L;

    private int entityCount;
    private int instanceCount;
    private long recipientCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AttestationCreateSummary} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AttestationCreateSummary instance) {
      Objects.requireNonNull(instance, "instance");
      entityCount(instance.entityCount());
      instanceCount(instance.instanceCount());
      recipientCount(instance.recipientCount());
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationCreateSummary#entityCount() entityCount} attribute.
     * @param entityCount The value for entityCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityCount")
    public final Builder entityCount(int entityCount) {
      this.entityCount = entityCount;
      initBits &= ~INIT_BIT_ENTITY_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationCreateSummary#instanceCount() instanceCount} attribute.
     * @param instanceCount The value for instanceCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instanceCount")
    public final Builder instanceCount(int instanceCount) {
      this.instanceCount = instanceCount;
      initBits &= ~INIT_BIT_INSTANCE_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationCreateSummary#recipientCount() recipientCount} attribute.
     * @param recipientCount The value for recipientCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipientCount")
    public final Builder recipientCount(long recipientCount) {
      this.recipientCount = recipientCount;
      initBits &= ~INIT_BIT_RECIPIENT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttestationCreateSummary ImmutableAttestationCreateSummary}.
     * @return An immutable instance of AttestationCreateSummary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttestationCreateSummary build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttestationCreateSummary(entityCount, instanceCount, recipientCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_COUNT) != 0) attributes.add("entityCount");
      if ((initBits & INIT_BIT_INSTANCE_COUNT) != 0) attributes.add("instanceCount");
      if ((initBits & INIT_BIT_RECIPIENT_COUNT) != 0) attributes.add("recipientCount");
      return "Cannot build AttestationCreateSummary, some of required attributes are not set " + attributes;
    }
  }
}
