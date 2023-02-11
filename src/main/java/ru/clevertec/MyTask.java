package ru.clevertec;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyTask extends DefaultTask {

    @TaskAction
    public void myTask(){
        System.out.println("Hi, this is custom task from my custom plugin!");
        System.out.println("I still didn't understand what is meant by \"testing and generating a report\"......");
        System.out.println("Here is the location of the Junit test results -- "+testDir()+"\\build\\reports\\tests\\test\\index.html");
        infoProject();
        dateToday();
    }

    private String testDir(){
        Project project = getProject();
        return project.getProjectDir().getAbsolutePath();
    }

    private void dateToday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Today is: " + dtf.format(LocalDateTime.now()));
        timeToday();
    }
    private void timeToday(){
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH.mm");
        System.out.println(tf.format(LocalDateTime.now()));
    }

    private void infoProject(){
        Project project = getProject();
        System.out.println("Name project - "+project.getName());
        System.out.println("Version - "+project.getVersion());
    }

}
