package com.lukeware.facade.usecase;

import java.util.Set;

/**
 * @author Diego Morais
 */
public final record OrderRequest(String customerName, Set<ItemsRequest> items) {

  @Override
  public Set<ItemsRequest> items() {
    return this.items;
  }

  @Override
  public String customerName() {
    return customerName;
  }
}
