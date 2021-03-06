// Logger Rate Limiter 日志速率限制器

@EASY
public class LC359 {}

class Logger {
  Map<String, Integer> logs;

  public Logger() {
    logs = new HashMap<>();
  }

  public boolean shouldPrintMessage(int timestamp, String message) {
    if (logs.containsKey(message)) {
      int lastTimestamp = logs.get(message);
      if (timestamp - lastTimestamp < 10) {
        return false;
      }
    }
    logs.put(message, timestamp);
    return true;
  }
}
