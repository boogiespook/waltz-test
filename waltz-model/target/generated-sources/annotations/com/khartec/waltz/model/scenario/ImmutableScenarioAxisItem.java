package com.khartec.waltz.model.scenario;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.AxisOrientation;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ScenarioAxisItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableScenarioAxisItem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ScenarioAxisItem"})
public final class ImmutableScenarioAxisItem extends ScenarioAxisItem {
  private final long scenarioId;
  private final EntityReference domainItem;
  private final int position;
  private final AxisOrientation axisOrientation;
  private final Long id;

  private ImmutableScenarioAxisItem(
      long scenarioId,
      EntityReference domainItem,
      int position,
      AxisOrientation axisOrientation,
      Long id) {
    this.scenarioId = scenarioId;
    this.domainItem = domainItem;
    this.position = position;
    this.axisOrientation = axisOrientation;
    this.id = id;
  }

  /**
   * @return The value of the {@code scenarioId} attribute
   */
  @JsonProperty("scenarioId")
  @Override
  public long scenarioId() {
    return scenarioId;
  }

  /**
   * @return The value of the {@code domainItem} attribute
   */
  @JsonProperty("domainItem")
  @Override
  public EntityReference domainItem() {
    return domainItem;
  }

  /**
   * @return The value of the {@code position} attribute
   */
  @JsonProperty("position")
  @Override
  public int position() {
    return position;
  }

  /**
   * @return The value of the {@code axisOrientation} attribute
   */
  @JsonProperty("axisOrientation")
  @Override
  public AxisOrientation axisOrientation() {
    return axisOrientation;
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
   * Copy the current immutable object by setting a value for the {@link ScenarioAxisItem#scenarioId() scenarioId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scenarioId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioAxisItem withScenarioId(long value) {
    if (this.scenarioId == value) return this;
    return new ImmutableScenarioAxisItem(value, this.domainItem, this.position, this.axisOrientation, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioAxisItem#domainItem() domainItem} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for domainItem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioAxisItem withDomainItem(EntityReference value) {
    if (this.domainItem == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "domainItem");
    return new ImmutableScenarioAxisItem(this.scenarioId, newValue, this.position, this.axisOrientation, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioAxisItem#position() position} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for position
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioAxisItem withPosition(int value) {
    if (this.position == value) return this;
    return new ImmutableScenarioAxisItem(this.scenarioId, this.domainItem, value, this.axisOrientation, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ScenarioAxisItem#axisOrientation() axisOrientation} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for axisOrientation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScenarioAxisItem withAxisOrientation(AxisOrientation value) {
    if (this.axisOrientation == value) return this;
    AxisOrientation newValue = Objects.requireNonNull(value, "axisOrientation");
    return new ImmutableScenarioAxisItem(this.scenarioId, this.domainItem, this.position, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ScenarioAxisItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableScenarioAxisItem withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableScenarioAxisItem(this.scenarioId, this.domainItem, this.position, this.axisOrientation, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ScenarioAxisItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableScenarioAxisItem withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableScenarioAxisItem(this.scenarioId, this.domainItem, this.position, this.axisOrientation, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableScenarioAxisItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableScenarioAxisItem
        && equalTo((ImmutableScenarioAxisItem) another);
  }

  private boolean equalTo(ImmutableScenarioAxisItem another) {
    return scenarioId == another.scenarioId
        && domainItem.equals(another.domainItem)
        && position == another.position
        && axisOrientation.equals(another.axisOrientation)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code scenarioId}, {@code domainItem}, {@code position}, {@code axisOrientation}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(scenarioId);
    h += (h << 5) + domainItem.hashCode();
    h += (h << 5) + position;
    h += (h << 5) + axisOrientation.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ScenarioAxisItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ScenarioAxisItem{");
    builder.append("scenarioId=").append(scenarioId);
    builder.append(", ");
    builder.append("domainItem=").append(domainItem);
    builder.append(", ");
    builder.append("position=").append(position);
    builder.append(", ");
    builder.append("axisOrientation=").append(axisOrientation);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  static final class Json extends ScenarioAxisItem {
    long scenarioId;
    boolean scenarioIdIsSet;
    EntityReference domainItem;
    int position;
    boolean positionIsSet;
    AxisOrientation axisOrientation;
    Optional<Long> id = Optional.empty();
    @JsonProperty("scenarioId")
    public void setScenarioId(long scenarioId) {
      this.scenarioId = scenarioId;
      this.scenarioIdIsSet = true;
    }
    @JsonProperty("domainItem")
    public void setDomainItem(EntityReference domainItem) {
      this.domainItem = domainItem;
    }
    @JsonProperty("position")
    public void setPosition(int position) {
      this.position = position;
      this.positionIsSet = true;
    }
    @JsonProperty("axisOrientation")
    public void setAxisOrientation(AxisOrientation axisOrientation) {
      this.axisOrientation = axisOrientation;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public long scenarioId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference domainItem() { throw new UnsupportedOperationException(); }
    @Override
    public int position() { throw new UnsupportedOperationException(); }
    @Override
    public AxisOrientation axisOrientation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableScenarioAxisItem fromJson(Json json) {
    ImmutableScenarioAxisItem.Builder builder = ImmutableScenarioAxisItem.builder();
    if (json.scenarioIdIsSet) {
      builder.scenarioId(json.scenarioId);
    }
    if (json.domainItem != null) {
      builder.domainItem(json.domainItem);
    }
    if (json.positionIsSet) {
      builder.position(json.position);
    }
    if (json.axisOrientation != null) {
      builder.axisOrientation(json.axisOrientation);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ScenarioAxisItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ScenarioAxisItem instance
   */
  public static ImmutableScenarioAxisItem copyOf(ScenarioAxisItem instance) {
    if (instance instanceof ImmutableScenarioAxisItem) {
      return (ImmutableScenarioAxisItem) instance;
    }
    return ImmutableScenarioAxisItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableScenarioAxisItem ImmutableScenarioAxisItem}.
   * @return A new ImmutableScenarioAxisItem builder
   */
  public static ImmutableScenarioAxisItem.Builder builder() {
    return new ImmutableScenarioAxisItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableScenarioAxisItem ImmutableScenarioAxisItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SCENARIO_ID = 0x1L;
    private static final long INIT_BIT_DOMAIN_ITEM = 0x2L;
    private static final long INIT_BIT_POSITION = 0x4L;
    private static final long INIT_BIT_AXIS_ORIENTATION = 0x8L;
    private long initBits = 0xfL;

    private long scenarioId;
    private EntityReference domainItem;
    private int position;
    private AxisOrientation axisOrientation;
    private Long id;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.scenario.ScenarioAxisItem} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ScenarioAxisItem instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof ScenarioAxisItem) {
        ScenarioAxisItem instance = (ScenarioAxisItem) object;
        domainItem(instance.domainItem());
        position(instance.position());
        scenarioId(instance.scenarioId());
        axisOrientation(instance.axisOrientation());
      }
    }

    /**
     * Initializes the value for the {@link ScenarioAxisItem#scenarioId() scenarioId} attribute.
     * @param scenarioId The value for scenarioId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scenarioId")
    public final Builder scenarioId(long scenarioId) {
      this.scenarioId = scenarioId;
      initBits &= ~INIT_BIT_SCENARIO_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioAxisItem#domainItem() domainItem} attribute.
     * @param domainItem The value for domainItem 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("domainItem")
    public final Builder domainItem(EntityReference domainItem) {
      this.domainItem = Objects.requireNonNull(domainItem, "domainItem");
      initBits &= ~INIT_BIT_DOMAIN_ITEM;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioAxisItem#position() position} attribute.
     * @param position The value for position 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("position")
    public final Builder position(int position) {
      this.position = position;
      initBits &= ~INIT_BIT_POSITION;
      return this;
    }

    /**
     * Initializes the value for the {@link ScenarioAxisItem#axisOrientation() axisOrientation} attribute.
     * @param axisOrientation The value for axisOrientation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("axisOrientation")
    public final Builder axisOrientation(AxisOrientation axisOrientation) {
      this.axisOrientation = Objects.requireNonNull(axisOrientation, "axisOrientation");
      initBits &= ~INIT_BIT_AXIS_ORIENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ScenarioAxisItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link ScenarioAxisItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableScenarioAxisItem ImmutableScenarioAxisItem}.
     * @return An immutable instance of ScenarioAxisItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableScenarioAxisItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableScenarioAxisItem(scenarioId, domainItem, position, axisOrientation, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SCENARIO_ID) != 0) attributes.add("scenarioId");
      if ((initBits & INIT_BIT_DOMAIN_ITEM) != 0) attributes.add("domainItem");
      if ((initBits & INIT_BIT_POSITION) != 0) attributes.add("position");
      if ((initBits & INIT_BIT_AXIS_ORIENTATION) != 0) attributes.add("axisOrientation");
      return "Cannot build ScenarioAxisItem, some of required attributes are not set " + attributes;
    }
  }
}
