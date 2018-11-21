package com.khartec.waltz.model.logical_data_element;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.FieldDataType;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link LogicalDataElement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogicalDataElement.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "LogicalDataElement"})
public final class ImmutableLogicalDataElement
    extends LogicalDataElement {
  private final EntityKind kind;
  private final FieldDataType type;
  private final String provenance;
  private final Long id;
  private final EntityLifecycleStatus entityLifecycleStatus;
  private final String externalId;
  private final String name;
  private final @Nullable String description;

  private ImmutableLogicalDataElement(ImmutableLogicalDataElement.Builder builder) {
    this.type = builder.type;
    this.id = builder.id;
    this.externalId = builder.externalId;
    this.name = builder.name;
    this.description = builder.description;
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.entityLifecycleStatus != null) {
      initShim.entityLifecycleStatus(builder.entityLifecycleStatus);
    }
    this.kind = initShim.kind();
    this.provenance = initShim.provenance();
    this.entityLifecycleStatus = initShim.entityLifecycleStatus();
    this.initShim = null;
  }

  private ImmutableLogicalDataElement(
      EntityKind kind,
      FieldDataType type,
      String provenance,
      Long id,
      EntityLifecycleStatus entityLifecycleStatus,
      String externalId,
      String name,
      @Nullable String description) {
    this.kind = kind;
    this.type = type;
    this.provenance = provenance;
    this.id = id;
    this.entityLifecycleStatus = entityLifecycleStatus;
    this.externalId = externalId;
    this.name = name;
    this.description = description;
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
        this.kind = Objects.requireNonNull(ImmutableLogicalDataElement.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableLogicalDataElement.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private EntityLifecycleStatus entityLifecycleStatus;
    private int entityLifecycleStatusBuildStage;

    EntityLifecycleStatus entityLifecycleStatus() {
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (entityLifecycleStatusBuildStage == STAGE_UNINITIALIZED) {
        entityLifecycleStatusBuildStage = STAGE_INITIALIZING;
        this.entityLifecycleStatus = Objects.requireNonNull(ImmutableLogicalDataElement.super.entityLifecycleStatus(), "entityLifecycleStatus");
        entityLifecycleStatusBuildStage = STAGE_INITIALIZED;
      }
      return this.entityLifecycleStatus;
    }

    void entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
      entityLifecycleStatusBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (entityLifecycleStatusBuildStage == STAGE_INITIALIZING) attributes.add("entityLifecycleStatus");
      return "Cannot build LogicalDataElement, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public FieldDataType type() {
    return type;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code entityLifecycleStatus} attribute
   */
  @JsonProperty("entityLifecycleStatus")
  @Override
  public EntityLifecycleStatus entityLifecycleStatus() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.entityLifecycleStatus()
        : this.entityLifecycleStatus;
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
   * Copy the current immutable object by setting a value for the {@link LogicalDataElement#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalDataElement withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableLogicalDataElement(
        newValue,
        this.type,
        this.provenance,
        this.id,
        this.entityLifecycleStatus,
        this.externalId,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalDataElement#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalDataElement withType(FieldDataType value) {
    if (this.type == value) return this;
    FieldDataType newValue = Objects.requireNonNull(value, "type");
    return new ImmutableLogicalDataElement(
        this.kind,
        newValue,
        this.provenance,
        this.id,
        this.entityLifecycleStatus,
        this.externalId,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalDataElement#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalDataElement withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        newValue,
        this.id,
        this.entityLifecycleStatus,
        this.externalId,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link LogicalDataElement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalDataElement withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        newValue,
        this.entityLifecycleStatus,
        this.externalId,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link LogicalDataElement#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalDataElement withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        value,
        this.entityLifecycleStatus,
        this.externalId,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalDataElement#entityLifecycleStatus() entityLifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityLifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalDataElement withEntityLifecycleStatus(EntityLifecycleStatus value) {
    if (this.entityLifecycleStatus == value) return this;
    EntityLifecycleStatus newValue = Objects.requireNonNull(value, "entityLifecycleStatus");
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        this.id,
        newValue,
        this.externalId,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link LogicalDataElement#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalDataElement withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        this.id,
        this.entityLifecycleStatus,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link LogicalDataElement#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogicalDataElement withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        this.id,
        this.entityLifecycleStatus,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalDataElement#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalDataElement withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        this.id,
        this.entityLifecycleStatus,
        this.externalId,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LogicalDataElement#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogicalDataElement withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableLogicalDataElement(
        this.kind,
        this.type,
        this.provenance,
        this.id,
        this.entityLifecycleStatus,
        this.externalId,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogicalDataElement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogicalDataElement
        && equalTo((ImmutableLogicalDataElement) another);
  }

  private boolean equalTo(ImmutableLogicalDataElement another) {
    return kind.equals(another.kind)
        && type.equals(another.type)
        && provenance.equals(another.provenance)
        && Objects.equals(id, another.id)
        && entityLifecycleStatus.equals(another.entityLifecycleStatus)
        && Objects.equals(externalId, another.externalId)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code type}, {@code provenance}, {@code id}, {@code entityLifecycleStatus}, {@code externalId}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + entityLifecycleStatus.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code LogicalDataElement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("LogicalDataElement{");
    builder.append("kind=").append(kind);
    builder.append(", ");
    builder.append("type=").append(type);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("entityLifecycleStatus=").append(entityLifecycleStatus);
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
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
  static final class Json extends LogicalDataElement {
    EntityKind kind;
    FieldDataType type;
    String provenance;
    Optional<Long> id = Optional.empty();
    EntityLifecycleStatus entityLifecycleStatus;
    Optional<String> externalId = Optional.empty();
    String name;
    String description;
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("type")
    public void setType(FieldDataType type) {
      this.type = type;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("entityLifecycleStatus")
    public void setEntityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = entityLifecycleStatus;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
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
    public FieldDataType type() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public EntityLifecycleStatus entityLifecycleStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
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
  static ImmutableLogicalDataElement fromJson(Json json) {
    ImmutableLogicalDataElement.Builder builder = ImmutableLogicalDataElement.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.entityLifecycleStatus != null) {
      builder.entityLifecycleStatus(json.entityLifecycleStatus);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
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
   * Creates an immutable copy of a {@link LogicalDataElement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LogicalDataElement instance
   */
  public static ImmutableLogicalDataElement copyOf(LogicalDataElement instance) {
    if (instance instanceof ImmutableLogicalDataElement) {
      return (ImmutableLogicalDataElement) instance;
    }
    return ImmutableLogicalDataElement.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogicalDataElement ImmutableLogicalDataElement}.
   * @return A new ImmutableLogicalDataElement builder
   */
  public static ImmutableLogicalDataElement.Builder builder() {
    return new ImmutableLogicalDataElement.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogicalDataElement ImmutableLogicalDataElement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private EntityKind kind;
    private FieldDataType type;
    private String provenance;
    private Long id;
    private EntityLifecycleStatus entityLifecycleStatus;
    private String externalId;
    private String name;
    private String description;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.logical_data_element.LogicalDataElement} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LogicalDataElement instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof LogicalDataElement) {
        LogicalDataElement instance = (LogicalDataElement) object;
        type(instance.type());
        if ((bits & 0x2L) == 0) {
          kind(instance.kind());
          bits |= 0x2L;
        }
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
      if (object instanceof EntityLifecycleStatusProvider) {
        EntityLifecycleStatusProvider instance = (EntityLifecycleStatusProvider) object;
        entityLifecycleStatus(instance.entityLifecycleStatus());
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x2L) == 0) {
          kind(instance.kind());
          bits |= 0x2L;
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link LogicalDataElement#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalDataElement#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalDataElement#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(FieldDataType type) {
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalDataElement#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalDataElement#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalDataElement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalDataElement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalDataElement#entityLifecycleStatus() entityLifecycleStatus} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LogicalDataElement#entityLifecycleStatus() entityLifecycleStatus}.</em>
     * @param entityLifecycleStatus The value for entityLifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityLifecycleStatus")
    public final Builder entityLifecycleStatus(EntityLifecycleStatus entityLifecycleStatus) {
      this.entityLifecycleStatus = Objects.requireNonNull(entityLifecycleStatus, "entityLifecycleStatus");
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalDataElement#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link LogicalDataElement#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link LogicalDataElement#name() name} attribute.
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
     * Initializes the value for the {@link LogicalDataElement#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLogicalDataElement ImmutableLogicalDataElement}.
     * @return An immutable instance of LogicalDataElement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLogicalDataElement build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLogicalDataElement(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build LogicalDataElement, some of required attributes are not set " + attributes;
    }
  }
}
