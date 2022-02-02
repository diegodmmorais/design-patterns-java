package com.lukeware.decorator;

/**
 * @author Diego Morais
 */
final class FacebookNotifier extends NotifierDecorator {


  protected FacebookNotifier(INotifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    System.out.println(String.format("sending facebook messege '%s'", message));
    super.send(message);
  }
}
