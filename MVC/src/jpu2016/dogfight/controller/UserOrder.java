package jpu2016.dogfight.controller;

import java.util.LinkedList;

public class UserOrder implements IUserOrder {

    private int player;

    public UserOrder(int player, Order order) {

    }

    public Order getOrder(){
        return order;
    }

    public int getPlayer() {
        return player;
    }

    private LinkedList<Order> myOrder = new LinkedList<Order>();
}
