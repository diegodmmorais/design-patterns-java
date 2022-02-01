package com.lukeware.adapterpattern.entity.aquaticanimal;


import com.lukeware.adapterpattern.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dolphin() implements IAnimal {
  @Override
  public String toMake() {
    return "Fuuuuiimmmm!";
  }
}
