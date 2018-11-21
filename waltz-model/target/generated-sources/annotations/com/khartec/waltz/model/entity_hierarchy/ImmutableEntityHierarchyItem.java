package com.khartec.waltz.model.entity_hierarchy;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LevelProvider;
import com.khartec.waltz.model.ParentIdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityHierarchyItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityHierarchyItem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityHierarchyItem"})
public final class ImmutableEntityHierarchyItem
    extends EntityHierarchyItem {
  private final EntityKind kind;
  private final Long id;
  private final int level;
  private final Long parentId;

  private ImmutableEntityHierarchyItem(EntityKind kind, Long id, int level, Long parentId) {
    this.kind = kind;
    this.id = id;
    this.level = level;
    this.parentId = parentId;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public EntityKind kind() {
    return kind;
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
   * @return The value of the {@code level} attribute
   */
  @JsonProperty("level")
  @Override
  public int level() {
    return level;
  }

  /**
   * @return The value of the {@code parentId} attribute
   */
  @JsonProperty("parentId")
  @Override
  public Optional<Long> parentId() {
    return Optional.ofNullable(parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityHierarchyItem#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityHierarchyItem withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableEntityHierarchyItem(newValue, this.id, this.level, this.parentId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityHierarchyItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityHierarchyItem withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEntityHierarchyItem(this.kind, newValue, this.level, this.parentId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityHierarchyItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityHierarchyItem withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEntityHierarchyItem(this.kind, value, this.level, this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityHierarchyItem#level() level} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for level
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityHierarchyItem withLevel(int value) {
    if (this.level == value) return this;
    return new ImmutableEntityHierarchyItem(this.kind, this.id, value, this.parentId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityHierarchyItem#parentId() parentId} attribute.
   * @param value The value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityHierarchyItem withParentId(long value) {
    Long newValue = value;
    if (Objects.equals(this.parentId, newValue)) return this;
    return new ImmutableEntityHierarchyItem(this.kind, this.id, this.level, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityHierarchyItem#parentId() parentId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityHierarchyItem withParentId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.parentId, value)) return this;
    return new ImmutableEntityHierarchyItem(this.kind, this.id, this.level, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityHierarchyItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityHierarchyItem
        && equalTo((ImmutableEntityHierarchyItem) another);
  }

  private boolean equalTo(ImmutableEntityHierarchyItem another) {
    return kind.equals(another.kind)
        && Objects.equals(id, another.id)
        && level == another.level
        && Objects.equals(parentId, another.parentId);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code id}, {@code level}, {@code parentId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + level;
    h += (h << 5) + Objects.hashCode(parentId);
    return h;
  }

  /**
   * Prints the immutable value {@code EntityHierarchyItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityHierarchyItem{");
    builder.append("kind=").append(kind);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("level=").append(level);
    if (parentId != null) {
      builder.append(", ");
      builder.append("parentId=").append(parentId);
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
  static final class Json extends EntityHierarchyItem {
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    int level;
    boolean levelIsSet;
    Optional<Long> parentId = Optional.empty();
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("level")
    public void setLevel(int level) {
      this.level = level;
      this.levelIsSet = true;
    }
    @JsonProperty("parentId")
    public void setParentId(Optional<Long> parentId) {
      this.parentId = parentId;
    }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public int level() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> parentId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityHierarchyItem fromJson(Json json) {
    ImmutableEntityHierarchyItem.Builder builder = ImmutableEntityHierarchyItem.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.levelIsSet) {
      builder.level(json.level);
    }
    if (json.parentId != null) {
      builder.parentId(json.parentId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityHierarchyItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityHierarchyItem instance
   */
  public static ImmutableEntityHierarchyItem copyOf(EntityHierarchyItem instance) {
    if (instance instanceof ImmutableEntityHierarchyItem) {
      return (ImmutableEntityHierarchyItem) instance;
    }
    return ImmutableEntityHierarchyItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityHierarchyItem ImmutableEntityHierarchyItem}.
   * @return A new ImmutableEntityHierarchyItem builder
   */
  public static ImmutableEntityHierarchyItem.Builder builder() {
    return new ImmutableEntityHierarchyItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityHierarchyItem ImmutableEntityHierarchyItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KIND = 0x1L;
    private static final long INIT_BIT_LEVEL = 0x2L;
    private long initBits = 0x3L;

    private EntityKind kind;
    private Long id;
    private int level;
    private Long parentId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ParentIdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ParentIdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.LevelProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LevelProvider instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_hierarchy.EntityHierarchyItem} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityHierarchyItem instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof ParentIdProvider) {
        ParentIdProvider instance = (ParentIdProvider) object;
        Optional<Long> parentIdOptional = instance.parentId();
        if (parentIdOptional.isPresent()) {
          parentId(parentIdOptional);
        }
      }
      if (object instanceof LevelProvider) {
        LevelProvider instance = (LevelProvider) object;
        level(instance.level());
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof EntityHierarchyItem) {
        EntityHierarchyItem instance = (EntityHierarchyItem) object;
        kind(instance.kind());
      }
    }

    /**
     * Initializes the value for the {@link EntityHierarchyItem#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityHierarchyItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityHierarchyItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntityHierarchyItem#level() level} attribute.
     * @param level The value for level 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("level")
    public final Builder level(int level) {
      this.level = level;
      initBits &= ~INIT_BIT_LEVEL;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityHierarchyItem#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentId(long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityHierarchyItem#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentId")
    public final Builder parentId(Optional<Long> parentId) {
      this.parentId = parentId.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityHierarchyItem ImmutableEntityHierarchyItem}.
     * @return An immutable instance of EntityHierarchyItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityHierarchyItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityHierarchyItem(kind, id, level, parentId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      if ((initBits & INIT_BIT_LEVEL) != 0) attributes.add("level");
      return "Cannot build EntityHierarchyItem, some of required attributes are not set " + attributes;
    }
  }
}
