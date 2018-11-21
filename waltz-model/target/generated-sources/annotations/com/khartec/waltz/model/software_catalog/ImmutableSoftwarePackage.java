package com.khartec.waltz.model.software_catalog;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
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
 * Immutable implementation of {@link SoftwarePackage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSoftwarePackage.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SoftwarePackage"})
public final class ImmutableSoftwarePackage extends SoftwarePackage {
  private final String vendor;
  private final String version;
  private final MaturityStatus maturityStatus;
  private final boolean isNotable;
  private final Long id;
  private final String name;
  private final @Nullable String description;
  private final String externalId;
  private final String provenance;

  private ImmutableSoftwarePackage(ImmutableSoftwarePackage.Builder builder) {
    this.vendor = builder.vendor;
    this.version = builder.version;
    this.maturityStatus = builder.maturityStatus;
    this.isNotable = builder.isNotable;
    this.id = builder.id;
    this.name = builder.name;
    this.description = builder.description;
    this.externalId = builder.externalId;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableSoftwarePackage(
      String vendor,
      String version,
      MaturityStatus maturityStatus,
      boolean isNotable,
      Long id,
      String name,
      @Nullable String description,
      String externalId,
      String provenance) {
    this.vendor = vendor;
    this.version = version;
    this.maturityStatus = maturityStatus;
    this.isNotable = isNotable;
    this.id = id;
    this.name = name;
    this.description = description;
    this.externalId = externalId;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code vendor} attribute
   */
  @JsonProperty("vendor")
  @Override
  public String vendor() {
    return vendor;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    return version;
  }

  /**
   * @return The value of the {@code maturityStatus} attribute
   */
  @JsonProperty("maturityStatus")
  @Override
  public MaturityStatus maturityStatus() {
    return maturityStatus;
  }

  /**
   * @return The value of the {@code isNotable} attribute
   */
  @JsonProperty("isNotable")
  @Override
  public boolean isNotable() {
    return isNotable;
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
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
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
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#vendor() vendor} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vendor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withVendor(String value) {
    if (this.vendor.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "vendor");
    return new ImmutableSoftwarePackage(
        newValue,
        this.version,
        this.maturityStatus,
        this.isNotable,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "version");
    return new ImmutableSoftwarePackage(
        this.vendor,
        newValue,
        this.maturityStatus,
        this.isNotable,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#maturityStatus() maturityStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maturityStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withMaturityStatus(MaturityStatus value) {
    if (this.maturityStatus == value) return this;
    MaturityStatus newValue = Objects.requireNonNull(value, "maturityStatus");
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        newValue,
        this.isNotable,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#isNotable() isNotable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isNotable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withIsNotable(boolean value) {
    if (this.isNotable == value) return this;
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        value,
        this.id,
        this.name,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SoftwarePackage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwarePackage withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        newValue,
        this.name,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SoftwarePackage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwarePackage withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        value,
        this.name,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        this.id,
        newValue,
        this.description,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        this.id,
        this.name,
        value,
        this.externalId,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SoftwarePackage#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwarePackage withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        this.id,
        this.name,
        this.description,
        newValue,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SoftwarePackage#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSoftwarePackage withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        this.id,
        this.name,
        this.description,
        value,
        this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SoftwarePackage#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSoftwarePackage withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableSoftwarePackage(
        this.vendor,
        this.version,
        this.maturityStatus,
        this.isNotable,
        this.id,
        this.name,
        this.description,
        this.externalId,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSoftwarePackage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSoftwarePackage
        && equalTo((ImmutableSoftwarePackage) another);
  }

  private boolean equalTo(ImmutableSoftwarePackage another) {
    return vendor.equals(another.vendor)
        && version.equals(another.version)
        && maturityStatus.equals(another.maturityStatus)
        && isNotable == another.isNotable
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(externalId, another.externalId)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code vendor}, {@code version}, {@code maturityStatus}, {@code isNotable}, {@code id}, {@code name}, {@code description}, {@code externalId}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + vendor.hashCode();
    h += (h << 5) + version.hashCode();
    h += (h << 5) + maturityStatus.hashCode();
    h += (h << 5) + Boolean.hashCode(isNotable);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(externalId);
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SoftwarePackage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SoftwarePackage{");
    builder.append("vendor=").append(vendor);
    builder.append(", ");
    builder.append("version=").append(version);
    builder.append(", ");
    builder.append("maturityStatus=").append(maturityStatus);
    builder.append(", ");
    builder.append("isNotable=").append(isNotable);
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
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
    }
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SoftwarePackage {
    String vendor;
    String version;
    MaturityStatus maturityStatus;
    boolean isNotable;
    boolean isNotableIsSet;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    Optional<String> externalId = Optional.empty();
    String provenance;
    @JsonProperty("vendor")
    public void setVendor(String vendor) {
      this.vendor = vendor;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @JsonProperty("maturityStatus")
    public void setMaturityStatus(MaturityStatus maturityStatus) {
      this.maturityStatus = maturityStatus;
    }
    @JsonProperty("isNotable")
    public void setIsNotable(boolean isNotable) {
      this.isNotable = isNotable;
      this.isNotableIsSet = true;
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
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public String vendor() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
    @Override
    public MaturityStatus maturityStatus() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isNotable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
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
  static ImmutableSoftwarePackage fromJson(Json json) {
    ImmutableSoftwarePackage.Builder builder = ImmutableSoftwarePackage.builder();
    if (json.vendor != null) {
      builder.vendor(json.vendor);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    if (json.maturityStatus != null) {
      builder.maturityStatus(json.maturityStatus);
    }
    if (json.isNotableIsSet) {
      builder.isNotable(json.isNotable);
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
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SoftwarePackage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SoftwarePackage instance
   */
  public static ImmutableSoftwarePackage copyOf(SoftwarePackage instance) {
    if (instance instanceof ImmutableSoftwarePackage) {
      return (ImmutableSoftwarePackage) instance;
    }
    return ImmutableSoftwarePackage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSoftwarePackage ImmutableSoftwarePackage}.
   * @return A new ImmutableSoftwarePackage builder
   */
  public static ImmutableSoftwarePackage.Builder builder() {
    return new ImmutableSoftwarePackage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSoftwarePackage ImmutableSoftwarePackage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_VENDOR = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private static final long INIT_BIT_MATURITY_STATUS = 0x4L;
    private static final long INIT_BIT_IS_NOTABLE = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private long initBits = 0x1fL;

    private String vendor;
    private String version;
    private MaturityStatus maturityStatus;
    private boolean isNotable;
    private Long id;
    private String name;
    private String description;
    private String externalId;
    private String provenance;

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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.software_catalog.SoftwarePackage} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SoftwarePackage instance) {
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
      if (object instanceof SoftwarePackage) {
        SoftwarePackage instance = (SoftwarePackage) object;
        maturityStatus(instance.maturityStatus());
        isNotable(instance.isNotable());
        version(instance.version());
        vendor(instance.vendor());
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link SoftwarePackage#vendor() vendor} attribute.
     * @param vendor The value for vendor 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("vendor")
    public final Builder vendor(String vendor) {
      this.vendor = Objects.requireNonNull(vendor, "vendor");
      initBits &= ~INIT_BIT_VENDOR;
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwarePackage#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(String version) {
      this.version = Objects.requireNonNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwarePackage#maturityStatus() maturityStatus} attribute.
     * @param maturityStatus The value for maturityStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maturityStatus")
    public final Builder maturityStatus(MaturityStatus maturityStatus) {
      this.maturityStatus = Objects.requireNonNull(maturityStatus, "maturityStatus");
      initBits &= ~INIT_BIT_MATURITY_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwarePackage#isNotable() isNotable} attribute.
     * @param isNotable The value for isNotable 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isNotable")
    public final Builder isNotable(boolean isNotable) {
      this.isNotable = isNotable;
      initBits &= ~INIT_BIT_IS_NOTABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link SoftwarePackage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SoftwarePackage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwarePackage#name() name} attribute.
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
     * Initializes the value for the {@link SoftwarePackage#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the optional value {@link SoftwarePackage#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link SoftwarePackage#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SoftwarePackage#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SoftwarePackage#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSoftwarePackage ImmutableSoftwarePackage}.
     * @return An immutable instance of SoftwarePackage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSoftwarePackage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSoftwarePackage(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_VENDOR) != 0) attributes.add("vendor");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      if ((initBits & INIT_BIT_MATURITY_STATUS) != 0) attributes.add("maturityStatus");
      if ((initBits & INIT_BIT_IS_NOTABLE) != 0) attributes.add("isNotable");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SoftwarePackage, some of required attributes are not set " + attributes;
    }
  }
}
