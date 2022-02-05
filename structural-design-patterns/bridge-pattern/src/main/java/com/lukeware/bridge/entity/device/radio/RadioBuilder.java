package com.lukeware.bridge.entity.device.radio;

import com.lukeware.bridge.entity.device.IDevice;

/**
 * @author Diego Morais
 */
public class RadioBuilder {

  private int volume;
  private boolean onOff;
  private int channel;

  private RadioBuilder() {
    super();
  }

  public static RadioBuilder builder() {
    return new RadioBuilder();
  }

  public RadioBuilder volume(int volume) {
    this.volume = volume;
    return this;
  }

  public RadioBuilder onOff(boolean onOff) {
    this.onOff = onOff;
    return this;
  }

  public RadioBuilder channel(int channel) {
    this.channel = channel;
    return this;
  }

  public IDevice build() {
    return new Radio(this.volume, this.onOff, this.channel);
  }
}
