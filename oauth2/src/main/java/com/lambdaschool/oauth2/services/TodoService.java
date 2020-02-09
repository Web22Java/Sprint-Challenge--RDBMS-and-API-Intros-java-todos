package com.lambdaschool.oauth2.services;

import com.lambdaschool.oauth2.models.Todo;
import com.lambdaschool.oauth2.view.JustTheCount;

import java.util.ArrayList;
import java.util.List;

public interface TodoService
{
    List<Todo> findAll();

    Todo findTodoById(long id);

    List<Todo> findByUserName (String username);

    void delete(long id);

    Todo save(Todo todo);

    Todo update(Todo todo, long id);

    ArrayList<JustTheCount> getCountQuotes();
}
