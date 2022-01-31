package com.lukeware.factorypattern.entity;

import com.lukeware.factorypattern.IAnimal;

/**
 * @author Diego Morais
 */
final record Dog() implements IAnimal {
  @Override
  public String toMake() {
    return "Auau Auau!";
  }
}
