package com.khartec.waltz.model.source_data_rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.rating.RagRating;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SourceDataRating}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSourceDataRating.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SourceDataRating"})
public final class ImmutableSourceDataRating
    extends SourceDataRating {
  private final String sourceName;
  private final EntityKind entityKind;
  private final RagRating authoritativeness;
  private final RagRating accuracy;
  private final RagRating completeness;
  private final LocalDateTime lastImportDate;

  private ImmutableSourceDataRating(
      String sourceName,
      EntityKind entityKind,
      RagRating authoritativeness,
      RagRating accuracy,
      RagRating completeness,
      LocalDateTime lastImportDate) {
    this.sourceName = sourceName;
    this.entityKind = entityKind;
    this.authoritativeness = authoritativeness;
    this.accuracy = accuracy;
    this.completeness = completeness;
    this.lastImportDate = lastImportDate;
  }

  /**
   * @return The value of the {@code sourceName} attribute
   */
  @JsonProperty("sourceName")
  @Override
  public String sourceName() {
    return sourceName;
  }

  /**
   * @return The value of the {@code entityKind} attribute
   */
  @JsonProperty("entityKind")
  @Override
  public EntityKind entityKind() {
    return entityKind;
  }

  /**
   * @return The value of the {@code authoritativeness} attribute
   */
  @JsonProperty("authoritativeness")
  @Override
  public RagRating authoritativeness() {
    return authoritativeness;
  }

  /**
   * @return The value of the {@code accuracy} attribute
   */
  @JsonProperty("accuracy")
  @Override
  public RagRating accuracy() {
    return accuracy;
  }

  /**
   * @return The value of the {@code completeness} attribute
   */
  @JsonProperty("completeness")
  @Override
  public RagRating completeness() {
    return completeness;
  }

  /**
   * @return The value of the {@code lastImportDate} attribute
   */
  @JsonProperty("lastImportDate")
  @Override
  public Optional<LocalDateTime> lastImportDate() {
    return Optional.ofNullable(lastImportDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SourceDataRating#sourceName() sourceName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sourceName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSourceDataRating withSourceName(String value) {
    if (this.sourceName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "sourceName");
    return new ImmutableSourceDataRating(
        newValue,
        this.entityKind,
        this.authoritativeness,
        this.accuracy,
        this.completeness,
        this.lastImportDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SourceDataRating#entityKind() entityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSourceDataRating withEntityKind(EntityKind value) {
    if (this.entityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "entityKind");
    return new ImmutableSourceDataRating(
        this.sourceName,
        newValue,
        this.authoritativeness,
        this.accuracy,
        this.completeness,
        this.lastImportDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SourceDataRating#authoritativeness() authoritativeness} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for authoritativeness
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSourceDataRating withAuthoritativeness(RagRating value) {
    if (this.authoritativeness == value) return this;
    RagRating newValue = Objects.requireNonNull(value, "authoritativeness");
    return new ImmutableSourceDataRating(
        this.sourceName,
        this.entityKind,
        newValue,
        this.accuracy,
        this.completeness,
        this.lastImportDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SourceDataRating#accuracy() accuracy} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for accuracy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSourceDataRating withAccuracy(RagRating value) {
    if (this.accuracy == value) return this;
    RagRating newValue = Objects.requireNonNull(value, "accuracy");
    return new ImmutableSourceDataRating(
        this.sourceName,
        this.entityKind,
        this.authoritativeness,
        newValue,
        this.completeness,
        this.lastImportDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SourceDataRating#completeness() completeness} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for completeness
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSourceDataRating withCompleteness(RagRating value) {
    if (this.completeness == value) return this;
    RagRating newValue = Objects.requireNonNull(value, "completeness");
    return new ImmutableSourceDataRating(
        this.sourceName,
        this.entityKind,
        this.authoritativeness,
        this.accuracy,
        newValue,
        this.lastImportDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SourceDataRating#lastImportDate() lastImportDate} attribute.
   * @param value The value for lastImportDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSourceDataRating withLastImportDate(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "lastImportDate");
    if (this.lastImportDate == newValue) return this;
    return new ImmutableSourceDataRating(
        this.sourceName,
        this.entityKind,
        this.authoritativeness,
        this.accuracy,
        this.completeness,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SourceDataRating#lastImportDate() lastImportDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastImportDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSourceDataRating withLastImportDate(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.lastImportDate == value) return this;
    return new ImmutableSourceDataRating(
        this.sourceName,
        this.entityKind,
        this.authoritativeness,
        this.accuracy,
        this.completeness,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSourceDataRating} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSourceDataRating
        && equalTo((ImmutableSourceDataRating) another);
  }

  private boolean equalTo(ImmutableSourceDataRating another) {
    return sourceName.equals(another.sourceName)
        && entityKind.equals(another.entityKind)
        && authoritativeness.equals(another.authoritativeness)
        && accuracy.equals(another.accuracy)
        && completeness.equals(another.completeness)
        && Objects.equals(lastImportDate, another.lastImportDate);
  }

  /**
   * Computes a hash code from attributes: {@code sourceName}, {@code entityKind}, {@code authoritativeness}, {@code accuracy}, {@code completeness}, {@code lastImportDate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sourceName.hashCode();
    h += (h << 5) + entityKind.hashCode();
    h += (h << 5) + authoritativeness.hashCode();
    h += (h << 5) + accuracy.hashCode();
    h += (h << 5) + completeness.hashCode();
    h += (h << 5) + Objects.hashCode(lastImportDate);
    return h;
  }

  /**
   * Prints the immutable value {@code SourceDataRating} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SourceDataRating{");
    builder.append("sourceName=").append(sourceName);
    builder.append(", ");
    builder.append("entityKind=").append(entityKind);
    builder.append(", ");
    builder.append("authoritativeness=").append(authoritativeness);
    builder.append(", ");
    builder.append("accuracy=").append(accuracy);
    builder.append(", ");
    builder.append("completeness=").append(completeness);
    if (lastImportDate != null) {
      builder.append(", ");
      builder.append("lastImportDate=").append(lastImportDate);
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
  static final class Json extends SourceDataRating {
    String sourceName;
    EntityKind entityKind;
    RagRating authoritativeness;
    RagRating accuracy;
    RagRating completeness;
    Optional<LocalDateTime> lastImportDate = Optional.empty();
    @JsonProperty("sourceName")
    public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
    }
    @JsonProperty("entityKind")
    public void setEntityKind(EntityKind entityKind) {
      this.entityKind = entityKind;
    }
    @JsonProperty("authoritativeness")
    public void setAuthoritativeness(RagRating authoritativeness) {
      this.authoritativeness = authoritativeness;
    }
    @JsonProperty("accuracy")
    public void setAccuracy(RagRating accuracy) {
      this.accuracy = accuracy;
    }
    @JsonProperty("completeness")
    public void setCompleteness(RagRating completeness) {
      this.completeness = completeness;
    }
    @JsonProperty("lastImportDate")
    public void setLastImportDate(Optional<LocalDateTime> lastImportDate) {
      this.lastImportDate = lastImportDate;
    }
    @Override
    public String sourceName() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind entityKind() { throw new UnsupportedOperationException(); }
    @Override
    public RagRating authoritativeness() { throw new UnsupportedOperationException(); }
    @Override
    public RagRating accuracy() { throw new UnsupportedOperationException(); }
    @Override
    public RagRating completeness() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDateTime> lastImportDate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSourceDataRating fromJson(Json json) {
    ImmutableSourceDataRating.Builder builder = ImmutableSourceDataRating.builder();
    if (json.sourceName != null) {
      builder.sourceName(json.sourceName);
    }
    if (json.entityKind != null) {
      builder.entityKind(json.entityKind);
    }
    if (json.authoritativeness != null) {
      builder.authoritativeness(json.authoritativeness);
    }
    if (json.accuracy != null) {
      builder.accuracy(json.accuracy);
    }
    if (json.completeness != null) {
      builder.completeness(json.completeness);
    }
    if (json.lastImportDate != null) {
      builder.lastImportDate(json.lastImportDate);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SourceDataRating} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SourceDataRating instance
   */
  public static ImmutableSourceDataRating copyOf(SourceDataRating instance) {
    if (instance instanceof ImmutableSourceDataRating) {
      return (ImmutableSourceDataRating) instance;
    }
    return ImmutableSourceDataRating.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSourceDataRating ImmutableSourceDataRating}.
   * @return A new ImmutableSourceDataRating builder
   */
  public static ImmutableSourceDataRating.Builder builder() {
    return new ImmutableSourceDataRating.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSourceDataRating ImmutableSourceDataRating}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SOURCE_NAME = 0x1L;
    private static final long INIT_BIT_ENTITY_KIND = 0x2L;
    private static final long INIT_BIT_AUTHORITATIVENESS = 0x4L;
    private static final long INIT_BIT_ACCURACY = 0x8L;
    private static final long INIT_BIT_COMPLETENESS = 0x10L;
    private long initBits = 0x1fL;

    private String sourceName;
    private EntityKind entityKind;
    private RagRating authoritativeness;
    private RagRating accuracy;
    private RagRating completeness;
    private LocalDateTime lastImportDate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SourceDataRating} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SourceDataRating instance) {
      Objects.requireNonNull(instance, "instance");
      sourceName(instance.sourceName());
      entityKind(instance.entityKind());
      authoritativeness(instance.authoritativeness());
      accuracy(instance.accuracy());
      completeness(instance.completeness());
      Optional<LocalDateTime> lastImportDateOptional = instance.lastImportDate();
      if (lastImportDateOptional.isPresent()) {
        lastImportDate(lastImportDateOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link SourceDataRating#sourceName() sourceName} attribute.
     * @param sourceName The value for sourceName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceName")
    public final Builder sourceName(String sourceName) {
      this.sourceName = Objects.requireNonNull(sourceName, "sourceName");
      initBits &= ~INIT_BIT_SOURCE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link SourceDataRating#entityKind() entityKind} attribute.
     * @param entityKind The value for entityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityKind")
    public final Builder entityKind(EntityKind entityKind) {
      this.entityKind = Objects.requireNonNull(entityKind, "entityKind");
      initBits &= ~INIT_BIT_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link SourceDataRating#authoritativeness() authoritativeness} attribute.
     * @param authoritativeness The value for authoritativeness 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authoritativeness")
    public final Builder authoritativeness(RagRating authoritativeness) {
      this.authoritativeness = Objects.requireNonNull(authoritativeness, "authoritativeness");
      initBits &= ~INIT_BIT_AUTHORITATIVENESS;
      return this;
    }

    /**
     * Initializes the value for the {@link SourceDataRating#accuracy() accuracy} attribute.
     * @param accuracy The value for accuracy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("accuracy")
    public final Builder accuracy(RagRating accuracy) {
      this.accuracy = Objects.requireNonNull(accuracy, "accuracy");
      initBits &= ~INIT_BIT_ACCURACY;
      return this;
    }

    /**
     * Initializes the value for the {@link SourceDataRating#completeness() completeness} attribute.
     * @param completeness The value for completeness 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("completeness")
    public final Builder completeness(RagRating completeness) {
      this.completeness = Objects.requireNonNull(completeness, "completeness");
      initBits &= ~INIT_BIT_COMPLETENESS;
      return this;
    }

    /**
     * Initializes the optional value {@link SourceDataRating#lastImportDate() lastImportDate} to lastImportDate.
     * @param lastImportDate The value for lastImportDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastImportDate(LocalDateTime lastImportDate) {
      this.lastImportDate = Objects.requireNonNull(lastImportDate, "lastImportDate");
      return this;
    }

    /**
     * Initializes the optional value {@link SourceDataRating#lastImportDate() lastImportDate} to lastImportDate.
     * @param lastImportDate The value for lastImportDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastImportDate")
    public final Builder lastImportDate(Optional<? extends LocalDateTime> lastImportDate) {
      this.lastImportDate = lastImportDate.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSourceDataRating ImmutableSourceDataRating}.
     * @return An immutable instance of SourceDataRating
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSourceDataRating build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSourceDataRating(sourceName, entityKind, authoritativeness, accuracy, completeness, lastImportDate);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SOURCE_NAME) != 0) attributes.add("sourceName");
      if ((initBits & INIT_BIT_ENTITY_KIND) != 0) attributes.add("entityKind");
      if ((initBits & INIT_BIT_AUTHORITATIVENESS) != 0) attributes.add("authoritativeness");
      if ((initBits & INIT_BIT_ACCURACY) != 0) attributes.add("accuracy");
      if ((initBits & INIT_BIT_COMPLETENESS) != 0) attributes.add("completeness");
      return "Cannot build SourceDataRating, some of required attributes are not set " + attributes;
    }
  }
}
