/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hfourniret
 */
// src/Main.java

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Lancer l'interface graphique sur le thread principal Swing
        SwingUtilities.invokeLater(() -> {
            TodoListUI todoListUI = new TodoListUI();
            todoListUI.setVisible(true);  // Afficher la fenêtre
        });
    }
}


