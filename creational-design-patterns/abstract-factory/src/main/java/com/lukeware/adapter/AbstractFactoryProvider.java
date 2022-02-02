package com.lukeware.adapter;

import com.lukeware.adapter.entity.aquaticanimal.AquaticAnimalFactory;
import com.lukeware.adapter.entity.landanimal.LandAnimalFactory;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class AbstractFactoryProvider {

  private static AbstractFactoryProvider instance;

  public static AbstractFactoryProvider getInstance() {
    if (Objects.isNull(AbstractFactoryProvider.instance)) {
      synchronized (AbstractFactoryProvider.class) {
        if (Objects.isNull(AbstractFactoryProvider.instance)) {
          AbstractFactoryProvider.instance = new AbstractFactoryProvider();
        }
      }
    }
    return instance;
  }

  IAnimalFactory create(TypeAnimal typeAnimal) {
    return switch (typeAnimal) {
      case AQUATIC -> AquaticAnimalFactory.getInstance();
      case LAND -> LandAnimalFactory.getInstance();
    };
  }
}
