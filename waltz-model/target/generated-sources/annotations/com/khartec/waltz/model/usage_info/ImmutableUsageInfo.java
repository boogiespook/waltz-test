package com.khartec.waltz.model.usage_info;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link UsageInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUsageInfo.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "UsageInfo"})
public final class ImmutableUsageInfo extends UsageInfo {
  private final UsageKind kind;
  private final boolean isSelected;
  private final String description;

  private ImmutableUsageInfo(ImmutableUsageInfo.Builder builder) {
    this.kind = builder.kind;
    this.isSelected = builder.isSelected;
    this.description = builder.description != null
        ? builder.description
        : Objects.requireNonNull(super.description(), "description");
  }

  private ImmutableUsageInfo(UsageKind kind, boolean isSelected, String description) {
    this.kind = kind;
    this.isSelected = isSelected;
    this.description = description;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public UsageKind kind() {
    return kind;
  }

  /**
   * @return The value of the {@code isSelected} attribute
   */
  @JsonProperty("isSelected")
  @Override
  public boolean isSelected() {
    return isSelected;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UsageInfo#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUsageInfo withKind(UsageKind value) {
    if (this.kind == value) return this;
    UsageKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableUsageInfo(newValue, this.isSelected, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UsageInfo#isSelected() isSelected} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isSelected
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUsageInfo withIsSelected(boolean value) {
    if (this.isSelected == value) return this;
    return new ImmutableUsageInfo(this.kind, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UsageInfo#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUsageInfo withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "description");
    return new ImmutableUsageInfo(this.kind, this.isSelected, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUsageInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUsageInfo
        && equalTo((ImmutableUsageInfo) another);
  }

  private boolean equalTo(ImmutableUsageInfo another) {
    return kind.equals(another.kind)
        && isSelected == another.isSelected
        && description.equals(another.description);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code isSelected}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Boolean.hashCode(isSelected);
    h += (h << 5) + description.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UsageInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UsageInfo{"
        + "kind=" + kind
        + ", isSelected=" + isSelected
        + ", description=" + description
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UsageInfo {
    UsageKind kind;
    boolean isSelected;
    boolean isSelectedIsSet;
    String description;
    @JsonProperty("kind")
    public void setKind(UsageKind kind) {
      this.kind = kind;
    }
    @JsonProperty("isSelected")
    public void setIsSelected(boolean isSelected) {
      this.isSelected = isSelected;
      this.isSelectedIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
      this.description = description;
    }
    @Override
    public UsageKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isSelected() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUsageInfo fromJson(Json json) {
    ImmutableUsageInfo.Builder builder = ImmutableUsageInfo.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.isSelectedIsSet) {
      builder.isSelected(json.isSelected);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UsageInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UsageInfo instance
   */
  public static ImmutableUsageInfo copyOf(UsageInfo instance) {
    if (instance instanceof ImmutableUsageInfo) {
      return (ImmutableUsageInfo) instance;
    }
    return ImmutableUsageInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUsageInfo ImmutableUsageInfo}.
   * @return A new ImmutableUsageInfo builder
   */
  public static ImmutableUsageInfo.Builder builder() {
    return new ImmutableUsageInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUsageInfo ImmutableUsageInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_KIND = 0x1L;
    private static final long INIT_BIT_IS_SELECTED = 0x2L;
    private long initBits = 0x3L;

    private UsageKind kind;
    private boolean isSelected;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UsageInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UsageInfo instance) {
      Objects.requireNonNull(instance, "instance");
      kind(instance.kind());
      isSelected(instance.isSelected());
      description(instance.description());
      return this;
    }

    /**
     * Initializes the value for the {@link UsageInfo#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(UsageKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link UsageInfo#isSelected() isSelected} attribute.
     * @param isSelected The value for isSelected 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isSelected")
    public final Builder isSelected(boolean isSelected) {
      this.isSelected = isSelected;
      initBits &= ~INIT_BIT_IS_SELECTED;
      return this;
    }

    /**
     * Initializes the value for the {@link UsageInfo#description() description} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UsageInfo#description() description}.</em>
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      return this;
    }

    /**
     * Builds a new {@link ImmutableUsageInfo ImmutableUsageInfo}.
     * @return An immutable instance of UsageInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUsageInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUsageInfo(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      if ((initBits & INIT_BIT_IS_SELECTED) != 0) attributes.add("isSelected");
      return "Cannot build UsageInfo, some of required attributes are not set " + attributes;
    }
  }
}
