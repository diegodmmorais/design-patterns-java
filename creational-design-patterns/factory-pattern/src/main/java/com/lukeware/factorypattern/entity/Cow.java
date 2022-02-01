package com.lukeware.factorypattern.entity;

import com.lukeware.factorypattern.IAnimal;

/**
 * @author Diego Morais
 */
final record Cow() implements IAnimal {
  @Override
  public String toMake() {
    return "Mooooommmm!";
  }
}
