package com.lukeware.bridge.entity.device.radio;

import com.lukeware.bridge.entity.device.AbstrantDevice;

/**
 * @author Diego Morais
 */
final class Radio extends AbstrantDevice {

  Radio(int volume, boolean onOff, int channel) {
    super(volume, onOff, channel, 1);
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm radio.");
    System.out.println("| I'm " + (this.isOnOff() ? "on" : "off"));
    System.out.println("| Current volume is " + this.getVolume() + "%");
    System.out.println("| Current channel is " + this.getChannel());
    System.out.println("------------------------------------\n");
  }
}
