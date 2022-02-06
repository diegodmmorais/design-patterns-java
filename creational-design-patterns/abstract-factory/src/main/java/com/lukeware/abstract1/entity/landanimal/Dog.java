package com.lukeware.abstract1.entity.landanimal;


import com.lukeware.abstract1.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Dog() implements IAnimal {
  @Override
  public String toMake() {
    return "Auau Auau!";
  }
}
