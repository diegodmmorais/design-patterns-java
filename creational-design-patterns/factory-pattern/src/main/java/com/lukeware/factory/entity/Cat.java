package com.lukeware.factory.entity;

import com.lukeware.factory.IAnimal;

/**
 * @author Diego Morais
 */
final record Cat() implements IAnimal {
  @Override
  public String toMake() {
    return "Miau Miau!";
  }
}
