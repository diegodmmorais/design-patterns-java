package com.lukeware.designpatterns.entity.landanimal;


import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Cat() implements IAnimal {
  @Override
  public String toMake() {
    return "Miau Miau!";
  }
}
