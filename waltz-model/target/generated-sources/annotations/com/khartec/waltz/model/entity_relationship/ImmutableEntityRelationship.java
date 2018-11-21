package com.khartec.waltz.model.entity_relationship;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityRelationship}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityRelationship.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityRelationship"})
public final class ImmutableEntityRelationship
    extends EntityRelationship {
  private final EntityReference a;
  private final EntityReference b;
  private final RelationshipKind relationship;
  private final String provenance;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final @Nullable String description;

  private ImmutableEntityRelationship(ImmutableEntityRelationship.Builder builder) {
    this.a = builder.a;
    this.b = builder.b;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.description = builder.description;
    if (builder.relationship != null) {
      initShim.relationship(builder.relationship);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.relationship = initShim.relationship();
    this.provenance = initShim.provenance();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutableEntityRelationship(
      EntityReference a,
      EntityReference b,
      RelationshipKind relationship,
      String provenance,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      @Nullable String description) {
    this.a = a;
    this.b = b;
    this.relationship = relationship;
    this.provenance = provenance;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.description = description;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private RelationshipKind relationship;
    private int relationshipBuildStage;

    RelationshipKind relationship() {
      if (relationshipBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (relationshipBuildStage == STAGE_UNINITIALIZED) {
        relationshipBuildStage = STAGE_INITIALIZING;
        this.relationship = Objects.requireNonNull(ImmutableEntityRelationship.super.relationship(), "relationship");
        relationshipBuildStage = STAGE_INITIALIZED;
      }
      return this.relationship;
    }

    void relationship(RelationshipKind relationship) {
      this.relationship = relationship;
      relationshipBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableEntityRelationship.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableEntityRelationship.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (relationshipBuildStage == STAGE_INITIALIZING) attributes.add("relationship");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build EntityRelationship, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code a} attribute
   */
  @JsonProperty("a")
  @Override
  public EntityReference a() {
    return a;
  }

  /**
   * @return The value of the {@code b} attribute
   */
  @JsonProperty("b")
  @Override
  public EntityReference b() {
    return b;
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public RelationshipKind relationship() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.relationship()
        : this.relationship;
  }

  /**
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.provenance()
        : this.provenance;
  }

  /**
   * @return The value of the {@code lastUpdatedAt} attribute
   */
  @JsonProperty("lastUpdatedAt")
  @Override
  public LocalDateTime lastUpdatedAt() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.lastUpdatedAt()
        : this.lastUpdatedAt;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#a() a} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for a
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withA(EntityReference value) {
    if (this.a == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "a");
    return new ImmutableEntityRelationship(
        newValue,
        this.b,
        this.relationship,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#b() b} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for b
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withB(EntityReference value) {
    if (this.b == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "b");
    return new ImmutableEntityRelationship(
        this.a,
        newValue,
        this.relationship,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#relationship() relationship} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relationship
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withRelationship(RelationshipKind value) {
    if (this.relationship == value) return this;
    RelationshipKind newValue = Objects.requireNonNull(value, "relationship");
    return new ImmutableEntityRelationship(
        this.a,
        this.b,
        newValue,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityRelationship(
        this.a,
        this.b,
        this.relationship,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableEntityRelationship(
        this.a,
        this.b,
        this.relationship,
        this.provenance,
        newValue,
        this.lastUpdatedBy,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableEntityRelationship(
        this.a,
        this.b,
        this.relationship,
        this.provenance,
        this.lastUpdatedAt,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityRelationship#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityRelationship withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityRelationship(
        this.a,
        this.b,
        this.relationship,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityRelationship} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityRelationship
        && equalTo((ImmutableEntityRelationship) another);
  }

  private boolean equalTo(ImmutableEntityRelationship another) {
    return a.equals(another.a)
        && b.equals(another.b)
        && relationship.equals(another.relationship)
        && provenance.equals(another.provenance)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code a}, {@code b}, {@code relationship}, {@code provenance}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + a.hashCode();
    h += (h << 5) + b.hashCode();
    h += (h << 5) + relationship.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code EntityRelationship} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityRelationship{"
        + "a=" + a
        + ", b=" + b
        + ", relationship=" + relationship
        + ", provenance=" + provenance
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
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
  static final class Json extends EntityRelationship {
    EntityReference a;
    EntityReference b;
    RelationshipKind relationship;
    String provenance;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String description;
    @JsonProperty("a")
    public void setA(EntityReference a) {
      this.a = a;
    }
    @JsonProperty("b")
    public void setB(EntityReference b) {
      this.b = b;
    }
    @JsonProperty("relationship")
    public void setRelationship(RelationshipKind relationship) {
      this.relationship = relationship;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public EntityReference a() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference b() { throw new UnsupportedOperationException(); }
    @Override
    public RelationshipKind relationship() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityRelationship fromJson(Json json) {
    ImmutableEntityRelationship.Builder builder = ImmutableEntityRelationship.builder();
    if (json.a != null) {
      builder.a(json.a);
    }
    if (json.b != null) {
      builder.b(json.b);
    }
    if (json.relationship != null) {
      builder.relationship(json.relationship);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityRelationship} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityRelationship instance
   */
  public static ImmutableEntityRelationship copyOf(EntityRelationship instance) {
    if (instance instanceof ImmutableEntityRelationship) {
      return (ImmutableEntityRelationship) instance;
    }
    return ImmutableEntityRelationship.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityRelationship ImmutableEntityRelationship}.
   * @return A new ImmutableEntityRelationship builder
   */
  public static ImmutableEntityRelationship.Builder builder() {
    return new ImmutableEntityRelationship.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityRelationship ImmutableEntityRelationship}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_A = 0x1L;
    private static final long INIT_BIT_B = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private long initBits = 0x7L;

    private EntityReference a;
    private EntityReference b;
    private RelationshipKind relationship;
    private String provenance;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String description;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ProvenanceProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProvenanceProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_relationship.EntityRelationship} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityRelationship instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof EntityRelationship) {
        EntityRelationship instance = (EntityRelationship) object;
        relationship(instance.relationship());
        a(instance.a());
        b(instance.b());
      }
    }

    /**
     * Initializes the value for the {@link EntityRelationship#a() a} attribute.
     * @param a The value for a 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("a")
    public final Builder a(EntityReference a) {
      this.a = Objects.requireNonNull(a, "a");
      initBits &= ~INIT_BIT_A;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationship#b() b} attribute.
     * @param b The value for b 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("b")
    public final Builder b(EntityReference b) {
      this.b = Objects.requireNonNull(b, "b");
      initBits &= ~INIT_BIT_B;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationship#relationship() relationship} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityRelationship#relationship() relationship}.</em>
     * @param relationship The value for relationship 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(RelationshipKind relationship) {
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationship#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityRelationship#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationship#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityRelationship#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityRelationship#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link EntityRelationship#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityRelationship ImmutableEntityRelationship}.
     * @return An immutable instance of EntityRelationship
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityRelationship build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityRelationship(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_A) != 0) attributes.add("a");
      if ((initBits & INIT_BIT_B) != 0) attributes.add("b");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build EntityRelationship, some of required attributes are not set " + attributes;
    }
  }
}
