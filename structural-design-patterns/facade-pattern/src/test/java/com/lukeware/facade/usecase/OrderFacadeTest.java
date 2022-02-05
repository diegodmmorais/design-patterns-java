package com.lukeware.facade.usecase;

import com.lukeware.facade.usecase.customer.CustomerFactory;
import com.lukeware.facade.usecase.order.OrderFactory;
import com.lukeware.facade.usecase.product.ProductFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Diego Morais
 */
@DisplayName("Order facade test")
class OrderFacadeTest {

  private IOrderFacade orderFacade;

  @BeforeEach
  void setUp() {
    final var customerInteractor = CustomerFactory.getInstance().create();
    final var productInteractor = ProductFactory.getInstance().create();
    final var orderInteractor = OrderFactory.getInstance().create();
    this.orderFacade = OrdeFacadeFactory.getInstance().create(customerInteractor,
                                                              productInteractor,
                                                              orderInteractor);
  }


  @Test
  @DisplayName("save new order")
  void saveNewOrder() {
    Set<ItemsRequest> items = new LinkedHashSet<>();
    items.add(new ItemsRequest("123789456", 10.0));
    items.add(new ItemsRequest("456123789", 95.58));
    items.add(new ItemsRequest("789123456", 25.18));

    final var orderRequest = new OrderRequest("Jonh", items);

    Assertions.assertDoesNotThrow(() -> orderFacade.save(orderRequest));
  }

}