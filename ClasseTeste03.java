package pacoteTeste03;

import java.util.Scanner;

public class ClasseTeste03 { // Soma duas idades

    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Digite a idade: ");    	
    	int idade1 = sc.nextInt();

    	System.out.print("Digite a segunda idade: ");    	
    	int idade2 = sc.nextInt();
    	
    	int total = somar(idade1, idade2);
    	    	
    	System.out.print("A soma das idades é: " + total);
    	// teste03
    	
    	sc.close();
    	
    }
    
    private static int somar(int a, int b) {
    	return a+b;
    }
}

