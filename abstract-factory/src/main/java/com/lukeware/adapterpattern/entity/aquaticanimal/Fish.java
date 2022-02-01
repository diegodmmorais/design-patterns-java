package com.lukeware.adapterpattern.entity.aquaticanimal;


import com.lukeware.adapterpattern.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Fish() implements IAnimal {
  @Override
  public String toMake() {
    return "glup glup!";
  }
}
