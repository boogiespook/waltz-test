package com.khartec.waltz.model.command;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Nullable;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link FieldChange}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFieldChange.<T>builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FieldChange<T>"})
public final class ImmutableFieldChange<T> extends FieldChange<T> {
  private final @Nullable T newVal;
  private final @Nullable T oldVal;
  private final @Nullable String description;

  private ImmutableFieldChange(
      @Nullable T newVal,
      @Nullable T oldVal,
      @Nullable String description) {
    this.newVal = newVal;
    this.oldVal = oldVal;
    this.description = description;
  }

  /**
   * @return The value of the {@code newVal} attribute
   */
  @JsonProperty("newVal")
  @Override
  public @Nullable T newVal() {
    return newVal;
  }

  /**
   * @return The value of the {@code oldVal} attribute
   */
  @JsonProperty("oldVal")
  @Override
  public @Nullable T oldVal() {
    return oldVal;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FieldChange#newVal() newVal} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newVal (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFieldChange<T> withNewVal(@Nullable T value) {
    if (this.newVal == value) return this;
    return new ImmutableFieldChange<T>(value, this.oldVal, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FieldChange#oldVal() oldVal} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for oldVal (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFieldChange<T> withOldVal(@Nullable T value) {
    if (this.oldVal == value) return this;
    return new ImmutableFieldChange<T>(this.newVal, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FieldChange#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFieldChange<T> withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableFieldChange<T>(this.newVal, this.oldVal, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFieldChange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFieldChange<?>
        && equalTo((ImmutableFieldChange<T>) another);
  }

  private boolean equalTo(ImmutableFieldChange<T> another) {
    return Objects.equals(newVal, another.newVal)
        && Objects.equals(oldVal, another.oldVal)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code newVal}, {@code oldVal}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(newVal);
    h += (h << 5) + Objects.hashCode(oldVal);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code FieldChange} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "FieldChange{"
        + "newVal=" + newVal
        + ", oldVal=" + oldVal
        + ", description=" + description
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json<T> extends FieldChange<T> {
    T newVal;
    T oldVal;
    String description;
    @JsonProperty("newVal")
    public void setNewVal(@Nullable T newVal) {
      this.newVal = newVal;
    }
    @JsonProperty("oldVal")
    public void setOldVal(@Nullable T oldVal) {
      this.oldVal = oldVal;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public T newVal() { throw new UnsupportedOperationException(); }
    @Override
    public T oldVal() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param <T> generic parameter T
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static <T> ImmutableFieldChange<T> fromJson(Json<T> json) {
    ImmutableFieldChange.Builder<T> builder = ImmutableFieldChange.<T>builder();
    if (json.newVal != null) {
      builder.newVal(json.newVal);
    }
    if (json.oldVal != null) {
      builder.oldVal(json.oldVal);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FieldChange} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param <T> generic parameter T
   * @param instance The instance to copy
   * @return A copied immutable FieldChange instance
   */
  public static <T> ImmutableFieldChange<T> copyOf(FieldChange<T> instance) {
    if (instance instanceof ImmutableFieldChange<?>) {
      return (ImmutableFieldChange<T>) instance;
    }
    return ImmutableFieldChange.<T>builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFieldChange ImmutableFieldChange}.
   * @param <T> generic parameter T
   * @return A new ImmutableFieldChange builder
   */
  public static <T> ImmutableFieldChange.Builder<T> builder() {
    return new ImmutableFieldChange.Builder<T>();
  }

  /**
   * Builds instances of type {@link ImmutableFieldChange ImmutableFieldChange}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder<T> {
    private T newVal;
    private T oldVal;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FieldChange} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder<T> from(FieldChange<T> instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable T newValValue = instance.newVal();
      if (newValValue != null) {
        newVal(newValValue);
      }
      @Nullable T oldValValue = instance.oldVal();
      if (oldValValue != null) {
        oldVal(oldValValue);
      }
      @Nullable String descriptionValue = instance.description();
      if (descriptionValue != null) {
        description(descriptionValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link FieldChange#newVal() newVal} attribute.
     * @param newVal The value for newVal (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newVal")
    public final Builder<T> newVal(@Nullable T newVal) {
      this.newVal = newVal;
      return this;
    }

    /**
     * Initializes the value for the {@link FieldChange#oldVal() oldVal} attribute.
     * @param oldVal The value for oldVal (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("oldVal")
    public final Builder<T> oldVal(@Nullable T oldVal) {
      this.oldVal = oldVal;
      return this;
    }

    /**
     * Initializes the value for the {@link FieldChange#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder<T> description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFieldChange ImmutableFieldChange}.
     * @return An immutable instance of FieldChange
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFieldChange<T> build() {
      return new ImmutableFieldChange<T>(newVal, oldVal, description);
    }
  }
}
