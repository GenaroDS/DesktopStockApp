package com.example;

public class ModelTable {
    String itemId, itemName, itemPrice, itemQty, itemUserId;

    public ModelTable(String itemId, String itemName, String itemPrice, String itemQty, String itemUserId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
        this.itemUserId = itemUserId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemUserId(){
        return itemUserId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemQty() {
        return itemQty;
    }

    public void setItemQty(String itemQty) {
        this.itemQty = itemQty;
    }
}
