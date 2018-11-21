package com.khartec.waltz.model.database_information;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.AssetCodeProvider;
import com.khartec.waltz.model.EndOfLifeStatus;
import com.khartec.waltz.model.ExternalIdProvider;
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
 * Immutable implementation of {@link DatabaseInformation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDatabaseInformation.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "DatabaseInformation"})
public final class ImmutableDatabaseInformation
    extends DatabaseInformation {
  private final String databaseName;
  private final String instanceName;
  private final String environment;
  private final String dbmsName;
  private final String dbmsVersion;
  private final String dbmsVendor;
  private final LifecycleStatus lifecycleStatus;
  private final @Nullable Date endOfLifeDate;
  private final EndOfLifeStatus endOfLifeStatus;
  private final String assetCode;
  private final String provenance;
  private final String externalId;

  private ImmutableDatabaseInformation(ImmutableDatabaseInformation.Builder builder) {
    this.databaseName = builder.databaseName;
    this.instanceName = builder.instanceName;
    this.environment = builder.environment;
    this.dbmsName = builder.dbmsName;
    this.dbmsVersion = builder.dbmsVersion;
    this.dbmsVendor = builder.dbmsVendor;
    this.lifecycleStatus = builder.lifecycleStatus;
    this.endOfLifeDate = builder.endOfLifeDate;
    this.assetCode = builder.assetCode;
    this.externalId = builder.externalId;
    if (builder.provenance != null) {
      initShim.provenance(builder.provenance);
    }
    this.provenance = initShim.provenance();
    this.endOfLifeStatus = initShim.endOfLifeStatus();
    this.initShim = null;
  }

  private ImmutableDatabaseInformation(
      String databaseName,
      String instanceName,
      String environment,
      String dbmsName,
      String dbmsVersion,
      String dbmsVendor,
      LifecycleStatus lifecycleStatus,
      @Nullable Date endOfLifeDate,
      String assetCode,
      String provenance,
      String externalId) {
    this.databaseName = databaseName;
    this.instanceName = instanceName;
    this.environment = environment;
    this.dbmsName = dbmsName;
    this.dbmsVersion = dbmsVersion;
    this.dbmsVendor = dbmsVendor;
    this.lifecycleStatus = lifecycleStatus;
    this.endOfLifeDate = endOfLifeDate;
    this.assetCode = assetCode;
    this.provenance = provenance;
    this.externalId = externalId;
    initShim.provenance(this.provenance);
    this.endOfLifeStatus = initShim.endOfLifeStatus();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private EndOfLifeStatus endOfLifeStatus;
    private int endOfLifeStatusBuildStage;

    EndOfLifeStatus endOfLifeStatus() {
      if (endOfLifeStatusBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (endOfLifeStatusBuildStage == STAGE_UNINITIALIZED) {
        endOfLifeStatusBuildStage = STAGE_INITIALIZING;
        this.endOfLifeStatus = Objects.requireNonNull(ImmutableDatabaseInformation.super.endOfLifeStatus(), "endOfLifeStatus");
        endOfLifeStatusBuildStage = STAGE_INITIALIZED;
      }
      return this.endOfLifeStatus;
    }
    private String provenance;
    private int provenanceBuildStage;

    String provenance() {
      if (provenanceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (provenanceBuildStage == STAGE_UNINITIALIZED) {
        provenanceBuildStage = STAGE_INITIALIZING;
        this.provenance = Objects.requireNonNull(ImmutableDatabaseInformation.super.provenance(), "provenance");
        provenanceBuildStage = STAGE_INITIALIZED;
      }
      return this.provenance;
    }

    void provenance(String provenance) {
      this.provenance = provenance;
      provenanceBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (endOfLifeStatusBuildStage == STAGE_INITIALIZING) attributes.add("endOfLifeStatus");
      if (provenanceBuildStage == STAGE_INITIALIZING) attributes.add("provenance");
      return "Cannot build DatabaseInformation, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code databaseName} attribute
   */
  @JsonProperty("databaseName")
  @Override
  public String databaseName() {
    return databaseName;
  }

  /**
   * @return The value of the {@code instanceName} attribute
   */
  @JsonProperty("instanceName")
  @Override
  public String instanceName() {
    return instanceName;
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
   * @return The value of the {@code dbmsName} attribute
   */
  @JsonProperty("dbmsName")
  @Override
  public String dbmsName() {
    return dbmsName;
  }

  /**
   * @return The value of the {@code dbmsVersion} attribute
   */
  @JsonProperty("dbmsVersion")
  @Override
  public String dbmsVersion() {
    return dbmsVersion;
  }

  /**
   * @return The value of the {@code dbmsVendor} attribute
   */
  @JsonProperty("dbmsVendor")
  @Override
  public String dbmsVendor() {
    return dbmsVendor;
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
   * @return The value of the {@code endOfLifeDate} attribute
   */
  @JsonProperty("endOfLifeDate")
  @Override
  public @Nullable Date endOfLifeDate() {
    return endOfLifeDate;
  }

  /**
   * @return The computed-at-construction value of the {@code endOfLifeStatus} attribute
   */
  @JsonProperty("endOfLifeStatus")
  @Override
  public EndOfLifeStatus endOfLifeStatus() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.endOfLifeStatus()
        : this.endOfLifeStatus;
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
   * @return The value of the {@code externalId} attribute
   */
  @JsonProperty("externalId")
  @Override
  public Optional<String> externalId() {
    return Optional.ofNullable(externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#databaseName() databaseName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for databaseName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withDatabaseName(String value) {
    if (this.databaseName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "databaseName");
    return new ImmutableDatabaseInformation(
        newValue,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#instanceName() instanceName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for instanceName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withInstanceName(String value) {
    if (this.instanceName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "instanceName");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        newValue,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#environment() environment} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for environment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withEnvironment(String value) {
    if (this.environment.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "environment");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        newValue,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#dbmsName() dbmsName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dbmsName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withDbmsName(String value) {
    if (this.dbmsName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dbmsName");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        newValue,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#dbmsVersion() dbmsVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dbmsVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withDbmsVersion(String value) {
    if (this.dbmsVersion.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dbmsVersion");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        newValue,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#dbmsVendor() dbmsVendor} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dbmsVendor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withDbmsVendor(String value) {
    if (this.dbmsVendor.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "dbmsVendor");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        newValue,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#lifecycleStatus() lifecycleStatus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lifecycleStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withLifecycleStatus(LifecycleStatus value) {
    if (this.lifecycleStatus == value) return this;
    LifecycleStatus newValue = Objects.requireNonNull(value, "lifecycleStatus");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        newValue,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#endOfLifeDate() endOfLifeDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for endOfLifeDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withEndOfLifeDate(@Nullable Date value) {
    if (this.endOfLifeDate == value) return this;
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        value,
        this.assetCode,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#assetCode() assetCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assetCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withAssetCode(String value) {
    if (this.assetCode.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "assetCode");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        newValue,
        this.provenance,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DatabaseInformation#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDatabaseInformation withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        newValue,
        this.externalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DatabaseInformation#externalId() externalId} attribute.
   * @param value The value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDatabaseInformation withExternalId(String value) {
    String newValue = Objects.requireNonNull(value, "externalId");
    if (Objects.equals(this.externalId, newValue)) return this;
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DatabaseInformation#externalId() externalId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDatabaseInformation withExternalId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.externalId, value)) return this;
    return new ImmutableDatabaseInformation(
        this.databaseName,
        this.instanceName,
        this.environment,
        this.dbmsName,
        this.dbmsVersion,
        this.dbmsVendor,
        this.lifecycleStatus,
        this.endOfLifeDate,
        this.assetCode,
        this.provenance,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDatabaseInformation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDatabaseInformation
        && equalTo((ImmutableDatabaseInformation) another);
  }

  private boolean equalTo(ImmutableDatabaseInformation another) {
    return databaseName.equals(another.databaseName)
        && instanceName.equals(another.instanceName)
        && environment.equals(another.environment)
        && dbmsName.equals(another.dbmsName)
        && dbmsVersion.equals(another.dbmsVersion)
        && dbmsVendor.equals(another.dbmsVendor)
        && lifecycleStatus.equals(another.lifecycleStatus)
        && Objects.equals(endOfLifeDate, another.endOfLifeDate)
        && endOfLifeStatus.equals(another.endOfLifeStatus)
        && assetCode.equals(another.assetCode)
        && provenance.equals(another.provenance)
        && Objects.equals(externalId, another.externalId);
  }

  /**
   * Computes a hash code from attributes: {@code databaseName}, {@code instanceName}, {@code environment}, {@code dbmsName}, {@code dbmsVersion}, {@code dbmsVendor}, {@code lifecycleStatus}, {@code endOfLifeDate}, {@code endOfLifeStatus}, {@code assetCode}, {@code provenance}, {@code externalId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + databaseName.hashCode();
    h += (h << 5) + instanceName.hashCode();
    h += (h << 5) + environment.hashCode();
    h += (h << 5) + dbmsName.hashCode();
    h += (h << 5) + dbmsVersion.hashCode();
    h += (h << 5) + dbmsVendor.hashCode();
    h += (h << 5) + lifecycleStatus.hashCode();
    h += (h << 5) + Objects.hashCode(endOfLifeDate);
    h += (h << 5) + endOfLifeStatus.hashCode();
    h += (h << 5) + assetCode.hashCode();
    h += (h << 5) + provenance.hashCode();
    h += (h << 5) + Objects.hashCode(externalId);
    return h;
  }

  /**
   * Prints the immutable value {@code DatabaseInformation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DatabaseInformation{");
    builder.append("databaseName=").append(databaseName);
    builder.append(", ");
    builder.append("instanceName=").append(instanceName);
    builder.append(", ");
    builder.append("environment=").append(environment);
    builder.append(", ");
    builder.append("dbmsName=").append(dbmsName);
    builder.append(", ");
    builder.append("dbmsVersion=").append(dbmsVersion);
    builder.append(", ");
    builder.append("dbmsVendor=").append(dbmsVendor);
    builder.append(", ");
    builder.append("lifecycleStatus=").append(lifecycleStatus);
    if (endOfLifeDate != null) {
      builder.append(", ");
      builder.append("endOfLifeDate=").append(endOfLifeDate);
    }
    builder.append(", ");
    builder.append("endOfLifeStatus=").append(endOfLifeStatus);
    builder.append(", ");
    builder.append("assetCode=").append(assetCode);
    builder.append(", ");
    builder.append("provenance=").append(provenance);
    if (externalId != null) {
      builder.append(", ");
      builder.append("externalId=").append(externalId);
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
  static final class Json extends DatabaseInformation {
    String databaseName;
    String instanceName;
    String environment;
    String dbmsName;
    String dbmsVersion;
    String dbmsVendor;
    LifecycleStatus lifecycleStatus;
    Date endOfLifeDate;
    String assetCode;
    String provenance;
    Optional<String> externalId = Optional.empty();
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
      this.databaseName = databaseName;
    }
    @JsonProperty("instanceName")
    public void setInstanceName(String instanceName) {
      this.instanceName = instanceName;
    }
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
      this.environment = environment;
    }
    @JsonProperty("dbmsName")
    public void setDbmsName(String dbmsName) {
      this.dbmsName = dbmsName;
    }
    @JsonProperty("dbmsVersion")
    public void setDbmsVersion(String dbmsVersion) {
      this.dbmsVersion = dbmsVersion;
    }
    @JsonProperty("dbmsVendor")
    public void setDbmsVendor(String dbmsVendor) {
      this.dbmsVendor = dbmsVendor;
    }
    @JsonProperty("lifecycleStatus")
    public void setLifecycleStatus(LifecycleStatus lifecycleStatus) {
      this.lifecycleStatus = lifecycleStatus;
    }
    @JsonProperty("endOfLifeDate")
    public void setEndOfLifeDate(@Nullable Date endOfLifeDate) {
      this.endOfLifeDate = endOfLifeDate;
    }
    @JsonProperty("assetCode")
    public void setAssetCode(String assetCode) {
      this.assetCode = assetCode;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @JsonProperty("externalId")
    public void setExternalId(Optional<String> externalId) {
      this.externalId = externalId;
    }
    @Override
    public String databaseName() { throw new UnsupportedOperationException(); }
    @Override
    public String instanceName() { throw new UnsupportedOperationException(); }
    @Override
    public String environment() { throw new UnsupportedOperationException(); }
    @Override
    public String dbmsName() { throw new UnsupportedOperationException(); }
    @Override
    public String dbmsVersion() { throw new UnsupportedOperationException(); }
    @Override
    public String dbmsVendor() { throw new UnsupportedOperationException(); }
    @Override
    public LifecycleStatus lifecycleStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Date endOfLifeDate() { throw new UnsupportedOperationException(); }
    @Override
    public EndOfLifeStatus endOfLifeStatus() { throw new UnsupportedOperationException(); }
    @Override
    public String assetCode() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> externalId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDatabaseInformation fromJson(Json json) {
    ImmutableDatabaseInformation.Builder builder = ImmutableDatabaseInformation.builder();
    if (json.databaseName != null) {
      builder.databaseName(json.databaseName);
    }
    if (json.instanceName != null) {
      builder.instanceName(json.instanceName);
    }
    if (json.environment != null) {
      builder.environment(json.environment);
    }
    if (json.dbmsName != null) {
      builder.dbmsName(json.dbmsName);
    }
    if (json.dbmsVersion != null) {
      builder.dbmsVersion(json.dbmsVersion);
    }
    if (json.dbmsVendor != null) {
      builder.dbmsVendor(json.dbmsVendor);
    }
    if (json.lifecycleStatus != null) {
      builder.lifecycleStatus(json.lifecycleStatus);
    }
    if (json.endOfLifeDate != null) {
      builder.endOfLifeDate(json.endOfLifeDate);
    }
    if (json.assetCode != null) {
      builder.assetCode(json.assetCode);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    if (json.externalId != null) {
      builder.externalId(json.externalId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DatabaseInformation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DatabaseInformation instance
   */
  public static ImmutableDatabaseInformation copyOf(DatabaseInformation instance) {
    if (instance instanceof ImmutableDatabaseInformation) {
      return (ImmutableDatabaseInformation) instance;
    }
    return ImmutableDatabaseInformation.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDatabaseInformation ImmutableDatabaseInformation}.
   * @return A new ImmutableDatabaseInformation builder
   */
  public static ImmutableDatabaseInformation.Builder builder() {
    return new ImmutableDatabaseInformation.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDatabaseInformation ImmutableDatabaseInformation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_DATABASE_NAME = 0x1L;
    private static final long INIT_BIT_INSTANCE_NAME = 0x2L;
    private static final long INIT_BIT_ENVIRONMENT = 0x4L;
    private static final long INIT_BIT_DBMS_NAME = 0x8L;
    private static final long INIT_BIT_DBMS_VERSION = 0x10L;
    private static final long INIT_BIT_DBMS_VENDOR = 0x20L;
    private static final long INIT_BIT_LIFECYCLE_STATUS = 0x40L;
    private static final long INIT_BIT_ASSET_CODE = 0x80L;
    private long initBits = 0xffL;

    private String databaseName;
    private String instanceName;
    private String environment;
    private String dbmsName;
    private String dbmsVersion;
    private String dbmsVendor;
    private LifecycleStatus lifecycleStatus;
    private Date endOfLifeDate;
    private String assetCode;
    private String provenance;
    private String externalId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.database_information.DatabaseInformation} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DatabaseInformation instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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
      if (object instanceof DatabaseInformation) {
        DatabaseInformation instance = (DatabaseInformation) object;
        environment(instance.environment());
        databaseName(instance.databaseName());
        lifecycleStatus(instance.lifecycleStatus());
        instanceName(instance.instanceName());
        @Nullable Date endOfLifeDateValue = instance.endOfLifeDate();
        if (endOfLifeDateValue != null) {
          endOfLifeDate(endOfLifeDateValue);
        }
        dbmsName(instance.dbmsName());
        dbmsVendor(instance.dbmsVendor());
        dbmsVersion(instance.dbmsVersion());
      }
      if (object instanceof ExternalIdProvider) {
        ExternalIdProvider instance = (ExternalIdProvider) object;
        Optional<String> externalIdOptional = instance.externalId();
        if (externalIdOptional.isPresent()) {
          externalId(externalIdOptional);
        }
      }
      if (object instanceof AssetCodeProvider) {
        AssetCodeProvider instance = (AssetCodeProvider) object;
        assetCode(instance.assetCode());
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        provenance(instance.provenance());
      }
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#databaseName() databaseName} attribute.
     * @param databaseName The value for databaseName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("databaseName")
    public final Builder databaseName(String databaseName) {
      this.databaseName = Objects.requireNonNull(databaseName, "databaseName");
      initBits &= ~INIT_BIT_DATABASE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#instanceName() instanceName} attribute.
     * @param instanceName The value for instanceName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instanceName")
    public final Builder instanceName(String instanceName) {
      this.instanceName = Objects.requireNonNull(instanceName, "instanceName");
      initBits &= ~INIT_BIT_INSTANCE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#environment() environment} attribute.
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
     * Initializes the value for the {@link DatabaseInformation#dbmsName() dbmsName} attribute.
     * @param dbmsName The value for dbmsName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dbmsName")
    public final Builder dbmsName(String dbmsName) {
      this.dbmsName = Objects.requireNonNull(dbmsName, "dbmsName");
      initBits &= ~INIT_BIT_DBMS_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#dbmsVersion() dbmsVersion} attribute.
     * @param dbmsVersion The value for dbmsVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dbmsVersion")
    public final Builder dbmsVersion(String dbmsVersion) {
      this.dbmsVersion = Objects.requireNonNull(dbmsVersion, "dbmsVersion");
      initBits &= ~INIT_BIT_DBMS_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#dbmsVendor() dbmsVendor} attribute.
     * @param dbmsVendor The value for dbmsVendor 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dbmsVendor")
    public final Builder dbmsVendor(String dbmsVendor) {
      this.dbmsVendor = Objects.requireNonNull(dbmsVendor, "dbmsVendor");
      initBits &= ~INIT_BIT_DBMS_VENDOR;
      return this;
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#lifecycleStatus() lifecycleStatus} attribute.
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
     * Initializes the value for the {@link DatabaseInformation#endOfLifeDate() endOfLifeDate} attribute.
     * @param endOfLifeDate The value for endOfLifeDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endOfLifeDate")
    public final Builder endOfLifeDate(@Nullable Date endOfLifeDate) {
      this.endOfLifeDate = endOfLifeDate;
      return this;
    }

    /**
     * Initializes the value for the {@link DatabaseInformation#assetCode() assetCode} attribute.
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
     * Initializes the value for the {@link DatabaseInformation#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DatabaseInformation#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Initializes the optional value {@link DatabaseInformation#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalId(String externalId) {
      this.externalId = Objects.requireNonNull(externalId, "externalId");
      return this;
    }

    /**
     * Initializes the optional value {@link DatabaseInformation#externalId() externalId} to externalId.
     * @param externalId The value for externalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalId")
    public final Builder externalId(Optional<String> externalId) {
      this.externalId = externalId.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDatabaseInformation ImmutableDatabaseInformation}.
     * @return An immutable instance of DatabaseInformation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDatabaseInformation build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDatabaseInformation(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_DATABASE_NAME) != 0) attributes.add("databaseName");
      if ((initBits & INIT_BIT_INSTANCE_NAME) != 0) attributes.add("instanceName");
      if ((initBits & INIT_BIT_ENVIRONMENT) != 0) attributes.add("environment");
      if ((initBits & INIT_BIT_DBMS_NAME) != 0) attributes.add("dbmsName");
      if ((initBits & INIT_BIT_DBMS_VERSION) != 0) attributes.add("dbmsVersion");
      if ((initBits & INIT_BIT_DBMS_VENDOR) != 0) attributes.add("dbmsVendor");
      if ((initBits & INIT_BIT_LIFECYCLE_STATUS) != 0) attributes.add("lifecycleStatus");
      if ((initBits & INIT_BIT_ASSET_CODE) != 0) attributes.add("assetCode");
      return "Cannot build DatabaseInformation, some of required attributes are not set " + attributes;
    }
  }
}
