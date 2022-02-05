package com.lukeware.bridge.entity.device.tv;

import com.lukeware.bridge.entity.device.AbstrantDevice;

/**
 * @author Diego Morais
 */
final class TV extends AbstrantDevice {

  TV(int volume, boolean onOff, int channel) {
    super(volume, onOff, channel, 10);
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm tv.");
    System.out.println("| I'm " + (this.isOnOff() ? "on" : "off"));
    System.out.println("| Current volume is " + this.getVolume() + "%");
    System.out.println("| Current channel is " + this.getChannel());
    System.out.println("------------------------------------\n");
  }
}
