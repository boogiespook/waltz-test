package com.khartec.waltz.model.taxonomy_management;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link TaxonomyChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTaxonomyChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "TaxonomyChangeCommand"})
public final class ImmutableTaxonomyChangeCommand
    extends TaxonomyChangeCommand {
  private final TaxonomyChangeType changeType;
  private final TaxonomyChangeLifecycleStatus status;
  private final EntityReference changeDomain;
  private final EntityReference a;
  private final @Nullable EntityReference b;
  private final @Nullable String newValue;
  private final @Nullable LocalDateTime executedAt;
  private final @Nullable String executedBy;
  private final Long id;
  private final LocalDateTime createdAt;
  private final String createdBy;

  private ImmutableTaxonomyChangeCommand(ImmutableTaxonomyChangeCommand.Builder builder) {
    this.changeType = builder.changeType;
    this.changeDomain = builder.changeDomain;
    this.a = builder.a;
    this.b = builder.b;
    this.newValue = builder.newValue;
    this.executedAt = builder.executedAt;
    this.executedBy = builder.executedBy;
    this.id = builder.id;
    this.createdBy = builder.createdBy;
    if (builder.status != null) {
      initShim.status(builder.status);
    }
    if (builder.createdAt != null) {
      initShim.createdAt(builder.createdAt);
    }
    this.status = initShim.status();
    this.createdAt = initShim.createdAt();
    this.initShim = null;
  }

  private ImmutableTaxonomyChangeCommand(
      TaxonomyChangeType changeType,
      TaxonomyChangeLifecycleStatus status,
      EntityReference changeDomain,
      EntityReference a,
      @Nullable EntityReference b,
      @Nullable String newValue,
      @Nullable LocalDateTime executedAt,
      @Nullable String executedBy,
      Long id,
      LocalDateTime createdAt,
      String createdBy) {
    this.changeType = changeType;
    this.status = status;
    this.changeDomain = changeDomain;
    this.a = a;
    this.b = b;
    this.newValue = newValue;
    this.executedAt = executedAt;
    this.executedBy = executedBy;
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private TaxonomyChangeLifecycleStatus status;
    private int statusBuildStage;

    TaxonomyChangeLifecycleStatus status() {
      if (statusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (statusBuildStage == STAGE_UNINITIALIZED) {
        statusBuildStage = STAGE_INITIALIZING;
        this.status = Objects.requireNonNull(ImmutableTaxonomyChangeCommand.super.status(), "status");
        statusBuildStage = STAGE_INITIALIZED;
      }
      return this.status;
    }

    void status(TaxonomyChangeLifecycleStatus status) {
      this.status = status;
      statusBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime createdAt;
    private int createdAtBuildStage;

    LocalDateTime createdAt() {
      if (createdAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (createdAtBuildStage == STAGE_UNINITIALIZED) {
        createdAtBuildStage = STAGE_INITIALIZING;
        this.createdAt = Objects.requireNonNull(ImmutableTaxonomyChangeCommand.super.createdAt(), "createdAt");
        createdAtBuildStage = STAGE_INITIALIZED;
      }
      return this.createdAt;
    }

    void createdAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
      createdAtBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (statusBuildStage == STAGE_INITIALIZING) attributes.add("status");
      if (createdAtBuildStage == STAGE_INITIALIZING) attributes.add("createdAt");
      return "Cannot build TaxonomyChangeCommand, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code changeType} attribute
   */
  @JsonProperty("changeType")
  @Override
  public TaxonomyChangeType changeType() {
    return changeType;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public TaxonomyChangeLifecycleStatus status() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.status()
        : this.status;
  }

  /**
   * @return The value of the {@code changeDomain} attribute
   */
  @JsonProperty("changeDomain")
  @Override
  public EntityReference changeDomain() {
    return changeDomain;
  }

  /**
   * @return The value of the {@code a} attribute
   */
  @JsonProperty("a")
  @Override
  public EntityReference a() {
    return a;
  }

  /**
   * @return The value of the {@code b} attribute
   */
  @JsonProperty("b")
  @Override
  public @Nullable EntityReference b() {
    return b;
  }

  /**
   * @return The value of the {@code newValue} attribute
   */
  @JsonProperty("newValue")
  @Override
  public @Nullable String newValue() {
    return newValue;
  }

  /**
   * @return The value of the {@code executedAt} attribute
   */
  @JsonProperty("executedAt")
  @Override
  public @Nullable LocalDateTime executedAt() {
    return executedAt;
  }

  /**
   * @return The value of the {@code executedBy} attribute
   */
  @JsonProperty("executedBy")
  @Override
  public @Nullable String executedBy() {
    return executedBy;
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
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty("createdAt")
  @Override
  public LocalDateTime createdAt() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.createdAt()
        : this.createdAt;
  }

  /**
   * @return The value of the {@code createdBy} attribute
   */
  @JsonProperty("createdBy")
  @Override
  public String createdBy() {
    return createdBy;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#changeType() changeType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for changeType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withChangeType(TaxonomyChangeType value) {
    if (this.changeType == value) return this;
    TaxonomyChangeType newValue = Objects.requireNonNull(value, "changeType");
    return new ImmutableTaxonomyChangeCommand(
        newValue,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withStatus(TaxonomyChangeLifecycleStatus value) {
    if (this.status == value) return this;
    TaxonomyChangeLifecycleStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        newValue,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#changeDomain() changeDomain} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for changeDomain
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withChangeDomain(EntityReference value) {
    if (this.changeDomain == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "changeDomain");
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        newValue,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#a() a} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for a
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withA(EntityReference value) {
    if (this.a == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "a");
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        newValue,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#b() b} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for b (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withB(@Nullable EntityReference value) {
    if (this.b == value) return this;
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        value,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#newValue() newValue} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newValue (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withNewValue(@Nullable String value) {
    if (Objects.equals(this.newValue, value)) return this;
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        value,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#executedAt() executedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for executedAt (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withExecutedAt(@Nullable LocalDateTime value) {
    if (this.executedAt == value) return this;
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        value,
        this.executedBy,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#executedBy() executedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for executedBy (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withExecutedBy(@Nullable String value) {
    if (Objects.equals(this.executedBy, value)) return this;
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        value,
        this.id,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TaxonomyChangeCommand#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        newValue,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TaxonomyChangeCommand#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        value,
        this.createdAt,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        newValue,
        this.createdBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeCommand#createdBy() createdBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeCommand withCreatedBy(String value) {
    if (this.createdBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "createdBy");
    return new ImmutableTaxonomyChangeCommand(
        this.changeType,
        this.status,
        this.changeDomain,
        this.a,
        this.b,
        this.newValue,
        this.executedAt,
        this.executedBy,
        this.id,
        this.createdAt,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTaxonomyChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTaxonomyChangeCommand
        && equalTo((ImmutableTaxonomyChangeCommand) another);
  }

  private boolean equalTo(ImmutableTaxonomyChangeCommand another) {
    return changeType.equals(another.changeType)
        && status.equals(another.status)
        && changeDomain.equals(another.changeDomain)
        && a.equals(another.a)
        && Objects.equals(b, another.b)
        && Objects.equals(newValue, another.newValue)
        && Objects.equals(executedAt, another.executedAt)
        && Objects.equals(executedBy, another.executedBy)
        && Objects.equals(id, another.id)
        && createdAt.equals(another.createdAt)
        && createdBy.equals(another.createdBy);
  }

  /**
   * Computes a hash code from attributes: {@code changeType}, {@code status}, {@code changeDomain}, {@code a}, {@code b}, {@code newValue}, {@code executedAt}, {@code executedBy}, {@code id}, {@code createdAt}, {@code createdBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + changeType.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + changeDomain.hashCode();
    h += (h << 5) + a.hashCode();
    h += (h << 5) + Objects.hashCode(b);
    h += (h << 5) + Objects.hashCode(newValue);
    h += (h << 5) + Objects.hashCode(executedAt);
    h += (h << 5) + Objects.hashCode(executedBy);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + createdBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TaxonomyChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TaxonomyChangeCommand{");
    builder.append("changeType=").append(changeType);
    builder.append(", ");
    builder.append("status=").append(status);
    builder.append(", ");
    builder.append("changeDomain=").append(changeDomain);
    builder.append(", ");
    builder.append("a=").append(a);
    if (b != null) {
      builder.append(", ");
      builder.append("b=").append(b);
    }
    if (newValue != null) {
      builder.append(", ");
      builder.append("newValue=").append(newValue);
    }
    if (executedAt != null) {
      builder.append(", ");
      builder.append("executedAt=").append(executedAt);
    }
    if (executedBy != null) {
      builder.append(", ");
      builder.append("executedBy=").append(executedBy);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("createdAt=").append(createdAt);
    builder.append(", ");
    builder.append("createdBy=").append(createdBy);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TaxonomyChangeCommand {
    TaxonomyChangeType changeType;
    TaxonomyChangeLifecycleStatus status;
    EntityReference changeDomain;
    EntityReference a;
    EntityReference b;
    String newValue;
    LocalDateTime executedAt;
    String executedBy;
    Optional<Long> id = Optional.empty();
    LocalDateTime createdAt;
    String createdBy;
    @JsonProperty("changeType")
    public void setChangeType(TaxonomyChangeType changeType) {
      this.changeType = changeType;
    }
    @JsonProperty("status")
    public void setStatus(TaxonomyChangeLifecycleStatus status) {
      this.status = status;
    }
    @JsonProperty("changeDomain")
    public void setChangeDomain(EntityReference changeDomain) {
      this.changeDomain = changeDomain;
    }
    @JsonProperty("a")
    public void setA(EntityReference a) {
      this.a = a;
    }
    @JsonProperty("b")
    public void setB(@Nullable EntityReference b) {
      this.b = b;
    }
    @JsonProperty("newValue")
    public void setNewValue(@Nullable String newValue) {
      this.newValue = newValue;
    }
    @JsonProperty("executedAt")
    public void setExecutedAt(@Nullable LocalDateTime executedAt) {
      this.executedAt = executedAt;
    }
    @JsonProperty("executedBy")
    public void setExecutedBy(@Nullable String executedBy) {
      this.executedBy = executedBy;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
    }
    @Override
    public TaxonomyChangeType changeType() { throw new UnsupportedOperationException(); }
    @Override
    public TaxonomyChangeLifecycleStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference changeDomain() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference a() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference b() { throw new UnsupportedOperationException(); }
    @Override
    public String newValue() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime executedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String executedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime createdAt() { throw new UnsupportedOperationException(); }
    @Override
    public String createdBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTaxonomyChangeCommand fromJson(Json json) {
    ImmutableTaxonomyChangeCommand.Builder builder = ImmutableTaxonomyChangeCommand.builder();
    if (json.changeType != null) {
      builder.changeType(json.changeType);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.changeDomain != null) {
      builder.changeDomain(json.changeDomain);
    }
    if (json.a != null) {
      builder.a(json.a);
    }
    if (json.b != null) {
      builder.b(json.b);
    }
    if (json.newValue != null) {
      builder.newValue(json.newValue);
    }
    if (json.executedAt != null) {
      builder.executedAt(json.executedAt);
    }
    if (json.executedBy != null) {
      builder.executedBy(json.executedBy);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    if (json.createdBy != null) {
      builder.createdBy(json.createdBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TaxonomyChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TaxonomyChangeCommand instance
   */
  public static ImmutableTaxonomyChangeCommand copyOf(TaxonomyChangeCommand instance) {
    if (instance instanceof ImmutableTaxonomyChangeCommand) {
      return (ImmutableTaxonomyChangeCommand) instance;
    }
    return ImmutableTaxonomyChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTaxonomyChangeCommand ImmutableTaxonomyChangeCommand}.
   * @return A new ImmutableTaxonomyChangeCommand builder
   */
  public static ImmutableTaxonomyChangeCommand.Builder builder() {
    return new ImmutableTaxonomyChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTaxonomyChangeCommand ImmutableTaxonomyChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CHANGE_TYPE = 0x1L;
    private static final long INIT_BIT_CHANGE_DOMAIN = 0x2L;
    private static final long INIT_BIT_A = 0x4L;
    private static final long INIT_BIT_CREATED_BY = 0x8L;
    private long initBits = 0xfL;

    private TaxonomyChangeType changeType;
    private TaxonomyChangeLifecycleStatus status;
    private EntityReference changeDomain;
    private EntityReference a;
    private EntityReference b;
    private String newValue;
    private LocalDateTime executedAt;
    private String executedBy;
    private Long id;
    private LocalDateTime createdAt;
    private String createdBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.CreatedProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CreatedProvider instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.taxonomy_management.TaxonomyChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TaxonomyChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof CreatedProvider) {
        CreatedProvider instance = (CreatedProvider) object;
        createdAt(instance.createdAt());
        createdBy(instance.createdBy());
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof TaxonomyChangeCommand) {
        TaxonomyChangeCommand instance = (TaxonomyChangeCommand) object;
        @Nullable String executedByValue = instance.executedBy();
        if (executedByValue != null) {
          executedBy(executedByValue);
        }
        a(instance.a());
        @Nullable String newValueValue = instance.newValue();
        if (newValueValue != null) {
          newValue(newValueValue);
        }
        @Nullable EntityReference bValue = instance.b();
        if (bValue != null) {
          b(bValue);
        }
        @Nullable LocalDateTime executedAtValue = instance.executedAt();
        if (executedAtValue != null) {
          executedAt(executedAtValue);
        }
        changeType(instance.changeType());
        changeDomain(instance.changeDomain());
        status(instance.status());
      }
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#changeType() changeType} attribute.
     * @param changeType The value for changeType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("changeType")
    public final Builder changeType(TaxonomyChangeType changeType) {
      this.changeType = Objects.requireNonNull(changeType, "changeType");
      initBits &= ~INIT_BIT_CHANGE_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#status() status} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TaxonomyChangeCommand#status() status}.</em>
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(TaxonomyChangeLifecycleStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#changeDomain() changeDomain} attribute.
     * @param changeDomain The value for changeDomain 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("changeDomain")
    public final Builder changeDomain(EntityReference changeDomain) {
      this.changeDomain = Objects.requireNonNull(changeDomain, "changeDomain");
      initBits &= ~INIT_BIT_CHANGE_DOMAIN;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#a() a} attribute.
     * @param a The value for a 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("a")
    public final Builder a(EntityReference a) {
      this.a = Objects.requireNonNull(a, "a");
      initBits &= ~INIT_BIT_A;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#b() b} attribute.
     * @param b The value for b (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("b")
    public final Builder b(@Nullable EntityReference b) {
      this.b = b;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#newValue() newValue} attribute.
     * @param newValue The value for newValue (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("newValue")
    public final Builder newValue(@Nullable String newValue) {
      this.newValue = newValue;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#executedAt() executedAt} attribute.
     * @param executedAt The value for executedAt (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("executedAt")
    public final Builder executedAt(@Nullable LocalDateTime executedAt) {
      this.executedAt = executedAt;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#executedBy() executedBy} attribute.
     * @param executedBy The value for executedBy (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("executedBy")
    public final Builder executedBy(@Nullable String executedBy) {
      this.executedBy = executedBy;
      return this;
    }

    /**
     * Initializes the optional value {@link TaxonomyChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link TaxonomyChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#createdAt() createdAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TaxonomyChangeCommand#createdAt() createdAt}.</em>
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeCommand#createdBy() createdBy} attribute.
     * @param createdBy The value for createdBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdBy")
    public final Builder createdBy(String createdBy) {
      this.createdBy = Objects.requireNonNull(createdBy, "createdBy");
      initBits &= ~INIT_BIT_CREATED_BY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTaxonomyChangeCommand ImmutableTaxonomyChangeCommand}.
     * @return An immutable instance of TaxonomyChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTaxonomyChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTaxonomyChangeCommand(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CHANGE_TYPE) != 0) attributes.add("changeType");
      if ((initBits & INIT_BIT_CHANGE_DOMAIN) != 0) attributes.add("changeDomain");
      if ((initBits & INIT_BIT_A) != 0) attributes.add("a");
      if ((initBits & INIT_BIT_CREATED_BY) != 0) attributes.add("createdBy");
      return "Cannot build TaxonomyChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
