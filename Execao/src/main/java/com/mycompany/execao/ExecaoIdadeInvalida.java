/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.execao;

/**
 *
 * @author davil
 */
class ExecaoIdadeInvalida extends Exception {
    public ExecaoIdadeInvalida(String mensagem) {
      super(mensagem);
    }
    
    public void verificarIdade(int idade) throws ExecaoIdadeInvalida {
     if (idade < 18 || idade > 100) {
       throw new ExecaoIdadeInvalida("Erro. A idade deve estar entre 18 e 100 anos.");     
     } else {
       System.out.println("Idade válida: " + idade + " anos.");  
      }
   } 
}
