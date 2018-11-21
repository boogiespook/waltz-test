package com.khartec.waltz.model.user_agent_info;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.UserNameProvider;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UserAgentInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserAgentInfo.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UserAgentInfo"})
public final class ImmutableUserAgentInfo extends UserAgentInfo {
  private final String userAgent;
  private final String resolution;
  private final String operatingSystem;
  private final String ipAddress;
  private final LocalDateTime loginTimestamp;
  private final String userName;

  private ImmutableUserAgentInfo(
      String userAgent,
      String resolution,
      String operatingSystem,
      String ipAddress,
      LocalDateTime loginTimestamp,
      String userName) {
    this.userAgent = userAgent;
    this.resolution = resolution;
    this.operatingSystem = operatingSystem;
    this.ipAddress = ipAddress;
    this.loginTimestamp = loginTimestamp;
    this.userName = userName;
  }

  /**
   * @return The value of the {@code userAgent} attribute
   */
  @JsonProperty("userAgent")
  @Override
  public String userAgent() {
    return userAgent;
  }

  /**
   * @return The value of the {@code resolution} attribute
   */
  @JsonProperty("resolution")
  @Override
  public String resolution() {
    return resolution;
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
   * @return The value of the {@code ipAddress} attribute
   */
  @JsonProperty("ipAddress")
  @Override
  public String ipAddress() {
    return ipAddress;
  }

  /**
   * @return The value of the {@code loginTimestamp} attribute
   */
  @JsonProperty("loginTimestamp")
  @Override
  public LocalDateTime loginTimestamp() {
    return loginTimestamp;
  }

  /**
   * @return The value of the {@code userName} attribute
   */
  @JsonProperty("userName")
  @Override
  public String userName() {
    return userName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserAgentInfo#userAgent() userAgent} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userAgent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserAgentInfo withUserAgent(String value) {
    if (this.userAgent.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userAgent");
    return new ImmutableUserAgentInfo(
        newValue,
        this.resolution,
        this.operatingSystem,
        this.ipAddress,
        this.loginTimestamp,
        this.userName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserAgentInfo#resolution() resolution} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resolution
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserAgentInfo withResolution(String value) {
    if (this.resolution.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "resolution");
    return new ImmutableUserAgentInfo(
        this.userAgent,
        newValue,
        this.operatingSystem,
        this.ipAddress,
        this.loginTimestamp,
        this.userName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserAgentInfo#operatingSystem() operatingSystem} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operatingSystem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserAgentInfo withOperatingSystem(String value) {
    if (this.operatingSystem.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "operatingSystem");
    return new ImmutableUserAgentInfo(this.userAgent, this.resolution, newValue, this.ipAddress, this.loginTimestamp, this.userName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserAgentInfo#ipAddress() ipAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ipAddress
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserAgentInfo withIpAddress(String value) {
    if (this.ipAddress.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "ipAddress");
    return new ImmutableUserAgentInfo(
        this.userAgent,
        this.resolution,
        this.operatingSystem,
        newValue,
        this.loginTimestamp,
        this.userName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserAgentInfo#loginTimestamp() loginTimestamp} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for loginTimestamp
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserAgentInfo withLoginTimestamp(LocalDateTime value) {
    if (this.loginTimestamp == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "loginTimestamp");
    return new ImmutableUserAgentInfo(this.userAgent, this.resolution, this.operatingSystem, this.ipAddress, newValue, this.userName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserAgentInfo#userName() userName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserAgentInfo withUserName(String value) {
    if (this.userName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userName");
    return new ImmutableUserAgentInfo(
        this.userAgent,
        this.resolution,
        this.operatingSystem,
        this.ipAddress,
        this.loginTimestamp,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserAgentInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserAgentInfo
        && equalTo((ImmutableUserAgentInfo) another);
  }

  private boolean equalTo(ImmutableUserAgentInfo another) {
    return userAgent.equals(another.userAgent)
        && resolution.equals(another.resolution)
        && operatingSystem.equals(another.operatingSystem)
        && ipAddress.equals(another.ipAddress)
        && loginTimestamp.equals(another.loginTimestamp)
        && userName.equals(another.userName);
  }

  /**
   * Computes a hash code from attributes: {@code userAgent}, {@code resolution}, {@code operatingSystem}, {@code ipAddress}, {@code loginTimestamp}, {@code userName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + userAgent.hashCode();
    h += (h << 5) + resolution.hashCode();
    h += (h << 5) + operatingSystem.hashCode();
    h += (h << 5) + ipAddress.hashCode();
    h += (h << 5) + loginTimestamp.hashCode();
    h += (h << 5) + userName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserAgentInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UserAgentInfo{"
        + "userAgent=" + userAgent
        + ", resolution=" + resolution
        + ", operatingSystem=" + operatingSystem
        + ", ipAddress=" + ipAddress
        + ", loginTimestamp=" + loginTimestamp
        + ", userName=" + userName
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UserAgentInfo {
    String userAgent;
    String resolution;
    String operatingSystem;
    String ipAddress;
    LocalDateTime loginTimestamp;
    String userName;
    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
    }
    @JsonProperty("resolution")
    public void setResolution(String resolution) {
      this.resolution = resolution;
    }
    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
    }
    @JsonProperty("loginTimestamp")
    public void setLoginTimestamp(LocalDateTime loginTimestamp) {
      this.loginTimestamp = loginTimestamp;
    }
    @JsonProperty("userName")
    public void setUserName(String userName) {
      this.userName = userName;
    }
    @Override
    public String userAgent() { throw new UnsupportedOperationException(); }
    @Override
    public String resolution() { throw new UnsupportedOperationException(); }
    @Override
    public String operatingSystem() { throw new UnsupportedOperationException(); }
    @Override
    public String ipAddress() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime loginTimestamp() { throw new UnsupportedOperationException(); }
    @Override
    public String userName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserAgentInfo fromJson(Json json) {
    ImmutableUserAgentInfo.Builder builder = ImmutableUserAgentInfo.builder();
    if (json.userAgent != null) {
      builder.userAgent(json.userAgent);
    }
    if (json.resolution != null) {
      builder.resolution(json.resolution);
    }
    if (json.operatingSystem != null) {
      builder.operatingSystem(json.operatingSystem);
    }
    if (json.ipAddress != null) {
      builder.ipAddress(json.ipAddress);
    }
    if (json.loginTimestamp != null) {
      builder.loginTimestamp(json.loginTimestamp);
    }
    if (json.userName != null) {
      builder.userName(json.userName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserAgentInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserAgentInfo instance
   */
  public static ImmutableUserAgentInfo copyOf(UserAgentInfo instance) {
    if (instance instanceof ImmutableUserAgentInfo) {
      return (ImmutableUserAgentInfo) instance;
    }
    return ImmutableUserAgentInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserAgentInfo ImmutableUserAgentInfo}.
   * @return A new ImmutableUserAgentInfo builder
   */
  public static ImmutableUserAgentInfo.Builder builder() {
    return new ImmutableUserAgentInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserAgentInfo ImmutableUserAgentInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_USER_AGENT = 0x1L;
    private static final long INIT_BIT_RESOLUTION = 0x2L;
    private static final long INIT_BIT_OPERATING_SYSTEM = 0x4L;
    private static final long INIT_BIT_IP_ADDRESS = 0x8L;
    private static final long INIT_BIT_LOGIN_TIMESTAMP = 0x10L;
    private static final long INIT_BIT_USER_NAME = 0x20L;
    private long initBits = 0x3fL;

    private String userAgent;
    private String resolution;
    private String operatingSystem;
    private String ipAddress;
    private LocalDateTime loginTimestamp;
    private String userName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.user_agent_info.UserAgentInfo} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UserAgentInfo instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.UserNameProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UserNameProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof UserAgentInfo) {
        UserAgentInfo instance = (UserAgentInfo) object;
        ipAddress(instance.ipAddress());
        userAgent(instance.userAgent());
        loginTimestamp(instance.loginTimestamp());
        resolution(instance.resolution());
        operatingSystem(instance.operatingSystem());
      }
      if (object instanceof UserNameProvider) {
        UserNameProvider instance = (UserNameProvider) object;
        userName(instance.userName());
      }
    }

    /**
     * Initializes the value for the {@link UserAgentInfo#userAgent() userAgent} attribute.
     * @param userAgent The value for userAgent 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userAgent")
    public final Builder userAgent(String userAgent) {
      this.userAgent = Objects.requireNonNull(userAgent, "userAgent");
      initBits &= ~INIT_BIT_USER_AGENT;
      return this;
    }

    /**
     * Initializes the value for the {@link UserAgentInfo#resolution() resolution} attribute.
     * @param resolution The value for resolution 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resolution")
    public final Builder resolution(String resolution) {
      this.resolution = Objects.requireNonNull(resolution, "resolution");
      initBits &= ~INIT_BIT_RESOLUTION;
      return this;
    }

    /**
     * Initializes the value for the {@link UserAgentInfo#operatingSystem() operatingSystem} attribute.
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
     * Initializes the value for the {@link UserAgentInfo#ipAddress() ipAddress} attribute.
     * @param ipAddress The value for ipAddress 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ipAddress")
    public final Builder ipAddress(String ipAddress) {
      this.ipAddress = Objects.requireNonNull(ipAddress, "ipAddress");
      initBits &= ~INIT_BIT_IP_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link UserAgentInfo#loginTimestamp() loginTimestamp} attribute.
     * @param loginTimestamp The value for loginTimestamp 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("loginTimestamp")
    public final Builder loginTimestamp(LocalDateTime loginTimestamp) {
      this.loginTimestamp = Objects.requireNonNull(loginTimestamp, "loginTimestamp");
      initBits &= ~INIT_BIT_LOGIN_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the value for the {@link UserAgentInfo#userName() userName} attribute.
     * @param userName The value for userName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userName")
    public final Builder userName(String userName) {
      this.userName = Objects.requireNonNull(userName, "userName");
      initBits &= ~INIT_BIT_USER_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserAgentInfo ImmutableUserAgentInfo}.
     * @return An immutable instance of UserAgentInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserAgentInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserAgentInfo(userAgent, resolution, operatingSystem, ipAddress, loginTimestamp, userName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_USER_AGENT) != 0) attributes.add("userAgent");
      if ((initBits & INIT_BIT_RESOLUTION) != 0) attributes.add("resolution");
      if ((initBits & INIT_BIT_OPERATING_SYSTEM) != 0) attributes.add("operatingSystem");
      if ((initBits & INIT_BIT_IP_ADDRESS) != 0) attributes.add("ipAddress");
      if ((initBits & INIT_BIT_LOGIN_TIMESTAMP) != 0) attributes.add("loginTimestamp");
      if ((initBits & INIT_BIT_USER_NAME) != 0) attributes.add("userName");
      return "Cannot build UserAgentInfo, some of required attributes are not set " + attributes;
    }
  }
}
