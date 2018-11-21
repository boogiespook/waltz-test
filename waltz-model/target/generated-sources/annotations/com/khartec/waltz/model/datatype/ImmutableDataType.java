package com.khartec.waltz.model.datatype;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.CodeProvider;
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
 * Immutable implementation of {@link DataType}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataType.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DataType"})
public final class ImmutableDataType extends DataType {
  private final boolean concrete;
  private final EntityKind kind;
  private final boolean unknown;
  private final String name;
  private final @Nullable String description;
  private final String code;
  private final Long id;
  private final Long parentId;

  private ImmutableDataType(ImmutableDataType.Builder builder) {
    this.name = builder.name;
    this.description = builder.description;
    this.code = builder.code;
    this.id = builder.id;
    this.parentId = builder.parentId;
    if (builder.concreteIsSet()) {
      initShim.concrete(builder.concrete);
    }
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.unknownIsSet()) {
      initShim.unknown(builder.unknown);
    }
    this.concrete = initShim.concrete();
    this.kind = initShim.kind();
    this.unknown = initShim.unknown();
    this.initShim = null;
  }

  private ImmutableDataType(
      boolean concrete,
      EntityKind kind,
      boolean unknown,
      String name,
      @Nullable String description,
      String code,
      Long id,
      Long parentId) {
    this.concrete = concrete;
    this.kind = kind;
    this.unknown = unknown;
    this.name = name;
    this.description = description;
    this.code = code;
    this.id = id;
    this.parentId = parentId;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private boolean concrete;
    private int concreteBuildStage;

    boolean concrete() {
      if (concreteBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (concreteBuildStage == STAGE_UNINITIALIZED) {
        concreteBuildStage = STAGE_INITIALIZING;
        this.concrete = ImmutableDataType.super.concrete();
        concreteBuildStage = STAGE_INITIALIZED;
      }
      return this.concrete;
    }

    void concrete(boolean concrete) {
      this.concrete = concrete;
      concreteBuildStage = STAGE_INITIALIZED;
    }
    private EntityKind kind;
    private int kindBuildStage;

    EntityKind kind() {
      if (kindBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (kindBuildStage == STAGE_UNINITIALIZED) {
        kindBuildStage = STAGE_INITIALIZING;
        this.kind = Objects.requireNonNull(ImmutableDataType.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }
    private boolean unknown;
    private int unknownBuildStage;

    boolean unknown() {
      if (unknownBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (unknownBuildStage == STAGE_UNINITIALIZED) {
        unknownBuildStage = STAGE_INITIALIZING;
        this.unknown = ImmutableDataType.super.unknown();
        unknownBuildStage = STAGE_INITIALIZED;
      }
      return this.unknown;
    }

    void unknown(boolean unknown) {
      this.unknown = unknown;
      unknownBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (concreteBuildStage == STAGE_INITIALIZING) attributes.add("concrete");
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (unknownBuildStage == STAGE_INITIALIZING) attributes.add("unknown");
      return "Cannot build DataType, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code concrete} attribute
   */
  @JsonProperty("concrete")
  @Override
  public boolean concrete() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.concrete()
        : this.concrete;
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
   * @return The value of the {@code unknown} attribute
   */
  @JsonProperty("unknown")
  @Override
  public boolean unknown() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.unknown()
        : this.unknown;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public String code() {
    return code;
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
   * Copy the current immutable object by setting a value for the {@link DataType#concrete() concrete} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for concrete
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataType withConcrete(boolean value) {
    if (this.concrete == value) return this;
    return new ImmutableDataType(value, this.kind, this.unknown, this.name, this.description, this.code, this.id, this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataType#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataType withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableDataType(
        this.concrete,
        newValue,
        this.unknown,
        this.name,
        this.description,
        this.code,
        this.id,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataType#unknown() unknown} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for unknown
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataType withUnknown(boolean value) {
    if (this.unknown == value) return this;
    return new ImmutableDataType(this.concrete, this.kind, value, this.name, this.description, this.code, this.id, this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataType#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataType withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableDataType(
        this.concrete,
        this.kind,
        this.unknown,
        newValue,
        this.description,
        this.code,
        this.id,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataType#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataType withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableDataType(this.concrete, this.kind, this.unknown, this.name, value, this.code, this.id, this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DataType#code() code} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDataType withCode(String value) {
    if (this.code.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "code");
    return new ImmutableDataType(
        this.concrete,
        this.kind,
        this.unknown,
        this.name,
        this.description,
        newValue,
        this.id,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataType#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataType withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataType(
        this.concrete,
        this.kind,
        this.unknown,
        this.name,
        this.description,
        this.code,
        newValue,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataType#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataType withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDataType(
        this.concrete,
        this.kind,
        this.unknown,
        this.name,
        this.description,
        this.code,
        value,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataType#parentId() parentId} attribute.
   * @param value The value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataType withParentId(long value) {
    Long newValue = value;
    if (Objects.equals(this.parentId, newValue)) return this;
    return new ImmutableDataType(
        this.concrete,
        this.kind,
        this.unknown,
        this.name,
        this.description,
        this.code,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataType#parentId() parentId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataType withParentId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.parentId, value)) return this;
    return new ImmutableDataType(this.concrete, this.kind, this.unknown, this.name, this.description, this.code, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataType} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataType
        && equalTo((ImmutableDataType) another);
  }

  private boolean equalTo(ImmutableDataType another) {
    return concrete == another.concrete
        && kind.equals(another.kind)
        && unknown == another.unknown
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && code.equals(another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(parentId, another.parentId);
  }

  /**
   * Computes a hash code from attributes: {@code concrete}, {@code kind}, {@code unknown}, {@code name}, {@code description}, {@code code}, {@code id}, {@code parentId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Boolean.hashCode(concrete);
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Boolean.hashCode(unknown);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(parentId);
    return h;
  }

  /**
   * Prints the immutable value {@code DataType} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DataType{");
    builder.append("concrete=").append(concrete);
    builder.append(", ");
    builder.append("kind=").append(kind);
    builder.append(", ");
    builder.append("unknown=").append(unknown);
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("code=").append(code);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
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
  static final class Json extends DataType {
    boolean concrete;
    boolean concreteIsSet;
    EntityKind kind;
    boolean unknown;
    boolean unknownIsSet;
    String name;
    String description;
    String code;
    Optional<Long> id = Optional.empty();
    Optional<Long> parentId = Optional.empty();
    @JsonProperty("concrete")
    public void setConcrete(boolean concrete) {
      this.concrete = concrete;
      this.concreteIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("unknown")
    public void setUnknown(boolean unknown) {
      this.unknown = unknown;
      this.unknownIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @JsonProperty("code")
    public void setCode(String code) {
      this.code = code;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("parentId")
    public void setParentId(Optional<Long> parentId) {
      this.parentId = parentId;
    }
    @Override
    public boolean concrete() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public boolean unknown() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableDataType fromJson(Json json) {
    ImmutableDataType.Builder builder = ImmutableDataType.builder();
    if (json.concreteIsSet) {
      builder.concrete(json.concrete);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.unknownIsSet) {
      builder.unknown(json.unknown);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.parentId != null) {
      builder.parentId(json.parentId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DataType} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataType instance
   */
  public static ImmutableDataType copyOf(DataType instance) {
    if (instance instanceof ImmutableDataType) {
      return (ImmutableDataType) instance;
    }
    return ImmutableDataType.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDataType ImmutableDataType}.
   * @return A new ImmutableDataType builder
   */
  public static ImmutableDataType.Builder builder() {
    return new ImmutableDataType.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDataType ImmutableDataType}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_CONCRETE = 0x1L;
    private static final long OPT_BIT_UNKNOWN = 0x2L;
    private long initBits = 0x3L;
    private long optBits;

    private boolean concrete;
    private EntityKind kind;
    private boolean unknown;
    private String name;
    private String description;
    private String code;
    private Long id;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.datatype.DataType} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DataType instance) {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.CodeProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CodeProvider instance) {
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
      if (object instanceof DataType) {
        DataType instance = (DataType) object;
        concrete(instance.concrete());
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
        unknown(instance.unknown());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof CodeProvider) {
        CodeProvider instance = (CodeProvider) object;
        code(instance.code());
      }
    }

    /**
     * Initializes the value for the {@link DataType#concrete() concrete} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DataType#concrete() concrete}.</em>
     * @param concrete The value for concrete 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("concrete")
    public final Builder concrete(boolean concrete) {
      this.concrete = concrete;
      optBits |= OPT_BIT_CONCRETE;
      return this;
    }

    /**
     * Initializes the value for the {@link DataType#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DataType#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the value for the {@link DataType#unknown() unknown} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DataType#unknown() unknown}.</em>
     * @param unknown The value for unknown 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unknown")
    public final Builder unknown(boolean unknown) {
      this.unknown = unknown;
      optBits |= OPT_BIT_UNKNOWN;
      return this;
    }

    /**
     * Initializes the value for the {@link DataType#name() name} attribute.
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
     * Initializes the value for the {@link DataType#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link DataType#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(String code) {
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DataType#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link DataType#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link DataType#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentId(long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * Initializes the optional value {@link DataType#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentId")
    public final Builder parentId(Optional<Long> parentId) {
      this.parentId = parentId.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDataType ImmutableDataType}.
     * @return An immutable instance of DataType
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDataType build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDataType(this);
    }

    private boolean concreteIsSet() {
      return (optBits & OPT_BIT_CONCRETE) != 0;
    }

    private boolean unknownIsSet() {
      return (optBits & OPT_BIT_UNKNOWN) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_CODE) != 0) attributes.add("code");
      return "Cannot build DataType, some of required attributes are not set " + attributes;
    }
  }
}
