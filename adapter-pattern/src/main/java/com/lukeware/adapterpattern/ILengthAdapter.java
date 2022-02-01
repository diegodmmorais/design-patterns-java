package com.lukeware.adapterpattern;

/**
 * @author Diego Morais
 */
public interface ILengthAdapter {
  IMeasurement getMeter();
  IMeasurement getKilometer();
  IMeasurement getCentimeter();
}
