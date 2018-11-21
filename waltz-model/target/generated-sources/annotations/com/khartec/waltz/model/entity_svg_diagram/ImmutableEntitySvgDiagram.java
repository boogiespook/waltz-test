package com.khartec.waltz.model.entity_svg_diagram;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntitySvgDiagram}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntitySvgDiagram.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntitySvgDiagram"})
public final class ImmutableEntitySvgDiagram
    extends EntitySvgDiagram {
  private final String svg;
  private final EntityReference entityReference;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final String provenance;
  private final String externalId;

  private ImmutableEntitySvgDiagram(ImmutableEntitySvgDiagram.Builder builder) {
    this.svg = builder.svg;
    this.entityReference = builder.entityReference;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.externalId = builder.externalId;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableEntitySvgDiagram(
      String svg,
      EntityReference entityReference,
      Long id,
      String name,
      @Nullable String description,
      String provenance,
      String externalId) {
    this.svg = svg;
    this.entityReference = entityReference;
    this.id = id;
    this.name = name;
    this.description = description;
    this.provenance = provenance;
    this.externalId = externalId;
  }

  /**
   * @return The value of the {@code svg} attribute
   */
  @JsonProperty("svg")
  @Override
  public String svg() {
    return svg;
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
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    return provenance;
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
   * Copy the current immutable object by setting a value for the {@link EntitySvgDiagram#svg() svg} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for svg
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySvgDiagram withSvg(String value) {
    if (this.svg.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "svg");
    return new ImmutableEntitySvgDiagram(
        newValue,
        this.entityReference,
        this.id,
        this.name,
        this.description,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntitySvgDiagram#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySvgDiagram withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableEntitySvgDiagram(this.svg, newValue, this.id, this.name, this.description, this.provenance, this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntitySvgDiagram#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySvgDiagram withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEntitySvgDiagram(
        this.svg,
        this.entityReference,
        newValue,
        this.name,
        this.description,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntitySvgDiagram#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySvgDiagram withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEntitySvgDiagram(
        this.svg,
        this.entityReference,
        value,
        this.name,
        this.description,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntitySvgDiagram#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySvgDiagram withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableEntitySvgDiagram(
        this.svg,
        this.entityReference,
        this.id,
        newValue,
        this.description,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntitySvgDiagram#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySvgDiagram withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntitySvgDiagram(this.svg, this.entityReference, this.id, this.name, value, this.provenance, this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntitySvgDiagram#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntitySvgDiagram withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableEntitySvgDiagram(this.svg, this.entityReference, this.id, this.name, this.description, newValue, this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntitySvgDiagram#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySvgDiagram withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableEntitySvgDiagram(this.svg, this.entityReference, this.id, this.name, this.description, this.provenance, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntitySvgDiagram#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntitySvgDiagram withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableEntitySvgDiagram(this.svg, this.entityReference, this.id, this.name, this.description, this.provenance, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntitySvgDiagram} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntitySvgDiagram
        && equalTo((ImmutableEntitySvgDiagram) another);
  }

  private boolean equalTo(ImmutableEntitySvgDiagram another) {
    return svg.equals(another.svg)
        && entityReference.equals(another.entityReference)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && provenance.equals(another.provenance)
        && Objects.equals(externalId, another.externalId);
  }

  /**
   * Computes a hash code from attributes: {@code svg}, {@code entityReference}, {@code id}, {@code name}, {@code description}, {@code provenance}, {@code externalId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + svg.hashCode();
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    return h;
  }

  /**
   * Prints the immutable value {@code EntitySvgDiagram} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntitySvgDiagram{");
    builder.append("svg=").append(svg);
    builder.append(", ");
    builder.append("entityReference=").append(entityReference);
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
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
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
  static final class Json extends EntitySvgDiagram {
    String svg;
    EntityReference entityReference;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    String provenance;
    Optional<String> externalId = Optional.empty();
    @JsonProperty("svg")
    public void setSvg(String svg) {
      this.svg = svg;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
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
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @Override
    public String svg() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntitySvgDiagram fromJson(Json json) {
    ImmutableEntitySvgDiagram.Builder builder = ImmutableEntitySvgDiagram.builder();
    if (json.svg != null) {
      builder.svg(json.svg);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
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
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntitySvgDiagram} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntitySvgDiagram instance
   */
  public static ImmutableEntitySvgDiagram copyOf(EntitySvgDiagram instance) {
    if (instance instanceof ImmutableEntitySvgDiagram) {
      return (ImmutableEntitySvgDiagram) instance;
    }
    return ImmutableEntitySvgDiagram.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntitySvgDiagram ImmutableEntitySvgDiagram}.
   * @return A new ImmutableEntitySvgDiagram builder
   */
  public static ImmutableEntitySvgDiagram.Builder builder() {
    return new ImmutableEntitySvgDiagram.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntitySvgDiagram ImmutableEntitySvgDiagram}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SVG = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private String svg;
    private EntityReference entityReference;
    private Long id;
    private String name;
    private String description;
    private String provenance;
    private String externalId;

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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_svg_diagram.EntitySvgDiagram} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntitySvgDiagram instance) {
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
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof EntitySvgDiagram) {
        EntitySvgDiagram instance = (EntitySvgDiagram) object;
        svg(instance.svg());
        entityReference(instance.entityReference());
      }
    }

    /**
     * Initializes the value for the {@link EntitySvgDiagram#svg() svg} attribute.
     * @param svg The value for svg 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("svg")
    public final Builder svg(String svg) {
      this.svg = Objects.requireNonNull(svg, "svg");
      initBits &= ~INIT_BIT_SVG;
      return this;
    }

    /**
     * Initializes the value for the {@link EntitySvgDiagram#entityReference() entityReference} attribute.
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
     * Initializes the optional value {@link EntitySvgDiagram#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EntitySvgDiagram#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntitySvgDiagram#name() name} attribute.
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
     * Initializes the value for the {@link EntitySvgDiagram#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link EntitySvgDiagram#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EntitySvgDiagram#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the optional value {@link EntitySvgDiagram#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link EntitySvgDiagram#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntitySvgDiagram ImmutableEntitySvgDiagram}.
     * @return An immutable instance of EntitySvgDiagram
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntitySvgDiagram build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntitySvgDiagram(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SVG) != 0) attributes.add("svg");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build EntitySvgDiagram, some of required attributes are not set " + attributes;
    }
  }
}
