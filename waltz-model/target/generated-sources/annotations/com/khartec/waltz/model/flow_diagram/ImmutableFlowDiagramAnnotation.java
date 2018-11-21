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
 * Immutable implementation of {@link FlowDiagramAnnotation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlowDiagramAnnotation.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "FlowDiagramAnnotation"})
public final class ImmutableFlowDiagramAnnotation
    extends FlowDiagramAnnotation {
  private final String annotationId;
  private final Long diagramId;
  private final EntityReference entityReference;
  private final String note;

  private ImmutableFlowDiagramAnnotation(
      String annotationId,
      Long diagramId,
      EntityReference entityReference,
      String note) {
    this.annotationId = annotationId;
    this.diagramId = diagramId;
    this.entityReference = entityReference;
    this.note = note;
  }

  /**
   * @return The value of the {@code annotationId} attribute
   */
  @JsonProperty("annotationId")
  @Override
  public String annotationId() {
    return annotationId;
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public String note() {
    return note;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagramAnnotation#annotationId() annotationId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for annotationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagramAnnotation withAnnotationId(String value) {
    if (this.annotationId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "annotationId");
    return new ImmutableFlowDiagramAnnotation(newValue, this.diagramId, this.entityReference, this.note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FlowDiagramAnnotation#diagramId() diagramId} attribute.
   * @param value The value for diagramId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlowDiagramAnnotation withDiagramId(long value) {
    Long newValue = value;
    if (Objects.equals(this.diagramId, newValue)) return this;
    return new ImmutableFlowDiagramAnnotation(this.annotationId, newValue, this.entityReference, this.note);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FlowDiagramAnnotation#diagramId() diagramId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagramId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFlowDiagramAnnotation withDiagramId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.diagramId, value)) return this;
    return new ImmutableFlowDiagramAnnotation(this.annotationId, value, this.entityReference, this.note);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagramAnnotation#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagramAnnotation withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableFlowDiagramAnnotation(this.annotationId, this.diagramId, newValue, this.note);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlowDiagramAnnotation#note() note} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for note
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlowDiagramAnnotation withNote(String value) {
    if (this.note.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "note");
    return new ImmutableFlowDiagramAnnotation(this.annotationId, this.diagramId, this.entityReference, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlowDiagramAnnotation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlowDiagramAnnotation
        && equalTo((ImmutableFlowDiagramAnnotation) another);
  }

  private boolean equalTo(ImmutableFlowDiagramAnnotation another) {
    return annotationId.equals(another.annotationId)
        && Objects.equals(diagramId, another.diagramId)
        && entityReference.equals(another.entityReference)
        && note.equals(another.note);
  }

  /**
   * Computes a hash code from attributes: {@code annotationId}, {@code diagramId}, {@code entityReference}, {@code note}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + annotationId.hashCode();
    h += (h << 5) + Objects.hashCode(diagramId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + note.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code FlowDiagramAnnotation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("FlowDiagramAnnotation{");
    builder.append("annotationId=").append(annotationId);
    if (diagramId != null) {
      builder.append(", ");
      builder.append("diagramId=").append(diagramId);
    }
    builder.append(", ");
    builder.append("entityReference=").append(entityReference);
    builder.append(", ");
    builder.append("note=").append(note);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends FlowDiagramAnnotation {
    String annotationId;
    Optional<Long> diagramId = Optional.empty();
    EntityReference entityReference;
    String note;
    @JsonProperty("annotationId")
    public void setAnnotationId(String annotationId) {
      this.annotationId = annotationId;
    }
    @JsonProperty("diagramId")
    public void setDiagramId(Optional<Long> diagramId) {
      this.diagramId = diagramId;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("note")
    public void setNote(String note) {
      this.note = note;
    }
    @Override
    public String annotationId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> diagramId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public String note() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFlowDiagramAnnotation fromJson(Json json) {
    ImmutableFlowDiagramAnnotation.Builder builder = ImmutableFlowDiagramAnnotation.builder();
    if (json.annotationId != null) {
      builder.annotationId(json.annotationId);
    }
    if (json.diagramId != null) {
      builder.diagramId(json.diagramId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.note != null) {
      builder.note(json.note);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FlowDiagramAnnotation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FlowDiagramAnnotation instance
   */
  public static ImmutableFlowDiagramAnnotation copyOf(FlowDiagramAnnotation instance) {
    if (instance instanceof ImmutableFlowDiagramAnnotation) {
      return (ImmutableFlowDiagramAnnotation) instance;
    }
    return ImmutableFlowDiagramAnnotation.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFlowDiagramAnnotation ImmutableFlowDiagramAnnotation}.
   * @return A new ImmutableFlowDiagramAnnotation builder
   */
  public static ImmutableFlowDiagramAnnotation.Builder builder() {
    return new ImmutableFlowDiagramAnnotation.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFlowDiagramAnnotation ImmutableFlowDiagramAnnotation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ANNOTATION_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_NOTE = 0x4L;
    private long initBits = 0x7L;

    private String annotationId;
    private Long diagramId;
    private EntityReference entityReference;
    private String note;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FlowDiagramAnnotation} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FlowDiagramAnnotation instance) {
      Objects.requireNonNull(instance, "instance");
      annotationId(instance.annotationId());
      Optional<Long> diagramIdOptional = instance.diagramId();
      if (diagramIdOptional.isPresent()) {
        diagramId(diagramIdOptional);
      }
      entityReference(instance.entityReference());
      note(instance.note());
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagramAnnotation#annotationId() annotationId} attribute.
     * @param annotationId The value for annotationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("annotationId")
    public final Builder annotationId(String annotationId) {
      this.annotationId = Objects.requireNonNull(annotationId, "annotationId");
      initBits &= ~INIT_BIT_ANNOTATION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link FlowDiagramAnnotation#diagramId() diagramId} to diagramId.
     * @param diagramId The value for diagramId
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagramId(long diagramId) {
      this.diagramId = diagramId;
      return this;
    }

    /**
     * Initializes the optional value {@link FlowDiagramAnnotation#diagramId() diagramId} to diagramId.
     * @param diagramId The value for diagramId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagramId")
    public final Builder diagramId(Optional<Long> diagramId) {
      this.diagramId = diagramId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link FlowDiagramAnnotation#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link FlowDiagramAnnotation#note() note} attribute.
     * @param note The value for note 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(String note) {
      this.note = Objects.requireNonNull(note, "note");
      initBits &= ~INIT_BIT_NOTE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFlowDiagramAnnotation ImmutableFlowDiagramAnnotation}.
     * @return An immutable instance of FlowDiagramAnnotation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFlowDiagramAnnotation build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFlowDiagramAnnotation(annotationId, diagramId, entityReference, note);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ANNOTATION_ID) != 0) attributes.add("annotationId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_NOTE) != 0) attributes.add("note");
      return "Cannot build FlowDiagramAnnotation, some of required attributes are not set " + attributes;
    }
  }
}
