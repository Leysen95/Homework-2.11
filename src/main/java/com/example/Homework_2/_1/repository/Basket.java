package com.example.Homework_2._1.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> repository = new ArrayList<>();

    public void addItems(List<Integer> items) {
        repository.addAll(items);
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(repository);
    }
}
