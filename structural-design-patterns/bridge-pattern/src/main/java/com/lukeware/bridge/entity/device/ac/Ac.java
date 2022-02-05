package com.lukeware.bridge.entity.device.ac;

import com.lukeware.bridge.entity.device.AbstrantDevice;

/**
 * @author Diego Morais
 */
final class Ac extends AbstrantDevice {

  Ac(int volume, boolean onOff) {
    super(volume, onOff, 0, 1);
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm ac.");
    System.out.println("| I'm " + (this.isOnOff() ? "on" : "off"));
    System.out.println("| Hot temperature is °C " + this.getVolume());
    System.out.println("------------------------------------\n");
  }
}
