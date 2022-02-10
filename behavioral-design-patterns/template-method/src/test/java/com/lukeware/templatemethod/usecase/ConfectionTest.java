package com.lukeware.templatemethod.usecase;

import com.lukeware.templatemethod.usecase.blouse.BlouseBuilder;
import com.lukeware.templatemethod.usecase.shirt.ShirtBuilder;
import com.lukeware.templatemethod.usecase.tshirt.TShirtBuilder;
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
    final var shirts = ShirtBuilder.builder().build();
    Assertions.assertDoesNotThrow(() -> shirts.make());
  }

  @Test
  @DisplayName("Confection tshirt")
  void confectionShoes() {
    final var tshirt = TShirtBuilder.builder().build();
    Assertions.assertDoesNotThrow(() -> tshirt.make());
  }


  @Test
  @DisplayName("Confection blouse")
  void confectionSneakers() {
    final var blouse = BlouseBuilder.builder().build();
    Assertions.assertDoesNotThrow(() -> blouse.make());
  }

}