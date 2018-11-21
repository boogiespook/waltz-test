package com.khartec.waltz.model.app_group;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppGroupDetail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppGroupDetail.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppGroupDetail"})
public final class ImmutableAppGroupDetail extends AppGroupDetail {
  private final AppGroup appGroup;
  private final List<AppGroupMember> members;
  private final List<EntityReference> applications;

  private ImmutableAppGroupDetail(
      AppGroup appGroup,
      List<AppGroupMember> members,
      List<EntityReference> applications) {
    this.appGroup = appGroup;
    this.members = members;
    this.applications = applications;
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
   * @return The value of the {@code members} attribute
   */
  @JsonProperty("members")
  @Override
  public List<AppGroupMember> members() {
    return members;
  }

  /**
   * @return The value of the {@code applications} attribute
   */
  @JsonProperty("applications")
  @Override
  public List<EntityReference> applications() {
    return applications;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppGroupDetail#appGroup() appGroup} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appGroup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppGroupDetail withAppGroup(AppGroup value) {
    if (this.appGroup == value) return this;
    AppGroup newValue = Objects.requireNonNull(value, "appGroup");
    return new ImmutableAppGroupDetail(newValue, this.members, this.applications);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppGroupDetail#members() members}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroupDetail withMembers(AppGroupMember... elements) {
    List<AppGroupMember> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppGroupDetail(this.appGroup, newValue, this.applications);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppGroupDetail#members() members}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of members elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroupDetail withMembers(Iterable<? extends AppGroupMember> elements) {
    if (this.members == elements) return this;
    List<AppGroupMember> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppGroupDetail(this.appGroup, newValue, this.applications);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppGroupDetail#applications() applications}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroupDetail withApplications(EntityReference... elements) {
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppGroupDetail(this.appGroup, this.members, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppGroupDetail#applications() applications}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of applications elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppGroupDetail withApplications(Iterable<? extends EntityReference> elements) {
    if (this.applications == elements) return this;
    List<EntityReference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppGroupDetail(this.appGroup, this.members, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppGroupDetail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppGroupDetail
        && equalTo((ImmutableAppGroupDetail) another);
  }

  private boolean equalTo(ImmutableAppGroupDetail another) {
    return appGroup.equals(another.appGroup)
        && members.equals(another.members)
        && applications.equals(another.applications);
  }

  /**
   * Computes a hash code from attributes: {@code appGroup}, {@code members}, {@code applications}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + appGroup.hashCode();
    h += (h << 5) + members.hashCode();
    h += (h << 5) + applications.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AppGroupDetail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AppGroupDetail{"
        + "appGroup=" + appGroup
        + ", members=" + members
        + ", applications=" + applications
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppGroupDetail {
    AppGroup appGroup;
    List<AppGroupMember> members = Collections.emptyList();
    List<EntityReference> applications = Collections.emptyList();
    @JsonProperty("appGroup")
    public void setAppGroup(AppGroup appGroup) {
      this.appGroup = appGroup;
    }
    @JsonProperty("members")
    public void setMembers(List<AppGroupMember> members) {
      this.members = members;
    }
    @JsonProperty("applications")
    public void setApplications(List<EntityReference> applications) {
      this.applications = applications;
    }
    @Override
    public AppGroup appGroup() { throw new UnsupportedOperationException(); }
    @Override
    public List<AppGroupMember> members() { throw new UnsupportedOperationException(); }
    @Override
    public List<EntityReference> applications() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppGroupDetail fromJson(Json json) {
    ImmutableAppGroupDetail.Builder builder = ImmutableAppGroupDetail.builder();
    if (json.appGroup != null) {
      builder.appGroup(json.appGroup);
    }
    if (json.members != null) {
      builder.addAllMembers(json.members);
    }
    if (json.applications != null) {
      builder.addAllApplications(json.applications);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppGroupDetail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppGroupDetail instance
   */
  public static ImmutableAppGroupDetail copyOf(AppGroupDetail instance) {
    if (instance instanceof ImmutableAppGroupDetail) {
      return (ImmutableAppGroupDetail) instance;
    }
    return ImmutableAppGroupDetail.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppGroupDetail ImmutableAppGroupDetail}.
   * @return A new ImmutableAppGroupDetail builder
   */
  public static ImmutableAppGroupDetail.Builder builder() {
    return new ImmutableAppGroupDetail.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppGroupDetail ImmutableAppGroupDetail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APP_GROUP = 0x1L;
    private long initBits = 0x1L;

    private AppGroup appGroup;
    private List<AppGroupMember> members = new ArrayList<AppGroupMember>();
    private List<EntityReference> applications = new ArrayList<EntityReference>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppGroupDetail} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppGroupDetail instance) {
      Objects.requireNonNull(instance, "instance");
      appGroup(instance.appGroup());
      addAllMembers(instance.members());
      addAllApplications(instance.applications());
      return this;
    }

    /**
     * Initializes the value for the {@link AppGroupDetail#appGroup() appGroup} attribute.
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
     * Adds one element to {@link AppGroupDetail#members() members} list.
     * @param element A members element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMembers(AppGroupMember element) {
      this.members.add(Objects.requireNonNull(element, "members element"));
      return this;
    }

    /**
     * Adds elements to {@link AppGroupDetail#members() members} list.
     * @param elements An array of members elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMembers(AppGroupMember... elements) {
      for (AppGroupMember element : elements) {
        this.members.add(Objects.requireNonNull(element, "members element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppGroupDetail#members() members} list.
     * @param elements An iterable of members elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("members")
    public final Builder members(Iterable<? extends AppGroupMember> elements) {
      this.members.clear();
      return addAllMembers(elements);
    }

    /**
     * Adds elements to {@link AppGroupDetail#members() members} list.
     * @param elements An iterable of members elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMembers(Iterable<? extends AppGroupMember> elements) {
      for (AppGroupMember element : elements) {
        this.members.add(Objects.requireNonNull(element, "members element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link AppGroupDetail#applications() applications} list.
     * @param element A applications element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addApplications(EntityReference element) {
      this.applications.add(Objects.requireNonNull(element, "applications element"));
      return this;
    }

    /**
     * Adds elements to {@link AppGroupDetail#applications() applications} list.
     * @param elements An array of applications elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addApplications(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.applications.add(Objects.requireNonNull(element, "applications element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppGroupDetail#applications() applications} list.
     * @param elements An iterable of applications elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applications")
    public final Builder applications(Iterable<? extends EntityReference> elements) {
      this.applications.clear();
      return addAllApplications(elements);
    }

    /**
     * Adds elements to {@link AppGroupDetail#applications() applications} list.
     * @param elements An iterable of applications elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllApplications(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.applications.add(Objects.requireNonNull(element, "applications element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppGroupDetail ImmutableAppGroupDetail}.
     * @return An immutable instance of AppGroupDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppGroupDetail build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppGroupDetail(appGroup, createUnmodifiableList(true, members), createUnmodifiableList(true, applications));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APP_GROUP) != 0) attributes.add("appGroup");
      return "Cannot build AppGroupDetail, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
