package com.khartec.waltz.service.app_group;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.app_group.AppGroup;
import com.khartec.waltz.model.app_group.AppGroupMemberRole;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppGroupSubscription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppGroupSubscription.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppGroupSubscription"})
public final class ImmutableAppGroupSubscription
    extends AppGroupSubscription {
  private final AppGroup appGroup;
  private final AppGroupMemberRole role;

  private ImmutableAppGroupSubscription(
      AppGroup appGroup,
      AppGroupMemberRole role) {
    this.appGroup = appGroup;
    this.role = role;
  }

  /**
   * @return The value of the {@code appGroup} attribute
   */
  @JsonProperty("appGroup")
  @Override
  public AppGroup appGroup() {
    return appGroup;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public AppGroupMemberRole role() {
    return role;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroupSubscription#appGroup() appGroup} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appGroup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroupSubscription withAppGroup(AppGroup value) {
    if (this.appGroup == value) return this;
    AppGroup newValue = Objects.requireNonNull(value, "appGroup");
    return new ImmutableAppGroupSubscription(newValue, this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroupSubscription#role() role} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroupSubscription withRole(AppGroupMemberRole value) {
    if (this.role == value) return this;
    AppGroupMemberRole newValue = Objects.requireNonNull(value, "role");
    return new ImmutableAppGroupSubscription(this.appGroup, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppGroupSubscription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppGroupSubscription
        && equalTo((ImmutableAppGroupSubscription) another);
  }

  private boolean equalTo(ImmutableAppGroupSubscription another) {
    return appGroup.equals(another.appGroup)
        && role.equals(another.role);
  }

  /**
   * Computes a hash code from attributes: {@code appGroup}, {@code role}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + appGroup.hashCode();
    h += (h << 5) + role.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AppGroupSubscription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AppGroupSubscription{"
        + "appGroup=" + appGroup
        + ", role=" + role
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppGroupSubscription {
    AppGroup appGroup;
    AppGroupMemberRole role;
    @JsonProperty("appGroup")
    public void setAppGroup(AppGroup appGroup) {
      this.appGroup = appGroup;
    }
    @JsonProperty("role")
    public void setRole(AppGroupMemberRole role) {
      this.role = role;
    }
    @Override
    public AppGroup appGroup() { throw new UnsupportedOperationException(); }
    @Override
    public AppGroupMemberRole role() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppGroupSubscription fromJson(Json json) {
    ImmutableAppGroupSubscription.Builder builder = ImmutableAppGroupSubscription.builder();
    if (json.appGroup != null) {
      builder.appGroup(json.appGroup);
    }
    if (json.role != null) {
      builder.role(json.role);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppGroupSubscription} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppGroupSubscription instance
   */
  public static ImmutableAppGroupSubscription copyOf(AppGroupSubscription instance) {
    if (instance instanceof ImmutableAppGroupSubscription) {
      return (ImmutableAppGroupSubscription) instance;
    }
    return ImmutableAppGroupSubscription.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppGroupSubscription ImmutableAppGroupSubscription}.
   * @return A new ImmutableAppGroupSubscription builder
   */
  public static ImmutableAppGroupSubscription.Builder builder() {
    return new ImmutableAppGroupSubscription.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppGroupSubscription ImmutableAppGroupSubscription}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APP_GROUP = 0x1L;
    private static final long INIT_BIT_ROLE = 0x2L;
    private long initBits = 0x3L;

    private AppGroup appGroup;
    private AppGroupMemberRole role;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppGroupSubscription} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppGroupSubscription instance) {
      Objects.requireNonNull(instance, "instance");
      appGroup(instance.appGroup());
      role(instance.role());
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroupSubscription#appGroup() appGroup} attribute.
     * @param appGroup The value for appGroup 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appGroup")
    public final Builder appGroup(AppGroup appGroup) {
      this.appGroup = Objects.requireNonNull(appGroup, "appGroup");
      initBits &= ~INIT_BIT_APP_GROUP;
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroupSubscription#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(AppGroupMemberRole role) {
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppGroupSubscription ImmutableAppGroupSubscription}.
     * @return An immutable instance of AppGroupSubscription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppGroupSubscription build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppGroupSubscription(appGroup, role);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APP_GROUP) != 0) attributes.add("appGroup");
      if ((initBits & INIT_BIT_ROLE) != 0) attributes.add("role");
      return "Cannot build AppGroupSubscription, some of required attributes are not set " + attributes;
    }
  }
}
