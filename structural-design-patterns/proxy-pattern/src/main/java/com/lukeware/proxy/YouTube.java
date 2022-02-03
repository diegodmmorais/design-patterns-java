package com.lukeware.proxy;

/**
 * @author Diego Morais
 */
final record YouTube() implements IYouTube {
  @Override
  public String download(String url) {
    System.out.println(String.format("donwload youtube %s", url));
    return url;
  }
}
