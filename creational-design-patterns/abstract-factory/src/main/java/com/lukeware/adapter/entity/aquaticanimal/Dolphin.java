package com.lukeware.adapter.entity.aquaticanimal;


import com.lukeware.adapter.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dolphin() implements IAnimal {
  @Override
  public String toMake() {
    return "Fuuuuiimmmm!";
  }
}
