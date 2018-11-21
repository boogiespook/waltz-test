package com.khartec.waltz.model.survey;

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
 * Immutable implementation of {@link SurveyInstanceStatusChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyInstanceStatusChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyInstanceStatusChangeCommand"})
public final class ImmutableSurveyInstanceStatusChangeCommand
    extends SurveyInstanceStatusChangeCommand {
  private final SurveyInstanceStatus newStatus;
  private final String reason;

  private ImmutableSurveyInstanceStatusChangeCommand(SurveyInstanceStatus newStatus, String reason) {
    this.newStatus = newStatus;
    this.reason = reason;
  }

  /**
   * @return The value of the {@code newStatus} attribute
   */
  @JsonProperty("newStatus")
  @Override
  public SurveyInstanceStatus newStatus() {
    return newStatus;
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<String> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceStatusChangeCommand#newStatus() newStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceStatusChangeCommand withNewStatus(SurveyInstanceStatus value) {
    if (this.newStatus == value) return this;
    SurveyInstanceStatus newValue = Objects.requireNonNull(value, "newStatus");
    return new ImmutableSurveyInstanceStatusChangeCommand(newValue, this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyInstanceStatusChangeCommand#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstanceStatusChangeCommand withReason(String value) {
    String newValue = Objects.requireNonNull(value, "reason");
    if (Objects.equals(this.reason, newValue)) return this;
    return new ImmutableSurveyInstanceStatusChangeCommand(this.newStatus, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyInstanceStatusChangeCommand#reason() reason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstanceStatusChangeCommand withReason(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.reason, value)) return this;
    return new ImmutableSurveyInstanceStatusChangeCommand(this.newStatus, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyInstanceStatusChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyInstanceStatusChangeCommand
        && equalTo((ImmutableSurveyInstanceStatusChangeCommand) another);
  }

  private boolean equalTo(ImmutableSurveyInstanceStatusChangeCommand another) {
    return newStatus.equals(another.newStatus)
        && Objects.equals(reason, another.reason);
  }

  /**
   * Computes a hash code from attributes: {@code newStatus}, {@code reason}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + newStatus.hashCode();
    h += (h << 5) + Objects.hashCode(reason);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyInstanceStatusChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyInstanceStatusChangeCommand{");
    builder.append("newStatus=").append(newStatus);
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
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
  static final class Json extends SurveyInstanceStatusChangeCommand {
    SurveyInstanceStatus newStatus;
    Optional<String> reason = Optional.empty();
    @JsonProperty("newStatus")
    public void setNewStatus(SurveyInstanceStatus newStatus) {
      this.newStatus = newStatus;
    }
    @JsonProperty("reason")
    public void setReason(Optional<String> reason) {
      this.reason = reason;
    }
    @Override
    public SurveyInstanceStatus newStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> reason() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyInstanceStatusChangeCommand fromJson(Json json) {
    ImmutableSurveyInstanceStatusChangeCommand.Builder builder = ImmutableSurveyInstanceStatusChangeCommand.builder();
    if (json.newStatus != null) {
      builder.newStatus(json.newStatus);
    }
    if (json.reason != null) {
      builder.reason(json.reason);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyInstanceStatusChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyInstanceStatusChangeCommand instance
   */
  public static ImmutableSurveyInstanceStatusChangeCommand copyOf(SurveyInstanceStatusChangeCommand instance) {
    if (instance instanceof ImmutableSurveyInstanceStatusChangeCommand) {
      return (ImmutableSurveyInstanceStatusChangeCommand) instance;
    }
    return ImmutableSurveyInstanceStatusChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyInstanceStatusChangeCommand ImmutableSurveyInstanceStatusChangeCommand}.
   * @return A new ImmutableSurveyInstanceStatusChangeCommand builder
   */
  public static ImmutableSurveyInstanceStatusChangeCommand.Builder builder() {
    return new ImmutableSurveyInstanceStatusChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyInstanceStatusChangeCommand ImmutableSurveyInstanceStatusChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NEW_STATUS = 0x1L;
    private long initBits = 0x1L;

    private SurveyInstanceStatus newStatus;
    private String reason;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyInstanceStatusChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyInstanceStatusChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      newStatus(instance.newStatus());
      Optional<String> reasonOptional = instance.reason();
      if (reasonOptional.isPresent()) {
        reason(reasonOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceStatusChangeCommand#newStatus() newStatus} attribute.
     * @param newStatus The value for newStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newStatus")
    public final Builder newStatus(SurveyInstanceStatus newStatus) {
      this.newStatus = Objects.requireNonNull(newStatus, "newStatus");
      initBits &= ~INIT_BIT_NEW_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstanceStatusChangeCommand#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(String reason) {
      this.reason = Objects.requireNonNull(reason, "reason");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstanceStatusChangeCommand#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<String> reason) {
      this.reason = reason.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyInstanceStatusChangeCommand ImmutableSurveyInstanceStatusChangeCommand}.
     * @return An immutable instance of SurveyInstanceStatusChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyInstanceStatusChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyInstanceStatusChangeCommand(newStatus, reason);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NEW_STATUS) != 0) attributes.add("newStatus");
      return "Cannot build SurveyInstanceStatusChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
