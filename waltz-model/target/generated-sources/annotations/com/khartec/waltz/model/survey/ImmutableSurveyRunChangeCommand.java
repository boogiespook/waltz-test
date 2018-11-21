package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.DescriptionProvider;
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
 * Immutable implementation of {@link SurveyRunChangeCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyRunChangeCommand.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyRunChangeCommand"})
public final class ImmutableSurveyRunChangeCommand
    extends SurveyRunChangeCommand {
  private final Long surveyTemplateId;
  private final IdSelectionOptions selectionOptions;
  private final Set<Long> involvementKindIds;
  private final LocalDate dueDate;
  private final SurveyIssuanceKind issuanceKind;
  private final String contactEmail;
  private final String name;
  private final @Nullable String description;

  private ImmutableSurveyRunChangeCommand(
      Long surveyTemplateId,
      IdSelectionOptions selectionOptions,
      Set<Long> involvementKindIds,
      LocalDate dueDate,
      SurveyIssuanceKind issuanceKind,
      String contactEmail,
      String name,
      @Nullable String description) {
    this.surveyTemplateId = surveyTemplateId;
    this.selectionOptions = selectionOptions;
    this.involvementKindIds = involvementKindIds;
    this.dueDate = dueDate;
    this.issuanceKind = issuanceKind;
    this.contactEmail = contactEmail;
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
   * @return The value of the {@code dueDate} attribute
   */
  @JsonProperty("dueDate")
  @Override
  public Optional<LocalDate> dueDate() {
    return Optional.ofNullable(dueDate);
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
   * @return The value of the {@code contactEmail} attribute
   */
  @JsonProperty("contactEmail")
  @Override
  public Optional<String> contactEmail() {
    return Optional.ofNullable(contactEmail);
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
   * Copy the current immutable object by setting a value for the {@link SurveyRunChangeCommand#surveyTemplateId() surveyTemplateId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyTemplateId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withSurveyTemplateId(Long value) {
    if (this.surveyTemplateId.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "surveyTemplateId");
    return new ImmutableSurveyRunChangeCommand(
        newValue,
        this.selectionOptions,
        this.involvementKindIds,
        this.dueDate,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunChangeCommand#selectionOptions() selectionOptions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for selectionOptions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withSelectionOptions(IdSelectionOptions value) {
    if (this.selectionOptions == value) return this;
    IdSelectionOptions newValue = Objects.requireNonNull(value, "selectionOptions");
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        newValue,
        this.involvementKindIds,
        this.dueDate,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SurveyRunChangeCommand#involvementKindIds() involvementKindIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withInvolvementKindIds(long... elements) {
    ArrayList<Long> wrappedList = new ArrayList<Long>(elements.length);
    for (long element : elements) {
      wrappedList.add(element);
    }
    Set<Long> newValue = createUnmodifiableSet(wrappedList);
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        newValue,
        this.dueDate,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SurveyRunChangeCommand#involvementKindIds() involvementKindIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of involvementKindIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withInvolvementKindIds(Iterable<Long> elements) {
    if (this.involvementKindIds == elements) return this;
    Set<Long> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        newValue,
        this.dueDate,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyRunChangeCommand#dueDate() dueDate} attribute.
   * @param value The value for dueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withDueDate(LocalDate value) {
    LocalDate newValue = Objects.requireNonNull(value, "dueDate");
    if (this.dueDate == newValue) return this;
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        newValue,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyRunChangeCommand#dueDate() dueDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withDueDate(Optional<? extends LocalDate> optional) {
    LocalDate value = optional.orElse(null);
    if (this.dueDate == value) return this;
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        value,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunChangeCommand#issuanceKind() issuanceKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for issuanceKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withIssuanceKind(SurveyIssuanceKind value) {
    if (this.issuanceKind == value) return this;
    SurveyIssuanceKind newValue = Objects.requireNonNull(value, "issuanceKind");
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.dueDate,
        newValue,
        this.contactEmail,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyRunChangeCommand#contactEmail() contactEmail} attribute.
   * @param value The value for contactEmail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withContactEmail(String value) {
    String newValue = Objects.requireNonNull(value, "contactEmail");
    if (Objects.equals(this.contactEmail, newValue)) return this;
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.dueDate,
        this.issuanceKind,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyRunChangeCommand#contactEmail() contactEmail} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contactEmail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withContactEmail(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.contactEmail, value)) return this;
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.dueDate,
        this.issuanceKind,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunChangeCommand#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.dueDate,
        this.issuanceKind,
        this.contactEmail,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyRunChangeCommand#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyRunChangeCommand withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSurveyRunChangeCommand(
        this.surveyTemplateId,
        this.selectionOptions,
        this.involvementKindIds,
        this.dueDate,
        this.issuanceKind,
        this.contactEmail,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyRunChangeCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyRunChangeCommand
        && equalTo((ImmutableSurveyRunChangeCommand) another);
  }

  private boolean equalTo(ImmutableSurveyRunChangeCommand another) {
    return surveyTemplateId.equals(another.surveyTemplateId)
        && selectionOptions.equals(another.selectionOptions)
        && involvementKindIds.equals(another.involvementKindIds)
        && Objects.equals(dueDate, another.dueDate)
        && issuanceKind.equals(another.issuanceKind)
        && Objects.equals(contactEmail, another.contactEmail)
        && name.equals(another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code surveyTemplateId}, {@code selectionOptions}, {@code involvementKindIds}, {@code dueDate}, {@code issuanceKind}, {@code contactEmail}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyTemplateId.hashCode();
    h += (h << 5) + selectionOptions.hashCode();
    h += (h << 5) + involvementKindIds.hashCode();
    h += (h << 5) + Objects.hashCode(dueDate);
    h += (h << 5) + issuanceKind.hashCode();
    h += (h << 5) + Objects.hashCode(contactEmail);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyRunChangeCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyRunChangeCommand{");
    builder.append("surveyTemplateId=").append(surveyTemplateId);
    builder.append(", ");
    builder.append("selectionOptions=").append(selectionOptions);
    builder.append(", ");
    builder.append("involvementKindIds=").append(involvementKindIds);
    if (dueDate != null) {
      builder.append(", ");
      builder.append("dueDate=").append(dueDate);
    }
    builder.append(", ");
    builder.append("issuanceKind=").append(issuanceKind);
    if (contactEmail != null) {
      builder.append(", ");
      builder.append("contactEmail=").append(contactEmail);
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
  static final class Json extends SurveyRunChangeCommand {
    Long surveyTemplateId;
    IdSelectionOptions selectionOptions;
    Set<Long> involvementKindIds = Collections.emptySet();
    Optional<LocalDate> dueDate = Optional.empty();
    SurveyIssuanceKind issuanceKind;
    Optional<String> contactEmail = Optional.empty();
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
    @JsonProperty("dueDate")
    public void setDueDate(Optional<LocalDate> dueDate) {
      this.dueDate = dueDate;
    }
    @JsonProperty("issuanceKind")
    public void setIssuanceKind(SurveyIssuanceKind issuanceKind) {
      this.issuanceKind = issuanceKind;
    }
    @JsonProperty("contactEmail")
    public void setContactEmail(Optional<String> contactEmail) {
      this.contactEmail = contactEmail;
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
    public Optional<LocalDate> dueDate() { throw new UnsupportedOperationException(); }
    @Override
    public SurveyIssuanceKind issuanceKind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> contactEmail() { throw new UnsupportedOperationException(); }
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
  static ImmutableSurveyRunChangeCommand fromJson(Json json) {
    ImmutableSurveyRunChangeCommand.Builder builder = ImmutableSurveyRunChangeCommand.builder();
    if (json.surveyTemplateId != null) {
      builder.surveyTemplateId(json.surveyTemplateId);
    }
    if (json.selectionOptions != null) {
      builder.selectionOptions(json.selectionOptions);
    }
    if (json.involvementKindIds != null) {
      builder.addAllInvolvementKindIds(json.involvementKindIds);
    }
    if (json.dueDate != null) {
      builder.dueDate(json.dueDate);
    }
    if (json.issuanceKind != null) {
      builder.issuanceKind(json.issuanceKind);
    }
    if (json.contactEmail != null) {
      builder.contactEmail(json.contactEmail);
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
   * Creates an immutable copy of a {@link SurveyRunChangeCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyRunChangeCommand instance
   */
  public static ImmutableSurveyRunChangeCommand copyOf(SurveyRunChangeCommand instance) {
    if (instance instanceof ImmutableSurveyRunChangeCommand) {
      return (ImmutableSurveyRunChangeCommand) instance;
    }
    return ImmutableSurveyRunChangeCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyRunChangeCommand ImmutableSurveyRunChangeCommand}.
   * @return A new ImmutableSurveyRunChangeCommand builder
   */
  public static ImmutableSurveyRunChangeCommand.Builder builder() {
    return new ImmutableSurveyRunChangeCommand.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyRunChangeCommand ImmutableSurveyRunChangeCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_TEMPLATE_ID = 0x1L;
    private static final long INIT_BIT_SELECTION_OPTIONS = 0x2L;
    private static final long INIT_BIT_ISSUANCE_KIND = 0x4L;
    private static final long INIT_BIT_NAME = 0x8L;
    private long initBits = 0xfL;

    private Long surveyTemplateId;
    private IdSelectionOptions selectionOptions;
    private List<Long> involvementKindIds = new ArrayList<Long>();
    private LocalDate dueDate;
    private SurveyIssuanceKind issuanceKind;
    private String contactEmail;
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
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyRunChangeCommand} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyRunChangeCommand instance) {
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
      if (object instanceof SurveyRunChangeCommand) {
        SurveyRunChangeCommand instance = (SurveyRunChangeCommand) object;
        issuanceKind(instance.issuanceKind());
        selectionOptions(instance.selectionOptions());
        addAllInvolvementKindIds(instance.involvementKindIds());
        Optional<String> contactEmailOptional = instance.contactEmail();
        if (contactEmailOptional.isPresent()) {
          contactEmail(contactEmailOptional);
        }
        surveyTemplateId(instance.surveyTemplateId());
        Optional<LocalDate> dueDateOptional = instance.dueDate();
        if (dueDateOptional.isPresent()) {
          dueDate(dueDateOptional);
        }
      }
    }

    /**
     * Initializes the value for the {@link SurveyRunChangeCommand#surveyTemplateId() surveyTemplateId} attribute.
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
     * Initializes the value for the {@link SurveyRunChangeCommand#selectionOptions() selectionOptions} attribute.
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
     * Adds one element to {@link SurveyRunChangeCommand#involvementKindIds() involvementKindIds} set.
     * @param element A involvementKindIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInvolvementKindIds(long element) {
      this.involvementKindIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link SurveyRunChangeCommand#involvementKindIds() involvementKindIds} set.
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
     * Sets or replaces all elements for {@link SurveyRunChangeCommand#involvementKindIds() involvementKindIds} set.
     * @param elements An iterable of involvementKindIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("involvementKindIds")
    public final Builder involvementKindIds(Iterable<Long> elements) {
      this.involvementKindIds.clear();
      return addAllInvolvementKindIds(elements);
    }

    /**
     * Adds elements to {@link SurveyRunChangeCommand#involvementKindIds() involvementKindIds} set.
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
     * Initializes the optional value {@link SurveyRunChangeCommand#dueDate() dueDate} to dueDate.
     * @param dueDate The value for dueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder dueDate(LocalDate dueDate) {
      this.dueDate = Objects.requireNonNull(dueDate, "dueDate");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyRunChangeCommand#dueDate() dueDate} to dueDate.
     * @param dueDate The value for dueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDate")
    public final Builder dueDate(Optional<? extends LocalDate> dueDate) {
      this.dueDate = dueDate.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunChangeCommand#issuanceKind() issuanceKind} attribute.
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
     * Initializes the optional value {@link SurveyRunChangeCommand#contactEmail() contactEmail} to contactEmail.
     * @param contactEmail The value for contactEmail
     * @return {@code this} builder for chained invocation
     */
    public final Builder contactEmail(String contactEmail) {
      this.contactEmail = Objects.requireNonNull(contactEmail, "contactEmail");
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyRunChangeCommand#contactEmail() contactEmail} to contactEmail.
     * @param contactEmail The value for contactEmail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contactEmail")
    public final Builder contactEmail(Optional<String> contactEmail) {
      this.contactEmail = contactEmail.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyRunChangeCommand#name() name} attribute.
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
     * Initializes the value for the {@link SurveyRunChangeCommand#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyRunChangeCommand ImmutableSurveyRunChangeCommand}.
     * @return An immutable instance of SurveyRunChangeCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyRunChangeCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyRunChangeCommand(
          surveyTemplateId,
          selectionOptions,
          createUnmodifiableSet(involvementKindIds),
          dueDate,
          issuanceKind,
          contactEmail,
          name,
          description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_TEMPLATE_ID) != 0) attributes.add("surveyTemplateId");
      if ((initBits & INIT_BIT_SELECTION_OPTIONS) != 0) attributes.add("selectionOptions");
      if ((initBits & INIT_BIT_ISSUANCE_KIND) != 0) attributes.add("issuanceKind");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build SurveyRunChangeCommand, some of required attributes are not set " + attributes;
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
