import java.time.LocalDateTime;

public class LogEntry {
    private final String ipAddr;
    private final LocalDateTime time;
    private final HttpMethod method;
    private final String path;
    private final int responseCode;
    private final int responseSize;
    private final String refer;
    private final UserAgent agent;

    public enum HttpMethod {
        GET, POST, PUT, DELETE, PATCH, HEAD, OPTIONS, TRACE, CONNECT
    }

    public LogEntry(String ipAddr, LocalDateTime time, HttpMethod method, String path, int responseCode, int responseSize, String refer, UserAgent agent) {
        this.ipAddr = ipAddr;
        this.time = time;
        this.method = method;
        this.path = path;
        this.responseCode = responseCode;
        this.responseSize = responseSize;
        this.refer = refer;
        this.agent = agent;
    }
}
