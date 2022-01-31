package com.lukeware.designpatterns.entity.landanimal;


import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dog() implements IAnimal {
  @Override
  public String toMake() {
    return "Auau Auau!";
  }
}
