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
 * Immutable implementation of {@link AccessLog}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccessLog.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AccessLog"})
public final class ImmutableAccessLog extends AccessLog {
  private final String state;
  private final String params;
  private final String userId;
  private final LocalDateTime createdAt;

  private ImmutableAccessLog(ImmutableAccessLog.Builder builder) {
    this.state = builder.state;
    this.params = builder.params;
    this.userId = builder.userId;
    this.createdAt = builder.createdAt != null
        ? builder.createdAt
        : Objects.requireNonNull(super.createdAt(), "createdAt");
  }

  private ImmutableAccessLog(
      String state,
      String params,
      String userId,
      LocalDateTime createdAt) {
    this.state = state;
    this.params = params;
    this.userId = userId;
    this.createdAt = createdAt;
  }

  /**
   * @return The value of the {@code state} attribute
   */
  @JsonProperty("state")
  @Override
  public String state() {
    return state;
  }

  /**
   * @return The value of the {@code params} attribute
   */
  @JsonProperty("params")
  @Override
  public String params() {
    return params;
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
   * Copy the current immutable object by setting a value for the {@link AccessLog#state() state} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for state
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccessLog withState(String value) {
    if (this.state.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "state");
    return new ImmutableAccessLog(newValue, this.params, this.userId, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccessLog#params() params} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for params
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccessLog withParams(String value) {
    if (this.params.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "params");
    return new ImmutableAccessLog(this.state, newValue, this.userId, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccessLog#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccessLog withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableAccessLog(this.state, this.params, newValue, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccessLog#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccessLog withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableAccessLog(this.state, this.params, this.userId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccessLog} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccessLog
        && equalTo((ImmutableAccessLog) another);
  }

  private boolean equalTo(ImmutableAccessLog another) {
    return state.equals(another.state)
        && params.equals(another.params)
        && userId.equals(another.userId)
        && createdAt.equals(another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code state}, {@code params}, {@code userId}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + state.hashCode();
    h += (h << 5) + params.hashCode();
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + createdAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AccessLog} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AccessLog{"
        + "state=" + state
        + ", params=" + params
        + ", userId=" + userId
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
  static final class Json extends AccessLog {
    String state;
    String params;
    String userId;
    LocalDateTime createdAt;
    @JsonProperty("state")
    public void setState(String state) {
      this.state = state;
    }
    @JsonProperty("params")
    public void setParams(String params) {
      this.params = params;
    }
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @Override
    public String state() { throw new UnsupportedOperationException(); }
    @Override
    public String params() { throw new UnsupportedOperationException(); }
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
  static ImmutableAccessLog fromJson(Json json) {
    ImmutableAccessLog.Builder builder = ImmutableAccessLog.builder();
    if (json.state != null) {
      builder.state(json.state);
    }
    if (json.params != null) {
      builder.params(json.params);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AccessLog} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccessLog instance
   */
  public static ImmutableAccessLog copyOf(AccessLog instance) {
    if (instance instanceof ImmutableAccessLog) {
      return (ImmutableAccessLog) instance;
    }
    return ImmutableAccessLog.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccessLog ImmutableAccessLog}.
   * @return A new ImmutableAccessLog builder
   */
  public static ImmutableAccessLog.Builder builder() {
    return new ImmutableAccessLog.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccessLog ImmutableAccessLog}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_STATE = 0x1L;
    private static final long INIT_BIT_PARAMS = 0x2L;
    private static final long INIT_BIT_USER_ID = 0x4L;
    private long initBits = 0x7L;

    private String state;
    private String params;
    private String userId;
    private LocalDateTime createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccessLog} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AccessLog instance) {
      Objects.requireNonNull(instance, "instance");
      state(instance.state());
      params(instance.params());
      userId(instance.userId());
      createdAt(instance.createdAt());
      return this;
    }

    /**
     * Initializes the value for the {@link AccessLog#state() state} attribute.
     * @param state The value for state 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("state")
    public final Builder state(String state) {
      this.state = Objects.requireNonNull(state, "state");
      initBits &= ~INIT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link AccessLog#params() params} attribute.
     * @param params The value for params 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("params")
    public final Builder params(String params) {
      this.params = Objects.requireNonNull(params, "params");
      initBits &= ~INIT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the value for the {@link AccessLog#userId() userId} attribute.
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
     * Initializes the value for the {@link AccessLog#createdAt() createdAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AccessLog#createdAt() createdAt}.</em>
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccessLog ImmutableAccessLog}.
     * @return An immutable instance of AccessLog
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAccessLog build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAccessLog(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_STATE) != 0) attributes.add("state");
      if ((initBits & INIT_BIT_PARAMS) != 0) attributes.add("params");
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      return "Cannot build AccessLog, some of required attributes are not set " + attributes;
    }
  }
}
