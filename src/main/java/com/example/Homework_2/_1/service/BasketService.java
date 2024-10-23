package com.example.Homework_2._1.service;

import java.util.List;

public interface BasketService {
    void addItems(List<Integer> items);

    List<Integer> getItems();
}
