package com.lukeware.abstract1.entity.aquaticanimal;


import com.lukeware.abstract1.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dolphin() implements IAnimal {
  @Override
  public String toMake() {
    return "Fuuuuiimmmm!";
  }
}
