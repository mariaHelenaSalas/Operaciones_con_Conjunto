package com.conjunto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperacionesConjuntos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir al usuario los dos conjuntos de números enteros
        System.out.print("Ingrese la cantidad de elementos del primer conjunto: ");
        int n1 = teclado.nextInt();
        Set<Integer> conjunto1 = new HashSet<>();
        
        System.out.println("Ingrese los elementos del primer conjunto:");
        for (int i = 0; i < n1; i++) {
            conjunto1.add(teclado.nextInt());
        }
        
        System.out.print("Ingrese la cantidad de elementos del segundo conjunto: ");
        int n2 = teclado.nextInt();
        Set<Integer> conjunto2 = new HashSet<>();
        
        System.out.println("Ingrese los elementos del segundo conjunto:");
        for (int i = 0; i < n2; i++) {
            conjunto2.add(teclado.nextInt());
        }
        
        // Operaciones con los conjuntos
        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        
        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        
        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        
        // Mostrar resultados
        System.out.println("Unión de los conjuntos: " + union);
        System.out.println("Intersección de los conjuntos: " + interseccion);
        System.out.println("Diferencia (conjunto1 - conjunto2): " + diferencia);
        
        teclado.close();
    }
}
