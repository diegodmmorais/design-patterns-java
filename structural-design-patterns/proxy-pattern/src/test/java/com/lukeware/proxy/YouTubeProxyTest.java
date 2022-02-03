package com.lukeware.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author diegomorais
 */
@DisplayName("youTube proxy test")
class YouTubeProxyTest {

  @Test
  @DisplayName("search url youtube")
  void search() {
    final var youtube = YouTubeFactory.getInstance().create();

    final YouTubeProxy youTubeProxy = new YouTubeProxy(youtube);

    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www.youtube.com"));
    Assertions.assertNotNull(youTubeProxy.urls());
    Assertions.assertEquals("www.youtube.com", youTubeProxy.urls().stream().findFirst().get());

  }

  @Test
  @DisplayName("search mult url youtube")
  void searchMultUrlYoutube() {
    final var youtube = YouTubeFactory.getInstance().create();

    final YouTubeProxy youTubeProxy = new YouTubeProxy(youtube);
    youTubeProxy.urls().clear();

    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www1.youtube.com"));
    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www2.youtube.com"));
    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www3.youtube.com"));
    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www4.youtube.com"));

    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www1.youtube.com"));
    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www2.youtube.com"));
    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www3.youtube.com"));
    Assertions.assertDoesNotThrow(() -> youTubeProxy.download("www4.youtube.com"));

    Assertions.assertNotNull(youTubeProxy.urls());
    Assertions.assertEquals(4, youTubeProxy.urls().size());

  }
}