package com.lukeware.abstract1.entity.landanimal;


import com.lukeware.abstract1.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Cat() implements IAnimal {
  @Override
  public String toMake() {
    return "Miau Miau!";
  }
}
