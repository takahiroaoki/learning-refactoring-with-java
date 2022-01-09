package com.example.chapter7;

public class Item {
    private final ItemType _itemType;
    private final String _title;
    private final int _price;

    public Item(ItemType itemType, String title, int price) {
        _itemType = itemType;
        _title = title;
        _price = price;
    }

    public ItemType getItemType() { return _itemType;}
    public String getTitle() { return _title; }
    public int getPrice() { return _price; }

    public String toString() {
        return "[ "
            + getItemType().getTypecode() + ", "
            + getTitle() + ", "
            + getPrice() + " ]";
    }
}
