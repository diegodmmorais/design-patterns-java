package com.lukeware.designpatterns.entity.aquaticanimal;


import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dolphin() implements IAnimal {
  @Override
  public String toMake() {
    return "Fuuuuiimmmm!";
  }
}
