package com.khartec.waltz.model.staticpanel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link StaticPanel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStaticPanel.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "StaticPanel"})
public final class ImmutableStaticPanel extends StaticPanel {
  private final String title;
  private final String icon;
  private final String group;
  private final String content;
  private final int priority;
  private final int width;
  private final ContentKind encoding;
  private final Long id;

  private ImmutableStaticPanel(ImmutableStaticPanel.Builder builder) {
    this.title = builder.title;
    this.icon = builder.icon;
    this.group = builder.group;
    this.content = builder.content;
    this.priority = builder.priority;
    this.id = builder.id;
    if (builder.widthIsSet()) {
      initShim.width(builder.width);
    }
    if (builder.encoding != null) {
      initShim.encoding(builder.encoding);
    }
    this.width = initShim.width();
    this.encoding = initShim.encoding();
    this.initShim = null;
  }

  private ImmutableStaticPanel(
      String title,
      String icon,
      String group,
      String content,
      int priority,
      int width,
      ContentKind encoding,
      Long id) {
    this.title = title;
    this.icon = icon;
    this.group = group;
    this.content = content;
    this.priority = priority;
    this.width = width;
    this.encoding = encoding;
    this.id = id;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private int width;
    private int widthBuildStage;

    int width() {
      if (widthBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (widthBuildStage == STAGE_UNINITIALIZED) {
        widthBuildStage = STAGE_INITIALIZING;
        this.width = ImmutableStaticPanel.super.width();
        widthBuildStage = STAGE_INITIALIZED;
      }
      return this.width;
    }

    void width(int width) {
      this.width = width;
      widthBuildStage = STAGE_INITIALIZED;
    }
    private ContentKind encoding;
    private int encodingBuildStage;

    ContentKind encoding() {
      if (encodingBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (encodingBuildStage == STAGE_UNINITIALIZED) {
        encodingBuildStage = STAGE_INITIALIZING;
        this.encoding = Objects.requireNonNull(ImmutableStaticPanel.super.encoding(), "encoding");
        encodingBuildStage = STAGE_INITIALIZED;
      }
      return this.encoding;
    }

    void encoding(ContentKind encoding) {
      this.encoding = encoding;
      encodingBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (widthBuildStage == STAGE_INITIALIZING) attributes.add("width");
      if (encodingBuildStage == STAGE_INITIALIZING) attributes.add("encoding");
      return "Cannot build StaticPanel, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public String title() {
    return title;
  }

  /**
   * @return The value of the {@code icon} attribute
   */
  @JsonProperty("icon")
  @Override
  public String icon() {
    return icon;
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public String group() {
    return group;
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @JsonProperty("content")
  @Override
  public String content() {
    return content;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public int priority() {
    return priority;
  }

  /**
   * @return The value of the {@code width} attribute
   */
  @JsonProperty("width")
  @Override
  public int width() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.width()
        : this.width;
  }

  /**
   * @return The value of the {@code encoding} attribute
   */
  @JsonProperty("encoding")
  @Override
  public ContentKind encoding() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.encoding()
        : this.encoding;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Long> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#title() title} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for title
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withTitle(String value) {
    if (this.title.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "title");
    return new ImmutableStaticPanel(
        newValue,
        this.icon,
        this.group,
        this.content,
        this.priority,
        this.width,
        this.encoding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#icon() icon} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for icon
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withIcon(String value) {
    if (this.icon.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "icon");
    return new ImmutableStaticPanel(
        this.title,
        newValue,
        this.group,
        this.content,
        this.priority,
        this.width,
        this.encoding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#group() group} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for group
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withGroup(String value) {
    if (this.group.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "group");
    return new ImmutableStaticPanel(
        this.title,
        this.icon,
        newValue,
        this.content,
        this.priority,
        this.width,
        this.encoding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#content() content} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for content
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withContent(String value) {
    if (this.content.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "content");
    return new ImmutableStaticPanel(this.title, this.icon, this.group, newValue, this.priority, this.width, this.encoding, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#priority() priority} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for priority
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withPriority(int value) {
    if (this.priority == value) return this;
    return new ImmutableStaticPanel(this.title, this.icon, this.group, this.content, value, this.width, this.encoding, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#width() width} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for width
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withWidth(int value) {
    if (this.width == value) return this;
    return new ImmutableStaticPanel(this.title, this.icon, this.group, this.content, this.priority, value, this.encoding, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StaticPanel#encoding() encoding} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for encoding
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStaticPanel withEncoding(ContentKind value) {
    if (this.encoding == value) return this;
    ContentKind newValue = Objects.requireNonNull(value, "encoding");
    return new ImmutableStaticPanel(this.title, this.icon, this.group, this.content, this.priority, this.width, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StaticPanel#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStaticPanel withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStaticPanel(
        this.title,
        this.icon,
        this.group,
        this.content,
        this.priority,
        this.width,
        this.encoding,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StaticPanel#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStaticPanel withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStaticPanel(
        this.title,
        this.icon,
        this.group,
        this.content,
        this.priority,
        this.width,
        this.encoding,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStaticPanel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStaticPanel
        && equalTo((ImmutableStaticPanel) another);
  }

  private boolean equalTo(ImmutableStaticPanel another) {
    return title.equals(another.title)
        && icon.equals(another.icon)
        && group.equals(another.group)
        && content.equals(another.content)
        && priority == another.priority
        && width == another.width
        && encoding.equals(another.encoding)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code title}, {@code icon}, {@code group}, {@code content}, {@code priority}, {@code width}, {@code encoding}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + title.hashCode();
    h += (h << 5) + icon.hashCode();
    h += (h << 5) + group.hashCode();
    h += (h << 5) + content.hashCode();
    h += (h << 5) + priority;
    h += (h << 5) + width;
    h += (h << 5) + encoding.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code StaticPanel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StaticPanel{");
    builder.append("title=").append(title);
    builder.append(", ");
    builder.append("icon=").append(icon);
    builder.append(", ");
    builder.append("group=").append(group);
    builder.append(", ");
    builder.append("content=").append(content);
    builder.append(", ");
    builder.append("priority=").append(priority);
    builder.append(", ");
    builder.append("width=").append(width);
    builder.append(", ");
    builder.append("encoding=").append(encoding);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends StaticPanel {
    String title;
    String icon;
    String group;
    String content;
    int priority;
    boolean priorityIsSet;
    int width;
    boolean widthIsSet;
    ContentKind encoding;
    Optional<Long> id = Optional.empty();
    @JsonProperty("title")
    public void setTitle(String title) {
      this.title = title;
    }
    @JsonProperty("icon")
    public void setIcon(String icon) {
      this.icon = icon;
    }
    @JsonProperty("group")
    public void setGroup(String group) {
      this.group = group;
    }
    @JsonProperty("content")
    public void setContent(String content) {
      this.content = content;
    }
    @JsonProperty("priority")
    public void setPriority(int priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("width")
    public void setWidth(int width) {
      this.width = width;
      this.widthIsSet = true;
    }
    @JsonProperty("encoding")
    public void setEncoding(ContentKind encoding) {
      this.encoding = encoding;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public String title() { throw new UnsupportedOperationException(); }
    @Override
    public String icon() { throw new UnsupportedOperationException(); }
    @Override
    public String group() { throw new UnsupportedOperationException(); }
    @Override
    public String content() { throw new UnsupportedOperationException(); }
    @Override
    public int priority() { throw new UnsupportedOperationException(); }
    @Override
    public int width() { throw new UnsupportedOperationException(); }
    @Override
    public ContentKind encoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStaticPanel fromJson(Json json) {
    ImmutableStaticPanel.Builder builder = ImmutableStaticPanel.builder();
    if (json.title != null) {
      builder.title(json.title);
    }
    if (json.icon != null) {
      builder.icon(json.icon);
    }
    if (json.group != null) {
      builder.group(json.group);
    }
    if (json.content != null) {
      builder.content(json.content);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.widthIsSet) {
      builder.width(json.width);
    }
    if (json.encoding != null) {
      builder.encoding(json.encoding);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StaticPanel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StaticPanel instance
   */
  public static ImmutableStaticPanel copyOf(StaticPanel instance) {
    if (instance instanceof ImmutableStaticPanel) {
      return (ImmutableStaticPanel) instance;
    }
    return ImmutableStaticPanel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableStaticPanel ImmutableStaticPanel}.
   * @return A new ImmutableStaticPanel builder
   */
  public static ImmutableStaticPanel.Builder builder() {
    return new ImmutableStaticPanel.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableStaticPanel ImmutableStaticPanel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_TITLE = 0x1L;
    private static final long INIT_BIT_ICON = 0x2L;
    private static final long INIT_BIT_GROUP = 0x4L;
    private static final long INIT_BIT_CONTENT = 0x8L;
    private static final long INIT_BIT_PRIORITY = 0x10L;
    private static final long OPT_BIT_WIDTH = 0x1L;
    private long initBits = 0x1fL;
    private long optBits;

    private String title;
    private String icon;
    private String group;
    private String content;
    private int priority;
    private int width;
    private ContentKind encoding;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.staticpanel.StaticPanel} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(StaticPanel instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.IdProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(IdProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof StaticPanel) {
        StaticPanel instance = (StaticPanel) object;
        icon(instance.icon());
        width(instance.width());
        title(instance.title());
        priority(instance.priority());
        encoding(instance.encoding());
        content(instance.content());
        group(instance.group());
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
    }

    /**
     * Initializes the value for the {@link StaticPanel#title() title} attribute.
     * @param title The value for title 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      initBits &= ~INIT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link StaticPanel#icon() icon} attribute.
     * @param icon The value for icon 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("icon")
    public final Builder icon(String icon) {
      this.icon = Objects.requireNonNull(icon, "icon");
      initBits &= ~INIT_BIT_ICON;
      return this;
    }

    /**
     * Initializes the value for the {@link StaticPanel#group() group} attribute.
     * @param group The value for group 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("group")
    public final Builder group(String group) {
      this.group = Objects.requireNonNull(group, "group");
      initBits &= ~INIT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the value for the {@link StaticPanel#content() content} attribute.
     * @param content The value for content 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("content")
    public final Builder content(String content) {
      this.content = Objects.requireNonNull(content, "content");
      initBits &= ~INIT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the value for the {@link StaticPanel#priority() priority} attribute.
     * @param priority The value for priority 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(int priority) {
      this.priority = priority;
      initBits &= ~INIT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the value for the {@link StaticPanel#width() width} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link StaticPanel#width() width}.</em>
     * @param width The value for width 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("width")
    public final Builder width(int width) {
      this.width = width;
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the value for the {@link StaticPanel#encoding() encoding} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link StaticPanel#encoding() encoding}.</em>
     * @param encoding The value for encoding 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encoding")
    public final Builder encoding(ContentKind encoding) {
      this.encoding = Objects.requireNonNull(encoding, "encoding");
      return this;
    }

    /**
     * Initializes the optional value {@link StaticPanel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link StaticPanel#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableStaticPanel ImmutableStaticPanel}.
     * @return An immutable instance of StaticPanel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableStaticPanel build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableStaticPanel(this);
    }

    private boolean widthIsSet() {
      return (optBits & OPT_BIT_WIDTH) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_TITLE) != 0) attributes.add("title");
      if ((initBits & INIT_BIT_ICON) != 0) attributes.add("icon");
      if ((initBits & INIT_BIT_GROUP) != 0) attributes.add("group");
      if ((initBits & INIT_BIT_CONTENT) != 0) attributes.add("content");
      if ((initBits & INIT_BIT_PRIORITY) != 0) attributes.add("priority");
      return "Cannot build StaticPanel, some of required attributes are not set " + attributes;
    }
  }
}
