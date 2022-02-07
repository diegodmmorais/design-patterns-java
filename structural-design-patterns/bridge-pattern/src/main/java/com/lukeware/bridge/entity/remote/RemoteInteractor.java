package com.lukeware.bridge.entity.remote;

import com.lukeware.bridge.entity.device.IDevice;

/**
 * @author Diego Morais
 */

final record RemoteInteractor(IDevice device) implements IRemote {


  private static void print(IDevice device) {
    device.printStatus();
  }

  @Override
  public void power() {
    if (device.isOnOff()) {
      device.turnOff();
    } else {
      device.turnOn();
    }
    print(device);
  }

  @Override
  public void volumeDown() {
    device.turnVolumeDown();
    print(device);
  }

  @Override
  public void volumeUp() {
    device.turnVolumeUp();
    print(device);
  }

  @Override
  public void channelDown() {
    device.setChannel(device.getChannel() - 1);
    print(device);
  }

  @Override
  public void channelUp() {
    device.setChannel(device.getChannel() + 1);
    print(device);
  }
}
