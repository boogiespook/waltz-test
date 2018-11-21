package com.khartec.waltz.model.checkpoint;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.Quarter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Checkpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCheckpoint.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Checkpoint"})
public final class ImmutableCheckpoint extends Checkpoint {
  private final int year;
  private final Quarter quarter;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableCheckpoint(
      int year,
      Quarter quarter,
      Long id,
      String name,
      @Nullable String description) {
    this.year = year;
    this.quarter = quarter;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code year} attribute
   */
  @JsonProperty("year")
  @Override
  public int year() {
    return year;
  }

  /**
   * @return The value of the {@code quarter} attribute
   */
  @JsonProperty("quarter")
  @Override
  public Quarter quarter() {
    return quarter;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#year() year} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for year
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withYear(int value) {
    if (this.year == value) return this;
    return new ImmutableCheckpoint(value, this.quarter, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#quarter() quarter} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quarter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withQuarter(Quarter value) {
    if (this.quarter == value) return this;
    Quarter newValue = Objects.requireNonNull(value, "quarter");
    return new ImmutableCheckpoint(this.year, newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Checkpoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCheckpoint withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCheckpoint(this.year, this.quarter, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Checkpoint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCheckpoint withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCheckpoint(this.year, this.quarter, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableCheckpoint(this.year, this.quarter, this.id, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Checkpoint#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCheckpoint withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableCheckpoint(this.year, this.quarter, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCheckpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCheckpoint
        && equalTo((ImmutableCheckpoint) another);
  }

  private boolean equalTo(ImmutableCheckpoint another) {
    return year == another.year
        && quarter.equals(another.quarter)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code year}, {@code quarter}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + year;
    h += (h << 5) + quarter.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code Checkpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Checkpoint{");
    builder.append("year=").append(year);
    builder.append(", ");
    builder.append("quarter=").append(quarter);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
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
  static final class Json extends Checkpoint {
    int year;
    boolean yearIsSet;
    Quarter quarter;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("year")
    public void setYear(int year) {
      this.year = year;
      this.yearIsSet = true;
    }
    @JsonProperty("quarter")
    public void setQuarter(Quarter quarter) {
      this.quarter = quarter;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public int year() { throw new UnsupportedOperationException(); }
    @Override
    public Quarter quarter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCheckpoint fromJson(Json json) {
    ImmutableCheckpoint.Builder builder = ImmutableCheckpoint.builder();
    if (json.yearIsSet) {
      builder.year(json.year);
    }
    if (json.quarter != null) {
      builder.quarter(json.quarter);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Checkpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Checkpoint instance
   */
  public static ImmutableCheckpoint copyOf(Checkpoint instance) {
    if (instance instanceof ImmutableCheckpoint) {
      return (ImmutableCheckpoint) instance;
    }
    return ImmutableCheckpoint.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCheckpoint ImmutableCheckpoint}.
   * @return A new ImmutableCheckpoint builder
   */
  public static ImmutableCheckpoint.Builder builder() {
    return new ImmutableCheckpoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCheckpoint ImmutableCheckpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_YEAR = 0x1L;
    private static final long INIT_BIT_QUARTER = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private int year;
    private Quarter quarter;
    private Long id;
    private String name;
    private String description;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.checkpoint.Checkpoint} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Checkpoint instance) {
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
      if (object instanceof Checkpoint) {
        Checkpoint instance = (Checkpoint) object;
        year(instance.year());
        quarter(instance.quarter());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link Checkpoint#year() year} attribute.
     * @param year The value for year 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("year")
    public final Builder year(int year) {
      this.year = year;
      initBits &= ~INIT_BIT_YEAR;
      return this;
    }

    /**
     * Initializes the value for the {@link Checkpoint#quarter() quarter} attribute.
     * @param quarter The value for quarter 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quarter")
    public final Builder quarter(Quarter quarter) {
      this.quarter = Objects.requireNonNull(quarter, "quarter");
      initBits &= ~INIT_BIT_QUARTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Checkpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Checkpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Checkpoint#name() name} attribute.
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
     * Initializes the value for the {@link Checkpoint#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCheckpoint ImmutableCheckpoint}.
     * @return An immutable instance of Checkpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCheckpoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCheckpoint(year, quarter, id, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_YEAR) != 0) attributes.add("year");
      if ((initBits & INIT_BIT_QUARTER) != 0) attributes.add("quarter");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build Checkpoint, some of required attributes are not set " + attributes;
    }
  }
}
