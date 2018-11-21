package com.khartec.waltz.model.authoritativesource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AuthoritativeSourceUpdateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthoritativeSourceUpdateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AuthoritativeSourceUpdateCommand"})
public final class ImmutableAuthoritativeSourceUpdateCommand
    extends AuthoritativeSourceUpdateCommand {
  private final AuthoritativenessRating rating;
  private final @Nullable String description;
  private final Long id;

  private ImmutableAuthoritativeSourceUpdateCommand(
      AuthoritativenessRating rating,
      @Nullable String description,
      Long id) {
    this.rating = rating;
    this.description = description;
    this.id = id;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public AuthoritativenessRating rating() {
    return rating;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
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
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceUpdateCommand#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceUpdateCommand withRating(AuthoritativenessRating value) {
    if (this.rating == value) return this;
    AuthoritativenessRating newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableAuthoritativeSourceUpdateCommand(newValue, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceUpdateCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceUpdateCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAuthoritativeSourceUpdateCommand(this.rating, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuthoritativeSourceUpdateCommand#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthoritativeSourceUpdateCommand withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuthoritativeSourceUpdateCommand(this.rating, this.description, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuthoritativeSourceUpdateCommand#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthoritativeSourceUpdateCommand withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuthoritativeSourceUpdateCommand(this.rating, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthoritativeSourceUpdateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthoritativeSourceUpdateCommand
        && equalTo((ImmutableAuthoritativeSourceUpdateCommand) another);
  }

  private boolean equalTo(ImmutableAuthoritativeSourceUpdateCommand another) {
    return rating.equals(another.rating)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code rating}, {@code description}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code AuthoritativeSourceUpdateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuthoritativeSourceUpdateCommand{");
    builder.append("rating=").append(rating);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
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
  static final class Json extends AuthoritativeSourceUpdateCommand {
    AuthoritativenessRating rating;
    String description;
    Optional<Long> id = Optional.empty();
    @JsonProperty("rating")
    public void setRating(AuthoritativenessRating rating) {
      this.rating = rating;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public AuthoritativenessRating rating() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
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
  static ImmutableAuthoritativeSourceUpdateCommand fromJson(Json json) {
    ImmutableAuthoritativeSourceUpdateCommand.Builder builder = ImmutableAuthoritativeSourceUpdateCommand.builder();
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuthoritativeSourceUpdateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthoritativeSourceUpdateCommand instance
   */
  public static ImmutableAuthoritativeSourceUpdateCommand copyOf(AuthoritativeSourceUpdateCommand instance) {
    if (instance instanceof ImmutableAuthoritativeSourceUpdateCommand) {
      return (ImmutableAuthoritativeSourceUpdateCommand) instance;
    }
    return ImmutableAuthoritativeSourceUpdateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthoritativeSourceUpdateCommand ImmutableAuthoritativeSourceUpdateCommand}.
   * @return A new ImmutableAuthoritativeSourceUpdateCommand builder
   */
  public static ImmutableAuthoritativeSourceUpdateCommand.Builder builder() {
    return new ImmutableAuthoritativeSourceUpdateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthoritativeSourceUpdateCommand ImmutableAuthoritativeSourceUpdateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING = 0x1L;
    private long initBits = 0x1L;

    private AuthoritativenessRating rating;
    private String description;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.authoritativesource.AuthoritativeSourceUpdateCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuthoritativeSourceUpdateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
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
      if (object instanceof AuthoritativeSourceUpdateCommand) {
        AuthoritativeSourceUpdateCommand instance = (AuthoritativeSourceUpdateCommand) object;
        rating(instance.rating());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
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
     * Initializes the value for the {@link AuthoritativeSourceUpdateCommand#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(AuthoritativenessRating rating) {
      this.rating = Objects.requireNonNull(rating, "rating");
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSourceUpdateCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link AuthoritativeSourceUpdateCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AuthoritativeSourceUpdateCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthoritativeSourceUpdateCommand ImmutableAuthoritativeSourceUpdateCommand}.
     * @return An immutable instance of AuthoritativeSourceUpdateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthoritativeSourceUpdateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthoritativeSourceUpdateCommand(rating, description, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      return "Cannot build AuthoritativeSourceUpdateCommand, some of required attributes are not set " + attributes;
    }
  }
}
