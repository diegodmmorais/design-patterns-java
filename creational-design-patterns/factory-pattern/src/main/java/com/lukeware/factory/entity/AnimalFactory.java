package com.lukeware.factory.entity;

import com.lukeware.factory.IAnimal;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class AnimalFactory {

  private static AnimalFactory instance;

  private AnimalFactory() {
    super();
  }

  public static AnimalFactory getInstance() {
    if (isaNull(AnimalFactory.instance)) {
      synchronized (AnimalFactory.class) {
        if (isaNull(AnimalFactory.instance)) {
          AnimalFactory.instance = new AnimalFactory();
        }
      }
    }
    return instance;
  }

  public IAnimal createDog() {
    return create(TypeAnimal.DOG);
  }

  public IAnimal createCow() {
    return create(TypeAnimal.COW);
  }

  public IAnimal createCat() {
    return create(TypeAnimal.CAT);
  }

  public IAnimal create(TypeAnimal type) {
    return switch (type) {
      case CAT -> new Cat();
      case COW -> new Cow();
      case DOG -> new Dog();
    };
  }

  private static <T> boolean isaNull(T t) {
    return Objects.isNull(t);
  }
}
