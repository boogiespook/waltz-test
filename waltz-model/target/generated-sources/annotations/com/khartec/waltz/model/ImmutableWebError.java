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
 * Immutable implementation of {@link WebError}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableWebError.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "WebError"})
public final class ImmutableWebError extends WebError {
  private final String message;
  private final String id;

  private ImmutableWebError(String message, String id) {
    this.message = message;
    this.id = id;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebError#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebError withMessage(String value) {
    if (this.message.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "message");
    return new ImmutableWebError(newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link WebError#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableWebError withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableWebError(this.message, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link WebError#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableWebError withId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableWebError(this.message, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableWebError} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableWebError
        && equalTo((ImmutableWebError) another);
  }

  private boolean equalTo(ImmutableWebError another) {
    return message.equals(another.message)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code message}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + message.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code WebError} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("WebError{");
    builder.append("message=").append(message);
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
  static final class Json extends WebError {
    String message;
    Optional<String> id = Optional.empty();
    @JsonProperty("message")
    public void setMessage(String message) {
      this.message = message;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
    }
    @Override
    public String message() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableWebError fromJson(Json json) {
    ImmutableWebError.Builder builder = ImmutableWebError.builder();
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link WebError} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WebError instance
   */
  public static ImmutableWebError copyOf(WebError instance) {
    if (instance instanceof ImmutableWebError) {
      return (ImmutableWebError) instance;
    }
    return ImmutableWebError.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableWebError ImmutableWebError}.
   * @return A new ImmutableWebError builder
   */
  public static ImmutableWebError.Builder builder() {
    return new ImmutableWebError.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableWebError ImmutableWebError}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private long initBits = 0x1L;

    private String message;
    private String id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code WebError} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WebError instance) {
      Objects.requireNonNull(instance, "instance");
      message(instance.message());
      Optional<String> idOptional = instance.id();
      if (idOptional.isPresent()) {
        id(idOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link WebError#message() message} attribute.
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
     * Initializes the optional value {@link WebError#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      return this;
    }

    /**
     * Initializes the optional value {@link WebError#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableWebError ImmutableWebError}.
     * @return An immutable instance of WebError
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableWebError build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableWebError(message, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      return "Cannot build WebError, some of required attributes are not set " + attributes;
    }
  }
}
