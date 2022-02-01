package com.lukeware.adapterpattern.entity.aquaticanimal;

import com.lukeware.adapterpattern.IAnimalFactory;
import com.lukeware.adapterpattern.entity.IAnimal;

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

  @Override
  public IAnimal create(TypeAnimalAquatic type) {
    return switch (type) {
      case WHALE -> new Whale();
      case FISH -> new Fish();
      case DOLPHIN -> new Dolphin();
    };
  }

  private static <T> boolean isaNull(T t) {
    return Objects.isNull(t);
  }
}
