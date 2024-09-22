package jobtracker;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<JobApplication> {
    @Override
    public int compare(JobApplication job1, JobApplication job2) {
        return Double.compare(job1.getExp(), job2.getExp());
    }
}
