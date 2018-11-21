package com.khartec.waltz.model.involvement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Involvement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInvolvement.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Involvement"})
public final class ImmutableInvolvement extends Involvement {
  private final long kindId;
  private final EntityReference entityReference;
  private final String employeeId;
  private final String provenance;

  private ImmutableInvolvement(ImmutableInvolvement.Builder builder) {
    this.kindId = builder.kindId;
    this.entityReference = builder.entityReference;
    this.employeeId = builder.employeeId;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableInvolvement(
      long kindId,
      EntityReference entityReference,
      String employeeId,
      String provenance) {
    this.kindId = kindId;
    this.entityReference = entityReference;
    this.employeeId = employeeId;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code kindId} attribute
   */
  @JsonProperty("kindId")
  @Override
  public long kindId() {
    return kindId;
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
   * @return The value of the {@code employeeId} attribute
   */
  @JsonProperty("employeeId")
  @Override
  public String employeeId() {
    return employeeId;
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
   * Copy the current immutable object by setting a value for the {@link Involvement#kindId() kindId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kindId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInvolvement withKindId(long value) {
    if (this.kindId == value) return this;
    return new ImmutableInvolvement(value, this.entityReference, this.employeeId, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Involvement#entityReference() entityReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInvolvement withEntityReference(EntityReference value) {
    if (this.entityReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "entityReference");
    return new ImmutableInvolvement(this.kindId, newValue, this.employeeId, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Involvement#employeeId() employeeId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for employeeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInvolvement withEmployeeId(String value) {
    if (this.employeeId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "employeeId");
    return new ImmutableInvolvement(this.kindId, this.entityReference, newValue, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Involvement#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInvolvement withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableInvolvement(this.kindId, this.entityReference, this.employeeId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInvolvement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInvolvement
        && equalTo((ImmutableInvolvement) another);
  }

  private boolean equalTo(ImmutableInvolvement another) {
    return kindId == another.kindId
        && entityReference.equals(another.entityReference)
        && employeeId.equals(another.employeeId)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code kindId}, {@code entityReference}, {@code employeeId}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(kindId);
    h += (h << 5) + entityReference.hashCode();
    h += (h << 5) + employeeId.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Involvement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Involvement{"
        + "kindId=" + kindId
        + ", entityReference=" + entityReference
        + ", employeeId=" + employeeId
        + ", provenance=" + provenance
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Involvement {
    long kindId;
    boolean kindIdIsSet;
    EntityReference entityReference;
    String employeeId;
    String provenance;
    @JsonProperty("kindId")
    public void setKindId(long kindId) {
      this.kindId = kindId;
      this.kindIdIsSet = true;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(EntityReference entityReference) {
      this.entityReference = entityReference;
    }
    @JsonProperty("employeeId")
    public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long kindId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public String employeeId() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInvolvement fromJson(Json json) {
    ImmutableInvolvement.Builder builder = ImmutableInvolvement.builder();
    if (json.kindIdIsSet) {
      builder.kindId(json.kindId);
    }
    if (json.entityReference != null) {
      builder.entityReference(json.entityReference);
    }
    if (json.employeeId != null) {
      builder.employeeId(json.employeeId);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Involvement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Involvement instance
   */
  public static ImmutableInvolvement copyOf(Involvement instance) {
    if (instance instanceof ImmutableInvolvement) {
      return (ImmutableInvolvement) instance;
    }
    return ImmutableInvolvement.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInvolvement ImmutableInvolvement}.
   * @return A new ImmutableInvolvement builder
   */
  public static ImmutableInvolvement.Builder builder() {
    return new ImmutableInvolvement.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInvolvement ImmutableInvolvement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KIND_ID = 0x1L;
    private static final long INIT_BIT_ENTITY_REFERENCE = 0x2L;
    private static final long INIT_BIT_EMPLOYEE_ID = 0x4L;
    private long initBits = 0x7L;

    private long kindId;
    private EntityReference entityReference;
    private String employeeId;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.involvement.Involvement} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Involvement instance) {
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
      long bits = 0;
      if (object instanceof Involvement) {
        Involvement instance = (Involvement) object;
        employeeId(instance.employeeId());
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
        entityReference(instance.entityReference());
        kindId(instance.kindId());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link Involvement#kindId() kindId} attribute.
     * @param kindId The value for kindId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kindId")
    public final Builder kindId(long kindId) {
      this.kindId = kindId;
      initBits &= ~INIT_BIT_KIND_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Involvement#entityReference() entityReference} attribute.
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
     * Initializes the value for the {@link Involvement#employeeId() employeeId} attribute.
     * @param employeeId The value for employeeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("employeeId")
    public final Builder employeeId(String employeeId) {
      this.employeeId = Objects.requireNonNull(employeeId, "employeeId");
      initBits &= ~INIT_BIT_EMPLOYEE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Involvement#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Involvement#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableInvolvement ImmutableInvolvement}.
     * @return An immutable instance of Involvement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInvolvement build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInvolvement(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KIND_ID) != 0) attributes.add("kindId");
      if ((initBits & INIT_BIT_ENTITY_REFERENCE) != 0) attributes.add("entityReference");
      if ((initBits & INIT_BIT_EMPLOYEE_ID) != 0) attributes.add("employeeId");
      return "Cannot build Involvement, some of required attributes are not set " + attributes;
    }
  }
}
