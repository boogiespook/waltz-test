package com.khartec.waltz.model.survey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.person.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link SurveyInstanceRecipient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSurveyInstanceRecipient.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "SurveyInstanceRecipient"})
public final class ImmutableSurveyInstanceRecipient
    extends SurveyInstanceRecipient {
  private final SurveyInstance surveyInstance;
  private final Person person;
  private final Long id;

  private ImmutableSurveyInstanceRecipient(
      SurveyInstance surveyInstance,
      Person person,
      Long id) {
    this.surveyInstance = surveyInstance;
    this.person = person;
    this.id = id;
  }

  /**
   * @return The value of the {@code surveyInstance} attribute
   */
  @JsonProperty("surveyInstance")
  @Override
  public SurveyInstance surveyInstance() {
    return surveyInstance;
  }

  /**
   * @return The value of the {@code person} attribute
   */
  @JsonProperty("person")
  @Override
  public Person person() {
    return person;
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
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceRecipient#surveyInstance() surveyInstance} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for surveyInstance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceRecipient withSurveyInstance(SurveyInstance value) {
    if (this.surveyInstance == value) return this;
    SurveyInstance newValue = Objects.requireNonNull(value, "surveyInstance");
    return new ImmutableSurveyInstanceRecipient(newValue, this.person, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SurveyInstanceRecipient#person() person} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for person
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSurveyInstanceRecipient withPerson(Person value) {
    if (this.person == value) return this;
    Person newValue = Objects.requireNonNull(value, "person");
    return new ImmutableSurveyInstanceRecipient(this.surveyInstance, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SurveyInstanceRecipient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstanceRecipient withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSurveyInstanceRecipient(this.surveyInstance, this.person, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SurveyInstanceRecipient#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSurveyInstanceRecipient withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSurveyInstanceRecipient(this.surveyInstance, this.person, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSurveyInstanceRecipient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSurveyInstanceRecipient
        && equalTo((ImmutableSurveyInstanceRecipient) another);
  }

  private boolean equalTo(ImmutableSurveyInstanceRecipient another) {
    return surveyInstance.equals(another.surveyInstance)
        && person.equals(another.person)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code surveyInstance}, {@code person}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + surveyInstance.hashCode();
    h += (h << 5) + person.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SurveyInstanceRecipient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SurveyInstanceRecipient{");
    builder.append("surveyInstance=").append(surveyInstance);
    builder.append(", ");
    builder.append("person=").append(person);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  static final class Json extends SurveyInstanceRecipient {
    SurveyInstance surveyInstance;
    Person person;
    Optional<Long> id = Optional.empty();
    @JsonProperty("surveyInstance")
    public void setSurveyInstance(SurveyInstance surveyInstance) {
      this.surveyInstance = surveyInstance;
    }
    @JsonProperty("person")
    public void setPerson(Person person) {
      this.person = person;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public SurveyInstance surveyInstance() { throw new UnsupportedOperationException(); }
    @Override
    public Person person() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSurveyInstanceRecipient fromJson(Json json) {
    ImmutableSurveyInstanceRecipient.Builder builder = ImmutableSurveyInstanceRecipient.builder();
    if (json.surveyInstance != null) {
      builder.surveyInstance(json.surveyInstance);
    }
    if (json.person != null) {
      builder.person(json.person);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SurveyInstanceRecipient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SurveyInstanceRecipient instance
   */
  public static ImmutableSurveyInstanceRecipient copyOf(SurveyInstanceRecipient instance) {
    if (instance instanceof ImmutableSurveyInstanceRecipient) {
      return (ImmutableSurveyInstanceRecipient) instance;
    }
    return ImmutableSurveyInstanceRecipient.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSurveyInstanceRecipient ImmutableSurveyInstanceRecipient}.
   * @return A new ImmutableSurveyInstanceRecipient builder
   */
  public static ImmutableSurveyInstanceRecipient.Builder builder() {
    return new ImmutableSurveyInstanceRecipient.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSurveyInstanceRecipient ImmutableSurveyInstanceRecipient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SURVEY_INSTANCE = 0x1L;
    private static final long INIT_BIT_PERSON = 0x2L;
    private long initBits = 0x3L;

    private SurveyInstance surveyInstance;
    private Person person;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.survey.SurveyInstanceRecipient} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SurveyInstanceRecipient instance) {
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

    private void from(Object object) {
      if (object instanceof SurveyInstanceRecipient) {
        SurveyInstanceRecipient instance = (SurveyInstanceRecipient) object;
        person(instance.person());
        surveyInstance(instance.surveyInstance());
      }
      if (object instanceof IdProvider) {
        IdProvider instance = (IdProvider) object;
        Optional<Long> idOptional = instance.id();
        if (idOptional.isPresent()) {
          id(idOptional);
        }
      }
    }

    /**
     * Initializes the value for the {@link SurveyInstanceRecipient#surveyInstance() surveyInstance} attribute.
     * @param surveyInstance The value for surveyInstance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("surveyInstance")
    public final Builder surveyInstance(SurveyInstance surveyInstance) {
      this.surveyInstance = Objects.requireNonNull(surveyInstance, "surveyInstance");
      initBits &= ~INIT_BIT_SURVEY_INSTANCE;
      return this;
    }

    /**
     * Initializes the value for the {@link SurveyInstanceRecipient#person() person} attribute.
     * @param person The value for person 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("person")
    public final Builder person(Person person) {
      this.person = Objects.requireNonNull(person, "person");
      initBits &= ~INIT_BIT_PERSON;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstanceRecipient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link SurveyInstanceRecipient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSurveyInstanceRecipient ImmutableSurveyInstanceRecipient}.
     * @return An immutable instance of SurveyInstanceRecipient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSurveyInstanceRecipient build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSurveyInstanceRecipient(surveyInstance, person, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SURVEY_INSTANCE) != 0) attributes.add("surveyInstance");
      if ((initBits & INIT_BIT_PERSON) != 0) attributes.add("person");
      return "Cannot build SurveyInstanceRecipient, some of required attributes are not set " + attributes;
    }
  }
}
