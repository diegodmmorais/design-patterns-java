package com.lukeware.decorator;


/**
 * @author Diego Morais
 */
final class SlackNotifier extends NotifierDecorator {
  protected SlackNotifier(INotifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    System.out.println(String.format("sending slack messege '%s'", message));
    super.send(message);
  }
}
