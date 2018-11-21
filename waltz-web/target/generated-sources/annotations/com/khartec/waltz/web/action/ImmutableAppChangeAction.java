package com.khartec.waltz.web.action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.application.Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppChangeAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppChangeAction.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppChangeAction"})
public final class ImmutableAppChangeAction extends AppChangeAction {
  private final Application app;
  private final List<FieldChange> changes;

  private ImmutableAppChangeAction(
      Application app,
      List<FieldChange> changes) {
    this.app = app;
    this.changes = changes;
  }

  /**
   * @return The value of the {@code app} attribute
   */
  @JsonProperty("app")
  @Override
  public Application app() {
    return app;
  }

  /**
   * @return The value of the {@code changes} attribute
   */
  @JsonProperty("changes")
  @Override
  public List<FieldChange> changes() {
    return changes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppChangeAction#app() app} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for app
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppChangeAction withApp(Application value) {
    if (this.app == value) return this;
    Application newValue = Objects.requireNonNull(value, "app");
    return new ImmutableAppChangeAction(newValue, this.changes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppChangeAction#changes() changes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppChangeAction withChanges(FieldChange... elements) {
    List<FieldChange> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppChangeAction(this.app, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppChangeAction#changes() changes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of changes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppChangeAction withChanges(Iterable<? extends FieldChange> elements) {
    if (this.changes == elements) return this;
    List<FieldChange> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppChangeAction(this.app, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppChangeAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppChangeAction
        && equalTo((ImmutableAppChangeAction) another);
  }

  private boolean equalTo(ImmutableAppChangeAction another) {
    return app.equals(another.app)
        && changes.equals(another.changes);
  }

  /**
   * Computes a hash code from attributes: {@code app}, {@code changes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + app.hashCode();
    h += (h << 5) + changes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AppChangeAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AppChangeAction{"
        + "app=" + app
        + ", changes=" + changes
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppChangeAction {
    Application app;
    List<FieldChange> changes = Collections.emptyList();
    @JsonProperty("app")
    public void setApp(Application app) {
      this.app = app;
    }
    @JsonProperty("changes")
    public void setChanges(List<FieldChange> changes) {
      this.changes = changes;
    }
    @Override
    public Application app() { throw new UnsupportedOperationException(); }
    @Override
    public List<FieldChange> changes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppChangeAction fromJson(Json json) {
    ImmutableAppChangeAction.Builder builder = ImmutableAppChangeAction.builder();
    if (json.app != null) {
      builder.app(json.app);
    }
    if (json.changes != null) {
      builder.addAllChanges(json.changes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppChangeAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppChangeAction instance
   */
  public static ImmutableAppChangeAction copyOf(AppChangeAction instance) {
    if (instance instanceof ImmutableAppChangeAction) {
      return (ImmutableAppChangeAction) instance;
    }
    return ImmutableAppChangeAction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppChangeAction ImmutableAppChangeAction}.
   * @return A new ImmutableAppChangeAction builder
   */
  public static ImmutableAppChangeAction.Builder builder() {
    return new ImmutableAppChangeAction.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppChangeAction ImmutableAppChangeAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APP = 0x1L;
    private long initBits = 0x1L;

    private Application app;
    private List<FieldChange> changes = new ArrayList<FieldChange>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppChangeAction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppChangeAction instance) {
      Objects.requireNonNull(instance, "instance");
      app(instance.app());
      addAllChanges(instance.changes());
      return this;
    }

    /**
     * Initializes the value for the {@link AppChangeAction#app() app} attribute.
     * @param app The value for app 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("app")
    public final Builder app(Application app) {
      this.app = Objects.requireNonNull(app, "app");
      initBits &= ~INIT_BIT_APP;
      return this;
    }

    /**
     * Adds one element to {@link AppChangeAction#changes() changes} list.
     * @param element A changes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChanges(FieldChange element) {
      this.changes.add(Objects.requireNonNull(element, "changes element"));
      return this;
    }

    /**
     * Adds elements to {@link AppChangeAction#changes() changes} list.
     * @param elements An array of changes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChanges(FieldChange... elements) {
      for (FieldChange element : elements) {
        this.changes.add(Objects.requireNonNull(element, "changes element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppChangeAction#changes() changes} list.
     * @param elements An iterable of changes elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("changes")
    public final Builder changes(Iterable<? extends FieldChange> elements) {
      this.changes.clear();
      return addAllChanges(elements);
    }

    /**
     * Adds elements to {@link AppChangeAction#changes() changes} list.
     * @param elements An iterable of changes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllChanges(Iterable<? extends FieldChange> elements) {
      for (FieldChange element : elements) {
        this.changes.add(Objects.requireNonNull(element, "changes element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppChangeAction ImmutableAppChangeAction}.
     * @return An immutable instance of AppChangeAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppChangeAction build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppChangeAction(app, createUnmodifiableList(true, changes));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APP) != 0) attributes.add("app");
      return "Cannot build AppChangeAction, some of required attributes are not set " + attributes;
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
