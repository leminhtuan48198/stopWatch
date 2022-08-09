import java.time.Duration;
import java.time.Instant;
public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }
    public StopWatch(){
        this.startTime=Instant.now();
    }
    public void start(){
        this.startTime=Instant.now();
    }
    public void stop(){
        this.endTime=Instant.now();
    }
    public Duration getElapsedTime(){
        return Duration.between(startTime,endTime);
    }


}
