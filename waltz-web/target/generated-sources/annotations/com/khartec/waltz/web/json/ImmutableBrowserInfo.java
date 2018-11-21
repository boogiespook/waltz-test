package com.khartec.waltz.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link BrowserInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBrowserInfo.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "BrowserInfo"})
public final class ImmutableBrowserInfo extends BrowserInfo {
  private final String operatingSystem;
  private final String resolution;

  private ImmutableBrowserInfo(String operatingSystem, String resolution) {
    this.operatingSystem = operatingSystem;
    this.resolution = resolution;
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
   * @return The value of the {@code resolution} attribute
   */
  @JsonProperty("resolution")
  @Override
  public String resolution() {
    return resolution;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BrowserInfo#operatingSystem() operatingSystem} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operatingSystem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBrowserInfo withOperatingSystem(String value) {
    if (this.operatingSystem.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "operatingSystem");
    return new ImmutableBrowserInfo(newValue, this.resolution);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BrowserInfo#resolution() resolution} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resolution
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBrowserInfo withResolution(String value) {
    if (this.resolution.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "resolution");
    return new ImmutableBrowserInfo(this.operatingSystem, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBrowserInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBrowserInfo
        && equalTo((ImmutableBrowserInfo) another);
  }

  private boolean equalTo(ImmutableBrowserInfo another) {
    return operatingSystem.equals(another.operatingSystem)
        && resolution.equals(another.resolution);
  }

  /**
   * Computes a hash code from attributes: {@code operatingSystem}, {@code resolution}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + operatingSystem.hashCode();
    h += (h << 5) + resolution.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BrowserInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "BrowserInfo{"
        + "operatingSystem=" + operatingSystem
        + ", resolution=" + resolution
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends BrowserInfo {
    String operatingSystem;
    String resolution;
    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    @JsonProperty("resolution")
    public void setResolution(String resolution) {
      this.resolution = resolution;
    }
    @Override
    public String operatingSystem() { throw new UnsupportedOperationException(); }
    @Override
    public String resolution() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBrowserInfo fromJson(Json json) {
    ImmutableBrowserInfo.Builder builder = ImmutableBrowserInfo.builder();
    if (json.operatingSystem != null) {
      builder.operatingSystem(json.operatingSystem);
    }
    if (json.resolution != null) {
      builder.resolution(json.resolution);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link BrowserInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BrowserInfo instance
   */
  public static ImmutableBrowserInfo copyOf(BrowserInfo instance) {
    if (instance instanceof ImmutableBrowserInfo) {
      return (ImmutableBrowserInfo) instance;
    }
    return ImmutableBrowserInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBrowserInfo ImmutableBrowserInfo}.
   * @return A new ImmutableBrowserInfo builder
   */
  public static ImmutableBrowserInfo.Builder builder() {
    return new ImmutableBrowserInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBrowserInfo ImmutableBrowserInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_OPERATING_SYSTEM = 0x1L;
    private static final long INIT_BIT_RESOLUTION = 0x2L;
    private long initBits = 0x3L;

    private String operatingSystem;
    private String resolution;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BrowserInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BrowserInfo instance) {
      Objects.requireNonNull(instance, "instance");
      operatingSystem(instance.operatingSystem());
      resolution(instance.resolution());
      return this;
    }

    /**
     * Initializes the value for the {@link BrowserInfo#operatingSystem() operatingSystem} attribute.
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
     * Initializes the value for the {@link BrowserInfo#resolution() resolution} attribute.
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
     * Builds a new {@link ImmutableBrowserInfo ImmutableBrowserInfo}.
     * @return An immutable instance of BrowserInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBrowserInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBrowserInfo(operatingSystem, resolution);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_OPERATING_SYSTEM) != 0) attributes.add("operatingSystem");
      if ((initBits & INIT_BIT_RESOLUTION) != 0) attributes.add("resolution");
      return "Cannot build BrowserInfo, some of required attributes are not set " + attributes;
    }
  }
}
