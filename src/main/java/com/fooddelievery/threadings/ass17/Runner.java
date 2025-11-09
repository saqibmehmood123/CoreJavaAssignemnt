package com.fooddelievery.threadings.ass17;

import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> user())
                .thenApply(user -> user.toUpperCase())
                .thenAccept(user -> System.out.println(user))
                .exceptionally(ex -> {
                    System.out.println("Error: " + ex);
                    return null;
                })
                .join();
    }
    public static String user() {
        /// throw new RuntimeException(" RUntimeException ");
        return "saqib";
    }
}
