import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d %5p | %t | %-55logger{55} | %m %n"
  }
}
logger("test.myapp.repos", DEBUG)
logger("org.springframework", DEBUG)
root(DEBUG, ["CONSOLE"])