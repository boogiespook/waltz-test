package com.khartec.waltz.model.flow_diagram;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
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
 * Immutable implementation of {@link FlowDiagram}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlowDiagram.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FlowDiagram"})
public final class ImmutableFlowDiagram extends FlowDiagram {
  private final String layoutData;
  private final EntityKind kind;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final boolean isRemoved;

  private ImmutableFlowDiagram(ImmutableFlowDiagram.Builder builder) {
    this.layoutData = builder.layoutData;
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
    if (builder.isRemovedIsSet()) {
      initShim.isRemoved(builder.isRemoved);
    }
    this.kind = initShim.kind();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.isRemoved = initShim.isRemoved();
    this.initShim = null;
  }

  private ImmutableFlowDiagram(
      String layoutData,
      EntityKind kind,
      Long id,
      String name,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      boolean isRemoved) {
    this.layoutData = layoutData;
    this.kind = kind;
    this.id = id;
    this.name = name;
    this.description = description;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
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
        this.kind = Objects.requireNonNull(ImmutableFlowDiagram.super.kind(), "kind");
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
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableFlowDiagram.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }
    private boolean isRemoved;
    private int isRemovedBuildStage;

    boolean isRemoved() {
      if (isRemovedBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isRemovedBuildStage == STAGE_UNINITIALIZED) {
        isRemovedBuildStage = STAGE_INITIALIZING;
        this.isRemoved = ImmutableFlowDiagram.super.isRemoved();
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
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (isRemovedBuildStage == STAGE_INITIALIZING) attributes.add("isRemoved");
      return "Cannot build FlowDiagram, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code layoutData} attribute
   */
  @JsonProperty("layoutData")
  @Override
  public String layoutData() {
    return layoutData;
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
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#layoutData() layoutData} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for layoutData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withLayoutData(String value) {
    if (this.layoutData.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "layoutData");
    return new ImmutableFlowDiagram(
        newValue,
        this.kind,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableFlowDiagram(
        this.layoutData,
        newValue,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FlowDiagram#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlowDiagram withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        newValue,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FlowDiagram#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlowDiagram withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        value,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        this.id,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        this.id,
        this.name,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        this.id,
        this.name,
        this.description,
        newValue,
        this.lastUpdatedBy,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        newValue,
        this.isRemoved);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagram#isRemoved() isRemoved} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRemoved
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagram withIsRemoved(boolean value) {
    if (this.isRemoved == value) return this;
    return new ImmutableFlowDiagram(
        this.layoutData,
        this.kind,
        this.id,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlowDiagram} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlowDiagram
        && equalTo((ImmutableFlowDiagram) another);
  }

  private boolean equalTo(ImmutableFlowDiagram another) {
    return layoutData.equals(another.layoutData)
        && kind.equals(another.kind)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && isRemoved == another.isRemoved;
  }

  /**
   * Computes a hash code from attributes: {@code layoutData}, {@code kind}, {@code id}, {@code name}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code isRemoved}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + layoutData.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + Boolean.hashCode(isRemoved);
    return h;
  }

  /**
   * Prints the immutable value {@code FlowDiagram} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("FlowDiagram{");
    builder.append("layoutData=").append(layoutData);
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
  static final class Json extends FlowDiagram {
    String layoutData;
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    boolean isRemoved;
    boolean isRemovedIsSet;
    @JsonProperty("layoutData")
    public void setLayoutData(String layoutData) {
      this.layoutData = layoutData;
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
    @JsonProperty("isRemoved")
    public void setIsRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      this.isRemovedIsSet = true;
    }
    @Override
    public String layoutData() { throw new UnsupportedOperationException(); }
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
  static ImmutableFlowDiagram fromJson(Json json) {
    ImmutableFlowDiagram.Builder builder = ImmutableFlowDiagram.builder();
    if (json.layoutData != null) {
      builder.layoutData(json.layoutData);
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
    if (json.isRemovedIsSet) {
      builder.isRemoved(json.isRemoved);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FlowDiagram} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FlowDiagram instance
   */
  public static ImmutableFlowDiagram copyOf(FlowDiagram instance) {
    if (instance instanceof ImmutableFlowDiagram) {
      return (ImmutableFlowDiagram) instance;
    }
    return ImmutableFlowDiagram.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFlowDiagram ImmutableFlowDiagram}.
   * @return A new ImmutableFlowDiagram builder
   */
  public static ImmutableFlowDiagram.Builder builder() {
    return new ImmutableFlowDiagram.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFlowDiagram ImmutableFlowDiagram}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_LAYOUT_DATA = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private static final long OPT_BIT_IS_REMOVED = 0x1L;
    private long initBits = 0x7L;
    private long optBits;

    private String layoutData;
    private EntityKind kind;
    private Long id;
    private String name;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.flow_diagram.FlowDiagram} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FlowDiagram instance) {
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
      if (object instanceof FlowDiagram) {
        FlowDiagram instance = (FlowDiagram) object;
        layoutData(instance.layoutData());
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
     * Initializes the value for the {@link FlowDiagram#layoutData() layoutData} attribute.
     * @param layoutData The value for layoutData 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("layoutData")
    public final Builder layoutData(String layoutData) {
      this.layoutData = Objects.requireNonNull(layoutData, "layoutData");
      initBits &= ~INIT_BIT_LAYOUT_DATA;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagram#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlowDiagram#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link FlowDiagram#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link FlowDiagram#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagram#name() name} attribute.
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
     * Initializes the value for the {@link FlowDiagram#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagram#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlowDiagram#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagram#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link FlowDiagram#isRemoved() isRemoved} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlowDiagram#isRemoved() isRemoved}.</em>
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
     * Builds a new {@link ImmutableFlowDiagram ImmutableFlowDiagram}.
     * @return An immutable instance of FlowDiagram
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFlowDiagram build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFlowDiagram(this);
    }

    private boolean isRemovedIsSet() {
      return (optBits & OPT_BIT_IS_REMOVED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_LAYOUT_DATA) != 0) attributes.add("layoutData");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build FlowDiagram, some of required attributes are not set " + attributes;
    }
  }
}
