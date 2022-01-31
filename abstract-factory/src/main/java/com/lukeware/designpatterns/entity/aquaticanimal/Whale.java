package com.lukeware.designpatterns.entity.aquaticanimal;


import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Whale() implements IAnimal {
  @Override
  public String toMake() {
    return "uuuuuummmmmm!";
  }
}
