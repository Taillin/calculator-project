package com.tailin.calculator.calculator;
import java.util.ArrayList;

public class HistoryManager {
    private ArrayList<String> history = new ArrayList<>();

    public void calcHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty");
        }
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i+1) + ") " + history.get(i));
        }
    }

    public void addOperation(String result) {
        history.add(result);
        int MAX_SIZE = 10;
        if (history.size() > MAX_SIZE){
            history.remove(0);
        }
    }

    public void lastResult(){
        if(history.isEmpty()){
            System.out.println("History is empty");
            return;
        }
        System.out.println(history.getLast());
    }

    public void clearHistory() {
        history.clear();
    }

    public int size() {
        return history.size();
    }

    public String get (int i){
        return history.get(i);
    }
}
