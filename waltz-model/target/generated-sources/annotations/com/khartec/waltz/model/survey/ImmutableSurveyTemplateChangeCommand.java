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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyTemplateChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyTemplateChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyTemplateChangeCommand"})
public final class ImmutableSurveyTemplateChangeCommand
    extends SurveyTemplateChangeCommand {
  private final EntityKind targetEntityKind;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableSurveyTemplateChangeCommand(
      EntityKind targetEntityKind,
      Long id,
      String name,
      @Nullable String description) {
    this.targetEntityKind = targetEntityKind;
    this.id = id;
    this.name = name;
    this.description = description;
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
   * Copy the current immutable object by setting a value for the {@link SurveyTemplateChangeCommand#targetEntityKind() targetEntityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for targetEntityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplateChangeCommand withTargetEntityKind(EntityKind value) {
    if (this.targetEntityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "targetEntityKind");
    return new ImmutableSurveyTemplateChangeCommand(newValue, this.id, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyTemplateChangeCommand#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyTemplateChangeCommand withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyTemplateChangeCommand(this.targetEntityKind, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyTemplateChangeCommand#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyTemplateChangeCommand withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyTemplateChangeCommand(this.targetEntityKind, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplateChangeCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplateChangeCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSurveyTemplateChangeCommand(this.targetEntityKind, this.id, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyTemplateChangeCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyTemplateChangeCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSurveyTemplateChangeCommand(this.targetEntityKind, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyTemplateChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyTemplateChangeCommand
        && equalTo((ImmutableSurveyTemplateChangeCommand) another);
  }

  private boolean equalTo(ImmutableSurveyTemplateChangeCommand another) {
    return targetEntityKind.equals(another.targetEntityKind)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code targetEntityKind}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + targetEntityKind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyTemplateChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyTemplateChangeCommand{");
    builder.append("targetEntityKind=").append(targetEntityKind);
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
  static final class Json extends SurveyTemplateChangeCommand {
    EntityKind targetEntityKind;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("targetEntityKind")
    public void setTargetEntityKind(EntityKind targetEntityKind) {
      this.targetEntityKind = targetEntityKind;
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
  static ImmutableSurveyTemplateChangeCommand fromJson(Json json) {
    ImmutableSurveyTemplateChangeCommand.Builder builder = ImmutableSurveyTemplateChangeCommand.builder();
    if (json.targetEntityKind != null) {
      builder.targetEntityKind(json.targetEntityKind);
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
   * Creates an immutable copy of a {@link SurveyTemplateChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyTemplateChangeCommand instance
   */
  public static ImmutableSurveyTemplateChangeCommand copyOf(SurveyTemplateChangeCommand instance) {
    if (instance instanceof ImmutableSurveyTemplateChangeCommand) {
      return (ImmutableSurveyTemplateChangeCommand) instance;
    }
    return ImmutableSurveyTemplateChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyTemplateChangeCommand ImmutableSurveyTemplateChangeCommand}.
   * @return A new ImmutableSurveyTemplateChangeCommand builder
   */
  public static ImmutableSurveyTemplateChangeCommand.Builder builder() {
    return new ImmutableSurveyTemplateChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyTemplateChangeCommand ImmutableSurveyTemplateChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TARGET_ENTITY_KIND = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private EntityKind targetEntityKind;
    private Long id;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyTemplateChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyTemplateChangeCommand instance) {
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
      if (object instanceof SurveyTemplateChangeCommand) {
        SurveyTemplateChangeCommand instance = (SurveyTemplateChangeCommand) object;
        targetEntityKind(instance.targetEntityKind());
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
     * Initializes the value for the {@link SurveyTemplateChangeCommand#targetEntityKind() targetEntityKind} attribute.
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
     * Initializes the optional value {@link SurveyTemplateChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyTemplateChangeCommand#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyTemplateChangeCommand#name() name} attribute.
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
     * Initializes the value for the {@link SurveyTemplateChangeCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyTemplateChangeCommand ImmutableSurveyTemplateChangeCommand}.
     * @return An immutable instance of SurveyTemplateChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyTemplateChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyTemplateChangeCommand(targetEntityKind, id, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TARGET_ENTITY_KIND) != 0) attributes.add("targetEntityKind");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SurveyTemplateChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
