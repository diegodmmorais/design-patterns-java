package com.lukeware.builder.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Customer builder test")
class CustomerBuilderTest {

  @Test
  @DisplayName("1 - buider customer")
  void builder() {
    final var customer = CustomerBuilder.builder()
                                        .name("Jonh")
                                        .lastName("Dave")
                                        .phone("+55 19 9 9989-8978")
                                        .identifierDocument("999.999.999-99")
                                        .email("customer.dave@gmail.com")
                                        .build();

    Assertions.assertEquals("Jonh", customer.name());
    Assertions.assertEquals("Dave", customer.lastName());
    Assertions.assertEquals("+55 19 9 9989-8978", customer.phone());
    Assertions.assertEquals("999.999.999-99", customer.identifierDocument());
    Assertions.assertEquals("customer.dave@gmail.com", customer.email());
  }
}