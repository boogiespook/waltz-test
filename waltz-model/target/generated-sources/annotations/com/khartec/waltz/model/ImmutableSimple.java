package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Simple}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSimple.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Simple"})
public final class ImmutableSimple extends Simple {
  private final String message;
  private final String secret;

  private ImmutableSimple(String message, String secret) {
    this.message = message;
    this.secret = secret;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public String message() {
    return message;
  }

  /**
   * @return The value of the {@code secret} attribute
   */
  @JsonProperty("secret")
  @Override
  public Optional<String> secret() {
    return Optional.ofNullable(secret);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Simple#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSimple withMessage(String value) {
    if (this.message.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "message");
    return new ImmutableSimple(newValue, this.secret);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Simple#secret() secret} attribute.
   * @param value The value for secret
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSimple withSecret(String value) {
    String newValue = Objects.requireNonNull(value, "secret");
    if (Objects.equals(this.secret, newValue)) return this;
    return new ImmutableSimple(this.message, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Simple#secret() secret} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for secret
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSimple withSecret(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.secret, value)) return this;
    return new ImmutableSimple(this.message, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSimple} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSimple
        && equalTo((ImmutableSimple) another);
  }

  private boolean equalTo(ImmutableSimple another) {
    return message.equals(another.message)
        && Objects.equals(secret, another.secret);
  }

  /**
   * Computes a hash code from attributes: {@code message}, {@code secret}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + message.hashCode();
    h += (h << 5) + Objects.hashCode(secret);
    return h;
  }

  /**
   * Prints the immutable value {@code Simple} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Simple{");
    builder.append("message=").append(message);
    if (secret != null) {
      builder.append(", ");
      builder.append("secret=").append(secret);
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
  static final class Json extends Simple {
    String message;
    Optional<String> secret = Optional.empty();
    @JsonProperty("message")
    public void setMessage(String message) {
      this.message = message;
    }
    @JsonProperty("secret")
    public void setSecret(Optional<String> secret) {
      this.secret = secret;
    }
    @Override
    public String message() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> secret() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSimple fromJson(Json json) {
    ImmutableSimple.Builder builder = ImmutableSimple.builder();
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.secret != null) {
      builder.secret(json.secret);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Simple} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Simple instance
   */
  public static ImmutableSimple copyOf(Simple instance) {
    if (instance instanceof ImmutableSimple) {
      return (ImmutableSimple) instance;
    }
    return ImmutableSimple.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSimple ImmutableSimple}.
   * @return A new ImmutableSimple builder
   */
  public static ImmutableSimple.Builder builder() {
    return new ImmutableSimple.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSimple ImmutableSimple}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private long initBits = 0x1L;

    private String message;
    private String secret;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Simple} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Simple instance) {
      Objects.requireNonNull(instance, "instance");
      message(instance.message());
      Optional<String> secretOptional = instance.secret();
      if (secretOptional.isPresent()) {
        secret(secretOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Simple#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Simple#secret() secret} to secret.
     * @param secret The value for secret
     * @return {@code this} builder for chained invocation
     */
    public final Builder secret(String secret) {
      this.secret = Objects.requireNonNull(secret, "secret");
      return this;
    }

    /**
     * Initializes the optional value {@link Simple#secret() secret} to secret.
     * @param secret The value for secret
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("secret")
    public final Builder secret(Optional<String> secret) {
      this.secret = secret.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSimple ImmutableSimple}.
     * @return An immutable instance of Simple
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSimple build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSimple(message, secret);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      return "Cannot build Simple, some of required attributes are not set " + attributes;
    }
  }
}
