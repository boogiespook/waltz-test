package com.khartec.waltz.model.authoritativesource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AuthoritativeSourceCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthoritativeSourceCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AuthoritativeSourceCreateCommand"})
public final class ImmutableAuthoritativeSourceCreateCommand
    extends AuthoritativeSourceCreateCommand {
  private final AuthoritativenessRating rating;
  private final long dataTypeId;
  private final long applicationId;
  private final long orgUnitId;
  private final @Nullable String description;

  private ImmutableAuthoritativeSourceCreateCommand(
      AuthoritativenessRating rating,
      long dataTypeId,
      long applicationId,
      long orgUnitId,
      @Nullable String description) {
    this.rating = rating;
    this.dataTypeId = dataTypeId;
    this.applicationId = applicationId;
    this.orgUnitId = orgUnitId;
    this.description = description;
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
   * @return The value of the {@code dataTypeId} attribute
   */
  @JsonProperty("dataTypeId")
  @Override
  public long dataTypeId() {
    return dataTypeId;
  }

  /**
   * @return The value of the {@code applicationId} attribute
   */
  @JsonProperty("applicationId")
  @Override
  public long applicationId() {
    return applicationId;
  }

  /**
   * @return The value of the {@code orgUnitId} attribute
   */
  @JsonProperty("orgUnitId")
  @Override
  public long orgUnitId() {
    return orgUnitId;
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
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceCreateCommand#rating() rating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceCreateCommand withRating(AuthoritativenessRating value) {
    if (this.rating == value) return this;
    AuthoritativenessRating newValue = Objects.requireNonNull(value, "rating");
    return new ImmutableAuthoritativeSourceCreateCommand(newValue, this.dataTypeId, this.applicationId, this.orgUnitId, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceCreateCommand#dataTypeId() dataTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceCreateCommand withDataTypeId(long value) {
    if (this.dataTypeId == value) return this;
    return new ImmutableAuthoritativeSourceCreateCommand(this.rating, value, this.applicationId, this.orgUnitId, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceCreateCommand#applicationId() applicationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceCreateCommand withApplicationId(long value) {
    if (this.applicationId == value) return this;
    return new ImmutableAuthoritativeSourceCreateCommand(this.rating, this.dataTypeId, value, this.orgUnitId, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceCreateCommand#orgUnitId() orgUnitId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for orgUnitId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceCreateCommand withOrgUnitId(long value) {
    if (this.orgUnitId == value) return this;
    return new ImmutableAuthoritativeSourceCreateCommand(this.rating, this.dataTypeId, this.applicationId, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthoritativeSourceCreateCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthoritativeSourceCreateCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAuthoritativeSourceCreateCommand(this.rating, this.dataTypeId, this.applicationId, this.orgUnitId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthoritativeSourceCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthoritativeSourceCreateCommand
        && equalTo((ImmutableAuthoritativeSourceCreateCommand) another);
  }

  private boolean equalTo(ImmutableAuthoritativeSourceCreateCommand another) {
    return rating.equals(another.rating)
        && dataTypeId == another.dataTypeId
        && applicationId == another.applicationId
        && orgUnitId == another.orgUnitId
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code rating}, {@code dataTypeId}, {@code applicationId}, {@code orgUnitId}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + rating.hashCode();
    h += (h << 5) + Long.hashCode(dataTypeId);
    h += (h << 5) + Long.hashCode(applicationId);
    h += (h << 5) + Long.hashCode(orgUnitId);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code AuthoritativeSourceCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AuthoritativeSourceCreateCommand{"
        + "rating=" + rating
        + ", dataTypeId=" + dataTypeId
        + ", applicationId=" + applicationId
        + ", orgUnitId=" + orgUnitId
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
  static final class Json extends AuthoritativeSourceCreateCommand {
    AuthoritativenessRating rating;
    long dataTypeId;
    boolean dataTypeIdIsSet;
    long applicationId;
    boolean applicationIdIsSet;
    long orgUnitId;
    boolean orgUnitIdIsSet;
    String description;
    @JsonProperty("rating")
    public void setRating(AuthoritativenessRating rating) {
      this.rating = rating;
    }
    @JsonProperty("dataTypeId")
    public void setDataTypeId(long dataTypeId) {
      this.dataTypeId = dataTypeId;
      this.dataTypeIdIsSet = true;
    }
    @JsonProperty("applicationId")
    public void setApplicationId(long applicationId) {
      this.applicationId = applicationId;
      this.applicationIdIsSet = true;
    }
    @JsonProperty("orgUnitId")
    public void setOrgUnitId(long orgUnitId) {
      this.orgUnitId = orgUnitId;
      this.orgUnitIdIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public AuthoritativenessRating rating() { throw new UnsupportedOperationException(); }
    @Override
    public long dataTypeId() { throw new UnsupportedOperationException(); }
    @Override
    public long applicationId() { throw new UnsupportedOperationException(); }
    @Override
    public long orgUnitId() { throw new UnsupportedOperationException(); }
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
  static ImmutableAuthoritativeSourceCreateCommand fromJson(Json json) {
    ImmutableAuthoritativeSourceCreateCommand.Builder builder = ImmutableAuthoritativeSourceCreateCommand.builder();
    if (json.rating != null) {
      builder.rating(json.rating);
    }
    if (json.dataTypeIdIsSet) {
      builder.dataTypeId(json.dataTypeId);
    }
    if (json.applicationIdIsSet) {
      builder.applicationId(json.applicationId);
    }
    if (json.orgUnitIdIsSet) {
      builder.orgUnitId(json.orgUnitId);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuthoritativeSourceCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthoritativeSourceCreateCommand instance
   */
  public static ImmutableAuthoritativeSourceCreateCommand copyOf(AuthoritativeSourceCreateCommand instance) {
    if (instance instanceof ImmutableAuthoritativeSourceCreateCommand) {
      return (ImmutableAuthoritativeSourceCreateCommand) instance;
    }
    return ImmutableAuthoritativeSourceCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthoritativeSourceCreateCommand ImmutableAuthoritativeSourceCreateCommand}.
   * @return A new ImmutableAuthoritativeSourceCreateCommand builder
   */
  public static ImmutableAuthoritativeSourceCreateCommand.Builder builder() {
    return new ImmutableAuthoritativeSourceCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthoritativeSourceCreateCommand ImmutableAuthoritativeSourceCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING = 0x1L;
    private static final long INIT_BIT_DATA_TYPE_ID = 0x2L;
    private static final long INIT_BIT_APPLICATION_ID = 0x4L;
    private static final long INIT_BIT_ORG_UNIT_ID = 0x8L;
    private long initBits = 0xfL;

    private AuthoritativenessRating rating;
    private long dataTypeId;
    private long applicationId;
    private long orgUnitId;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.authoritativesource.AuthoritativeSourceCreateCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuthoritativeSourceCreateCommand instance) {
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
      if (object instanceof AuthoritativeSourceCreateCommand) {
        AuthoritativeSourceCreateCommand instance = (AuthoritativeSourceCreateCommand) object;
        rating(instance.rating());
        dataTypeId(instance.dataTypeId());
        applicationId(instance.applicationId());
        orgUnitId(instance.orgUnitId());
      }
    }

    /**
     * Initializes the value for the {@link AuthoritativeSourceCreateCommand#rating() rating} attribute.
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
     * Initializes the value for the {@link AuthoritativeSourceCreateCommand#dataTypeId() dataTypeId} attribute.
     * @param dataTypeId The value for dataTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataTypeId")
    public final Builder dataTypeId(long dataTypeId) {
      this.dataTypeId = dataTypeId;
      initBits &= ~INIT_BIT_DATA_TYPE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSourceCreateCommand#applicationId() applicationId} attribute.
     * @param applicationId The value for applicationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationId")
    public final Builder applicationId(long applicationId) {
      this.applicationId = applicationId;
      initBits &= ~INIT_BIT_APPLICATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSourceCreateCommand#orgUnitId() orgUnitId} attribute.
     * @param orgUnitId The value for orgUnitId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orgUnitId")
    public final Builder orgUnitId(long orgUnitId) {
      this.orgUnitId = orgUnitId;
      initBits &= ~INIT_BIT_ORG_UNIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AuthoritativeSourceCreateCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthoritativeSourceCreateCommand ImmutableAuthoritativeSourceCreateCommand}.
     * @return An immutable instance of AuthoritativeSourceCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthoritativeSourceCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthoritativeSourceCreateCommand(rating, dataTypeId, applicationId, orgUnitId, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING) != 0) attributes.add("rating");
      if ((initBits & INIT_BIT_DATA_TYPE_ID) != 0) attributes.add("dataTypeId");
      if ((initBits & INIT_BIT_APPLICATION_ID) != 0) attributes.add("applicationId");
      if ((initBits & INIT_BIT_ORG_UNIT_ID) != 0) attributes.add("orgUnitId");
      return "Cannot build AuthoritativeSourceCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
