package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link DateChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDateChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DateChangeCommand"})
public final class ImmutableDateChangeCommand extends DateChangeCommand {
  private final LocalDate newDateVal;

  private ImmutableDateChangeCommand(LocalDate newDateVal) {
    this.newDateVal = newDateVal;
  }

  /**
   * @return The value of the {@code newDateVal} attribute
   */
  @JsonProperty("newDateVal")
  @Override
  public Optional<LocalDate> newDateVal() {
    return Optional.ofNullable(newDateVal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DateChangeCommand#newDateVal() newDateVal} attribute.
   * @param value The value for newDateVal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDateChangeCommand withNewDateVal(LocalDate value) {
    LocalDate newValue = Objects.requireNonNull(value, "newDateVal");
    if (this.newDateVal == newValue) return this;
    return new ImmutableDateChangeCommand(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DateChangeCommand#newDateVal() newDateVal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for newDateVal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDateChangeCommand withNewDateVal(Optional<? extends LocalDate> optional) {
    LocalDate value = optional.orElse(null);
    if (this.newDateVal == value) return this;
    return new ImmutableDateChangeCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDateChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDateChangeCommand
        && equalTo((ImmutableDateChangeCommand) another);
  }

  private boolean equalTo(ImmutableDateChangeCommand another) {
    return Objects.equals(newDateVal, another.newDateVal);
  }

  /**
   * Computes a hash code from attributes: {@code newDateVal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(newDateVal);
    return h;
  }

  /**
   * Prints the immutable value {@code DateChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DateChangeCommand{");
    if (newDateVal != null) {
      builder.append("newDateVal=").append(newDateVal);
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
  static final class Json extends DateChangeCommand {
    Optional<LocalDate> newDateVal = Optional.empty();
    @JsonProperty("newDateVal")
    public void setNewDateVal(Optional<LocalDate> newDateVal) {
      this.newDateVal = newDateVal;
    }
    @Override
    public Optional<LocalDate> newDateVal() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDateChangeCommand fromJson(Json json) {
    ImmutableDateChangeCommand.Builder builder = ImmutableDateChangeCommand.builder();
    if (json.newDateVal != null) {
      builder.newDateVal(json.newDateVal);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DateChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DateChangeCommand instance
   */
  public static ImmutableDateChangeCommand copyOf(DateChangeCommand instance) {
    if (instance instanceof ImmutableDateChangeCommand) {
      return (ImmutableDateChangeCommand) instance;
    }
    return ImmutableDateChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDateChangeCommand ImmutableDateChangeCommand}.
   * @return A new ImmutableDateChangeCommand builder
   */
  public static ImmutableDateChangeCommand.Builder builder() {
    return new ImmutableDateChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDateChangeCommand ImmutableDateChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private LocalDate newDateVal;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DateChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DateChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<LocalDate> newDateValOptional = instance.newDateVal();
      if (newDateValOptional.isPresent()) {
        newDateVal(newDateValOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link DateChangeCommand#newDateVal() newDateVal} to newDateVal.
     * @param newDateVal The value for newDateVal
     * @return {@code this} builder for chained invocation
     */
    public final Builder newDateVal(LocalDate newDateVal) {
      this.newDateVal = Objects.requireNonNull(newDateVal, "newDateVal");
      return this;
    }

    /**
     * Initializes the optional value {@link DateChangeCommand#newDateVal() newDateVal} to newDateVal.
     * @param newDateVal The value for newDateVal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newDateVal")
    public final Builder newDateVal(Optional<? extends LocalDate> newDateVal) {
      this.newDateVal = newDateVal.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDateChangeCommand ImmutableDateChangeCommand}.
     * @return An immutable instance of DateChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDateChangeCommand build() {
      return new ImmutableDateChangeCommand(newDateVal);
    }
  }
}
