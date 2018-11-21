package com.khartec.waltz.model.cost;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdSelectionOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AssetCostQueryOptions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAssetCostQueryOptions.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AssetCostQueryOptions"})
public final class ImmutableAssetCostQueryOptions extends AssetCostQueryOptions {
  private final int year;
  private final IdSelectionOptions idSelectionOptions;

  private ImmutableAssetCostQueryOptions(int year, IdSelectionOptions idSelectionOptions) {
    this.year = year;
    this.idSelectionOptions = idSelectionOptions;
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
   * @return The value of the {@code idSelectionOptions} attribute
   */
  @JsonProperty("idSelectionOptions")
  @Override
  public IdSelectionOptions idSelectionOptions() {
    return idSelectionOptions;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssetCostQueryOptions#year() year} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for year
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssetCostQueryOptions withYear(int value) {
    if (this.year == value) return this;
    return new ImmutableAssetCostQueryOptions(value, this.idSelectionOptions);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AssetCostQueryOptions#idSelectionOptions() idSelectionOptions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for idSelectionOptions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAssetCostQueryOptions withIdSelectionOptions(IdSelectionOptions value) {
    if (this.idSelectionOptions == value) return this;
    IdSelectionOptions newValue = Objects.requireNonNull(value, "idSelectionOptions");
    return new ImmutableAssetCostQueryOptions(this.year, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAssetCostQueryOptions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAssetCostQueryOptions
        && equalTo((ImmutableAssetCostQueryOptions) another);
  }

  private boolean equalTo(ImmutableAssetCostQueryOptions another) {
    return year == another.year
        && idSelectionOptions.equals(another.idSelectionOptions);
  }

  /**
   * Computes a hash code from attributes: {@code year}, {@code idSelectionOptions}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + year;
    h += (h << 5) + idSelectionOptions.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AssetCostQueryOptions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AssetCostQueryOptions{"
        + "year=" + year
        + ", idSelectionOptions=" + idSelectionOptions
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AssetCostQueryOptions {
    int year;
    boolean yearIsSet;
    IdSelectionOptions idSelectionOptions;
    @JsonProperty("year")
    public void setYear(int year) {
      this.year = year;
      this.yearIsSet = true;
    }
    @JsonProperty("idSelectionOptions")
    public void setIdSelectionOptions(IdSelectionOptions idSelectionOptions) {
      this.idSelectionOptions = idSelectionOptions;
    }
    @Override
    public int year() { throw new UnsupportedOperationException(); }
    @Override
    public IdSelectionOptions idSelectionOptions() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAssetCostQueryOptions fromJson(Json json) {
    ImmutableAssetCostQueryOptions.Builder builder = ImmutableAssetCostQueryOptions.builder();
    if (json.yearIsSet) {
      builder.year(json.year);
    }
    if (json.idSelectionOptions != null) {
      builder.idSelectionOptions(json.idSelectionOptions);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AssetCostQueryOptions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AssetCostQueryOptions instance
   */
  public static ImmutableAssetCostQueryOptions copyOf(AssetCostQueryOptions instance) {
    if (instance instanceof ImmutableAssetCostQueryOptions) {
      return (ImmutableAssetCostQueryOptions) instance;
    }
    return ImmutableAssetCostQueryOptions.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAssetCostQueryOptions ImmutableAssetCostQueryOptions}.
   * @return A new ImmutableAssetCostQueryOptions builder
   */
  public static ImmutableAssetCostQueryOptions.Builder builder() {
    return new ImmutableAssetCostQueryOptions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAssetCostQueryOptions ImmutableAssetCostQueryOptions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_YEAR = 0x1L;
    private static final long INIT_BIT_ID_SELECTION_OPTIONS = 0x2L;
    private long initBits = 0x3L;

    private int year;
    private IdSelectionOptions idSelectionOptions;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AssetCostQueryOptions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AssetCostQueryOptions instance) {
      Objects.requireNonNull(instance, "instance");
      year(instance.year());
      idSelectionOptions(instance.idSelectionOptions());
      return this;
    }

    /**
     * Initializes the value for the {@link AssetCostQueryOptions#year() year} attribute.
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
     * Initializes the value for the {@link AssetCostQueryOptions#idSelectionOptions() idSelectionOptions} attribute.
     * @param idSelectionOptions The value for idSelectionOptions 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("idSelectionOptions")
    public final Builder idSelectionOptions(IdSelectionOptions idSelectionOptions) {
      this.idSelectionOptions = Objects.requireNonNull(idSelectionOptions, "idSelectionOptions");
      initBits &= ~INIT_BIT_ID_SELECTION_OPTIONS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAssetCostQueryOptions ImmutableAssetCostQueryOptions}.
     * @return An immutable instance of AssetCostQueryOptions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAssetCostQueryOptions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAssetCostQueryOptions(year, idSelectionOptions);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_YEAR) != 0) attributes.add("year");
      if ((initBits & INIT_BIT_ID_SELECTION_OPTIONS) != 0) attributes.add("idSelectionOptions");
      return "Cannot build AssetCostQueryOptions, some of required attributes are not set " + attributes;
    }
  }
}
