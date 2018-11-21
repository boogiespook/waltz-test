package com.khartec.waltz.model.attestation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AttestationInstance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttestationInstance.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AttestationInstance"})
public final class ImmutableAttestationInstance
    extends AttestationInstance {
  private final Long attestationRunId;
  private final EntityReference parentEntity;
  private final LocalDateTime attestedAt;
  private final String attestedBy;
  private final Long id;

  private ImmutableAttestationInstance(
      Long attestationRunId,
      EntityReference parentEntity,
      LocalDateTime attestedAt,
      String attestedBy,
      Long id) {
    this.attestationRunId = attestationRunId;
    this.parentEntity = parentEntity;
    this.attestedAt = attestedAt;
    this.attestedBy = attestedBy;
    this.id = id;
  }

  /**
   * @return The value of the {@code attestationRunId} attribute
   */
  @JsonProperty("attestationRunId")
  @Override
  public Long attestationRunId() {
    return attestationRunId;
  }

  /**
   * @return The value of the {@code parentEntity} attribute
   */
  @JsonProperty("parentEntity")
  @Override
  public EntityReference parentEntity() {
    return parentEntity;
  }

  /**
   * @return The value of the {@code attestedAt} attribute
   */
  @JsonProperty("attestedAt")
  @Override
  public Optional<LocalDateTime> attestedAt() {
    return Optional.ofNullable(attestedAt);
  }

  /**
   * @return The value of the {@code attestedBy} attribute
   */
  @JsonProperty("attestedBy")
  @Override
  public Optional<String> attestedBy() {
    return Optional.ofNullable(attestedBy);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationInstance#attestationRunId() attestationRunId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attestationRunId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationInstance withAttestationRunId(Long value) {
    if (this.attestationRunId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "attestationRunId");
    return new ImmutableAttestationInstance(newValue, this.parentEntity, this.attestedAt, this.attestedBy, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationInstance#parentEntity() parentEntity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parentEntity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationInstance withParentEntity(EntityReference value) {
    if (this.parentEntity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "parentEntity");
    return new ImmutableAttestationInstance(this.attestationRunId, newValue, this.attestedAt, this.attestedBy, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationInstance#attestedAt() attestedAt} attribute.
   * @param value The value for attestedAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstance withAttestedAt(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "attestedAt");
    if (this.attestedAt == newValue) return this;
    return new ImmutableAttestationInstance(this.attestationRunId, this.parentEntity, newValue, this.attestedBy, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationInstance#attestedAt() attestedAt} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestedAt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstance withAttestedAt(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.attestedAt == value) return this;
    return new ImmutableAttestationInstance(this.attestationRunId, this.parentEntity, value, this.attestedBy, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationInstance#attestedBy() attestedBy} attribute.
   * @param value The value for attestedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstance withAttestedBy(String value) {
    String newValue = Objects.requireNonNull(value, "attestedBy");
    if (Objects.equals(this.attestedBy, newValue)) return this;
    return new ImmutableAttestationInstance(this.attestationRunId, this.parentEntity, this.attestedAt, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationInstance#attestedBy() attestedBy} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstance withAttestedBy(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.attestedBy, value)) return this;
    return new ImmutableAttestationInstance(this.attestationRunId, this.parentEntity, this.attestedAt, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationInstance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstance withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAttestationInstance(this.attestationRunId, this.parentEntity, this.attestedAt, this.attestedBy, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationInstance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstance withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAttestationInstance(this.attestationRunId, this.parentEntity, this.attestedAt, this.attestedBy, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttestationInstance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttestationInstance
        && equalTo((ImmutableAttestationInstance) another);
  }

  private boolean equalTo(ImmutableAttestationInstance another) {
    return attestationRunId.equals(another.attestationRunId)
        && parentEntity.equals(another.parentEntity)
        && Objects.equals(attestedAt, another.attestedAt)
        && Objects.equals(attestedBy, another.attestedBy)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code attestationRunId}, {@code parentEntity}, {@code attestedAt}, {@code attestedBy}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + attestationRunId.hashCode();
    h += (h << 5) + parentEntity.hashCode();
    h += (h << 5) + Objects.hashCode(attestedAt);
    h += (h << 5) + Objects.hashCode(attestedBy);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code AttestationInstance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AttestationInstance{");
    builder.append("attestationRunId=").append(attestationRunId);
    builder.append(", ");
    builder.append("parentEntity=").append(parentEntity);
    if (attestedAt != null) {
      builder.append(", ");
      builder.append("attestedAt=").append(attestedAt);
    }
    if (attestedBy != null) {
      builder.append(", ");
      builder.append("attestedBy=").append(attestedBy);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AttestationInstance {
    Long attestationRunId;
    EntityReference parentEntity;
    Optional<LocalDateTime> attestedAt = Optional.empty();
    Optional<String> attestedBy = Optional.empty();
    Optional<Long> id = Optional.empty();
    @JsonProperty("attestationRunId")
    public void setAttestationRunId(Long attestationRunId) {
      this.attestationRunId = attestationRunId;
    }
    @JsonProperty("parentEntity")
    public void setParentEntity(EntityReference parentEntity) {
      this.parentEntity = parentEntity;
    }
    @JsonProperty("attestedAt")
    public void setAttestedAt(Optional<LocalDateTime> attestedAt) {
      this.attestedAt = attestedAt;
    }
    @JsonProperty("attestedBy")
    public void setAttestedBy(Optional<String> attestedBy) {
      this.attestedBy = attestedBy;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public Long attestationRunId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference parentEntity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDateTime> attestedAt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> attestedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAttestationInstance fromJson(Json json) {
    ImmutableAttestationInstance.Builder builder = ImmutableAttestationInstance.builder();
    if (json.attestationRunId != null) {
      builder.attestationRunId(json.attestationRunId);
    }
    if (json.parentEntity != null) {
      builder.parentEntity(json.parentEntity);
    }
    if (json.attestedAt != null) {
      builder.attestedAt(json.attestedAt);
    }
    if (json.attestedBy != null) {
      builder.attestedBy(json.attestedBy);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AttestationInstance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AttestationInstance instance
   */
  public static ImmutableAttestationInstance copyOf(AttestationInstance instance) {
    if (instance instanceof ImmutableAttestationInstance) {
      return (ImmutableAttestationInstance) instance;
    }
    return ImmutableAttestationInstance.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttestationInstance ImmutableAttestationInstance}.
   * @return A new ImmutableAttestationInstance builder
   */
  public static ImmutableAttestationInstance.Builder builder() {
    return new ImmutableAttestationInstance.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttestationInstance ImmutableAttestationInstance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ATTESTATION_RUN_ID = 0x1L;
    private static final long INIT_BIT_PARENT_ENTITY = 0x2L;
    private long initBits = 0x3L;

    private Long attestationRunId;
    private EntityReference parentEntity;
    private LocalDateTime attestedAt;
    private String attestedBy;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.attestation.AttestationInstance} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AttestationInstance instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof AttestationInstance) {
        AttestationInstance instance = (AttestationInstance) object;
        Optional<String> attestedByOptional = instance.attestedBy();
        if (attestedByOptional.isPresent()) {
          attestedBy(attestedByOptional);
        }
        attestationRunId(instance.attestationRunId());
        Optional<LocalDateTime> attestedAtOptional = instance.attestedAt();
        if (attestedAtOptional.isPresent()) {
          attestedAt(attestedAtOptional);
        }
        parentEntity(instance.parentEntity());
      }
    }

    /**
     * Initializes the value for the {@link AttestationInstance#attestationRunId() attestationRunId} attribute.
     * @param attestationRunId The value for attestationRunId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestationRunId")
    public final Builder attestationRunId(Long attestationRunId) {
      this.attestationRunId = Objects.requireNonNull(attestationRunId, "attestationRunId");
      initBits &= ~INIT_BIT_ATTESTATION_RUN_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationInstance#parentEntity() parentEntity} attribute.
     * @param parentEntity The value for parentEntity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentEntity")
    public final Builder parentEntity(EntityReference parentEntity) {
      this.parentEntity = Objects.requireNonNull(parentEntity, "parentEntity");
      initBits &= ~INIT_BIT_PARENT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstance#attestedAt() attestedAt} to attestedAt.
     * @param attestedAt The value for attestedAt
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestedAt(LocalDateTime attestedAt) {
      this.attestedAt = Objects.requireNonNull(attestedAt, "attestedAt");
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstance#attestedAt() attestedAt} to attestedAt.
     * @param attestedAt The value for attestedAt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestedAt")
    public final Builder attestedAt(Optional<? extends LocalDateTime> attestedAt) {
      this.attestedAt = attestedAt.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstance#attestedBy() attestedBy} to attestedBy.
     * @param attestedBy The value for attestedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestedBy(String attestedBy) {
      this.attestedBy = Objects.requireNonNull(attestedBy, "attestedBy");
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstance#attestedBy() attestedBy} to attestedBy.
     * @param attestedBy The value for attestedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestedBy")
    public final Builder attestedBy(Optional<String> attestedBy) {
      this.attestedBy = attestedBy.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttestationInstance ImmutableAttestationInstance}.
     * @return An immutable instance of AttestationInstance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttestationInstance build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttestationInstance(attestationRunId, parentEntity, attestedAt, attestedBy, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ATTESTATION_RUN_ID) != 0) attributes.add("attestationRunId");
      if ((initBits & INIT_BIT_PARENT_ENTITY) != 0) attributes.add("parentEntity");
      return "Cannot build AttestationInstance, some of required attributes are not set " + attributes;
    }
  }
}
