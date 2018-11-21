package com.khartec.waltz.model.tour;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link TourStep}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTourStep.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "TourStep"})
public final class ImmutableTourStep extends TourStep {
  private final String key;
  private final int id;
  private final String selector;
  private final String description;
  private final String position;

  private ImmutableTourStep(
      String key,
      int id,
      String selector,
      String description,
      String position) {
    this.key = key;
    this.id = id;
    this.selector = selector;
    this.description = description;
    this.position = position;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public int id() {
    return id;
  }

  /**
   * @return The value of the {@code selector} attribute
   */
  @JsonProperty("selector")
  @Override
  public String selector() {
    return selector;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public String position() {
    return position;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TourStep#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTourStep withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "key");
    return new ImmutableTourStep(newValue, this.id, this.selector, this.description, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TourStep#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTourStep withId(int value) {
    if (this.id == value) return this;
    return new ImmutableTourStep(this.key, value, this.selector, this.description, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TourStep#selector() selector} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for selector
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTourStep withSelector(String value) {
    if (this.selector.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "selector");
    return new ImmutableTourStep(this.key, this.id, newValue, this.description, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TourStep#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTourStep withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "description");
    return new ImmutableTourStep(this.key, this.id, this.selector, newValue, this.position);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TourStep#position() position} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTourStep withPosition(String value) {
    if (this.position.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "position");
    return new ImmutableTourStep(this.key, this.id, this.selector, this.description, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTourStep} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTourStep
        && equalTo((ImmutableTourStep) another);
  }

  private boolean equalTo(ImmutableTourStep another) {
    return key.equals(another.key)
        && id == another.id
        && selector.equals(another.selector)
        && description.equals(another.description)
        && position.equals(another.position);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code id}, {@code selector}, {@code description}, {@code position}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + id;
    h += (h << 5) + selector.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + position.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TourStep} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TourStep{"
        + "key=" + key
        + ", id=" + id
        + ", selector=" + selector
        + ", description=" + description
        + ", position=" + position
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TourStep {
    String key;
    int id;
    boolean idIsSet;
    String selector;
    String description;
    String position;
    @JsonProperty("key")
    public void setKey(String key) {
      this.key = key;
    }
    @JsonProperty("id")
    public void setId(int id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("selector")
    public void setSelector(String selector) {
      this.selector = selector;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
      this.description = description;
    }
    @JsonProperty("position")
    public void setPosition(String position) {
      this.position = position;
    }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
    @Override
    public int id() { throw new UnsupportedOperationException(); }
    @Override
    public String selector() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String position() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTourStep fromJson(Json json) {
    ImmutableTourStep.Builder builder = ImmutableTourStep.builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.selector != null) {
      builder.selector(json.selector);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.position != null) {
      builder.position(json.position);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TourStep} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TourStep instance
   */
  public static ImmutableTourStep copyOf(TourStep instance) {
    if (instance instanceof ImmutableTourStep) {
      return (ImmutableTourStep) instance;
    }
    return ImmutableTourStep.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTourStep ImmutableTourStep}.
   * @return A new ImmutableTourStep builder
   */
  public static ImmutableTourStep.Builder builder() {
    return new ImmutableTourStep.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTourStep ImmutableTourStep}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private static final long INIT_BIT_SELECTOR = 0x4L;
    private static final long INIT_BIT_DESCRIPTION = 0x8L;
    private static final long INIT_BIT_POSITION = 0x10L;
    private long initBits = 0x1fL;

    private String key;
    private int id;
    private String selector;
    private String description;
    private String position;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TourStep} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TourStep instance) {
      Objects.requireNonNull(instance, "instance");
      key(instance.key());
      id(instance.id());
      selector(instance.selector());
      description(instance.description());
      position(instance.position());
      return this;
    }

    /**
     * Initializes the value for the {@link TourStep#key() key} attribute.
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
     * Initializes the value for the {@link TourStep#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(int id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link TourStep#selector() selector} attribute.
     * @param selector The value for selector 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("selector")
    public final Builder selector(String selector) {
      this.selector = Objects.requireNonNull(selector, "selector");
      initBits &= ~INIT_BIT_SELECTOR;
      return this;
    }

    /**
     * Initializes the value for the {@link TourStep#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link TourStep#position() position} attribute.
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(String position) {
      this.position = Objects.requireNonNull(position, "position");
      initBits &= ~INIT_BIT_POSITION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTourStep ImmutableTourStep}.
     * @return An immutable instance of TourStep
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTourStep build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTourStep(key, id, selector, description, position);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_SELECTOR) != 0) attributes.add("selector");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      return "Cannot build TourStep, some of required attributes are not set " + attributes;
    }
  }
}
