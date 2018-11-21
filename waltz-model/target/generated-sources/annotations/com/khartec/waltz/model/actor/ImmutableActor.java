package com.khartec.waltz.model.actor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Actor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActor.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Actor"})
public final class ImmutableActor extends Actor {
  private final boolean isExternal;
  private final EntityKind kind;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableActor(ImmutableActor.Builder builder) {
    this.isExternal = builder.isExternal;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.kind = initShim.kind();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutableActor(
      boolean isExternal,
      EntityKind kind,
      Long id,
      String name,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.isExternal = isExternal;
    this.kind = kind;
    this.id = id;
    this.name = name;
    this.description = description;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private EntityKind kind;
    private int kindBuildStage;

    EntityKind kind() {
      if (kindBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (kindBuildStage == STAGE_UNINITIALIZED) {
        kindBuildStage = STAGE_INITIALIZING;
        this.kind = Objects.requireNonNull(ImmutableActor.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableActor.super.lastUpdatedAt(), "lastUpdatedAt");
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
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build Actor, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code isExternal} attribute
   */
  @JsonProperty("isExternal")
  @Override
  public boolean isExternal() {
    return isExternal;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public EntityKind kind() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.kind()
        : this.kind;
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
   * Copy the current immutable object by setting a value for the {@link Actor#isExternal() isExternal} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isExternal
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActor withIsExternal(boolean value) {
    if (this.isExternal == value) return this;
    return new ImmutableActor(value, this.kind, this.id, this.name, this.description, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Actor#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActor withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableActor(
        this.isExternal,
        newValue,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Actor#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActor withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableActor(
        this.isExternal,
        this.kind,
        newValue,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Actor#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActor withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableActor(
        this.isExternal,
        this.kind,
        value,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Actor#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActor withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableActor(
        this.isExternal,
        this.kind,
        this.id,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Actor#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActor withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableActor(this.isExternal, this.kind, this.id, this.name, value, this.lastUpdatedAt, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Actor#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActor withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableActor(this.isExternal, this.kind, this.id, this.name, this.description, newValue, this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Actor#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActor withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableActor(this.isExternal, this.kind, this.id, this.name, this.description, this.lastUpdatedAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActor
        && equalTo((ImmutableActor) another);
  }

  private boolean equalTo(ImmutableActor another) {
    return isExternal == another.isExternal
        && kind.equals(another.kind)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code isExternal}, {@code kind}, {@code id}, {@code name}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Boolean.hashCode(isExternal);
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Actor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Actor{");
    builder.append("isExternal=").append(isExternal);
    builder.append(", ");
    builder.append("kind=").append(kind);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Actor {
    boolean isExternal;
    boolean isExternalIsSet;
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("isExternal")
    public void setIsExternal(boolean isExternal) {
      this.isExternal = isExternal;
      this.isExternalIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
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
    public boolean isExternal() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
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
  static ImmutableActor fromJson(Json json) {
    ImmutableActor.Builder builder = ImmutableActor.builder();
    if (json.isExternalIsSet) {
      builder.isExternal(json.isExternal);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
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
   * Creates an immutable copy of a {@link Actor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Actor instance
   */
  public static ImmutableActor copyOf(Actor instance) {
    if (instance instanceof ImmutableActor) {
      return (ImmutableActor) instance;
    }
    return ImmutableActor.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableActor ImmutableActor}.
   * @return A new ImmutableActor builder
   */
  public static ImmutableActor.Builder builder() {
    return new ImmutableActor.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableActor ImmutableActor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_IS_EXTERNAL = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private long initBits = 0x7L;

    private boolean isExternal;
    private EntityKind kind;
    private Long id;
    private String name;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.actor.Actor} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Actor instance) {
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
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
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
      if (object instanceof Actor) {
        Actor instance = (Actor) object;
        isExternal(instance.isExternal());
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
     * Initializes the value for the {@link Actor#isExternal() isExternal} attribute.
     * @param isExternal The value for isExternal 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isExternal")
    public final Builder isExternal(boolean isExternal) {
      this.isExternal = isExternal;
      initBits &= ~INIT_BIT_IS_EXTERNAL;
      return this;
    }

    /**
     * Initializes the value for the {@link Actor#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Actor#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link Actor#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Actor#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Actor#name() name} attribute.
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
     * Initializes the value for the {@link Actor#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link Actor#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Actor#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link Actor#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Builds a new {@link ImmutableActor ImmutableActor}.
     * @return An immutable instance of Actor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableActor build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableActor(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_IS_EXTERNAL) != 0) attributes.add("isExternal");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build Actor, some of required attributes are not set " + attributes;
    }
  }
}
