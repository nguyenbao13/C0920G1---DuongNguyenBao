package s4_lop_va_doi_tuong_trong_java.bai_tap.lop_stop_watch;
import java.util.Arrays;
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
        long[] array = new long[100000];
        int maxRange = 1000;
        int minRange = 1;
        int range = maxRange - minRange + 1;
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * range) + minRange;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    long temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        duration.stop();
        System.out.println(duration.getStartTime());
        System.out.println(duration.getEndTime());
        System.out.println(duration.getElapsedTime());
    }
}
