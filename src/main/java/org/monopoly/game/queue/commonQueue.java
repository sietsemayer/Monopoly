package org.monopoly.game.queue;

import java.util.ArrayList;

public class commonQueue<T> implements IQueue<T>{
    
    private ArrayList<T> playersQueue;
    
    public commonQueue() {
        playersQueue = new ArrayList<T>();
    }

    @Override
    public void enque(T x) {
        playersQueue.add(0, x);
    }

    @Override
    public T dequeue() {            
        return playersQueue.remove(playersQueue.size() -1);
    }

    @Override
    public T front() {
        return playersQueue.get(playersQueue.size() -1);
    }

    @Override
    public boolean isEmpty() {
        return playersQueue.isEmpty();
    }
    
    public int getSize(){
        return playersQueue.size();
    }

}
