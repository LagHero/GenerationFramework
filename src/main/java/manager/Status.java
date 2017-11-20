package manager;

/**
 * Created by Aaron Gehri on 11/18/2017.
 */
public class Status {

    private int progress;
    private boolean running;

    public boolean isRunning() {
        return running;
    }

    void setRunning(boolean running) {
        this.running = running;
    }

    public int getProgress() {
        return progress;
    }

    void setProgress(int progress) {
        this.progress = progress;
    }
}
