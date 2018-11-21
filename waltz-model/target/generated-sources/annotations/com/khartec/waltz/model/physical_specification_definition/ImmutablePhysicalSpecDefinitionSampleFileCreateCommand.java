package com.khartec.waltz.model.physical_specification_definition;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecDefinitionSampleFileCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecDefinitionSampleFileCreateCommand"})
public final class ImmutablePhysicalSpecDefinitionSampleFileCreateCommand
    extends PhysicalSpecDefinitionSampleFileCreateCommand {
  private final String name;
  private final String fileData;

  private ImmutablePhysicalSpecDefinitionSampleFileCreateCommand(String name, String fileData) {
    this.name = name;
    this.fileData = fileData;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code fileData} attribute
   */
  @JsonProperty("fileData")
  @Override
  public String fileData() {
    return fileData;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionSampleFileCreateCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFileCreateCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand(newValue, this.fileData);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionSampleFileCreateCommand#fileData() fileData} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fileData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFileCreateCommand withFileData(String value) {
    if (this.fileData.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "fileData");
    return new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecDefinitionSampleFileCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecDefinitionSampleFileCreateCommand
        && equalTo((ImmutablePhysicalSpecDefinitionSampleFileCreateCommand) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecDefinitionSampleFileCreateCommand another) {
    return name.equals(another.name)
        && fileData.equals(another.fileData);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code fileData}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + fileData.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecDefinitionSampleFileCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PhysicalSpecDefinitionSampleFileCreateCommand{"
        + "name=" + name
        + ", fileData=" + fileData
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
      extends PhysicalSpecDefinitionSampleFileCreateCommand {
    String name;
    String fileData;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("fileData")
    public void setFileData(String fileData) {
      this.fileData = fileData;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String fileData() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalSpecDefinitionSampleFileCreateCommand fromJson(Json json) {
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Builder builder = ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.fileData != null) {
      builder.fileData(json.fileData);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecDefinitionSampleFileCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecDefinitionSampleFileCreateCommand instance
   */
  public static ImmutablePhysicalSpecDefinitionSampleFileCreateCommand copyOf(PhysicalSpecDefinitionSampleFileCreateCommand instance) {
    if (instance instanceof ImmutablePhysicalSpecDefinitionSampleFileCreateCommand) {
      return (ImmutablePhysicalSpecDefinitionSampleFileCreateCommand) instance;
    }
    return ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecDefinitionSampleFileCreateCommand ImmutablePhysicalSpecDefinitionSampleFileCreateCommand}.
   * @return A new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand builder
   */
  public static ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Builder builder() {
    return new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecDefinitionSampleFileCreateCommand ImmutablePhysicalSpecDefinitionSampleFileCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_FILE_DATA = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private String fileData;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PhysicalSpecDefinitionSampleFileCreateCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecDefinitionSampleFileCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      fileData(instance.fileData());
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionSampleFileCreateCommand#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionSampleFileCreateCommand#fileData() fileData} attribute.
     * @param fileData The value for fileData 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fileData")
    public final Builder fileData(String fileData) {
      this.fileData = Objects.requireNonNull(fileData, "fileData");
      initBits &= ~INIT_BIT_FILE_DATA;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePhysicalSpecDefinitionSampleFileCreateCommand ImmutablePhysicalSpecDefinitionSampleFileCreateCommand}.
     * @return An immutable instance of PhysicalSpecDefinitionSampleFileCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecDefinitionSampleFileCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand(name, fileData);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_FILE_DATA) != 0) attributes.add("fileData");
      return "Cannot build PhysicalSpecDefinitionSampleFileCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
