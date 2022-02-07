package com.lukeware.abstract1.entity.aquaticanimal;

import com.lukeware.abstract1.IAnimalFactory;
import com.lukeware.abstract1.entity.IAnimal;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class AquaticAnimalFactory implements IAnimalFactory<TypeAnimalAquatic> {

  private static AquaticAnimalFactory instance;

  private AquaticAnimalFactory() {
    super();
  }

  public static IAnimalFactory getInstance() {
    if (isaNull(AquaticAnimalFactory.instance)) {
      synchronized (AquaticAnimalFactory.class) {
        if (isaNull(AquaticAnimalFactory.instance)) {
          AquaticAnimalFactory.instance = new AquaticAnimalFactory();
        }
      }
    }
    return instance;
  }

  private static <T> boolean isaNull(T t) {
    return Objects.isNull(t);
  }

  @Override
  public IAnimal create(TypeAnimalAquatic type) {
    return switch (type) {
      case WHALE -> new Whale();
      case FISH -> new Fish();
      case DOLPHIN -> new Dolphin();
    };
  }
}
