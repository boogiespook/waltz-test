package com.khartec.waltz.model.reportee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Reportee}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReportee.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Reportee"})
public final class ImmutableReportee extends Reportee {
  private final String employeeId;
  private final String managerId;
  private final int level;

  private ImmutableReportee(String employeeId, String managerId, int level) {
    this.employeeId = employeeId;
    this.managerId = managerId;
    this.level = level;
  }

  /**
   * @return The value of the {@code employeeId} attribute
   */
  @Override
  public String employeeId() {
    return employeeId;
  }

  /**
   * @return The value of the {@code managerId} attribute
   */
  @Override
  public String managerId() {
    return managerId;
  }

  /**
   * @return The value of the {@code level} attribute
   */
  @Override
  public int level() {
    return level;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Reportee#employeeId() employeeId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for employeeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportee withEmployeeId(String value) {
    if (this.employeeId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "employeeId");
    return new ImmutableReportee(newValue, this.managerId, this.level);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Reportee#managerId() managerId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for managerId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportee withManagerId(String value) {
    if (this.managerId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "managerId");
    return new ImmutableReportee(this.employeeId, newValue, this.level);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Reportee#level() level} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for level
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportee withLevel(int value) {
    if (this.level == value) return this;
    return new ImmutableReportee(this.employeeId, this.managerId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReportee} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReportee
        && equalTo((ImmutableReportee) another);
  }

  private boolean equalTo(ImmutableReportee another) {
    return employeeId.equals(another.employeeId)
        && managerId.equals(another.managerId)
        && level == another.level;
  }

  /**
   * Computes a hash code from attributes: {@code employeeId}, {@code managerId}, {@code level}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + employeeId.hashCode();
    h += (h << 5) + managerId.hashCode();
    h += (h << 5) + level;
    return h;
  }

  /**
   * Prints the immutable value {@code Reportee} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Reportee{"
        + "employeeId=" + employeeId
        + ", managerId=" + managerId
        + ", level=" + level
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Reportee} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Reportee instance
   */
  public static ImmutableReportee copyOf(Reportee instance) {
    if (instance instanceof ImmutableReportee) {
      return (ImmutableReportee) instance;
    }
    return ImmutableReportee.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableReportee ImmutableReportee}.
   * @return A new ImmutableReportee builder
   */
  public static ImmutableReportee.Builder builder() {
    return new ImmutableReportee.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableReportee ImmutableReportee}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_EMPLOYEE_ID = 0x1L;
    private static final long INIT_BIT_MANAGER_ID = 0x2L;
    private static final long INIT_BIT_LEVEL = 0x4L;
    private long initBits = 0x7L;

    private String employeeId;
    private String managerId;
    private int level;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Reportee} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Reportee instance) {
      Objects.requireNonNull(instance, "instance");
      employeeId(instance.employeeId());
      managerId(instance.managerId());
      level(instance.level());
      return this;
    }

    /**
     * Initializes the value for the {@link Reportee#employeeId() employeeId} attribute.
     * @param employeeId The value for employeeId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder employeeId(String employeeId) {
      this.employeeId = Objects.requireNonNull(employeeId, "employeeId");
      initBits &= ~INIT_BIT_EMPLOYEE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Reportee#managerId() managerId} attribute.
     * @param managerId The value for managerId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder managerId(String managerId) {
      this.managerId = Objects.requireNonNull(managerId, "managerId");
      initBits &= ~INIT_BIT_MANAGER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Reportee#level() level} attribute.
     * @param level The value for level 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder level(int level) {
      this.level = level;
      initBits &= ~INIT_BIT_LEVEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableReportee ImmutableReportee}.
     * @return An immutable instance of Reportee
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableReportee build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableReportee(employeeId, managerId, level);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_EMPLOYEE_ID) != 0) attributes.add("employeeId");
      if ((initBits & INIT_BIT_MANAGER_ID) != 0) attributes.add("managerId");
      if ((initBits & INIT_BIT_LEVEL) != 0) attributes.add("level");
      return "Cannot build Reportee, some of required attributes are not set " + attributes;
    }
  }
}
