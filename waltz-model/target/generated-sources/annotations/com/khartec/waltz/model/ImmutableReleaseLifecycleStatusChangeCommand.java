package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ReleaseLifecycleStatusChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReleaseLifecycleStatusChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ReleaseLifecycleStatusChangeCommand"})
public final class ImmutableReleaseLifecycleStatusChangeCommand
    extends ReleaseLifecycleStatusChangeCommand {
  private final ReleaseLifecycleStatus newStatus;

  private ImmutableReleaseLifecycleStatusChangeCommand(ReleaseLifecycleStatus newStatus) {
    this.newStatus = newStatus;
  }

  /**
   * @return The value of the {@code newStatus} attribute
   */
  @JsonProperty("newStatus")
  @Override
  public ReleaseLifecycleStatus newStatus() {
    return newStatus;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReleaseLifecycleStatusChangeCommand#newStatus() newStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReleaseLifecycleStatusChangeCommand withNewStatus(ReleaseLifecycleStatus value) {
    if (this.newStatus == value) return this;
    ReleaseLifecycleStatus newValue = Objects.requireNonNull(value, "newStatus");
    return new ImmutableReleaseLifecycleStatusChangeCommand(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReleaseLifecycleStatusChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReleaseLifecycleStatusChangeCommand
        && equalTo((ImmutableReleaseLifecycleStatusChangeCommand) another);
  }

  private boolean equalTo(ImmutableReleaseLifecycleStatusChangeCommand another) {
    return newStatus.equals(another.newStatus);
  }

  /**
   * Computes a hash code from attributes: {@code newStatus}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + newStatus.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ReleaseLifecycleStatusChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ReleaseLifecycleStatusChangeCommand{"
        + "newStatus=" + newStatus
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ReleaseLifecycleStatusChangeCommand {
    ReleaseLifecycleStatus newStatus;
    @JsonProperty("newStatus")
    public void setNewStatus(ReleaseLifecycleStatus newStatus) {
      this.newStatus = newStatus;
    }
    @Override
    public ReleaseLifecycleStatus newStatus() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableReleaseLifecycleStatusChangeCommand fromJson(Json json) {
    ImmutableReleaseLifecycleStatusChangeCommand.Builder builder = ImmutableReleaseLifecycleStatusChangeCommand.builder();
    if (json.newStatus != null) {
      builder.newStatus(json.newStatus);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ReleaseLifecycleStatusChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ReleaseLifecycleStatusChangeCommand instance
   */
  public static ImmutableReleaseLifecycleStatusChangeCommand copyOf(ReleaseLifecycleStatusChangeCommand instance) {
    if (instance instanceof ImmutableReleaseLifecycleStatusChangeCommand) {
      return (ImmutableReleaseLifecycleStatusChangeCommand) instance;
    }
    return ImmutableReleaseLifecycleStatusChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableReleaseLifecycleStatusChangeCommand ImmutableReleaseLifecycleStatusChangeCommand}.
   * @return A new ImmutableReleaseLifecycleStatusChangeCommand builder
   */
  public static ImmutableReleaseLifecycleStatusChangeCommand.Builder builder() {
    return new ImmutableReleaseLifecycleStatusChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableReleaseLifecycleStatusChangeCommand ImmutableReleaseLifecycleStatusChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NEW_STATUS = 0x1L;
    private long initBits = 0x1L;

    private ReleaseLifecycleStatus newStatus;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ReleaseLifecycleStatusChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ReleaseLifecycleStatusChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      newStatus(instance.newStatus());
      return this;
    }

    /**
     * Initializes the value for the {@link ReleaseLifecycleStatusChangeCommand#newStatus() newStatus} attribute.
     * @param newStatus The value for newStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newStatus")
    public final Builder newStatus(ReleaseLifecycleStatus newStatus) {
      this.newStatus = Objects.requireNonNull(newStatus, "newStatus");
      initBits &= ~INIT_BIT_NEW_STATUS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableReleaseLifecycleStatusChangeCommand ImmutableReleaseLifecycleStatusChangeCommand}.
     * @return An immutable instance of ReleaseLifecycleStatusChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableReleaseLifecycleStatusChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableReleaseLifecycleStatusChangeCommand(newStatus);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NEW_STATUS) != 0) attributes.add("newStatus");
      return "Cannot build ReleaseLifecycleStatusChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
