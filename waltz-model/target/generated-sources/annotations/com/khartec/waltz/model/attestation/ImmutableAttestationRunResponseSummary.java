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
 * Immutable implementation of {@link AttestationRunResponseSummary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttestationRunResponseSummary.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AttestationRunResponseSummary"})
public final class ImmutableAttestationRunResponseSummary
    extends AttestationRunResponseSummary {
  private final long runId;
  private final long completeCount;
  private final long pendingCount;

  private ImmutableAttestationRunResponseSummary(long runId, long completeCount, long pendingCount) {
    this.runId = runId;
    this.completeCount = completeCount;
    this.pendingCount = pendingCount;
  }

  /**
   * @return The value of the {@code runId} attribute
   */
  @JsonProperty("runId")
  @Override
  public long runId() {
    return runId;
  }

  /**
   * @return The value of the {@code completeCount} attribute
   */
  @JsonProperty("completeCount")
  @Override
  public long completeCount() {
    return completeCount;
  }

  /**
   * @return The value of the {@code pendingCount} attribute
   */
  @JsonProperty("pendingCount")
  @Override
  public long pendingCount() {
    return pendingCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunResponseSummary#runId() runId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for runId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunResponseSummary withRunId(long value) {
    if (this.runId == value) return this;
    return new ImmutableAttestationRunResponseSummary(value, this.completeCount, this.pendingCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunResponseSummary#completeCount() completeCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for completeCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunResponseSummary withCompleteCount(long value) {
    if (this.completeCount == value) return this;
    return new ImmutableAttestationRunResponseSummary(this.runId, value, this.pendingCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationRunResponseSummary#pendingCount() pendingCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pendingCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationRunResponseSummary withPendingCount(long value) {
    if (this.pendingCount == value) return this;
    return new ImmutableAttestationRunResponseSummary(this.runId, this.completeCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttestationRunResponseSummary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttestationRunResponseSummary
        && equalTo((ImmutableAttestationRunResponseSummary) another);
  }

  private boolean equalTo(ImmutableAttestationRunResponseSummary another) {
    return runId == another.runId
        && completeCount == another.completeCount
        && pendingCount == another.pendingCount;
  }

  /**
   * Computes a hash code from attributes: {@code runId}, {@code completeCount}, {@code pendingCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(runId);
    h += (h << 5) + Long.hashCode(completeCount);
    h += (h << 5) + Long.hashCode(pendingCount);
    return h;
  }

  /**
   * Prints the immutable value {@code AttestationRunResponseSummary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AttestationRunResponseSummary{"
        + "runId=" + runId
        + ", completeCount=" + completeCount
        + ", pendingCount=" + pendingCount
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AttestationRunResponseSummary {
    long runId;
    boolean runIdIsSet;
    long completeCount;
    boolean completeCountIsSet;
    long pendingCount;
    boolean pendingCountIsSet;
    @JsonProperty("runId")
    public void setRunId(long runId) {
      this.runId = runId;
      this.runIdIsSet = true;
    }
    @JsonProperty("completeCount")
    public void setCompleteCount(long completeCount) {
      this.completeCount = completeCount;
      this.completeCountIsSet = true;
    }
    @JsonProperty("pendingCount")
    public void setPendingCount(long pendingCount) {
      this.pendingCount = pendingCount;
      this.pendingCountIsSet = true;
    }
    @Override
    public long runId() { throw new UnsupportedOperationException(); }
    @Override
    public long completeCount() { throw new UnsupportedOperationException(); }
    @Override
    public long pendingCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAttestationRunResponseSummary fromJson(Json json) {
    ImmutableAttestationRunResponseSummary.Builder builder = ImmutableAttestationRunResponseSummary.builder();
    if (json.runIdIsSet) {
      builder.runId(json.runId);
    }
    if (json.completeCountIsSet) {
      builder.completeCount(json.completeCount);
    }
    if (json.pendingCountIsSet) {
      builder.pendingCount(json.pendingCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AttestationRunResponseSummary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AttestationRunResponseSummary instance
   */
  public static ImmutableAttestationRunResponseSummary copyOf(AttestationRunResponseSummary instance) {
    if (instance instanceof ImmutableAttestationRunResponseSummary) {
      return (ImmutableAttestationRunResponseSummary) instance;
    }
    return ImmutableAttestationRunResponseSummary.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttestationRunResponseSummary ImmutableAttestationRunResponseSummary}.
   * @return A new ImmutableAttestationRunResponseSummary builder
   */
  public static ImmutableAttestationRunResponseSummary.Builder builder() {
    return new ImmutableAttestationRunResponseSummary.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttestationRunResponseSummary ImmutableAttestationRunResponseSummary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RUN_ID = 0x1L;
    private static final long INIT_BIT_COMPLETE_COUNT = 0x2L;
    private static final long INIT_BIT_PENDING_COUNT = 0x4L;
    private long initBits = 0x7L;

    private long runId;
    private long completeCount;
    private long pendingCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AttestationRunResponseSummary} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AttestationRunResponseSummary instance) {
      Objects.requireNonNull(instance, "instance");
      runId(instance.runId());
      completeCount(instance.completeCount());
      pendingCount(instance.pendingCount());
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRunResponseSummary#runId() runId} attribute.
     * @param runId The value for runId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("runId")
    public final Builder runId(long runId) {
      this.runId = runId;
      initBits &= ~INIT_BIT_RUN_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRunResponseSummary#completeCount() completeCount} attribute.
     * @param completeCount The value for completeCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("completeCount")
    public final Builder completeCount(long completeCount) {
      this.completeCount = completeCount;
      initBits &= ~INIT_BIT_COMPLETE_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationRunResponseSummary#pendingCount() pendingCount} attribute.
     * @param pendingCount The value for pendingCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("pendingCount")
    public final Builder pendingCount(long pendingCount) {
      this.pendingCount = pendingCount;
      initBits &= ~INIT_BIT_PENDING_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttestationRunResponseSummary ImmutableAttestationRunResponseSummary}.
     * @return An immutable instance of AttestationRunResponseSummary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttestationRunResponseSummary build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttestationRunResponseSummary(runId, completeCount, pendingCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RUN_ID) != 0) attributes.add("runId");
      if ((initBits & INIT_BIT_COMPLETE_COUNT) != 0) attributes.add("completeCount");
      if ((initBits & INIT_BIT_PENDING_COUNT) != 0) attributes.add("pendingCount");
      return "Cannot build AttestationRunResponseSummary, some of required attributes are not set " + attributes;
    }
  }
}
