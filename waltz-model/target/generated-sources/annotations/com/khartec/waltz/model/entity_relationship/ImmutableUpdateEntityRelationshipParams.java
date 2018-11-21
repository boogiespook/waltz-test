package com.khartec.waltz.model.entity_relationship;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UpdateEntityRelationshipParams}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdateEntityRelationshipParams.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UpdateEntityRelationshipParams"})
public final class ImmutableUpdateEntityRelationshipParams
    extends UpdateEntityRelationshipParams {
  private final RelationshipKind relationshipKind;
  private final @Nullable String description;

  private ImmutableUpdateEntityRelationshipParams(
      RelationshipKind relationshipKind,
      @Nullable String description) {
    this.relationshipKind = relationshipKind;
    this.description = description;
  }

  /**
   * @return The value of the {@code relationshipKind} attribute
   */
  @JsonProperty("relationshipKind")
  @Override
  public RelationshipKind relationshipKind() {
    return relationshipKind;
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
   * Copy the current immutable object by setting a value for the {@link UpdateEntityRelationshipParams#relationshipKind() relationshipKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationshipKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUpdateEntityRelationshipParams withRelationshipKind(RelationshipKind value) {
    if (this.relationshipKind == value) return this;
    RelationshipKind newValue = Objects.requireNonNull(value, "relationshipKind");
    return new ImmutableUpdateEntityRelationshipParams(newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UpdateEntityRelationshipParams#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUpdateEntityRelationshipParams withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableUpdateEntityRelationshipParams(this.relationshipKind, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdateEntityRelationshipParams} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdateEntityRelationshipParams
        && equalTo((ImmutableUpdateEntityRelationshipParams) another);
  }

  private boolean equalTo(ImmutableUpdateEntityRelationshipParams another) {
    return relationshipKind.equals(another.relationshipKind)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code relationshipKind}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + relationshipKind.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code UpdateEntityRelationshipParams} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UpdateEntityRelationshipParams{"
        + "relationshipKind=" + relationshipKind
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
  static final class Json extends UpdateEntityRelationshipParams {
    RelationshipKind relationshipKind;
    String description;
    @JsonProperty("relationshipKind")
    public void setRelationshipKind(RelationshipKind relationshipKind) {
      this.relationshipKind = relationshipKind;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public RelationshipKind relationshipKind() { throw new UnsupportedOperationException(); }
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
  static ImmutableUpdateEntityRelationshipParams fromJson(Json json) {
    ImmutableUpdateEntityRelationshipParams.Builder builder = ImmutableUpdateEntityRelationshipParams.builder();
    if (json.relationshipKind != null) {
      builder.relationshipKind(json.relationshipKind);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UpdateEntityRelationshipParams} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdateEntityRelationshipParams instance
   */
  public static ImmutableUpdateEntityRelationshipParams copyOf(UpdateEntityRelationshipParams instance) {
    if (instance instanceof ImmutableUpdateEntityRelationshipParams) {
      return (ImmutableUpdateEntityRelationshipParams) instance;
    }
    return ImmutableUpdateEntityRelationshipParams.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdateEntityRelationshipParams ImmutableUpdateEntityRelationshipParams}.
   * @return A new ImmutableUpdateEntityRelationshipParams builder
   */
  public static ImmutableUpdateEntityRelationshipParams.Builder builder() {
    return new ImmutableUpdateEntityRelationshipParams.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdateEntityRelationshipParams ImmutableUpdateEntityRelationshipParams}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RELATIONSHIP_KIND = 0x1L;
    private long initBits = 0x1L;

    private RelationshipKind relationshipKind;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_relationship.UpdateEntityRelationshipParams} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UpdateEntityRelationshipParams instance) {
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

    private void from(Object object) {
      if (object instanceof UpdateEntityRelationshipParams) {
        UpdateEntityRelationshipParams instance = (UpdateEntityRelationshipParams) object;
        relationshipKind(instance.relationshipKind());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
    }

    /**
     * Initializes the value for the {@link UpdateEntityRelationshipParams#relationshipKind() relationshipKind} attribute.
     * @param relationshipKind The value for relationshipKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationshipKind")
    public final Builder relationshipKind(RelationshipKind relationshipKind) {
      this.relationshipKind = Objects.requireNonNull(relationshipKind, "relationshipKind");
      initBits &= ~INIT_BIT_RELATIONSHIP_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link UpdateEntityRelationshipParams#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdateEntityRelationshipParams ImmutableUpdateEntityRelationshipParams}.
     * @return An immutable instance of UpdateEntityRelationshipParams
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdateEntityRelationshipParams build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUpdateEntityRelationshipParams(relationshipKind, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RELATIONSHIP_KIND) != 0) attributes.add("relationshipKind");
      return "Cannot build UpdateEntityRelationshipParams, some of required attributes are not set " + attributes;
    }
  }
}
