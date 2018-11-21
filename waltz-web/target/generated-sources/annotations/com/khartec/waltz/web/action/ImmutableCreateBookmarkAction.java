package com.khartec.waltz.web.action;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.bookmark.Bookmark;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link CreateBookmarkAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCreateBookmarkAction.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "CreateBookmarkAction"})
public final class ImmutableCreateBookmarkAction extends CreateBookmarkAction {
  private final Bookmark bookmark;

  private ImmutableCreateBookmarkAction(Bookmark bookmark) {
    this.bookmark = bookmark;
  }

  /**
   * @return The value of the {@code bookmark} attribute
   */
  @JsonProperty("bookmark")
  @Override
  Bookmark bookmark() {
    return bookmark;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CreateBookmarkAction#bookmark() bookmark} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bookmark
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCreateBookmarkAction withBookmark(Bookmark value) {
    if (this.bookmark == value) return this;
    Bookmark newValue = Objects.requireNonNull(value, "bookmark");
    return new ImmutableCreateBookmarkAction(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCreateBookmarkAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCreateBookmarkAction
        && equalTo((ImmutableCreateBookmarkAction) another);
  }

  private boolean equalTo(ImmutableCreateBookmarkAction another) {
    return bookmark.equals(another.bookmark);
  }

  /**
   * Computes a hash code from attributes: {@code bookmark}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + bookmark.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CreateBookmarkAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CreateBookmarkAction{"
        + "bookmark=" + bookmark
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends CreateBookmarkAction {
    Bookmark bookmark;
    @JsonProperty("bookmark")
    public void setBookmark(Bookmark bookmark) {
      this.bookmark = bookmark;
    }
    @Override
    Bookmark bookmark() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCreateBookmarkAction fromJson(Json json) {
    ImmutableCreateBookmarkAction.Builder builder = ImmutableCreateBookmarkAction.builder();
    if (json.bookmark != null) {
      builder.bookmark(json.bookmark);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CreateBookmarkAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CreateBookmarkAction instance
   */
  public static ImmutableCreateBookmarkAction copyOf(CreateBookmarkAction instance) {
    if (instance instanceof ImmutableCreateBookmarkAction) {
      return (ImmutableCreateBookmarkAction) instance;
    }
    return ImmutableCreateBookmarkAction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCreateBookmarkAction ImmutableCreateBookmarkAction}.
   * @return A new ImmutableCreateBookmarkAction builder
   */
  public static ImmutableCreateBookmarkAction.Builder builder() {
    return new ImmutableCreateBookmarkAction.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCreateBookmarkAction ImmutableCreateBookmarkAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_BOOKMARK = 0x1L;
    private long initBits = 0x1L;

    private Bookmark bookmark;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CreateBookmarkAction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CreateBookmarkAction instance) {
      Objects.requireNonNull(instance, "instance");
      bookmark(instance.bookmark());
      return this;
    }

    /**
     * Initializes the value for the {@link CreateBookmarkAction#bookmark() bookmark} attribute.
     * @param bookmark The value for bookmark 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bookmark")
    public final Builder bookmark(Bookmark bookmark) {
      this.bookmark = Objects.requireNonNull(bookmark, "bookmark");
      initBits &= ~INIT_BIT_BOOKMARK;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCreateBookmarkAction ImmutableCreateBookmarkAction}.
     * @return An immutable instance of CreateBookmarkAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCreateBookmarkAction build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCreateBookmarkAction(bookmark);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_BOOKMARK) != 0) attributes.add("bookmark");
      return "Cannot build CreateBookmarkAction, some of required attributes are not set " + attributes;
    }
  }
}
