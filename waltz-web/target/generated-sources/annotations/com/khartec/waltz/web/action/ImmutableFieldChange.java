package com.khartec.waltz.web.action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link FieldChange}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFieldChange.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FieldChange"})
@Deprecated
public final class ImmutableFieldChange extends FieldChange {
  private final String name;
  private final String key;
  private final boolean dirty;
  private final String original;
  private final String current;

  private ImmutableFieldChange(
      String name,
      String key,
      boolean dirty,
      String original,
      String current) {
    this.name = name;
    this.key = key;
    this.dirty = dirty;
    this.original = original;
    this.current = current;
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
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public String key() {
    return key;
  }

  /**
   * @return The value of the {@code dirty} attribute
   */
  @JsonProperty("dirty")
  @Override
  public boolean dirty() {
    return dirty;
  }

  /**
   * @return The value of the {@code original} attribute
   */
  @JsonProperty("original")
  @Override
  public Optional<String> original() {
    return Optional.ofNullable(original);
  }

  /**
   * @return The value of the {@code current} attribute
   */
  @JsonProperty("current")
  @Override
  public Optional<String> current() {
    return Optional.ofNullable(current);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FieldChange#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFieldChange withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableFieldChange(newValue, this.key, this.dirty, this.original, this.current);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FieldChange#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFieldChange withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "key");
    return new ImmutableFieldChange(this.name, newValue, this.dirty, this.original, this.current);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FieldChange#dirty() dirty} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dirty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFieldChange withDirty(boolean value) {
    if (this.dirty == value) return this;
    return new ImmutableFieldChange(this.name, this.key, value, this.original, this.current);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FieldChange#original() original} attribute.
   * @param value The value for original
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFieldChange withOriginal(String value) {
    String newValue = Objects.requireNonNull(value, "original");
    if (Objects.equals(this.original, newValue)) return this;
    return new ImmutableFieldChange(this.name, this.key, this.dirty, newValue, this.current);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FieldChange#original() original} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for original
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFieldChange withOriginal(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.original, value)) return this;
    return new ImmutableFieldChange(this.name, this.key, this.dirty, value, this.current);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FieldChange#current() current} attribute.
   * @param value The value for current
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFieldChange withCurrent(String value) {
    String newValue = Objects.requireNonNull(value, "current");
    if (Objects.equals(this.current, newValue)) return this;
    return new ImmutableFieldChange(this.name, this.key, this.dirty, this.original, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FieldChange#current() current} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for current
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFieldChange withCurrent(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.current, value)) return this;
    return new ImmutableFieldChange(this.name, this.key, this.dirty, this.original, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFieldChange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFieldChange
        && equalTo((ImmutableFieldChange) another);
  }

  private boolean equalTo(ImmutableFieldChange another) {
    return name.equals(another.name)
        && key.equals(another.key)
        && dirty == another.dirty
        && Objects.equals(original, another.original)
        && Objects.equals(current, another.current);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code key}, {@code dirty}, {@code original}, {@code current}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + key.hashCode();
    h += (h << 5) + Boolean.hashCode(dirty);
    h += (h << 5) + Objects.hashCode(original);
    h += (h << 5) + Objects.hashCode(current);
    return h;
  }

  /**
   * Prints the immutable value {@code FieldChange} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("FieldChange{");
    builder.append("name=").append(name);
    builder.append(", ");
    builder.append("key=").append(key);
    builder.append(", ");
    builder.append("dirty=").append(dirty);
    if (original != null) {
      builder.append(", ");
      builder.append("original=").append(original);
    }
    if (current != null) {
      builder.append(", ");
      builder.append("current=").append(current);
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
  static final class Json extends FieldChange {
    String name;
    String key;
    boolean dirty;
    boolean dirtyIsSet;
    Optional<String> original = Optional.empty();
    Optional<String> current = Optional.empty();
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("key")
    public void setKey(String key) {
      this.key = key;
    }
    @JsonProperty("dirty")
    public void setDirty(boolean dirty) {
      this.dirty = dirty;
      this.dirtyIsSet = true;
    }
    @JsonProperty("original")
    public void setOriginal(Optional<String> original) {
      this.original = original;
    }
    @JsonProperty("current")
    public void setCurrent(Optional<String> current) {
      this.current = current;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
    @Override
    public boolean dirty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> original() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> current() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFieldChange fromJson(Json json) {
    ImmutableFieldChange.Builder builder = ImmutableFieldChange.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.dirtyIsSet) {
      builder.dirty(json.dirty);
    }
    if (json.original != null) {
      builder.original(json.original);
    }
    if (json.current != null) {
      builder.current(json.current);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FieldChange} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FieldChange instance
   */
  public static ImmutableFieldChange copyOf(FieldChange instance) {
    if (instance instanceof ImmutableFieldChange) {
      return (ImmutableFieldChange) instance;
    }
    return ImmutableFieldChange.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFieldChange ImmutableFieldChange}.
   * @return A new ImmutableFieldChange builder
   */
  public static ImmutableFieldChange.Builder builder() {
    return new ImmutableFieldChange.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFieldChange ImmutableFieldChange}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_KEY = 0x2L;
    private static final long INIT_BIT_DIRTY = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private String key;
    private boolean dirty;
    private String original;
    private String current;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FieldChange} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FieldChange instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      key(instance.key());
      dirty(instance.dirty());
      Optional<String> originalOptional = instance.original();
      if (originalOptional.isPresent()) {
        original(originalOptional);
      }
      Optional<String> currentOptional = instance.current();
      if (currentOptional.isPresent()) {
        current(currentOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link FieldChange#name() name} attribute.
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
     * Initializes the value for the {@link FieldChange#key() key} attribute.
     * @param key The value for key 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("key")
    public final Builder key(String key) {
      this.key = Objects.requireNonNull(key, "key");
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link FieldChange#dirty() dirty} attribute.
     * @param dirty The value for dirty 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dirty")
    public final Builder dirty(boolean dirty) {
      this.dirty = dirty;
      initBits &= ~INIT_BIT_DIRTY;
      return this;
    }

    /**
     * Initializes the optional value {@link FieldChange#original() original} to original.
     * @param original The value for original
     * @return {@code this} builder for chained invocation
     */
    public final Builder original(String original) {
      this.original = Objects.requireNonNull(original, "original");
      return this;
    }

    /**
     * Initializes the optional value {@link FieldChange#original() original} to original.
     * @param original The value for original
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("original")
    public final Builder original(Optional<String> original) {
      this.original = original.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link FieldChange#current() current} to current.
     * @param current The value for current
     * @return {@code this} builder for chained invocation
     */
    public final Builder current(String current) {
      this.current = Objects.requireNonNull(current, "current");
      return this;
    }

    /**
     * Initializes the optional value {@link FieldChange#current() current} to current.
     * @param current The value for current
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("current")
    public final Builder current(Optional<String> current) {
      this.current = current.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableFieldChange ImmutableFieldChange}.
     * @return An immutable instance of FieldChange
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFieldChange build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFieldChange(name, key, dirty, original, current);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_DIRTY) != 0) attributes.add("dirty");
      return "Cannot build FieldChange, some of required attributes are not set " + attributes;
    }
  }
}
