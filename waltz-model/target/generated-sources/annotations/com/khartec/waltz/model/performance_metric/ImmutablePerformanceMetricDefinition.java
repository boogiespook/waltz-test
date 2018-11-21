package com.khartec.waltz.model.performance_metric;

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
 * Immutable implementation of {@link PerformanceMetricDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerformanceMetricDefinition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PerformanceMetricDefinition"})
public final class ImmutablePerformanceMetricDefinition
    extends PerformanceMetricDefinition {
  private final String categoryName;
  private final String categoryDescription;
  private final String name;
  private final @Nullable String description;
  private final Long id;

  private ImmutablePerformanceMetricDefinition(
      String categoryName,
      String categoryDescription,
      String name,
      @Nullable String description,
      Long id) {
    this.categoryName = categoryName;
    this.categoryDescription = categoryDescription;
    this.name = name;
    this.description = description;
    this.id = id;
  }

  /**
   * @return The value of the {@code categoryName} attribute
   */
  @JsonProperty("categoryName")
  @Override
  public String categoryName() {
    return categoryName;
  }

  /**
   * @return The value of the {@code categoryDescription} attribute
   */
  @JsonProperty("categoryDescription")
  @Override
  public String categoryDescription() {
    return categoryDescription;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
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
   * Copy the current immutable object by setting a value for the {@link PerformanceMetricDefinition#categoryName() categoryName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for categoryName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerformanceMetricDefinition withCategoryName(String value) {
    if (this.categoryName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "categoryName");
    return new ImmutablePerformanceMetricDefinition(newValue, this.categoryDescription, this.name, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerformanceMetricDefinition#categoryDescription() categoryDescription} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for categoryDescription
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerformanceMetricDefinition withCategoryDescription(String value) {
    if (this.categoryDescription.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "categoryDescription");
    return new ImmutablePerformanceMetricDefinition(this.categoryName, newValue, this.name, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerformanceMetricDefinition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerformanceMetricDefinition withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePerformanceMetricDefinition(this.categoryName, this.categoryDescription, newValue, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerformanceMetricDefinition#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerformanceMetricDefinition withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePerformanceMetricDefinition(this.categoryName, this.categoryDescription, this.name, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PerformanceMetricDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerformanceMetricDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePerformanceMetricDefinition(this.categoryName, this.categoryDescription, this.name, this.description, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PerformanceMetricDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerformanceMetricDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePerformanceMetricDefinition(this.categoryName, this.categoryDescription, this.name, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerformanceMetricDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerformanceMetricDefinition
        && equalTo((ImmutablePerformanceMetricDefinition) another);
  }

  private boolean equalTo(ImmutablePerformanceMetricDefinition another) {
    return categoryName.equals(another.categoryName)
        && categoryDescription.equals(another.categoryDescription)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code categoryName}, {@code categoryDescription}, {@code name}, {@code description}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + categoryName.hashCode();
    h += (h << 5) + categoryDescription.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code PerformanceMetricDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PerformanceMetricDefinition{");
    builder.append("categoryName=").append(categoryName);
    builder.append(", ");
    builder.append("categoryDescription=").append(categoryDescription);
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  static final class Json extends PerformanceMetricDefinition {
    String categoryName;
    String categoryDescription;
    String name;
    String description;
    Optional<Long> id = Optional.empty();
    @JsonProperty("categoryName")
    public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
    }
    @JsonProperty("categoryDescription")
    public void setCategoryDescription(String categoryDescription) {
      this.categoryDescription = categoryDescription;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public String categoryName() { throw new UnsupportedOperationException(); }
    @Override
    public String categoryDescription() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePerformanceMetricDefinition fromJson(Json json) {
    ImmutablePerformanceMetricDefinition.Builder builder = ImmutablePerformanceMetricDefinition.builder();
    if (json.categoryName != null) {
      builder.categoryName(json.categoryName);
    }
    if (json.categoryDescription != null) {
      builder.categoryDescription(json.categoryDescription);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PerformanceMetricDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PerformanceMetricDefinition instance
   */
  public static ImmutablePerformanceMetricDefinition copyOf(PerformanceMetricDefinition instance) {
    if (instance instanceof ImmutablePerformanceMetricDefinition) {
      return (ImmutablePerformanceMetricDefinition) instance;
    }
    return ImmutablePerformanceMetricDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerformanceMetricDefinition ImmutablePerformanceMetricDefinition}.
   * @return A new ImmutablePerformanceMetricDefinition builder
   */
  public static ImmutablePerformanceMetricDefinition.Builder builder() {
    return new ImmutablePerformanceMetricDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerformanceMetricDefinition ImmutablePerformanceMetricDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CATEGORY_NAME = 0x1L;
    private static final long INIT_BIT_CATEGORY_DESCRIPTION = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private String categoryName;
    private String categoryDescription;
    private String name;
    private String description;
    private Long id;

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.performance_metric.PerformanceMetricDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PerformanceMetricDefinition instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
      if (object instanceof PerformanceMetricDefinition) {
        PerformanceMetricDefinition instance = (PerformanceMetricDefinition) object;
        categoryName(instance.categoryName());
        categoryDescription(instance.categoryDescription());
      }
    }

    /**
     * Initializes the value for the {@link PerformanceMetricDefinition#categoryName() categoryName} attribute.
     * @param categoryName The value for categoryName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("categoryName")
    public final Builder categoryName(String categoryName) {
      this.categoryName = Objects.requireNonNull(categoryName, "categoryName");
      initBits &= ~INIT_BIT_CATEGORY_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PerformanceMetricDefinition#categoryDescription() categoryDescription} attribute.
     * @param categoryDescription The value for categoryDescription 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("categoryDescription")
    public final Builder categoryDescription(String categoryDescription) {
      this.categoryDescription = Objects.requireNonNull(categoryDescription, "categoryDescription");
      initBits &= ~INIT_BIT_CATEGORY_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link PerformanceMetricDefinition#name() name} attribute.
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
     * Initializes the value for the {@link PerformanceMetricDefinition#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link PerformanceMetricDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link PerformanceMetricDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerformanceMetricDefinition ImmutablePerformanceMetricDefinition}.
     * @return An immutable instance of PerformanceMetricDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerformanceMetricDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerformanceMetricDefinition(categoryName, categoryDescription, name, description, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CATEGORY_NAME) != 0) attributes.add("categoryName");
      if ((initBits & INIT_BIT_CATEGORY_DESCRIPTION) != 0) attributes.add("categoryDescription");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PerformanceMetricDefinition, some of required attributes are not set " + attributes;
    }
  }
}
