package com.khartec.waltz.model.actor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.LastUpdate;
import com.khartec.waltz.model.command.EntityChangeCommand;
import com.khartec.waltz.model.command.FieldChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ActorChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActorChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ActorChangeCommand"})
public final class ImmutableActorChangeCommand extends ActorChangeCommand {
  private final FieldChange<String> name;
  private final FieldChange<String> description;
  private final FieldChange<Boolean> isExternal;
  private final long id;
  private final LastUpdate lastUpdate;

  private ImmutableActorChangeCommand(
      FieldChange<String> name,
      FieldChange<String> description,
      FieldChange<Boolean> isExternal,
      long id,
      LastUpdate lastUpdate) {
    this.name = name;
    this.description = description;
    this.isExternal = isExternal;
    this.id = id;
    this.lastUpdate = lastUpdate;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<FieldChange<String>> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<FieldChange<String>> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code isExternal} attribute
   */
  @JsonProperty("isExternal")
  @Override
  public Optional<FieldChange<Boolean>> isExternal() {
    return Optional.ofNullable(isExternal);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public long id() {
    return id;
  }

  /**
   * @return The value of the {@code lastUpdate} attribute
   */
  @JsonProperty("lastUpdate")
  @Override
  public Optional<LastUpdate> lastUpdate() {
    return Optional.ofNullable(lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActorChangeCommand#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withName(FieldChange<String> value) {
    FieldChange<String> newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableActorChangeCommand(newValue, this.description, this.isExternal, this.id, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActorChangeCommand#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withName(Optional<? extends FieldChange<String>> optional) {
    FieldChange<String> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableActorChangeCommand(value, this.description, this.isExternal, this.id, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActorChangeCommand#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withDescription(FieldChange<String> value) {
    FieldChange<String> newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableActorChangeCommand(this.name, newValue, this.isExternal, this.id, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActorChangeCommand#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withDescription(Optional<? extends FieldChange<String>> optional) {
    FieldChange<String> value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableActorChangeCommand(this.name, value, this.isExternal, this.id, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActorChangeCommand#isExternal() isExternal} attribute.
   * @param value The value for isExternal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withIsExternal(FieldChange<Boolean> value) {
    FieldChange<Boolean> newValue = Objects.requireNonNull(value, "isExternal");
    if (this.isExternal == newValue) return this;
    return new ImmutableActorChangeCommand(this.name, this.description, newValue, this.id, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActorChangeCommand#isExternal() isExternal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isExternal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withIsExternal(Optional<? extends FieldChange<Boolean>> optional) {
    FieldChange<Boolean> value = optional.orElse(null);
    if (this.isExternal == value) return this;
    return new ImmutableActorChangeCommand(this.name, this.description, value, this.id, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ActorChangeCommand#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActorChangeCommand withId(long value) {
    if (this.id == value) return this;
    return new ImmutableActorChangeCommand(this.name, this.description, this.isExternal, value, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActorChangeCommand#lastUpdate() lastUpdate} attribute.
   * @param value The value for lastUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withLastUpdate(LastUpdate value) {
    LastUpdate newValue = Objects.requireNonNull(value, "lastUpdate");
    if (this.lastUpdate == newValue) return this;
    return new ImmutableActorChangeCommand(this.name, this.description, this.isExternal, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActorChangeCommand#lastUpdate() lastUpdate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActorChangeCommand withLastUpdate(Optional<? extends LastUpdate> optional) {
    LastUpdate value = optional.orElse(null);
    if (this.lastUpdate == value) return this;
    return new ImmutableActorChangeCommand(this.name, this.description, this.isExternal, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActorChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActorChangeCommand
        && equalTo((ImmutableActorChangeCommand) another);
  }

  private boolean equalTo(ImmutableActorChangeCommand another) {
    return Objects.equals(name, another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(isExternal, another.isExternal)
        && id == another.id
        && Objects.equals(lastUpdate, another.lastUpdate);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code description}, {@code isExternal}, {@code id}, {@code lastUpdate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(isExternal);
    h += (h << 5) + Long.hashCode(id);
    h += (h << 5) + Objects.hashCode(lastUpdate);
    return h;
  }

  /**
   * Prints the immutable value {@code ActorChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ActorChangeCommand{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (isExternal != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("isExternal=").append(isExternal);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("id=").append(id);
    if (lastUpdate != null) {
      builder.append(", ");
      builder.append("lastUpdate=").append(lastUpdate);
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
  static final class Json extends ActorChangeCommand {
    Optional<FieldChange<String>> name = Optional.empty();
    Optional<FieldChange<String>> description = Optional.empty();
    Optional<FieldChange<Boolean>> isExternal = Optional.empty();
    long id;
    boolean idIsSet;
    Optional<LastUpdate> lastUpdate = Optional.empty();
    @JsonProperty("name")
    public void setName(Optional<FieldChange<String>> name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(Optional<FieldChange<String>> description) {
      this.description = description;
    }
    @JsonProperty("isExternal")
    public void setIsExternal(Optional<FieldChange<Boolean>> isExternal) {
      this.isExternal = isExternal;
    }
    @JsonProperty("id")
    public void setId(long id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("lastUpdate")
    public void setLastUpdate(Optional<LastUpdate> lastUpdate) {
      this.lastUpdate = lastUpdate;
    }
    @Override
    public Optional<FieldChange<String>> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<FieldChange<String>> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<FieldChange<Boolean>> isExternal() { throw new UnsupportedOperationException(); }
    @Override
    public long id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LastUpdate> lastUpdate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableActorChangeCommand fromJson(Json json) {
    ImmutableActorChangeCommand.Builder builder = ImmutableActorChangeCommand.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.isExternal != null) {
      builder.isExternal(json.isExternal);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.lastUpdate != null) {
      builder.lastUpdate(json.lastUpdate);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ActorChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ActorChangeCommand instance
   */
  public static ImmutableActorChangeCommand copyOf(ActorChangeCommand instance) {
    if (instance instanceof ImmutableActorChangeCommand) {
      return (ImmutableActorChangeCommand) instance;
    }
    return ImmutableActorChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableActorChangeCommand ImmutableActorChangeCommand}.
   * @return A new ImmutableActorChangeCommand builder
   */
  public static ImmutableActorChangeCommand.Builder builder() {
    return new ImmutableActorChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableActorChangeCommand ImmutableActorChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1L;

    private FieldChange<String> name;
    private FieldChange<String> description;
    private FieldChange<Boolean> isExternal;
    private long id;
    private LastUpdate lastUpdate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.actor.ActorChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ActorChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.command.EntityChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityChangeCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof ActorChangeCommand) {
        ActorChangeCommand instance = (ActorChangeCommand) object;
        Optional<FieldChange<Boolean>> isExternalOptional = instance.isExternal();
        if (isExternalOptional.isPresent()) {
          isExternal(isExternalOptional);
        }
        Optional<FieldChange<String>> nameOptional = instance.name();
        if (nameOptional.isPresent()) {
          name(nameOptional);
        }
        Optional<FieldChange<String>> descriptionOptional = instance.description();
        if (descriptionOptional.isPresent()) {
          description(descriptionOptional);
        }
      }
      if (object instanceof EntityChangeCommand) {
        EntityChangeCommand instance = (EntityChangeCommand) object;
        Optional<LastUpdate> lastUpdateOptional = instance.lastUpdate();
        if (lastUpdateOptional.isPresent()) {
          lastUpdate(lastUpdateOptional);
        }
        id(instance.id());
      }
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(FieldChange<String> name) {
      this.name = Objects.requireNonNull(name, "name");
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends FieldChange<String>> name) {
      this.name = name.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(FieldChange<String> description) {
      this.description = Objects.requireNonNull(description, "description");
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends FieldChange<String>> description) {
      this.description = description.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#isExternal() isExternal} to isExternal.
     * @param isExternal The value for isExternal
     * @return {@code this} builder for chained invocation
     */
    public final Builder isExternal(FieldChange<Boolean> isExternal) {
      this.isExternal = Objects.requireNonNull(isExternal, "isExternal");
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#isExternal() isExternal} to isExternal.
     * @param isExternal The value for isExternal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isExternal")
    public final Builder isExternal(Optional<? extends FieldChange<Boolean>> isExternal) {
      this.isExternal = isExternal.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link ActorChangeCommand#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(long id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#lastUpdate() lastUpdate} to lastUpdate.
     * @param lastUpdate The value for lastUpdate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastUpdate(LastUpdate lastUpdate) {
      this.lastUpdate = Objects.requireNonNull(lastUpdate, "lastUpdate");
      return this;
    }

    /**
     * Initializes the optional value {@link ActorChangeCommand#lastUpdate() lastUpdate} to lastUpdate.
     * @param lastUpdate The value for lastUpdate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdate")
    public final Builder lastUpdate(Optional<? extends LastUpdate> lastUpdate) {
      this.lastUpdate = lastUpdate.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableActorChangeCommand ImmutableActorChangeCommand}.
     * @return An immutable instance of ActorChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableActorChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableActorChangeCommand(name, description, isExternal, id, lastUpdate);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build ActorChangeCommand, some of required attributes are not set " + attributes;
    }
  }
}
