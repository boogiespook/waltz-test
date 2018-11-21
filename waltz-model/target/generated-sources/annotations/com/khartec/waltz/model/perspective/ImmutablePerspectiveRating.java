package com.khartec.waltz.model.perspective;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link PerspectiveRating}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerspectiveRating.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PerspectiveRating"})
public final class ImmutablePerspectiveRating extends PerspectiveRating {
  private final EntityReference entityReference;
  private final PerspectiveRatingValue value;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutablePerspectiveRating(ImmutablePerspectiveRating.Builder builder) {
    this.entityReference = builder.entityReference;
    this.value = builder.value;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.lastUpdatedAt = builder.lastUpdatedAt != null
        ? builder.lastUpdatedAt
        : Objects.requireNonNull(super.lastUpdatedAt(), "lastUpdatedAt");
  }

  private ImmutablePerspectiveRating(
      EntityReference entityReference,
      PerspectiveRatingValue value,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.entityReference = entityReference;
    this.value = value;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public PerspectiveRatingValue value() {
    return value;
  }

  /**
   * @return The value of the {@code lastUpdatedAt} attribute
   */
  @JsonProperty("lastUpdatedAt")
  @Override
  public LocalDateTime lastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * @return The value of the {@code lastUpdatedBy} attribute
   */
  @JsonProperty("lastUpdatedBy")
  @Override
  public String lastUpdatedBy() {
    return lastUpdatedBy;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRating#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRating withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutablePerspectiveRating(newValue, this.value, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRating#value() value} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRating withValue(PerspectiveRatingValue value) {
    if (this.value == value) return this;
    PerspectiveRatingValue newValue = Objects.requireNonNull(value, "value");
    return new ImmutablePerspectiveRating(this.entityReference, newValue, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRating#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRating withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutablePerspectiveRating(this.entityReference, this.value, newValue, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PerspectiveRating#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerspectiveRating withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutablePerspectiveRating(this.entityReference, this.value, this.lastUpdatedAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerspectiveRating} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerspectiveRating
        && equalTo((ImmutablePerspectiveRating) another);
  }

  private boolean equalTo(ImmutablePerspectiveRating another) {
    return entityReference.equals(another.entityReference)
        && value.equals(another.value)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code value}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + value.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PerspectiveRating} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PerspectiveRating{"
        + "entityReference=" + entityReference
        + ", value=" + value
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PerspectiveRating {
    EntityReference entityReference;
    PerspectiveRatingValue value;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("value")
    public void setValue(PerspectiveRatingValue value) {
      this.value = value;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public PerspectiveRatingValue value() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePerspectiveRating fromJson(Json json) {
    ImmutablePerspectiveRating.Builder builder = ImmutablePerspectiveRating.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PerspectiveRating} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PerspectiveRating instance
   */
  public static ImmutablePerspectiveRating copyOf(PerspectiveRating instance) {
    if (instance instanceof ImmutablePerspectiveRating) {
      return (ImmutablePerspectiveRating) instance;
    }
    return ImmutablePerspectiveRating.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerspectiveRating ImmutablePerspectiveRating}.
   * @return A new ImmutablePerspectiveRating builder
   */
  public static ImmutablePerspectiveRating.Builder builder() {
    return new ImmutablePerspectiveRating.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerspectiveRating ImmutablePerspectiveRating}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private long initBits = 0x7L;

    private EntityReference entityReference;
    private PerspectiveRatingValue value;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.perspective.PerspectiveRating} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PerspectiveRating instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LastUpdatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LastUpdatedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof PerspectiveRating) {
        PerspectiveRating instance = (PerspectiveRating) object;
        value(instance.value());
        entityReference(instance.entityReference());
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
    }

    /**
     * Initializes the value for the {@link PerspectiveRating#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveRating#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(PerspectiveRatingValue value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveRating#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PerspectiveRating#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link PerspectiveRating#lastUpdatedBy() lastUpdatedBy} attribute.
     * @param lastUpdatedBy The value for lastUpdatedBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedBy")
    public final Builder lastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = Objects.requireNonNull(lastUpdatedBy, "lastUpdatedBy");
      initBits &= ~INIT_BIT_LAST_UPDATED_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerspectiveRating ImmutablePerspectiveRating}.
     * @return An immutable instance of PerspectiveRating
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerspectiveRating build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerspectiveRating(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build PerspectiveRating, some of required attributes are not set " + attributes;
    }
  }
}
