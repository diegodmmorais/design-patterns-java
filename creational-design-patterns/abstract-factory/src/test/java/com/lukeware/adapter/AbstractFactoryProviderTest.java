package com.lukeware.adapter;

import com.lukeware.adapter.entity.aquaticanimal.TypeAnimalAquatic;
import com.lukeware.adapter.entity.landanimal.TypeAnimalLand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Abstract factory provider test")
class AbstractFactoryProviderTest {

  @Test
  @DisplayName("1 - create abstract factory provider dolphin")
  void createDolphin() {
    final var animalFactory = AbstractFactoryProvider.getInstance().create(TypeAnimal.AQUATIC);
    final var dolphin = animalFactory.create(TypeAnimalAquatic.DOLPHIN);

    Assertions.assertEquals("Fuuuuiimmmm!", dolphin.toMake());
  }

  @Test
  @DisplayName("2 - create abstract factory provider fish")
  void createFish() {
    final var animalFactory = AbstractFactoryProvider.getInstance().create(TypeAnimal.AQUATIC);
    final var fish = animalFactory.create(TypeAnimalAquatic.FISH);

    Assertions.assertEquals("glup glup!", fish.toMake());
  }

  @Test
  @DisplayName("3 - create abstract factory provider whale")
  void createWhale() {
    final var animalFactory = AbstractFactoryProvider.getInstance().create(TypeAnimal.AQUATIC);
    final var fish = animalFactory.create(TypeAnimalAquatic.WHALE);

    Assertions.assertEquals("uuuuuummmmmm!", fish.toMake());
  }


  @Test
  @DisplayName("4 - create abstract factory provider cat")
  void createCat() {
    final var animalFactory = AbstractFactoryProvider.getInstance().create(TypeAnimal.LAND);
    final var cat = animalFactory.create(TypeAnimalLand.CAT);

    Assertions.assertEquals("Miau Miau!", cat.toMake());
  }

  @Test
  @DisplayName("5 - create abstract factory provider dog")
  void createDog() {
    final var animalFactory = AbstractFactoryProvider.getInstance().create(TypeAnimal.LAND);
    final var dog = animalFactory.create(TypeAnimalLand.DOG);

    Assertions.assertEquals("Auau Auau!", dog.toMake());
  }

  @Test
  @DisplayName("6 - create abstract factory provider cow")
  void createCow() {
    final var animalFactory = AbstractFactoryProvider.getInstance().create(TypeAnimal.LAND);
    final var cow = animalFactory.create(TypeAnimalLand.COW);

    Assertions.assertEquals("Mooooommmm!", cow.toMake());
  }
}