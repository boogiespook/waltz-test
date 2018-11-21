package com.khartec.waltz.model.person;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Person"})
public final class ImmutablePerson extends Person {
  private final String employeeId;
  private final String displayName;
  private final String email;
  private final boolean isRemoved;
  private final PersonKind personKind;
  private final String title;
  private final String mobilePhone;
  private final String officePhone;
  private final String userPrincipalName;
  private final String managerEmployeeId;
  private final String departmentName;
  private final Long organisationalUnitId;
  private final String userId;
  private final EntityKind kind;
  private final Long id;

  private ImmutablePerson(ImmutablePerson.Builder builder) {
    this.employeeId = builder.employeeId;
    this.displayName = builder.displayName;
    this.email = builder.email;
    this.isRemoved = builder.isRemoved;
    this.personKind = builder.personKind;
    this.title = builder.title;
    this.mobilePhone = builder.mobilePhone;
    this.officePhone = builder.officePhone;
    this.userPrincipalName = builder.userPrincipalName;
    this.managerEmployeeId = builder.managerEmployeeId;
    this.departmentName = builder.departmentName;
    this.organisationalUnitId = builder.organisationalUnitId;
    this.id = builder.id;
    if (builder.userId != null) {
      initShim.userId(builder.userId);
    }
    if (builder.kind != null) {
      initShim.kind(builder.kind);
    }
    this.userId = initShim.userId();
    this.kind = initShim.kind();
    this.initShim = null;
  }

  private ImmutablePerson(
      String employeeId,
      String displayName,
      String email,
      boolean isRemoved,
      PersonKind personKind,
      String title,
      String mobilePhone,
      String officePhone,
      String userPrincipalName,
      String managerEmployeeId,
      String departmentName,
      Long organisationalUnitId,
      String userId,
      EntityKind kind,
      Long id) {
    this.employeeId = employeeId;
    this.displayName = displayName;
    this.email = email;
    this.isRemoved = isRemoved;
    this.personKind = personKind;
    this.title = title;
    this.mobilePhone = mobilePhone;
    this.officePhone = officePhone;
    this.userPrincipalName = userPrincipalName;
    this.managerEmployeeId = managerEmployeeId;
    this.departmentName = departmentName;
    this.organisationalUnitId = organisationalUnitId;
    this.userId = userId;
    this.kind = kind;
    this.id = id;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String userId;
    private int userIdBuildStage;

    String userId() {
      if (userIdBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (userIdBuildStage == STAGE_UNINITIALIZED) {
        userIdBuildStage = STAGE_INITIALIZING;
        this.userId = Objects.requireNonNull(ImmutablePerson.super.userId(), "userId");
        userIdBuildStage = STAGE_INITIALIZED;
      }
      return this.userId;
    }

    void userId(String userId) {
      this.userId = userId;
      userIdBuildStage = STAGE_INITIALIZED;
    }
    private EntityKind kind;
    private int kindBuildStage;

    EntityKind kind() {
      if (kindBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (kindBuildStage == STAGE_UNINITIALIZED) {
        kindBuildStage = STAGE_INITIALIZING;
        this.kind = Objects.requireNonNull(ImmutablePerson.super.kind(), "kind");
        kindBuildStage = STAGE_INITIALIZED;
      }
      return this.kind;
    }

    void kind(EntityKind kind) {
      this.kind = kind;
      kindBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (userIdBuildStage == STAGE_INITIALIZING) attributes.add("userId");
      if (kindBuildStage == STAGE_INITIALIZING) attributes.add("kind");
      return "Cannot build Person, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code employeeId} attribute
   */
  @JsonProperty("employeeId")
  @Override
  public String employeeId() {
    return employeeId;
  }

  /**
   * @return The value of the {@code displayName} attribute
   */
  @JsonProperty("displayName")
  @Override
  public String displayName() {
    return displayName;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @JsonProperty("email")
  @Override
  public String email() {
    return email;
  }

  /**
   * @return The value of the {@code isRemoved} attribute
   */
  @JsonProperty("isRemoved")
  @Override
  public boolean isRemoved() {
    return isRemoved;
  }

  /**
   * @return The value of the {@code personKind} attribute
   */
  @JsonProperty("personKind")
  @Override
  public PersonKind personKind() {
    return personKind;
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code mobilePhone} attribute
   */
  @JsonProperty("mobilePhone")
  @Override
  public Optional<String> mobilePhone() {
    return Optional.ofNullable(mobilePhone);
  }

  /**
   * @return The value of the {@code officePhone} attribute
   */
  @JsonProperty("officePhone")
  @Override
  public Optional<String> officePhone() {
    return Optional.ofNullable(officePhone);
  }

  /**
   * @return The value of the {@code userPrincipalName} attribute
   */
  @JsonProperty("userPrincipalName")
  @Override
  public Optional<String> userPrincipalName() {
    return Optional.ofNullable(userPrincipalName);
  }

  /**
   * @return The value of the {@code managerEmployeeId} attribute
   */
  @JsonProperty("managerEmployeeId")
  @Override
  public Optional<String> managerEmployeeId() {
    return Optional.ofNullable(managerEmployeeId);
  }

  /**
   * @return The value of the {@code departmentName} attribute
   */
  @JsonProperty("departmentName")
  @Override
  public Optional<String> departmentName() {
    return Optional.ofNullable(departmentName);
  }

  /**
   * @return The value of the {@code organisationalUnitId} attribute
   */
  @JsonProperty("organisationalUnitId")
  @Override
  public Optional<Long> organisationalUnitId() {
    return Optional.ofNullable(organisationalUnitId);
  }

  /**
   * @return The value of the {@code userId} attribute
   */
  @JsonProperty("userId")
  @Override
  public String userId() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.userId()
        : this.userId;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public EntityKind kind() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.kind()
        : this.kind;
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
   * Copy the current immutable object by setting a value for the {@link Person#employeeId() employeeId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for employeeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withEmployeeId(String value) {
    if (this.employeeId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "employeeId");
    return new ImmutablePerson(
        newValue,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#displayName() displayName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for displayName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withDisplayName(String value) {
    if (this.displayName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "displayName");
    return new ImmutablePerson(
        this.employeeId,
        newValue,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "email");
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        newValue,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#isRemoved() isRemoved} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isRemoved
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withIsRemoved(boolean value) {
    if (this.isRemoved == value) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        value,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#personKind() personKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withPersonKind(PersonKind value) {
    if (this.personKind == value) return this;
    PersonKind newValue = Objects.requireNonNull(value, "personKind");
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        newValue,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withTitle(String value) {
    String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        newValue,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withTitle(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        value,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#mobilePhone() mobilePhone} attribute.
   * @param value The value for mobilePhone
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withMobilePhone(String value) {
    String newValue = Objects.requireNonNull(value, "mobilePhone");
    if (Objects.equals(this.mobilePhone, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        newValue,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#mobilePhone() mobilePhone} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mobilePhone
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withMobilePhone(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.mobilePhone, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        value,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#officePhone() officePhone} attribute.
   * @param value The value for officePhone
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withOfficePhone(String value) {
    String newValue = Objects.requireNonNull(value, "officePhone");
    if (Objects.equals(this.officePhone, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        newValue,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#officePhone() officePhone} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for officePhone
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withOfficePhone(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.officePhone, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        value,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#userPrincipalName() userPrincipalName} attribute.
   * @param value The value for userPrincipalName
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withUserPrincipalName(String value) {
    String newValue = Objects.requireNonNull(value, "userPrincipalName");
    if (Objects.equals(this.userPrincipalName, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        newValue,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#userPrincipalName() userPrincipalName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userPrincipalName
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withUserPrincipalName(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.userPrincipalName, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        value,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#managerEmployeeId() managerEmployeeId} attribute.
   * @param value The value for managerEmployeeId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withManagerEmployeeId(String value) {
    String newValue = Objects.requireNonNull(value, "managerEmployeeId");
    if (Objects.equals(this.managerEmployeeId, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        newValue,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#managerEmployeeId() managerEmployeeId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managerEmployeeId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withManagerEmployeeId(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.managerEmployeeId, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        value,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#departmentName() departmentName} attribute.
   * @param value The value for departmentName
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withDepartmentName(String value) {
    String newValue = Objects.requireNonNull(value, "departmentName");
    if (Objects.equals(this.departmentName, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        newValue,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#departmentName() departmentName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for departmentName
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withDepartmentName(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.departmentName, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        value,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#organisationalUnitId() organisationalUnitId} attribute.
   * @param value The value for organisationalUnitId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withOrganisationalUnitId(long value) {
    Long newValue = value;
    if (Objects.equals(this.organisationalUnitId, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        newValue,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#organisationalUnitId() organisationalUnitId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organisationalUnitId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withOrganisationalUnitId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.organisationalUnitId, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        value,
        this.userId,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#userId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withUserId(String value) {
    if (this.userId.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "userId");
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        newValue,
        this.kind,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withKind(EntityKind value) {
    if (this.kind == value) return this;
    EntityKind newValue = Objects.requireNonNull(value, "kind");
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withId(long value) {
    Long newValue = value;
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withId(Optional<Long> optional) {
    Long value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePerson(
        this.employeeId,
        this.displayName,
        this.email,
        this.isRemoved,
        this.personKind,
        this.title,
        this.mobilePhone,
        this.officePhone,
        this.userPrincipalName,
        this.managerEmployeeId,
        this.departmentName,
        this.organisationalUnitId,
        this.userId,
        this.kind,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return employeeId.equals(another.employeeId)
        && displayName.equals(another.displayName)
        && email.equals(another.email)
        && isRemoved == another.isRemoved
        && personKind.equals(another.personKind)
        && Objects.equals(title, another.title)
        && Objects.equals(mobilePhone, another.mobilePhone)
        && Objects.equals(officePhone, another.officePhone)
        && Objects.equals(userPrincipalName, another.userPrincipalName)
        && Objects.equals(managerEmployeeId, another.managerEmployeeId)
        && Objects.equals(departmentName, another.departmentName)
        && Objects.equals(organisationalUnitId, another.organisationalUnitId)
        && userId.equals(another.userId)
        && kind.equals(another.kind)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code employeeId}, {@code displayName}, {@code email}, {@code isRemoved}, {@code personKind}, {@code title}, {@code mobilePhone}, {@code officePhone}, {@code userPrincipalName}, {@code managerEmployeeId}, {@code departmentName}, {@code organisationalUnitId}, {@code userId}, {@code kind}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + employeeId.hashCode();
    h += (h << 5) + displayName.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Boolean.hashCode(isRemoved);
    h += (h << 5) + personKind.hashCode();
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(mobilePhone);
    h += (h << 5) + Objects.hashCode(officePhone);
    h += (h << 5) + Objects.hashCode(userPrincipalName);
    h += (h << 5) + Objects.hashCode(managerEmployeeId);
    h += (h << 5) + Objects.hashCode(departmentName);
    h += (h << 5) + Objects.hashCode(organisationalUnitId);
    h += (h << 5) + userId.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Person{");
    builder.append("employeeId=").append(employeeId);
    builder.append(", ");
    builder.append("displayName=").append(displayName);
    builder.append(", ");
    builder.append("email=").append(email);
    builder.append(", ");
    builder.append("isRemoved=").append(isRemoved);
    builder.append(", ");
    builder.append("personKind=").append(personKind);
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (mobilePhone != null) {
      builder.append(", ");
      builder.append("mobilePhone=").append(mobilePhone);
    }
    if (officePhone != null) {
      builder.append(", ");
      builder.append("officePhone=").append(officePhone);
    }
    if (userPrincipalName != null) {
      builder.append(", ");
      builder.append("userPrincipalName=").append(userPrincipalName);
    }
    if (managerEmployeeId != null) {
      builder.append(", ");
      builder.append("managerEmployeeId=").append(managerEmployeeId);
    }
    if (departmentName != null) {
      builder.append(", ");
      builder.append("departmentName=").append(departmentName);
    }
    if (organisationalUnitId != null) {
      builder.append(", ");
      builder.append("organisationalUnitId=").append(organisationalUnitId);
    }
    builder.append(", ");
    builder.append("userId=").append(userId);
    builder.append(", ");
    builder.append("kind=").append(kind);
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
  static final class Json extends Person {
    String employeeId;
    String displayName;
    String email;
    boolean isRemoved;
    boolean isRemovedIsSet;
    PersonKind personKind;
    Optional<String> title = Optional.empty();
    Optional<String> mobilePhone = Optional.empty();
    Optional<String> officePhone = Optional.empty();
    Optional<String> userPrincipalName = Optional.empty();
    Optional<String> managerEmployeeId = Optional.empty();
    Optional<String> departmentName = Optional.empty();
    Optional<Long> organisationalUnitId = Optional.empty();
    String userId;
    EntityKind kind;
    Optional<Long> id = Optional.empty();
    @JsonProperty("employeeId")
    public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
    }
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    @JsonProperty("email")
    public void setEmail(String email) {
      this.email = email;
    }
    @JsonProperty("isRemoved")
    public void setIsRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      this.isRemovedIsSet = true;
    }
    @JsonProperty("personKind")
    public void setPersonKind(PersonKind personKind) {
      this.personKind = personKind;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
    }
    @JsonProperty("mobilePhone")
    public void setMobilePhone(Optional<String> mobilePhone) {
      this.mobilePhone = mobilePhone;
    }
    @JsonProperty("officePhone")
    public void setOfficePhone(Optional<String> officePhone) {
      this.officePhone = officePhone;
    }
    @JsonProperty("userPrincipalName")
    public void setUserPrincipalName(Optional<String> userPrincipalName) {
      this.userPrincipalName = userPrincipalName;
    }
    @JsonProperty("managerEmployeeId")
    public void setManagerEmployeeId(Optional<String> managerEmployeeId) {
      this.managerEmployeeId = managerEmployeeId;
    }
    @JsonProperty("departmentName")
    public void setDepartmentName(Optional<String> departmentName) {
      this.departmentName = departmentName;
    }
    @JsonProperty("organisationalUnitId")
    public void setOrganisationalUnitId(Optional<Long> organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
    }
    @JsonProperty("userId")
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty("kind")
    public void setKind(EntityKind kind) {
      this.kind = kind;
    }
    @JsonProperty("id")
    public void setId(Optional<Long> id) {
      this.id = id;
    }
    @Override
    public String employeeId() { throw new UnsupportedOperationException(); }
    @Override
    public String displayName() { throw new UnsupportedOperationException(); }
    @Override
    public String email() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isRemoved() { throw new UnsupportedOperationException(); }
    @Override
    public PersonKind personKind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> mobilePhone() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> officePhone() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> userPrincipalName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> managerEmployeeId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> departmentName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Long> organisationalUnitId() { throw new UnsupportedOperationException(); }
    @Override
    public String userId() { throw new UnsupportedOperationException(); }
    @Override
    public EntityKind kind() { throw new UnsupportedOperationException(); }
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
  static ImmutablePerson fromJson(Json json) {
    ImmutablePerson.Builder builder = ImmutablePerson.builder();
    if (json.employeeId != null) {
      builder.employeeId(json.employeeId);
    }
    if (json.displayName != null) {
      builder.displayName(json.displayName);
    }
    if (json.email != null) {
      builder.email(json.email);
    }
    if (json.isRemovedIsSet) {
      builder.isRemoved(json.isRemoved);
    }
    if (json.personKind != null) {
      builder.personKind(json.personKind);
    }
    if (json.title != null) {
      builder.title(json.title);
    }
    if (json.mobilePhone != null) {
      builder.mobilePhone(json.mobilePhone);
    }
    if (json.officePhone != null) {
      builder.officePhone(json.officePhone);
    }
    if (json.userPrincipalName != null) {
      builder.userPrincipalName(json.userPrincipalName);
    }
    if (json.managerEmployeeId != null) {
      builder.managerEmployeeId(json.managerEmployeeId);
    }
    if (json.departmentName != null) {
      builder.departmentName(json.departmentName);
    }
    if (json.organisationalUnitId != null) {
      builder.organisationalUnitId(json.organisationalUnitId);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Person} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static ImmutablePerson copyOf(Person instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ImmutablePerson.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson ImmutablePerson}.
   * @return A new ImmutablePerson builder
   */
  public static ImmutablePerson.Builder builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_EMPLOYEE_ID = 0x1L;
    private static final long INIT_BIT_DISPLAY_NAME = 0x2L;
    private static final long INIT_BIT_EMAIL = 0x4L;
    private static final long INIT_BIT_IS_REMOVED = 0x8L;
    private static final long INIT_BIT_PERSON_KIND = 0x10L;
    private long initBits = 0x1fL;

    private String employeeId;
    private String displayName;
    private String email;
    private boolean isRemoved;
    private PersonKind personKind;
    private String title;
    private String mobilePhone;
    private String officePhone;
    private String userPrincipalName;
    private String managerEmployeeId;
    private String departmentName;
    private Long organisationalUnitId;
    private String userId;
    private EntityKind kind;
    private Long id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.khartec.waltz.model.person.Person} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person instance) {
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
      long bits = 0;
      if (object instanceof Person) {
        Person instance = (Person) object;
        Optional<String> departmentNameOptional = instance.departmentName();
        if (departmentNameOptional.isPresent()) {
          departmentName(departmentNameOptional);
        }
        displayName(instance.displayName());
        personKind(instance.personKind());
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
        employeeId(instance.employeeId());
        Optional<String> titleOptional = instance.title();
        if (titleOptional.isPresent()) {
          title(titleOptional);
        }
        userId(instance.userId());
        Optional<String> managerEmployeeIdOptional = instance.managerEmployeeId();
        if (managerEmployeeIdOptional.isPresent()) {
          managerEmployeeId(managerEmployeeIdOptional);
        }
        isRemoved(instance.isRemoved());
        Optional<String> mobilePhoneOptional = instance.mobilePhone();
        if (mobilePhoneOptional.isPresent()) {
          mobilePhone(mobilePhoneOptional);
        }
        Optional<String> officePhoneOptional = instance.officePhone();
        if (officePhoneOptional.isPresent()) {
          officePhone(officePhoneOptional);
        }
        Optional<Long> organisationalUnitIdOptional = instance.organisationalUnitId();
        if (organisationalUnitIdOptional.isPresent()) {
          organisationalUnitId(organisationalUnitIdOptional);
        }
        email(instance.email());
        Optional<String> userPrincipalNameOptional = instance.userPrincipalName();
        if (userPrincipalNameOptional.isPresent()) {
          userPrincipalName(userPrincipalNameOptional);
        }
      }
      if (object instanceof EntityKindProvider) {
        EntityKindProvider instance = (EntityKindProvider) object;
        if ((bits & 0x1L) == 0) {
          kind(instance.kind());
          bits |= 0x1L;
        }
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
     * Initializes the value for the {@link Person#employeeId() employeeId} attribute.
     * @param employeeId The value for employeeId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("employeeId")
    public final Builder employeeId(String employeeId) {
      this.employeeId = Objects.requireNonNull(employeeId, "employeeId");
      initBits &= ~INIT_BIT_EMPLOYEE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#displayName() displayName} attribute.
     * @param displayName The value for displayName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("displayName")
    public final Builder displayName(String displayName) {
      this.displayName = Objects.requireNonNull(displayName, "displayName");
      initBits &= ~INIT_BIT_DISPLAY_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("email")
    public final Builder email(String email) {
      this.email = Objects.requireNonNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#isRemoved() isRemoved} attribute.
     * @param isRemoved The value for isRemoved 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isRemoved")
    public final Builder isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      initBits &= ~INIT_BIT_IS_REMOVED;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#personKind() personKind} attribute.
     * @param personKind The value for personKind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("personKind")
    public final Builder personKind(PersonKind personKind) {
      this.personKind = Objects.requireNonNull(personKind, "personKind");
      initBits &= ~INIT_BIT_PERSON_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      this.title = title.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Person#mobilePhone() mobilePhone} to mobilePhone.
     * @param mobilePhone The value for mobilePhone
     * @return {@code this} builder for chained invocation
     */
    public final Builder mobilePhone(String mobilePhone) {
      this.mobilePhone = Objects.requireNonNull(mobilePhone, "mobilePhone");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#mobilePhone() mobilePhone} to mobilePhone.
     * @param mobilePhone The value for mobilePhone
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mobilePhone")
    public final Builder mobilePhone(Optional<String> mobilePhone) {
      this.mobilePhone = mobilePhone.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Person#officePhone() officePhone} to officePhone.
     * @param officePhone The value for officePhone
     * @return {@code this} builder for chained invocation
     */
    public final Builder officePhone(String officePhone) {
      this.officePhone = Objects.requireNonNull(officePhone, "officePhone");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#officePhone() officePhone} to officePhone.
     * @param officePhone The value for officePhone
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("officePhone")
    public final Builder officePhone(Optional<String> officePhone) {
      this.officePhone = officePhone.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Person#userPrincipalName() userPrincipalName} to userPrincipalName.
     * @param userPrincipalName The value for userPrincipalName
     * @return {@code this} builder for chained invocation
     */
    public final Builder userPrincipalName(String userPrincipalName) {
      this.userPrincipalName = Objects.requireNonNull(userPrincipalName, "userPrincipalName");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#userPrincipalName() userPrincipalName} to userPrincipalName.
     * @param userPrincipalName The value for userPrincipalName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userPrincipalName")
    public final Builder userPrincipalName(Optional<String> userPrincipalName) {
      this.userPrincipalName = userPrincipalName.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Person#managerEmployeeId() managerEmployeeId} to managerEmployeeId.
     * @param managerEmployeeId The value for managerEmployeeId
     * @return {@code this} builder for chained invocation
     */
    public final Builder managerEmployeeId(String managerEmployeeId) {
      this.managerEmployeeId = Objects.requireNonNull(managerEmployeeId, "managerEmployeeId");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#managerEmployeeId() managerEmployeeId} to managerEmployeeId.
     * @param managerEmployeeId The value for managerEmployeeId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("managerEmployeeId")
    public final Builder managerEmployeeId(Optional<String> managerEmployeeId) {
      this.managerEmployeeId = managerEmployeeId.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Person#departmentName() departmentName} to departmentName.
     * @param departmentName The value for departmentName
     * @return {@code this} builder for chained invocation
     */
    public final Builder departmentName(String departmentName) {
      this.departmentName = Objects.requireNonNull(departmentName, "departmentName");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#departmentName() departmentName} to departmentName.
     * @param departmentName The value for departmentName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("departmentName")
    public final Builder departmentName(Optional<String> departmentName) {
      this.departmentName = departmentName.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Person#organisationalUnitId() organisationalUnitId} to organisationalUnitId.
     * @param organisationalUnitId The value for organisationalUnitId
     * @return {@code this} builder for chained invocation
     */
    public final Builder organisationalUnitId(long organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#organisationalUnitId() organisationalUnitId} to organisationalUnitId.
     * @param organisationalUnitId The value for organisationalUnitId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organisationalUnitId")
    public final Builder organisationalUnitId(Optional<Long> organisationalUnitId) {
      this.organisationalUnitId = organisationalUnitId.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Person#userId() userId} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Person#userId() userId}.</em>
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userId")
    public final Builder userId(String userId) {
      this.userId = Objects.requireNonNull(userId, "userId");
      return this;
    }

    /**
     * Initializes the value for the {@link Person#kind() kind} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Person#kind() kind}.</em>
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(EntityKind kind) {
      this.kind = Objects.requireNonNull(kind, "kind");
      return this;
    }

    /**
     * Initializes the optional value {@link Person#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<Long> id) {
      this.id = id.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_EMPLOYEE_ID) != 0) attributes.add("employeeId");
      if ((initBits & INIT_BIT_DISPLAY_NAME) != 0) attributes.add("displayName");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_IS_REMOVED) != 0) attributes.add("isRemoved");
      if ((initBits & INIT_BIT_PERSON_KIND) != 0) attributes.add("personKind");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }
}
