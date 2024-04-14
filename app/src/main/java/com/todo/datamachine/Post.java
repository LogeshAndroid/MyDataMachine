package com.todo.datamachine;

public class Post {

    private int id;
    private String title;
    // Add other fields as needed

    public Post(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
