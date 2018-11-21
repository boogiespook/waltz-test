package com.khartec.waltz.model.application;

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
 * Immutable implementation of {@link AppRegistrationResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppRegistrationResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppRegistrationResponse"})
public final class ImmutableAppRegistrationResponse
    extends AppRegistrationResponse {
  private final Long id;
  private final String message;
  private final AppRegistrationRequest originalRequest;
  private final boolean registered;

  private ImmutableAppRegistrationResponse(
      Long id,
      String message,
      AppRegistrationRequest originalRequest) {
    this.id = id;
    this.message = message;
    this.originalRequest = originalRequest;
    this.registered = super.registered();
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
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public Optional<String> message() {
    return Optional.ofNullable(message);
  }

  /**
   * @return The value of the {@code originalRequest} attribute
   */
  @JsonProperty("originalRequest")
  @Override
  public AppRegistrationRequest originalRequest() {
    return originalRequest;
  }

  /**
   * @return The computed-at-construction value of the {@code registered} attribute
   */
  @JsonProperty("registered")
  @Override
  public boolean registered() {
    return registered;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppRegistrationResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationResponse withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAppRegistrationResponse(newValue, this.message, this.originalRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppRegistrationResponse#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationResponse withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAppRegistrationResponse(value, this.message, this.originalRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppRegistrationResponse#message() message} attribute.
   * @param value The value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationResponse withMessage(String value) {
    String newValue = Objects.requireNonNull(value, "message");
    if (Objects.equals(this.message, newValue)) return this;
    return new ImmutableAppRegistrationResponse(this.id, newValue, this.originalRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppRegistrationResponse#message() message} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationResponse withMessage(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.message, value)) return this;
    return new ImmutableAppRegistrationResponse(this.id, value, this.originalRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationResponse#originalRequest() originalRequest} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originalRequest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationResponse withOriginalRequest(AppRegistrationRequest value) {
    if (this.originalRequest == value) return this;
    AppRegistrationRequest newValue = Objects.requireNonNull(value, "originalRequest");
    return new ImmutableAppRegistrationResponse(this.id, this.message, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppRegistrationResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppRegistrationResponse
        && equalTo((ImmutableAppRegistrationResponse) another);
  }

  private boolean equalTo(ImmutableAppRegistrationResponse another) {
    return Objects.equals(id, another.id)
        && Objects.equals(message, another.message)
        && originalRequest.equals(another.originalRequest)
        && registered == another.registered;
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code message}, {@code originalRequest}, {@code registered}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(message);
    h += (h << 5) + originalRequest.hashCode();
    h += (h << 5) + Boolean.hashCode(registered);
    return h;
  }

  /**
   * Prints the immutable value {@code AppRegistrationResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AppRegistrationResponse{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (message != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("message=").append(message);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("originalRequest=").append(originalRequest);
    builder.append(", ");
    builder.append("registered=").append(registered);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppRegistrationResponse {
    Optional<Long> id = Optional.empty();
    Optional<String> message = Optional.empty();
    AppRegistrationRequest originalRequest;
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("message")
    public void setMessage(Optional<String> message) {
      this.message = message;
    }
    @JsonProperty("originalRequest")
    public void setOriginalRequest(AppRegistrationRequest originalRequest) {
      this.originalRequest = originalRequest;
    }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> message() { throw new UnsupportedOperationException(); }
    @Override
    public AppRegistrationRequest originalRequest() { throw new UnsupportedOperationException(); }
    @Override
    public boolean registered() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppRegistrationResponse fromJson(Json json) {
    ImmutableAppRegistrationResponse.Builder builder = ImmutableAppRegistrationResponse.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.originalRequest != null) {
      builder.originalRequest(json.originalRequest);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppRegistrationResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppRegistrationResponse instance
   */
  public static ImmutableAppRegistrationResponse copyOf(AppRegistrationResponse instance) {
    if (instance instanceof ImmutableAppRegistrationResponse) {
      return (ImmutableAppRegistrationResponse) instance;
    }
    return ImmutableAppRegistrationResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppRegistrationResponse ImmutableAppRegistrationResponse}.
   * @return A new ImmutableAppRegistrationResponse builder
   */
  public static ImmutableAppRegistrationResponse.Builder builder() {
    return new ImmutableAppRegistrationResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppRegistrationResponse ImmutableAppRegistrationResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ORIGINAL_REQUEST = 0x1L;
    private long initBits = 0x1L;

    private Long id;
    private String message;
    private AppRegistrationRequest originalRequest;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppRegistrationResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppRegistrationResponse instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Long> idOptional = instance.id();
      if (idOptional.isPresent()) {
        id(idOptional);
      }
      Optional<String> messageOptional = instance.message();
      if (messageOptional.isPresent()) {
        message(messageOptional);
      }
      originalRequest(instance.originalRequest());
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for chained invocation
     */
    public final Builder message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationResponse#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(Optional<String> message) {
      this.message = message.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationResponse#originalRequest() originalRequest} attribute.
     * @param originalRequest The value for originalRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("originalRequest")
    public final Builder originalRequest(AppRegistrationRequest originalRequest) {
      this.originalRequest = Objects.requireNonNull(originalRequest, "originalRequest");
      initBits &= ~INIT_BIT_ORIGINAL_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppRegistrationResponse ImmutableAppRegistrationResponse}.
     * @return An immutable instance of AppRegistrationResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppRegistrationResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppRegistrationResponse(id, message, originalRequest);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ORIGINAL_REQUEST) != 0) attributes.add("originalRequest");
      return "Cannot build AppRegistrationResponse, some of required attributes are not set " + attributes;
    }
  }
}
