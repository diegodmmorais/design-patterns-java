package com.lukeware.abstract1.entity.landanimal;

import com.lukeware.abstract1.IAnimalFactory;
import com.lukeware.abstract1.entity.IAnimal;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class LandAnimalFactory implements IAnimalFactory<TypeAnimalLand> {

  private static LandAnimalFactory instance;

  private LandAnimalFactory() {
    super();
  }

  public static IAnimalFactory getInstance() {
    if (isaNull(LandAnimalFactory.instance)) {
      synchronized (LandAnimalFactory.class) {
        if (isaNull(LandAnimalFactory.instance)) {
          LandAnimalFactory.instance = new LandAnimalFactory();
        }
      }
    }
    return instance;
  }

  private static <T> boolean isaNull(T t) {
    return Objects.isNull(t);
  }

  @Override
  public IAnimal create(TypeAnimalLand type) {
    return switch (type) {
      case CAT -> new Cat();
      case COW -> new Cow();
      case DOG -> new Dog();
    };
  }
}
