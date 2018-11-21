package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link StringChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStringChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "StringChangeCommand"})
public final class ImmutableStringChangeCommand extends StringChangeCommand {
  private final String newStringVal;

  private ImmutableStringChangeCommand(String newStringVal) {
    this.newStringVal = newStringVal;
  }

  /**
   * @return The value of the {@code newStringVal} attribute
   */
  @JsonProperty("newStringVal")
  @Override
  public Optional<String> newStringVal() {
    return Optional.ofNullable(newStringVal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StringChangeCommand#newStringVal() newStringVal} attribute.
   * @param value The value for newStringVal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStringChangeCommand withNewStringVal(String value) {
    String newValue = Objects.requireNonNull(value, "newStringVal");
    if (Objects.equals(this.newStringVal, newValue)) return this;
    return new ImmutableStringChangeCommand(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StringChangeCommand#newStringVal() newStringVal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for newStringVal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStringChangeCommand withNewStringVal(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.newStringVal, value)) return this;
    return new ImmutableStringChangeCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStringChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStringChangeCommand
        && equalTo((ImmutableStringChangeCommand) another);
  }

  private boolean equalTo(ImmutableStringChangeCommand another) {
    return Objects.equals(newStringVal, another.newStringVal);
  }

  /**
   * Computes a hash code from attributes: {@code newStringVal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(newStringVal);
    return h;
  }

  /**
   * Prints the immutable value {@code StringChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StringChangeCommand{");
    if (newStringVal != null) {
      builder.append("newStringVal=").append(newStringVal);
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
  static final class Json extends StringChangeCommand {
    Optional<String> newStringVal = Optional.empty();
    @JsonProperty("newStringVal")
    public void setNewStringVal(Optional<String> newStringVal) {
      this.newStringVal = newStringVal;
    }
    @Override
    public Optional<String> newStringVal() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStringChangeCommand fromJson(Json json) {
    ImmutableStringChangeCommand.Builder builder = ImmutableStringChangeCommand.builder();
    if (json.newStringVal != null) {
      builder.newStringVal(json.newStringVal);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StringChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StringChangeCommand instance
   */
  public static ImmutableStringChangeCommand copyOf(StringChangeCommand instance) {
    if (instance instanceof ImmutableStringChangeCommand) {
      return (ImmutableStringChangeCommand) instance;
    }
    return ImmutableStringChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableStringChangeCommand ImmutableStringChangeCommand}.
   * @return A new ImmutableStringChangeCommand builder
   */
  public static ImmutableStringChangeCommand.Builder builder() {
    return new ImmutableStringChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableStringChangeCommand ImmutableStringChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private String newStringVal;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code StringChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(StringChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<String> newStringValOptional = instance.newStringVal();
      if (newStringValOptional.isPresent()) {
        newStringVal(newStringValOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StringChangeCommand#newStringVal() newStringVal} to newStringVal.
     * @param newStringVal The value for newStringVal
     * @return {@code this} builder for chained invocation
     */
    public final Builder newStringVal(String newStringVal) {
      this.newStringVal = Objects.requireNonNull(newStringVal, "newStringVal");
      return this;
    }

    /**
     * Initializes the optional value {@link StringChangeCommand#newStringVal() newStringVal} to newStringVal.
     * @param newStringVal The value for newStringVal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newStringVal")
    public final Builder newStringVal(Optional<String> newStringVal) {
      this.newStringVal = newStringVal.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableStringChangeCommand ImmutableStringChangeCommand}.
     * @return An immutable instance of StringChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableStringChangeCommand build() {
      return new ImmutableStringChangeCommand(newStringVal);
    }
  }
}
