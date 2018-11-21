package com.khartec.waltz.model.taxonomy_management;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityReference;
import com.khartec.waltz.model.Severity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link TaxonomyChangeImpact}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTaxonomyChangeImpact.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "TaxonomyChangeImpact"})
public final class ImmutableTaxonomyChangeImpact
    extends TaxonomyChangeImpact {
  private final Severity severity;
  private final String description;
  private final Set<EntityReference> impactedReferences;

  private ImmutableTaxonomyChangeImpact(
      Severity severity,
      String description,
      Set<EntityReference> impactedReferences) {
    this.severity = severity;
    this.description = description;
    this.impactedReferences = impactedReferences;
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Severity severity() {
    return severity;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code impactedReferences} attribute
   */
  @JsonProperty("impactedReferences")
  @Override
  public Set<EntityReference> impactedReferences() {
    return impactedReferences;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeImpact#severity() severity} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for severity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeImpact withSeverity(Severity value) {
    if (this.severity == value) return this;
    Severity newValue = Objects.requireNonNull(value, "severity");
    return new ImmutableTaxonomyChangeImpact(newValue, this.description, this.impactedReferences);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TaxonomyChangeImpact#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTaxonomyChangeImpact withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "description");
    return new ImmutableTaxonomyChangeImpact(this.severity, newValue, this.impactedReferences);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TaxonomyChangeImpact#impactedReferences() impactedReferences}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaxonomyChangeImpact withImpactedReferences(EntityReference... elements) {
    Set<EntityReference> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTaxonomyChangeImpact(this.severity, this.description, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TaxonomyChangeImpact#impactedReferences() impactedReferences}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of impactedReferences elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTaxonomyChangeImpact withImpactedReferences(Iterable<? extends EntityReference> elements) {
    if (this.impactedReferences == elements) return this;
    Set<EntityReference> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableTaxonomyChangeImpact(this.severity, this.description, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTaxonomyChangeImpact} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTaxonomyChangeImpact
        && equalTo((ImmutableTaxonomyChangeImpact) another);
  }

  private boolean equalTo(ImmutableTaxonomyChangeImpact another) {
    return severity.equals(another.severity)
        && description.equals(another.description)
        && impactedReferences.equals(another.impactedReferences);
  }

  /**
   * Computes a hash code from attributes: {@code severity}, {@code description}, {@code impactedReferences}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + severity.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + impactedReferences.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TaxonomyChangeImpact} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TaxonomyChangeImpact{"
        + "severity=" + severity
        + ", description=" + description
        + ", impactedReferences=" + impactedReferences
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TaxonomyChangeImpact {
    Severity severity;
    String description;
    Set<EntityReference> impactedReferences = Collections.emptySet();
    @JsonProperty("severity")
    public void setSeverity(Severity severity) {
      this.severity = severity;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
      this.description = description;
    }
    @JsonProperty("impactedReferences")
    public void setImpactedReferences(Set<EntityReference> impactedReferences) {
      this.impactedReferences = impactedReferences;
    }
    @Override
    public Severity severity() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public Set<EntityReference> impactedReferences() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTaxonomyChangeImpact fromJson(Json json) {
    ImmutableTaxonomyChangeImpact.Builder builder = ImmutableTaxonomyChangeImpact.builder();
    if (json.severity != null) {
      builder.severity(json.severity);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.impactedReferences != null) {
      builder.addAllImpactedReferences(json.impactedReferences);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TaxonomyChangeImpact} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TaxonomyChangeImpact instance
   */
  public static ImmutableTaxonomyChangeImpact copyOf(TaxonomyChangeImpact instance) {
    if (instance instanceof ImmutableTaxonomyChangeImpact) {
      return (ImmutableTaxonomyChangeImpact) instance;
    }
    return ImmutableTaxonomyChangeImpact.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTaxonomyChangeImpact ImmutableTaxonomyChangeImpact}.
   * @return A new ImmutableTaxonomyChangeImpact builder
   */
  public static ImmutableTaxonomyChangeImpact.Builder builder() {
    return new ImmutableTaxonomyChangeImpact.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTaxonomyChangeImpact ImmutableTaxonomyChangeImpact}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SEVERITY = 0x1L;
    private static final long INIT_BIT_DESCRIPTION = 0x2L;
    private long initBits = 0x3L;

    private Severity severity;
    private String description;
    private List<EntityReference> impactedReferences = new ArrayList<EntityReference>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.taxonomy_management.TaxonomyChangeImpact} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TaxonomyChangeImpact instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
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

    private void from(Object object) {
      long bits = 0;
      if (object instanceof TaxonomyChangeImpact) {
        TaxonomyChangeImpact instance = (TaxonomyChangeImpact) object;
        severity(instance.severity());
        addAllImpactedReferences(instance.impactedReferences());
        if ((bits & 0x1L) == 0) {
          description(instance.description());
          bits |= 0x1L;
        }
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        if ((bits & 0x1L) == 0) {
          description(instance.description());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeImpact#severity() severity} attribute.
     * @param severity The value for severity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Severity severity) {
      this.severity = Objects.requireNonNull(severity, "severity");
      initBits &= ~INIT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the value for the {@link TaxonomyChangeImpact#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Adds one element to {@link TaxonomyChangeImpact#impactedReferences() impactedReferences} set.
     * @param element A impactedReferences element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addImpactedReferences(EntityReference element) {
      this.impactedReferences.add(Objects.requireNonNull(element, "impactedReferences element"));
      return this;
    }

    /**
     * Adds elements to {@link TaxonomyChangeImpact#impactedReferences() impactedReferences} set.
     * @param elements An array of impactedReferences elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addImpactedReferences(EntityReference... elements) {
      for (EntityReference element : elements) {
        this.impactedReferences.add(Objects.requireNonNull(element, "impactedReferences element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TaxonomyChangeImpact#impactedReferences() impactedReferences} set.
     * @param elements An iterable of impactedReferences elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("impactedReferences")
    public final Builder impactedReferences(Iterable<? extends EntityReference> elements) {
      this.impactedReferences.clear();
      return addAllImpactedReferences(elements);
    }

    /**
     * Adds elements to {@link TaxonomyChangeImpact#impactedReferences() impactedReferences} set.
     * @param elements An iterable of impactedReferences elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllImpactedReferences(Iterable<? extends EntityReference> elements) {
      for (EntityReference element : elements) {
        this.impactedReferences.add(Objects.requireNonNull(element, "impactedReferences element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableTaxonomyChangeImpact ImmutableTaxonomyChangeImpact}.
     * @return An immutable instance of TaxonomyChangeImpact
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTaxonomyChangeImpact build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTaxonomyChangeImpact(severity, description, createUnmodifiableSet(impactedReferences));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SEVERITY) != 0) attributes.add("severity");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      return "Cannot build TaxonomyChangeImpact, some of required attributes are not set " + attributes;
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

  /** Unmodifiable set constructed from list to avoid rehashing. */
  private static <T> Set<T> createUnmodifiableSet(List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default:
      Set<T> set = new LinkedHashSet<T>(list.size());
      set.addAll(list);
      return Collections.unmodifiableSet(set);
    }
  }
}
