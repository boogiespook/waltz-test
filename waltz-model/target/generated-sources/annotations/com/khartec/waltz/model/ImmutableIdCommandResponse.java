package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link IdCommandResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIdCommandResponse.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "IdCommandResponse"})
public final class ImmutableIdCommandResponse extends IdCommandResponse {
  private final Long id;

  private ImmutableIdCommandResponse(Long id) {
    this.id = id;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link IdCommandResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdCommandResponse withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableIdCommandResponse(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link IdCommandResponse#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdCommandResponse withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableIdCommandResponse(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIdCommandResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIdCommandResponse
        && equalTo((ImmutableIdCommandResponse) another);
  }

  private boolean equalTo(ImmutableIdCommandResponse another) {
    return Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code IdCommandResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("IdCommandResponse{");
    if (id != null) {
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
  static final class Json extends IdCommandResponse {
    Optional<Long> id = Optional.empty();
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
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
  static ImmutableIdCommandResponse fromJson(Json json) {
    ImmutableIdCommandResponse.Builder builder = ImmutableIdCommandResponse.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link IdCommandResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable IdCommandResponse instance
   */
  public static ImmutableIdCommandResponse copyOf(IdCommandResponse instance) {
    if (instance instanceof ImmutableIdCommandResponse) {
      return (ImmutableIdCommandResponse) instance;
    }
    return ImmutableIdCommandResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableIdCommandResponse ImmutableIdCommandResponse}.
   * @return A new ImmutableIdCommandResponse builder
   */
  public static ImmutableIdCommandResponse.Builder builder() {
    return new ImmutableIdCommandResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableIdCommandResponse ImmutableIdCommandResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdCommandResponse} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdCommandResponse instance) {
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
    }

    /**
     * Initializes the optional value {@link IdCommandResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link IdCommandResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableIdCommandResponse ImmutableIdCommandResponse}.
     * @return An immutable instance of IdCommandResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableIdCommandResponse build() {
      return new ImmutableIdCommandResponse(id);
    }
  }
}
