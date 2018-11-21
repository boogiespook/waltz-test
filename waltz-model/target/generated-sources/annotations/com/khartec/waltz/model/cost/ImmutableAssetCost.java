package com.khartec.waltz.model.cost;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.ProvenanceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AssetCost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAssetCost.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AssetCost"})
public final class ImmutableAssetCost extends AssetCost {
  private final String assetCode;
  private final Cost cost;
  private final String provenance;

  private ImmutableAssetCost(ImmutableAssetCost.Builder builder) {
    this.assetCode = builder.assetCode;
    this.cost = builder.cost;
    this.provenance = builder.provenance != null
        ? builder.provenance
        : Objects.requireNonNull(super.provenance(), "provenance");
  }

  private ImmutableAssetCost(String assetCode, Cost cost, String provenance) {
    this.assetCode = assetCode;
    this.cost = cost;
    this.provenance = provenance;
  }

  /**
   * @return The value of the {@code assetCode} attribute
   */
  @JsonProperty("assetCode")
  @Override
  public String assetCode() {
    return assetCode;
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
   * @return The value of the {@code provenance} attribute
   */
  @JsonProperty("provenance")
  @Override
  public String provenance() {
    return provenance;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssetCost#assetCode() assetCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for assetCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssetCost withAssetCode(String value) {
    if (this.assetCode.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "assetCode");
    return new ImmutableAssetCost(newValue, this.cost, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssetCost#cost() cost} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cost
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssetCost withCost(Cost value) {
    if (this.cost == value) return this;
    Cost newValue = Objects.requireNonNull(value, "cost");
    return new ImmutableAssetCost(this.assetCode, newValue, this.provenance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssetCost#provenance() provenance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provenance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssetCost withProvenance(String value) {
    if (this.provenance.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "provenance");
    return new ImmutableAssetCost(this.assetCode, this.cost, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAssetCost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAssetCost
        && equalTo((ImmutableAssetCost) another);
  }

  private boolean equalTo(ImmutableAssetCost another) {
    return assetCode.equals(another.assetCode)
        && cost.equals(another.cost)
        && provenance.equals(another.provenance);
  }

  /**
   * Computes a hash code from attributes: {@code assetCode}, {@code cost}, {@code provenance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + assetCode.hashCode();
    h += (h << 5) + cost.hashCode();
    h += (h << 5) + provenance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AssetCost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AssetCost{"
        + "assetCode=" + assetCode
        + ", cost=" + cost
        + ", provenance=" + provenance
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AssetCost {
    String assetCode;
    Cost cost;
    String provenance;
    @JsonProperty("assetCode")
    public void setAssetCode(String assetCode) {
      this.assetCode = assetCode;
    }
    @JsonProperty("cost")
    public void setCost(Cost cost) {
      this.cost = cost;
    }
    @JsonProperty("provenance")
    public void setProvenance(String provenance) {
      this.provenance = provenance;
    }
    @Override
    public String assetCode() { throw new UnsupportedOperationException(); }
    @Override
    public Cost cost() { throw new UnsupportedOperationException(); }
    @Override
    public String provenance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAssetCost fromJson(Json json) {
    ImmutableAssetCost.Builder builder = ImmutableAssetCost.builder();
    if (json.assetCode != null) {
      builder.assetCode(json.assetCode);
    }
    if (json.cost != null) {
      builder.cost(json.cost);
    }
    if (json.provenance != null) {
      builder.provenance(json.provenance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AssetCost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AssetCost instance
   */
  public static ImmutableAssetCost copyOf(AssetCost instance) {
    if (instance instanceof ImmutableAssetCost) {
      return (ImmutableAssetCost) instance;
    }
    return ImmutableAssetCost.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAssetCost ImmutableAssetCost}.
   * @return A new ImmutableAssetCost builder
   */
  public static ImmutableAssetCost.Builder builder() {
    return new ImmutableAssetCost.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAssetCost ImmutableAssetCost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ASSET_CODE = 0x1L;
    private static final long INIT_BIT_COST = 0x2L;
    private long initBits = 0x3L;

    private String assetCode;
    private Cost cost;
    private String provenance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.cost.AssetCost} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AssetCost instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.ProvenanceProvider} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProvenanceProvider instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof AssetCost) {
        AssetCost instance = (AssetCost) object;
        assetCode(instance.assetCode());
        cost(instance.cost());
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
      if (object instanceof ProvenanceProvider) {
        ProvenanceProvider instance = (ProvenanceProvider) object;
        if ((bits & 0x1L) == 0) {
          provenance(instance.provenance());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link AssetCost#assetCode() assetCode} attribute.
     * @param assetCode The value for assetCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assetCode")
    public final Builder assetCode(String assetCode) {
      this.assetCode = Objects.requireNonNull(assetCode, "assetCode");
      initBits &= ~INIT_BIT_ASSET_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link AssetCost#cost() cost} attribute.
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
     * Initializes the value for the {@link AssetCost#provenance() provenance} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AssetCost#provenance() provenance}.</em>
     * @param provenance The value for provenance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provenance")
    public final Builder provenance(String provenance) {
      this.provenance = Objects.requireNonNull(provenance, "provenance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableAssetCost ImmutableAssetCost}.
     * @return An immutable instance of AssetCost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAssetCost build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAssetCost(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ASSET_CODE) != 0) attributes.add("assetCode");
      if ((initBits & INIT_BIT_COST) != 0) attributes.add("cost");
      return "Cannot build AssetCost, some of required attributes are not set " + attributes;
    }
  }
}
