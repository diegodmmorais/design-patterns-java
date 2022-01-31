package com.lukeware.designpatterns;

import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
public interface IAnimalFactory<T> {
  IAnimal create(T type);
}
