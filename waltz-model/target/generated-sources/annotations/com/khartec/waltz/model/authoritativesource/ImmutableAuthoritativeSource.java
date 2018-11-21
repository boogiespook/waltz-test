package com.khartec.waltz.model.authoritativesource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AuthoritativeSource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthoritativeSource.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AuthoritativeSource"})
public final class ImmutableAuthoritativeSource
    extends AuthoritativeSource {
  private final EntityReference applicationReference;
  private final EntityReference appOrgUnitReference;
  private final EntityReference parentReference;
  private final String dataType;
  private final AuthoritativenessRating rating;
  private final String provenance;
  private final Long id;
  private final @Nullable String description;

  private ImmutableAuthoritativeSource(ImmutableAuthoritativeSource.Builder builder) {
    this.applicationReference = builder.applicationReference;
    this.appOrgUnitReference = builder.appOrgUnitReference;
    this.parentReference = builder.parentReference;
    this.dataType = builder.dataType;
    this.rating = builder.rating;
    this.id = builder.id;
    this.description = builder.description;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableAuthoritativeSource(
      EntityReference applicationReference,
      EntityReference appOrgUnitReference,
      EntityReference parentReference,
      String dataType,
      AuthoritativenessRating rating,
      String provenance,
      Long id,
      @Nullable String description) {
    this.applicationReference = applicationReference;
    this.appOrgUnitReference = appOrgUnitReference;
    this.parentReference = parentReference;
    this.dataType = dataType;
    this.rating = rating;
    this.provenance = provenance;
    this.id = id;
    this.description = description;
  }

  /**
   * @return The value of the {@code applicationReference} attribute
   */
  @JsonProperty("applicationReference")
  @Override
  public EntityReference applicationReference() {
    return applicationReference;
  }

  /**
   * @return The value of the {@code appOrgUnitReference} attribute
   */
  @JsonProperty("appOrgUnitReference")
  @Override
  public EntityReference appOrgUnitReference() {
    return appOrgUnitReference;
  }

  /**
   * @return The value of the {@code parentReference} attribute
   */
  @JsonProperty("parentReference")
  @Override
  public EntityReference parentReference() {
    return parentReference;
  }

  /**
   * @return The value of the {@code dataType} attribute
   */
  @JsonProperty("dataType")
  @Override
  public String dataType() {
    return dataType;
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
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    return provenance;
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
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#applicationReference() applicationReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withApplicationReference(EntityReference value) {
    if (this.applicationReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "applicationReference");
    return new ImmutableAuthoritativeSource(
        newValue,
        this.appOrgUnitReference,
        this.parentReference,
        this.dataType,
        this.rating,
        this.provenance,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#appOrgUnitReference() appOrgUnitReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appOrgUnitReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withAppOrgUnitReference(EntityReference value) {
    if (this.appOrgUnitReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "appOrgUnitReference");
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        newValue,
        this.parentReference,
        this.dataType,
        this.rating,
        this.provenance,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#parentReference() parentReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parentReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withParentReference(EntityReference value) {
    if (this.parentReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "parentReference");
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        newValue,
        this.dataType,
        this.rating,
        this.provenance,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#dataType() dataType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withDataType(String value) {
    if (this.dataType.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dataType");
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        this.parentReference,
        newValue,
        this.rating,
        this.provenance,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withRating(AuthoritativenessRating value) {
    if (this.rating == value) return this;
    AuthoritativenessRating newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        this.parentReference,
        this.dataType,
        newValue,
        this.provenance,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        this.parentReference,
        this.dataType,
        this.rating,
        newValue,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuthoritativeSource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthoritativeSource withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        this.parentReference,
        this.dataType,
        this.rating,
        this.provenance,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuthoritativeSource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthoritativeSource withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        this.parentReference,
        this.dataType,
        this.rating,
        this.provenance,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSource#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSource withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAuthoritativeSource(
        this.applicationReference,
        this.appOrgUnitReference,
        this.parentReference,
        this.dataType,
        this.rating,
        this.provenance,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthoritativeSource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthoritativeSource
        && equalTo((ImmutableAuthoritativeSource) another);
  }

  private boolean equalTo(ImmutableAuthoritativeSource another) {
    return applicationReference.equals(another.applicationReference)
        && appOrgUnitReference.equals(another.appOrgUnitReference)
        && parentReference.equals(another.parentReference)
        && dataType.equals(another.dataType)
        && rating.equals(another.rating)
        && provenance.equals(another.provenance)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code applicationReference}, {@code appOrgUnitReference}, {@code parentReference}, {@code dataType}, {@code rating}, {@code provenance}, {@code id}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + applicationReference.hashCode();
    h += (h << 5) + appOrgUnitReference.hashCode();
    h += (h << 5) + parentReference.hashCode();
    h += (h << 5) + dataType.hashCode();
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code AuthoritativeSource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuthoritativeSource{");
    builder.append("applicationReference=").append(applicationReference);
    builder.append(", ");
    builder.append("appOrgUnitReference=").append(appOrgUnitReference);
    builder.append(", ");
    builder.append("parentReference=").append(parentReference);
    builder.append(", ");
    builder.append("dataType=").append(dataType);
    builder.append(", ");
    builder.append("rating=").append(rating);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
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
  static final class Json extends AuthoritativeSource {
    EntityReference applicationReference;
    EntityReference appOrgUnitReference;
    EntityReference parentReference;
    String dataType;
    AuthoritativenessRating rating;
    String provenance;
    Optional<Long> id = Optional.empty();
    String description;
    @JsonProperty("applicationReference")
    public void setApplicationReference(EntityReference applicationReference) {
      this.applicationReference = applicationReference;
    }
    @JsonProperty("appOrgUnitReference")
    public void setAppOrgUnitReference(EntityReference appOrgUnitReference) {
      this.appOrgUnitReference = appOrgUnitReference;
    }
    @JsonProperty("parentReference")
    public void setParentReference(EntityReference parentReference) {
      this.parentReference = parentReference;
    }
    @JsonProperty("dataType")
    public void setDataType(String dataType) {
      this.dataType = dataType;
    }
    @JsonProperty("rating")
    public void setRating(AuthoritativenessRating rating) {
      this.rating = rating;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public EntityReference applicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference appOrgUnitReference() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference parentReference() { throw new UnsupportedOperationException(); }
    @Override
    public String dataType() { throw new UnsupportedOperationException(); }
    @Override
    public AuthoritativenessRating rating() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableAuthoritativeSource fromJson(Json json) {
    ImmutableAuthoritativeSource.Builder builder = ImmutableAuthoritativeSource.builder();
    if (json.applicationReference != null) {
      builder.applicationReference(json.applicationReference);
    }
    if (json.appOrgUnitReference != null) {
      builder.appOrgUnitReference(json.appOrgUnitReference);
    }
    if (json.parentReference != null) {
      builder.parentReference(json.parentReference);
    }
    if (json.dataType != null) {
      builder.dataType(json.dataType);
    }
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuthoritativeSource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthoritativeSource instance
   */
  public static ImmutableAuthoritativeSource copyOf(AuthoritativeSource instance) {
    if (instance instanceof ImmutableAuthoritativeSource) {
      return (ImmutableAuthoritativeSource) instance;
    }
    return ImmutableAuthoritativeSource.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthoritativeSource ImmutableAuthoritativeSource}.
   * @return A new ImmutableAuthoritativeSource builder
   */
  public static ImmutableAuthoritativeSource.Builder builder() {
    return new ImmutableAuthoritativeSource.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthoritativeSource ImmutableAuthoritativeSource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APPLICATION_REFERENCE = 0x1L;
    private static final long INIT_BIT_APP_ORG_UNIT_REFERENCE = 0x2L;
    private static final long INIT_BIT_PARENT_REFERENCE = 0x4L;
    private static final long INIT_BIT_DATA_TYPE = 0x8L;
    private static final long INIT_BIT_RATING = 0x10L;
    private long initBits = 0x1fL;

    private EntityReference applicationReference;
    private EntityReference appOrgUnitReference;
    private EntityReference parentReference;
    private String dataType;
    private AuthoritativenessRating rating;
    private String provenance;
    private Long id;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.authoritativesource.AuthoritativeSource} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuthoritativeSource instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ProvenanceProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProvenanceProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof AuthoritativeSource) {
        AuthoritativeSource instance = (AuthoritativeSource) object;
        rating(instance.rating());
        parentReference(instance.parentReference());
        applicationReference(instance.applicationReference());
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
        appOrgUnitReference(instance.appOrgUnitReference());
        dataType(instance.dataType());
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link AuthoritativeSource#applicationReference() applicationReference} attribute.
     * @param applicationReference The value for applicationReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationReference")
    public final Builder applicationReference(EntityReference applicationReference) {
      this.applicationReference = Objects.requireNonNull(applicationReference, "applicationReference");
      initBits &= ~INIT_BIT_APPLICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSource#appOrgUnitReference() appOrgUnitReference} attribute.
     * @param appOrgUnitReference The value for appOrgUnitReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appOrgUnitReference")
    public final Builder appOrgUnitReference(EntityReference appOrgUnitReference) {
      this.appOrgUnitReference = Objects.requireNonNull(appOrgUnitReference, "appOrgUnitReference");
      initBits &= ~INIT_BIT_APP_ORG_UNIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSource#parentReference() parentReference} attribute.
     * @param parentReference The value for parentReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentReference")
    public final Builder parentReference(EntityReference parentReference) {
      this.parentReference = Objects.requireNonNull(parentReference, "parentReference");
      initBits &= ~INIT_BIT_PARENT_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSource#dataType() dataType} attribute.
     * @param dataType The value for dataType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataType")
    public final Builder dataType(String dataType) {
      this.dataType = Objects.requireNonNull(dataType, "dataType");
      initBits &= ~INIT_BIT_DATA_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSource#rating() rating} attribute.
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
     * Initializes the value for the {@link AuthoritativeSource#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AuthoritativeSource#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the optional value {@link AuthoritativeSource#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AuthoritativeSource#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSource#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthoritativeSource ImmutableAuthoritativeSource}.
     * @return An immutable instance of AuthoritativeSource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthoritativeSource build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthoritativeSource(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APPLICATION_REFERENCE) != 0) attributes.add("applicationReference");
      if ((initBits & INIT_BIT_APP_ORG_UNIT_REFERENCE) != 0) attributes.add("appOrgUnitReference");
      if ((initBits & INIT_BIT_PARENT_REFERENCE) != 0) attributes.add("parentReference");
      if ((initBits & INIT_BIT_DATA_TYPE) != 0) attributes.add("dataType");
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      return "Cannot build AuthoritativeSource, some of required attributes are not set " + attributes;
    }
  }
}
