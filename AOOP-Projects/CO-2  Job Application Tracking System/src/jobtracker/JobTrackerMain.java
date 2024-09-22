package jobtracker;

import java.util.Collections;

public class JobTrackerMain {
    public static void main(String[] args) {
        JobApplication app1 = new JobApplication("Raghu", "Software Engineer", 3.5);
        JobApplication app2 = new JobApplication("Phani", "Data Analyst", 5.0);
        JobApplication app3 = new JobApplication("Rahul", "Product Manager", 2.0);
        JobApplication app4 = new JobApplication("Krishna", "UX/UI Designer", 6.0);
        JobApplication app5 = new JobApplication("Ram", "Cybersecurity Analyst", 4.5);
        
        // Adding applications to the list
        JobAppList appList = new JobAppList();
        appList.addJobApplication(app1);
        appList.addJobApplication(app2);
        appList.addJobApplication(app3);
        appList.addJobApplication(app4);
        appList.addJobApplication(app5);

        // Sorting by Comparable (Name)
        Collections.sort(appList.apps); // This sorts the list by applicant name

        System.out.println("Applications sorted by Name:");
        for (JobApplication app : appList) {
            System.out.println(app);
        }

        // Using Comparator to sort by experience
        System.out.println("\nApplications sorted by Experience:");
        Collections.sort(appList.apps, new ExperienceComparator());
        for (JobApplication app : appList) {
            System.out.println(app);
        }

        // Demonstrating Cloning
        System.out.println("\nCloning Application:");
        JobApplication clonedApp = app1.clone();
        System.out.println(clonedApp);
    }
}
