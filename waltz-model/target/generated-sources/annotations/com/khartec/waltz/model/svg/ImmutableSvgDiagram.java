package com.khartec.waltz.model.svg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SvgDiagram}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSvgDiagram.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SvgDiagram"})
public final class ImmutableSvgDiagram extends SvgDiagram {
  private final String group;
  private final String svg;
  private final int priority;
  private final String keyProperty;
  private final String product;
  private final Long id;
  private final @Nullable String description;
  private final String name;

  private ImmutableSvgDiagram(ImmutableSvgDiagram.Builder builder) {
    this.group = builder.group;
    this.svg = builder.svg;
    this.priority = builder.priority;
    this.keyProperty = builder.keyProperty;
    this.id = builder.id;
    this.description = builder.description;
    this.name = builder.name;
    this.product = builder.product != null
        ? builder.product
        : Objects.requireNonNull(super.product(), "product");
  }

  private ImmutableSvgDiagram(
      String group,
      String svg,
      int priority,
      String keyProperty,
      String product,
      Long id,
      @Nullable String description,
      String name) {
    this.group = group;
    this.svg = svg;
    this.priority = priority;
    this.keyProperty = keyProperty;
    this.product = product;
    this.id = id;
    this.description = description;
    this.name = name;
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public String group() {
    return group;
  }

  /**
   * @return The value of the {@code svg} attribute
   */
  @JsonProperty("svg")
  @Override
  public String svg() {
    return svg;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public int priority() {
    return priority;
  }

  /**
   * @return The value of the {@code keyProperty} attribute
   */
  @JsonProperty("keyProperty")
  @Override
  public String keyProperty() {
    return keyProperty;
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @JsonProperty("product")
  @Override
  public String product() {
    return product;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
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
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#group() group} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for group
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withGroup(String value) {
    if (this.group.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "group");
    return new ImmutableSvgDiagram(
        newValue,
        this.svg,
        this.priority,
        this.keyProperty,
        this.product,
        this.id,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#svg() svg} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for svg
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withSvg(String value) {
    if (this.svg.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "svg");
    return new ImmutableSvgDiagram(
        this.group,
        newValue,
        this.priority,
        this.keyProperty,
        this.product,
        this.id,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#priority() priority} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for priority
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withPriority(int value) {
    if (this.priority == value) return this;
    return new ImmutableSvgDiagram(
        this.group,
        this.svg,
        value,
        this.keyProperty,
        this.product,
        this.id,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#keyProperty() keyProperty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for keyProperty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withKeyProperty(String value) {
    if (this.keyProperty.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "keyProperty");
    return new ImmutableSvgDiagram(
        this.group,
        this.svg,
        this.priority,
        newValue,
        this.product,
        this.id,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#product() product} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for product
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withProduct(String value) {
    if (this.product.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "product");
    return new ImmutableSvgDiagram(
        this.group,
        this.svg,
        this.priority,
        this.keyProperty,
        newValue,
        this.id,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SvgDiagram#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSvgDiagram withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSvgDiagram(
        this.group,
        this.svg,
        this.priority,
        this.keyProperty,
        this.product,
        newValue,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SvgDiagram#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSvgDiagram withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSvgDiagram(
        this.group,
        this.svg,
        this.priority,
        this.keyProperty,
        this.product,
        value,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSvgDiagram(this.group, this.svg, this.priority, this.keyProperty, this.product, this.id, value, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SvgDiagram#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSvgDiagram withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSvgDiagram(
        this.group,
        this.svg,
        this.priority,
        this.keyProperty,
        this.product,
        this.id,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSvgDiagram} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSvgDiagram
        && equalTo((ImmutableSvgDiagram) another);
  }

  private boolean equalTo(ImmutableSvgDiagram another) {
    return group.equals(another.group)
        && svg.equals(another.svg)
        && priority == another.priority
        && keyProperty.equals(another.keyProperty)
        && product.equals(another.product)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code group}, {@code svg}, {@code priority}, {@code keyProperty}, {@code product}, {@code id}, {@code description}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + group.hashCode();
    h += (h << 5) + svg.hashCode();
    h += (h << 5) + priority;
    h += (h << 5) + keyProperty.hashCode();
    h += (h << 5) + product.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SvgDiagram} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SvgDiagram{");
    builder.append("group=").append(group);
    builder.append(", ");
    builder.append("svg=").append(svg);
    builder.append(", ");
    builder.append("priority=").append(priority);
    builder.append(", ");
    builder.append("keyProperty=").append(keyProperty);
    builder.append(", ");
    builder.append("product=").append(product);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
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
  static final class Json extends SvgDiagram {
    String group;
    String svg;
    int priority;
    boolean priorityIsSet;
    String keyProperty;
    String product;
    Optional<Long> id = Optional.empty();
    String description;
    String name;
    @JsonProperty("group")
    public void setGroup(String group) {
      this.group = group;
    }
    @JsonProperty("svg")
    public void setSvg(String svg) {
      this.svg = svg;
    }
    @JsonProperty("priority")
    public void setPriority(int priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("keyProperty")
    public void setKeyProperty(String keyProperty) {
      this.keyProperty = keyProperty;
    }
    @JsonProperty("product")
    public void setProduct(String product) {
      this.product = product;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public String group() { throw new UnsupportedOperationException(); }
    @Override
    public String svg() { throw new UnsupportedOperationException(); }
    @Override
    public int priority() { throw new UnsupportedOperationException(); }
    @Override
    public String keyProperty() { throw new UnsupportedOperationException(); }
    @Override
    public String product() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
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
  static ImmutableSvgDiagram fromJson(Json json) {
    ImmutableSvgDiagram.Builder builder = ImmutableSvgDiagram.builder();
    if (json.group != null) {
      builder.group(json.group);
    }
    if (json.svg != null) {
      builder.svg(json.svg);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.keyProperty != null) {
      builder.keyProperty(json.keyProperty);
    }
    if (json.product != null) {
      builder.product(json.product);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SvgDiagram} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SvgDiagram instance
   */
  public static ImmutableSvgDiagram copyOf(SvgDiagram instance) {
    if (instance instanceof ImmutableSvgDiagram) {
      return (ImmutableSvgDiagram) instance;
    }
    return ImmutableSvgDiagram.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSvgDiagram ImmutableSvgDiagram}.
   * @return A new ImmutableSvgDiagram builder
   */
  public static ImmutableSvgDiagram.Builder builder() {
    return new ImmutableSvgDiagram.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSvgDiagram ImmutableSvgDiagram}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_GROUP = 0x1L;
    private static final long INIT_BIT_SVG = 0x2L;
    private static final long INIT_BIT_PRIORITY = 0x4L;
    private static final long INIT_BIT_KEY_PROPERTY = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private long initBits = 0x1fL;

    private String group;
    private String svg;
    private int priority;
    private String keyProperty;
    private String product;
    private Long id;
    private String description;
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.svg.SvgDiagram} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SvgDiagram instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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

    private void from(Object object) {
      if (object instanceof SvgDiagram) {
        SvgDiagram instance = (SvgDiagram) object;
        product(instance.product());
        priority(instance.priority());
        svg(instance.svg());
        keyProperty(instance.keyProperty());
        group(instance.group());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
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
    }

    /**
     * Initializes the value for the {@link SvgDiagram#group() group} attribute.
     * @param group The value for group 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("group")
    public final Builder group(String group) {
      this.group = Objects.requireNonNull(group, "group");
      initBits &= ~INIT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the value for the {@link SvgDiagram#svg() svg} attribute.
     * @param svg The value for svg 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("svg")
    public final Builder svg(String svg) {
      this.svg = Objects.requireNonNull(svg, "svg");
      initBits &= ~INIT_BIT_SVG;
      return this;
    }

    /**
     * Initializes the value for the {@link SvgDiagram#priority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(int priority) {
      this.priority = priority;
      initBits &= ~INIT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the value for the {@link SvgDiagram#keyProperty() keyProperty} attribute.
     * @param keyProperty The value for keyProperty 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("keyProperty")
    public final Builder keyProperty(String keyProperty) {
      this.keyProperty = Objects.requireNonNull(keyProperty, "keyProperty");
      initBits &= ~INIT_BIT_KEY_PROPERTY;
      return this;
    }

    /**
     * Initializes the value for the {@link SvgDiagram#product() product} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SvgDiagram#product() product}.</em>
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("product")
    public final Builder product(String product) {
      this.product = Objects.requireNonNull(product, "product");
      return this;
    }

    /**
     * Initializes the optional value {@link SvgDiagram#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SvgDiagram#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SvgDiagram#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link SvgDiagram#name() name} attribute.
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
     * Builds a new {@link ImmutableSvgDiagram ImmutableSvgDiagram}.
     * @return An immutable instance of SvgDiagram
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSvgDiagram build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSvgDiagram(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_GROUP) != 0) attributes.add("group");
      if ((initBits & INIT_BIT_SVG) != 0) attributes.add("svg");
      if ((initBits & INIT_BIT_PRIORITY) != 0) attributes.add("priority");
      if ((initBits & INIT_BIT_KEY_PROPERTY) != 0) attributes.add("keyProperty");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SvgDiagram, some of required attributes are not set " + attributes;
    }
  }
}
