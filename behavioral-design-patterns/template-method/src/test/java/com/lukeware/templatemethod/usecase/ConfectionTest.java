package com.lukeware.templatemethod.usecase;

import com.lukeware.templatemethod.usecase.shirts.ShirtsBuilder;
import com.lukeware.templatemethod.usecase.shoes.ShoesBuilder;
import com.lukeware.templatemethod.usecase.sneakers.SneakersBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Confection test")
class ConfectionTest {

  @Test
  @DisplayName("Confection shirt")
  void confectionShirt() {
    final var shirts = ShirtsBuilder.builder().build();
    Assertions.assertDoesNotThrow(() -> shirts.make());
  }

  @Test
  @DisplayName("Confection shoes")
  void confectionShoes() {
    final var shoes = ShoesBuilder.builder().build();
    Assertions.assertDoesNotThrow(() -> shoes.make());
  }


  @Test
  @DisplayName("Confection sneakers")
  void confectionSneakers() {
    final var sneakers = SneakersBuilder.builder().build();
    Assertions.assertDoesNotThrow(() -> sneakers.make());
  }

}