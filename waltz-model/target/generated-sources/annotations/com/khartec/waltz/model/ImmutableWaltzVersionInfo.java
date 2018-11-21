package com.khartec.waltz.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link WaltzVersionInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableWaltzVersionInfo.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "WaltzVersionInfo"})
public final class ImmutableWaltzVersionInfo extends WaltzVersionInfo {
  private final String pomVersion;
  private final String timestamp;
  private final String revision;

  private ImmutableWaltzVersionInfo(String pomVersion, String timestamp, String revision) {
    this.pomVersion = pomVersion;
    this.timestamp = timestamp;
    this.revision = revision;
  }

  /**
   * @return The value of the {@code pomVersion} attribute
   */
  @JsonProperty("pomVersion")
  @Override
  public String pomVersion() {
    return pomVersion;
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty("timestamp")
  @Override
  public String timestamp() {
    return timestamp;
  }

  /**
   * @return The value of the {@code revision} attribute
   */
  @JsonProperty("revision")
  @Override
  public String revision() {
    return revision;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WaltzVersionInfo#pomVersion() pomVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pomVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWaltzVersionInfo withPomVersion(String value) {
    if (this.pomVersion.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "pomVersion");
    return new ImmutableWaltzVersionInfo(newValue, this.timestamp, this.revision);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WaltzVersionInfo#timestamp() timestamp} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timestamp
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWaltzVersionInfo withTimestamp(String value) {
    if (this.timestamp.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "timestamp");
    return new ImmutableWaltzVersionInfo(this.pomVersion, newValue, this.revision);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WaltzVersionInfo#revision() revision} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for revision
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWaltzVersionInfo withRevision(String value) {
    if (this.revision.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "revision");
    return new ImmutableWaltzVersionInfo(this.pomVersion, this.timestamp, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableWaltzVersionInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableWaltzVersionInfo
        && equalTo((ImmutableWaltzVersionInfo) another);
  }

  private boolean equalTo(ImmutableWaltzVersionInfo another) {
    return pomVersion.equals(another.pomVersion)
        && timestamp.equals(another.timestamp)
        && revision.equals(another.revision);
  }

  /**
   * Computes a hash code from attributes: {@code pomVersion}, {@code timestamp}, {@code revision}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pomVersion.hashCode();
    h += (h << 5) + timestamp.hashCode();
    h += (h << 5) + revision.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code WaltzVersionInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "WaltzVersionInfo{"
        + "pomVersion=" + pomVersion
        + ", timestamp=" + timestamp
        + ", revision=" + revision
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends WaltzVersionInfo {
    String pomVersion;
    String timestamp;
    String revision;
    @JsonProperty("pomVersion")
    public void setPomVersion(String pomVersion) {
      this.pomVersion = pomVersion;
    }
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
    }
    @JsonProperty("revision")
    public void setRevision(String revision) {
      this.revision = revision;
    }
    @Override
    public String pomVersion() { throw new UnsupportedOperationException(); }
    @Override
    public String timestamp() { throw new UnsupportedOperationException(); }
    @Override
    public String revision() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableWaltzVersionInfo fromJson(Json json) {
    ImmutableWaltzVersionInfo.Builder builder = ImmutableWaltzVersionInfo.builder();
    if (json.pomVersion != null) {
      builder.pomVersion(json.pomVersion);
    }
    if (json.timestamp != null) {
      builder.timestamp(json.timestamp);
    }
    if (json.revision != null) {
      builder.revision(json.revision);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link WaltzVersionInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WaltzVersionInfo instance
   */
  public static ImmutableWaltzVersionInfo copyOf(WaltzVersionInfo instance) {
    if (instance instanceof ImmutableWaltzVersionInfo) {
      return (ImmutableWaltzVersionInfo) instance;
    }
    return ImmutableWaltzVersionInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableWaltzVersionInfo ImmutableWaltzVersionInfo}.
   * @return A new ImmutableWaltzVersionInfo builder
   */
  public static ImmutableWaltzVersionInfo.Builder builder() {
    return new ImmutableWaltzVersionInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableWaltzVersionInfo ImmutableWaltzVersionInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_POM_VERSION = 0x1L;
    private static final long INIT_BIT_TIMESTAMP = 0x2L;
    private static final long INIT_BIT_REVISION = 0x4L;
    private long initBits = 0x7L;

    private String pomVersion;
    private String timestamp;
    private String revision;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code WaltzVersionInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WaltzVersionInfo instance) {
      Objects.requireNonNull(instance, "instance");
      pomVersion(instance.pomVersion());
      timestamp(instance.timestamp());
      revision(instance.revision());
      return this;
    }

    /**
     * Initializes the value for the {@link WaltzVersionInfo#pomVersion() pomVersion} attribute.
     * @param pomVersion The value for pomVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("pomVersion")
    public final Builder pomVersion(String pomVersion) {
      this.pomVersion = Objects.requireNonNull(pomVersion, "pomVersion");
      initBits &= ~INIT_BIT_POM_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link WaltzVersionInfo#timestamp() timestamp} attribute.
     * @param timestamp The value for timestamp 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timestamp")
    public final Builder timestamp(String timestamp) {
      this.timestamp = Objects.requireNonNull(timestamp, "timestamp");
      initBits &= ~INIT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the value for the {@link WaltzVersionInfo#revision() revision} attribute.
     * @param revision The value for revision 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("revision")
    public final Builder revision(String revision) {
      this.revision = Objects.requireNonNull(revision, "revision");
      initBits &= ~INIT_BIT_REVISION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableWaltzVersionInfo ImmutableWaltzVersionInfo}.
     * @return An immutable instance of WaltzVersionInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableWaltzVersionInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableWaltzVersionInfo(pomVersion, timestamp, revision);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_POM_VERSION) != 0) attributes.add("pomVersion");
      if ((initBits & INIT_BIT_TIMESTAMP) != 0) attributes.add("timestamp");
      if ((initBits & INIT_BIT_REVISION) != 0) attributes.add("revision");
      return "Cannot build WaltzVersionInfo, some of required attributes are not set " + attributes;
    }
  }
}
