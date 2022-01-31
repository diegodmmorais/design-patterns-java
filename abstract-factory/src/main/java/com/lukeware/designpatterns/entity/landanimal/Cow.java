package com.lukeware.designpatterns.entity.landanimal;


import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Cow() implements IAnimal {
  @Override
  public String toMake() {
    return "Mooooommmm!";
  }
}
