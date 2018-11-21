package com.khartec.waltz.model.data_flow_decorator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link DecoratorRatingSummary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDecoratorRatingSummary.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DecoratorRatingSummary"})
public final class ImmutableDecoratorRatingSummary
    extends DecoratorRatingSummary {
  private final EntityReference decoratorEntityReference;
  private final AuthoritativenessRating rating;
  private final int count;

  private ImmutableDecoratorRatingSummary(
      EntityReference decoratorEntityReference,
      AuthoritativenessRating rating,
      int count) {
    this.decoratorEntityReference = decoratorEntityReference;
    this.rating = rating;
    this.count = count;
  }

  /**
   * @return The value of the {@code decoratorEntityReference} attribute
   */
  @JsonProperty("decoratorEntityReference")
  @Override
  public EntityReference decoratorEntityReference() {
    return decoratorEntityReference;
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public AuthoritativenessRating rating() {
    return rating;
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public int count() {
    return count;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DecoratorRatingSummary#decoratorEntityReference() decoratorEntityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for decoratorEntityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDecoratorRatingSummary withDecoratorEntityReference(EntityReference value) {
    if (this.decoratorEntityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "decoratorEntityReference");
    return new ImmutableDecoratorRatingSummary(newValue, this.rating, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DecoratorRatingSummary#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDecoratorRatingSummary withRating(AuthoritativenessRating value) {
    if (this.rating == value) return this;
    AuthoritativenessRating newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableDecoratorRatingSummary(this.decoratorEntityReference, newValue, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DecoratorRatingSummary#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDecoratorRatingSummary withCount(int value) {
    if (this.count == value) return this;
    return new ImmutableDecoratorRatingSummary(this.decoratorEntityReference, this.rating, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDecoratorRatingSummary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDecoratorRatingSummary
        && equalTo((ImmutableDecoratorRatingSummary) another);
  }

  private boolean equalTo(ImmutableDecoratorRatingSummary another) {
    return decoratorEntityReference.equals(another.decoratorEntityReference)
        && rating.equals(another.rating)
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code decoratorEntityReference}, {@code rating}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + decoratorEntityReference.hashCode();
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + count;
    return h;
  }

  /**
   * Prints the immutable value {@code DecoratorRatingSummary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "DecoratorRatingSummary{"
        + "decoratorEntityReference=" + decoratorEntityReference
        + ", rating=" + rating
        + ", count=" + count
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends DecoratorRatingSummary {
    EntityReference decoratorEntityReference;
    AuthoritativenessRating rating;
    int count;
    boolean countIsSet;
    @JsonProperty("decoratorEntityReference")
    public void setDecoratorEntityReference(EntityReference decoratorEntityReference) {
      this.decoratorEntityReference = decoratorEntityReference;
    }
    @JsonProperty("rating")
    public void setRating(AuthoritativenessRating rating) {
      this.rating = rating;
    }
    @JsonProperty("count")
    public void setCount(int count) {
      this.count = count;
      this.countIsSet = true;
    }
    @Override
    public EntityReference decoratorEntityReference() { throw new UnsupportedOperationException(); }
    @Override
    public AuthoritativenessRating rating() { throw new UnsupportedOperationException(); }
    @Override
    public int count() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDecoratorRatingSummary fromJson(Json json) {
    ImmutableDecoratorRatingSummary.Builder builder = ImmutableDecoratorRatingSummary.builder();
    if (json.decoratorEntityReference != null) {
      builder.decoratorEntityReference(json.decoratorEntityReference);
    }
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DecoratorRatingSummary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DecoratorRatingSummary instance
   */
  public static ImmutableDecoratorRatingSummary copyOf(DecoratorRatingSummary instance) {
    if (instance instanceof ImmutableDecoratorRatingSummary) {
      return (ImmutableDecoratorRatingSummary) instance;
    }
    return ImmutableDecoratorRatingSummary.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDecoratorRatingSummary ImmutableDecoratorRatingSummary}.
   * @return A new ImmutableDecoratorRatingSummary builder
   */
  public static ImmutableDecoratorRatingSummary.Builder builder() {
    return new ImmutableDecoratorRatingSummary.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDecoratorRatingSummary ImmutableDecoratorRatingSummary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DECORATOR_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_RATING = 0x2L;
    private static final long INIT_BIT_COUNT = 0x4L;
    private long initBits = 0x7L;

    private EntityReference decoratorEntityReference;
    private AuthoritativenessRating rating;
    private int count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DecoratorRatingSummary} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DecoratorRatingSummary instance) {
      Objects.requireNonNull(instance, "instance");
      decoratorEntityReference(instance.decoratorEntityReference());
      rating(instance.rating());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link DecoratorRatingSummary#decoratorEntityReference() decoratorEntityReference} attribute.
     * @param decoratorEntityReference The value for decoratorEntityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("decoratorEntityReference")
    public final Builder decoratorEntityReference(EntityReference decoratorEntityReference) {
      this.decoratorEntityReference = Objects.requireNonNull(decoratorEntityReference, "decoratorEntityReference");
      initBits &= ~INIT_BIT_DECORATOR_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link DecoratorRatingSummary#rating() rating} attribute.
     * @param rating The value for rating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(AuthoritativenessRating rating) {
      this.rating = Objects.requireNonNull(rating, "rating");
      initBits &= ~INIT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link DecoratorRatingSummary#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(int count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDecoratorRatingSummary ImmutableDecoratorRatingSummary}.
     * @return An immutable instance of DecoratorRatingSummary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDecoratorRatingSummary build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDecoratorRatingSummary(decoratorEntityReference, rating, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DECORATOR_ENTITY_REFERENCE) != 0) attributes.add("decoratorEntityReference");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build DecoratorRatingSummary, some of required attributes are not set " + attributes;
    }
  }
}
