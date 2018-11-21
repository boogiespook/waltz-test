package com.khartec.waltz.model.flow_diagram;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link FlowDiagramEntity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlowDiagramEntity.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FlowDiagramEntity"})
public final class ImmutableFlowDiagramEntity extends FlowDiagramEntity {
  private final Long diagramId;
  private final EntityReference entityReference;
  private final boolean isNotable;

  private ImmutableFlowDiagramEntity(ImmutableFlowDiagramEntity.Builder builder) {
    this.diagramId = builder.diagramId;
    this.entityReference = builder.entityReference;
    this.isNotable = builder.isNotableIsSet()
        ? builder.isNotable
        : super.isNotable();
  }

  private ImmutableFlowDiagramEntity(
      Long diagramId,
      EntityReference entityReference,
      boolean isNotable) {
    this.diagramId = diagramId;
    this.entityReference = entityReference;
    this.isNotable = isNotable;
  }

  /**
   * @return The value of the {@code diagramId} attribute
   */
  @JsonProperty("diagramId")
  @Override
  public Optional<Long> diagramId() {
    return Optional.ofNullable(diagramId);
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public EntityReference entityReference() {
    return entityReference;
  }

  /**
   * @return The value of the {@code isNotable} attribute
   */
  @JsonProperty("isNotable")
  @Override
  public boolean isNotable() {
    return isNotable;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FlowDiagramEntity#diagramId() diagramId} attribute.
   * @param value The value for diagramId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlowDiagramEntity withDiagramId(long value) {
    Long newValue = value;
    if (Objects.equals(this.diagramId, newValue)) return this;
    return new ImmutableFlowDiagramEntity(newValue, this.entityReference, this.isNotable);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FlowDiagramEntity#diagramId() diagramId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagramId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlowDiagramEntity withDiagramId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.diagramId, value)) return this;
    return new ImmutableFlowDiagramEntity(value, this.entityReference, this.isNotable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagramEntity#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagramEntity withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableFlowDiagramEntity(this.diagramId, newValue, this.isNotable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagramEntity#isNotable() isNotable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isNotable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagramEntity withIsNotable(boolean value) {
    if (this.isNotable == value) return this;
    return new ImmutableFlowDiagramEntity(this.diagramId, this.entityReference, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlowDiagramEntity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlowDiagramEntity
        && equalTo((ImmutableFlowDiagramEntity) another);
  }

  private boolean equalTo(ImmutableFlowDiagramEntity another) {
    return Objects.equals(diagramId, another.diagramId)
        && entityReference.equals(another.entityReference)
        && isNotable == another.isNotable;
  }

  /**
   * Computes a hash code from attributes: {@code diagramId}, {@code entityReference}, {@code isNotable}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(diagramId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Boolean.hashCode(isNotable);
    return h;
  }

  /**
   * Prints the immutable value {@code FlowDiagramEntity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("FlowDiagramEntity{");
    if (diagramId != null) {
      builder.append("diagramId=").append(diagramId);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("entityReference=").append(entityReference);
    builder.append(", ");
    builder.append("isNotable=").append(isNotable);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends FlowDiagramEntity {
    Optional<Long> diagramId = Optional.empty();
    EntityReference entityReference;
    boolean isNotable;
    boolean isNotableIsSet;
    @JsonProperty("diagramId")
    public void setDiagramId(Optional<Long> diagramId) {
      this.diagramId = diagramId;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("isNotable")
    public void setIsNotable(boolean isNotable) {
      this.isNotable = isNotable;
      this.isNotableIsSet = true;
    }
    @Override
    public Optional<Long> diagramId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isNotable() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFlowDiagramEntity fromJson(Json json) {
    ImmutableFlowDiagramEntity.Builder builder = ImmutableFlowDiagramEntity.builder();
    if (json.diagramId != null) {
      builder.diagramId(json.diagramId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.isNotableIsSet) {
      builder.isNotable(json.isNotable);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FlowDiagramEntity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FlowDiagramEntity instance
   */
  public static ImmutableFlowDiagramEntity copyOf(FlowDiagramEntity instance) {
    if (instance instanceof ImmutableFlowDiagramEntity) {
      return (ImmutableFlowDiagramEntity) instance;
    }
    return ImmutableFlowDiagramEntity.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFlowDiagramEntity ImmutableFlowDiagramEntity}.
   * @return A new ImmutableFlowDiagramEntity builder
   */
  public static ImmutableFlowDiagramEntity.Builder builder() {
    return new ImmutableFlowDiagramEntity.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFlowDiagramEntity ImmutableFlowDiagramEntity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long OPT_BIT_IS_NOTABLE = 0x1L;
    private long initBits = 0x1L;
    private long optBits;

    private Long diagramId;
    private EntityReference entityReference;
    private boolean isNotable;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FlowDiagramEntity} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FlowDiagramEntity instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Long> diagramIdOptional = instance.diagramId();
      if (diagramIdOptional.isPresent()) {
        diagramId(diagramIdOptional);
      }
      entityReference(instance.entityReference());
      isNotable(instance.isNotable());
      return this;
    }

    /**
     * Initializes the optional value {@link FlowDiagramEntity#diagramId() diagramId} to diagramId.
     * @param diagramId The value for diagramId
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagramId(long diagramId) {
      this.diagramId = diagramId;
      return this;
    }

    /**
     * Initializes the optional value {@link FlowDiagramEntity#diagramId() diagramId} to diagramId.
     * @param diagramId The value for diagramId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagramId")
    public final Builder diagramId(Optional<Long> diagramId) {
      this.diagramId = diagramId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagramEntity#entityReference() entityReference} attribute.
     * @param entityReference The value for entityReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(EntityReference entityReference) {
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      initBits &= ~INIT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagramEntity#isNotable() isNotable} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlowDiagramEntity#isNotable() isNotable}.</em>
     * @param isNotable The value for isNotable 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isNotable")
    public final Builder isNotable(boolean isNotable) {
      this.isNotable = isNotable;
      optBits |= OPT_BIT_IS_NOTABLE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFlowDiagramEntity ImmutableFlowDiagramEntity}.
     * @return An immutable instance of FlowDiagramEntity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFlowDiagramEntity build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFlowDiagramEntity(this);
    }

    private boolean isNotableIsSet() {
      return (optBits & OPT_BIT_IS_NOTABLE) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      return "Cannot build FlowDiagramEntity, some of required attributes are not set " + attributes;
    }
  }
}
