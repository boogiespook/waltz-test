package com.khartec.waltz.model.entity_named_note;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityNamedNodeType}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityNamedNodeType.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityNamedNodeType"})
public final class ImmutableEntityNamedNodeType
    extends EntityNamedNodeType {
  private final Set<EntityKind> applicableEntityKinds;
  private final boolean isReadOnly;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableEntityNamedNodeType(
      Set<EntityKind> applicableEntityKinds,
      boolean isReadOnly,
      Long id,
      String name,
      @Nullable String description) {
    this.applicableEntityKinds = applicableEntityKinds;
    this.isReadOnly = isReadOnly;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code applicableEntityKinds} attribute
   */
  @JsonProperty("applicableEntityKinds")
  @Override
  public Set<EntityKind> applicableEntityKinds() {
    return applicableEntityKinds;
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
   * Copy the current immutable object with elements that replace the content of {@link EntityNamedNodeType#applicableEntityKinds() applicableEntityKinds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNodeType withApplicableEntityKinds(EntityKind... elements) {
    Set<EntityKind> newValue = createUnmodifiableEnumSet(Arrays.asList(elements));
    return new ImmutableEntityNamedNodeType(newValue, this.isReadOnly, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EntityNamedNodeType#applicableEntityKinds() applicableEntityKinds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of applicableEntityKinds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNodeType withApplicableEntityKinds(Iterable<EntityKind> elements) {
    if (this.applicableEntityKinds == elements) return this;
    Set<EntityKind> newValue = createUnmodifiableEnumSet(elements);
    return new ImmutableEntityNamedNodeType(newValue, this.isReadOnly, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNodeType#isReadOnly() isReadOnly} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isReadOnly
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNodeType withIsReadOnly(boolean value) {
    if (this.isReadOnly == value) return this;
    return new ImmutableEntityNamedNodeType(this.applicableEntityKinds, value, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityNamedNodeType#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNodeType withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEntityNamedNodeType(this.applicableEntityKinds, this.isReadOnly, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityNamedNodeType#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNodeType withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEntityNamedNodeType(this.applicableEntityKinds, this.isReadOnly, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNodeType#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNodeType withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableEntityNamedNodeType(this.applicableEntityKinds, this.isReadOnly, this.id, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EntityNamedNodeType#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEntityNamedNodeType withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityNamedNodeType(this.applicableEntityKinds, this.isReadOnly, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityNamedNodeType} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityNamedNodeType
        && equalTo((ImmutableEntityNamedNodeType) another);
  }

  private boolean equalTo(ImmutableEntityNamedNodeType another) {
    return applicableEntityKinds.equals(another.applicableEntityKinds)
        && isReadOnly == another.isReadOnly
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code applicableEntityKinds}, {@code isReadOnly}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + applicableEntityKinds.hashCode();
    h += (h << 5) + Boolean.hashCode(isReadOnly);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code EntityNamedNodeType} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityNamedNodeType{");
    builder.append("applicableEntityKinds=").append(applicableEntityKinds);
    builder.append(", ");
    builder.append("isReadOnly=").append(isReadOnly);
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
  static final class Json extends EntityNamedNodeType {
    Set<EntityKind> applicableEntityKinds = Collections.emptySet();
    boolean isReadOnly;
    boolean isReadOnlyIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("applicableEntityKinds")
    public void setApplicableEntityKinds(Set<EntityKind> applicableEntityKinds) {
      this.applicableEntityKinds = applicableEntityKinds;
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
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public Set<EntityKind> applicableEntityKinds() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isReadOnly() { throw new UnsupportedOperationException(); }
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
  static ImmutableEntityNamedNodeType fromJson(Json json) {
    ImmutableEntityNamedNodeType.Builder builder = ImmutableEntityNamedNodeType.builder();
    if (json.applicableEntityKinds != null) {
      builder.addAllApplicableEntityKinds(json.applicableEntityKinds);
    }
    if (json.isReadOnlyIsSet) {
      builder.isReadOnly(json.isReadOnly);
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
   * Creates an immutable copy of a {@link EntityNamedNodeType} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityNamedNodeType instance
   */
  public static ImmutableEntityNamedNodeType copyOf(EntityNamedNodeType instance) {
    if (instance instanceof ImmutableEntityNamedNodeType) {
      return (ImmutableEntityNamedNodeType) instance;
    }
    return ImmutableEntityNamedNodeType.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityNamedNodeType ImmutableEntityNamedNodeType}.
   * @return A new ImmutableEntityNamedNodeType builder
   */
  public static ImmutableEntityNamedNodeType.Builder builder() {
    return new ImmutableEntityNamedNodeType.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityNamedNodeType ImmutableEntityNamedNodeType}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_IS_READ_ONLY = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private EnumSet<EntityKind> applicableEntityKinds = EnumSet.noneOf(EntityKind.class);
    private boolean isReadOnly;
    private Long id;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.entity_named_note.EntityNamedNodeType} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityNamedNodeType instance) {
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

    private void from(Object object) {
      if (object instanceof EntityNamedNodeType) {
        EntityNamedNodeType instance = (EntityNamedNodeType) object;
        addAllApplicableEntityKinds(instance.applicableEntityKinds());
        isReadOnly(instance.isReadOnly());
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
    }

    /**
     * Adds one element to {@link EntityNamedNodeType#applicableEntityKinds() applicableEntityKinds} set.
     * @param element A applicableEntityKinds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addApplicableEntityKinds(EntityKind element) {
      this.applicableEntityKinds.add(Objects.requireNonNull(element, "applicableEntityKinds element"));
      return this;
    }

    /**
     * Adds elements to {@link EntityNamedNodeType#applicableEntityKinds() applicableEntityKinds} set.
     * @param elements An array of applicableEntityKinds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addApplicableEntityKinds(EntityKind... elements) {
      for (EntityKind element : elements) {
        this.applicableEntityKinds.add(Objects.requireNonNull(element, "applicableEntityKinds element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link EntityNamedNodeType#applicableEntityKinds() applicableEntityKinds} set.
     * @param elements An iterable of applicableEntityKinds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicableEntityKinds")
    public final Builder applicableEntityKinds(Iterable<EntityKind> elements) {
      this.applicableEntityKinds.clear();
      return addAllApplicableEntityKinds(elements);
    }

    /**
     * Adds elements to {@link EntityNamedNodeType#applicableEntityKinds() applicableEntityKinds} set.
     * @param elements An iterable of applicableEntityKinds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllApplicableEntityKinds(Iterable<EntityKind> elements) {
      for (EntityKind element : elements) {
        this.applicableEntityKinds.add(Objects.requireNonNull(element, "applicableEntityKinds element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link EntityNamedNodeType#isReadOnly() isReadOnly} attribute.
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
     * Initializes the optional value {@link EntityNamedNodeType#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNodeType#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link EntityNamedNodeType#name() name} attribute.
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
     * Initializes the value for the {@link EntityNamedNodeType#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityNamedNodeType ImmutableEntityNamedNodeType}.
     * @return An immutable instance of EntityNamedNodeType
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityNamedNodeType build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEntityNamedNodeType(createUnmodifiableEnumSet(applicableEntityKinds), isReadOnly, id, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_IS_READ_ONLY) != 0) attributes.add("isReadOnly");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build EntityNamedNodeType, some of required attributes are not set " + attributes;
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

  private static <T extends Enum<T>> Set<T> createUnmodifiableEnumSet(Iterable<T> iterable) {
    if (iterable instanceof EnumSet<?>) {
      return Collections.unmodifiableSet(EnumSet.copyOf((EnumSet<T>) iterable));
    }
    List<T> list = createSafeList(iterable, true, false);
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default: return Collections.unmodifiableSet(EnumSet.copyOf(list));
    }
  }
}
