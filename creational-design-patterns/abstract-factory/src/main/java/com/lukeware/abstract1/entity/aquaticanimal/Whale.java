package com.lukeware.abstract1.entity.aquaticanimal;


import com.lukeware.abstract1.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Whale() implements IAnimal {
  @Override
  public String toMake() {
    return "uuuuuummmmmm!";
  }
}
