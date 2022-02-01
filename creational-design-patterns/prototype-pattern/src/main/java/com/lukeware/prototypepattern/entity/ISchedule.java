package com.lukeware.prototypepattern.entity;

/**
 * @author Diego Morais
 */
public interface ISchedule extends ISchedulePrototype{
  String cron();

  IRunnable runnable();

  void run();
}
