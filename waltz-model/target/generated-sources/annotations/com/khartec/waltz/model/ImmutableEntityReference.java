package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityReference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityReference.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityReference"})
public final class ImmutableEntityReference extends EntityReference {
  private final EntityKind kind;
  private final long id;
  private final String name;
  private final String description;
  private final EntityLifecycleStatus entityLifecycleStatus;

  private ImmutableEntityReference(ImmutableEntityReference.Builder builder) {
    this.kind = builder.kind;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.entityLifecycleStatus = builder.entityLifecycleStatus != null
        ? builder.entityLifecycleStatus
        : Objects.requireNonNull(super.entityLifecycleStatus(), "entityLifecycleStatus");
  }

  private ImmutableEntityReference(
      EntityKind kind,
      long id,
      String name,
      String description,
      EntityLifecycleStatus entityLifecycleStatus) {
    this.kind = kind;
    this.id = id;
    this.name = name;
    this.description = description;
    this.entityLifecycleStatus = entityLifecycleStatus;
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
  public long id() {
    return id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code entityLifecycleStatus} attribute
   */
  @JsonProperty("entityLifecycleStatus")
  @Override
  public EntityLifecycleStatus entityLifecycleStatus() {
    return entityLifecycleStatus;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityReference#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityReference withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableEntityReference(newValue, this.id, this.name, this.description, this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityReference#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityReference withId(long value) {
    if (this.id == value) return this;
    return new ImmutableEntityReference(this.kind, value, this.name, this.description, this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityReference#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityReference withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableEntityReference(this.kind, this.id, newValue, this.description, this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityReference#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityReference withName(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableEntityReference(this.kind, this.id, value, this.description, this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityReference#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityReference withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableEntityReference(this.kind, this.id, this.name, newValue, this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityReference#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityReference withDescription(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityReference(this.kind, this.id, this.name, value, this.entityLifecycleStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityReference#entityLifecycleStatus() entityLifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityLifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityReference withEntityLifecycleStatus(EntityLifecycleStatus value) {
    if (this.entityLifecycleStatus == value) return this;
    EntityLifecycleStatus newValue = Objects.requireNonNull(value, "entityLifecycleStatus");
    return new ImmutableEntityReference(this.kind, this.id, this.name, this.description, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityReference
        && equalTo((ImmutableEntityReference) another);
  }

  private boolean equalTo(ImmutableEntityReference another) {
    return kind.equals(another.kind)
        && id == another.id
        && entityLifecycleStatus.equals(another.entityLifecycleStatus);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code id}, {@code entityLifecycleStatus}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Long.hashCode(id);
    h += (h << 5) + entityLifecycleStatus.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityReference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityReference{");
    builder.append("kind=").append(kind);
    builder.append(", ");
    builder.append("id=").append(id);
    builder.append(", ");
    builder.append("entityLifecycleStatus=").append(entityLifecycleStatus);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityReference {
    EntityKind kind;
    long id;
    boolean idIsSet;
    Optional<String> name = Optional.empty();
    Optional<String> description = Optional.empty();
    EntityLifecycleStatus entityLifecycleStatus;
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("id")
    public void setId(long id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
    }
    @JsonProperty("entityLifecycleStatus")
    public void setEntityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
    }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public long id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public EntityLifecycleStatus entityLifecycleStatus() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityReference fromJson(Json json) {
    ImmutableEntityReference.Builder builder = ImmutableEntityReference.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.entityLifecycleStatus != null) {
      builder.entityLifecycleStatus(json.entityLifecycleStatus);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityReference} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityReference instance
   */
  public static ImmutableEntityReference copyOf(EntityReference instance) {
    if (instance instanceof ImmutableEntityReference) {
      return (ImmutableEntityReference) instance;
    }
    return ImmutableEntityReference.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityReference ImmutableEntityReference}.
   * @return A new ImmutableEntityReference builder
   */
  public static ImmutableEntityReference.Builder builder() {
    return new ImmutableEntityReference.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityReference ImmutableEntityReference}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KIND = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private long initBits = 0x3L;

    private EntityKind kind;
    private long id;
    private String name;
    private String description;
    private EntityLifecycleStatus entityLifecycleStatus;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EntityLifecycleStatusProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityLifecycleStatusProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EntityReference} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityReference instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof EntityLifecycleStatusProvider) {
        EntityLifecycleStatusProvider instance = (EntityLifecycleStatusProvider) object;
        if ((bits & 0x1L) == 0) {
          entityLifecycleStatus(instance.entityLifecycleStatus());
          bits |= 0x1L;
        }
      }
      if (object instanceof EntityReference) {
        EntityReference instance = (EntityReference) object;
        Optional<String> nameOptional = instance.name();
        if (nameOptional.isPresent()) {
          name(nameOptional);
        }
        Optional<String> descriptionOptional = instance.description();
        if (descriptionOptional.isPresent()) {
          description(descriptionOptional);
        }
        if ((bits & 0x1L) == 0) {
          entityLifecycleStatus(instance.entityLifecycleStatus());
          bits |= 0x1L;
        }
        id(instance.id());
        kind(instance.kind());
      }
    }

    /**
     * Initializes the value for the {@link EntityReference#kind() kind} attribute.
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
     * Initializes the value for the {@link EntityReference#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(long id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityReference#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      return this;
    }

    /**
     * Initializes the optional value {@link EntityReference#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      this.name = name.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link EntityReference#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      return this;
    }

    /**
     * Initializes the optional value {@link EntityReference#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      this.description = description.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntityReference#entityLifecycleStatus() entityLifecycleStatus} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityReference#entityLifecycleStatus() entityLifecycleStatus}.</em>
     * @param entityLifecycleStatus The value for entityLifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatus")
    public final Builder entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = Objects.requireNonNull(entityLifecycleStatus, "entityLifecycleStatus");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityReference ImmutableEntityReference}.
     * @return An immutable instance of EntityReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityReference build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityReference(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build EntityReference, some of required attributes are not set " + attributes;
    }
  }
}
