package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyTemplate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyTemplate.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyTemplate"})
public final class ImmutableSurveyTemplate extends SurveyTemplate {
  private final EntityKind targetEntityKind;
  private final Long ownerId;
  private final LocalDateTime createdAt;
  private final ReleaseLifecycleStatus status;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableSurveyTemplate(ImmutableSurveyTemplate.Builder builder) {
    this.targetEntityKind = builder.targetEntityKind;
    this.ownerId = builder.ownerId;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    if (builder.createdAt != null) {
      initShim.createdAt(builder.createdAt);
    }
    if (builder.status != null) {
      initShim.status(builder.status);
    }
    this.createdAt = initShim.createdAt();
    this.status = initShim.status();
    this.initShim = null;
  }

  private ImmutableSurveyTemplate(
      EntityKind targetEntityKind,
      Long ownerId,
      LocalDateTime createdAt,
      ReleaseLifecycleStatus status,
      Long id,
      String name,
      @Nullable String description) {
    this.targetEntityKind = targetEntityKind;
    this.ownerId = ownerId;
    this.createdAt = createdAt;
    this.status = status;
    this.id = id;
    this.name = name;
    this.description = description;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private LocalDateTime createdAt;
    private int createdAtBuildStage;

    LocalDateTime createdAt() {
      if (createdAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (createdAtBuildStage == STAGE_UNINITIALIZED) {
        createdAtBuildStage = STAGE_INITIALIZING;
        this.createdAt = Objects.requireNonNull(ImmutableSurveyTemplate.super.createdAt(), "createdAt");
        createdAtBuildStage = STAGE_INITIALIZED;
      }
      return this.createdAt;
    }

    void createdAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
      createdAtBuildStage = STAGE_INITIALIZED;
    }
    private ReleaseLifecycleStatus status;
    private int statusBuildStage;

    ReleaseLifecycleStatus status() {
      if (statusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (statusBuildStage == STAGE_UNINITIALIZED) {
        statusBuildStage = STAGE_INITIALIZING;
        this.status = Objects.requireNonNull(ImmutableSurveyTemplate.super.status(), "status");
        statusBuildStage = STAGE_INITIALIZED;
      }
      return this.status;
    }

    void status(ReleaseLifecycleStatus status) {
      this.status = status;
      statusBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (createdAtBuildStage == STAGE_INITIALIZING) attributes.add("createdAt");
      if (statusBuildStage == STAGE_INITIALIZING) attributes.add("status");
      return "Cannot build SurveyTemplate, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code targetEntityKind} attribute
   */
  @JsonProperty("targetEntityKind")
  @Override
  public EntityKind targetEntityKind() {
    return targetEntityKind;
  }

  /**
   * @return The value of the {@code ownerId} attribute
   */
  @JsonProperty("ownerId")
  @Override
  public Long ownerId() {
    return ownerId;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public ReleaseLifecycleStatus status() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.status()
        : this.status;
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
   * Copy the current immutable object by setting a value for the {@link SurveyTemplate#targetEntityKind() targetEntityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for targetEntityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplate withTargetEntityKind(EntityKind value) {
    if (this.targetEntityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "targetEntityKind");
    return new ImmutableSurveyTemplate(newValue, this.ownerId, this.createdAt, this.status, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplate#ownerId() ownerId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ownerId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplate withOwnerId(Long value) {
    if (this.ownerId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "ownerId");
    return new ImmutableSurveyTemplate(
        this.targetEntityKind,
        newValue,
        this.createdAt,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplate#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplate withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableSurveyTemplate(
        this.targetEntityKind,
        this.ownerId,
        newValue,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplate#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplate withStatus(ReleaseLifecycleStatus value) {
    if (this.status == value) return this;
    ReleaseLifecycleStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableSurveyTemplate(
        this.targetEntityKind,
        this.ownerId,
        this.createdAt,
        newValue,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyTemplate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyTemplate withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyTemplate(
        this.targetEntityKind,
        this.ownerId,
        this.createdAt,
        this.status,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyTemplate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyTemplate withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyTemplate(
        this.targetEntityKind,
        this.ownerId,
        this.createdAt,
        this.status,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplate#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplate withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSurveyTemplate(
        this.targetEntityKind,
        this.ownerId,
        this.createdAt,
        this.status,
        this.id,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplate#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplate withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSurveyTemplate(this.targetEntityKind, this.ownerId, this.createdAt, this.status, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyTemplate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyTemplate
        && equalTo((ImmutableSurveyTemplate) another);
  }

  private boolean equalTo(ImmutableSurveyTemplate another) {
    return targetEntityKind.equals(another.targetEntityKind)
        && ownerId.equals(another.ownerId)
        && createdAt.equals(another.createdAt)
        && status.equals(another.status)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code targetEntityKind}, {@code ownerId}, {@code createdAt}, {@code status}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + targetEntityKind.hashCode();
    h += (h << 5) + ownerId.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyTemplate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyTemplate{");
    builder.append("targetEntityKind=").append(targetEntityKind);
    builder.append(", ");
    builder.append("ownerId=").append(ownerId);
    builder.append(", ");
    builder.append("createdAt=").append(createdAt);
    builder.append(", ");
    builder.append("status=").append(status);
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
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SurveyTemplate {
    EntityKind targetEntityKind;
    Long ownerId;
    LocalDateTime createdAt;
    ReleaseLifecycleStatus status;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("targetEntityKind")
    public void setTargetEntityKind(EntityKind targetEntityKind) {
      this.targetEntityKind = targetEntityKind;
    }
    @JsonProperty("ownerId")
    public void setOwnerId(Long ownerId) {
      this.ownerId = ownerId;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @JsonProperty("status")
    public void setStatus(ReleaseLifecycleStatus status) {
      this.status = status;
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
    @Override
    public EntityKind targetEntityKind() { throw new UnsupportedOperationException(); }
    @Override
    public Long ownerId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime createdAt() { throw new UnsupportedOperationException(); }
    @Override
    public ReleaseLifecycleStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableSurveyTemplate fromJson(Json json) {
    ImmutableSurveyTemplate.Builder builder = ImmutableSurveyTemplate.builder();
    if (json.targetEntityKind != null) {
      builder.targetEntityKind(json.targetEntityKind);
    }
    if (json.ownerId != null) {
      builder.ownerId(json.ownerId);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    if (json.status != null) {
      builder.status(json.status);
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyTemplate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyTemplate instance
   */
  public static ImmutableSurveyTemplate copyOf(SurveyTemplate instance) {
    if (instance instanceof ImmutableSurveyTemplate) {
      return (ImmutableSurveyTemplate) instance;
    }
    return ImmutableSurveyTemplate.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyTemplate ImmutableSurveyTemplate}.
   * @return A new ImmutableSurveyTemplate builder
   */
  public static ImmutableSurveyTemplate.Builder builder() {
    return new ImmutableSurveyTemplate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyTemplate ImmutableSurveyTemplate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TARGET_ENTITY_KIND = 0x1L;
    private static final long INIT_BIT_OWNER_ID = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private EntityKind targetEntityKind;
    private Long ownerId;
    private LocalDateTime createdAt;
    private ReleaseLifecycleStatus status;
    private Long id;
    private String name;
    private String description;

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyTemplate} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyTemplate instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
      if (object instanceof SurveyTemplate) {
        SurveyTemplate instance = (SurveyTemplate) object;
        createdAt(instance.createdAt());
        ownerId(instance.ownerId());
        targetEntityKind(instance.targetEntityKind());
        status(instance.status());
      }
    }

    /**
     * Initializes the value for the {@link SurveyTemplate#targetEntityKind() targetEntityKind} attribute.
     * @param targetEntityKind The value for targetEntityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetEntityKind")
    public final Builder targetEntityKind(EntityKind targetEntityKind) {
      this.targetEntityKind = Objects.requireNonNull(targetEntityKind, "targetEntityKind");
      initBits &= ~INIT_BIT_TARGET_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyTemplate#ownerId() ownerId} attribute.
     * @param ownerId The value for ownerId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ownerId")
    public final Builder ownerId(Long ownerId) {
      this.ownerId = Objects.requireNonNull(ownerId, "ownerId");
      initBits &= ~INIT_BIT_OWNER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyTemplate#createdAt() createdAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SurveyTemplate#createdAt() createdAt}.</em>
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyTemplate#status() status} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SurveyTemplate#status() status}.</em>
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(ReleaseLifecycleStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyTemplate#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyTemplate#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyTemplate#name() name} attribute.
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
     * Initializes the value for the {@link SurveyTemplate#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyTemplate ImmutableSurveyTemplate}.
     * @return An immutable instance of SurveyTemplate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyTemplate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyTemplate(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TARGET_ENTITY_KIND) != 0) attributes.add("targetEntityKind");
      if ((initBits & INIT_BIT_OWNER_ID) != 0) attributes.add("ownerId");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SurveyTemplate, some of required attributes are not set " + attributes;
    }
  }
}
