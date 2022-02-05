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

  void setChannel(int channel);

  int getVolume();

  int getChannel();

  void printStatus();
}
