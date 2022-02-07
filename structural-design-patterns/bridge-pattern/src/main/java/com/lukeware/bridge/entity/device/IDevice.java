package com.lukeware.bridge.entity.device;

/**
 * @author Diego Morais
 */
public interface IDevice {

  boolean isOnOff();

  void turnOn();

  void turnOff();

  void turnVolumeUp();

  void turnVolumeDown();

  int getVolume();

  int getChannel();

  void setChannel(int channel);

  void printStatus();
}
