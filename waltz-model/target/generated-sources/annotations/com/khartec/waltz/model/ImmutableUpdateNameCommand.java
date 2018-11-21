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
 * Immutable implementation of {@link UpdateNameCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdateNameCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UpdateNameCommand"})
public final class ImmutableUpdateNameCommand extends UpdateNameCommand {
  private final String newName;

  private ImmutableUpdateNameCommand(String newName) {
    this.newName = newName;
  }

  /**
   * @return The value of the {@code newName} attribute
   */
  @JsonProperty("newName")
  @Override
  public String newName() {
    return newName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UpdateNameCommand#newName() newName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUpdateNameCommand withNewName(String value) {
    if (this.newName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "newName");
    return new ImmutableUpdateNameCommand(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdateNameCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdateNameCommand
        && equalTo((ImmutableUpdateNameCommand) another);
  }

  private boolean equalTo(ImmutableUpdateNameCommand another) {
    return newName.equals(another.newName);
  }

  /**
   * Computes a hash code from attributes: {@code newName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + newName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UpdateNameCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UpdateNameCommand{"
        + "newName=" + newName
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UpdateNameCommand {
    String newName;
    @JsonProperty("newName")
    public void setNewName(String newName) {
      this.newName = newName;
    }
    @Override
    public String newName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUpdateNameCommand fromJson(Json json) {
    ImmutableUpdateNameCommand.Builder builder = ImmutableUpdateNameCommand.builder();
    if (json.newName != null) {
      builder.newName(json.newName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UpdateNameCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdateNameCommand instance
   */
  public static ImmutableUpdateNameCommand copyOf(UpdateNameCommand instance) {
    if (instance instanceof ImmutableUpdateNameCommand) {
      return (ImmutableUpdateNameCommand) instance;
    }
    return ImmutableUpdateNameCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdateNameCommand ImmutableUpdateNameCommand}.
   * @return A new ImmutableUpdateNameCommand builder
   */
  public static ImmutableUpdateNameCommand.Builder builder() {
    return new ImmutableUpdateNameCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdateNameCommand ImmutableUpdateNameCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NEW_NAME = 0x1L;
    private long initBits = 0x1L;

    private String newName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UpdateNameCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UpdateNameCommand instance) {
      Objects.requireNonNull(instance, "instance");
      newName(instance.newName());
      return this;
    }

    /**
     * Initializes the value for the {@link UpdateNameCommand#newName() newName} attribute.
     * @param newName The value for newName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newName")
    public final Builder newName(String newName) {
      this.newName = Objects.requireNonNull(newName, "newName");
      initBits &= ~INIT_BIT_NEW_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdateNameCommand ImmutableUpdateNameCommand}.
     * @return An immutable instance of UpdateNameCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdateNameCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUpdateNameCommand(newName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NEW_NAME) != 0) attributes.add("newName");
      return "Cannot build UpdateNameCommand, some of required attributes are not set " + attributes;
    }
  }
}
