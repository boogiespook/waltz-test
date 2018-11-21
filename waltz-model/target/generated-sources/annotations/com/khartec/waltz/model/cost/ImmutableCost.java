package com.khartec.waltz.model.cost;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Cost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCost.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Cost"})
public final class ImmutableCost extends Cost {
  private final BigDecimal amount;
  private final String costKind;
  private final int year;
  private final EntityKind kind;

  private ImmutableCost(ImmutableCost.Builder builder) {
    this.amount = builder.amount;
    this.costKind = builder.costKind;
    this.year = builder.year;
    this.kind = builder.kind != null
        ? builder.kind
        : Objects.requireNonNull(super.kind(), "kind");
  }

  private ImmutableCost(
      BigDecimal amount,
      String costKind,
      int year,
      EntityKind kind) {
    this.amount = amount;
    this.costKind = costKind;
    this.year = year;
    this.kind = kind;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public BigDecimal amount() {
    return amount;
  }

  /**
   * @return The value of the {@code costKind} attribute
   */
  @JsonProperty("costKind")
  @Override
  public String costKind() {
    return costKind;
  }

  /**
   * @return The value of the {@code year} attribute
   */
  @JsonProperty("year")
  @Override
  public int year() {
    return year;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public EntityKind kind() {
    return kind;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cost#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCost withAmount(BigDecimal value) {
    if (this.amount.equals(value)) return this;
    BigDecimal newValue = Objects.requireNonNull(value, "amount");
    return new ImmutableCost(newValue, this.costKind, this.year, this.kind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cost#costKind() costKind} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for costKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCost withCostKind(String value) {
    if (this.costKind.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "costKind");
    return new ImmutableCost(this.amount, newValue, this.year, this.kind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cost#year() year} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for year
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCost withYear(int value) {
    if (this.year == value) return this;
    return new ImmutableCost(this.amount, this.costKind, value, this.kind);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cost#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCost withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutableCost(this.amount, this.costKind, this.year, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCost
        && equalTo((ImmutableCost) another);
  }

  private boolean equalTo(ImmutableCost another) {
    return amount.equals(another.amount)
        && costKind.equals(another.costKind)
        && year == another.year
        && kind.equals(another.kind);
  }

  /**
   * Computes a hash code from attributes: {@code amount}, {@code costKind}, {@code year}, {@code kind}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + costKind.hashCode();
    h += (h << 5) + year;
    h += (h << 5) + kind.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Cost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Cost{"
        + "amount=" + amount
        + ", costKind=" + costKind
        + ", year=" + year
        + ", kind=" + kind
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Cost {
    BigDecimal amount;
    String costKind;
    int year;
    boolean yearIsSet;
    EntityKind kind;
    @JsonProperty("amount")
    public void setAmount(BigDecimal amount) {
      this.amount = amount;
    }
    @JsonProperty("costKind")
    public void setCostKind(String costKind) {
      this.costKind = costKind;
    }
    @JsonProperty("year")
    public void setYear(int year) {
      this.year = year;
      this.yearIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @Override
    public BigDecimal amount() { throw new UnsupportedOperationException(); }
    @Override
    public String costKind() { throw new UnsupportedOperationException(); }
    @Override
    public int year() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCost fromJson(Json json) {
    ImmutableCost.Builder builder = ImmutableCost.builder();
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    if (json.costKind != null) {
      builder.costKind(json.costKind);
    }
    if (json.yearIsSet) {
      builder.year(json.year);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Cost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Cost instance
   */
  public static ImmutableCost copyOf(Cost instance) {
    if (instance instanceof ImmutableCost) {
      return (ImmutableCost) instance;
    }
    return ImmutableCost.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCost ImmutableCost}.
   * @return A new ImmutableCost builder
   */
  public static ImmutableCost.Builder builder() {
    return new ImmutableCost.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCost ImmutableCost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_AMOUNT = 0x1L;
    private static final long INIT_BIT_COST_KIND = 0x2L;
    private static final long INIT_BIT_YEAR = 0x4L;
    private long initBits = 0x7L;

    private BigDecimal amount;
    private String costKind;
    private int year;
    private EntityKind kind;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.cost.Cost} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Cost instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.EntityKindProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EntityKindProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof Cost) {
        Cost instance = (Cost) object;
        amount(instance.amount());
        costKind(instance.costKind());
        year(instance.year());
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link Cost#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(BigDecimal amount) {
      this.amount = Objects.requireNonNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Cost#costKind() costKind} attribute.
     * @param costKind The value for costKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("costKind")
    public final Builder costKind(String costKind) {
      this.costKind = Objects.requireNonNull(costKind, "costKind");
      initBits &= ~INIT_BIT_COST_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link Cost#year() year} attribute.
     * @param year The value for year 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("year")
    public final Builder year(int year) {
      this.year = year;
      initBits &= ~INIT_BIT_YEAR;
      return this;
    }

    /**
     * Initializes the value for the {@link Cost#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Cost#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Builds a new {@link ImmutableCost ImmutableCost}.
     * @return An immutable instance of Cost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCost build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCost(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_COST_KIND) != 0) attributes.add("costKind");
      if ((initBits & INIT_BIT_YEAR) != 0) attributes.add("year");
      return "Cannot build Cost, some of required attributes are not set " + attributes;
    }
  }
}
