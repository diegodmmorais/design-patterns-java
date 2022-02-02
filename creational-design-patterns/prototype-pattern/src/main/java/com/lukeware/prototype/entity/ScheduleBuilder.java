package com.lukeware.prototype.entity;

/**
 * @author Diego Morais
 */
public final class ScheduleBuilder {

  private String cron;
  private IRunnable runnable;

  private ScheduleBuilder() {
    super();
  }

  public static ScheduleBuilder builder() {
    return new ScheduleBuilder();
  }

  public ScheduleBuilder cron(String cron) {
    this.cron = cron;
    return this;
  }

  public ScheduleBuilder rule(IRunnable runnable) {
    this.runnable = runnable;
    return this;
  }

  public ISchedule build() {
    return new Schedule(this.cron, this.runnable);
  }
}
