package com.lambdaschool.oauth2.repository;

import com.lambdaschool.oauth2.models.Todo;
import com.lambdaschool.oauth2.view.JustTheCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface QuoteRepository extends CrudRepository<Todo, Long>
{
    @Query(value = "SELECT u.username, count(q.quotesid) as countquotes FROM quotes q JOIN users u on q.userid = u.userid GROUP BY u.username", nativeQuery = true)
    ArrayList<JustTheCount> getCountQuotes();
}