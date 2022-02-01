package com.lukeware.builderpattern.entity;

/**
 * @author Diego Morais
 */
public final class CustomerBuilder {

  private String name;
  private String lastName;
  private String phone;
  private String identifierDocument;
  private String email;

  private CustomerBuilder() {
    super();
  }

  public static CustomerBuilder builder() {
    return new CustomerBuilder();
  }

  public CustomerBuilder name(String name) {
    this.name = name;
    return this;
  }

  public CustomerBuilder lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public CustomerBuilder phone(String phone) {
    this.phone = phone;
    return this;
  }

  public CustomerBuilder identifierDocument(String identifierDocument) {
    this.identifierDocument = identifierDocument;
    return this;
  }

  public CustomerBuilder email(String email) {
    this.email = email;
    return this;
  }

  public ICustomer build() {
    return new Customer(this.name, this.lastName, this.phone, this.identifierDocument, this.email);
  }

}
