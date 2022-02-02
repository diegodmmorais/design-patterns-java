package com.lukeware.decorator;

/**
 * @author Diego Morais
 */
final class SmsNotifier extends NotifierDecorator {

  protected SmsNotifier(INotifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    System.out.println(String.format("sending sms messege '%s'", message));
    super.send(message);
  }
}
