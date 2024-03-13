/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author ads2321036
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno larissa = new Aluno("Larissa", "123.456.789-05", 20240, "26/01/2005", "Feminino");
        larissa.setNome("Larissa");
        System.out.println(larissa.getNome());
        System.out.println(larissa.getRa());
        
        
        Aluno teste = new Aluno();
        teste.setNome("Carlos");
        teste.setRA(292082321);
        
        System.out.println(teste.getNome());
        
    }
    
}
