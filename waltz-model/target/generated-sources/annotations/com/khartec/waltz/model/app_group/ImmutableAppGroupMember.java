package com.khartec.waltz.model.app_group;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppGroupMember}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppGroupMember.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppGroupMember"})
public final class ImmutableAppGroupMember extends AppGroupMember {
  private final long groupId;
  private final String userId;
  private final AppGroupMemberRole role;

  private ImmutableAppGroupMember(long groupId, String userId, AppGroupMemberRole role) {
    this.groupId = groupId;
    this.userId = userId;
    this.role = role;
  }

  /**
   * @return The value of the {@code groupId} attribute
   */
  @JsonProperty("groupId")
  @Override
  public long groupId() {
    return groupId;
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @JsonProperty("userId")
  @Override
  public String userId() {
    return userId;
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
   * Copy the current immutable object by setting a value for the {@link AppGroupMember#groupId() groupId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for groupId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroupMember withGroupId(long value) {
    if (this.groupId == value) return this;
    return new ImmutableAppGroupMember(value, this.userId, this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroupMember#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroupMember withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableAppGroupMember(this.groupId, newValue, this.role);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroupMember#role() role} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroupMember withRole(AppGroupMemberRole value) {
    if (this.role == value) return this;
    AppGroupMemberRole newValue = Objects.requireNonNull(value, "role");
    return new ImmutableAppGroupMember(this.groupId, this.userId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppGroupMember} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppGroupMember
        && equalTo((ImmutableAppGroupMember) another);
  }

  private boolean equalTo(ImmutableAppGroupMember another) {
    return groupId == another.groupId
        && userId.equals(another.userId)
        && role.equals(another.role);
  }

  /**
   * Computes a hash code from attributes: {@code groupId}, {@code userId}, {@code role}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Long.hashCode(groupId);
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + role.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AppGroupMember} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AppGroupMember{"
        + "groupId=" + groupId
        + ", userId=" + userId
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
  static final class Json extends AppGroupMember {
    long groupId;
    boolean groupIdIsSet;
    String userId;
    AppGroupMemberRole role;
    @JsonProperty("groupId")
    public void setGroupId(long groupId) {
      this.groupId = groupId;
      this.groupIdIsSet = true;
    }
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty("role")
    public void setRole(AppGroupMemberRole role) {
      this.role = role;
    }
    @Override
    public long groupId() { throw new UnsupportedOperationException(); }
    @Override
    public String userId() { throw new UnsupportedOperationException(); }
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
  static ImmutableAppGroupMember fromJson(Json json) {
    ImmutableAppGroupMember.Builder builder = ImmutableAppGroupMember.builder();
    if (json.groupIdIsSet) {
      builder.groupId(json.groupId);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.role != null) {
      builder.role(json.role);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppGroupMember} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppGroupMember instance
   */
  public static ImmutableAppGroupMember copyOf(AppGroupMember instance) {
    if (instance instanceof ImmutableAppGroupMember) {
      return (ImmutableAppGroupMember) instance;
    }
    return ImmutableAppGroupMember.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppGroupMember ImmutableAppGroupMember}.
   * @return A new ImmutableAppGroupMember builder
   */
  public static ImmutableAppGroupMember.Builder builder() {
    return new ImmutableAppGroupMember.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppGroupMember ImmutableAppGroupMember}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_GROUP_ID = 0x1L;
    private static final long INIT_BIT_USER_ID = 0x2L;
    private static final long INIT_BIT_ROLE = 0x4L;
    private long initBits = 0x7L;

    private long groupId;
    private String userId;
    private AppGroupMemberRole role;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppGroupMember} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppGroupMember instance) {
      Objects.requireNonNull(instance, "instance");
      groupId(instance.groupId());
      userId(instance.userId());
      role(instance.role());
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroupMember#groupId() groupId} attribute.
     * @param groupId The value for groupId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupId")
    public final Builder groupId(long groupId) {
      this.groupId = groupId;
      initBits &= ~INIT_BIT_GROUP_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroupMember#userId() userId} attribute.
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userId")
    public final Builder userId(String userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      initBits &= ~INIT_BIT_USER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroupMember#role() role} attribute.
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
     * Builds a new {@link ImmutableAppGroupMember ImmutableAppGroupMember}.
     * @return An immutable instance of AppGroupMember
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppGroupMember build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppGroupMember(groupId, userId, role);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_GROUP_ID) != 0) attributes.add("groupId");
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_ROLE) != 0) attributes.add("role");
      return "Cannot build AppGroupMember, some of required attributes are not set " + attributes;
    }
  }
}
