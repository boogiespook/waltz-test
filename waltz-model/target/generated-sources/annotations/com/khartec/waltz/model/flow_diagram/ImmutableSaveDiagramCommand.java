package com.khartec.waltz.model.flow_diagram;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SaveDiagramCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSaveDiagramCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SaveDiagramCommand"})
public final class ImmutableSaveDiagramCommand extends SaveDiagramCommand {
  private final Long diagramId;
  private final String layoutData;
  private final List<FlowDiagramEntity> entities;
  private final List<FlowDiagramAnnotation> annotations;
  private final String name;
  private final @Nullable String description;

  private ImmutableSaveDiagramCommand(
      Long diagramId,
      String layoutData,
      List<FlowDiagramEntity> entities,
      List<FlowDiagramAnnotation> annotations,
      String name,
      @Nullable String description) {
    this.diagramId = diagramId;
    this.layoutData = layoutData;
    this.entities = entities;
    this.annotations = annotations;
    this.name = name;
    this.description = description;
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
   * @return The value of the {@code layoutData} attribute
   */
  @JsonProperty("layoutData")
  @Override
  public String layoutData() {
    return layoutData;
  }

  /**
   * @return The value of the {@code entities} attribute
   */
  @JsonProperty("entities")
  @Override
  public List<FlowDiagramEntity> entities() {
    return entities;
  }

  /**
   * @return The value of the {@code annotations} attribute
   */
  @JsonProperty("annotations")
  @Override
  public List<FlowDiagramAnnotation> annotations() {
    return annotations;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SaveDiagramCommand#diagramId() diagramId} attribute.
   * @param value The value for diagramId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveDiagramCommand withDiagramId(long value) {
    Long newValue = value;
    if (Objects.equals(this.diagramId, newValue)) return this;
    return new ImmutableSaveDiagramCommand(newValue, this.layoutData, this.entities, this.annotations, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SaveDiagramCommand#diagramId() diagramId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagramId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveDiagramCommand withDiagramId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.diagramId, value)) return this;
    return new ImmutableSaveDiagramCommand(value, this.layoutData, this.entities, this.annotations, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveDiagramCommand#layoutData() layoutData} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for layoutData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveDiagramCommand withLayoutData(String value) {
    if (this.layoutData.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "layoutData");
    return new ImmutableSaveDiagramCommand(this.diagramId, newValue, this.entities, this.annotations, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SaveDiagramCommand#entities() entities}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveDiagramCommand withEntities(FlowDiagramEntity... elements) {
    List<FlowDiagramEntity> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSaveDiagramCommand(this.diagramId, this.layoutData, newValue, this.annotations, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SaveDiagramCommand#entities() entities}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of entities elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveDiagramCommand withEntities(Iterable<? extends FlowDiagramEntity> elements) {
    if (this.entities == elements) return this;
    List<FlowDiagramEntity> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSaveDiagramCommand(this.diagramId, this.layoutData, newValue, this.annotations, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SaveDiagramCommand#annotations() annotations}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveDiagramCommand withAnnotations(FlowDiagramAnnotation... elements) {
    List<FlowDiagramAnnotation> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSaveDiagramCommand(this.diagramId, this.layoutData, this.entities, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SaveDiagramCommand#annotations() annotations}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of annotations elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSaveDiagramCommand withAnnotations(Iterable<? extends FlowDiagramAnnotation> elements) {
    if (this.annotations == elements) return this;
    List<FlowDiagramAnnotation> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSaveDiagramCommand(this.diagramId, this.layoutData, this.entities, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveDiagramCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveDiagramCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSaveDiagramCommand(this.diagramId, this.layoutData, this.entities, this.annotations, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SaveDiagramCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSaveDiagramCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSaveDiagramCommand(this.diagramId, this.layoutData, this.entities, this.annotations, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSaveDiagramCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSaveDiagramCommand
        && equalTo((ImmutableSaveDiagramCommand) another);
  }

  private boolean equalTo(ImmutableSaveDiagramCommand another) {
    return Objects.equals(diagramId, another.diagramId)
        && layoutData.equals(another.layoutData)
        && entities.equals(another.entities)
        && annotations.equals(another.annotations)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code diagramId}, {@code layoutData}, {@code entities}, {@code annotations}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(diagramId);
    h += (h << 5) + layoutData.hashCode();
    h += (h << 5) + entities.hashCode();
    h += (h << 5) + annotations.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code SaveDiagramCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SaveDiagramCommand{");
    if (diagramId != null) {
      builder.append("diagramId=").append(diagramId);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("layoutData=").append(layoutData);
    builder.append(", ");
    builder.append("entities=").append(entities);
    builder.append(", ");
    builder.append("annotations=").append(annotations);
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
  static final class Json extends SaveDiagramCommand {
    Optional<Long> diagramId = Optional.empty();
    String layoutData;
    List<FlowDiagramEntity> entities = Collections.emptyList();
    List<FlowDiagramAnnotation> annotations = Collections.emptyList();
    String name;
    String description;
    @JsonProperty("diagramId")
    public void setDiagramId(Optional<Long> diagramId) {
      this.diagramId = diagramId;
    }
    @JsonProperty("layoutData")
    public void setLayoutData(String layoutData) {
      this.layoutData = layoutData;
    }
    @JsonProperty("entities")
    public void setEntities(List<FlowDiagramEntity> entities) {
      this.entities = entities;
    }
    @JsonProperty("annotations")
    public void setAnnotations(List<FlowDiagramAnnotation> annotations) {
      this.annotations = annotations;
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
    public Optional<Long> diagramId() { throw new UnsupportedOperationException(); }
    @Override
    public String layoutData() { throw new UnsupportedOperationException(); }
    @Override
    public List<FlowDiagramEntity> entities() { throw new UnsupportedOperationException(); }
    @Override
    public List<FlowDiagramAnnotation> annotations() { throw new UnsupportedOperationException(); }
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
  static ImmutableSaveDiagramCommand fromJson(Json json) {
    ImmutableSaveDiagramCommand.Builder builder = ImmutableSaveDiagramCommand.builder();
    if (json.diagramId != null) {
      builder.diagramId(json.diagramId);
    }
    if (json.layoutData != null) {
      builder.layoutData(json.layoutData);
    }
    if (json.entities != null) {
      builder.addAllEntities(json.entities);
    }
    if (json.annotations != null) {
      builder.addAllAnnotations(json.annotations);
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
   * Creates an immutable copy of a {@link SaveDiagramCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SaveDiagramCommand instance
   */
  public static ImmutableSaveDiagramCommand copyOf(SaveDiagramCommand instance) {
    if (instance instanceof ImmutableSaveDiagramCommand) {
      return (ImmutableSaveDiagramCommand) instance;
    }
    return ImmutableSaveDiagramCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSaveDiagramCommand ImmutableSaveDiagramCommand}.
   * @return A new ImmutableSaveDiagramCommand builder
   */
  public static ImmutableSaveDiagramCommand.Builder builder() {
    return new ImmutableSaveDiagramCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSaveDiagramCommand ImmutableSaveDiagramCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_LAYOUT_DATA = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private Long diagramId;
    private String layoutData;
    private List<FlowDiagramEntity> entities = new ArrayList<FlowDiagramEntity>();
    private List<FlowDiagramAnnotation> annotations = new ArrayList<FlowDiagramAnnotation>();
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.flow_diagram.SaveDiagramCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SaveDiagramCommand instance) {
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
      if (object instanceof SaveDiagramCommand) {
        SaveDiagramCommand instance = (SaveDiagramCommand) object;
        layoutData(instance.layoutData());
        addAllAnnotations(instance.annotations());
        Optional<Long> diagramIdOptional = instance.diagramId();
        if (diagramIdOptional.isPresent()) {
          diagramId(diagramIdOptional);
        }
        addAllEntities(instance.entities());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the optional value {@link SaveDiagramCommand#diagramId() diagramId} to diagramId.
     * @param diagramId The value for diagramId
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagramId(long diagramId) {
      this.diagramId = diagramId;
      return this;
    }

    /**
     * Initializes the optional value {@link SaveDiagramCommand#diagramId() diagramId} to diagramId.
     * @param diagramId The value for diagramId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagramId")
    public final Builder diagramId(Optional<Long> diagramId) {
      this.diagramId = diagramId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SaveDiagramCommand#layoutData() layoutData} attribute.
     * @param layoutData The value for layoutData 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("layoutData")
    public final Builder layoutData(String layoutData) {
      this.layoutData = Objects.requireNonNull(layoutData, "layoutData");
      initBits &= ~INIT_BIT_LAYOUT_DATA;
      return this;
    }

    /**
     * Adds one element to {@link SaveDiagramCommand#entities() entities} list.
     * @param element A entities element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntities(FlowDiagramEntity element) {
      this.entities.add(Objects.requireNonNull(element, "entities element"));
      return this;
    }

    /**
     * Adds elements to {@link SaveDiagramCommand#entities() entities} list.
     * @param elements An array of entities elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntities(FlowDiagramEntity... elements) {
      for (FlowDiagramEntity element : elements) {
        this.entities.add(Objects.requireNonNull(element, "entities element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SaveDiagramCommand#entities() entities} list.
     * @param elements An iterable of entities elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entities")
    public final Builder entities(Iterable<? extends FlowDiagramEntity> elements) {
      this.entities.clear();
      return addAllEntities(elements);
    }

    /**
     * Adds elements to {@link SaveDiagramCommand#entities() entities} list.
     * @param elements An iterable of entities elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEntities(Iterable<? extends FlowDiagramEntity> elements) {
      for (FlowDiagramEntity element : elements) {
        this.entities.add(Objects.requireNonNull(element, "entities element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link SaveDiagramCommand#annotations() annotations} list.
     * @param element A annotations element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnnotations(FlowDiagramAnnotation element) {
      this.annotations.add(Objects.requireNonNull(element, "annotations element"));
      return this;
    }

    /**
     * Adds elements to {@link SaveDiagramCommand#annotations() annotations} list.
     * @param elements An array of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnnotations(FlowDiagramAnnotation... elements) {
      for (FlowDiagramAnnotation element : elements) {
        this.annotations.add(Objects.requireNonNull(element, "annotations element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SaveDiagramCommand#annotations() annotations} list.
     * @param elements An iterable of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("annotations")
    public final Builder annotations(Iterable<? extends FlowDiagramAnnotation> elements) {
      this.annotations.clear();
      return addAllAnnotations(elements);
    }

    /**
     * Adds elements to {@link SaveDiagramCommand#annotations() annotations} list.
     * @param elements An iterable of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAnnotations(Iterable<? extends FlowDiagramAnnotation> elements) {
      for (FlowDiagramAnnotation element : elements) {
        this.annotations.add(Objects.requireNonNull(element, "annotations element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link SaveDiagramCommand#name() name} attribute.
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
     * Initializes the value for the {@link SaveDiagramCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSaveDiagramCommand ImmutableSaveDiagramCommand}.
     * @return An immutable instance of SaveDiagramCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSaveDiagramCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSaveDiagramCommand(
          diagramId,
          layoutData,
          createUnmodifiableList(true, entities),
          createUnmodifiableList(true, annotations),
          name,
          description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_LAYOUT_DATA) != 0) attributes.add("layoutData");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SaveDiagramCommand, some of required attributes are not set " + attributes;
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
