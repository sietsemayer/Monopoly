package org.monopoly.game.queue;

public interface IQueue<T> {
    
    public void enque (T x);
    
    public T dequeue();
    
    public T front();
    
    public boolean isEmpty();

}
