package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UpdateDescriptionCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdateDescriptionCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UpdateDescriptionCommand"})
public final class ImmutableUpdateDescriptionCommand extends UpdateDescriptionCommand {
  private final @Nullable String newDescription;

  private ImmutableUpdateDescriptionCommand(@Nullable String newDescription) {
    this.newDescription = newDescription;
  }

  /**
   * @return The value of the {@code newDescription} attribute
   */
  @JsonProperty("newDescription")
  @Override
  public @Nullable String newDescription() {
    return newDescription;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UpdateDescriptionCommand#newDescription() newDescription} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newDescription (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUpdateDescriptionCommand withNewDescription(@Nullable String value) {
    if (Objects.equals(this.newDescription, value)) return this;
    return new ImmutableUpdateDescriptionCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdateDescriptionCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdateDescriptionCommand
        && equalTo((ImmutableUpdateDescriptionCommand) another);
  }

  private boolean equalTo(ImmutableUpdateDescriptionCommand another) {
    return Objects.equals(newDescription, another.newDescription);
  }

  /**
   * Computes a hash code from attributes: {@code newDescription}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(newDescription);
    return h;
  }

  /**
   * Prints the immutable value {@code UpdateDescriptionCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UpdateDescriptionCommand{"
        + "newDescription=" + newDescription
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UpdateDescriptionCommand {
    String newDescription;
    @JsonProperty("newDescription")
    public void setNewDescription(@Nullable String newDescription) {
      this.newDescription = newDescription;
    }
    @Override
    public String newDescription() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUpdateDescriptionCommand fromJson(Json json) {
    ImmutableUpdateDescriptionCommand.Builder builder = ImmutableUpdateDescriptionCommand.builder();
    if (json.newDescription != null) {
      builder.newDescription(json.newDescription);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UpdateDescriptionCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdateDescriptionCommand instance
   */
  public static ImmutableUpdateDescriptionCommand copyOf(UpdateDescriptionCommand instance) {
    if (instance instanceof ImmutableUpdateDescriptionCommand) {
      return (ImmutableUpdateDescriptionCommand) instance;
    }
    return ImmutableUpdateDescriptionCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdateDescriptionCommand ImmutableUpdateDescriptionCommand}.
   * @return A new ImmutableUpdateDescriptionCommand builder
   */
  public static ImmutableUpdateDescriptionCommand.Builder builder() {
    return new ImmutableUpdateDescriptionCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdateDescriptionCommand ImmutableUpdateDescriptionCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private String newDescription;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UpdateDescriptionCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UpdateDescriptionCommand instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String newDescriptionValue = instance.newDescription();
      if (newDescriptionValue != null) {
        newDescription(newDescriptionValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link UpdateDescriptionCommand#newDescription() newDescription} attribute.
     * @param newDescription The value for newDescription (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newDescription")
    public final Builder newDescription(@Nullable String newDescription) {
      this.newDescription = newDescription;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdateDescriptionCommand ImmutableUpdateDescriptionCommand}.
     * @return An immutable instance of UpdateDescriptionCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdateDescriptionCommand build() {
      return new ImmutableUpdateDescriptionCommand(newDescription);
    }
  }
}
