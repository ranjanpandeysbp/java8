package com.company.interfaceenhancement.predicates;

public class Stock {

    String name;
    Integer stockPrice;
    Integer stockQty;

    public Stock(String name, Integer stockPrice, Integer stockQty){
        this.name = name;
        this.stockPrice = stockPrice;
        this.stockQty = stockQty;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+", Price: "+this.stockPrice+", Quantity: "+this.stockQty;
    }

    @Override
    public boolean equals(Object object){
        Stock stock = (Stock) object;

        if(name.equals(stock.name) &&
        stockPrice.equals(stock.stockPrice)
        && stockQty.equals(stock.stockQty)){
            return true;
        }
        else {
            return false;
        }
    }
}
