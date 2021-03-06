package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyRunStatusChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyRunStatusChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyRunStatusChangeCommand"})
public final class ImmutableSurveyRunStatusChangeCommand
    extends SurveyRunStatusChangeCommand {
  private final SurveyRunStatus newStatus;

  private ImmutableSurveyRunStatusChangeCommand(SurveyRunStatus newStatus) {
    this.newStatus = newStatus;
  }

  /**
   * @return The value of the {@code newStatus} attribute
   */
  @JsonProperty("newStatus")
  @Override
  public SurveyRunStatus newStatus() {
    return newStatus;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunStatusChangeCommand#newStatus() newStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunStatusChangeCommand withNewStatus(SurveyRunStatus value) {
    if (this.newStatus == value) return this;
    SurveyRunStatus newValue = Objects.requireNonNull(value, "newStatus");
    return new ImmutableSurveyRunStatusChangeCommand(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyRunStatusChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyRunStatusChangeCommand
        && equalTo((ImmutableSurveyRunStatusChangeCommand) another);
  }

  private boolean equalTo(ImmutableSurveyRunStatusChangeCommand another) {
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
   * Prints the immutable value {@code SurveyRunStatusChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SurveyRunStatusChangeCommand{"
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
  static final class Json extends SurveyRunStatusChangeCommand {
    SurveyRunStatus newStatus;
    @JsonProperty("newStatus")
    public void setNewStatus(SurveyRunStatus newStatus) {
      this.newStatus = newStatus;
    }
    @Override
    public SurveyRunStatus newStatus() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyRunStatusChangeCommand fromJson(Json json) {
    ImmutableSurveyRunStatusChangeCommand.Builder builder = ImmutableSurveyRunStatusChangeCommand.builder();
    if (json.newStatus != null) {
      builder.newStatus(json.newStatus);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyRunStatusChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyRunStatusChangeCommand instance
   */
  public static ImmutableSurveyRunStatusChangeCommand copyOf(SurveyRunStatusChangeCommand instance) {
    if (instance instanceof ImmutableSurveyRunStatusChangeCommand) {
      return (ImmutableSurveyRunStatusChangeCommand) instance;
    }
    return ImmutableSurveyRunStatusChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyRunStatusChangeCommand ImmutableSurveyRunStatusChangeCommand}.
   * @return A new ImmutableSurveyRunStatusChangeCommand builder
   */
  public static ImmutableSurveyRunStatusChangeCommand.Builder builder() {
    return new ImmutableSurveyRunStatusChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyRunStatusChangeCommand ImmutableSurveyRunStatusChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NEW_STATUS = 0x1L;
    private long initBits = 0x1L;

    private SurveyRunStatus newStatus;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SurveyRunStatusChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyRunStatusChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      newStatus(instance.newStatus());
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunStatusChangeCommand#newStatus() newStatus} attribute.
     * @param newStatus The value for newStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newStatus")
    public final Builder newStatus(SurveyRunStatus newStatus) {
      this.newStatus = Objects.requireNonNull(newStatus, "newStatus");
      initBits &= ~INIT_BIT_NEW_STATUS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyRunStatusChangeCommand ImmutableSurveyRunStatusChangeCommand}.
     * @return An immutable instance of SurveyRunStatusChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyRunStatusChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyRunStatusChangeCommand(newStatus);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NEW_STATUS) != 0) attributes.add("newStatus");
      return "Cannot build SurveyRunStatusChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
