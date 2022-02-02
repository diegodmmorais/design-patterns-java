package com.lukeware.adapter;

import com.lukeware.adapter.entity.IAnimal;

/**
 * @author Diego Morais
 */
public interface IAnimalFactory<T> {
  IAnimal create(T type);
}
