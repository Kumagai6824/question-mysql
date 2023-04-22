package com.example.demo;

public class HelloResponse {
    private int id;
    private String name;

    public HelloResponse(HelloEntity helloEntity) {
        this.id = helloEntity.getId();
        this.name = helloEntity.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
