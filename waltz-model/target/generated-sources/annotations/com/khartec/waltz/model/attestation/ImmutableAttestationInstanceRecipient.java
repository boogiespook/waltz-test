package com.khartec.waltz.model.attestation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AttestationInstanceRecipient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttestationInstanceRecipient.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AttestationInstanceRecipient"})
public final class ImmutableAttestationInstanceRecipient
    extends AttestationInstanceRecipient {
  private final AttestationInstance attestationInstance;
  private final String userId;
  private final Long id;

  private ImmutableAttestationInstanceRecipient(
      AttestationInstance attestationInstance,
      String userId,
      Long id) {
    this.attestationInstance = attestationInstance;
    this.userId = userId;
    this.id = id;
  }

  /**
   * @return The value of the {@code attestationInstance} attribute
   */
  @JsonProperty("attestationInstance")
  @Override
  public AttestationInstance attestationInstance() {
    return attestationInstance;
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @JsonProperty("userId")
  @Override
  public String userId() {
    return userId;
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
   * Copy the current immutable object by setting a value for the {@link AttestationInstanceRecipient#attestationInstance() attestationInstance} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attestationInstance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationInstanceRecipient withAttestationInstance(AttestationInstance value) {
    if (this.attestationInstance == value) return this;
    AttestationInstance newValue = Objects.requireNonNull(value, "attestationInstance");
    return new ImmutableAttestationInstanceRecipient(newValue, this.userId, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AttestationInstanceRecipient#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAttestationInstanceRecipient withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableAttestationInstanceRecipient(this.attestationInstance, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AttestationInstanceRecipient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstanceRecipient withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAttestationInstanceRecipient(this.attestationInstance, this.userId, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AttestationInstanceRecipient#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttestationInstanceRecipient withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAttestationInstanceRecipient(this.attestationInstance, this.userId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttestationInstanceRecipient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttestationInstanceRecipient
        && equalTo((ImmutableAttestationInstanceRecipient) another);
  }

  private boolean equalTo(ImmutableAttestationInstanceRecipient another) {
    return attestationInstance.equals(another.attestationInstance)
        && userId.equals(another.userId)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code attestationInstance}, {@code userId}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + attestationInstance.hashCode();
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code AttestationInstanceRecipient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AttestationInstanceRecipient{");
    builder.append("attestationInstance=").append(attestationInstance);
    builder.append(", ");
    builder.append("userId=").append(userId);
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
  static final class Json extends AttestationInstanceRecipient {
    AttestationInstance attestationInstance;
    String userId;
    Optional<Long> id = Optional.empty();
    @JsonProperty("attestationInstance")
    public void setAttestationInstance(AttestationInstance attestationInstance) {
      this.attestationInstance = attestationInstance;
    }
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public AttestationInstance attestationInstance() { throw new UnsupportedOperationException(); }
    @Override
    public String userId() { throw new UnsupportedOperationException(); }
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
  static ImmutableAttestationInstanceRecipient fromJson(Json json) {
    ImmutableAttestationInstanceRecipient.Builder builder = ImmutableAttestationInstanceRecipient.builder();
    if (json.attestationInstance != null) {
      builder.attestationInstance(json.attestationInstance);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AttestationInstanceRecipient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AttestationInstanceRecipient instance
   */
  public static ImmutableAttestationInstanceRecipient copyOf(AttestationInstanceRecipient instance) {
    if (instance instanceof ImmutableAttestationInstanceRecipient) {
      return (ImmutableAttestationInstanceRecipient) instance;
    }
    return ImmutableAttestationInstanceRecipient.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAttestationInstanceRecipient ImmutableAttestationInstanceRecipient}.
   * @return A new ImmutableAttestationInstanceRecipient builder
   */
  public static ImmutableAttestationInstanceRecipient.Builder builder() {
    return new ImmutableAttestationInstanceRecipient.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAttestationInstanceRecipient ImmutableAttestationInstanceRecipient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ATTESTATION_INSTANCE = 0x1L;
    private static final long INIT_BIT_USER_ID = 0x2L;
    private long initBits = 0x3L;

    private AttestationInstance attestationInstance;
    private String userId;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.attestation.AttestationInstanceRecipient} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AttestationInstanceRecipient instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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

    private void from(Object object) {
      if (object instanceof AttestationInstanceRecipient) {
        AttestationInstanceRecipient instance = (AttestationInstanceRecipient) object;
        attestationInstance(instance.attestationInstance());
        userId(instance.userId());
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
    }

    /**
     * Initializes the value for the {@link AttestationInstanceRecipient#attestationInstance() attestationInstance} attribute.
     * @param attestationInstance The value for attestationInstance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestationInstance")
    public final Builder attestationInstance(AttestationInstance attestationInstance) {
      this.attestationInstance = Objects.requireNonNull(attestationInstance, "attestationInstance");
      initBits &= ~INIT_BIT_ATTESTATION_INSTANCE;
      return this;
    }

    /**
     * Initializes the value for the {@link AttestationInstanceRecipient#userId() userId} attribute.
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userId")
    public final Builder userId(String userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      initBits &= ~INIT_BIT_USER_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstanceRecipient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AttestationInstanceRecipient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAttestationInstanceRecipient ImmutableAttestationInstanceRecipient}.
     * @return An immutable instance of AttestationInstanceRecipient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAttestationInstanceRecipient build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAttestationInstanceRecipient(attestationInstance, userId, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ATTESTATION_INSTANCE) != 0) attributes.add("attestationInstance");
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      return "Cannot build AttestationInstanceRecipient, some of required attributes are not set " + attributes;
    }
  }
}
