package manager;

import com.google.common.collect.Lists;
import worker.IWorker;

import java.util.List;

/**
 * Created by Aaron Gehri on 11/18/2017.
 */
public abstract class AbstractManager implements IManager{

    private final Status status = new Status();
    List<IWorker> population = Lists.newArrayList();
    private IWorker bestWorker = null;
    private double bestWorkerFitness = 0;

    public Status start() {
        status.setRunning(true);

        // Run startProcess on a new thread
        Thread t = new Thread(new Process());
        t.start();
        return status;
    }

    /**
     * This method will be called on a new thread to do the processing
     */
    protected abstract void startProcess();

    public IWorker getBestWorker() {
        return bestWorker;
    }

    public double getBestWorkerFitness() {
        return bestWorkerFitness;
    }

    private class Process implements Runnable {
        public void run() {

        }
    }
}
