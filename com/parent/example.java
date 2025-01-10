package com.parent;
public abstract class example {
    private int id;
    public String name;
    
    public void setName(String name) {
        this.name = name;
    }
    final public String getName() {
        return name;
    }
    public example(){
        System.out.println("Hi");
    }
    protected void display(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        
    }
}
