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
    if (Objects.isNull(SecurityLogin.instance)) {
      synchronized (SecurityLogin.class) {
        if (Objects.isNull(SecurityLogin.instance)) {
          instance = new SecurityLogin();
        }
      }
    }
    return instance;
  }

  public void login(String username, String password) {
    System.out.println(String.format("user %s, login with password %s. Success!", username, password));
  }
}
