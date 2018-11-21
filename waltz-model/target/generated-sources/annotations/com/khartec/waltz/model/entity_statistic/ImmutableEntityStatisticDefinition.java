package com.khartec.waltz.model.entity_statistic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ParentIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityStatisticDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityStatisticDefinition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityStatisticDefinition"})
public final class ImmutableEntityStatisticDefinition
    extends EntityStatisticDefinition {
  private final StatisticType type;
  private final StatisticCategory category;
  private final boolean active;
  private final RollupKind rollupKind;
  private final String renderer;
  private final String historicRenderer;
  private final Boolean entityVisibility;
  private final Boolean rollupVisibility;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final String provenance;
  private final Long parentId;

  private ImmutableEntityStatisticDefinition(ImmutableEntityStatisticDefinition.Builder builder) {
    this.type = builder.type;
    this.category = builder.category;
    this.active = builder.active;
    this.renderer = builder.renderer;
    this.historicRenderer = builder.historicRenderer;
    this.entityVisibility = builder.entityVisibility;
    this.rollupVisibility = builder.rollupVisibility;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.parentId = builder.parentId;
    if (builder.rollupKind != null) {
      initShim.rollupKind(builder.rollupKind);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.rollupKind = initShim.rollupKind();
    this.provenance = initShim.provenance();
    this.initShim = null;
  }

  private ImmutableEntityStatisticDefinition(
      StatisticType type,
      StatisticCategory category,
      boolean active,
      RollupKind rollupKind,
      String renderer,
      String historicRenderer,
      Boolean entityVisibility,
      Boolean rollupVisibility,
      Long id,
      String name,
      @Nullable String description,
      String provenance,
      Long parentId) {
    this.type = type;
    this.category = category;
    this.active = active;
    this.rollupKind = rollupKind;
    this.renderer = renderer;
    this.historicRenderer = historicRenderer;
    this.entityVisibility = entityVisibility;
    this.rollupVisibility = rollupVisibility;
    this.id = id;
    this.name = name;
    this.description = description;
    this.provenance = provenance;
    this.parentId = parentId;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private RollupKind rollupKind;
    private int rollupKindBuildStage;

    RollupKind rollupKind() {
      if (rollupKindBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (rollupKindBuildStage == STAGE_UNINITIALIZED) {
        rollupKindBuildStage = STAGE_INITIALIZING;
        this.rollupKind = Objects.requireNonNull(ImmutableEntityStatisticDefinition.super.rollupKind(), "rollupKind");
        rollupKindBuildStage = STAGE_INITIALIZED;
      }
      return this.rollupKind;
    }

    void rollupKind(RollupKind rollupKind) {
      this.rollupKind = rollupKind;
      rollupKindBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableEntityStatisticDefinition.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (rollupKindBuildStage == STAGE_INITIALIZING) attributes.add("rollupKind");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build EntityStatisticDefinition, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public StatisticType type() {
    return type;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public StatisticCategory category() {
    return category;
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public boolean active() {
    return active;
  }

  /**
   * @return The value of the {@code rollupKind} attribute
   */
  @JsonProperty("rollupKind")
  @Override
  public RollupKind rollupKind() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.rollupKind()
        : this.rollupKind;
  }

  /**
   * @return The value of the {@code renderer} attribute
   */
  @JsonProperty("renderer")
  @Override
  public String renderer() {
    return renderer;
  }

  /**
   * @return The value of the {@code historicRenderer} attribute
   */
  @JsonProperty("historicRenderer")
  @Override
  public String historicRenderer() {
    return historicRenderer;
  }

  /**
   * @return The value of the {@code entityVisibility} attribute
   */
  @JsonProperty("entityVisibility")
  @Override
  public Boolean entityVisibility() {
    return entityVisibility;
  }

  /**
   * @return The value of the {@code rollupVisibility} attribute
   */
  @JsonProperty("rollupVisibility")
  @Override
  public Boolean rollupVisibility() {
    return rollupVisibility;
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
   * @return The value of the {@code parentId} attribute
   */
  @JsonProperty("parentId")
  @Override
  public Optional<Long> parentId() {
    return Optional.ofNullable(parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withType(StatisticType value) {
    if (this.type == value) return this;
    StatisticType newValue = Objects.requireNonNull(value, "type");
    return new ImmutableEntityStatisticDefinition(
        newValue,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#category() category} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withCategory(StatisticCategory value) {
    if (this.category == value) return this;
    StatisticCategory newValue = Objects.requireNonNull(value, "category");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        newValue,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#active() active} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for active
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withActive(boolean value) {
    if (this.active == value) return this;
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        value,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#rollupKind() rollupKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rollupKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withRollupKind(RollupKind value) {
    if (this.rollupKind == value) return this;
    RollupKind newValue = Objects.requireNonNull(value, "rollupKind");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        newValue,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#renderer() renderer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for renderer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withRenderer(String value) {
    if (this.renderer.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "renderer");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        newValue,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#historicRenderer() historicRenderer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for historicRenderer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withHistoricRenderer(String value) {
    if (this.historicRenderer.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "historicRenderer");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        newValue,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#entityVisibility() entityVisibility} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityVisibility
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withEntityVisibility(Boolean value) {
    if (this.entityVisibility.equals(value)) return this;
    Boolean newValue = Objects.requireNonNull(value, "entityVisibility");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        newValue,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#rollupVisibility() rollupVisibility} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rollupVisibility
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withRollupVisibility(Boolean value) {
    if (this.rollupVisibility.equals(value)) return this;
    Boolean newValue = Objects.requireNonNull(value, "rollupVisibility");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        newValue,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityStatisticDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        newValue,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityStatisticDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        value,
        this.name,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        newValue,
        this.description,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        value,
        this.provenance,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticDefinition#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        newValue,
        this.parentId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityStatisticDefinition#parentId() parentId} attribute.
   * @param value The value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withParentId(long value) {
    Long newValue = value;
    if (Objects.equals(this.parentId, newValue)) return this;
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityStatisticDefinition#parentId() parentId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticDefinition withParentId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.parentId, value)) return this;
    return new ImmutableEntityStatisticDefinition(
        this.type,
        this.category,
        this.active,
        this.rollupKind,
        this.renderer,
        this.historicRenderer,
        this.entityVisibility,
        this.rollupVisibility,
        this.id,
        this.name,
        this.description,
        this.provenance,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityStatisticDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityStatisticDefinition
        && equalTo((ImmutableEntityStatisticDefinition) another);
  }

  private boolean equalTo(ImmutableEntityStatisticDefinition another) {
    return type.equals(another.type)
        && category.equals(another.category)
        && active == another.active
        && rollupKind.equals(another.rollupKind)
        && renderer.equals(another.renderer)
        && historicRenderer.equals(another.historicRenderer)
        && entityVisibility.equals(another.entityVisibility)
        && rollupVisibility.equals(another.rollupVisibility)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance)
        && Objects.equals(parentId, another.parentId);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code category}, {@code active}, {@code rollupKind}, {@code renderer}, {@code historicRenderer}, {@code entityVisibility}, {@code rollupVisibility}, {@code id}, {@code name}, {@code description}, {@code provenance}, {@code parentId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Boolean.hashCode(active);
    h += (h << 5) + rollupKind.hashCode();
    h += (h << 5) + renderer.hashCode();
    h += (h << 5) + historicRenderer.hashCode();
    h += (h << 5) + entityVisibility.hashCode();
    h += (h << 5) + rollupVisibility.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Objects.hashCode(parentId);
    return h;
  }

  /**
   * Prints the immutable value {@code EntityStatisticDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityStatisticDefinition{");
    builder.append("type=").append(type);
    builder.append(", ");
    builder.append("category=").append(category);
    builder.append(", ");
    builder.append("active=").append(active);
    builder.append(", ");
    builder.append("rollupKind=").append(rollupKind);
    builder.append(", ");
    builder.append("renderer=").append(renderer);
    builder.append(", ");
    builder.append("historicRenderer=").append(historicRenderer);
    builder.append(", ");
    builder.append("entityVisibility=").append(entityVisibility);
    builder.append(", ");
    builder.append("rollupVisibility=").append(rollupVisibility);
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
    builder.append("provenance=").append(provenance);
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
  static final class Json extends EntityStatisticDefinition {
    StatisticType type;
    StatisticCategory category;
    boolean active;
    boolean activeIsSet;
    RollupKind rollupKind;
    String renderer;
    String historicRenderer;
    Boolean entityVisibility;
    Boolean rollupVisibility;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    String provenance;
    Optional<Long> parentId = Optional.empty();
    @JsonProperty("type")
    public void setType(StatisticType type) {
      this.type = type;
    }
    @JsonProperty("category")
    public void setCategory(StatisticCategory category) {
      this.category = category;
    }
    @JsonProperty("active")
    public void setActive(boolean active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("rollupKind")
    public void setRollupKind(RollupKind rollupKind) {
      this.rollupKind = rollupKind;
    }
    @JsonProperty("renderer")
    public void setRenderer(String renderer) {
      this.renderer = renderer;
    }
    @JsonProperty("historicRenderer")
    public void setHistoricRenderer(String historicRenderer) {
      this.historicRenderer = historicRenderer;
    }
    @JsonProperty("entityVisibility")
    public void setEntityVisibility(Boolean entityVisibility) {
      this.entityVisibility = entityVisibility;
    }
    @JsonProperty("rollupVisibility")
    public void setRollupVisibility(Boolean rollupVisibility) {
      this.rollupVisibility = rollupVisibility;
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
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("parentId")
    public void setParentId(Optional<Long> parentId) {
      this.parentId = parentId;
    }
    @Override
    public StatisticType type() { throw new UnsupportedOperationException(); }
    @Override
    public StatisticCategory category() { throw new UnsupportedOperationException(); }
    @Override
    public boolean active() { throw new UnsupportedOperationException(); }
    @Override
    public RollupKind rollupKind() { throw new UnsupportedOperationException(); }
    @Override
    public String renderer() { throw new UnsupportedOperationException(); }
    @Override
    public String historicRenderer() { throw new UnsupportedOperationException(); }
    @Override
    public Boolean entityVisibility() { throw new UnsupportedOperationException(); }
    @Override
    public Boolean rollupVisibility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityStatisticDefinition fromJson(Json json) {
    ImmutableEntityStatisticDefinition.Builder builder = ImmutableEntityStatisticDefinition.builder();
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.rollupKind != null) {
      builder.rollupKind(json.rollupKind);
    }
    if (json.renderer != null) {
      builder.renderer(json.renderer);
    }
    if (json.historicRenderer != null) {
      builder.historicRenderer(json.historicRenderer);
    }
    if (json.entityVisibility != null) {
      builder.entityVisibility(json.entityVisibility);
    }
    if (json.rollupVisibility != null) {
      builder.rollupVisibility(json.rollupVisibility);
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
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.parentId != null) {
      builder.parentId(json.parentId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityStatisticDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityStatisticDefinition instance
   */
  public static ImmutableEntityStatisticDefinition copyOf(EntityStatisticDefinition instance) {
    if (instance instanceof ImmutableEntityStatisticDefinition) {
      return (ImmutableEntityStatisticDefinition) instance;
    }
    return ImmutableEntityStatisticDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityStatisticDefinition ImmutableEntityStatisticDefinition}.
   * @return A new ImmutableEntityStatisticDefinition builder
   */
  public static ImmutableEntityStatisticDefinition.Builder builder() {
    return new ImmutableEntityStatisticDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityStatisticDefinition ImmutableEntityStatisticDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_CATEGORY = 0x2L;
    private static final long INIT_BIT_ACTIVE = 0x4L;
    private static final long INIT_BIT_RENDERER = 0x8L;
    private static final long INIT_BIT_HISTORIC_RENDERER = 0x10L;
    private static final long INIT_BIT_ENTITY_VISIBILITY = 0x20L;
    private static final long INIT_BIT_ROLLUP_VISIBILITY = 0x40L;
    private static final long INIT_BIT_NAME = 0x80L;
    private long initBits = 0xffL;

    private StatisticType type;
    private StatisticCategory category;
    private boolean active;
    private RollupKind rollupKind;
    private String renderer;
    private String historicRenderer;
    private Boolean entityVisibility;
    private Boolean rollupVisibility;
    private Long id;
    private String name;
    private String description;
    private String provenance;
    private Long parentId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_statistic.EntityStatisticDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityStatisticDefinition instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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
      if (object instanceof EntityStatisticDefinition) {
        EntityStatisticDefinition instance = (EntityStatisticDefinition) object;
        renderer(instance.renderer());
        historicRenderer(instance.historicRenderer());
        entityVisibility(instance.entityVisibility());
        active(instance.active());
        rollupKind(instance.rollupKind());
        type(instance.type());
        category(instance.category());
        rollupVisibility(instance.rollupVisibility());
      }
      if (object instanceof ParentIdProvider) {
        ParentIdProvider instance = (ParentIdProvider) object;
        Optional<Long> parentIdOptional = instance.parentId();
        if (parentIdOptional.isPresent()) {
          parentId(parentIdOptional);
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
        provenance(instance.provenance());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(StatisticType type) {
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(StatisticCategory category) {
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#active() active} attribute.
     * @param active The value for active 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("active")
    public final Builder active(boolean active) {
      this.active = active;
      initBits &= ~INIT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#rollupKind() rollupKind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityStatisticDefinition#rollupKind() rollupKind}.</em>
     * @param rollupKind The value for rollupKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rollupKind")
    public final Builder rollupKind(RollupKind rollupKind) {
      this.rollupKind = Objects.requireNonNull(rollupKind, "rollupKind");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#renderer() renderer} attribute.
     * @param renderer The value for renderer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("renderer")
    public final Builder renderer(String renderer) {
      this.renderer = Objects.requireNonNull(renderer, "renderer");
      initBits &= ~INIT_BIT_RENDERER;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#historicRenderer() historicRenderer} attribute.
     * @param historicRenderer The value for historicRenderer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("historicRenderer")
    public final Builder historicRenderer(String historicRenderer) {
      this.historicRenderer = Objects.requireNonNull(historicRenderer, "historicRenderer");
      initBits &= ~INIT_BIT_HISTORIC_RENDERER;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#entityVisibility() entityVisibility} attribute.
     * @param entityVisibility The value for entityVisibility 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityVisibility")
    public final Builder entityVisibility(Boolean entityVisibility) {
      this.entityVisibility = Objects.requireNonNull(entityVisibility, "entityVisibility");
      initBits &= ~INIT_BIT_ENTITY_VISIBILITY;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#rollupVisibility() rollupVisibility} attribute.
     * @param rollupVisibility The value for rollupVisibility 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rollupVisibility")
    public final Builder rollupVisibility(Boolean rollupVisibility) {
      this.rollupVisibility = Objects.requireNonNull(rollupVisibility, "rollupVisibility");
      initBits &= ~INIT_BIT_ROLLUP_VISIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityStatisticDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityStatisticDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#name() name} attribute.
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
     * Initializes the value for the {@link EntityStatisticDefinition#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticDefinition#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityStatisticDefinition#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the optional value {@link EntityStatisticDefinition#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentId(long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityStatisticDefinition#parentId() parentId} to parentId.
     * @param parentId The value for parentId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentId")
    public final Builder parentId(Optional<Long> parentId) {
      this.parentId = parentId.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityStatisticDefinition ImmutableEntityStatisticDefinition}.
     * @return An immutable instance of EntityStatisticDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityStatisticDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityStatisticDefinition(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_CATEGORY) != 0) attributes.add("category");
      if ((initBits & INIT_BIT_ACTIVE) != 0) attributes.add("active");
      if ((initBits & INIT_BIT_RENDERER) != 0) attributes.add("renderer");
      if ((initBits & INIT_BIT_HISTORIC_RENDERER) != 0) attributes.add("historicRenderer");
      if ((initBits & INIT_BIT_ENTITY_VISIBILITY) != 0) attributes.add("entityVisibility");
      if ((initBits & INIT_BIT_ROLLUP_VISIBILITY) != 0) attributes.add("rollupVisibility");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build EntityStatisticDefinition, some of required attributes are not set " + attributes;
    }
  }
}
