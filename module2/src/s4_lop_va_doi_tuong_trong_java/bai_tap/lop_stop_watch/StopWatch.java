package s4_lop_va_doi_tuong_trong_java.bai_tap.lop_stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;
    long getStartTime() {
        return startTime;
    }
    long getEndTime() {
        return endTime;
    }
    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    void start() {
        this.startTime = System.currentTimeMillis();
    }
    void stop() {
        this.endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        StopWatch duration = new StopWatch();
        duration.start();
        int count = 0;
        for (int i = 0; i < 99999; i++) {
            for (int j = i+1; j < 100000; j++) {
                count++;
            }
        }
        duration.stop();
        System.out.println(duration.getStartTime());
        System.out.println(duration.getEndTime());
        System.out.println(duration.getElapsedTime());
    }
}
