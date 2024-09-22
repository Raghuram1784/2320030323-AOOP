package jobtracker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JobAppList implements Iterable<JobApplication> {
    List<JobApplication> apps;

    public JobAppList() {
        apps = new ArrayList<>();
    }

    public void addJobApplication(JobApplication app) {
        apps.add(app);
    }

    @Override
    public Iterator<JobApplication> iterator() {
        return new JobAppIterator();
    }

    private class JobAppIterator implements Iterator<JobApplication> {
        private int currentIdx = 0;

        @Override
        public boolean hasNext() {
            return currentIdx < apps.size();
        }

        @Override
        public JobApplication next() {
            return apps.get(currentIdx++);
        }
    }
}
