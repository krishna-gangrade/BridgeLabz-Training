package com.hashmap;

import java.util.LinkedList;
import java.util.Scanner;

// Class to represent a key-value pair
class Entry<K, V> {
    K key;
    V value;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class CustomHashMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    // Constructor
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    // 🔹 Menu-driven main method
    public static void main(String[] args) {

        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Custom HashMap Menu =====");
            System.out.println("1. Put (Insert / Update)");
            System.out.println("2. Get Value");
            System.out.println("3. Remove Key");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter key (String): ");
                    String key = sc.nextLine();
                    System.out.print("Enter value (Integer): ");
                    int value = sc.nextInt();
                    map.put(key, value);
                    System.out.println("Key-Value pair added successfully.");
                }

                case 2 -> {
                    System.out.print("Enter key(String) to search: ");
                    String key = sc.nextLine();
                    Integer value = map.get(key);
                    if (value != null) {
                        System.out.println("Value for key '" + key + "' is: " + value);
                    } else {
                        System.out.println("Key not found.");
                    }
                }

                case 3 -> {
                    System.out.print("Enter key to remove: ");
                    String key = sc.nextLine();
                    map.remove(key);
                    System.out.println("Key removed (if existed).");
                }

                case 0 -> System.out.println("Exiting Custom HashMap...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}