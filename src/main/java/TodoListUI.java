/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// src/TodoListUI.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoListUI extends JFrame {
    private TodoListModel todoListModel;       
    private JList<TodoItem> todoList;        
    private DefaultListModel<TodoItem> listModel;
    private JTextField newItemTextField;

    // Constructeur de l'interface
    public TodoListUI() {
        // Configuration de la fenêtre principale
        setTitle("To-Do List");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialisation du modèle de données
        todoListModel = new TodoListModel();
        listModel = new DefaultListModel<>();

        // Liste graphique avec un modèle pour afficher les tâches
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);

        // Champ de saisie pour ajouter une nouvelle tâche
        newItemTextField = new JTextField(20);
        JButton addButton = new JButton("Ajouter");

        // Action pour ajouter un element
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = newItemTextField.getText().trim();
                if (!description.isEmpty()) {
                    todoListModel.addItem(description);  
                    listModel.addElement(new TodoItem(description));
                    newItemTextField.setText("");
                }
            }
        });

        // Bouton pour supprimer l'element sélectionnée
        JButton deleteButton = new JButton("Supprimer");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TodoItem selectedItem = todoList.getSelectedValue(); // Sélectionne une tâche
                if (selectedItem != null) {
                    todoListModel.removeItem(selectedItem);
                    listModel.removeElement(selectedItem);
                }
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(newItemTextField);
        inputPanel.add(addButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(deleteButton);

        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
 
