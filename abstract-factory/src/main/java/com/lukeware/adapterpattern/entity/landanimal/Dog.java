package com.lukeware.adapterpattern.entity.landanimal;


import com.lukeware.adapterpattern.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dog() implements IAnimal {
  @Override
  public String toMake() {
    return "Auau Auau!";
  }
}
