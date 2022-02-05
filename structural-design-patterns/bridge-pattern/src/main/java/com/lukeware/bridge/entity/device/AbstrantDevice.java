package com.lukeware.bridge.entity.device;

/**
 * @author Diego Morais
 */
public abstract class AbstrantDevice implements IDevice {

  private int volume;
  private boolean onOff;
  private int channel;
  private int intervalo;

  public AbstrantDevice(int volume, boolean onOff, int channel, int intervalo) {
    this.volume = volume;
    this.onOff = onOff;
    this.channel = channel;
    this.intervalo = intervalo;
  }

  @Override
  public void turnOn() {
    if (!onOff) {
      this.onOff = true;
    }
  }

  @Override
  public void turnOff() {
    if (onOff) {
      this.onOff = false;
    }
  }

  @Override
  public void turnVolumeUp() {
    if (100 >= this.volume) {
      this.volume = this.volume + this.intervalo;
    }
  }

  @Override
  public void turnVolumeDown() {
    if (0 <= this.volume) {
      this.volume = this.volume - this.intervalo;
    }
  }

  @Override
  public void setChannel(int channel) {
    this.channel = channel;
  }

  @Override
  public boolean isOnOff() {
    return this.onOff;
  }

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public int getChannel() {
    return channel;
  }

}
