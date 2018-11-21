package com.khartec.waltz.model.changelog;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.Operation;
import com.khartec.waltz.model.Severity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ChangeLog}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChangeLog.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ChangeLog"})
public final class ImmutableChangeLog extends ChangeLog {
  private final EntityReference parentReference;
  private final String message;
  private final String userId;
  private final EntityKind childKind;
  private final Operation operation;
  private final Severity severity;
  private final LocalDateTime createdAt;

  private ImmutableChangeLog(ImmutableChangeLog.Builder builder) {
    this.parentReference = builder.parentReference;
    this.message = builder.message;
    this.userId = builder.userId;
    this.childKind = builder.childKind;
    this.operation = builder.operation;
    if (builder.severity != null) {
      initShim.severity(builder.severity);
    }
    if (builder.createdAt != null) {
      initShim.createdAt(builder.createdAt);
    }
    this.severity = initShim.severity();
    this.createdAt = initShim.createdAt();
    this.initShim = null;
  }

  private ImmutableChangeLog(
      EntityReference parentReference,
      String message,
      String userId,
      EntityKind childKind,
      Operation operation,
      Severity severity,
      LocalDateTime createdAt) {
    this.parentReference = parentReference;
    this.message = message;
    this.userId = userId;
    this.childKind = childKind;
    this.operation = operation;
    this.severity = severity;
    this.createdAt = createdAt;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private Severity severity;
    private int severityBuildStage;

    Severity severity() {
      if (severityBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (severityBuildStage == STAGE_UNINITIALIZED) {
        severityBuildStage = STAGE_INITIALIZING;
        this.severity = Objects.requireNonNull(ImmutableChangeLog.super.severity(), "severity");
        severityBuildStage = STAGE_INITIALIZED;
      }
      return this.severity;
    }

    void severity(Severity severity) {
      this.severity = severity;
      severityBuildStage = STAGE_INITIALIZED;
    }
    private LocalDateTime createdAt;
    private int createdAtBuildStage;

    LocalDateTime createdAt() {
      if (createdAtBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (createdAtBuildStage == STAGE_UNINITIALIZED) {
        createdAtBuildStage = STAGE_INITIALIZING;
        this.createdAt = Objects.requireNonNull(ImmutableChangeLog.super.createdAt(), "createdAt");
        createdAtBuildStage = STAGE_INITIALIZED;
      }
      return this.createdAt;
    }

    void createdAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
      createdAtBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (severityBuildStage == STAGE_INITIALIZING) attributes.add("severity");
      if (createdAtBuildStage == STAGE_INITIALIZING) attributes.add("createdAt");
      return "Cannot build ChangeLog, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code parentReference} attribute
   */
  @JsonProperty("parentReference")
  @Override
  public EntityReference parentReference() {
    return parentReference;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public String message() {
    return message;
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
   * @return The value of the {@code childKind} attribute
   */
  @JsonProperty("childKind")
  @Override
  public Optional<EntityKind> childKind() {
    return Optional.ofNullable(childKind);
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Operation operation() {
    return operation;
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Severity severity() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.severity()
        : this.severity;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @JsonProperty("createdAt")
  @Override
  public LocalDateTime createdAt() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.createdAt()
        : this.createdAt;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeLog#parentReference() parentReference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parentReference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeLog withParentReference(EntityReference value) {
    if (this.parentReference == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "parentReference");
    return new ImmutableChangeLog(
        newValue,
        this.message,
        this.userId,
        this.childKind,
        this.operation,
        this.severity,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeLog#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeLog withMessage(String value) {
    if (this.message.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "message");
    return new ImmutableChangeLog(
        this.parentReference,
        newValue,
        this.userId,
        this.childKind,
        this.operation,
        this.severity,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeLog#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeLog withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutableChangeLog(
        this.parentReference,
        this.message,
        newValue,
        this.childKind,
        this.operation,
        this.severity,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChangeLog#childKind() childKind} attribute.
   * @param value The value for childKind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeLog withChildKind(EntityKind value) {
    EntityKind newValue = Objects.requireNonNull(value, "childKind");
    if (this.childKind == newValue) return this;
    return new ImmutableChangeLog(
        this.parentReference,
        this.message,
        this.userId,
        newValue,
        this.operation,
        this.severity,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChangeLog#childKind() childKind} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for childKind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChangeLog withChildKind(Optional<? extends EntityKind> optional) {
    EntityKind value = optional.orElse(null);
    if (Objects.equals(this.childKind, value)) return this;
    return new ImmutableChangeLog(
        this.parentReference,
        this.message,
        this.userId,
        value,
        this.operation,
        this.severity,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeLog#operation() operation} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeLog withOperation(Operation value) {
    if (this.operation == value) return this;
    Operation newValue = Objects.requireNonNull(value, "operation");
    return new ImmutableChangeLog(
        this.parentReference,
        this.message,
        this.userId,
        this.childKind,
        newValue,
        this.severity,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeLog#severity() severity} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for severity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeLog withSeverity(Severity value) {
    if (this.severity == value) return this;
    Severity newValue = Objects.requireNonNull(value, "severity");
    return new ImmutableChangeLog(
        this.parentReference,
        this.message,
        this.userId,
        this.childKind,
        this.operation,
        newValue,
        this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChangeLog#createdAt() createdAt} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangeLog withCreatedAt(LocalDateTime value) {
    if (this.createdAt == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "createdAt");
    return new ImmutableChangeLog(
        this.parentReference,
        this.message,
        this.userId,
        this.childKind,
        this.operation,
        this.severity,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChangeLog} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChangeLog
        && equalTo((ImmutableChangeLog) another);
  }

  private boolean equalTo(ImmutableChangeLog another) {
    return parentReference.equals(another.parentReference)
        && message.equals(another.message)
        && userId.equals(another.userId)
        && Objects.equals(childKind, another.childKind)
        && operation.equals(another.operation)
        && severity.equals(another.severity)
        && createdAt.equals(another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code parentReference}, {@code message}, {@code userId}, {@code childKind}, {@code operation}, {@code severity}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + parentReference.hashCode();
    h += (h << 5) + message.hashCode();
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + Objects.hashCode(childKind);
    h += (h << 5) + operation.hashCode();
    h += (h << 5) + severity.hashCode();
    h += (h << 5) + createdAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ChangeLog} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ChangeLog{");
    builder.append("parentReference=").append(parentReference);
    builder.append(", ");
    builder.append("message=").append(message);
    builder.append(", ");
    builder.append("userId=").append(userId);
    if (childKind != null) {
      builder.append(", ");
      builder.append("childKind=").append(childKind);
    }
    builder.append(", ");
    builder.append("operation=").append(operation);
    builder.append(", ");
    builder.append("severity=").append(severity);
    builder.append(", ");
    builder.append("createdAt=").append(createdAt);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ChangeLog {
    EntityReference parentReference;
    String message;
    String userId;
    Optional<EntityKind> childKind = Optional.empty();
    Operation operation;
    Severity severity;
    LocalDateTime createdAt;
    @JsonProperty("parentReference")
    public void setParentReference(EntityReference parentReference) {
      this.parentReference = parentReference;
    }
    @JsonProperty("message")
    public void setMessage(String message) {
      this.message = message;
    }
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty("childKind")
    public void setChildKind(Optional<EntityKind> childKind) {
      this.childKind = childKind;
    }
    @JsonProperty("operation")
    public void setOperation(Operation operation) {
      this.operation = operation;
    }
    @JsonProperty("severity")
    public void setSeverity(Severity severity) {
      this.severity = severity;
    }
    @JsonProperty("createdAt")
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
    @Override
    public EntityReference parentReference() { throw new UnsupportedOperationException(); }
    @Override
    public String message() { throw new UnsupportedOperationException(); }
    @Override
    public String userId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EntityKind> childKind() { throw new UnsupportedOperationException(); }
    @Override
    public Operation operation() { throw new UnsupportedOperationException(); }
    @Override
    public Severity severity() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime createdAt() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableChangeLog fromJson(Json json) {
    ImmutableChangeLog.Builder builder = ImmutableChangeLog.builder();
    if (json.parentReference != null) {
      builder.parentReference(json.parentReference);
    }
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.childKind != null) {
      builder.childKind(json.childKind);
    }
    if (json.operation != null) {
      builder.operation(json.operation);
    }
    if (json.severity != null) {
      builder.severity(json.severity);
    }
    if (json.createdAt != null) {
      builder.createdAt(json.createdAt);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChangeLog} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChangeLog instance
   */
  public static ImmutableChangeLog copyOf(ChangeLog instance) {
    if (instance instanceof ImmutableChangeLog) {
      return (ImmutableChangeLog) instance;
    }
    return ImmutableChangeLog.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableChangeLog ImmutableChangeLog}.
   * @return A new ImmutableChangeLog builder
   */
  public static ImmutableChangeLog.Builder builder() {
    return new ImmutableChangeLog.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableChangeLog ImmutableChangeLog}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PARENT_REFERENCE = 0x1L;
    private static final long INIT_BIT_MESSAGE = 0x2L;
    private static final long INIT_BIT_USER_ID = 0x4L;
    private static final long INIT_BIT_OPERATION = 0x8L;
    private long initBits = 0xfL;

    private EntityReference parentReference;
    private String message;
    private String userId;
    private EntityKind childKind;
    private Operation operation;
    private Severity severity;
    private LocalDateTime createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ChangeLog} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ChangeLog instance) {
      Objects.requireNonNull(instance, "instance");
      parentReference(instance.parentReference());
      message(instance.message());
      userId(instance.userId());
      Optional<EntityKind> childKindOptional = instance.childKind();
      if (childKindOptional.isPresent()) {
        childKind(childKindOptional);
      }
      operation(instance.operation());
      severity(instance.severity());
      createdAt(instance.createdAt());
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeLog#parentReference() parentReference} attribute.
     * @param parentReference The value for parentReference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentReference")
    public final Builder parentReference(EntityReference parentReference) {
      this.parentReference = Objects.requireNonNull(parentReference, "parentReference");
      initBits &= ~INIT_BIT_PARENT_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeLog#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeLog#userId() userId} attribute.
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
     * Initializes the optional value {@link ChangeLog#childKind() childKind} to childKind.
     * @param childKind The value for childKind
     * @return {@code this} builder for chained invocation
     */
    public final Builder childKind(EntityKind childKind) {
      this.childKind = Objects.requireNonNull(childKind, "childKind");
      return this;
    }

    /**
     * Initializes the optional value {@link ChangeLog#childKind() childKind} to childKind.
     * @param childKind The value for childKind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("childKind")
    public final Builder childKind(Optional<? extends EntityKind> childKind) {
      this.childKind = childKind.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeLog#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Operation operation) {
      this.operation = Objects.requireNonNull(operation, "operation");
      initBits &= ~INIT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeLog#severity() severity} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ChangeLog#severity() severity}.</em>
     * @param severity The value for severity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Severity severity) {
      this.severity = Objects.requireNonNull(severity, "severity");
      return this;
    }

    /**
     * Initializes the value for the {@link ChangeLog#createdAt() createdAt} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ChangeLog#createdAt() createdAt}.</em>
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdAt")
    public final Builder createdAt(LocalDateTime createdAt) {
      this.createdAt = Objects.requireNonNull(createdAt, "createdAt");
      return this;
    }

    /**
     * Builds a new {@link ImmutableChangeLog ImmutableChangeLog}.
     * @return An immutable instance of ChangeLog
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableChangeLog build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableChangeLog(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_PARENT_REFERENCE) != 0) attributes.add("parentReference");
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_OPERATION) != 0) attributes.add("operation");
      return "Cannot build ChangeLog, some of required attributes are not set " + attributes;
    }
  }
}
