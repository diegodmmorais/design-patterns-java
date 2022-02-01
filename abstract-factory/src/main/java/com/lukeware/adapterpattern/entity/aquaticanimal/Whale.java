package com.lukeware.adapterpattern.entity.aquaticanimal;


import com.lukeware.adapterpattern.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Whale() implements IAnimal {
  @Override
  public String toMake() {
    return "uuuuuummmmmm!";
  }
}
