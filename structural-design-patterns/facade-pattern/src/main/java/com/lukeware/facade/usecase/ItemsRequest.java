package com.lukeware.facade.usecase;

/**
 * @author
 */
public final record ItemsRequest(String identifierCode, double price) {

  public String identifierCode() {
    return this.identifierCode;
  }

  @Override
  public double price() {
    return price;
  }
}
