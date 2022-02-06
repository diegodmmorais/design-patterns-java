package com.lukeware.observer.entity.company;

/**
 * @author Diego morais
 */
public final class CompanyBuilder {
  String idenfierDocument;
  String data;

  private CompanyBuilder() {
    super();
  }

  public static CompanyBuilder builder() {
    return new CompanyBuilder();
  }


  public CompanyBuilder data(String data) {
    this.data = data;
    return this;
  }

  public CompanyBuilder idenfierDocument(String idenfierDocument) {
    this.idenfierDocument = idenfierDocument;
    return this;
  }


  public IComapny build() {
    return new Company(this.idenfierDocument, this.data);
  }

}
