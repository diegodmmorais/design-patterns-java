package com.lukeware.facade.usecase;

import com.lukeware.facade.entity.item.IItem;
import com.lukeware.facade.entity.item.ItemBuilder;
import com.lukeware.facade.entity.order.OrderBuilder;
import com.lukeware.facade.usecase.customer.ICustomerInteractor;
import com.lukeware.facade.usecase.order.IOrderInteractor;
import com.lukeware.facade.usecase.product.IProductInteractor;

import java.util.stream.Collectors;

/**
 * @author Diego Morais
 */
final record OrderFacade(ICustomerInteractor customerInteractor,
                         IProductInteractor productInteractor,
                         IOrderInteractor orderInteractor) implements IOrderFacade {


  @Override
  public void save(OrderRequest request) {
    final var customer = customerInteractor.findName(request.customerName());

    final var itens = request.items()
                             .stream()
                             .map(this::createItem)
                             .collect(Collectors.toSet());

    orderInteractor.save(OrderBuilder.builder().customer(customer).items(itens).build());
  }

  private IItem createItem(ItemsRequest item) {
    final var product = productInteractor.findByIdenfifiercode(item.identifierCode());
    return ItemBuilder.builder().price(item.price()).product(product).build();
  }


}
