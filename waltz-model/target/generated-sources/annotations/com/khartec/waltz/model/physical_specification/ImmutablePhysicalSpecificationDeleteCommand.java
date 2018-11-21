package com.khartec.waltz.model.physical_specification;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecificationDeleteCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecificationDeleteCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecificationDeleteCommand"})
public final class ImmutablePhysicalSpecificationDeleteCommand
    extends PhysicalSpecificationDeleteCommand {
  private final long specificationId;

  private ImmutablePhysicalSpecificationDeleteCommand(long specificationId) {
    this.specificationId = specificationId;
  }

  /**
   * @return The value of the {@code specificationId} attribute
   */
  @JsonProperty("specificationId")
  @Override
  public long specificationId() {
    return specificationId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecificationDeleteCommand#specificationId() specificationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specificationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecificationDeleteCommand withSpecificationId(long value) {
    if (this.specificationId == value) return this;
    return new ImmutablePhysicalSpecificationDeleteCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecificationDeleteCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecificationDeleteCommand
        && equalTo((ImmutablePhysicalSpecificationDeleteCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecificationDeleteCommand another) {
    return specificationId == another.specificationId;
  }

  /**
   * Computes a hash code from attributes: {@code specificationId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(specificationId);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecificationDeleteCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalSpecificationDeleteCommand{"
        + "specificationId=" + specificationId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      extends PhysicalSpecificationDeleteCommand {
    long specificationId;
    boolean specificationIdIsSet;
    @JsonProperty("specificationId")
    public void setSpecificationId(long specificationId) {
      this.specificationId = specificationId;
      this.specificationIdIsSet = true;
    }
    @Override
    public long specificationId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalSpecificationDeleteCommand fromJson(Json json) {
    ImmutablePhysicalSpecificationDeleteCommand.Builder builder = ImmutablePhysicalSpecificationDeleteCommand.builder();
    if (json.specificationIdIsSet) {
      builder.specificationId(json.specificationId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecificationDeleteCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecificationDeleteCommand instance
   */
  public static ImmutablePhysicalSpecificationDeleteCommand copyOf(PhysicalSpecificationDeleteCommand instance) {
    if (instance instanceof ImmutablePhysicalSpecificationDeleteCommand) {
      return (ImmutablePhysicalSpecificationDeleteCommand) instance;
    }
    return ImmutablePhysicalSpecificationDeleteCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecificationDeleteCommand ImmutablePhysicalSpecificationDeleteCommand}.
   * @return A new ImmutablePhysicalSpecificationDeleteCommand builder
   */
  public static ImmutablePhysicalSpecificationDeleteCommand.Builder builder() {
    return new ImmutablePhysicalSpecificationDeleteCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecificationDeleteCommand ImmutablePhysicalSpecificationDeleteCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SPECIFICATION_ID = 0x1L;
    private long initBits = 0x1L;

    private long specificationId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalSpecificationDeleteCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecificationDeleteCommand instance) {
      Objects.requireNonNull(instance, "instance");
      specificationId(instance.specificationId());
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecificationDeleteCommand#specificationId() specificationId} attribute.
     * @param specificationId The value for specificationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specificationId")
    public final Builder specificationId(long specificationId) {
      this.specificationId = specificationId;
      initBits &= ~INIT_BIT_SPECIFICATION_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecificationDeleteCommand ImmutablePhysicalSpecificationDeleteCommand}.
     * @return An immutable instance of PhysicalSpecificationDeleteCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecificationDeleteCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecificationDeleteCommand(specificationId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SPECIFICATION_ID) != 0) attributes.add("specificationId");
      return "Cannot build PhysicalSpecificationDeleteCommand, some of required attributes are not set " + attributes;
    }
  }
}
