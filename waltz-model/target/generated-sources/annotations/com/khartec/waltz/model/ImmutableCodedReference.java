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
 * Immutable implementation of {@link CodedReference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodedReference.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "CodedReference"})
public final class ImmutableCodedReference extends CodedReference {
  private final String code;
  private final String name;

  private ImmutableCodedReference(String code, String name) {
    this.code = code;
    this.name = name;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public String code() {
    return code;
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
   * Copy the current immutable object by setting a value for the {@link CodedReference#code() code} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCodedReference withCode(String value) {
    if (this.code.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "code");
    return new ImmutableCodedReference(newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CodedReference#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCodedReference withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableCodedReference(this.code, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodedReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodedReference
        && equalTo((ImmutableCodedReference) another);
  }

  private boolean equalTo(ImmutableCodedReference another) {
    return code.equals(another.code)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + code.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CodedReference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CodedReference{"
        + "code=" + code
        + ", name=" + name
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends CodedReference {
    String code;
    String name;
    @JsonProperty("code")
    public void setCode(String code) {
      this.code = code;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public String code() { throw new UnsupportedOperationException(); }
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
  static ImmutableCodedReference fromJson(Json json) {
    ImmutableCodedReference.Builder builder = ImmutableCodedReference.builder();
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodedReference} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodedReference instance
   */
  public static ImmutableCodedReference copyOf(CodedReference instance) {
    if (instance instanceof ImmutableCodedReference) {
      return (ImmutableCodedReference) instance;
    }
    return ImmutableCodedReference.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCodedReference ImmutableCodedReference}.
   * @return A new ImmutableCodedReference builder
   */
  public static ImmutableCodedReference.Builder builder() {
    return new ImmutableCodedReference.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCodedReference ImmutableCodedReference}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private String code;
    private String name;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.CodeProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CodeProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.CodedReference} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CodedReference instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof CodeProvider) {
        CodeProvider instance = (CodeProvider) object;
        code(instance.code());
      }
    }

    /**
     * Initializes the value for the {@link CodedReference#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(String code) {
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link CodedReference#name() name} attribute.
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
     * Builds a new {@link ImmutableCodedReference ImmutableCodedReference}.
     * @return An immutable instance of CodedReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCodedReference build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCodedReference(code, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CODE) != 0) attributes.add("code");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build CodedReference, some of required attributes are not set " + attributes;
    }
  }
}
