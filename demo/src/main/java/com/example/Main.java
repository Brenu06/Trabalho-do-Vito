package com.example;

import com.example.mapa.MapaBrasilSwing;
import com.example.mapa.MenorCaminhoCapitais;

public class Main {
    public static void main(String[] args) {
        // Inicializa o grafo antes de abrir a interface
        MenorCaminhoCapitais.inicializarGrafo();

        // Executa a interface gráfica
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MapaBrasilSwing().setVisible(true);
        });
    }
}