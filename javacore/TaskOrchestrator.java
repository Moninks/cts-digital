import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TaskOrchestrator {
    public static void main(String[] args) throws Exception {
        ExecutorService taskPool = Executors.newFixedThreadPool(4);
        List<Callable<String>> jobList = new ArrayList<>();

        for (int jobId = 0; jobId < 5; jobId++) {
            int finalId = jobId;
            jobList.add(() -> "Outcome from Task " + finalId);
        }

        List<Future<String>> taskResults = taskPool.invokeAll(jobList);
        for (Future<String> result : taskResults) {
            System.out.println(result.get());
        }

        taskPool.shutdown();
    }
}