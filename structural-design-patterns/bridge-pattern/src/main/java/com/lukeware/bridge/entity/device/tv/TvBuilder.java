package com.lukeware.bridge.entity.device.tv;

import com.lukeware.bridge.entity.device.IDevice;

/**
 * @author Diego Morais
 */
public class TvBuilder {

  private int volume;
  private boolean onOff;
  private int channel;

  private TvBuilder() {
    super();
  }

  public static TvBuilder builder() {
    return new TvBuilder();
  }

  public TvBuilder volume(int volume) {
    this.volume = volume;
    return this;
  }

  public TvBuilder onOff(boolean onOff) {
    this.onOff = onOff;
    return this;
  }

  public TvBuilder channel(int channel) {
    this.channel = channel;
    return this;
  }

  public IDevice build() {
    return new TV(this.volume, this.onOff, this.channel);
  }
}
