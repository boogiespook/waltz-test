package com.khartec.waltz.model.entity_named_note;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EntityNamedNoteTypeChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntityNamedNoteTypeChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EntityNamedNoteTypeChangeCommand"})
public final class ImmutableEntityNamedNoteTypeChangeCommand
    extends EntityNamedNoteTypeChangeCommand {
  private final Set<EntityKind> applicableEntityKinds;
  private final String name;
  private final String description;
  private final Boolean isReadOnly;

  private ImmutableEntityNamedNoteTypeChangeCommand(
      Set<EntityKind> applicableEntityKinds,
      String name,
      String description,
      Boolean isReadOnly) {
    this.applicableEntityKinds = applicableEntityKinds;
    this.name = name;
    this.description = description;
    this.isReadOnly = isReadOnly;
  }

  /**
   * @return The value of the {@code applicableEntityKinds} attribute
   */
  @JsonProperty("applicableEntityKinds")
  @Override
  public Optional<Set<EntityKind>> applicableEntityKinds() {
    return Optional.ofNullable(applicableEntityKinds);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code isReadOnly} attribute
   */
  @JsonProperty("isReadOnly")
  @Override
  public Optional<Boolean> isReadOnly() {
    return Optional.ofNullable(isReadOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityNamedNoteTypeChangeCommand#applicableEntityKinds() applicableEntityKinds} attribute.
   * @param value The value for applicableEntityKinds
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withApplicableEntityKinds(Set<EntityKind> value) {
    Set<EntityKind> newValue = Objects.requireNonNull(value, "applicableEntityKinds");
    if (this.applicableEntityKinds == newValue) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(newValue, this.name, this.description, this.isReadOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityNamedNoteTypeChangeCommand#applicableEntityKinds() applicableEntityKinds} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applicableEntityKinds
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withApplicableEntityKinds(Optional<? extends Set<EntityKind>> optional) {
    Set<EntityKind> value = optional.orElse(null);
    if (this.applicableEntityKinds == value) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(value, this.name, this.description, this.isReadOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityNamedNoteTypeChangeCommand#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(this.applicableEntityKinds, newValue, this.description, this.isReadOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityNamedNoteTypeChangeCommand#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withName(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(this.applicableEntityKinds, value, this.description, this.isReadOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityNamedNoteTypeChangeCommand#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(this.applicableEntityKinds, this.name, newValue, this.isReadOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityNamedNoteTypeChangeCommand#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withDescription(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(this.applicableEntityKinds, this.name, value, this.isReadOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EntityNamedNoteTypeChangeCommand#isReadOnly() isReadOnly} attribute.
   * @param value The value for isReadOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withIsReadOnly(boolean value) {
    Boolean newValue = value;
    if (Objects.equals(this.isReadOnly, newValue)) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(this.applicableEntityKinds, this.name, this.description, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EntityNamedNoteTypeChangeCommand#isReadOnly() isReadOnly} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isReadOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntityNamedNoteTypeChangeCommand withIsReadOnly(Optional<Boolean> optional) {
    Boolean value = optional.orElse(null);
    if (Objects.equals(this.isReadOnly, value)) return this;
    return new ImmutableEntityNamedNoteTypeChangeCommand(this.applicableEntityKinds, this.name, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntityNamedNoteTypeChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntityNamedNoteTypeChangeCommand
        && equalTo((ImmutableEntityNamedNoteTypeChangeCommand) another);
  }

  private boolean equalTo(ImmutableEntityNamedNoteTypeChangeCommand another) {
    return Objects.equals(applicableEntityKinds, another.applicableEntityKinds)
        && Objects.equals(name, another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(isReadOnly, another.isReadOnly);
  }

  /**
   * Computes a hash code from attributes: {@code applicableEntityKinds}, {@code name}, {@code description}, {@code isReadOnly}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(applicableEntityKinds);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(isReadOnly);
    return h;
  }

  /**
   * Prints the immutable value {@code EntityNamedNoteTypeChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EntityNamedNoteTypeChangeCommand{");
    if (applicableEntityKinds != null) {
      builder.append("applicableEntityKinds=").append(applicableEntityKinds);
    }
    if (name != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (isReadOnly != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("isReadOnly=").append(isReadOnly);
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
  static final class Json extends EntityNamedNoteTypeChangeCommand {
    Optional<Set<EntityKind>> applicableEntityKinds = Optional.empty();
    Optional<String> name = Optional.empty();
    Optional<String> description = Optional.empty();
    Optional<Boolean> isReadOnly = Optional.empty();
    @JsonProperty("applicableEntityKinds")
    public void setApplicableEntityKinds(Optional<Set<EntityKind>> applicableEntityKinds) {
      this.applicableEntityKinds = applicableEntityKinds;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
    }
    @JsonProperty("isReadOnly")
    public void setIsReadOnly(Optional<Boolean> isReadOnly) {
      this.isReadOnly = isReadOnly;
    }
    @Override
    public Optional<Set<EntityKind>> applicableEntityKinds() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isReadOnly() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntityNamedNoteTypeChangeCommand fromJson(Json json) {
    ImmutableEntityNamedNoteTypeChangeCommand.Builder builder = ImmutableEntityNamedNoteTypeChangeCommand.builder();
    if (json.applicableEntityKinds != null) {
      builder.applicableEntityKinds(json.applicableEntityKinds);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.isReadOnly != null) {
      builder.isReadOnly(json.isReadOnly);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EntityNamedNoteTypeChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EntityNamedNoteTypeChangeCommand instance
   */
  public static ImmutableEntityNamedNoteTypeChangeCommand copyOf(EntityNamedNoteTypeChangeCommand instance) {
    if (instance instanceof ImmutableEntityNamedNoteTypeChangeCommand) {
      return (ImmutableEntityNamedNoteTypeChangeCommand) instance;
    }
    return ImmutableEntityNamedNoteTypeChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntityNamedNoteTypeChangeCommand ImmutableEntityNamedNoteTypeChangeCommand}.
   * @return A new ImmutableEntityNamedNoteTypeChangeCommand builder
   */
  public static ImmutableEntityNamedNoteTypeChangeCommand.Builder builder() {
    return new ImmutableEntityNamedNoteTypeChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntityNamedNoteTypeChangeCommand ImmutableEntityNamedNoteTypeChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private Set<EntityKind> applicableEntityKinds;
    private String name;
    private String description;
    private Boolean isReadOnly;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EntityNamedNoteTypeChangeCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityNamedNoteTypeChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Set<EntityKind>> applicableEntityKindsOptional = instance.applicableEntityKinds();
      if (applicableEntityKindsOptional.isPresent()) {
        applicableEntityKinds(applicableEntityKindsOptional);
      }
      Optional<String> nameOptional = instance.name();
      if (nameOptional.isPresent()) {
        name(nameOptional);
      }
      Optional<String> descriptionOptional = instance.description();
      if (descriptionOptional.isPresent()) {
        description(descriptionOptional);
      }
      Optional<Boolean> isReadOnlyOptional = instance.isReadOnly();
      if (isReadOnlyOptional.isPresent()) {
        isReadOnly(isReadOnlyOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#applicableEntityKinds() applicableEntityKinds} to applicableEntityKinds.
     * @param applicableEntityKinds The value for applicableEntityKinds
     * @return {@code this} builder for chained invocation
     */
    public final Builder applicableEntityKinds(Set<EntityKind> applicableEntityKinds) {
      this.applicableEntityKinds = Objects.requireNonNull(applicableEntityKinds, "applicableEntityKinds");
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#applicableEntityKinds() applicableEntityKinds} to applicableEntityKinds.
     * @param applicableEntityKinds The value for applicableEntityKinds
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicableEntityKinds")
    public final Builder applicableEntityKinds(Optional<? extends Set<EntityKind>> applicableEntityKinds) {
      this.applicableEntityKinds = applicableEntityKinds.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      this.name = name.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      this.description = description.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#isReadOnly() isReadOnly} to isReadOnly.
     * @param isReadOnly The value for isReadOnly
     * @return {@code this} builder for chained invocation
     */
    public final Builder isReadOnly(boolean isReadOnly) {
      this.isReadOnly = isReadOnly;
      return this;
    }

    /**
     * Initializes the optional value {@link EntityNamedNoteTypeChangeCommand#isReadOnly() isReadOnly} to isReadOnly.
     * @param isReadOnly The value for isReadOnly
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isReadOnly")
    public final Builder isReadOnly(Optional<Boolean> isReadOnly) {
      this.isReadOnly = isReadOnly.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntityNamedNoteTypeChangeCommand ImmutableEntityNamedNoteTypeChangeCommand}.
     * @return An immutable instance of EntityNamedNoteTypeChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntityNamedNoteTypeChangeCommand build() {
      return new ImmutableEntityNamedNoteTypeChangeCommand(applicableEntityKinds, name, description, isReadOnly);
    }
  }
}
