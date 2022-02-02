package com.lukeware.factory.entity;

import com.lukeware.factory.IAnimal;

/**
 * @author Diego Morais
 */
final record Dog() implements IAnimal {
  @Override
  public String toMake() {
    return "Auau Auau!";
  }
}
