package com.lukeware.bridge.entity.device.ac;

import com.lukeware.bridge.entity.device.IDevice;

/**
 * @author Diego Morais
 */
public class AcBuilder {

  private int volume;
  private boolean onOff;
  private int channel;

  private AcBuilder() {
    super();
  }

  public static AcBuilder builder() {
    return new AcBuilder();
  }

  public AcBuilder volume(int volume) {
    this.volume = volume;
    return this;
  }

  public AcBuilder onOff(boolean onOff) {
    this.onOff = onOff;
    return this;
  }

  public IDevice build() {
    return new Ac(this.volume, this.onOff);
  }
}
