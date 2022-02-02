package com.lukeware.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Diego Morais
 */
@DisplayName("NotifierTest")
class INotifierTest {

  @Test
  @DisplayName("1 - Notifier of email")
  public void notifierOfEmail() {
    final var emailNotifier = new EmailNotifier();

    Assertions.assertDoesNotThrow(() -> emailNotifier.send("new product saved"));
  }

  @Test
  @DisplayName("2 - Notifier of email and sms")
  public void notifierOfEmailAndSms() {
    final var emailNotifier = new EmailNotifier();
    final var smsNotifier = new SmsNotifier(emailNotifier);

    Assertions.assertDoesNotThrow(() -> smsNotifier.send("new product saved"));
  }

  @Test
  @DisplayName("3 - Notifier of email, sms and slack")
  public void notifierOfEmailSmsAndSlack() {
    final var emailNotifier = new EmailNotifier();
    final var smsNotifier = new SmsNotifier(emailNotifier);
    final var slackNotifier = new SlackNotifier(smsNotifier);

    Assertions.assertDoesNotThrow(() -> slackNotifier.send("new product saved"));
  }

  @Test
  @DisplayName("4 - Notifier of email, sms, slack and facebook")
  public void notifierOfEmailSmsSlackAndFacebook() {
    final var emailNotifier = new EmailNotifier();
    final var smsNotifier = new SmsNotifier(emailNotifier);
    final var slackNotifier = new SlackNotifier(smsNotifier);
    final var facebookNotifier = new FacebookNotifier(slackNotifier);

    Assertions.assertDoesNotThrow(() -> facebookNotifier.send("new product saved"));
  }
}