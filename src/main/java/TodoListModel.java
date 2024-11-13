/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

public class TodoListModel {
    private List<TodoItem> items;

    public TodoListModel() {
        items = new ArrayList<>();
    }

    public List<TodoItem> getItems() {
        return items;
    }

    public void addItem(String description) {
        items.add(new TodoItem(description));
    }

    public void removeItem(TodoItem item) {
        items.remove(item);
    }
}

