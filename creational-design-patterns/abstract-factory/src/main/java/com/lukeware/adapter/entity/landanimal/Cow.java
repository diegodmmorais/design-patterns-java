package com.lukeware.adapter.entity.landanimal;


import com.lukeware.adapter.entity.IAnimal;

/**
 * @author Diego Morais
 */
final record Cow() implements IAnimal {
  @Override
  public String toMake() {
    return "Mooooommmm!";
  }
}
