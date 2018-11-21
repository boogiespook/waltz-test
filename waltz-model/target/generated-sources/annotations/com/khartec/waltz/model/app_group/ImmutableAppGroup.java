package com.khartec.waltz.model.app_group;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppGroup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppGroup.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppGroup"})
public final class ImmutableAppGroup extends AppGroup {
  private final AppGroupKind appGroupKind;
  private final EntityKind kind;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final String externalId;
  private final boolean isRemoved;

  private ImmutableAppGroup(ImmutableAppGroup.Builder builder) {
    this.appGroupKind = builder.appGroupKind;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.externalId = builder.externalId;
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.isRemovedIsSet()) {
      initShim.isRemoved(builder.isRemoved);
    }
    this.kind = initShim.kind();
    this.isRemoved = initShim.isRemoved();
    this.initShim = null;
  }

  private ImmutableAppGroup(
      AppGroupKind appGroupKind,
      EntityKind kind,
      Long id,
      String name,
      @Nullable String description,
      String externalId,
      boolean isRemoved) {
    this.appGroupKind = appGroupKind;
    this.kind = kind;
    this.id = id;
    this.name = name;
    this.description = description;
    this.externalId = externalId;
    this.isRemoved = isRemoved;
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
        this.kind = Objects.requireNonNull(ImmutableAppGroup.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }
    private boolean isRemoved;
    private int isRemovedBuildStage;

    boolean isRemoved() {
      if (isRemovedBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isRemovedBuildStage == STAGE_UNINITIALIZED) {
        isRemovedBuildStage = STAGE_INITIALIZING;
        this.isRemoved = ImmutableAppGroup.super.isRemoved();
        isRemovedBuildStage = STAGE_INITIALIZED;
      }
      return this.isRemoved;
    }

    void isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      isRemovedBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (isRemovedBuildStage == STAGE_INITIALIZING) attributes.add("isRemoved");
      return "Cannot build AppGroup, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code appGroupKind} attribute
   */
  @JsonProperty("appGroupKind")
  @Override
  public AppGroupKind appGroupKind() {
    return appGroupKind;
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
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
  }

  /**
   * @return The value of the {@code isRemoved} attribute
   */
  @JsonProperty("isRemoved")
  @Override
  public boolean isRemoved() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isRemoved()
        : this.isRemoved;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroup#appGroupKind() appGroupKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appGroupKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroup withAppGroupKind(AppGroupKind value) {
    if (this.appGroupKind == value) return this;
    AppGroupKind newValue = Objects.requireNonNull(value, "appGroupKind");
    return new ImmutableAppGroup(newValue, this.kind, this.id, this.name, this.description, this.externalId, this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroup#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroup withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableAppGroup(
        this.appGroupKind,
        newValue,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppGroup#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroup withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAppGroup(
        this.appGroupKind,
        this.kind,
        newValue,
        this.name,
        this.description,
        this.externalId,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppGroup#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroup withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAppGroup(
        this.appGroupKind,
        this.kind,
        value,
        this.name,
        this.description,
        this.externalId,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroup#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroup withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableAppGroup(
        this.appGroupKind,
        this.kind,
        this.id,
        newValue,
        this.description,
        this.externalId,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroup#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroup withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAppGroup(this.appGroupKind, this.kind, this.id, this.name, value, this.externalId, this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppGroup#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroup withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableAppGroup(this.appGroupKind, this.kind, this.id, this.name, this.description, newValue, this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppGroup#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroup withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableAppGroup(this.appGroupKind, this.kind, this.id, this.name, this.description, value, this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroup#isRemoved() isRemoved} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRemoved
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroup withIsRemoved(boolean value) {
    if (this.isRemoved == value) return this;
    return new ImmutableAppGroup(this.appGroupKind, this.kind, this.id, this.name, this.description, this.externalId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppGroup
        && equalTo((ImmutableAppGroup) another);
  }

  private boolean equalTo(ImmutableAppGroup another) {
    return appGroupKind.equals(another.appGroupKind)
        && kind.equals(another.kind)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(externalId, another.externalId)
        && isRemoved == another.isRemoved;
  }

  /**
   * Computes a hash code from attributes: {@code appGroupKind}, {@code kind}, {@code id}, {@code name}, {@code description}, {@code externalId}, {@code isRemoved}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + appGroupKind.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + Boolean.hashCode(isRemoved);
    return h;
  }

  /**
   * Prints the immutable value {@code AppGroup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AppGroup{");
    builder.append("appGroupKind=").append(appGroupKind);
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
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    builder.append(", ");
    builder.append("isRemoved=").append(isRemoved);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppGroup {
    AppGroupKind appGroupKind;
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    Optional<String> externalId = Optional.empty();
    boolean isRemoved;
    boolean isRemovedIsSet;
    @JsonProperty("appGroupKind")
    public void setAppGroupKind(AppGroupKind appGroupKind) {
      this.appGroupKind = appGroupKind;
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
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("isRemoved")
    public void setIsRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      this.isRemovedIsSet = true;
    }
    @Override
    public AppGroupKind appGroupKind() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isRemoved() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppGroup fromJson(Json json) {
    ImmutableAppGroup.Builder builder = ImmutableAppGroup.builder();
    if (json.appGroupKind != null) {
      builder.appGroupKind(json.appGroupKind);
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
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.isRemovedIsSet) {
      builder.isRemoved(json.isRemoved);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppGroup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppGroup instance
   */
  public static ImmutableAppGroup copyOf(AppGroup instance) {
    if (instance instanceof ImmutableAppGroup) {
      return (ImmutableAppGroup) instance;
    }
    return ImmutableAppGroup.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppGroup ImmutableAppGroup}.
   * @return A new ImmutableAppGroup builder
   */
  public static ImmutableAppGroup.Builder builder() {
    return new ImmutableAppGroup.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppGroup ImmutableAppGroup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APP_GROUP_KIND = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_IS_REMOVED = 0x1L;
    private long initBits = 0x3L;
    private long optBits;

    private AppGroupKind appGroupKind;
    private EntityKind kind;
    private Long id;
    private String name;
    private String description;
    private String externalId;
    private boolean isRemoved;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IsRemovedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IsRemovedProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.app_group.AppGroup} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppGroup instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ExternalIdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ExternalIdProvider instance) {
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
      if (object instanceof IsRemovedProvider) {
        IsRemovedProvider instance = (IsRemovedProvider) object;
        isRemoved(instance.isRemoved());
      }
      if (object instanceof AppGroup) {
        AppGroup instance = (AppGroup) object;
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
        appGroupKind(instance.appGroupKind());
      }
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
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
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link AppGroup#appGroupKind() appGroupKind} attribute.
     * @param appGroupKind The value for appGroupKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appGroupKind")
    public final Builder appGroupKind(AppGroupKind appGroupKind) {
      this.appGroupKind = Objects.requireNonNull(appGroupKind, "appGroupKind");
      initBits &= ~INIT_BIT_APP_GROUP_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroup#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AppGroup#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link AppGroup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AppGroup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroup#name() name} attribute.
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
     * Initializes the value for the {@link AppGroup#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link AppGroup#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link AppGroup#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroup#isRemoved() isRemoved} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AppGroup#isRemoved() isRemoved}.</em>
     * @param isRemoved The value for isRemoved 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isRemoved")
    public final Builder isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      optBits |= OPT_BIT_IS_REMOVED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppGroup ImmutableAppGroup}.
     * @return An immutable instance of AppGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppGroup build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppGroup(this);
    }

    private boolean isRemovedIsSet() {
      return (optBits & OPT_BIT_IS_REMOVED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APP_GROUP_KIND) != 0) attributes.add("appGroupKind");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build AppGroup, some of required attributes are not set " + attributes;
    }
  }
}
