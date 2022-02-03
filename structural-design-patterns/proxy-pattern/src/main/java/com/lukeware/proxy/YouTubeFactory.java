package com.lukeware.proxy;

import java.util.Objects;

/**
 * @author Diego Morais
 */
public final class YouTubeFactory {

  private static YouTubeFactory instance;

  private YouTubeFactory() {
    super();
  }

  public static YouTubeFactory getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (YouTubeFactory.class) {
        if (Objects.isNull(instance)) {
          instance = new YouTubeFactory();
        }
      }
    }
    return instance;
  }

  IYouTube create() {
    return new YouTube();
  }
}
