package com.lukeware.factorypattern.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Animal factory test")
class AnimalFactoryTest {

  @Test
  @DisplayName("1 - create dog")
  void createDog() {
    final var animal = AnimalFactory.getInstance().createDog();
    Assertions.assertEquals("Auau Auau!", animal.toMake());
  }

  @Test
  @DisplayName("2 - create cow")
  void createCow() {
    final var animal = AnimalFactory.getInstance().createCow();
    Assertions.assertEquals("Mooooommmm!", animal.toMake());
  }

  @Test
  @DisplayName("3 - create cat")
  void createCat() {
    final var animal = AnimalFactory.getInstance().createCat();
    Assertions.assertEquals("Miau Miau!", animal.toMake());
  }

  @Test
  @DisplayName("4 - create animal")
  void create() {
    final var animal = AnimalFactory.getInstance().create(TypeAnimal.CAT);
    Assertions.assertEquals("Miau Miau!", animal.toMake());
  }
}