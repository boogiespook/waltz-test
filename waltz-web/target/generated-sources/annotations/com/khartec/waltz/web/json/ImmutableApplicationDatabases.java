package com.khartec.waltz.web.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.database_information.DatabaseInformation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ApplicationDatabases}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableApplicationDatabases.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ApplicationDatabases"})
public final class ImmutableApplicationDatabases extends ApplicationDatabases {
  private final Long applicationId;
  private final List<DatabaseInformation> databases;

  private ImmutableApplicationDatabases(
      Long applicationId,
      List<DatabaseInformation> databases) {
    this.applicationId = applicationId;
    this.databases = databases;
  }

  /**
   * @return The value of the {@code applicationId} attribute
   */
  @JsonProperty("applicationId")
  @Override
  public Long applicationId() {
    return applicationId;
  }

  /**
   * @return The value of the {@code databases} attribute
   */
  @JsonProperty("databases")
  @Override
  public List<DatabaseInformation> databases() {
    return databases;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApplicationDatabases#applicationId() applicationId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplicationDatabases withApplicationId(Long value) {
    if (this.applicationId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "applicationId");
    return new ImmutableApplicationDatabases(newValue, this.databases);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ApplicationDatabases#databases() databases}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplicationDatabases withDatabases(DatabaseInformation... elements) {
    List<DatabaseInformation> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableApplicationDatabases(this.applicationId, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ApplicationDatabases#databases() databases}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of databases elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableApplicationDatabases withDatabases(Iterable<? extends DatabaseInformation> elements) {
    if (this.databases == elements) return this;
    List<DatabaseInformation> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableApplicationDatabases(this.applicationId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableApplicationDatabases} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableApplicationDatabases
        && equalTo((ImmutableApplicationDatabases) another);
  }

  private boolean equalTo(ImmutableApplicationDatabases another) {
    return applicationId.equals(another.applicationId)
        && databases.equals(another.databases);
  }

  /**
   * Computes a hash code from attributes: {@code applicationId}, {@code databases}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + applicationId.hashCode();
    h += (h << 5) + databases.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ApplicationDatabases} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ApplicationDatabases{"
        + "applicationId=" + applicationId
        + ", databases=" + databases
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ApplicationDatabases {
    Long applicationId;
    List<DatabaseInformation> databases = Collections.emptyList();
    @JsonProperty("applicationId")
    public void setApplicationId(Long applicationId) {
      this.applicationId = applicationId;
    }
    @JsonProperty("databases")
    public void setDatabases(List<DatabaseInformation> databases) {
      this.databases = databases;
    }
    @Override
    public Long applicationId() { throw new UnsupportedOperationException(); }
    @Override
    public List<DatabaseInformation> databases() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableApplicationDatabases fromJson(Json json) {
    ImmutableApplicationDatabases.Builder builder = ImmutableApplicationDatabases.builder();
    if (json.applicationId != null) {
      builder.applicationId(json.applicationId);
    }
    if (json.databases != null) {
      builder.addAllDatabases(json.databases);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ApplicationDatabases} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ApplicationDatabases instance
   */
  public static ImmutableApplicationDatabases copyOf(ApplicationDatabases instance) {
    if (instance instanceof ImmutableApplicationDatabases) {
      return (ImmutableApplicationDatabases) instance;
    }
    return ImmutableApplicationDatabases.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableApplicationDatabases ImmutableApplicationDatabases}.
   * @return A new ImmutableApplicationDatabases builder
   */
  public static ImmutableApplicationDatabases.Builder builder() {
    return new ImmutableApplicationDatabases.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableApplicationDatabases ImmutableApplicationDatabases}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APPLICATION_ID = 0x1L;
    private long initBits = 0x1L;

    private Long applicationId;
    private List<DatabaseInformation> databases = new ArrayList<DatabaseInformation>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ApplicationDatabases} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ApplicationDatabases instance) {
      Objects.requireNonNull(instance, "instance");
      applicationId(instance.applicationId());
      addAllDatabases(instance.databases());
      return this;
    }

    /**
     * Initializes the value for the {@link ApplicationDatabases#applicationId() applicationId} attribute.
     * @param applicationId The value for applicationId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationId")
    public final Builder applicationId(Long applicationId) {
      this.applicationId = Objects.requireNonNull(applicationId, "applicationId");
      initBits &= ~INIT_BIT_APPLICATION_ID;
      return this;
    }

    /**
     * Adds one element to {@link ApplicationDatabases#databases() databases} list.
     * @param element A databases element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDatabases(DatabaseInformation element) {
      this.databases.add(Objects.requireNonNull(element, "databases element"));
      return this;
    }

    /**
     * Adds elements to {@link ApplicationDatabases#databases() databases} list.
     * @param elements An array of databases elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDatabases(DatabaseInformation... elements) {
      for (DatabaseInformation element : elements) {
        this.databases.add(Objects.requireNonNull(element, "databases element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ApplicationDatabases#databases() databases} list.
     * @param elements An iterable of databases elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("databases")
    public final Builder databases(Iterable<? extends DatabaseInformation> elements) {
      this.databases.clear();
      return addAllDatabases(elements);
    }

    /**
     * Adds elements to {@link ApplicationDatabases#databases() databases} list.
     * @param elements An iterable of databases elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDatabases(Iterable<? extends DatabaseInformation> elements) {
      for (DatabaseInformation element : elements) {
        this.databases.add(Objects.requireNonNull(element, "databases element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableApplicationDatabases ImmutableApplicationDatabases}.
     * @return An immutable instance of ApplicationDatabases
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableApplicationDatabases build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableApplicationDatabases(applicationId, createUnmodifiableList(true, databases));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APPLICATION_ID) != 0) attributes.add("applicationId");
      return "Cannot build ApplicationDatabases, some of required attributes are not set " + attributes;
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
