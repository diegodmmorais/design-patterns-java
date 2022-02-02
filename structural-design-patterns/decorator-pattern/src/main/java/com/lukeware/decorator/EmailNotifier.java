package com.lukeware.decorator;

/**
 * @author Diego Morais
 */
final record EmailNotifier() implements INotifier {
  @Override
  public void send(String message) {
    System.out.println(String.format("sending email messege '%s'", message));
  }
}
