package com.khartec.waltz.model.drill_grid;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link DrillGridDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDrillGridDefinition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DrillGridDefinition"})
public final class ImmutableDrillGridDefinition extends DrillGridDefinition {
  private final EntityReference xAxis;
  private final EntityReference yAxis;
  private final String name;
  private final @Nullable String description;
  private final Long id;

  private ImmutableDrillGridDefinition(
      EntityReference xAxis,
      EntityReference yAxis,
      String name,
      @Nullable String description,
      Long id) {
    this.xAxis = xAxis;
    this.yAxis = yAxis;
    this.name = name;
    this.description = description;
    this.id = id;
  }

  /**
   * @return The value of the {@code xAxis} attribute
   */
  @JsonProperty("xAxis")
  @Override
  public EntityReference xAxis() {
    return xAxis;
  }

  /**
   * @return The value of the {@code yAxis} attribute
   */
  @JsonProperty("yAxis")
  @Override
  public EntityReference yAxis() {
    return yAxis;
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
   * Copy the current immutable object by setting a value for the {@link DrillGridDefinition#xAxis() xAxis} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for xAxis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDrillGridDefinition withXAxis(EntityReference value) {
    if (this.xAxis == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "xAxis");
    return new ImmutableDrillGridDefinition(newValue, this.yAxis, this.name, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DrillGridDefinition#yAxis() yAxis} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for yAxis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDrillGridDefinition withYAxis(EntityReference value) {
    if (this.yAxis == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "yAxis");
    return new ImmutableDrillGridDefinition(this.xAxis, newValue, this.name, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DrillGridDefinition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDrillGridDefinition withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableDrillGridDefinition(this.xAxis, this.yAxis, newValue, this.description, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DrillGridDefinition#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDrillGridDefinition withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableDrillGridDefinition(this.xAxis, this.yAxis, this.name, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DrillGridDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDrillGridDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDrillGridDefinition(this.xAxis, this.yAxis, this.name, this.description, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DrillGridDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDrillGridDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDrillGridDefinition(this.xAxis, this.yAxis, this.name, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDrillGridDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDrillGridDefinition
        && equalTo((ImmutableDrillGridDefinition) another);
  }

  private boolean equalTo(ImmutableDrillGridDefinition another) {
    return xAxis.equals(another.xAxis)
        && yAxis.equals(another.yAxis)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code xAxis}, {@code yAxis}, {@code name}, {@code description}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + xAxis.hashCode();
    h += (h << 5) + yAxis.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code DrillGridDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DrillGridDefinition{");
    builder.append("xAxis=").append(xAxis);
    builder.append(", ");
    builder.append("yAxis=").append(yAxis);
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
  static final class Json extends DrillGridDefinition {
    EntityReference xAxis;
    EntityReference yAxis;
    String name;
    String description;
    Optional<Long> id = Optional.empty();
    @JsonProperty("xAxis")
    public void setXAxis(EntityReference xAxis) {
      this.xAxis = xAxis;
    }
    @JsonProperty("yAxis")
    public void setYAxis(EntityReference yAxis) {
      this.yAxis = yAxis;
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
    public EntityReference xAxis() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference yAxis() { throw new UnsupportedOperationException(); }
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
  static ImmutableDrillGridDefinition fromJson(Json json) {
    ImmutableDrillGridDefinition.Builder builder = ImmutableDrillGridDefinition.builder();
    if (json.xAxis != null) {
      builder.xAxis(json.xAxis);
    }
    if (json.yAxis != null) {
      builder.yAxis(json.yAxis);
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
   * Creates an immutable copy of a {@link DrillGridDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DrillGridDefinition instance
   */
  public static ImmutableDrillGridDefinition copyOf(DrillGridDefinition instance) {
    if (instance instanceof ImmutableDrillGridDefinition) {
      return (ImmutableDrillGridDefinition) instance;
    }
    return ImmutableDrillGridDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDrillGridDefinition ImmutableDrillGridDefinition}.
   * @return A new ImmutableDrillGridDefinition builder
   */
  public static ImmutableDrillGridDefinition.Builder builder() {
    return new ImmutableDrillGridDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDrillGridDefinition ImmutableDrillGridDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_X_AXIS = 0x1L;
    private static final long INIT_BIT_Y_AXIS = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private EntityReference xAxis;
    private EntityReference yAxis;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.drill_grid.DrillGridDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DrillGridDefinition instance) {
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
      if (object instanceof DrillGridDefinition) {
        DrillGridDefinition instance = (DrillGridDefinition) object;
        yAxis(instance.yAxis());
        xAxis(instance.xAxis());
      }
    }

    /**
     * Initializes the value for the {@link DrillGridDefinition#xAxis() xAxis} attribute.
     * @param xAxis The value for xAxis 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("xAxis")
    public final Builder xAxis(EntityReference xAxis) {
      this.xAxis = Objects.requireNonNull(xAxis, "xAxis");
      initBits &= ~INIT_BIT_X_AXIS;
      return this;
    }

    /**
     * Initializes the value for the {@link DrillGridDefinition#yAxis() yAxis} attribute.
     * @param yAxis The value for yAxis 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("yAxis")
    public final Builder yAxis(EntityReference yAxis) {
      this.yAxis = Objects.requireNonNull(yAxis, "yAxis");
      initBits &= ~INIT_BIT_Y_AXIS;
      return this;
    }

    /**
     * Initializes the value for the {@link DrillGridDefinition#name() name} attribute.
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
     * Initializes the value for the {@link DrillGridDefinition#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link DrillGridDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link DrillGridDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDrillGridDefinition ImmutableDrillGridDefinition}.
     * @return An immutable instance of DrillGridDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDrillGridDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDrillGridDefinition(xAxis, yAxis, name, description, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_X_AXIS) != 0) attributes.add("xAxis");
      if ((initBits & INIT_BIT_Y_AXIS) != 0) attributes.add("yAxis");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build DrillGridDefinition, some of required attributes are not set " + attributes;
    }
  }
}
