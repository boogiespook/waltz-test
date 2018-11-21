package com.khartec.waltz.model.measurable_rating;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.LastUpdate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RemoveMeasurableRatingCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRemoveMeasurableRatingCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RemoveMeasurableRatingCommand"})
public final class ImmutableRemoveMeasurableRatingCommand
    extends RemoveMeasurableRatingCommand {
  private final EntityReference entityReference;
  private final long measurableId;
  private final LastUpdate lastUpdate;

  private ImmutableRemoveMeasurableRatingCommand(
      EntityReference entityReference,
      long measurableId,
      LastUpdate lastUpdate) {
    this.entityReference = entityReference;
    this.measurableId = measurableId;
    this.lastUpdate = lastUpdate;
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
   * @return The value of the {@code measurableId} attribute
   */
  @JsonProperty("measurableId")
  @Override
  public long measurableId() {
    return measurableId;
  }

  /**
   * @return The value of the {@code lastUpdate} attribute
   */
  @JsonProperty("lastUpdate")
  @Override
  public LastUpdate lastUpdate() {
    return lastUpdate;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveMeasurableRatingCommand#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveMeasurableRatingCommand withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableRemoveMeasurableRatingCommand(newValue, this.measurableId, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveMeasurableRatingCommand#measurableId() measurableId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measurableId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveMeasurableRatingCommand withMeasurableId(long value) {
    if (this.measurableId == value) return this;
    return new ImmutableRemoveMeasurableRatingCommand(this.entityReference, value, this.lastUpdate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RemoveMeasurableRatingCommand#lastUpdate() lastUpdate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveMeasurableRatingCommand withLastUpdate(LastUpdate value) {
    if (this.lastUpdate == value) return this;
    LastUpdate newValue = Objects.requireNonNull(value, "lastUpdate");
    return new ImmutableRemoveMeasurableRatingCommand(this.entityReference, this.measurableId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRemoveMeasurableRatingCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRemoveMeasurableRatingCommand
        && equalTo((ImmutableRemoveMeasurableRatingCommand) another);
  }

  private boolean equalTo(ImmutableRemoveMeasurableRatingCommand another) {
    return entityReference.equals(another.entityReference)
        && measurableId == another.measurableId
        && lastUpdate.equals(another.lastUpdate);
  }

  /**
   * Computes a hash code from attributes: {@code entityReference}, {@code measurableId}, {@code lastUpdate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + Long.hashCode(measurableId);
    h += (h << 5) + lastUpdate.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RemoveMeasurableRatingCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RemoveMeasurableRatingCommand{"
        + "entityReference=" + entityReference
        + ", measurableId=" + measurableId
        + ", lastUpdate=" + lastUpdate
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RemoveMeasurableRatingCommand {
    EntityReference entityReference;
    long measurableId;
    boolean measurableIdIsSet;
    LastUpdate lastUpdate;
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("measurableId")
    public void setMeasurableId(long measurableId) {
      this.measurableId = measurableId;
      this.measurableIdIsSet = true;
    }
    @JsonProperty("lastUpdate")
    public void setLastUpdate(LastUpdate lastUpdate) {
      this.lastUpdate = lastUpdate;
    }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public long measurableId() { throw new UnsupportedOperationException(); }
    @Override
    public LastUpdate lastUpdate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRemoveMeasurableRatingCommand fromJson(Json json) {
    ImmutableRemoveMeasurableRatingCommand.Builder builder = ImmutableRemoveMeasurableRatingCommand.builder();
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.measurableIdIsSet) {
      builder.measurableId(json.measurableId);
    }
    if (json.lastUpdate != null) {
      builder.lastUpdate(json.lastUpdate);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RemoveMeasurableRatingCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RemoveMeasurableRatingCommand instance
   */
  public static ImmutableRemoveMeasurableRatingCommand copyOf(RemoveMeasurableRatingCommand instance) {
    if (instance instanceof ImmutableRemoveMeasurableRatingCommand) {
      return (ImmutableRemoveMeasurableRatingCommand) instance;
    }
    return ImmutableRemoveMeasurableRatingCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRemoveMeasurableRatingCommand ImmutableRemoveMeasurableRatingCommand}.
   * @return A new ImmutableRemoveMeasurableRatingCommand builder
   */
  public static ImmutableRemoveMeasurableRatingCommand.Builder builder() {
    return new ImmutableRemoveMeasurableRatingCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRemoveMeasurableRatingCommand ImmutableRemoveMeasurableRatingCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x1L;
    private static final long INIT_BIT_MEASURABLE_ID = 0x2L;
    private static final long INIT_BIT_LAST_UPDATE = 0x4L;
    private long initBits = 0x7L;

    private EntityReference entityReference;
    private long measurableId;
    private LastUpdate lastUpdate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_rating.MeasurableRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MeasurableRatingCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.measurable_rating.RemoveMeasurableRatingCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RemoveMeasurableRatingCommand instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof MeasurableRatingCommand) {
        MeasurableRatingCommand instance = (MeasurableRatingCommand) object;
        measurableId(instance.measurableId());
        entityReference(instance.entityReference());
        lastUpdate(instance.lastUpdate());
      }
    }

    /**
     * Initializes the value for the {@link RemoveMeasurableRatingCommand#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link RemoveMeasurableRatingCommand#measurableId() measurableId} attribute.
     * @param measurableId The value for measurableId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurableId")
    public final Builder measurableId(long measurableId) {
      this.measurableId = measurableId;
      initBits &= ~INIT_BIT_MEASURABLE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link RemoveMeasurableRatingCommand#lastUpdate() lastUpdate} attribute.
     * @param lastUpdate The value for lastUpdate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdate")
    public final Builder lastUpdate(LastUpdate lastUpdate) {
      this.lastUpdate = Objects.requireNonNull(lastUpdate, "lastUpdate");
      initBits &= ~INIT_BIT_LAST_UPDATE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRemoveMeasurableRatingCommand ImmutableRemoveMeasurableRatingCommand}.
     * @return An immutable instance of RemoveMeasurableRatingCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRemoveMeasurableRatingCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRemoveMeasurableRatingCommand(entityReference, measurableId, lastUpdate);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_MEASURABLE_ID) != 0) attributes.add("measurableId");
      if ((initBits & INIT_BIT_LAST_UPDATE) != 0) attributes.add("lastUpdate");
      return "Cannot build RemoveMeasurableRatingCommand, some of required attributes are not set " + attributes;
    }
  }
}
