package com.khartec.waltz.model.server_information;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.AssetCodeProvider;
import com.khartec.waltz.model.EndOfLifeStatus;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LifecycleStatus;
import com.khartec.waltz.model.Nullable;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ServerInformation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableServerInformation.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ServerInformation"})
public final class ImmutableServerInformation
    extends ServerInformation {
  private final String hostname;
  private final String operatingSystem;
  private final String operatingSystemVersion;
  private final String environment;
  private final String location;
  private final String country;
  private final LifecycleStatus lifecycleStatus;
  private final @Nullable Date hardwareEndOfLifeDate;
  private final EndOfLifeStatus hardwareEndOfLifeStatus;
  private final @Nullable Date operatingSystemEndOfLifeDate;
  private final EndOfLifeStatus operatingSystemEndOfLifeStatus;
  private final String provenance;
  private final boolean virtual;
  private final Long id;
  private final String assetCode;

  private ImmutableServerInformation(ImmutableServerInformation.Builder builder) {
    this.hostname = builder.hostname;
    this.operatingSystem = builder.operatingSystem;
    this.operatingSystemVersion = builder.operatingSystemVersion;
    this.environment = builder.environment;
    this.location = builder.location;
    this.country = builder.country;
    this.lifecycleStatus = builder.lifecycleStatus;
    this.hardwareEndOfLifeDate = builder.hardwareEndOfLifeDate;
    this.operatingSystemEndOfLifeDate = builder.operatingSystemEndOfLifeDate;
    this.id = builder.id;
    this.assetCode = builder.assetCode;
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    if (builder.virtualIsSet()) {
      initShim.virtual(builder.virtual);
    }
    this.provenance = initShim.provenance();
    this.virtual = initShim.virtual();
    this.hardwareEndOfLifeStatus = initShim.hardwareEndOfLifeStatus();
    this.operatingSystemEndOfLifeStatus = initShim.operatingSystemEndOfLifeStatus();
    this.initShim = null;
  }

  private ImmutableServerInformation(
      String hostname,
      String operatingSystem,
      String operatingSystemVersion,
      String environment,
      String location,
      String country,
      LifecycleStatus lifecycleStatus,
      @Nullable Date hardwareEndOfLifeDate,
      @Nullable Date operatingSystemEndOfLifeDate,
      String provenance,
      boolean virtual,
      Long id,
      String assetCode) {
    this.hostname = hostname;
    this.operatingSystem = operatingSystem;
    this.operatingSystemVersion = operatingSystemVersion;
    this.environment = environment;
    this.location = location;
    this.country = country;
    this.lifecycleStatus = lifecycleStatus;
    this.hardwareEndOfLifeDate = hardwareEndOfLifeDate;
    this.operatingSystemEndOfLifeDate = operatingSystemEndOfLifeDate;
    this.provenance = provenance;
    this.virtual = virtual;
    this.id = id;
    this.assetCode = assetCode;
    initShim.provenance(this.provenance);
    initShim.virtual(this.virtual);
    this.hardwareEndOfLifeStatus = initShim.hardwareEndOfLifeStatus();
    this.operatingSystemEndOfLifeStatus = initShim.operatingSystemEndOfLifeStatus();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private EndOfLifeStatus hardwareEndOfLifeStatus;
    private int hardwareEndOfLifeStatusBuildStage;

    EndOfLifeStatus hardwareEndOfLifeStatus() {
      if (hardwareEndOfLifeStatusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (hardwareEndOfLifeStatusBuildStage == STAGE_UNINITIALIZED) {
        hardwareEndOfLifeStatusBuildStage = STAGE_INITIALIZING;
        this.hardwareEndOfLifeStatus = Objects.requireNonNull(ImmutableServerInformation.super.hardwareEndOfLifeStatus(), "hardwareEndOfLifeStatus");
        hardwareEndOfLifeStatusBuildStage = STAGE_INITIALIZED;
      }
      return this.hardwareEndOfLifeStatus;
    }
    private EndOfLifeStatus operatingSystemEndOfLifeStatus;
    private int operatingSystemEndOfLifeStatusBuildStage;

    EndOfLifeStatus operatingSystemEndOfLifeStatus() {
      if (operatingSystemEndOfLifeStatusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (operatingSystemEndOfLifeStatusBuildStage == STAGE_UNINITIALIZED) {
        operatingSystemEndOfLifeStatusBuildStage = STAGE_INITIALIZING;
        this.operatingSystemEndOfLifeStatus = Objects.requireNonNull(ImmutableServerInformation.super.operatingSystemEndOfLifeStatus(), "operatingSystemEndOfLifeStatus");
        operatingSystemEndOfLifeStatusBuildStage = STAGE_INITIALIZED;
      }
      return this.operatingSystemEndOfLifeStatus;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableServerInformation.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }
    private boolean virtual;
    private int virtualBuildStage;

    boolean virtual() {
      if (virtualBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (virtualBuildStage == STAGE_UNINITIALIZED) {
        virtualBuildStage = STAGE_INITIALIZING;
        this.virtual = ImmutableServerInformation.super.virtual();
        virtualBuildStage = STAGE_INITIALIZED;
      }
      return this.virtual;
    }

    void virtual(boolean virtual) {
      this.virtual = virtual;
      virtualBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (hardwareEndOfLifeStatusBuildStage == STAGE_INITIALIZING) attributes.add("hardwareEndOfLifeStatus");
      if (operatingSystemEndOfLifeStatusBuildStage == STAGE_INITIALIZING) attributes.add("operatingSystemEndOfLifeStatus");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      if (virtualBuildStage == STAGE_INITIALIZING) attributes.add("virtual");
      return "Cannot build ServerInformation, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code hostname} attribute
   */
  @JsonProperty("hostname")
  @Override
  public String hostname() {
    return hostname;
  }

  /**
   * @return The value of the {@code operatingSystem} attribute
   */
  @JsonProperty("operatingSystem")
  @Override
  public String operatingSystem() {
    return operatingSystem;
  }

  /**
   * @return The value of the {@code operatingSystemVersion} attribute
   */
  @JsonProperty("operatingSystemVersion")
  @Override
  public String operatingSystemVersion() {
    return operatingSystemVersion;
  }

  /**
   * @return The value of the {@code environment} attribute
   */
  @JsonProperty("environment")
  @Override
  public String environment() {
    return environment;
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public String location() {
    return location;
  }

  /**
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public String country() {
    return country;
  }

  /**
   * @return The value of the {@code lifecycleStatus} attribute
   */
  @JsonProperty("lifecycleStatus")
  @Override
  public LifecycleStatus lifecycleStatus() {
    return lifecycleStatus;
  }

  /**
   * @return The value of the {@code hardwareEndOfLifeDate} attribute
   */
  @JsonProperty("hardwareEndOfLifeDate")
  @Override
  public @Nullable Date hardwareEndOfLifeDate() {
    return hardwareEndOfLifeDate;
  }

  /**
   * @return The computed-at-construction value of the {@code hardwareEndOfLifeStatus} attribute
   */
  @JsonProperty("hardwareEndOfLifeStatus")
  @Override
  public EndOfLifeStatus hardwareEndOfLifeStatus() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.hardwareEndOfLifeStatus()
        : this.hardwareEndOfLifeStatus;
  }

  /**
   * @return The value of the {@code operatingSystemEndOfLifeDate} attribute
   */
  @JsonProperty("operatingSystemEndOfLifeDate")
  @Override
  public @Nullable Date operatingSystemEndOfLifeDate() {
    return operatingSystemEndOfLifeDate;
  }

  /**
   * @return The computed-at-construction value of the {@code operatingSystemEndOfLifeStatus} attribute
   */
  @JsonProperty("operatingSystemEndOfLifeStatus")
  @Override
  public EndOfLifeStatus operatingSystemEndOfLifeStatus() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.operatingSystemEndOfLifeStatus()
        : this.operatingSystemEndOfLifeStatus;
  }

  /**
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.provenance()
        : this.provenance;
  }

  /**
   * @return The value of the {@code virtual} attribute
   */
  @JsonProperty("virtual")
  @Override
  public boolean virtual() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.virtual()
        : this.virtual;
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
   * @return The value of the {@code assetCode} attribute
   */
  @JsonProperty("assetCode")
  @Override
  public String assetCode() {
    return assetCode;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#hostname() hostname} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hostname
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withHostname(String value) {
    if (this.hostname.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "hostname");
    return new ImmutableServerInformation(
        newValue,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#operatingSystem() operatingSystem} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operatingSystem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withOperatingSystem(String value) {
    if (this.operatingSystem.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "operatingSystem");
    return new ImmutableServerInformation(
        this.hostname,
        newValue,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#operatingSystemVersion() operatingSystemVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operatingSystemVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withOperatingSystemVersion(String value) {
    if (this.operatingSystemVersion.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "operatingSystemVersion");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        newValue,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#environment() environment} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for environment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withEnvironment(String value) {
    if (this.environment.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "environment");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        newValue,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#location() location} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for location
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withLocation(String value) {
    if (this.location.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "location");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        newValue,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#country() country} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for country
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withCountry(String value) {
    if (this.country.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "country");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        newValue,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#lifecycleStatus() lifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withLifecycleStatus(LifecycleStatus value) {
    if (this.lifecycleStatus == value) return this;
    LifecycleStatus newValue = Objects.requireNonNull(value, "lifecycleStatus");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        newValue,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#hardwareEndOfLifeDate() hardwareEndOfLifeDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hardwareEndOfLifeDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withHardwareEndOfLifeDate(@Nullable Date value) {
    if (this.hardwareEndOfLifeDate == value) return this;
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        value,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#operatingSystemEndOfLifeDate() operatingSystemEndOfLifeDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operatingSystemEndOfLifeDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withOperatingSystemEndOfLifeDate(@Nullable Date value) {
    if (this.operatingSystemEndOfLifeDate == value) return this;
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        value,
        this.provenance,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        newValue,
        this.virtual,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#virtual() virtual} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for virtual
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withVirtual(boolean value) {
    if (this.virtual == value) return this;
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        value,
        this.id,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServerInformation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerInformation withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        newValue,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServerInformation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServerInformation withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        value,
        this.assetCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServerInformation#assetCode() assetCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assetCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServerInformation withAssetCode(String value) {
    if (this.assetCode.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "assetCode");
    return new ImmutableServerInformation(
        this.hostname,
        this.operatingSystem,
        this.operatingSystemVersion,
        this.environment,
        this.location,
        this.country,
        this.lifecycleStatus,
        this.hardwareEndOfLifeDate,
        this.operatingSystemEndOfLifeDate,
        this.provenance,
        this.virtual,
        this.id,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableServerInformation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableServerInformation
        && equalTo((ImmutableServerInformation) another);
  }

  private boolean equalTo(ImmutableServerInformation another) {
    return hostname.equals(another.hostname)
        && operatingSystem.equals(another.operatingSystem)
        && operatingSystemVersion.equals(another.operatingSystemVersion)
        && environment.equals(another.environment)
        && location.equals(another.location)
        && country.equals(another.country)
        && lifecycleStatus.equals(another.lifecycleStatus)
        && Objects.equals(hardwareEndOfLifeDate, another.hardwareEndOfLifeDate)
        && hardwareEndOfLifeStatus.equals(another.hardwareEndOfLifeStatus)
        && Objects.equals(operatingSystemEndOfLifeDate, another.operatingSystemEndOfLifeDate)
        && operatingSystemEndOfLifeStatus.equals(another.operatingSystemEndOfLifeStatus)
        && provenance.equals(another.provenance)
        && virtual == another.virtual
        && Objects.equals(id, another.id)
        && assetCode.equals(another.assetCode);
  }

  /**
   * Computes a hash code from attributes: {@code hostname}, {@code operatingSystem}, {@code operatingSystemVersion}, {@code environment}, {@code location}, {@code country}, {@code lifecycleStatus}, {@code hardwareEndOfLifeDate}, {@code hardwareEndOfLifeStatus}, {@code operatingSystemEndOfLifeDate}, {@code operatingSystemEndOfLifeStatus}, {@code provenance}, {@code virtual}, {@code id}, {@code assetCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + hostname.hashCode();
    h += (h << 5) + operatingSystem.hashCode();
    h += (h << 5) + operatingSystemVersion.hashCode();
    h += (h << 5) + environment.hashCode();
    h += (h << 5) + location.hashCode();
    h += (h << 5) + country.hashCode();
    h += (h << 5) + lifecycleStatus.hashCode();
    h += (h << 5) + Objects.hashCode(hardwareEndOfLifeDate);
    h += (h << 5) + hardwareEndOfLifeStatus.hashCode();
    h += (h << 5) + Objects.hashCode(operatingSystemEndOfLifeDate);
    h += (h << 5) + operatingSystemEndOfLifeStatus.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Boolean.hashCode(virtual);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + assetCode.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ServerInformation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ServerInformation{");
    builder.append("hostname=").append(hostname);
    builder.append(", ");
    builder.append("operatingSystem=").append(operatingSystem);
    builder.append(", ");
    builder.append("operatingSystemVersion=").append(operatingSystemVersion);
    builder.append(", ");
    builder.append("environment=").append(environment);
    builder.append(", ");
    builder.append("location=").append(location);
    builder.append(", ");
    builder.append("country=").append(country);
    builder.append(", ");
    builder.append("lifecycleStatus=").append(lifecycleStatus);
    if (hardwareEndOfLifeDate != null) {
      builder.append(", ");
      builder.append("hardwareEndOfLifeDate=").append(hardwareEndOfLifeDate);
    }
    builder.append(", ");
    builder.append("hardwareEndOfLifeStatus=").append(hardwareEndOfLifeStatus);
    if (operatingSystemEndOfLifeDate != null) {
      builder.append(", ");
      builder.append("operatingSystemEndOfLifeDate=").append(operatingSystemEndOfLifeDate);
    }
    builder.append(", ");
    builder.append("operatingSystemEndOfLifeStatus=").append(operatingSystemEndOfLifeStatus);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    builder.append(", ");
    builder.append("virtual=").append(virtual);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("assetCode=").append(assetCode);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ServerInformation {
    String hostname;
    String operatingSystem;
    String operatingSystemVersion;
    String environment;
    String location;
    String country;
    LifecycleStatus lifecycleStatus;
    Date hardwareEndOfLifeDate;
    Date operatingSystemEndOfLifeDate;
    String provenance;
    boolean virtual;
    boolean virtualIsSet;
    Optional<Long> id = Optional.empty();
    String assetCode;
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    @JsonProperty("operatingSystemVersion")
    public void setOperatingSystemVersion(String operatingSystemVersion) {
      this.operatingSystemVersion = operatingSystemVersion;
    }
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
      this.environment = environment;
    }
    @JsonProperty("location")
    public void setLocation(String location) {
      this.location = location;
    }
    @JsonProperty("country")
    public void setCountry(String country) {
      this.country = country;
    }
    @JsonProperty("lifecycleStatus")
    public void setLifecycleStatus(LifecycleStatus lifecycleStatus) {
      this.lifecycleStatus = lifecycleStatus;
    }
    @JsonProperty("hardwareEndOfLifeDate")
    public void setHardwareEndOfLifeDate(@Nullable Date hardwareEndOfLifeDate) {
      this.hardwareEndOfLifeDate = hardwareEndOfLifeDate;
    }
    @JsonProperty("operatingSystemEndOfLifeDate")
    public void setOperatingSystemEndOfLifeDate(@Nullable Date operatingSystemEndOfLifeDate) {
      this.operatingSystemEndOfLifeDate = operatingSystemEndOfLifeDate;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("virtual")
    public void setVirtual(boolean virtual) {
      this.virtual = virtual;
      this.virtualIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @JsonProperty("assetCode")
    public void setAssetCode(String assetCode) {
      this.assetCode = assetCode;
    }
    @Override
    public String hostname() { throw new UnsupportedOperationException(); }
    @Override
    public String operatingSystem() { throw new UnsupportedOperationException(); }
    @Override
    public String operatingSystemVersion() { throw new UnsupportedOperationException(); }
    @Override
    public String environment() { throw new UnsupportedOperationException(); }
    @Override
    public String location() { throw new UnsupportedOperationException(); }
    @Override
    public String country() { throw new UnsupportedOperationException(); }
    @Override
    public LifecycleStatus lifecycleStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Date hardwareEndOfLifeDate() { throw new UnsupportedOperationException(); }
    @Override
    public EndOfLifeStatus hardwareEndOfLifeStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Date operatingSystemEndOfLifeDate() { throw new UnsupportedOperationException(); }
    @Override
    public EndOfLifeStatus operatingSystemEndOfLifeStatus() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public boolean virtual() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
    @Override
    public String assetCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableServerInformation fromJson(Json json) {
    ImmutableServerInformation.Builder builder = ImmutableServerInformation.builder();
    if (json.hostname != null) {
      builder.hostname(json.hostname);
    }
    if (json.operatingSystem != null) {
      builder.operatingSystem(json.operatingSystem);
    }
    if (json.operatingSystemVersion != null) {
      builder.operatingSystemVersion(json.operatingSystemVersion);
    }
    if (json.environment != null) {
      builder.environment(json.environment);
    }
    if (json.location != null) {
      builder.location(json.location);
    }
    if (json.country != null) {
      builder.country(json.country);
    }
    if (json.lifecycleStatus != null) {
      builder.lifecycleStatus(json.lifecycleStatus);
    }
    if (json.hardwareEndOfLifeDate != null) {
      builder.hardwareEndOfLifeDate(json.hardwareEndOfLifeDate);
    }
    if (json.operatingSystemEndOfLifeDate != null) {
      builder.operatingSystemEndOfLifeDate(json.operatingSystemEndOfLifeDate);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.virtualIsSet) {
      builder.virtual(json.virtual);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.assetCode != null) {
      builder.assetCode(json.assetCode);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ServerInformation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ServerInformation instance
   */
  public static ImmutableServerInformation copyOf(ServerInformation instance) {
    if (instance instanceof ImmutableServerInformation) {
      return (ImmutableServerInformation) instance;
    }
    return ImmutableServerInformation.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableServerInformation ImmutableServerInformation}.
   * @return A new ImmutableServerInformation builder
   */
  public static ImmutableServerInformation.Builder builder() {
    return new ImmutableServerInformation.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableServerInformation ImmutableServerInformation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_HOSTNAME = 0x1L;
    private static final long INIT_BIT_OPERATING_SYSTEM = 0x2L;
    private static final long INIT_BIT_OPERATING_SYSTEM_VERSION = 0x4L;
    private static final long INIT_BIT_ENVIRONMENT = 0x8L;
    private static final long INIT_BIT_LOCATION = 0x10L;
    private static final long INIT_BIT_COUNTRY = 0x20L;
    private static final long INIT_BIT_LIFECYCLE_STATUS = 0x40L;
    private static final long INIT_BIT_ASSET_CODE = 0x80L;
    private static final long OPT_BIT_VIRTUAL = 0x1L;
    private long initBits = 0xffL;
    private long optBits;

    private String hostname;
    private String operatingSystem;
    private String operatingSystemVersion;
    private String environment;
    private String location;
    private String country;
    private LifecycleStatus lifecycleStatus;
    private Date hardwareEndOfLifeDate;
    private Date operatingSystemEndOfLifeDate;
    private String provenance;
    private boolean virtual;
    private Long id;
    private String assetCode;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.server_information.ServerInformation} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ServerInformation instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.AssetCodeProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AssetCodeProvider instance) {
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

    private void from(Object object) {
      long bits = 0;
      if (object instanceof ServerInformation) {
        ServerInformation instance = (ServerInformation) object;
        country(instance.country());
        virtual(instance.virtual());
        hostname(instance.hostname());
        operatingSystemVersion(instance.operatingSystemVersion());
        environment(instance.environment());
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
        lifecycleStatus(instance.lifecycleStatus());
        @Nullable Date hardwareEndOfLifeDateValue = instance.hardwareEndOfLifeDate();
        if (hardwareEndOfLifeDateValue != null) {
          hardwareEndOfLifeDate(hardwareEndOfLifeDateValue);
        }
        location(instance.location());
        operatingSystem(instance.operatingSystem());
        @Nullable Date operatingSystemEndOfLifeDateValue = instance.operatingSystemEndOfLifeDate();
        if (operatingSystemEndOfLifeDateValue != null) {
          operatingSystemEndOfLifeDate(operatingSystemEndOfLifeDateValue);
        }
      }
      if (object instanceof AssetCodeProvider) {
        AssetCodeProvider instance = (AssetCodeProvider) object;
        assetCode(instance.assetCode());
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
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link ServerInformation#hostname() hostname} attribute.
     * @param hostname The value for hostname 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hostname")
    public final Builder hostname(String hostname) {
      this.hostname = Objects.requireNonNull(hostname, "hostname");
      initBits &= ~INIT_BIT_HOSTNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#operatingSystem() operatingSystem} attribute.
     * @param operatingSystem The value for operatingSystem 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operatingSystem")
    public final Builder operatingSystem(String operatingSystem) {
      this.operatingSystem = Objects.requireNonNull(operatingSystem, "operatingSystem");
      initBits &= ~INIT_BIT_OPERATING_SYSTEM;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#operatingSystemVersion() operatingSystemVersion} attribute.
     * @param operatingSystemVersion The value for operatingSystemVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operatingSystemVersion")
    public final Builder operatingSystemVersion(String operatingSystemVersion) {
      this.operatingSystemVersion = Objects.requireNonNull(operatingSystemVersion, "operatingSystemVersion");
      initBits &= ~INIT_BIT_OPERATING_SYSTEM_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#environment() environment} attribute.
     * @param environment The value for environment 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("environment")
    public final Builder environment(String environment) {
      this.environment = Objects.requireNonNull(environment, "environment");
      initBits &= ~INIT_BIT_ENVIRONMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#location() location} attribute.
     * @param location The value for location 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(String location) {
      this.location = Objects.requireNonNull(location, "location");
      initBits &= ~INIT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(String country) {
      this.country = Objects.requireNonNull(country, "country");
      initBits &= ~INIT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#lifecycleStatus() lifecycleStatus} attribute.
     * @param lifecycleStatus The value for lifecycleStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lifecycleStatus")
    public final Builder lifecycleStatus(LifecycleStatus lifecycleStatus) {
      this.lifecycleStatus = Objects.requireNonNull(lifecycleStatus, "lifecycleStatus");
      initBits &= ~INIT_BIT_LIFECYCLE_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#hardwareEndOfLifeDate() hardwareEndOfLifeDate} attribute.
     * @param hardwareEndOfLifeDate The value for hardwareEndOfLifeDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hardwareEndOfLifeDate")
    public final Builder hardwareEndOfLifeDate(@Nullable Date hardwareEndOfLifeDate) {
      this.hardwareEndOfLifeDate = hardwareEndOfLifeDate;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#operatingSystemEndOfLifeDate() operatingSystemEndOfLifeDate} attribute.
     * @param operatingSystemEndOfLifeDate The value for operatingSystemEndOfLifeDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operatingSystemEndOfLifeDate")
    public final Builder operatingSystemEndOfLifeDate(@Nullable Date operatingSystemEndOfLifeDate) {
      this.operatingSystemEndOfLifeDate = operatingSystemEndOfLifeDate;
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ServerInformation#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#virtual() virtual} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ServerInformation#virtual() virtual}.</em>
     * @param virtual The value for virtual 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("virtual")
    public final Builder virtual(boolean virtual) {
      this.virtual = virtual;
      optBits |= OPT_BIT_VIRTUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServerInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link ServerInformation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link ServerInformation#assetCode() assetCode} attribute.
     * @param assetCode The value for assetCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assetCode")
    public final Builder assetCode(String assetCode) {
      this.assetCode = Objects.requireNonNull(assetCode, "assetCode");
      initBits &= ~INIT_BIT_ASSET_CODE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableServerInformation ImmutableServerInformation}.
     * @return An immutable instance of ServerInformation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableServerInformation build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableServerInformation(this);
    }

    private boolean virtualIsSet() {
      return (optBits & OPT_BIT_VIRTUAL) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_HOSTNAME) != 0) attributes.add("hostname");
      if ((initBits & INIT_BIT_OPERATING_SYSTEM) != 0) attributes.add("operatingSystem");
      if ((initBits & INIT_BIT_OPERATING_SYSTEM_VERSION) != 0) attributes.add("operatingSystemVersion");
      if ((initBits & INIT_BIT_ENVIRONMENT) != 0) attributes.add("environment");
      if ((initBits & INIT_BIT_LOCATION) != 0) attributes.add("location");
      if ((initBits & INIT_BIT_COUNTRY) != 0) attributes.add("country");
      if ((initBits & INIT_BIT_LIFECYCLE_STATUS) != 0) attributes.add("lifecycleStatus");
      if ((initBits & INIT_BIT_ASSET_CODE) != 0) attributes.add("assetCode");
      return "Cannot build ServerInformation, some of required attributes are not set " + attributes;
    }
  }
}
