package com.lukeware.observer.entity.representative;

/**
 * @author Diego Morais
 */
public final class RepresentativeBuilder {

  String identifierDocument;
  String firstName;
  String lastName;

  private RepresentativeBuilder() {
    super();
  }

  public static RepresentativeBuilder builder() {
    return new RepresentativeBuilder();
  }

  public RepresentativeBuilder firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public RepresentativeBuilder lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public RepresentativeBuilder identifierDocument(String identifierDocument) {
    this.identifierDocument = identifierDocument;
    return this;
  }


  public IRepresentative build() {
    return new Representative(this.identifierDocument, this.firstName, this.lastName);
  }

}
