package com.lukeware.decorator;

/**
 * @author Diego Morais
 */
abstract class NotifierDecorator implements INotifier {

  private final INotifier notifier;

  protected NotifierDecorator(INotifier notifier) {
    this.notifier = notifier;
  }

  @Override
  public void send(String message) {
    notifier.send(message);
  }
}
