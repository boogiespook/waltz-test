package com.khartec.waltz.model.accesslog;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AccessTime}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccessTime.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AccessTime"})
public final class ImmutableAccessTime extends AccessTime {
  private final String userId;
  private final LocalDateTime createdAt;

  private ImmutableAccessTime(String userId, LocalDateTime createdAt) {
    this.userId = userId;
    this.createdAt = createdAt;
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
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty("createdAt")
  @Override
  public LocalDateTime createdAt() {
    return createdAt;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccessTime#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccessTime withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableAccessTime(newValue, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccessTime#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccessTime withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableAccessTime(this.userId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccessTime} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccessTime
        && equalTo((ImmutableAccessTime) another);
  }

  private boolean equalTo(ImmutableAccessTime another) {
    return userId.equals(another.userId)
        && createdAt.equals(another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code userId}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + createdAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AccessTime} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AccessTime{"
        + "userId=" + userId
        + ", createdAt=" + createdAt
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AccessTime {
    String userId;
    LocalDateTime createdAt;
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @Override
    public String userId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime createdAt() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccessTime fromJson(Json json) {
    ImmutableAccessTime.Builder builder = ImmutableAccessTime.builder();
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AccessTime} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccessTime instance
   */
  public static ImmutableAccessTime copyOf(AccessTime instance) {
    if (instance instanceof ImmutableAccessTime) {
      return (ImmutableAccessTime) instance;
    }
    return ImmutableAccessTime.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccessTime ImmutableAccessTime}.
   * @return A new ImmutableAccessTime builder
   */
  public static ImmutableAccessTime.Builder builder() {
    return new ImmutableAccessTime.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccessTime ImmutableAccessTime}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_USER_ID = 0x1L;
    private static final long INIT_BIT_CREATED_AT = 0x2L;
    private long initBits = 0x3L;

    private String userId;
    private LocalDateTime createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccessTime} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AccessTime instance) {
      Objects.requireNonNull(instance, "instance");
      userId(instance.userId());
      createdAt(instance.createdAt());
      return this;
    }

    /**
     * Initializes the value for the {@link AccessTime#userId() userId} attribute.
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
     * Initializes the value for the {@link AccessTime#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccessTime ImmutableAccessTime}.
     * @return An immutable instance of AccessTime
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAccessTime build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAccessTime(userId, createdAt);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      return "Cannot build AccessTime, some of required attributes are not set " + attributes;
    }
  }
}
