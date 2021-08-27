package com.bridgelabz;


public class Dequenode<E>
{
    public E data;
    public Dequenode<E>next;
    public Dequenode<E>pre;

    public Dequenode()
    {
        this.next=null;
        this.pre=null;
    }

    public Dequenode(E val)
    {
        this.data=val;
        this.next=null;
        this.pre=null;
    }
}
