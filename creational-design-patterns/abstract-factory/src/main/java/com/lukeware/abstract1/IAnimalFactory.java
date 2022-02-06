package com.lukeware.abstract1;

import com.lukeware.abstract1.entity.IAnimal;

/**
 * @author Diego Morais
 */
public interface IAnimalFactory<T> {
  IAnimal create(T type);
}
