package com.stackandqueues.circulartour;

class CircularTour {

    public static int findStartingPump(int[] petrol, int[] distance) {

        int n = petrol.length;

        int[] queue = new int[n];   // array-based queue
        int front = 0, rear = -1, size = 0;

        int surplus = 0;
        int index = 0;

        while (index < 2 * n) {

            int i = index % n;

            // enqueue index
            rear = (rear + 1) % n;
            queue[rear] = i;
            size++;

            surplus += petrol[i] - distance[i];

            // dequeue while fuel is negative
            while (surplus < 0 && size > 0) {
                int removed = queue[front];
                front = (front + 1) % n;
                size--;

                surplus -= petrol[removed] - distance[removed];
            }

            // all pumps included
            if (size == n) {
                return queue[front];
            }

            index++;
        }

        return -1;
    }
}