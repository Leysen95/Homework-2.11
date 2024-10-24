package com.example.Homework_2._1.service;

import com.example.Homework_2._1.repository.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public void addItems(List<Integer> items) {
        basket.addItems(items);
    }

    public List<Integer> getItems() {
        return basket.getItems();
    }
}
