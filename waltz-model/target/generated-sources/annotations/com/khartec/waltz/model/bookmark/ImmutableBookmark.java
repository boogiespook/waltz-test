package com.khartec.waltz.model.bookmark;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Bookmark}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBookmark.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Bookmark"})
public final class ImmutableBookmark extends Bookmark {
  private final Long id;
  private final EntityReference parent;
  private final String bookmarkKind;
  private final String title;
  private final String url;
  private final String description;
  private final EntityKind kind;
  private final String provenance;
  private final boolean isPrimary;
  private final boolean isRequired;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableBookmark(ImmutableBookmark.Builder builder) {
    this.id = builder.id;
    this.parent = builder.parent;
    this.bookmarkKind = builder.bookmarkKind;
    this.title = builder.title;
    this.url = builder.url;
    this.description = builder.description;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.isPrimaryIsSet()) {
      initShim.isPrimary(builder.isPrimary);
    }
    if (builder.isRequiredIsSet()) {
      initShim.isRequired(builder.isRequired);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.kind = initShim.kind();
    this.provenance = initShim.provenance();
    this.isPrimary = initShim.isPrimary();
    this.isRequired = initShim.isRequired();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutableBookmark(
      Long id,
      EntityReference parent,
      String bookmarkKind,
      String title,
      String url,
      String description,
      EntityKind kind,
      String provenance,
      boolean isPrimary,
      boolean isRequired,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.id = id;
    this.parent = parent;
    this.bookmarkKind = bookmarkKind;
    this.title = title;
    this.url = url;
    this.description = description;
    this.kind = kind;
    this.provenance = provenance;
    this.isPrimary = isPrimary;
    this.isRequired = isRequired;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
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
        this.kind = Objects.requireNonNull(ImmutableBookmark.super.kind(), "kind");
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
        this.provenance = Objects.requireNonNull(ImmutableBookmark.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private boolean isPrimary;
    private int isPrimaryBuildStage;

    boolean isPrimary() {
      if (isPrimaryBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isPrimaryBuildStage == STAGE_UNINITIALIZED) {
        isPrimaryBuildStage = STAGE_INITIALIZING;
        this.isPrimary = ImmutableBookmark.super.isPrimary();
        isPrimaryBuildStage = STAGE_INITIALIZED;
      }
      return this.isPrimary;
    }

    void isPrimary(boolean isPrimary) {
      this.isPrimary = isPrimary;
      isPrimaryBuildStage = STAGE_INITIALIZED;
    }
    private boolean isRequired;
    private int isRequiredBuildStage;

    boolean isRequired() {
      if (isRequiredBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isRequiredBuildStage == STAGE_UNINITIALIZED) {
        isRequiredBuildStage = STAGE_INITIALIZING;
        this.isRequired = ImmutableBookmark.super.isRequired();
        isRequiredBuildStage = STAGE_INITIALIZED;
      }
      return this.isRequired;
    }

    void isRequired(boolean isRequired) {
      this.isRequired = isRequired;
      isRequiredBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableBookmark.super.lastUpdatedAt(), "lastUpdatedAt");
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
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (isPrimaryBuildStage == STAGE_INITIALIZING) attributes.add("isPrimary");
      if (isRequiredBuildStage == STAGE_INITIALIZING) attributes.add("isRequired");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build Bookmark, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public EntityReference parent() {
    return parent;
  }

  /**
   * @return The value of the {@code bookmarkKind} attribute
   */
  @JsonProperty("bookmarkKind")
  @Override
  public String bookmarkKind() {
    return bookmarkKind;
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<String> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code isPrimary} attribute
   */
  @JsonProperty("isPrimary")
  @Override
  public boolean isPrimary() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isPrimary()
        : this.isPrimary;
  }

  /**
   * @return The value of the {@code isRequired} attribute
   */
  @JsonProperty("isRequired")
  @Override
  public boolean isRequired() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isRequired()
        : this.isRequired;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bookmark#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBookmark(
        newValue,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bookmark#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBookmark(
        value,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#parent() parent} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withParent(EntityReference value) {
    if (this.parent == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "parent");
    return new ImmutableBookmark(
        this.id,
        newValue,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#bookmarkKind() bookmarkKind} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bookmarkKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withBookmarkKind(String value) {
    if (this.bookmarkKind.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "bookmarkKind");
    return new ImmutableBookmark(
        this.id,
        this.parent,
        newValue,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bookmark#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withTitle(String value) {
    String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        newValue,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bookmark#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withTitle(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        value,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bookmark#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withUrl(String value) {
    String newValue = Objects.requireNonNull(value, "url");
    if (Objects.equals(this.url, newValue)) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        newValue,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bookmark#url() url} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withUrl(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.url, value)) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        value,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bookmark#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        newValue,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bookmark#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBookmark withDescription(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        value,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        newValue,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        newValue,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#isPrimary() isPrimary} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isPrimary
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withIsPrimary(boolean value) {
    if (this.isPrimary == value) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        value,
        this.isRequired,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#isRequired() isRequired} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRequired
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withIsRequired(boolean value) {
    if (this.isRequired == value) return this;
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        value,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        newValue,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Bookmark#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBookmark withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableBookmark(
        this.id,
        this.parent,
        this.bookmarkKind,
        this.title,
        this.url,
        this.description,
        this.kind,
        this.provenance,
        this.isPrimary,
        this.isRequired,
        this.lastUpdatedAt,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBookmark} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBookmark
        && equalTo((ImmutableBookmark) another);
  }

  private boolean equalTo(ImmutableBookmark another) {
    return Objects.equals(id, another.id)
        && parent.equals(another.parent)
        && bookmarkKind.equals(another.bookmarkKind)
        && Objects.equals(title, another.title)
        && Objects.equals(url, another.url)
        && Objects.equals(description, another.description)
        && kind.equals(another.kind)
        && provenance.equals(another.provenance)
        && isPrimary == another.isPrimary
        && isRequired == another.isRequired
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code parent}, {@code bookmarkKind}, {@code title}, {@code url}, {@code description}, {@code kind}, {@code provenance}, {@code isPrimary}, {@code isRequired}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + parent.hashCode();
    h += (h << 5) + bookmarkKind.hashCode();
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Boolean.hashCode(isPrimary);
    h += (h << 5) + Boolean.hashCode(isRequired);
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Bookmark} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bookmark{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("parent=").append(parent);
    builder.append(", ");
    builder.append("bookmarkKind=").append(bookmarkKind);
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("kind=").append(kind);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    builder.append(", ");
    builder.append("isPrimary=").append(isPrimary);
    builder.append(", ");
    builder.append("isRequired=").append(isRequired);
    builder.append(", ");
    builder.append("lastUpdatedAt=").append(lastUpdatedAt);
    builder.append(", ");
    builder.append("lastUpdatedBy=").append(lastUpdatedBy);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Bookmark {
    Optional<Long> id = Optional.empty();
    EntityReference parent;
    String bookmarkKind;
    Optional<String> title = Optional.empty();
    Optional<String> url = Optional.empty();
    Optional<String> description = Optional.empty();
    EntityKind kind;
    String provenance;
    boolean isPrimary;
    boolean isPrimaryIsSet;
    boolean isRequired;
    boolean isRequiredIsSet;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("parent")
    public void setParent(EntityReference parent) {
      this.parent = parent;
    }
    @JsonProperty("bookmarkKind")
    public void setBookmarkKind(String bookmarkKind) {
      this.bookmarkKind = bookmarkKind;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
    }
    @JsonProperty("url")
    public void setUrl(Optional<String> url) {
      this.url = url;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("isPrimary")
    public void setIsPrimary(boolean isPrimary) {
      this.isPrimary = isPrimary;
      this.isPrimaryIsSet = true;
    }
    @JsonProperty("isRequired")
    public void setIsRequired(boolean isRequired) {
      this.isRequired = isRequired;
      this.isRequiredIsSet = true;
    }
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
    }
    @JsonProperty("lastUpdatedBy")
    public void setLastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
    }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference parent() { throw new UnsupportedOperationException(); }
    @Override
    public String bookmarkKind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isPrimary() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isRequired() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime lastUpdatedAt() { throw new UnsupportedOperationException(); }
    @Override
    public String lastUpdatedBy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBookmark fromJson(Json json) {
    ImmutableBookmark.Builder builder = ImmutableBookmark.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.parent != null) {
      builder.parent(json.parent);
    }
    if (json.bookmarkKind != null) {
      builder.bookmarkKind(json.bookmarkKind);
    }
    if (json.title != null) {
      builder.title(json.title);
    }
    if (json.url != null) {
      builder.url(json.url);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.isPrimaryIsSet) {
      builder.isPrimary(json.isPrimary);
    }
    if (json.isRequiredIsSet) {
      builder.isRequired(json.isRequired);
    }
    if (json.lastUpdatedAt != null) {
      builder.lastUpdatedAt(json.lastUpdatedAt);
    }
    if (json.lastUpdatedBy != null) {
      builder.lastUpdatedBy(json.lastUpdatedBy);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bookmark} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bookmark instance
   */
  public static ImmutableBookmark copyOf(Bookmark instance) {
    if (instance instanceof ImmutableBookmark) {
      return (ImmutableBookmark) instance;
    }
    return ImmutableBookmark.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBookmark ImmutableBookmark}.
   * @return A new ImmutableBookmark builder
   */
  public static ImmutableBookmark.Builder builder() {
    return new ImmutableBookmark.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBookmark ImmutableBookmark}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PARENT = 0x1L;
    private static final long INIT_BIT_BOOKMARK_KIND = 0x2L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x4L;
    private static final long OPT_BIT_IS_PRIMARY = 0x1L;
    private static final long OPT_BIT_IS_REQUIRED = 0x2L;
    private long initBits = 0x7L;
    private long optBits;

    private Long id;
    private EntityReference parent;
    private String bookmarkKind;
    private String title;
    private String url;
    private String description;
    private EntityKind kind;
    private String provenance;
    private boolean isPrimary;
    private boolean isRequired;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.bookmark.Bookmark} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Bookmark instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x2L) == 0) {
          kind(instance.kind());
          bits |= 0x2L;
        }
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        if ((bits & 0x4L) == 0) {
          Optional<Long> idOptional = instance.id();
          if (idOptional.isPresent()) {
            id(idOptional);
          }
          bits |= 0x4L;
        }
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
      if (object instanceof Bookmark) {
        Bookmark instance = (Bookmark) object;
        parent(instance.parent());
        isRequired(instance.isRequired());
        bookmarkKind(instance.bookmarkKind());
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
        if ((bits & 0x2L) == 0) {
          kind(instance.kind());
          bits |= 0x2L;
        }
        isPrimary(instance.isPrimary());
        Optional<String> descriptionOptional = instance.description();
        if (descriptionOptional.isPresent()) {
          description(descriptionOptional);
        }
        if ((bits & 0x4L) == 0) {
          Optional<Long> idOptional = instance.id();
          if (idOptional.isPresent()) {
            id(idOptional);
          }
          bits |= 0x4L;
        }
        Optional<String> titleOptional = instance.title();
        if (titleOptional.isPresent()) {
          title(titleOptional);
        }
        Optional<String> urlOptional = instance.url();
        if (urlOptional.isPresent()) {
          url(urlOptional);
        }
      }
    }

    /**
     * Initializes the optional value {@link Bookmark#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#parent() parent} attribute.
     * @param parent The value for parent 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(EntityReference parent) {
      this.parent = Objects.requireNonNull(parent, "parent");
      initBits &= ~INIT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#bookmarkKind() bookmarkKind} attribute.
     * @param bookmarkKind The value for bookmarkKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bookmarkKind")
    public final Builder bookmarkKind(String bookmarkKind) {
      this.bookmarkKind = Objects.requireNonNull(bookmarkKind, "bookmarkKind");
      initBits &= ~INIT_BIT_BOOKMARK_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      this.title = title.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(String url) {
      this.url = Objects.requireNonNull(url, "url");
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<String> url) {
      this.url = url.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      return this;
    }

    /**
     * Initializes the optional value {@link Bookmark#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      this.description = description.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Bookmark#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Bookmark#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#isPrimary() isPrimary} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Bookmark#isPrimary() isPrimary}.</em>
     * @param isPrimary The value for isPrimary 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isPrimary")
    public final Builder isPrimary(boolean isPrimary) {
      this.isPrimary = isPrimary;
      optBits |= OPT_BIT_IS_PRIMARY;
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#isRequired() isRequired} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Bookmark#isRequired() isRequired}.</em>
     * @param isRequired The value for isRequired 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isRequired")
    public final Builder isRequired(boolean isRequired) {
      this.isRequired = isRequired;
      optBits |= OPT_BIT_IS_REQUIRED;
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Bookmark#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link Bookmark#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Builds a new {@link ImmutableBookmark ImmutableBookmark}.
     * @return An immutable instance of Bookmark
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBookmark build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBookmark(this);
    }

    private boolean isPrimaryIsSet() {
      return (optBits & OPT_BIT_IS_PRIMARY) != 0;
    }

    private boolean isRequiredIsSet() {
      return (optBits & OPT_BIT_IS_REQUIRED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_PARENT) != 0) attributes.add("parent");
      if ((initBits & INIT_BIT_BOOKMARK_KIND) != 0) attributes.add("bookmarkKind");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build Bookmark, some of required attributes are not set " + attributes;
    }
  }
}
