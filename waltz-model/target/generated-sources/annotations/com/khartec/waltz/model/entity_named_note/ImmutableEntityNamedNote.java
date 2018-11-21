package com.khartec.waltz.model.entity_named_note;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityNamedNote}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityNamedNote.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityNamedNote"})
public final class ImmutableEntityNamedNote extends EntityNamedNote {
  private final EntityReference entityReference;
  private final long namedNoteTypeId;
  private final String noteText;
  private final String provenance;
  private final LocalDateTime lastUpdatedAt;
  private final String lastUpdatedBy;

  private ImmutableEntityNamedNote(ImmutableEntityNamedNote.Builder builder) {
    this.entityReference = builder.entityReference;
    this.namedNoteTypeId = builder.namedNoteTypeId;
    this.noteText = builder.noteText;
    this.lastUpdatedBy = builder.lastUpdatedBy;
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.lastUpdatedAt != null) {
      initShim.lastUpdatedAt(builder.lastUpdatedAt);
    }
    this.provenance = initShim.provenance();
    this.lastUpdatedAt = initShim.lastUpdatedAt();
    this.initShim = null;
  }

  private ImmutableEntityNamedNote(
      EntityReference entityReference,
      long namedNoteTypeId,
      String noteText,
      String provenance,
      LocalDateTime lastUpdatedAt,
      String lastUpdatedBy) {
    this.entityReference = entityReference;
    this.namedNoteTypeId = namedNoteTypeId;
    this.noteText = noteText;
    this.provenance = provenance;
    this.lastUpdatedAt = lastUpdatedAt;
    this.lastUpdatedBy = lastUpdatedBy;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableEntityNamedNote.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime lastUpdatedAt;
    private int lastUpdatedAtBuildStage;

    LocalDateTime lastUpdatedAt() {
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lastUpdatedAtBuildStage == STAGE_UNINITIALIZED) {
        lastUpdatedAtBuildStage = STAGE_INITIALIZING;
        this.lastUpdatedAt = Objects.requireNonNull(ImmutableEntityNamedNote.super.lastUpdatedAt(), "lastUpdatedAt");
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
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (lastUpdatedAtBuildStage == STAGE_INITIALIZING) attributes.add("lastUpdatedAt");
      return "Cannot build EntityNamedNote, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code namedNoteTypeId} attribute
   */
  @JsonProperty("namedNoteTypeId")
  @Override
  public long namedNoteTypeId() {
    return namedNoteTypeId;
  }

  /**
   * @return The value of the {@code noteText} attribute
   */
  @JsonProperty("noteText")
  @Override
  public String noteText() {
    return noteText;
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
   * Copy the current immutable object by setting a value for the {@link EntityNamedNote#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNote withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntityNamedNote(
        newValue,
        this.namedNoteTypeId,
        this.noteText,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNote#namedNoteTypeId() namedNoteTypeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for namedNoteTypeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNote withNamedNoteTypeId(long value) {
    if (this.namedNoteTypeId == value) return this;
    return new ImmutableEntityNamedNote(
        this.entityReference,
        value,
        this.noteText,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNote#noteText() noteText} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for noteText
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNote withNoteText(String value) {
    if (this.noteText.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "noteText");
    return new ImmutableEntityNamedNote(
        this.entityReference,
        this.namedNoteTypeId,
        newValue,
        this.provenance,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNote#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNote withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntityNamedNote(
        this.entityReference,
        this.namedNoteTypeId,
        this.noteText,
        newValue,
        this.lastUpdatedAt,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNote#lastUpdatedAt() lastUpdatedAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNote withLastUpdatedAt(LocalDateTime value) {
    if (this.lastUpdatedAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "lastUpdatedAt");
    return new ImmutableEntityNamedNote(
        this.entityReference,
        this.namedNoteTypeId,
        this.noteText,
        this.provenance,
        newValue,
        this.lastUpdatedBy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNote#lastUpdatedBy() lastUpdatedBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdatedBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNote withLastUpdatedBy(String value) {
    if (this.lastUpdatedBy.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastUpdatedBy");
    return new ImmutableEntityNamedNote(
        this.entityReference,
        this.namedNoteTypeId,
        this.noteText,
        this.provenance,
        this.lastUpdatedAt,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityNamedNote} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityNamedNote
        && equalTo((ImmutableEntityNamedNote) another);
  }

  private boolean equalTo(ImmutableEntityNamedNote another) {
    return entityReference.equals(another.entityReference)
        && namedNoteTypeId == another.namedNoteTypeId
        && noteText.equals(another.noteText)
        && provenance.equals(another.provenance)
        && lastUpdatedAt.equals(another.lastUpdatedAt)
        && lastUpdatedBy.equals(another.lastUpdatedBy);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code namedNoteTypeId}, {@code noteText}, {@code provenance}, {@code lastUpdatedAt}, {@code lastUpdatedBy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Long.hashCode(namedNoteTypeId);
    h += (h << 5) + noteText.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + lastUpdatedAt.hashCode();
    h += (h << 5) + lastUpdatedBy.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EntityNamedNote} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "EntityNamedNote{"
        + "entityReference=" + entityReference
        + ", namedNoteTypeId=" + namedNoteTypeId
        + ", noteText=" + noteText
        + ", provenance=" + provenance
        + ", lastUpdatedAt=" + lastUpdatedAt
        + ", lastUpdatedBy=" + lastUpdatedBy
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EntityNamedNote {
    EntityReference entityReference;
    long namedNoteTypeId;
    boolean namedNoteTypeIdIsSet;
    String noteText;
    String provenance;
    LocalDateTime lastUpdatedAt;
    String lastUpdatedBy;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("namedNoteTypeId")
    public void setNamedNoteTypeId(long namedNoteTypeId) {
      this.namedNoteTypeId = namedNoteTypeId;
      this.namedNoteTypeIdIsSet = true;
    }
    @JsonProperty("noteText")
    public void setNoteText(String noteText) {
      this.noteText = noteText;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
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
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public long namedNoteTypeId() { throw new UnsupportedOperationException(); }
    @Override
    public String noteText() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityNamedNote fromJson(Json json) {
    ImmutableEntityNamedNote.Builder builder = ImmutableEntityNamedNote.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.namedNoteTypeIdIsSet) {
      builder.namedNoteTypeId(json.namedNoteTypeId);
    }
    if (json.noteText != null) {
      builder.noteText(json.noteText);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
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
   * Creates an immutable copy of a {@link EntityNamedNote} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityNamedNote instance
   */
  public static ImmutableEntityNamedNote copyOf(EntityNamedNote instance) {
    if (instance instanceof ImmutableEntityNamedNote) {
      return (ImmutableEntityNamedNote) instance;
    }
    return ImmutableEntityNamedNote.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityNamedNote ImmutableEntityNamedNote}.
   * @return A new ImmutableEntityNamedNote builder
   */
  public static ImmutableEntityNamedNote.Builder builder() {
    return new ImmutableEntityNamedNote.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityNamedNote ImmutableEntityNamedNote}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_NAMED_NOTE_TYPE_ID = 0x2L;
    private static final long INIT_BIT_NOTE_TEXT = 0x4L;
    private static final long INIT_BIT_LAST_UPDATED_BY = 0x8L;
    private long initBits = 0xfL;

    private EntityReference entityReference;
    private long namedNoteTypeId;
    private String noteText;
    private String provenance;
    private LocalDateTime lastUpdatedAt;
    private String lastUpdatedBy;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_named_note.EntityNamedNote} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityNamedNote instance) {
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ProvenanceProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProvenanceProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof EntityNamedNote) {
        EntityNamedNote instance = (EntityNamedNote) object;
        noteText(instance.noteText());
        namedNoteTypeId(instance.namedNoteTypeId());
        entityReference(instance.entityReference());
      }
      if (object instanceof LastUpdatedProvider) {
        LastUpdatedProvider instance = (LastUpdatedProvider) object;
        lastUpdatedBy(instance.lastUpdatedBy());
        lastUpdatedAt(instance.lastUpdatedAt());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link EntityNamedNote#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link EntityNamedNote#namedNoteTypeId() namedNoteTypeId} attribute.
     * @param namedNoteTypeId The value for namedNoteTypeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("namedNoteTypeId")
    public final Builder namedNoteTypeId(long namedNoteTypeId) {
      this.namedNoteTypeId = namedNoteTypeId;
      initBits &= ~INIT_BIT_NAMED_NOTE_TYPE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityNamedNote#noteText() noteText} attribute.
     * @param noteText The value for noteText 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("noteText")
    public final Builder noteText(String noteText) {
      this.noteText = Objects.requireNonNull(noteText, "noteText");
      initBits &= ~INIT_BIT_NOTE_TEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link EntityNamedNote#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityNamedNote#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityNamedNote#lastUpdatedAt() lastUpdatedAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntityNamedNote#lastUpdatedAt() lastUpdatedAt}.</em>
     * @param lastUpdatedAt The value for lastUpdatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdatedAt")
    public final Builder lastUpdatedAt(LocalDateTime lastUpdatedAt) {
      this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt, "lastUpdatedAt");
      return this;
    }

    /**
     * Initializes the value for the {@link EntityNamedNote#lastUpdatedBy() lastUpdatedBy} attribute.
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
     * Builds a new {@link ImmutableEntityNamedNote ImmutableEntityNamedNote}.
     * @return An immutable instance of EntityNamedNote
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityNamedNote build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityNamedNote(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_NAMED_NOTE_TYPE_ID) != 0) attributes.add("namedNoteTypeId");
      if ((initBits & INIT_BIT_NOTE_TEXT) != 0) attributes.add("noteText");
      if ((initBits & INIT_BIT_LAST_UPDATED_BY) != 0) attributes.add("lastUpdatedBy");
      return "Cannot build EntityNamedNote, some of required attributes are not set " + attributes;
    }
  }
}
