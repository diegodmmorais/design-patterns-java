package com.lukeware.factorypattern.entity;

import com.lukeware.factorypattern.IAnimal;

/**
 * @author Diego Morais
 */
final record Cat() implements IAnimal {
  @Override
  public String toMake() {
    return "Miau Miau!";
  }
}
