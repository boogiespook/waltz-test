package com.khartec.waltz.model.actor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ActorCreateCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActorCreateCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ActorCreateCommand"})
public final class ImmutableActorCreateCommand extends ActorCreateCommand {
  private final boolean isExternal;
  private final String name;
  private final @Nullable String description;

  private ImmutableActorCreateCommand(
      boolean isExternal,
      String name,
      @Nullable String description) {
    this.isExternal = isExternal;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code isExternal} attribute
   */
  @JsonProperty("isExternal")
  @Override
  public boolean isExternal() {
    return isExternal;
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
   * Copy the current immutable object by setting a value for the {@link ActorCreateCommand#isExternal() isExternal} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isExternal
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActorCreateCommand withIsExternal(boolean value) {
    if (this.isExternal == value) return this;
    return new ImmutableActorCreateCommand(value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ActorCreateCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActorCreateCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableActorCreateCommand(this.isExternal, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ActorCreateCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActorCreateCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableActorCreateCommand(this.isExternal, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActorCreateCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActorCreateCommand
        && equalTo((ImmutableActorCreateCommand) another);
  }

  private boolean equalTo(ImmutableActorCreateCommand another) {
    return isExternal == another.isExternal
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code isExternal}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Boolean.hashCode(isExternal);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ActorCreateCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ActorCreateCommand{"
        + "isExternal=" + isExternal
        + ", name=" + name
        + ", description=" + description
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ActorCreateCommand {
    boolean isExternal;
    boolean isExternalIsSet;
    String name;
    String description;
    @JsonProperty("isExternal")
    public void setIsExternal(boolean isExternal) {
      this.isExternal = isExternal;
      this.isExternalIsSet = true;
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
    public boolean isExternal() { throw new UnsupportedOperationException(); }
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
  static ImmutableActorCreateCommand fromJson(Json json) {
    ImmutableActorCreateCommand.Builder builder = ImmutableActorCreateCommand.builder();
    if (json.isExternalIsSet) {
      builder.isExternal(json.isExternal);
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
   * Creates an immutable copy of a {@link ActorCreateCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ActorCreateCommand instance
   */
  public static ImmutableActorCreateCommand copyOf(ActorCreateCommand instance) {
    if (instance instanceof ImmutableActorCreateCommand) {
      return (ImmutableActorCreateCommand) instance;
    }
    return ImmutableActorCreateCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableActorCreateCommand ImmutableActorCreateCommand}.
   * @return A new ImmutableActorCreateCommand builder
   */
  public static ImmutableActorCreateCommand.Builder builder() {
    return new ImmutableActorCreateCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableActorCreateCommand ImmutableActorCreateCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_IS_EXTERNAL = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private boolean isExternal;
    private String name;
    private String description;

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.actor.ActorCreateCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ActorCreateCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
      if (object instanceof ActorCreateCommand) {
        ActorCreateCommand instance = (ActorCreateCommand) object;
        isExternal(instance.isExternal());
      }
    }

    /**
     * Initializes the value for the {@link ActorCreateCommand#isExternal() isExternal} attribute.
     * @param isExternal The value for isExternal 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isExternal")
    public final Builder isExternal(boolean isExternal) {
      this.isExternal = isExternal;
      initBits &= ~INIT_BIT_IS_EXTERNAL;
      return this;
    }

    /**
     * Initializes the value for the {@link ActorCreateCommand#name() name} attribute.
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
     * Initializes the value for the {@link ActorCreateCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableActorCreateCommand ImmutableActorCreateCommand}.
     * @return An immutable instance of ActorCreateCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableActorCreateCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableActorCreateCommand(isExternal, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_IS_EXTERNAL) != 0) attributes.add("isExternal");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build ActorCreateCommand, some of required attributes are not set " + attributes;
    }
  }
}
