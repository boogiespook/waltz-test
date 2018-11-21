package com.khartec.waltz.model.notification;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link NotificationSummary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNotificationSummary.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "NotificationSummary"})
public final class ImmutableNotificationSummary
    extends NotificationSummary {
  private final EntityKind kind;
  private final int count;

  private ImmutableNotificationSummary(EntityKind kind, int count) {
    this.kind = kind;
    this.count = count;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public EntityKind kind() {
    return kind;
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public int count() {
    return count;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NotificationSummary#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNotificationSummary withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableNotificationSummary(newValue, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NotificationSummary#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNotificationSummary withCount(int value) {
    if (this.count == value) return this;
    return new ImmutableNotificationSummary(this.kind, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNotificationSummary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNotificationSummary
        && equalTo((ImmutableNotificationSummary) another);
  }

  private boolean equalTo(ImmutableNotificationSummary another) {
    return kind.equals(another.kind)
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + count;
    return h;
  }

  /**
   * Prints the immutable value {@code NotificationSummary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "NotificationSummary{"
        + "kind=" + kind
        + ", count=" + count
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends NotificationSummary {
    EntityKind kind;
    int count;
    boolean countIsSet;
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("count")
    public void setCount(int count) {
      this.count = count;
      this.countIsSet = true;
    }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public int count() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNotificationSummary fromJson(Json json) {
    ImmutableNotificationSummary.Builder builder = ImmutableNotificationSummary.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NotificationSummary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NotificationSummary instance
   */
  public static ImmutableNotificationSummary copyOf(NotificationSummary instance) {
    if (instance instanceof ImmutableNotificationSummary) {
      return (ImmutableNotificationSummary) instance;
    }
    return ImmutableNotificationSummary.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNotificationSummary ImmutableNotificationSummary}.
   * @return A new ImmutableNotificationSummary builder
   */
  public static ImmutableNotificationSummary.Builder builder() {
    return new ImmutableNotificationSummary.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNotificationSummary ImmutableNotificationSummary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KIND = 0x1L;
    private static final long INIT_BIT_COUNT = 0x2L;
    private long initBits = 0x3L;

    private EntityKind kind;
    private int count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NotificationSummary} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NotificationSummary instance) {
      Objects.requireNonNull(instance, "instance");
      kind(instance.kind());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link NotificationSummary#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link NotificationSummary#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(int count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNotificationSummary ImmutableNotificationSummary}.
     * @return An immutable instance of NotificationSummary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNotificationSummary build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNotificationSummary(kind, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build NotificationSummary, some of required attributes are not set " + attributes;
    }
  }
}
