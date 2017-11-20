package manager;

import worker.IWorker;

/**
 * Created by Aaron Gehri on 11/18/2017.
 */
public interface IManager {
    
    String getName();

    /**
     * This method will start the generation process.
     * @return A status object that will be updated with the current status.
     */
    public Status start();

    IWorker getBestWorker();

    double getBestWorkerFitness();
}
