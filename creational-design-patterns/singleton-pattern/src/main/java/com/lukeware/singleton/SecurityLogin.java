package com.lukeware.singleton;

import java.util.Objects;

/**
 * Creational Design Patterns
 * - Singleton Pattern
 *
 * @author Diego Morais
 */
final class SecurityLogin {

  private static SecurityLogin instance;

  private SecurityLogin() {
    super();
  }

  public static SecurityLogin getInstance() {
    if (isNull(SecurityLogin.instance)) {
      synchronized (SecurityLogin.class) {
        if (isNull(SecurityLogin.instance)) {
          instance = new SecurityLogin();
        }
      }
    }
    return instance;
  }

  private static <T> boolean isNull(T t) {
    return Objects.isNull(t);
  }

  public void login(String username, String password) {
    System.out.println(String.format("user %s, login with password %s. Success!", username, password));
  }
}
