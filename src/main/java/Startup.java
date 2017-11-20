import manager.IManager;
import manager.Status;
import worker.IWorker;

/**
 * Created by Aaron Gehri on 11/18/2017.
 */
public class Startup {
    public static void main(String [ ] args)
        {
            // Create an instance of the manager you want
            IManager manager = null;

            // Start the process
            Status status = manager.start();
            System.out.println("Running manager: " + manager.getName());

            // Wait until it's finished
            while (status.isRunning()){
                int progressPercent = status.getProgress();
                System.out.println(progressPercent + "%");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finished manager: " + manager.getName());
            System.out.println();

            // Display the best performing stats
            IWorker bestWorker = manager.getBestWorker();
            double bestWorkerFitness = manager.getBestWorkerFitness();
            System.out.println("Best worker: " + bestWorkerFitness);
            System.out.println(bestWorker.getAttributes());
        }
}
