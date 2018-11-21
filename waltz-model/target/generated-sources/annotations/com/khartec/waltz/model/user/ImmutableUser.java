package com.khartec.waltz.model.user;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.UserNameProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link User}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUser.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "User"})
public final class ImmutableUser extends User {
  private final Set<Role> roles;
  private final String userName;

  private ImmutableUser(Set<Role> roles, String userName) {
    this.roles = roles;
    this.userName = userName;
  }

  /**
   * @return The value of the {@code roles} attribute
   */
  @JsonProperty("roles")
  @Override
  public Set<Role> roles() {
    return roles;
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
   * Copy the current immutable object with elements that replace the content of {@link User#roles() roles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withRoles(Role... elements) {
    Set<Role> newValue = createUnmodifiableEnumSet(Arrays.asList(elements));
    return new ImmutableUser(newValue, this.userName);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link User#roles() roles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of roles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withRoles(Iterable<Role> elements) {
    if (this.roles == elements) return this;
    Set<Role> newValue = createUnmodifiableEnumSet(elements);
    return new ImmutableUser(newValue, this.userName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#userName() userName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withUserName(String value) {
    if (this.userName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userName");
    return new ImmutableUser(this.roles, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUser
        && equalTo((ImmutableUser) another);
  }

  private boolean equalTo(ImmutableUser another) {
    return roles.equals(another.roles)
        && userName.equals(another.userName);
  }

  /**
   * Computes a hash code from attributes: {@code roles}, {@code userName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + roles.hashCode();
    h += (h << 5) + userName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code User} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "User{"
        + "roles=" + roles
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
  static final class Json extends User {
    Set<Role> roles = Collections.emptySet();
    String userName;
    @JsonProperty("roles")
    public void setRoles(Set<Role> roles) {
      this.roles = roles;
    }
    @JsonProperty("userName")
    public void setUserName(String userName) {
      this.userName = userName;
    }
    @Override
    public Set<Role> roles() { throw new UnsupportedOperationException(); }
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
  static ImmutableUser fromJson(Json json) {
    ImmutableUser.Builder builder = ImmutableUser.builder();
    if (json.roles != null) {
      builder.addAllRoles(json.roles);
    }
    if (json.userName != null) {
      builder.userName(json.userName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link User} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable User instance
   */
  public static ImmutableUser copyOf(User instance) {
    if (instance instanceof ImmutableUser) {
      return (ImmutableUser) instance;
    }
    return ImmutableUser.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUser ImmutableUser}.
   * @return A new ImmutableUser builder
   */
  public static ImmutableUser.Builder builder() {
    return new ImmutableUser.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUser ImmutableUser}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_USER_NAME = 0x1L;
    private long initBits = 0x1L;

    private EnumSet<Role> roles = EnumSet.noneOf(Role.class);
    private String userName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.user.User} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(User instance) {
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
      if (object instanceof User) {
        User instance = (User) object;
        addAllRoles(instance.roles());
      }
      if (object instanceof UserNameProvider) {
        UserNameProvider instance = (UserNameProvider) object;
        userName(instance.userName());
      }
    }

    /**
     * Adds one element to {@link User#roles() roles} set.
     * @param element A roles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(Role element) {
      this.roles.add(Objects.requireNonNull(element, "roles element"));
      return this;
    }

    /**
     * Adds elements to {@link User#roles() roles} set.
     * @param elements An array of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(Role... elements) {
      for (Role element : elements) {
        this.roles.add(Objects.requireNonNull(element, "roles element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link User#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("roles")
    public final Builder roles(Iterable<Role> elements) {
      this.roles.clear();
      return addAllRoles(elements);
    }

    /**
     * Adds elements to {@link User#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(Iterable<Role> elements) {
      for (Role element : elements) {
        this.roles.add(Objects.requireNonNull(element, "roles element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link User#userName() userName} attribute.
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
     * Builds a new {@link ImmutableUser ImmutableUser}.
     * @return An immutable instance of User
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUser build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUser(createUnmodifiableEnumSet(roles), userName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_USER_NAME) != 0) attributes.add("userName");
      return "Cannot build User, some of required attributes are not set " + attributes;
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

  private static <T extends Enum<T>> Set<T> createUnmodifiableEnumSet(Iterable<T> iterable) {
    if (iterable instanceof EnumSet<?>) {
      return Collections.unmodifiableSet(EnumSet.copyOf((EnumSet<T>) iterable));
    }
    List<T> list = createSafeList(iterable, true, false);
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default: return Collections.unmodifiableSet(EnumSet.copyOf(list));
    }
  }
}
