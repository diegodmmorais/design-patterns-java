package com.lukeware.prototypepattern.entity;

/**
 * @author Diego
 */
@FunctionalInterface
public interface IRunnable<T> {
  void run(T e);
}
