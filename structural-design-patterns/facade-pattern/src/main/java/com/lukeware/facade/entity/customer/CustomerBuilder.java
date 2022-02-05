package com.lukeware.facade.entity.customer;

/**
 * @author Diego Morais
 */
public final class CustomerBuilder {

  String name;
  String identifierDocument;

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

  public CustomerBuilder identifierDocument(String identifierDocument) {
    this.identifierDocument = identifierDocument;
    return this;
  }

  public ICustomer build() {
    return new Customer(this.identifierDocument, this.name);
  }

}
