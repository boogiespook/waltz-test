package com.khartec.waltz.model.physical_flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalFlowSpecDefinitionChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalFlowSpecDefinitionChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalFlowSpecDefinitionChangeCommand"})
public final class ImmutablePhysicalFlowSpecDefinitionChangeCommand
    extends PhysicalFlowSpecDefinitionChangeCommand {
  private final long newSpecDefinitionId;

  private ImmutablePhysicalFlowSpecDefinitionChangeCommand(long newSpecDefinitionId) {
    this.newSpecDefinitionId = newSpecDefinitionId;
  }

  /**
   * @return The value of the {@code newSpecDefinitionId} attribute
   */
  @JsonProperty("newSpecDefinitionId")
  @Override
  public long newSpecDefinitionId() {
    return newSpecDefinitionId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalFlowSpecDefinitionChangeCommand#newSpecDefinitionId() newSpecDefinitionId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newSpecDefinitionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalFlowSpecDefinitionChangeCommand withNewSpecDefinitionId(long value) {
    if (this.newSpecDefinitionId == value) return this;
    return new ImmutablePhysicalFlowSpecDefinitionChangeCommand(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalFlowSpecDefinitionChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalFlowSpecDefinitionChangeCommand
        && equalTo((ImmutablePhysicalFlowSpecDefinitionChangeCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalFlowSpecDefinitionChangeCommand another) {
    return newSpecDefinitionId == another.newSpecDefinitionId;
  }

  /**
   * Computes a hash code from attributes: {@code newSpecDefinitionId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(newSpecDefinitionId);
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalFlowSpecDefinitionChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalFlowSpecDefinitionChangeCommand{"
        + "newSpecDefinitionId=" + newSpecDefinitionId
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
      extends PhysicalFlowSpecDefinitionChangeCommand {
    long newSpecDefinitionId;
    boolean newSpecDefinitionIdIsSet;
    @JsonProperty("newSpecDefinitionId")
    public void setNewSpecDefinitionId(long newSpecDefinitionId) {
      this.newSpecDefinitionId = newSpecDefinitionId;
      this.newSpecDefinitionIdIsSet = true;
    }
    @Override
    public long newSpecDefinitionId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalFlowSpecDefinitionChangeCommand fromJson(Json json) {
    ImmutablePhysicalFlowSpecDefinitionChangeCommand.Builder builder = ImmutablePhysicalFlowSpecDefinitionChangeCommand.builder();
    if (json.newSpecDefinitionIdIsSet) {
      builder.newSpecDefinitionId(json.newSpecDefinitionId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalFlowSpecDefinitionChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalFlowSpecDefinitionChangeCommand instance
   */
  public static ImmutablePhysicalFlowSpecDefinitionChangeCommand copyOf(PhysicalFlowSpecDefinitionChangeCommand instance) {
    if (instance instanceof ImmutablePhysicalFlowSpecDefinitionChangeCommand) {
      return (ImmutablePhysicalFlowSpecDefinitionChangeCommand) instance;
    }
    return ImmutablePhysicalFlowSpecDefinitionChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalFlowSpecDefinitionChangeCommand ImmutablePhysicalFlowSpecDefinitionChangeCommand}.
   * @return A new ImmutablePhysicalFlowSpecDefinitionChangeCommand builder
   */
  public static ImmutablePhysicalFlowSpecDefinitionChangeCommand.Builder builder() {
    return new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalFlowSpecDefinitionChangeCommand ImmutablePhysicalFlowSpecDefinitionChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NEW_SPEC_DEFINITION_ID = 0x1L;
    private long initBits = 0x1L;

    private long newSpecDefinitionId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalFlowSpecDefinitionChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalFlowSpecDefinitionChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      newSpecDefinitionId(instance.newSpecDefinitionId());
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalFlowSpecDefinitionChangeCommand#newSpecDefinitionId() newSpecDefinitionId} attribute.
     * @param newSpecDefinitionId The value for newSpecDefinitionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newSpecDefinitionId")
    public final Builder newSpecDefinitionId(long newSpecDefinitionId) {
      this.newSpecDefinitionId = newSpecDefinitionId;
      initBits &= ~INIT_BIT_NEW_SPEC_DEFINITION_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalFlowSpecDefinitionChangeCommand ImmutablePhysicalFlowSpecDefinitionChangeCommand}.
     * @return An immutable instance of PhysicalFlowSpecDefinitionChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalFlowSpecDefinitionChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalFlowSpecDefinitionChangeCommand(newSpecDefinitionId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NEW_SPEC_DEFINITION_ID) != 0) attributes.add("newSpecDefinitionId");
      return "Cannot build PhysicalFlowSpecDefinitionChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
