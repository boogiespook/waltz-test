package com.khartec.waltz.model.system.job_log;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link JobLog}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJobLog.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "JobLog"})
public final class ImmutableJobLog extends JobLog {
  private final JobStatus status;
  private final EntityKind entityKind;
  private final LocalDateTime start;
  private final LocalDateTime end;
  private final String name;
  private final @Nullable String description;

  private ImmutableJobLog(
      JobStatus status,
      EntityKind entityKind,
      LocalDateTime start,
      LocalDateTime end,
      String name,
      @Nullable String description) {
    this.status = status;
    this.entityKind = entityKind;
    this.start = start;
    this.end = end;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public JobStatus status() {
    return status;
  }

  /**
   * @return The value of the {@code entityKind} attribute
   */
  @JsonProperty("entityKind")
  @Override
  public EntityKind entityKind() {
    return entityKind;
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public LocalDateTime start() {
    return start;
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<LocalDateTime> end() {
    return Optional.ofNullable(end);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobLog#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobLog withStatus(JobStatus value) {
    if (this.status == value) return this;
    JobStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableJobLog(newValue, this.entityKind, this.start, this.end, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobLog#entityKind() entityKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entityKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobLog withEntityKind(EntityKind value) {
    if (this.entityKind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "entityKind");
    return new ImmutableJobLog(this.status, newValue, this.start, this.end, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobLog#start() start} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for start
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobLog withStart(LocalDateTime value) {
    if (this.start == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "start");
    return new ImmutableJobLog(this.status, this.entityKind, newValue, this.end, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link JobLog#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobLog withEnd(LocalDateTime value) {
    LocalDateTime newValue = Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableJobLog(this.status, this.entityKind, this.start, newValue, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link JobLog#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobLog withEnd(Optional<? extends LocalDateTime> optional) {
    LocalDateTime value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableJobLog(this.status, this.entityKind, this.start, value, this.name, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobLog#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobLog withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableJobLog(this.status, this.entityKind, this.start, this.end, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobLog#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobLog withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableJobLog(this.status, this.entityKind, this.start, this.end, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJobLog} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJobLog
        && equalTo((ImmutableJobLog) another);
  }

  private boolean equalTo(ImmutableJobLog another) {
    return status.equals(another.status)
        && entityKind.equals(another.entityKind)
        && start.equals(another.start)
        && Objects.equals(end, another.end)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code entityKind}, {@code start}, {@code end}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + status.hashCode();
    h += (h << 5) + entityKind.hashCode();
    h += (h << 5) + start.hashCode();
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code JobLog} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("JobLog{");
    builder.append("status=").append(status);
    builder.append(", ");
    builder.append("entityKind=").append(entityKind);
    builder.append(", ");
    builder.append("start=").append(start);
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
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
  static final class Json extends JobLog {
    JobStatus status;
    EntityKind entityKind;
    LocalDateTime start;
    Optional<LocalDateTime> end = Optional.empty();
    String name;
    String description;
    @JsonProperty("status")
    public void setStatus(JobStatus status) {
      this.status = status;
    }
    @JsonProperty("entityKind")
    public void setEntityKind(EntityKind entityKind) {
      this.entityKind = entityKind;
    }
    @JsonProperty("start")
    public void setStart(LocalDateTime start) {
      this.start = start;
    }
    @JsonProperty("end")
    public void setEnd(Optional<LocalDateTime> end) {
      this.end = end;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    public JobStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind entityKind() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDateTime> end() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
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
  static ImmutableJobLog fromJson(Json json) {
    ImmutableJobLog.Builder builder = ImmutableJobLog.builder();
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.entityKind != null) {
      builder.entityKind(json.entityKind);
    }
    if (json.start != null) {
      builder.start(json.start);
    }
    if (json.end != null) {
      builder.end(json.end);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JobLog} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JobLog instance
   */
  public static ImmutableJobLog copyOf(JobLog instance) {
    if (instance instanceof ImmutableJobLog) {
      return (ImmutableJobLog) instance;
    }
    return ImmutableJobLog.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableJobLog ImmutableJobLog}.
   * @return A new ImmutableJobLog builder
   */
  public static ImmutableJobLog.Builder builder() {
    return new ImmutableJobLog.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableJobLog ImmutableJobLog}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_STATUS = 0x1L;
    private static final long INIT_BIT_ENTITY_KIND = 0x2L;
    private static final long INIT_BIT_START = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private long initBits = 0xfL;

    private JobStatus status;
    private EntityKind entityKind;
    private LocalDateTime start;
    private LocalDateTime end;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.DescriptionProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DescriptionProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.NameProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NameProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.system.job_log.JobLog} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(JobLog instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
      if (object instanceof JobLog) {
        JobLog instance = (JobLog) object;
        start(instance.start());
        entityKind(instance.entityKind());
        Optional<LocalDateTime> endOptional = instance.end();
        if (endOptional.isPresent()) {
          end(endOptional);
        }
        status(instance.status());
      }
    }

    /**
     * Initializes the value for the {@link JobLog#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(JobStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link JobLog#entityKind() entityKind} attribute.
     * @param entityKind The value for entityKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityKind")
    public final Builder entityKind(EntityKind entityKind) {
      this.entityKind = Objects.requireNonNull(entityKind, "entityKind");
      initBits &= ~INIT_BIT_ENTITY_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link JobLog#start() start} attribute.
     * @param start The value for start 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(LocalDateTime start) {
      this.start = Objects.requireNonNull(start, "start");
      initBits &= ~INIT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link JobLog#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(LocalDateTime end) {
      this.end = Objects.requireNonNull(end, "end");
      return this;
    }

    /**
     * Initializes the optional value {@link JobLog#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("end")
    public final Builder end(Optional<? extends LocalDateTime> end) {
      this.end = end.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link JobLog#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link JobLog#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableJobLog ImmutableJobLog}.
     * @return An immutable instance of JobLog
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableJobLog build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJobLog(status, entityKind, start, end, name, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_ENTITY_KIND) != 0) attributes.add("entityKind");
      if ((initBits & INIT_BIT_START) != 0) attributes.add("start");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build JobLog, some of required attributes are not set " + attributes;
    }
  }
}
