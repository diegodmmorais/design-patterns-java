package com.lukeware.adapterpattern;

import com.lukeware.adapterpattern.entity.Type;

/**
 * @author Diego Morais
 */
public interface IMeasurement {

  double value();

  Type type();
}
