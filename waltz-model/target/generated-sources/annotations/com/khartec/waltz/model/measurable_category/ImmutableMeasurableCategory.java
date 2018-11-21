package com.khartec.waltz.model.measurable_category;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.RagNamesProvider;
import com.khartec.waltz.model.rating.RagName;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link MeasurableCategory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasurableCategory.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "MeasurableCategory"})
public final class ImmutableMeasurableCategory
    extends MeasurableCategory {
  private final EntityKind kind;
  private final boolean editable;
  private final long ratingSchemeId;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final String externalId;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;
  private final List<RagName> ragNames;

  private ImmutableMeasurableCategory(ImmutableMeasurableCategory.Builder builder) {
    this.ratingSchemeId = builder.ratingSchemeId;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.externalId = builder.externalId;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    this.ragNames = createUnmodifiableList(true, builder.ragNames);
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.editableIsSet()) {
      initShim.editable(builder.editable);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.kind = initShim.kind();
    this.editable = initShim.editable();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutableMeasurableCategory(
      EntityKind kind,
      boolean editable,
      long ratingSchemeId,
      Long id,
      String name,
      @Nullable String description,
      String externalId,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy,
      List<RagName> ragNames) {
    this.kind = kind;
    this.editable = editable;
    this.ratingSchemeId = ratingSchemeId;
    this.id = id;
    this.name = name;
    this.description = description;
    this.externalId = externalId;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.ragNames = ragNames;
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
        this.kind = Objects.requireNonNull(ImmutableMeasurableCategory.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }
    private boolean editable;
    private int editableBuildStage;

    boolean editable() {
      if (editableBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (editableBuildStage == STAGE_UNINITIALIZED) {
        editableBuildStage = STAGE_INITIALIZING;
        this.editable = ImmutableMeasurableCategory.super.editable();
        editableBuildStage = STAGE_INITIALIZED;
      }
      return this.editable;
    }

    void editable(boolean editable) {
      this.editable = editable;
      editableBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableMeasurableCategory.super.lastUpdatedAt(), "lastUpdatedAt");
        lastUpdatedAtBuildStage = STAGE_INITIALIZED;
      }
      return this.lastUpdatedAt;
    }

    void lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      lastUpdatedAtBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      if (editableBuildStage == STAGE_INITIALIZING) attributes.add("editable");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build MeasurableCategory, attribute initializers form cycle" + attributes;
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
   * Indicates if the measurables in the category may be edited from within the tool.
   * This should only be enabled for taxonomies which are entirely managed from within
   * Waltz.
   * @return true if this measurables in this category can be edited
   */
  @JsonProperty("editable")
  @Override
  public boolean editable() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.editable()
        : this.editable;
  }

  /**
   * A category is linked to a Rating Scheme which provides a mechanism to describe
   * application alignments to this category.  These schemes are typically variants
   * of RAG ratings, or investment ratings.
   * @return id which links to a {@link RatingScheme}
   */
  @JsonProperty("ratingSchemeId")
  @Override
  public long ratingSchemeId() {
    return ratingSchemeId;
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
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
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
   * @return The value of the {@code ragNames} attribute
   */
  @JsonProperty("ragNames")
  @Override
  public List<RagName> ragNames() {
    return ragNames;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableMeasurableCategory(
        newValue,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#editable() editable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for editable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withEditable(boolean value) {
    if (this.editable == value) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        value,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#ratingSchemeId() ratingSchemeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ratingSchemeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withRatingSchemeId(long value) {
    if (this.ratingSchemeId == value) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        value,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasurableCategory#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasurableCategory withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        newValue,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasurableCategory#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasurableCategory withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        value,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        newValue,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        value,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasurableCategory#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasurableCategory withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasurableCategory#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasurableCategory withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        this.externalId,
        newValue,
        this.lastUpdatedBy,
        this.ragNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasurableCategory#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasurableCategory withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        newValue,
        this.ragNames);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MeasurableCategory#ragNames() ragNames}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasurableCategory withRagNames(RagName... elements) {
    List<RagName> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MeasurableCategory#ragNames() ragNames}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of ragNames elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasurableCategory withRagNames(Iterable<? extends RagName> elements) {
    if (this.ragNames == elements) return this;
    List<RagName> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMeasurableCategory(
        this.kind,
        this.editable,
        this.ratingSchemeId,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.lastUpdatedAt,
        this.lastUpdatedBy,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasurableCategory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasurableCategory
        && equalTo((ImmutableMeasurableCategory) another);
  }

  private boolean equalTo(ImmutableMeasurableCategory another) {
    return kind.equals(another.kind)
        && editable == another.editable
        && ratingSchemeId == another.ratingSchemeId
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(externalId, another.externalId)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy)
        && ragNames.equals(another.ragNames);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code editable}, {@code ratingSchemeId}, {@code id}, {@code name}, {@code description}, {@code externalId}, {@code lastUpdatedAt}, {@code lastUpdatedBy}, {@code ragNames}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Boolean.hashCode(editable);
    h += (h << 5) + Long.hashCode(ratingSchemeId);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    h += (h << 5) + ragNames.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MeasurableCategory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasurableCategory{");
    builder.append("kind=").append(kind);
    builder.append(", ");
    builder.append("editable=").append(editable);
    builder.append(", ");
    builder.append("ratingSchemeId=").append(ratingSchemeId);
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
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    builder.append(", ");
    builder.append("ragNames=").append(ragNames);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends MeasurableCategory {
    EntityKind kind;
    boolean editable;
    boolean editableIsSet;
    long ratingSchemeId;
    boolean ratingSchemeIdIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    Optional<String> externalId = Optional.empty();
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    List<RagName> ragNames = Collections.emptyList();
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("editable")
    public void setEditable(boolean editable) {
      this.editable = editable;
      this.editableIsSet = true;
    }
    @JsonProperty("ratingSchemeId")
    public void setRatingSchemeId(long ratingSchemeId) {
      this.ratingSchemeId = ratingSchemeId;
      this.ratingSchemeIdIsSet = true;
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
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @JsonProperty("ragNames")
    public void setRagNames(List<RagName> ragNames) {
      this.ragNames = ragNames;
    }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public boolean editable() { throw new UnsupportedOperationException(); }
    @Override
    public long ratingSchemeId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
    @Override
    public List<RagName> ragNames() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasurableCategory fromJson(Json json) {
    ImmutableMeasurableCategory.Builder builder = ImmutableMeasurableCategory.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.editableIsSet) {
      builder.editable(json.editable);
    }
    if (json.ratingSchemeIdIsSet) {
      builder.ratingSchemeId(json.ratingSchemeId);
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
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    if (json.ragNames != null) {
      builder.addAllRagNames(json.ragNames);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasurableCategory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasurableCategory instance
   */
  public static ImmutableMeasurableCategory copyOf(MeasurableCategory instance) {
    if (instance instanceof ImmutableMeasurableCategory) {
      return (ImmutableMeasurableCategory) instance;
    }
    return ImmutableMeasurableCategory.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMeasurableCategory ImmutableMeasurableCategory}.
   * @return A new ImmutableMeasurableCategory builder
   */
  public static ImmutableMeasurableCategory.Builder builder() {
    return new ImmutableMeasurableCategory.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMeasurableCategory ImmutableMeasurableCategory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_RATING_SCHEME_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private static final long OPT_BIT_EDITABLE = 0x1L;
    private long initBits = 0x7L;
    private long optBits;

    private EntityKind kind;
    private boolean editable;
    private long ratingSchemeId;
    private Long id;
    private String name;
    private String description;
    private String externalId;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;
    private List<RagName> ragNames = new ArrayList<RagName>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_category.MeasurableCategory} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MeasurableCategory instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.RagNamesProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RagNamesProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof MeasurableCategory) {
        MeasurableCategory instance = (MeasurableCategory) object;
        ratingSchemeId(instance.ratingSchemeId());
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
        editable(instance.editable());
      }
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
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof RagNamesProvider) {
        RagNamesProvider instance = (RagNamesProvider) object;
        addAllRagNames(instance.ragNames());
      }
    }

    /**
     * Initializes the value for the {@link MeasurableCategory#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableCategory#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableCategory#editable() editable} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableCategory#editable() editable}.</em>
     * @param editable The value for editable 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("editable")
    public final Builder editable(boolean editable) {
      this.editable = editable;
      optBits |= OPT_BIT_EDITABLE;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableCategory#ratingSchemeId() ratingSchemeId} attribute.
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
     * Initializes the optional value {@link MeasurableCategory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasurableCategory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableCategory#name() name} attribute.
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
     * Initializes the value for the {@link MeasurableCategory#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasurableCategory#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link MeasurableCategory#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableCategory#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MeasurableCategory#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link MeasurableCategory#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Adds one element to {@link MeasurableCategory#ragNames() ragNames} list.
     * @param element A ragNames element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRagNames(RagName element) {
      this.ragNames.add(Objects.requireNonNull(element, "ragNames element"));
      return this;
    }

    /**
     * Adds elements to {@link MeasurableCategory#ragNames() ragNames} list.
     * @param elements An array of ragNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRagNames(RagName... elements) {
      for (RagName element : elements) {
        this.ragNames.add(Objects.requireNonNull(element, "ragNames element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MeasurableCategory#ragNames() ragNames} list.
     * @param elements An iterable of ragNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ragNames")
    public final Builder ragNames(Iterable<? extends RagName> elements) {
      this.ragNames.clear();
      return addAllRagNames(elements);
    }

    /**
     * Adds elements to {@link MeasurableCategory#ragNames() ragNames} list.
     * @param elements An iterable of ragNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRagNames(Iterable<? extends RagName> elements) {
      for (RagName element : elements) {
        this.ragNames.add(Objects.requireNonNull(element, "ragNames element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableMeasurableCategory ImmutableMeasurableCategory}.
     * @return An immutable instance of MeasurableCategory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMeasurableCategory build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMeasurableCategory(this);
    }

    private boolean editableIsSet() {
      return (optBits & OPT_BIT_EDITABLE) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_RATING_SCHEME_ID) != 0) attributes.add("ratingSchemeId");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build MeasurableCategory, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
