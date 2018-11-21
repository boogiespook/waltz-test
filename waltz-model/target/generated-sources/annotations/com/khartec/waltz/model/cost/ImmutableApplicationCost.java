package com.khartec.waltz.model.cost;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ApplicationCost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableApplicationCost.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ApplicationCost"})
public final class ImmutableApplicationCost extends ApplicationCost {
  private final Cost cost;
  private final EntityReference application;

  private ImmutableApplicationCost(Cost cost, EntityReference application) {
    this.cost = cost;
    this.application = application;
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @JsonProperty("cost")
  @Override
  public Cost cost() {
    return cost;
  }

  /**
   * @return The value of the {@code application} attribute
   */
  @JsonProperty("application")
  @Override
  public EntityReference application() {
    return application;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApplicationCost#cost() cost} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cost
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplicationCost withCost(Cost value) {
    if (this.cost == value) return this;
    Cost newValue = Objects.requireNonNull(value, "cost");
    return new ImmutableApplicationCost(newValue, this.application);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApplicationCost#application() application} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for application
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplicationCost withApplication(EntityReference value) {
    if (this.application == value) return this;
    EntityReference newValue = Objects.requireNonNull(value, "application");
    return new ImmutableApplicationCost(this.cost, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableApplicationCost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableApplicationCost
        && equalTo((ImmutableApplicationCost) another);
  }

  private boolean equalTo(ImmutableApplicationCost another) {
    return cost.equals(another.cost)
        && application.equals(another.application);
  }

  /**
   * Computes a hash code from attributes: {@code cost}, {@code application}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cost.hashCode();
    h += (h << 5) + application.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ApplicationCost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ApplicationCost{"
        + "cost=" + cost
        + ", application=" + application
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ApplicationCost {
    Cost cost;
    EntityReference application;
    @JsonProperty("cost")
    public void setCost(Cost cost) {
      this.cost = cost;
    }
    @JsonProperty("application")
    public void setApplication(EntityReference application) {
      this.application = application;
    }
    @Override
    public Cost cost() { throw new UnsupportedOperationException(); }
    @Override
    public EntityReference application() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableApplicationCost fromJson(Json json) {
    ImmutableApplicationCost.Builder builder = ImmutableApplicationCost.builder();
    if (json.cost != null) {
      builder.cost(json.cost);
    }
    if (json.application != null) {
      builder.application(json.application);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ApplicationCost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ApplicationCost instance
   */
  public static ImmutableApplicationCost copyOf(ApplicationCost instance) {
    if (instance instanceof ImmutableApplicationCost) {
      return (ImmutableApplicationCost) instance;
    }
    return ImmutableApplicationCost.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableApplicationCost ImmutableApplicationCost}.
   * @return A new ImmutableApplicationCost builder
   */
  public static ImmutableApplicationCost.Builder builder() {
    return new ImmutableApplicationCost.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableApplicationCost ImmutableApplicationCost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_COST = 0x1L;
    private static final long INIT_BIT_APPLICATION = 0x2L;
    private long initBits = 0x3L;

    private Cost cost;
    private EntityReference application;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ApplicationCost} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ApplicationCost instance) {
      Objects.requireNonNull(instance, "instance");
      cost(instance.cost());
      application(instance.application());
      return this;
    }

    /**
     * Initializes the value for the {@link ApplicationCost#cost() cost} attribute.
     * @param cost The value for cost 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cost")
    public final Builder cost(Cost cost) {
      this.cost = Objects.requireNonNull(cost, "cost");
      initBits &= ~INIT_BIT_COST;
      return this;
    }

    /**
     * Initializes the value for the {@link ApplicationCost#application() application} attribute.
     * @param application The value for application 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("application")
    public final Builder application(EntityReference application) {
      this.application = Objects.requireNonNull(application, "application");
      initBits &= ~INIT_BIT_APPLICATION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableApplicationCost ImmutableApplicationCost}.
     * @return An immutable instance of ApplicationCost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableApplicationCost build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableApplicationCost(cost, application);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_COST) != 0) attributes.add("cost");
      if ((initBits & INIT_BIT_APPLICATION) != 0) attributes.add("application");
      return "Cannot build ApplicationCost, some of required attributes are not set " + attributes;
    }
  }
}
