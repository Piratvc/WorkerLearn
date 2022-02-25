package com.company;

public class Worker {


    public Worker(OnTaskErrorListener errorCallback, OnTaskDoneListener callback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }

    private OnTaskErrorListener errorCallback;
    private OnTaskDoneListener callback;


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Возникла некая ошибка");
                break;
            } else {
            callback.onDone("Task " + i + " is done");
            }
        }
    }
}
