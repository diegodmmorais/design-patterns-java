package com.lukeware.strategy.usecase;

import com.lukeware.strategy.entity.item.ItemBuilder;
import com.lukeware.strategy.entity.order.OrderBuilder;
import com.lukeware.strategy.entity.payment.BankSlipPayment;
import com.lukeware.strategy.entity.payment.CreditCardPayment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Diego Morais
 */
@DisplayName("Order interactor test")
class OrderInteractorTest {


  @Test
  @DisplayName("finish order credit card payment")
  void finishOrderCreditCardPayment() {
    final var orderInteractor = new OrderInteractor();
    final var payment = new CreditCardPayment(12, 10);
    final var items = Stream.of(ItemBuilder.builder().price(98.69).build(), ItemBuilder.builder().price(190.49).build())
                            .collect(Collectors.toSet());
    final var order = OrderBuilder.builder()
                                  .items(items)
                                  .payment(payment)
                                  .build();
    Assertions.assertDoesNotThrow(() -> orderInteractor.finishOrder(order));
  }


  @Test
  @DisplayName("finish order bank slip payment")
  void finishOrderBankSlipPayment() {
    final var orderInteractor = new OrderInteractor();
    final var payment = new BankSlipPayment(12);
    final var items = Stream.of(ItemBuilder.builder().price(98.69).build(), ItemBuilder.builder().price(190.49).build())
                            .collect(Collectors.toSet());
    final var order = OrderBuilder.builder()
                                  .items(items)
                                  .payment(payment)
                                  .build();
    Assertions.assertDoesNotThrow(() -> orderInteractor.finishOrder(order));
  }

}