package com.khartec.waltz.model.entity_statistic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityStatisticValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityStatisticValue.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityStatisticValue"})
public final class ImmutableEntityStatisticValue
    extends EntityStatisticValue {
  private final long statisticId;
  private final EntityReference entity;
  private final String value;
  private final String outcome;
  private final StatisticValueState state;
  private final @Nullable String reason;
  private final LocalDateTime createdAt;
  private final boolean current;
  private final Long id;
  private final String provenance;

  private ImmutableEntityStatisticValue(ImmutableEntityStatisticValue.Builder builder) {
    this.statisticId = builder.statisticId;
    this.entity = builder.entity;
    this.value = builder.value;
    this.outcome = builder.outcome;
    this.state = builder.state;
    this.reason = builder.reason;
    this.createdAt = builder.createdAt;
    this.current = builder.current;
    this.id = builder.id;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableEntityStatisticValue(
      long statisticId,
      EntityReference entity,
      String value,
      String outcome,
      StatisticValueState state,
      @Nullable String reason,
      LocalDateTime createdAt,
      boolean current,
      Long id,
      String provenance) {
    this.statisticId = statisticId;
    this.entity = entity;
    this.value = value;
    this.outcome = outcome;
    this.state = state;
    this.reason = reason;
    this.createdAt = createdAt;
    this.current = current;
    this.id = id;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code statisticId} attribute
   */
  @JsonProperty("statisticId")
  @Override
  public long statisticId() {
    return statisticId;
  }

  /**
   * @return The value of the {@code entity} attribute
   */
  @JsonProperty("entity")
  @Override
  public EntityReference entity() {
    return entity;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public String value() {
    return value;
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public String outcome() {
    return outcome;
  }

  /**
   * @return The value of the {@code state} attribute
   */
  @JsonProperty("state")
  @Override
  public StatisticValueState state() {
    return state;
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public @Nullable String reason() {
    return reason;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty("createdAt")
  @Override
  public LocalDateTime createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code current} attribute
   */
  @JsonProperty("current")
  @Override
  public boolean current() {
    return current;
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
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    return provenance;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#statisticId() statisticId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for statisticId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withStatisticId(long value) {
    if (this.statisticId == value) return this;
    return new ImmutableEntityStatisticValue(
        value,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#entity() entity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withEntity(EntityReference value) {
    if (this.entity == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entity");
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        newValue,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withValue(String value) {
    if (this.value.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "value");
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        newValue,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#outcome() outcome} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withOutcome(String value) {
    if (this.outcome.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "outcome");
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        newValue,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#state() state} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for state
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withState(StatisticValueState value) {
    if (this.state == value) return this;
    StatisticValueState newValue = Objects.requireNonNull(value, "state");
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        newValue,
        this.reason,
        this.createdAt,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#reason() reason} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reason (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withReason(@Nullable String value) {
    if (Objects.equals(this.reason, value)) return this;
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        value,
        this.createdAt,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        newValue,
        this.current,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#current() current} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for current
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withCurrent(boolean value) {
    if (this.current == value) return this;
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        value,
        this.id,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityStatisticValue#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticValue withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityStatisticValue#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityStatisticValue withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        value,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityStatisticValue#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityStatisticValue withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityStatisticValue(
        this.statisticId,
        this.entity,
        this.value,
        this.outcome,
        this.state,
        this.reason,
        this.createdAt,
        this.current,
        this.id,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityStatisticValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityStatisticValue
        && equalTo((ImmutableEntityStatisticValue) another);
  }

  private boolean equalTo(ImmutableEntityStatisticValue another) {
    return statisticId == another.statisticId
        && entity.equals(another.entity)
        && value.equals(another.value)
        && outcome.equals(another.outcome)
        && state.equals(another.state)
        && Objects.equals(reason, another.reason)
        && createdAt.equals(another.createdAt)
        && current == another.current
        && Objects.equals(id, another.id)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code statisticId}, {@code entity}, {@code value}, {@code outcome}, {@code state}, {@code reason}, {@code createdAt}, {@code current}, {@code id}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(statisticId);
    h += (h << 5) + entity.hashCode();
    h += (h << 5) + value.hashCode();
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + state.hashCode();
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + Boolean.hashCode(current);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityStatisticValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityStatisticValue{");
    builder.append("statisticId=").append(statisticId);
    builder.append(", ");
    builder.append("entity=").append(entity);
    builder.append(", ");
    builder.append("value=").append(value);
    builder.append(", ");
    builder.append("outcome=").append(outcome);
    builder.append(", ");
    builder.append("state=").append(state);
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    builder.append(", ");
    builder.append("createdAt=").append(createdAt);
    builder.append(", ");
    builder.append("current=").append(current);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityStatisticValue {
    long statisticId;
    boolean statisticIdIsSet;
    EntityReference entity;
    String value;
    String outcome;
    StatisticValueState state;
    String reason;
    LocalDateTime createdAt;
    boolean current;
    boolean currentIsSet;
    Optional<Long> id = Optional.empty();
    String provenance;
    @JsonProperty("statisticId")
    public void setStatisticId(long statisticId) {
      this.statisticId = statisticId;
      this.statisticIdIsSet = true;
    }
    @JsonProperty("entity")
    public void setEntity(EntityReference entity) {
      this.entity = entity;
    }
    @JsonProperty("value")
    public void setValue(String value) {
      this.value = value;
    }
    @JsonProperty("outcome")
    public void setOutcome(String outcome) {
      this.outcome = outcome;
    }
    @JsonProperty("state")
    public void setState(StatisticValueState state) {
      this.state = state;
    }
    @JsonProperty("reason")
    public void setReason(@Nullable String reason) {
      this.reason = reason;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @JsonProperty("current")
    public void setCurrent(boolean current) {
      this.current = current;
      this.currentIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long statisticId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entity() { throw new UnsupportedOperationException(); }
    @Override
    public String value() { throw new UnsupportedOperationException(); }
    @Override
    public String outcome() { throw new UnsupportedOperationException(); }
    @Override
    public StatisticValueState state() { throw new UnsupportedOperationException(); }
    @Override
    public String reason() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime createdAt() { throw new UnsupportedOperationException(); }
    @Override
    public boolean current() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityStatisticValue fromJson(Json json) {
    ImmutableEntityStatisticValue.Builder builder = ImmutableEntityStatisticValue.builder();
    if (json.statisticIdIsSet) {
      builder.statisticId(json.statisticId);
    }
    if (json.entity != null) {
      builder.entity(json.entity);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.outcome != null) {
      builder.outcome(json.outcome);
    }
    if (json.state != null) {
      builder.state(json.state);
    }
    if (json.reason != null) {
      builder.reason(json.reason);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    if (json.currentIsSet) {
      builder.current(json.current);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityStatisticValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityStatisticValue instance
   */
  public static ImmutableEntityStatisticValue copyOf(EntityStatisticValue instance) {
    if (instance instanceof ImmutableEntityStatisticValue) {
      return (ImmutableEntityStatisticValue) instance;
    }
    return ImmutableEntityStatisticValue.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityStatisticValue ImmutableEntityStatisticValue}.
   * @return A new ImmutableEntityStatisticValue builder
   */
  public static ImmutableEntityStatisticValue.Builder builder() {
    return new ImmutableEntityStatisticValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityStatisticValue ImmutableEntityStatisticValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_STATISTIC_ID = 0x1L;
    private static final long INIT_BIT_ENTITY = 0x2L;
    private static final long INIT_BIT_VALUE = 0x4L;
    private static final long INIT_BIT_OUTCOME = 0x8L;
    private static final long INIT_BIT_STATE = 0x10L;
    private static final long INIT_BIT_CREATED_AT = 0x20L;
    private static final long INIT_BIT_CURRENT = 0x40L;
    private long initBits = 0x7fL;

    private long statisticId;
    private EntityReference entity;
    private String value;
    private String outcome;
    private StatisticValueState state;
    private String reason;
    private LocalDateTime createdAt;
    private boolean current;
    private Long id;
    private String provenance;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_statistic.EntityStatisticValue} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityStatisticValue instance) {
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof EntityStatisticValue) {
        EntityStatisticValue instance = (EntityStatisticValue) object;
        @Nullable String reasonValue = instance.reason();
        if (reasonValue != null) {
          reason(reasonValue);
        }
        createdAt(instance.createdAt());
        statisticId(instance.statisticId());
        current(instance.current());
        state(instance.state());
        value(instance.value());
        entity(instance.entity());
        outcome(instance.outcome());
      }
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#statisticId() statisticId} attribute.
     * @param statisticId The value for statisticId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statisticId")
    public final Builder statisticId(long statisticId) {
      this.statisticId = statisticId;
      initBits &= ~INIT_BIT_STATISTIC_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#entity() entity} attribute.
     * @param entity The value for entity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entity")
    public final Builder entity(EntityReference entity) {
      this.entity = Objects.requireNonNull(entity, "entity");
      initBits &= ~INIT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(String outcome) {
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      initBits &= ~INIT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#state() state} attribute.
     * @param state The value for state 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("state")
    public final Builder state(StatisticValueState state) {
      this.state = Objects.requireNonNull(state, "state");
      initBits &= ~INIT_BIT_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#reason() reason} attribute.
     * @param reason The value for reason (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(@Nullable String reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#current() current} attribute.
     * @param current The value for current 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("current")
    public final Builder current(boolean current) {
      this.current = current;
      initBits &= ~INIT_BIT_CURRENT;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityStatisticValue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityStatisticValue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntityStatisticValue#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityStatisticValue#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityStatisticValue ImmutableEntityStatisticValue}.
     * @return An immutable instance of EntityStatisticValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityStatisticValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityStatisticValue(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_STATISTIC_ID) != 0) attributes.add("statisticId");
      if ((initBits & INIT_BIT_ENTITY) != 0) attributes.add("entity");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_OUTCOME) != 0) attributes.add("outcome");
      if ((initBits & INIT_BIT_STATE) != 0) attributes.add("state");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_CURRENT) != 0) attributes.add("current");
      return "Cannot build EntityStatisticValue, some of required attributes are not set " + attributes;
    }
  }
}
