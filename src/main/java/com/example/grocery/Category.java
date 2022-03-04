package com.example.grocery;

public class Category {
    private int categoryId;
    String name;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }
}
