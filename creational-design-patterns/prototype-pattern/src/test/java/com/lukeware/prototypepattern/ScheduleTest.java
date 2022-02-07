package com.lukeware.prototypepattern;

import com.lukeware.prototype.entity.ScheduleBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("Schedule Test")
class ScheduleTest {

  @Test
  @DisplayName("Run schedule")
  void runSchedule() {
    final var schedule1 = ScheduleBuilder.builder()
                                         .cron("0/1 1 * * *")
                                         .rule((e) -> System.out.println(e))
                                         .build();

    final var schedule2 = schedule1.clone();
    final var schedule3 = schedule1.clone();

    Assertions.assertDoesNotThrow(() -> schedule1.run());
    Assertions.assertDoesNotThrow(() -> schedule2.run());
    Assertions.assertDoesNotThrow(() -> schedule3.run());

  }

}