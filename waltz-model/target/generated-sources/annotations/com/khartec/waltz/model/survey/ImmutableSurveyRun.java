package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IdSelectionOptions;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.Nullable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyRun}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyRun.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyRun"})
public final class ImmutableSurveyRun extends SurveyRun {
  private final Long surveyTemplateId;
  private final IdSelectionOptions selectionOptions;
  private final Set<Long> involvementKindIds;
  private final LocalDate issuedOn;
  private final LocalDate dueDate;
  private final SurveyIssuanceKind issuanceKind;
  private final Long ownerId;
  private final String contactEmail;
  private final SurveyRunStatus status;
  private final Long id;
  private final String name;
  private final @Nullable String description;

  private ImmutableSurveyRun(
      Long surveyTemplateId,
      IdSelectionOptions selectionOptions,
      Set<Long> involvementKindIds,
      LocalDate issuedOn,
      LocalDate dueDate,
      SurveyIssuanceKind issuanceKind,
      Long ownerId,
      String contactEmail,
      SurveyRunStatus status,
      Long id,
      String name,
      @Nullable String description) {
    this.surveyTemplateId = surveyTemplateId;
    this.selectionOptions = selectionOptions;
    this.involvementKindIds = involvementKindIds;
    this.issuedOn = issuedOn;
    this.dueDate = dueDate;
    this.issuanceKind = issuanceKind;
    this.ownerId = ownerId;
    this.contactEmail = contactEmail;
    this.status = status;
    this.id = id;
    this.name = name;
    this.description = description;
  }

  /**
   * @return The value of the {@code surveyTemplateId} attribute
   */
  @JsonProperty("surveyTemplateId")
  @Override
  public Long surveyTemplateId() {
    return surveyTemplateId;
  }

  /**
   * @return The value of the {@code selectionOptions} attribute
   */
  @JsonProperty("selectionOptions")
  @Override
  public IdSelectionOptions selectionOptions() {
    return selectionOptions;
  }

  /**
   * @return The value of the {@code involvementKindIds} attribute
   */
  @JsonProperty("involvementKindIds")
  @Override
  public Set<Long> involvementKindIds() {
    return involvementKindIds;
  }

  /**
   * @return The value of the {@code issuedOn} attribute
   */
  @JsonProperty("issuedOn")
  @Override
  public Optional<LocalDate> issuedOn() {
    return Optional.ofNullable(issuedOn);
  }

  /**
   * @return The value of the {@code dueDate} attribute
   */
  @JsonProperty("dueDate")
  @Override
  public LocalDate dueDate() {
    return dueDate;
  }

  /**
   * @return The value of the {@code issuanceKind} attribute
   */
  @JsonProperty("issuanceKind")
  @Override
  public SurveyIssuanceKind issuanceKind() {
    return issuanceKind;
  }

  /**
   * @return The value of the {@code ownerId} attribute
   */
  @JsonProperty("ownerId")
  @Override
  public Long ownerId() {
    return ownerId;
  }

  /**
   * @return The value of the {@code contactEmail} attribute
   */
  @JsonProperty("contactEmail")
  @Override
  public String contactEmail() {
    return contactEmail;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public SurveyRunStatus status() {
    return status;
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
   * Copy the current immutable object by setting a value for the {@link SurveyRun#surveyTemplateId() surveyTemplateId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyTemplateId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withSurveyTemplateId(Long value) {
    if (this.surveyTemplateId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyTemplateId");
    return new ImmutableSurveyRun(
        newValue,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#selectionOptions() selectionOptions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for selectionOptions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withSelectionOptions(IdSelectionOptions value) {
    if (this.selectionOptions == value) return this;
    IdSelectionOptions newValue = Objects.requireNonNull(value, "selectionOptions");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        newValue,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SurveyRun#involvementKindIds() involvementKindIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRun withInvolvementKindIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    Set<Long> newValue = createUnmodifiableSet(wrappedList);
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        newValue,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SurveyRun#involvementKindIds() involvementKindIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of involvementKindIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRun withInvolvementKindIds(Iterable<Long> elements) {
    if (this.involvementKindIds == elements) return this;
    Set<Long> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        newValue,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyRun#issuedOn() issuedOn} attribute.
   * @param value The value for issuedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRun withIssuedOn(LocalDate value) {
    LocalDate newValue = Objects.requireNonNull(value, "issuedOn");
    if (this.issuedOn == newValue) return this;
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        newValue,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyRun#issuedOn() issuedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRun withIssuedOn(Optional<? extends LocalDate> optional) {
    LocalDate value = optional.orElse(null);
    if (this.issuedOn == value) return this;
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        value,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#dueDate() dueDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dueDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withDueDate(LocalDate value) {
    if (this.dueDate == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "dueDate");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        newValue,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#issuanceKind() issuanceKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for issuanceKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withIssuanceKind(SurveyIssuanceKind value) {
    if (this.issuanceKind == value) return this;
    SurveyIssuanceKind newValue = Objects.requireNonNull(value, "issuanceKind");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        newValue,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#ownerId() ownerId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ownerId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withOwnerId(Long value) {
    if (this.ownerId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "ownerId");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        newValue,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#contactEmail() contactEmail} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for contactEmail
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withContactEmail(String value) {
    if (this.contactEmail.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "contactEmail");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        newValue,
        this.status,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withStatus(SurveyRunStatus value) {
    if (this.status == value) return this;
    SurveyRunStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        newValue,
        this.id,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyRun#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRun withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyRun#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRun withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRun#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRun withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSurveyRun(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.issuedOn,
        this.dueDate,
        this.issuanceKind,
        this.ownerId,
        this.contactEmail,
        this.status,
        this.id,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyRun} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyRun
        && equalTo((ImmutableSurveyRun) another);
  }

  private boolean equalTo(ImmutableSurveyRun another) {
    return surveyTemplateId.equals(another.surveyTemplateId)
        && selectionOptions.equals(another.selectionOptions)
        && involvementKindIds.equals(another.involvementKindIds)
        && Objects.equals(issuedOn, another.issuedOn)
        && dueDate.equals(another.dueDate)
        && issuanceKind.equals(another.issuanceKind)
        && ownerId.equals(another.ownerId)
        && contactEmail.equals(another.contactEmail)
        && status.equals(another.status)
        && Objects.equals(id, another.id)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code surveyTemplateId}, {@code selectionOptions}, {@code involvementKindIds}, {@code issuedOn}, {@code dueDate}, {@code issuanceKind}, {@code ownerId}, {@code contactEmail}, {@code status}, {@code id}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyTemplateId.hashCode();
    h += (h << 5) + selectionOptions.hashCode();
    h += (h << 5) + involvementKindIds.hashCode();
    h += (h << 5) + Objects.hashCode(issuedOn);
    h += (h << 5) + dueDate.hashCode();
    h += (h << 5) + issuanceKind.hashCode();
    h += (h << 5) + ownerId.hashCode();
    h += (h << 5) + contactEmail.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyRun} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyRun{");
    builder.append("surveyTemplateId=").append(surveyTemplateId);
    builder.append(", ");
    builder.append("selectionOptions=").append(selectionOptions);
    builder.append(", ");
    builder.append("involvementKindIds=").append(involvementKindIds);
    if (issuedOn != null) {
      builder.append(", ");
      builder.append("issuedOn=").append(issuedOn);
    }
    builder.append(", ");
    builder.append("dueDate=").append(dueDate);
    builder.append(", ");
    builder.append("issuanceKind=").append(issuanceKind);
    builder.append(", ");
    builder.append("ownerId=").append(ownerId);
    builder.append(", ");
    builder.append("contactEmail=").append(contactEmail);
    builder.append(", ");
    builder.append("status=").append(status);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  static final class Json extends SurveyRun {
    Long surveyTemplateId;
    IdSelectionOptions selectionOptions;
    Set<Long> involvementKindIds = Collections.emptySet();
    Optional<LocalDate> issuedOn = Optional.empty();
    LocalDate dueDate;
    SurveyIssuanceKind issuanceKind;
    Long ownerId;
    String contactEmail;
    SurveyRunStatus status;
    Optional<Long> id = Optional.empty();
    String name;
    String description;
    @JsonProperty("surveyTemplateId")
    public void setSurveyTemplateId(Long surveyTemplateId) {
      this.surveyTemplateId = surveyTemplateId;
    }
    @JsonProperty("selectionOptions")
    public void setSelectionOptions(IdSelectionOptions selectionOptions) {
      this.selectionOptions = selectionOptions;
    }
    @JsonProperty("involvementKindIds")
    public void setInvolvementKindIds(Set<Long> involvementKindIds) {
      this.involvementKindIds = involvementKindIds;
    }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Optional<LocalDate> issuedOn) {
      this.issuedOn = issuedOn;
    }
    @JsonProperty("dueDate")
    public void setDueDate(LocalDate dueDate) {
      this.dueDate = dueDate;
    }
    @JsonProperty("issuanceKind")
    public void setIssuanceKind(SurveyIssuanceKind issuanceKind) {
      this.issuanceKind = issuanceKind;
    }
    @JsonProperty("ownerId")
    public void setOwnerId(Long ownerId) {
      this.ownerId = ownerId;
    }
    @JsonProperty("contactEmail")
    public void setContactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
    }
    @JsonProperty("status")
    public void setStatus(SurveyRunStatus status) {
      this.status = status;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
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
    public Long surveyTemplateId() { throw new UnsupportedOperationException(); }
    @Override
    public IdSelectionOptions selectionOptions() { throw new UnsupportedOperationException(); }
    @Override
    public Set<Long> involvementKindIds() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<LocalDate> issuedOn() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDate dueDate() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyIssuanceKind issuanceKind() { throw new UnsupportedOperationException(); }
    @Override
    public Long ownerId() { throw new UnsupportedOperationException(); }
    @Override
    public String contactEmail() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyRunStatus status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableSurveyRun fromJson(Json json) {
    ImmutableSurveyRun.Builder builder = ImmutableSurveyRun.builder();
    if (json.surveyTemplateId != null) {
      builder.surveyTemplateId(json.surveyTemplateId);
    }
    if (json.selectionOptions != null) {
      builder.selectionOptions(json.selectionOptions);
    }
    if (json.involvementKindIds != null) {
      builder.addAllInvolvementKindIds(json.involvementKindIds);
    }
    if (json.issuedOn != null) {
      builder.issuedOn(json.issuedOn);
    }
    if (json.dueDate != null) {
      builder.dueDate(json.dueDate);
    }
    if (json.issuanceKind != null) {
      builder.issuanceKind(json.issuanceKind);
    }
    if (json.ownerId != null) {
      builder.ownerId(json.ownerId);
    }
    if (json.contactEmail != null) {
      builder.contactEmail(json.contactEmail);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.id != null) {
      builder.id(json.id);
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
   * Creates an immutable copy of a {@link SurveyRun} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyRun instance
   */
  public static ImmutableSurveyRun copyOf(SurveyRun instance) {
    if (instance instanceof ImmutableSurveyRun) {
      return (ImmutableSurveyRun) instance;
    }
    return ImmutableSurveyRun.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyRun ImmutableSurveyRun}.
   * @return A new ImmutableSurveyRun builder
   */
  public static ImmutableSurveyRun.Builder builder() {
    return new ImmutableSurveyRun.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyRun ImmutableSurveyRun}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_TEMPLATE_ID = 0x1L;
    private static final long INIT_BIT_SELECTION_OPTIONS = 0x2L;
    private static final long INIT_BIT_DUE_DATE = 0x4L;
    private static final long INIT_BIT_ISSUANCE_KIND = 0x8L;
    private static final long INIT_BIT_OWNER_ID = 0x10L;
    private static final long INIT_BIT_CONTACT_EMAIL = 0x20L;
    private static final long INIT_BIT_STATUS = 0x40L;
    private static final long INIT_BIT_NAME = 0x80L;
    private long initBits = 0xffL;

    private Long surveyTemplateId;
    private IdSelectionOptions selectionOptions;
    private List<Long> involvementKindIds = new ArrayList<Long>();
    private LocalDate issuedOn;
    private LocalDate dueDate;
    private SurveyIssuanceKind issuanceKind;
    private Long ownerId;
    private String contactEmail;
    private SurveyRunStatus status;
    private Long id;
    private String name;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyRun} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyRun instance) {
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

    private void from(Object object) {
      if (object instanceof SurveyRun) {
        SurveyRun instance = (SurveyRun) object;
        issuanceKind(instance.issuanceKind());
        contactEmail(instance.contactEmail());
        dueDate(instance.dueDate());
        selectionOptions(instance.selectionOptions());
        addAllInvolvementKindIds(instance.involvementKindIds());
        ownerId(instance.ownerId());
        surveyTemplateId(instance.surveyTemplateId());
        Optional<LocalDate> issuedOnOptional = instance.issuedOn();
        if (issuedOnOptional.isPresent()) {
          issuedOn(issuedOnOptional);
        }
        status(instance.status());
      }
      if (object instanceof DescriptionProvider) {
        DescriptionProvider instance = (DescriptionProvider) object;
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          description(descriptionValue);
        }
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
      if (object instanceof NameProvider) {
        NameProvider instance = (NameProvider) object;
        name(instance.name());
      }
    }

    /**
     * Initializes the value for the {@link SurveyRun#surveyTemplateId() surveyTemplateId} attribute.
     * @param surveyTemplateId The value for surveyTemplateId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyTemplateId")
    public final Builder surveyTemplateId(Long surveyTemplateId) {
      this.surveyTemplateId = Objects.requireNonNull(surveyTemplateId, "surveyTemplateId");
      initBits &= ~INIT_BIT_SURVEY_TEMPLATE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#selectionOptions() selectionOptions} attribute.
     * @param selectionOptions The value for selectionOptions 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("selectionOptions")
    public final Builder selectionOptions(IdSelectionOptions selectionOptions) {
      this.selectionOptions = Objects.requireNonNull(selectionOptions, "selectionOptions");
      initBits &= ~INIT_BIT_SELECTION_OPTIONS;
      return this;
    }

    /**
     * Adds one element to {@link SurveyRun#involvementKindIds() involvementKindIds} set.
     * @param element A involvementKindIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInvolvementKindIds(long element) {
      this.involvementKindIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link SurveyRun#involvementKindIds() involvementKindIds} set.
     * @param elements An array of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInvolvementKindIds(long... elements) {
      for (long element : elements) {
        this.involvementKindIds.add(element);
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SurveyRun#involvementKindIds() involvementKindIds} set.
     * @param elements An iterable of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("involvementKindIds")
    public final Builder involvementKindIds(Iterable<Long> elements) {
      this.involvementKindIds.clear();
      return addAllInvolvementKindIds(elements);
    }

    /**
     * Adds elements to {@link SurveyRun#involvementKindIds() involvementKindIds} set.
     * @param elements An iterable of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInvolvementKindIds(Iterable<Long> elements) {
      for (long element : elements) {
        this.involvementKindIds.add(Objects.requireNonNull(element, "involvementKindIds element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyRun#issuedOn() issuedOn} to issuedOn.
     * @param issuedOn The value for issuedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuedOn(LocalDate issuedOn) {
      this.issuedOn = Objects.requireNonNull(issuedOn, "issuedOn");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyRun#issuedOn() issuedOn} to issuedOn.
     * @param issuedOn The value for issuedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuedOn")
    public final Builder issuedOn(Optional<? extends LocalDate> issuedOn) {
      this.issuedOn = issuedOn.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#dueDate() dueDate} attribute.
     * @param dueDate The value for dueDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDate")
    public final Builder dueDate(LocalDate dueDate) {
      this.dueDate = Objects.requireNonNull(dueDate, "dueDate");
      initBits &= ~INIT_BIT_DUE_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#issuanceKind() issuanceKind} attribute.
     * @param issuanceKind The value for issuanceKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuanceKind")
    public final Builder issuanceKind(SurveyIssuanceKind issuanceKind) {
      this.issuanceKind = Objects.requireNonNull(issuanceKind, "issuanceKind");
      initBits &= ~INIT_BIT_ISSUANCE_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#ownerId() ownerId} attribute.
     * @param ownerId The value for ownerId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ownerId")
    public final Builder ownerId(Long ownerId) {
      this.ownerId = Objects.requireNonNull(ownerId, "ownerId");
      initBits &= ~INIT_BIT_OWNER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#contactEmail() contactEmail} attribute.
     * @param contactEmail The value for contactEmail 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contactEmail")
    public final Builder contactEmail(String contactEmail) {
      this.contactEmail = Objects.requireNonNull(contactEmail, "contactEmail");
      initBits &= ~INIT_BIT_CONTACT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(SurveyRunStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyRun#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyRun#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRun#name() name} attribute.
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
     * Initializes the value for the {@link SurveyRun#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyRun ImmutableSurveyRun}.
     * @return An immutable instance of SurveyRun
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyRun build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyRun(
          surveyTemplateId,
          selectionOptions,
          createUnmodifiableSet(involvementKindIds),
          issuedOn,
          dueDate,
          issuanceKind,
          ownerId,
          contactEmail,
          status,
          id,
          name,
          description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_TEMPLATE_ID) != 0) attributes.add("surveyTemplateId");
      if ((initBits & INIT_BIT_SELECTION_OPTIONS) != 0) attributes.add("selectionOptions");
      if ((initBits & INIT_BIT_DUE_DATE) != 0) attributes.add("dueDate");
      if ((initBits & INIT_BIT_ISSUANCE_KIND) != 0) attributes.add("issuanceKind");
      if ((initBits & INIT_BIT_OWNER_ID) != 0) attributes.add("ownerId");
      if ((initBits & INIT_BIT_CONTACT_EMAIL) != 0) attributes.add("contactEmail");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SurveyRun, some of required attributes are not set " + attributes;
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
