package com.lukeware.facade.usecase.product;

import java.util.Objects;

/**
 * @author
 */
public class ProductFactory {

  private static ProductFactory instance;

  private ProductFactory() {
    super();
  }

  public static ProductFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (ProductFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new ProductFactory();
        }
      }
    }
    return instance;
  }


  public IProductInteractor create() {
    return new ProductInteractor();
  }

}
