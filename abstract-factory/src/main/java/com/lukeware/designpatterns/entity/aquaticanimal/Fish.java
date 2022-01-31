package com.lukeware.designpatterns.entity.aquaticanimal;


import com.lukeware.designpatterns.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Fish() implements IAnimal {
  @Override
  public String toMake() {
    return "glup glup!";
  }
}
