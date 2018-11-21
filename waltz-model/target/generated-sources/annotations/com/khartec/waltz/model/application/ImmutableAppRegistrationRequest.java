package com.khartec.waltz.model.application;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.rating.RagRating;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AppRegistrationRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppRegistrationRequest.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AppRegistrationRequest"})
public final class ImmutableAppRegistrationRequest
    extends AppRegistrationRequest {
  private final String name;
  private final String description;
  private final long organisationalUnitId;
  private final ApplicationKind applicationKind;
  private final LifecyclePhase lifecyclePhase;
  private final String assetCode;
  private final String parentAssetCode;
  private final Set<String> aliases;
  private final Set<String> tags;
  private final RagRating overallRating;
  private final Criticality businessCriticality;

  private ImmutableAppRegistrationRequest(
      String name,
      String description,
      long organisationalUnitId,
      ApplicationKind applicationKind,
      LifecyclePhase lifecyclePhase,
      String assetCode,
      String parentAssetCode,
      Set<String> aliases,
      Set<String> tags,
      RagRating overallRating,
      Criticality businessCriticality) {
    this.name = name;
    this.description = description;
    this.organisationalUnitId = organisationalUnitId;
    this.applicationKind = applicationKind;
    this.lifecyclePhase = lifecyclePhase;
    this.assetCode = assetCode;
    this.parentAssetCode = parentAssetCode;
    this.aliases = aliases;
    this.tags = tags;
    this.overallRating = overallRating;
    this.businessCriticality = businessCriticality;
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
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code organisationalUnitId} attribute
   */
  @JsonProperty("organisationalUnitId")
  @Override
  public long organisationalUnitId() {
    return organisationalUnitId;
  }

  /**
   * @return The value of the {@code applicationKind} attribute
   */
  @JsonProperty("applicationKind")
  @Override
  public ApplicationKind applicationKind() {
    return applicationKind;
  }

  /**
   * @return The value of the {@code lifecyclePhase} attribute
   */
  @JsonProperty("lifecyclePhase")
  @Override
  public LifecyclePhase lifecyclePhase() {
    return lifecyclePhase;
  }

  /**
   * @return The value of the {@code assetCode} attribute
   */
  @JsonProperty("assetCode")
  @Override
  public Optional<String> assetCode() {
    return Optional.ofNullable(assetCode);
  }

  /**
   * @return The value of the {@code parentAssetCode} attribute
   */
  @JsonProperty("parentAssetCode")
  @Override
  public Optional<String> parentAssetCode() {
    return Optional.ofNullable(parentAssetCode);
  }

  /**
   * @return The value of the {@code aliases} attribute
   */
  @JsonProperty("aliases")
  @Override
  public Set<String> aliases() {
    return aliases;
  }

  /**
   * @return The value of the {@code tags} attribute
   */
  @JsonProperty("tags")
  @Override
  public Set<String> tags() {
    return tags;
  }

  /**
   * @return The value of the {@code overallRating} attribute
   */
  @JsonProperty("overallRating")
  @Override
  public RagRating overallRating() {
    return overallRating;
  }

  /**
   * @return The value of the {@code businessCriticality} attribute
   */
  @JsonProperty("businessCriticality")
  @Override
  public Criticality businessCriticality() {
    return businessCriticality;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationRequest#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationRequest withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableAppRegistrationRequest(
        newValue,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppRegistrationRequest#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        newValue,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppRegistrationRequest#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withDescription(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        value,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationRequest#organisationalUnitId() organisationalUnitId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for organisationalUnitId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationRequest withOrganisationalUnitId(long value) {
    if (this.organisationalUnitId == value) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        value,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationRequest#applicationKind() applicationKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for applicationKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationRequest withApplicationKind(ApplicationKind value) {
    if (this.applicationKind == value) return this;
    ApplicationKind newValue = Objects.requireNonNull(value, "applicationKind");
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        newValue,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationRequest#lifecyclePhase() lifecyclePhase} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lifecyclePhase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationRequest withLifecyclePhase(LifecyclePhase value) {
    if (this.lifecyclePhase == value) return this;
    LifecyclePhase newValue = Objects.requireNonNull(value, "lifecyclePhase");
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        newValue,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppRegistrationRequest#assetCode() assetCode} attribute.
   * @param value The value for assetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withAssetCode(String value) {
    String newValue = Objects.requireNonNull(value, "assetCode");
    if (Objects.equals(this.assetCode, newValue)) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        newValue,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppRegistrationRequest#assetCode() assetCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withAssetCode(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.assetCode, value)) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        value,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppRegistrationRequest#parentAssetCode() parentAssetCode} attribute.
   * @param value The value for parentAssetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withParentAssetCode(String value) {
    String newValue = Objects.requireNonNull(value, "parentAssetCode");
    if (Objects.equals(this.parentAssetCode, newValue)) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        newValue,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppRegistrationRequest#parentAssetCode() parentAssetCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentAssetCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withParentAssetCode(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.parentAssetCode, value)) return this;
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        value,
        this.aliases,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppRegistrationRequest#aliases() aliases}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withAliases(String... elements) {
    Set<String> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        newValue,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppRegistrationRequest#aliases() aliases}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of aliases elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withAliases(Iterable<String> elements) {
    if (this.aliases == elements) return this;
    Set<String> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        newValue,
        this.tags,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppRegistrationRequest#tags() tags}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withTags(String... elements) {
    Set<String> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        newValue,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AppRegistrationRequest#tags() tags}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of tags elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppRegistrationRequest withTags(Iterable<String> elements) {
    if (this.tags == elements) return this;
    Set<String> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        newValue,
        this.overallRating,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationRequest#overallRating() overallRating} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for overallRating
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationRequest withOverallRating(RagRating value) {
    if (this.overallRating == value) return this;
    RagRating newValue = Objects.requireNonNull(value, "overallRating");
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        newValue,
        this.businessCriticality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppRegistrationRequest#businessCriticality() businessCriticality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for businessCriticality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppRegistrationRequest withBusinessCriticality(Criticality value) {
    if (this.businessCriticality == value) return this;
    Criticality newValue = Objects.requireNonNull(value, "businessCriticality");
    return new ImmutableAppRegistrationRequest(
        this.name,
        this.description,
        this.organisationalUnitId,
        this.applicationKind,
        this.lifecyclePhase,
        this.assetCode,
        this.parentAssetCode,
        this.aliases,
        this.tags,
        this.overallRating,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppRegistrationRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppRegistrationRequest
        && equalTo((ImmutableAppRegistrationRequest) another);
  }

  private boolean equalTo(ImmutableAppRegistrationRequest another) {
    return name.equals(another.name)
        && Objects.equals(description, another.description)
        && organisationalUnitId == another.organisationalUnitId
        && applicationKind.equals(another.applicationKind)
        && lifecyclePhase.equals(another.lifecyclePhase)
        && Objects.equals(assetCode, another.assetCode)
        && Objects.equals(parentAssetCode, another.parentAssetCode)
        && aliases.equals(another.aliases)
        && tags.equals(another.tags)
        && overallRating.equals(another.overallRating)
        && businessCriticality.equals(another.businessCriticality);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code description}, {@code organisationalUnitId}, {@code applicationKind}, {@code lifecyclePhase}, {@code assetCode}, {@code parentAssetCode}, {@code aliases}, {@code tags}, {@code overallRating}, {@code businessCriticality}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Long.hashCode(organisationalUnitId);
    h += (h << 5) + applicationKind.hashCode();
    h += (h << 5) + lifecyclePhase.hashCode();
    h += (h << 5) + Objects.hashCode(assetCode);
    h += (h << 5) + Objects.hashCode(parentAssetCode);
    h += (h << 5) + aliases.hashCode();
    h += (h << 5) + tags.hashCode();
    h += (h << 5) + overallRating.hashCode();
    h += (h << 5) + businessCriticality.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AppRegistrationRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AppRegistrationRequest{");
    builder.append("name=").append(name);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("organisationalUnitId=").append(organisationalUnitId);
    builder.append(", ");
    builder.append("applicationKind=").append(applicationKind);
    builder.append(", ");
    builder.append("lifecyclePhase=").append(lifecyclePhase);
    if (assetCode != null) {
      builder.append(", ");
      builder.append("assetCode=").append(assetCode);
    }
    if (parentAssetCode != null) {
      builder.append(", ");
      builder.append("parentAssetCode=").append(parentAssetCode);
    }
    builder.append(", ");
    builder.append("aliases=").append(aliases);
    builder.append(", ");
    builder.append("tags=").append(tags);
    builder.append(", ");
    builder.append("overallRating=").append(overallRating);
    builder.append(", ");
    builder.append("businessCriticality=").append(businessCriticality);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AppRegistrationRequest {
    String name;
    Optional<String> description = Optional.empty();
    long organisationalUnitId;
    boolean organisationalUnitIdIsSet;
    ApplicationKind applicationKind;
    LifecyclePhase lifecyclePhase;
    Optional<String> assetCode = Optional.empty();
    Optional<String> parentAssetCode = Optional.empty();
    Set<String> aliases = Collections.emptySet();
    Set<String> tags = Collections.emptySet();
    RagRating overallRating;
    Criticality businessCriticality;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
    }
    @JsonProperty("organisationalUnitId")
    public void setOrganisationalUnitId(long organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
      this.organisationalUnitIdIsSet = true;
    }
    @JsonProperty("applicationKind")
    public void setApplicationKind(ApplicationKind applicationKind) {
      this.applicationKind = applicationKind;
    }
    @JsonProperty("lifecyclePhase")
    public void setLifecyclePhase(LifecyclePhase lifecyclePhase) {
      this.lifecyclePhase = lifecyclePhase;
    }
    @JsonProperty("assetCode")
    public void setAssetCode(Optional<String> assetCode) {
      this.assetCode = assetCode;
    }
    @JsonProperty("parentAssetCode")
    public void setParentAssetCode(Optional<String> parentAssetCode) {
      this.parentAssetCode = parentAssetCode;
    }
    @JsonProperty("aliases")
    public void setAliases(Set<String> aliases) {
      this.aliases = aliases;
    }
    @JsonProperty("tags")
    public void setTags(Set<String> tags) {
      this.tags = tags;
    }
    @JsonProperty("overallRating")
    public void setOverallRating(RagRating overallRating) {
      this.overallRating = overallRating;
    }
    @JsonProperty("businessCriticality")
    public void setBusinessCriticality(Criticality businessCriticality) {
      this.businessCriticality = businessCriticality;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public long organisationalUnitId() { throw new UnsupportedOperationException(); }
    @Override
    public ApplicationKind applicationKind() { throw new UnsupportedOperationException(); }
    @Override
    public LifecyclePhase lifecyclePhase() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> assetCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> parentAssetCode() { throw new UnsupportedOperationException(); }
    @Override
    public Set<String> aliases() { throw new UnsupportedOperationException(); }
    @Override
    public Set<String> tags() { throw new UnsupportedOperationException(); }
    @Override
    public RagRating overallRating() { throw new UnsupportedOperationException(); }
    @Override
    public Criticality businessCriticality() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppRegistrationRequest fromJson(Json json) {
    ImmutableAppRegistrationRequest.Builder builder = ImmutableAppRegistrationRequest.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.organisationalUnitIdIsSet) {
      builder.organisationalUnitId(json.organisationalUnitId);
    }
    if (json.applicationKind != null) {
      builder.applicationKind(json.applicationKind);
    }
    if (json.lifecyclePhase != null) {
      builder.lifecyclePhase(json.lifecyclePhase);
    }
    if (json.assetCode != null) {
      builder.assetCode(json.assetCode);
    }
    if (json.parentAssetCode != null) {
      builder.parentAssetCode(json.parentAssetCode);
    }
    if (json.aliases != null) {
      builder.addAllAliases(json.aliases);
    }
    if (json.tags != null) {
      builder.addAllTags(json.tags);
    }
    if (json.overallRating != null) {
      builder.overallRating(json.overallRating);
    }
    if (json.businessCriticality != null) {
      builder.businessCriticality(json.businessCriticality);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppRegistrationRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppRegistrationRequest instance
   */
  public static ImmutableAppRegistrationRequest copyOf(AppRegistrationRequest instance) {
    if (instance instanceof ImmutableAppRegistrationRequest) {
      return (ImmutableAppRegistrationRequest) instance;
    }
    return ImmutableAppRegistrationRequest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAppRegistrationRequest ImmutableAppRegistrationRequest}.
   * @return A new ImmutableAppRegistrationRequest builder
   */
  public static ImmutableAppRegistrationRequest.Builder builder() {
    return new ImmutableAppRegistrationRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAppRegistrationRequest ImmutableAppRegistrationRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_ORGANISATIONAL_UNIT_ID = 0x2L;
    private static final long INIT_BIT_APPLICATION_KIND = 0x4L;
    private static final long INIT_BIT_LIFECYCLE_PHASE = 0x8L;
    private static final long INIT_BIT_OVERALL_RATING = 0x10L;
    private static final long INIT_BIT_BUSINESS_CRITICALITY = 0x20L;
    private long initBits = 0x3fL;

    private String name;
    private String description;
    private long organisationalUnitId;
    private ApplicationKind applicationKind;
    private LifecyclePhase lifecyclePhase;
    private String assetCode;
    private String parentAssetCode;
    private List<String> aliases = new ArrayList<String>();
    private List<String> tags = new ArrayList<String>();
    private RagRating overallRating;
    private Criticality businessCriticality;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AppRegistrationRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AppRegistrationRequest instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      Optional<String> descriptionOptional = instance.description();
      if (descriptionOptional.isPresent()) {
        description(descriptionOptional);
      }
      organisationalUnitId(instance.organisationalUnitId());
      applicationKind(instance.applicationKind());
      lifecyclePhase(instance.lifecyclePhase());
      Optional<String> assetCodeOptional = instance.assetCode();
      if (assetCodeOptional.isPresent()) {
        assetCode(assetCodeOptional);
      }
      Optional<String> parentAssetCodeOptional = instance.parentAssetCode();
      if (parentAssetCodeOptional.isPresent()) {
        parentAssetCode(parentAssetCodeOptional);
      }
      addAllAliases(instance.aliases());
      addAllTags(instance.tags());
      overallRating(instance.overallRating());
      businessCriticality(instance.businessCriticality());
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationRequest#name() name} attribute.
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
     * Initializes the optional value {@link AppRegistrationRequest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationRequest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      this.description = description.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationRequest#organisationalUnitId() organisationalUnitId} attribute.
     * @param organisationalUnitId The value for organisationalUnitId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organisationalUnitId")
    public final Builder organisationalUnitId(long organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
      initBits &= ~INIT_BIT_ORGANISATIONAL_UNIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationRequest#applicationKind() applicationKind} attribute.
     * @param applicationKind The value for applicationKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicationKind")
    public final Builder applicationKind(ApplicationKind applicationKind) {
      this.applicationKind = Objects.requireNonNull(applicationKind, "applicationKind");
      initBits &= ~INIT_BIT_APPLICATION_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationRequest#lifecyclePhase() lifecyclePhase} attribute.
     * @param lifecyclePhase The value for lifecyclePhase 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lifecyclePhase")
    public final Builder lifecyclePhase(LifecyclePhase lifecyclePhase) {
      this.lifecyclePhase = Objects.requireNonNull(lifecyclePhase, "lifecyclePhase");
      initBits &= ~INIT_BIT_LIFECYCLE_PHASE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationRequest#assetCode() assetCode} to assetCode.
     * @param assetCode The value for assetCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder assetCode(String assetCode) {
      this.assetCode = Objects.requireNonNull(assetCode, "assetCode");
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationRequest#assetCode() assetCode} to assetCode.
     * @param assetCode The value for assetCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assetCode")
    public final Builder assetCode(Optional<String> assetCode) {
      this.assetCode = assetCode.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationRequest#parentAssetCode() parentAssetCode} to parentAssetCode.
     * @param parentAssetCode The value for parentAssetCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentAssetCode(String parentAssetCode) {
      this.parentAssetCode = Objects.requireNonNull(parentAssetCode, "parentAssetCode");
      return this;
    }

    /**
     * Initializes the optional value {@link AppRegistrationRequest#parentAssetCode() parentAssetCode} to parentAssetCode.
     * @param parentAssetCode The value for parentAssetCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentAssetCode")
    public final Builder parentAssetCode(Optional<String> parentAssetCode) {
      this.parentAssetCode = parentAssetCode.orElse(null);
      return this;
    }

    /**
     * Adds one element to {@link AppRegistrationRequest#aliases() aliases} set.
     * @param element A aliases element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAliases(String element) {
      this.aliases.add(Objects.requireNonNull(element, "aliases element"));
      return this;
    }

    /**
     * Adds elements to {@link AppRegistrationRequest#aliases() aliases} set.
     * @param elements An array of aliases elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAliases(String... elements) {
      for (String element : elements) {
        this.aliases.add(Objects.requireNonNull(element, "aliases element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppRegistrationRequest#aliases() aliases} set.
     * @param elements An iterable of aliases elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("aliases")
    public final Builder aliases(Iterable<String> elements) {
      this.aliases.clear();
      return addAllAliases(elements);
    }

    /**
     * Adds elements to {@link AppRegistrationRequest#aliases() aliases} set.
     * @param elements An iterable of aliases elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAliases(Iterable<String> elements) {
      for (String element : elements) {
        this.aliases.add(Objects.requireNonNull(element, "aliases element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link AppRegistrationRequest#tags() tags} set.
     * @param element A tags element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTags(String element) {
      this.tags.add(Objects.requireNonNull(element, "tags element"));
      return this;
    }

    /**
     * Adds elements to {@link AppRegistrationRequest#tags() tags} set.
     * @param elements An array of tags elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTags(String... elements) {
      for (String element : elements) {
        this.tags.add(Objects.requireNonNull(element, "tags element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AppRegistrationRequest#tags() tags} set.
     * @param elements An iterable of tags elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tags")
    public final Builder tags(Iterable<String> elements) {
      this.tags.clear();
      return addAllTags(elements);
    }

    /**
     * Adds elements to {@link AppRegistrationRequest#tags() tags} set.
     * @param elements An iterable of tags elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTags(Iterable<String> elements) {
      for (String element : elements) {
        this.tags.add(Objects.requireNonNull(element, "tags element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationRequest#overallRating() overallRating} attribute.
     * @param overallRating The value for overallRating 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("overallRating")
    public final Builder overallRating(RagRating overallRating) {
      this.overallRating = Objects.requireNonNull(overallRating, "overallRating");
      initBits &= ~INIT_BIT_OVERALL_RATING;
      return this;
    }

    /**
     * Initializes the value for the {@link AppRegistrationRequest#businessCriticality() businessCriticality} attribute.
     * @param businessCriticality The value for businessCriticality 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("businessCriticality")
    public final Builder businessCriticality(Criticality businessCriticality) {
      this.businessCriticality = Objects.requireNonNull(businessCriticality, "businessCriticality");
      initBits &= ~INIT_BIT_BUSINESS_CRITICALITY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAppRegistrationRequest ImmutableAppRegistrationRequest}.
     * @return An immutable instance of AppRegistrationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAppRegistrationRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAppRegistrationRequest(
          name,
          description,
          organisationalUnitId,
          applicationKind,
          lifecyclePhase,
          assetCode,
          parentAssetCode,
          createUnmodifiableSet(aliases),
          createUnmodifiableSet(tags),
          overallRating,
          businessCriticality);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ORGANISATIONAL_UNIT_ID) != 0) attributes.add("organisationalUnitId");
      if ((initBits & INIT_BIT_APPLICATION_KIND) != 0) attributes.add("applicationKind");
      if ((initBits & INIT_BIT_LIFECYCLE_PHASE) != 0) attributes.add("lifecyclePhase");
      if ((initBits & INIT_BIT_OVERALL_RATING) != 0) attributes.add("overallRating");
      if ((initBits & INIT_BIT_BUSINESS_CRITICALITY) != 0) attributes.add("businessCriticality");
      return "Cannot build AppRegistrationRequest, some of required attributes are not set " + attributes;
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
