package com.lukeware.adapterpattern;

import com.lukeware.adapterpattern.entity.IAnimal;

/**
 * @author Diego Morais
 */
public interface IAnimalFactory<T> {
  IAnimal create(T type);
}
