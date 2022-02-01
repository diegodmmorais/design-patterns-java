package com.lukeware.singletonpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Security login test")
class SecurityLoginTest {

  @Test
  @DisplayName("1 - Login Test")
  void login() {
    final var instance1 = SecurityLogin.getInstance();
    final var instance2 = SecurityLogin.getInstance();
    Assertions.assertDoesNotThrow(() -> instance1.login("admin", "admin"));
    Assertions.assertDoesNotThrow(() -> instance1.login("admin", "admin"));
    Assertions.assertEquals(instance1, instance2);
  }
}