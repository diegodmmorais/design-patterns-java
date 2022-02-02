package com.lukeware.prototype.entity;

/**
 * @author Diego
 */
@FunctionalInterface
public interface IRunnable<T> {
  void run(T e);
}
