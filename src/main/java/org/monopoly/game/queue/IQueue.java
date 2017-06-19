package org.monopoly.game.queue;

public interface IQueue<T> {
    
    public void enqueue (T x);
    
    public T dequeue();
    
    public T front();
    
    public boolean isEmpty();

}
