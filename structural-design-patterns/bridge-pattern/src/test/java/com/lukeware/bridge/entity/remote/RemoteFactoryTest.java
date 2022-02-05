package com.lukeware.bridge.entity.remote;

import com.lukeware.bridge.entity.device.ac.AcBuilder;
import com.lukeware.bridge.entity.device.radio.RadioBuilder;
import com.lukeware.bridge.entity.device.tv.TvBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Remote factory test")
class RemoteFactoryTest {

  @Test
  @DisplayName("Device TV change")
  void deviceTVChange() {

    final var tv = TvBuilder.builder()
                            .channel(1)
                            .onOff(false)
                            .volume(0)
                            .build();

    final var remoteTv = RemoteFactory.getInstance().create(tv);

    Assertions.assertDoesNotThrow(() -> remoteTv.power());
    Assertions.assertDoesNotThrow(() -> remoteTv.channelUp());
    Assertions.assertDoesNotThrow(() -> remoteTv.volumeUp());

    Assertions.assertDoesNotThrow(() -> remoteTv.channelUp());
    Assertions.assertDoesNotThrow(() -> remoteTv.channelDown());
    Assertions.assertDoesNotThrow(() -> remoteTv.power());

    Assertions.assertDoesNotThrow(() -> remoteTv.power());
    Assertions.assertDoesNotThrow(() -> remoteTv.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteTv.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteTv.volumeDown());
    Assertions.assertDoesNotThrow(() -> remoteTv.volumeDown());

    Assertions.assertDoesNotThrow(() -> remoteTv.power());


  }


  @Test
  @DisplayName("Device radio change")
  void deviceRadioChange() {

    final var tv = RadioBuilder.builder()
                               .channel(1)
                               .onOff(false)
                               .volume(0)
                               .build();

    final var remoteRadio = RemoteFactory.getInstance().create(tv);

    Assertions.assertDoesNotThrow(() -> remoteRadio.power());
    Assertions.assertDoesNotThrow(() -> remoteRadio.channelUp());
    Assertions.assertDoesNotThrow(() -> remoteRadio.volumeUp());

    Assertions.assertDoesNotThrow(() -> remoteRadio.channelUp());
    Assertions.assertDoesNotThrow(() -> remoteRadio.channelDown());
    Assertions.assertDoesNotThrow(() -> remoteRadio.power());

    Assertions.assertDoesNotThrow(() -> remoteRadio.power());
    Assertions.assertDoesNotThrow(() -> remoteRadio.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteRadio.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteRadio.volumeDown());
    Assertions.assertDoesNotThrow(() -> remoteRadio.volumeDown());

    Assertions.assertDoesNotThrow(() -> remoteRadio.power());


  }


  @Test
  @DisplayName("Device ac change")
  void deviceACChange() {

    final var tv = AcBuilder.builder()
                            .onOff(false)
                            .volume(19)
                            .build();

    final var remoteAc = RemoteFactory.getInstance().create(tv);

    Assertions.assertDoesNotThrow(() -> remoteAc.power());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeUp());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeUp());

    Assertions.assertDoesNotThrow(() -> remoteAc.volumeDown());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeDown());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeDown());
    Assertions.assertDoesNotThrow(() -> remoteAc.volumeDown());

    Assertions.assertDoesNotThrow(() -> remoteAc.power());


  }
}