package com.khartec.waltz.model.orgunit;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ParentIdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link OrganisationalUnit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganisationalUnit.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "OrganisationalUnit"})
public final class ImmutableOrganisationalUnit extends OrganisationalUnit {
  private final EntityKind kind;
  private final Long id;
  private final Long parentId;
  private final String name;
  private final @Nullable String description;

  private ImmutableOrganisationalUnit(ImmutableOrganisationalUnit.Builder builder) {
    this.id = builder.id;
    this.parentId = builder.parentId;
    this.name = builder.name;
    this.description = builder.description;
    this.kind = builder.kind != null
        ? builder.kind
        : Objects.requireNonNull(super.kind(), "kind");
  }

  private ImmutableOrganisationalUnit(
      EntityKind kind,
      Long id,
      Long parentId,
      String name,
      @Nullable String description) {
    this.kind = kind;
    this.id = id;
    this.parentId = parentId;
    this.name = name;
    this.description = description;
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
   * @return The value of the {@code parentId} attribute
   */
  @JsonProperty("parentId")
  @Override
  public Optional<Long> parentId() {
    return Optional.ofNullable(parentId);
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
   * Copy the current immutable object by setting a value for the {@link OrganisationalUnit#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganisationalUnit withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableOrganisationalUnit(newValue, this.id, this.parentId, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganisationalUnit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnit withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableOrganisationalUnit(this.kind, newValue, this.parentId, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganisationalUnit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnit withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableOrganisationalUnit(this.kind, value, this.parentId, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OrganisationalUnit#parentId() parentId} attribute.
   * @param value The value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnit withParentId(long value) {
    Long newValue = value;
    if (Objects.equals(this.parentId, newValue)) return this;
    return new ImmutableOrganisationalUnit(this.kind, this.id, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OrganisationalUnit#parentId() parentId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganisationalUnit withParentId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.parentId, value)) return this;
    return new ImmutableOrganisationalUnit(this.kind, this.id, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrganisationalUnit#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganisationalUnit withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableOrganisationalUnit(this.kind, this.id, this.parentId, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OrganisationalUnit#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganisationalUnit withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableOrganisationalUnit(this.kind, this.id, this.parentId, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganisationalUnit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganisationalUnit
        && equalTo((ImmutableOrganisationalUnit) another);
  }

  private boolean equalTo(ImmutableOrganisationalUnit another) {
    return kind.equals(another.kind)
        && Objects.equals(id, another.id)
        && Objects.equals(parentId, another.parentId)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code id}, {@code parentId}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(parentId);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code OrganisationalUnit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OrganisationalUnit{");
    builder.append("kind=").append(kind);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (parentId != null) {
      builder.append(", ");
      builder.append("parentId=").append(parentId);
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
  static final class Json extends OrganisationalUnit {
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    Optional<Long> parentId = Optional.empty();
    String name;
    String description;
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("parentId")
    public void setParentId(Optional<Long> parentId) {
      this.parentId = parentId;
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
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> parentId() { throw new UnsupportedOperationException(); }
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
  static ImmutableOrganisationalUnit fromJson(Json json) {
    ImmutableOrganisationalUnit.Builder builder = ImmutableOrganisationalUnit.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.parentId != null) {
      builder.parentId(json.parentId);
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
   * Creates an immutable copy of a {@link OrganisationalUnit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OrganisationalUnit instance
   */
  public static ImmutableOrganisationalUnit copyOf(OrganisationalUnit instance) {
    if (instance instanceof ImmutableOrganisationalUnit) {
      return (ImmutableOrganisationalUnit) instance;
    }
    return ImmutableOrganisationalUnit.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOrganisationalUnit ImmutableOrganisationalUnit}.
   * @return A new ImmutableOrganisationalUnit builder
   */
  public static ImmutableOrganisationalUnit.Builder builder() {
    return new ImmutableOrganisationalUnit.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOrganisationalUnit ImmutableOrganisationalUnit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private EntityKind kind;
    private Long id;
    private Long parentId;
    private String name;
    private String description;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EntityKindProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityKindProvider instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.orgunit.OrganisationalUnit} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(OrganisationalUnit instance) {
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
      long bits = 0;
      if (object instanceof ParentIdProvider) {
        ParentIdProvider instance = (ParentIdProvider) object;
        Optional<Long> parentIdOptional = instance.parentId();
        if (parentIdOptional.isPresent()) {
          parentId(parentIdOptional);
        }
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
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
      if (object instanceof OrganisationalUnit) {
        OrganisationalUnit instance = (OrganisationalUnit) object;
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link OrganisationalUnit#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link OrganisationalUnit#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link OrganisationalUnit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganisationalUnit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link OrganisationalUnit#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentId(long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * Initializes the optional value {@link OrganisationalUnit#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentId")
    public final Builder parentId(Optional<Long> parentId) {
      this.parentId = parentId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link OrganisationalUnit#name() name} attribute.
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
     * Initializes the value for the {@link OrganisationalUnit#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOrganisationalUnit ImmutableOrganisationalUnit}.
     * @return An immutable instance of OrganisationalUnit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOrganisationalUnit build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOrganisationalUnit(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build OrganisationalUnit, some of required attributes are not set " + attributes;
    }
  }
}
