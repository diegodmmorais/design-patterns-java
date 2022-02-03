package com.lukeware.proxy;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Diego Morais
 */
final record YouTubeProxy(IYouTube youTube) implements IYouTube {

  private static Set<String> urls = new LinkedHashSet<>();

  @Override
  public String download(String url) {
    final var optUrls = urls.stream().filter(it -> it.equals(url)).findFirst();
    if (optUrls.isPresent()) {
      return optUrls.get();
    } else {
      final var urlNew = youTube.download(url);
      urls.add(urlNew);
      return urlNew;
    }
  }

  public static Set<String> urls() {
    return urls;
  }
}
