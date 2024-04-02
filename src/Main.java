//joseph momot
//1660
//3/8/2024

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);


            ArrayList<Task> myTasks = new ArrayList<>();


            //Task asimpletest = new Task("cat", "walk the cat", 5);
            //System.out.println(asimpletest);


            String option = "";


            while (!(option.equals("0"))) {

                System.out.println("(1) Add a task.\n" +
                        "(2) Remove a task.\n" +
                        "(3) Update a task.\n" +
                        "(4) List all tasks.\n" +
                        "(5) List task by priority.\n" +
                        "(6) super secret junk.\n" +
                        "(0) Exit.");
                option = input.nextLine();


                if (option.equals("1")) {
                    System.out.println("what task name");
                    String taskName = input.nextLine();

                    System.out.println("give a description of the task");
                    String taskDescription = input.nextLine();

                    System.out.println("give a priority for the task, 1 through 5");
                    int taskPriority = input.nextInt();
                    input.nextLine();

                    Task theNewTask = new Task(taskName, taskDescription, taskPriority);
                    myTasks.add(theNewTask);


                } else if (option.equals("2")) {
                    System.out.println("what task do you want to remove");
                    System.out.println(myTasks);
                    int delete = input.nextInt();
                    input.nextLine();
                    myTasks.remove(delete);

                } else if (option.equals("3")) {
                    System.out.println("what task do you want to update (start from 0)");
                    System.out.println(myTasks);
                    int delete = input.nextInt();
                    input.nextLine();
                    myTasks.remove(delete);
                    System.out.println("what would you like to change the task name to?");
                    String taskName = input.nextLine();

                    System.out.println("give a description of the task");
                    String taskDescription = input.nextLine();

                    System.out.println("give a priority for the task, 1 through 5");
                    int taskPriority = input.nextInt();
                    input.nextLine();

                    Task theNewTask = new Task(taskName, taskDescription, taskPriority);
                    myTasks.add(theNewTask);


                } else if (option.equals("4")) {
                    System.out.println(myTasks);

                } else if (option.equals("5")){
                    System.out.println("what priority do you want to display");
                    int userinput = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < myTasks.size(); i++) {
                        if (myTasks.get(i).getPriority() == userinput){
                            System.out.println(myTasks.get(i));
                        }
                    }
                } else if(option.equals("6")){
                    System.out.println("Code was made by joseph momot on march 8th 2024, for 1660");
                }


            }


        }catch(Exception e){
            System.out.println("improper input");
        }

    }



}