package com.khartec.waltz.model.physical_specification_definition;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PhysicalSpecDefinitionSampleFile}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePhysicalSpecDefinitionSampleFile.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PhysicalSpecDefinitionSampleFile"})
public final class ImmutablePhysicalSpecDefinitionSampleFile
    extends PhysicalSpecDefinitionSampleFile {
  private final long specDefinitionId;
  private final String fileData;
  private final Long id;
  private final String name;

  private ImmutablePhysicalSpecDefinitionSampleFile(long specDefinitionId, String fileData, Long id, String name) {
    this.specDefinitionId = specDefinitionId;
    this.fileData = fileData;
    this.id = id;
    this.name = name;
  }

  /**
   * @return The value of the {@code specDefinitionId} attribute
   */
  @JsonProperty("specDefinitionId")
  @Override
  public long specDefinitionId() {
    return specDefinitionId;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionSampleFile#specDefinitionId() specDefinitionId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for specDefinitionId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFile withSpecDefinitionId(long value) {
    if (this.specDefinitionId == value) return this;
    return new ImmutablePhysicalSpecDefinitionSampleFile(value, this.fileData, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionSampleFile#fileData() fileData} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fileData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFile withFileData(String value) {
    if (this.fileData.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "fileData");
    return new ImmutablePhysicalSpecDefinitionSampleFile(this.specDefinitionId, newValue, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PhysicalSpecDefinitionSampleFile#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFile withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePhysicalSpecDefinitionSampleFile(this.specDefinitionId, this.fileData, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PhysicalSpecDefinitionSampleFile#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFile withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePhysicalSpecDefinitionSampleFile(this.specDefinitionId, this.fileData, value, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PhysicalSpecDefinitionSampleFile#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePhysicalSpecDefinitionSampleFile withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePhysicalSpecDefinitionSampleFile(this.specDefinitionId, this.fileData, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePhysicalSpecDefinitionSampleFile} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePhysicalSpecDefinitionSampleFile
        && equalTo((ImmutablePhysicalSpecDefinitionSampleFile) another);
  }

  private boolean equalTo(ImmutablePhysicalSpecDefinitionSampleFile another) {
    return specDefinitionId == another.specDefinitionId
        && fileData.equals(another.fileData)
        && Objects.equals(id, another.id)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code specDefinitionId}, {@code fileData}, {@code id}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(specDefinitionId);
    h += (h << 5) + fileData.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PhysicalSpecDefinitionSampleFile} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PhysicalSpecDefinitionSampleFile{");
    builder.append("specDefinitionId=").append(specDefinitionId);
    builder.append(", ");
    builder.append("fileData=").append(fileData);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      extends PhysicalSpecDefinitionSampleFile {
    long specDefinitionId;
    boolean specDefinitionIdIsSet;
    String fileData;
    Optional<Long> id = Optional.empty();
    String name;
    @JsonProperty("specDefinitionId")
    public void setSpecDefinitionId(long specDefinitionId) {
      this.specDefinitionId = specDefinitionId;
      this.specDefinitionIdIsSet = true;
    }
    @JsonProperty("fileData")
    public void setFileData(String fileData) {
      this.fileData = fileData;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public long specDefinitionId() { throw new UnsupportedOperationException(); }
    @Override
    public String fileData() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePhysicalSpecDefinitionSampleFile fromJson(Json json) {
    ImmutablePhysicalSpecDefinitionSampleFile.Builder builder = ImmutablePhysicalSpecDefinitionSampleFile.builder();
    if (json.specDefinitionIdIsSet) {
      builder.specDefinitionId(json.specDefinitionId);
    }
    if (json.fileData != null) {
      builder.fileData(json.fileData);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PhysicalSpecDefinitionSampleFile} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PhysicalSpecDefinitionSampleFile instance
   */
  public static ImmutablePhysicalSpecDefinitionSampleFile copyOf(PhysicalSpecDefinitionSampleFile instance) {
    if (instance instanceof ImmutablePhysicalSpecDefinitionSampleFile) {
      return (ImmutablePhysicalSpecDefinitionSampleFile) instance;
    }
    return ImmutablePhysicalSpecDefinitionSampleFile.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePhysicalSpecDefinitionSampleFile ImmutablePhysicalSpecDefinitionSampleFile}.
   * @return A new ImmutablePhysicalSpecDefinitionSampleFile builder
   */
  public static ImmutablePhysicalSpecDefinitionSampleFile.Builder builder() {
    return new ImmutablePhysicalSpecDefinitionSampleFile.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePhysicalSpecDefinitionSampleFile ImmutablePhysicalSpecDefinitionSampleFile}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SPEC_DEFINITION_ID = 0x1L;
    private static final long INIT_BIT_FILE_DATA = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private long specDefinitionId;
    private String fileData;
    private Long id;
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.NameProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NameProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.physical_specification_definition.PhysicalSpecDefinitionSampleFile} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PhysicalSpecDefinitionSampleFile instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof PhysicalSpecDefinitionSampleFile) {
        PhysicalSpecDefinitionSampleFile instance = (PhysicalSpecDefinitionSampleFile) object;
        specDefinitionId(instance.specDefinitionId());
        fileData(instance.fileData());
      }
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionSampleFile#specDefinitionId() specDefinitionId} attribute.
     * @param specDefinitionId The value for specDefinitionId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specDefinitionId")
    public final Builder specDefinitionId(long specDefinitionId) {
      this.specDefinitionId = specDefinitionId;
      initBits &= ~INIT_BIT_SPEC_DEFINITION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionSampleFile#fileData() fileData} attribute.
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
     * Initializes the optional value {@link PhysicalSpecDefinitionSampleFile#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PhysicalSpecDefinitionSampleFile#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link PhysicalSpecDefinitionSampleFile#name() name} attribute.
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
     * Builds a new {@link ImmutablePhysicalSpecDefinitionSampleFile ImmutablePhysicalSpecDefinitionSampleFile}.
     * @return An immutable instance of PhysicalSpecDefinitionSampleFile
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePhysicalSpecDefinitionSampleFile build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePhysicalSpecDefinitionSampleFile(specDefinitionId, fileData, id, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SPEC_DEFINITION_ID) != 0) attributes.add("specDefinitionId");
      if ((initBits & INIT_BIT_FILE_DATA) != 0) attributes.add("fileData");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PhysicalSpecDefinitionSampleFile, some of required attributes are not set " + attributes;
    }
  }
}
