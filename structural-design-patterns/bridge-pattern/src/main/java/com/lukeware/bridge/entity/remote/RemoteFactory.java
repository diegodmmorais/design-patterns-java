package com.lukeware.bridge.entity.remote;

import com.lukeware.bridge.entity.device.IDevice;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public class RemoteFactory {

  private static RemoteFactory instance;

  private RemoteFactory() {
    super();
  }

  public static RemoteFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (RemoteFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new RemoteFactory();
        }

      }
    }
    return instance;
  }

  public IRemote create(IDevice device) {
    return new RemoteInteractor(device);
  }
}
