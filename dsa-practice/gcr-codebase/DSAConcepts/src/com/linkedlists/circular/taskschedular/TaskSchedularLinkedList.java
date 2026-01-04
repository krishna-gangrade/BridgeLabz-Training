package com.linkedlists.circular.taskschedular;

class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current; // for task scheduling

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {

        if (position <= 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    public void removeByTaskId(int id) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {

                if (temp == head && temp.next == head) {
                    head = current = null;
                }
                else if (temp == head) {
                    prev = head;
                    while (prev.next != head) {
                        prev = prev.next;
                    }
                    head = head.next;
                    prev.next = head;
                }
                else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed successfully.");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found.");
    }

    // View current task and move to next
    public void viewNextTask() {

        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\nCurrent Task:");
        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {

        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        System.out.println("\n--- Task List ---");

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with this priority.");
        }
    }

 // Method to display a task
    private void displayTask(TaskNode node) {
        System.out.println("Task ID   : " + node.taskId);
        System.out.println("Name      : " + node.taskName);
        System.out.println("Priority  : " + node.priority);
        System.out.println("Due Date  : " + node.dueDate);
        System.out.println("--------------------------");
    }
}