package com.lambdaschool.oauth2.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todos;

    @Column(nullable = false)
    private String todo;

    @Column(nullable = false)
    private boolean completed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid",
            nullable = false)
    @JsonIgnoreProperties({"todos", "hibernateLazyInitializer"})
    private User user;

    public Todo()
    {
    }

    public Todo(String todo, boolean complete, User user)
    {
        this.todo = todo;
        this.completed = complete;
        this.user = user;
    }

    public boolean isComplete() {
        return completed;
    }

    public void setComplete(boolean complete) {
        this.completed = complete;
    }

    public long getTodosid()
    {
        return todos;
    }

    public void setTodosid(long todosid)
    {
        this.todos = todos;
    }

    public String getTodo()
    {
        return todo;
    }

    public void setTodo(String todo)
    {
        this.todo = todo;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}