# Trabalho-do-Vito
import java.util.*;

public class MenorCaminhoCapitais {
    private static Grafo grafoCapitais;
    private static Scanner scanner;
    
 public static void main(String[] args) {
        inicializarGrafo();
        scanner = new Scanner(System.in);

        System.out.println("Sistema de Cálculo de Menor Caminho entre Capitais Brasileiras");
        System.out.println("-------------------------------------------------------------");
