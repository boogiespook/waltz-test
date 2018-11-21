package com.khartec.waltz.model.involvement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.application.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ApplicationInvolvement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableApplicationInvolvement.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ApplicationInvolvement"})
public final class ImmutableApplicationInvolvement
    extends ApplicationInvolvement {
  private final Application application;
  private final Involvement involvement;

  private ImmutableApplicationInvolvement(
      Application application,
      Involvement involvement) {
    this.application = application;
    this.involvement = involvement;
  }

  /**
   * @return The value of the {@code application} attribute
   */
  @JsonProperty("application")
  @Override
  public Application application() {
    return application;
  }

  /**
   * @return The value of the {@code involvement} attribute
   */
  @JsonProperty("involvement")
  @Override
  public Involvement involvement() {
    return involvement;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApplicationInvolvement#application() application} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for application
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplicationInvolvement withApplication(Application value) {
    if (this.application == value) return this;
    Application newValue = Objects.requireNonNull(value, "application");
    return new ImmutableApplicationInvolvement(newValue, this.involvement);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ApplicationInvolvement#involvement() involvement} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for involvement
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableApplicationInvolvement withInvolvement(Involvement value) {
    if (this.involvement == value) return this;
    Involvement newValue = Objects.requireNonNull(value, "involvement");
    return new ImmutableApplicationInvolvement(this.application, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableApplicationInvolvement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableApplicationInvolvement
        && equalTo((ImmutableApplicationInvolvement) another);
  }

  private boolean equalTo(ImmutableApplicationInvolvement another) {
    return application.equals(another.application)
        && involvement.equals(another.involvement);
  }

  /**
   * Computes a hash code from attributes: {@code application}, {@code involvement}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + application.hashCode();
    h += (h << 5) + involvement.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ApplicationInvolvement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ApplicationInvolvement{"
        + "application=" + application
        + ", involvement=" + involvement
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ApplicationInvolvement {
    Application application;
    Involvement involvement;
    @JsonProperty("application")
    public void setApplication(Application application) {
      this.application = application;
    }
    @JsonProperty("involvement")
    public void setInvolvement(Involvement involvement) {
      this.involvement = involvement;
    }
    @Override
    public Application application() { throw new UnsupportedOperationException(); }
    @Override
    public Involvement involvement() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableApplicationInvolvement fromJson(Json json) {
    ImmutableApplicationInvolvement.Builder builder = ImmutableApplicationInvolvement.builder();
    if (json.application != null) {
      builder.application(json.application);
    }
    if (json.involvement != null) {
      builder.involvement(json.involvement);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ApplicationInvolvement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ApplicationInvolvement instance
   */
  public static ImmutableApplicationInvolvement copyOf(ApplicationInvolvement instance) {
    if (instance instanceof ImmutableApplicationInvolvement) {
      return (ImmutableApplicationInvolvement) instance;
    }
    return ImmutableApplicationInvolvement.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableApplicationInvolvement ImmutableApplicationInvolvement}.
   * @return A new ImmutableApplicationInvolvement builder
   */
  public static ImmutableApplicationInvolvement.Builder builder() {
    return new ImmutableApplicationInvolvement.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableApplicationInvolvement ImmutableApplicationInvolvement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_APPLICATION = 0x1L;
    private static final long INIT_BIT_INVOLVEMENT = 0x2L;
    private long initBits = 0x3L;

    private Application application;
    private Involvement involvement;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ApplicationInvolvement} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ApplicationInvolvement instance) {
      Objects.requireNonNull(instance, "instance");
      application(instance.application());
      involvement(instance.involvement());
      return this;
    }

    /**
     * Initializes the value for the {@link ApplicationInvolvement#application() application} attribute.
     * @param application The value for application 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("application")
    public final Builder application(Application application) {
      this.application = Objects.requireNonNull(application, "application");
      initBits &= ~INIT_BIT_APPLICATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ApplicationInvolvement#involvement() involvement} attribute.
     * @param involvement The value for involvement 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("involvement")
    public final Builder involvement(Involvement involvement) {
      this.involvement = Objects.requireNonNull(involvement, "involvement");
      initBits &= ~INIT_BIT_INVOLVEMENT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableApplicationInvolvement ImmutableApplicationInvolvement}.
     * @return An immutable instance of ApplicationInvolvement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableApplicationInvolvement build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableApplicationInvolvement(application, involvement);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_APPLICATION) != 0) attributes.add("application");
      if ((initBits & INIT_BIT_INVOLVEMENT) != 0) attributes.add("involvement");
      return "Cannot build ApplicationInvolvement, some of required attributes are not set " + attributes;
    }
  }
}
