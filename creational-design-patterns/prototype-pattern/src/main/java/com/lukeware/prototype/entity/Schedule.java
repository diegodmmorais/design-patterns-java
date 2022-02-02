package com.lukeware.prototype.entity;

/**
 * @author Diego Morais
 */
final record Schedule(String cron, IRunnable runnable) implements ISchedule {
  @Override
  public void run() {
    runnable.run(this.cron);
  }

  @Override
  public ISchedule clone() {
    return new Schedule(this.cron, this.runnable);
  }
}
