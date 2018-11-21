package com.khartec.waltz.model.software_catalog;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SoftwareUsage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSoftwareUsage.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SoftwareUsage"})
public final class ImmutableSoftwareUsage extends SoftwareUsage {
  private final long applicationId;
  private final long softwarePackageId;
  private final String provenance;

  private ImmutableSoftwareUsage(ImmutableSoftwareUsage.Builder builder) {
    this.applicationId = builder.applicationId;
    this.softwarePackageId = builder.softwarePackageId;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableSoftwareUsage(long applicationId, long softwarePackageId, String provenance) {
    this.applicationId = applicationId;
    this.softwarePackageId = softwarePackageId;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code applicationId} attribute
   */
  @JsonProperty("applicationId")
  @Override
  public long applicationId() {
    return applicationId;
  }

  /**
   * @return The value of the {@code softwarePackageId} attribute
   */
  @JsonProperty("softwarePackageId")
  @Override
  public long softwarePackageId() {
    return softwarePackageId;
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
   * Copy the current immutable object by setting a value for the {@link SoftwareUsage#applicationId() applicationId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwareUsage withApplicationId(long value) {
    if (this.applicationId == value) return this;
    return new ImmutableSoftwareUsage(value, this.softwarePackageId, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwareUsage#softwarePackageId() softwarePackageId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for softwarePackageId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwareUsage withSoftwarePackageId(long value) {
    if (this.softwarePackageId == value) return this;
    return new ImmutableSoftwareUsage(this.applicationId, value, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwareUsage#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwareUsage withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableSoftwareUsage(this.applicationId, this.softwarePackageId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSoftwareUsage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSoftwareUsage
        && equalTo((ImmutableSoftwareUsage) another);
  }

  private boolean equalTo(ImmutableSoftwareUsage another) {
    return applicationId == another.applicationId
        && softwarePackageId == another.softwarePackageId
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code applicationId}, {@code softwarePackageId}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(applicationId);
    h += (h << 5) + Long.hashCode(softwarePackageId);
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SoftwareUsage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SoftwareUsage{"
        + "applicationId=" + applicationId
        + ", softwarePackageId=" + softwarePackageId
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
  static final class Json extends SoftwareUsage {
    long applicationId;
    boolean applicationIdIsSet;
    long softwarePackageId;
    boolean softwarePackageIdIsSet;
    String provenance;
    @JsonProperty("applicationId")
    public void setApplicationId(long applicationId) {
      this.applicationId = applicationId;
      this.applicationIdIsSet = true;
    }
    @JsonProperty("softwarePackageId")
    public void setSoftwarePackageId(long softwarePackageId) {
      this.softwarePackageId = softwarePackageId;
      this.softwarePackageIdIsSet = true;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public long applicationId() { throw new UnsupportedOperationException(); }
    @Override
    public long softwarePackageId() { throw new UnsupportedOperationException(); }
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
  static ImmutableSoftwareUsage fromJson(Json json) {
    ImmutableSoftwareUsage.Builder builder = ImmutableSoftwareUsage.builder();
    if (json.applicationIdIsSet) {
      builder.applicationId(json.applicationId);
    }
    if (json.softwarePackageIdIsSet) {
      builder.softwarePackageId(json.softwarePackageId);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SoftwareUsage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SoftwareUsage instance
   */
  public static ImmutableSoftwareUsage copyOf(SoftwareUsage instance) {
    if (instance instanceof ImmutableSoftwareUsage) {
      return (ImmutableSoftwareUsage) instance;
    }
    return ImmutableSoftwareUsage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSoftwareUsage ImmutableSoftwareUsage}.
   * @return A new ImmutableSoftwareUsage builder
   */
  public static ImmutableSoftwareUsage.Builder builder() {
    return new ImmutableSoftwareUsage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSoftwareUsage ImmutableSoftwareUsage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APPLICATION_ID = 0x1L;
    private static final long INIT_BIT_SOFTWARE_PACKAGE_ID = 0x2L;
    private long initBits = 0x3L;

    private long applicationId;
    private long softwarePackageId;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.software_catalog.SoftwareUsage} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SoftwareUsage instance) {
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
      if (object instanceof SoftwareUsage) {
        SoftwareUsage instance = (SoftwareUsage) object;
        applicationId(instance.applicationId());
        softwarePackageId(instance.softwarePackageId());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link SoftwareUsage#applicationId() applicationId} attribute.
     * @param applicationId The value for applicationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationId")
    public final Builder applicationId(long applicationId) {
      this.applicationId = applicationId;
      initBits &= ~INIT_BIT_APPLICATION_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwareUsage#softwarePackageId() softwarePackageId} attribute.
     * @param softwarePackageId The value for softwarePackageId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("softwarePackageId")
    public final Builder softwarePackageId(long softwarePackageId) {
      this.softwarePackageId = softwarePackageId;
      initBits &= ~INIT_BIT_SOFTWARE_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwareUsage#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SoftwareUsage#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSoftwareUsage ImmutableSoftwareUsage}.
     * @return An immutable instance of SoftwareUsage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSoftwareUsage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSoftwareUsage(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APPLICATION_ID) != 0) attributes.add("applicationId");
      if ((initBits & INIT_BIT_SOFTWARE_PACKAGE_ID) != 0) attributes.add("softwarePackageId");
      return "Cannot build SoftwareUsage, some of required attributes are not set " + attributes;
    }
  }
}
