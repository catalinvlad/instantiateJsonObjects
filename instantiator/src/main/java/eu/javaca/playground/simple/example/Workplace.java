package eu.javaca.playground.simple.example;

import java.util.ArrayList;
import java.util.List;

public class Workplace<T extends Worker> {

    private List<T> workers;

    public List<T> getWorkers() {
        return workers;
    }

    public void setWorkers(List<T> workers) {
        this.workers = workers;
    }

    public void addWorker(Worker worker) {
        if (workers == null) {
            workers = new ArrayList<>();
        }
        workers.add((T) worker);
    }

    public void removeWorker(Worker worker) {
        if (workers == null) {
            return;
        }
        workers.remove(worker);
        if (workers.isEmpty()) {
            workers = null;
        }
    }
}
