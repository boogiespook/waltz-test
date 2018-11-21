package com.khartec.waltz.model.assessment_definition;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.user.Role;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AssessmentDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAssessmentDefinition.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AssessmentDefinition"})
public final class ImmutableAssessmentDefinition
    extends AssessmentDefinition {
  private final EntityKind entityKind;
  private final long ratingSchemeId;
  private final Role permittedRole;
  private final boolean isReadOnly;
  private final Long id;
  private final String externalId;
  private final String name;
  private final @Nullable String description;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final String provenance;

  private ImmutableAssessmentDefinition(ImmutableAssessmentDefinition.Builder builder) {
    this.entityKind = builder.entityKind;
    this.ratingSchemeId = builder.ratingSchemeId;
    this.permittedRole = builder.permittedRole;
    this.isReadOnly = builder.isReadOnly;
    this.id = builder.id;
    this.externalId = builder.externalId;
    this.name = builder.name;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.provenance = initShim.provenance();
    this.initShim = null;
  }

  private ImmutableAssessmentDefinition(
      EntityKind entityKind,
      long ratingSchemeId,
      Role permittedRole,
      boolean isReadOnly,
      Long id,
      String externalId,
      String name,
      @Nullable String description,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      String provenance) {
    this.entityKind = entityKind;
    this.ratingSchemeId = ratingSchemeId;
    this.permittedRole = permittedRole;
    this.isReadOnly = isReadOnly;
    this.id = id;
    this.externalId = externalId;
    this.name = name;
    this.description = description;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.provenance = provenance;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableAssessmentDefinition.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableAssessmentDefinition.super.provenance(), "provenance");
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
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build AssessmentDefinition, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code entityKind} attribute
   */
  @JsonProperty("entityKind")
  @Override
  public EntityKind entityKind() {
    return entityKind;
  }

  /**
   * @return The value of the {@code ratingSchemeId} attribute
   */
  @JsonProperty("ratingSchemeId")
  @Override
  public long ratingSchemeId() {
    return ratingSchemeId;
  }

  /**
   * @return The value of the {@code permittedRole} attribute
   */
  @JsonProperty("permittedRole")
  @Override
  public Optional<Role> permittedRole() {
    return Optional.ofNullable(permittedRole);
  }

  /**
   * @return The value of the {@code isReadOnly} attribute
   */
  @JsonProperty("isReadOnly")
  @Override
  public boolean isReadOnly() {
    return isReadOnly;
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
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#entityKind() entityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withEntityKind(EntityKind value) {
    if (this.entityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "entityKind");
    return new ImmutableAssessmentDefinition(
        newValue,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#ratingSchemeId() ratingSchemeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingSchemeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withRatingSchemeId(long value) {
    if (this.ratingSchemeId == value) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        value,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AssessmentDefinition#permittedRole() permittedRole} attribute.
   * @param value The value for permittedRole
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAssessmentDefinition withPermittedRole(Role value) {
    Role newValue = Objects.requireNonNull(value, "permittedRole");
    if (this.permittedRole == newValue) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        newValue,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AssessmentDefinition#permittedRole() permittedRole} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for permittedRole
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAssessmentDefinition withPermittedRole(Optional<? extends Role> optional) {
    Role value = optional.orElse(null);
    if (Objects.equals(this.permittedRole, value)) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        value,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#isReadOnly() isReadOnly} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isReadOnly
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withIsReadOnly(boolean value) {
    if (this.isReadOnly == value) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        value,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AssessmentDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAssessmentDefinition withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        newValue,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AssessmentDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAssessmentDefinition withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        value,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AssessmentDefinition#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAssessmentDefinition withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        newValue,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AssessmentDefinition#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAssessmentDefinition withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        value,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        newValue,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        newValue,
        this.lastUpdatedBy,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssessmentDefinition#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssessmentDefinition withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableAssessmentDefinition(
        this.entityKind,
        this.ratingSchemeId,
        this.permittedRole,
        this.isReadOnly,
        this.id,
        this.externalId,
        this.name,
        this.description,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAssessmentDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAssessmentDefinition
        && equalTo((ImmutableAssessmentDefinition) another);
  }

  private boolean equalTo(ImmutableAssessmentDefinition another) {
    return entityKind.equals(another.entityKind)
        && ratingSchemeId == another.ratingSchemeId
        && Objects.equals(permittedRole, another.permittedRole)
        && isReadOnly == another.isReadOnly
        && Objects.equals(id, another.id)
        && Objects.equals(externalId, another.externalId)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code entityKind}, {@code ratingSchemeId}, {@code permittedRole}, {@code isReadOnly}, {@code id}, {@code externalId}, {@code name}, {@code description}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityKind.hashCode();
    h += (h << 5) + Long.hashCode(ratingSchemeId);
    h += (h << 5) + Objects.hashCode(permittedRole);
    h += (h << 5) + Boolean.hashCode(isReadOnly);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AssessmentDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AssessmentDefinition{");
    builder.append("entityKind=").append(entityKind);
    builder.append(", ");
    builder.append("ratingSchemeId=").append(ratingSchemeId);
    if (permittedRole != null) {
      builder.append(", ");
      builder.append("permittedRole=").append(permittedRole);
    }
    builder.append(", ");
    builder.append("isReadOnly=").append(isReadOnly);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
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
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
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
  static final class Json extends AssessmentDefinition {
    EntityKind entityKind;
    long ratingSchemeId;
    boolean ratingSchemeIdIsSet;
    Optional<Role> permittedRole = Optional.empty();
    boolean isReadOnly;
    boolean isReadOnlyIsSet;
    Optional<Long> id = Optional.empty();
    Optional<String> externalId = Optional.empty();
    String name;
    String description;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    String provenance;
    @JsonProperty("entityKind")
    public void setEntityKind(EntityKind entityKind) {
      this.entityKind = entityKind;
    }
    @JsonProperty("ratingSchemeId")
    public void setRatingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      this.ratingSchemeIdIsSet = true;
    }
    @JsonProperty("permittedRole")
    public void setPermittedRole(Optional<Role> permittedRole) {
      this.permittedRole = permittedRole;
    }
    @JsonProperty("isReadOnly")
    public void setIsReadOnly(boolean isReadOnly) {
      this.isReadOnly = isReadOnly;
      this.isReadOnlyIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
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
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public EntityKind entityKind() { throw new UnsupportedOperationException(); }
    @Override
    public long ratingSchemeId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Role> permittedRole() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isReadOnly() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
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
  static ImmutableAssessmentDefinition fromJson(Json json) {
    ImmutableAssessmentDefinition.Builder builder = ImmutableAssessmentDefinition.builder();
    if (json.entityKind != null) {
      builder.entityKind(json.entityKind);
    }
    if (json.ratingSchemeIdIsSet) {
      builder.ratingSchemeId(json.ratingSchemeId);
    }
    if (json.permittedRole != null) {
      builder.permittedRole(json.permittedRole);
    }
    if (json.isReadOnlyIsSet) {
      builder.isReadOnly(json.isReadOnly);
    }
    if (json.id != null) {
      builder.id(json.id);
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
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AssessmentDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AssessmentDefinition instance
   */
  public static ImmutableAssessmentDefinition copyOf(AssessmentDefinition instance) {
    if (instance instanceof ImmutableAssessmentDefinition) {
      return (ImmutableAssessmentDefinition) instance;
    }
    return ImmutableAssessmentDefinition.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAssessmentDefinition ImmutableAssessmentDefinition}.
   * @return A new ImmutableAssessmentDefinition builder
   */
  public static ImmutableAssessmentDefinition.Builder builder() {
    return new ImmutableAssessmentDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAssessmentDefinition ImmutableAssessmentDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_KIND = 0x1L;
    private static final long INIT_BIT_RATING_SCHEME_ID = 0x2L;
    private static final long INIT_BIT_IS_READ_ONLY = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x10L;
    private long initBits = 0x1fL;

    private EntityKind entityKind;
    private long ratingSchemeId;
    private Role permittedRole;
    private boolean isReadOnly;
    private Long id;
    private String externalId;
    private String name;
    private String description;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private String provenance;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.assessment_definition.AssessmentDefinition} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AssessmentDefinition instance) {
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
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
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
      if (object instanceof AssessmentDefinition) {
        AssessmentDefinition instance = (AssessmentDefinition) object;
        entityKind(instance.entityKind());
        Optional<Role> permittedRoleOptional = instance.permittedRole();
        if (permittedRoleOptional.isPresent()) {
          permittedRole(permittedRoleOptional);
        }
        isReadOnly(instance.isReadOnly());
        ratingSchemeId(instance.ratingSchemeId());
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
     * Initializes the value for the {@link AssessmentDefinition#entityKind() entityKind} attribute.
     * @param entityKind The value for entityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityKind")
    public final Builder entityKind(EntityKind entityKind) {
      this.entityKind = Objects.requireNonNull(entityKind, "entityKind");
      initBits &= ~INIT_BIT_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link AssessmentDefinition#ratingSchemeId() ratingSchemeId} attribute.
     * @param ratingSchemeId The value for ratingSchemeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ratingSchemeId")
    public final Builder ratingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      initBits &= ~INIT_BIT_RATING_SCHEME_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AssessmentDefinition#permittedRole() permittedRole} to permittedRole.
     * @param permittedRole The value for permittedRole
     * @return {@code this} builder for chained invocation
     */
    public final Builder permittedRole(Role permittedRole) {
      this.permittedRole = Objects.requireNonNull(permittedRole, "permittedRole");
      return this;
    }

    /**
     * Initializes the optional value {@link AssessmentDefinition#permittedRole() permittedRole} to permittedRole.
     * @param permittedRole The value for permittedRole
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("permittedRole")
    public final Builder permittedRole(Optional<? extends Role> permittedRole) {
      this.permittedRole = permittedRole.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AssessmentDefinition#isReadOnly() isReadOnly} attribute.
     * @param isReadOnly The value for isReadOnly 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isReadOnly")
    public final Builder isReadOnly(boolean isReadOnly) {
      this.isReadOnly = isReadOnly;
      initBits &= ~INIT_BIT_IS_READ_ONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link AssessmentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link AssessmentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AssessmentDefinition#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link AssessmentDefinition#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AssessmentDefinition#name() name} attribute.
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
     * Initializes the value for the {@link AssessmentDefinition#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link AssessmentDefinition#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AssessmentDefinition#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link AssessmentDefinition#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Initializes the value for the {@link AssessmentDefinition#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AssessmentDefinition#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableAssessmentDefinition ImmutableAssessmentDefinition}.
     * @return An immutable instance of AssessmentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAssessmentDefinition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAssessmentDefinition(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_KIND) != 0) attributes.add("entityKind");
      if ((initBits & INIT_BIT_RATING_SCHEME_ID) != 0) attributes.add("ratingSchemeId");
      if ((initBits & INIT_BIT_IS_READ_ONLY) != 0) attributes.add("isReadOnly");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build AssessmentDefinition, some of required attributes are not set " + attributes;
    }
  }
}
