package com.lukeware.factory.entity;

import com.lukeware.factory.IAnimal;

/**
 * @author Diego Morais
 */
final record Cow() implements IAnimal {
  @Override
  public String toMake() {
    return "Mooooommmm!";
  }
}
