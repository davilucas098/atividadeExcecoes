/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.execao;

/**
 *
 * @author davil
 */
public class Teste {
    public static void main(String[] args) {
    ExcecaoSaldoInsuficiente saldoInsuficiente = new ExcecaoSaldoInsuficiente("");
    ExecaoIdadeInvalida idadeInvalida = new ExecaoIdadeInvalida("");
    
    try {
        System.out.println("Testando saldo insuficiente:");
        saldoInsuficiente.verificarSaldo(100.0, 150.00);
      } catch (ExcecaoSaldoInsuficiente e) {
         System.out.println(e.getMessage());
      }
    
    
    try {
       System.out.println("Testando idade inválida");
       idadeInvalida.verificarIdade(120);
      } catch (ExecaoIdadeInvalida e) {
       System.out.println(e.getMessage());
       }
    
    try {
        System.out.println("Testando operacoes válidas:");
        saldoInsuficiente.verificarSaldo(200.0, 100.0);
        idadeInvalida.verificarIdade(30);
      } catch (ExcecaoSaldoInsuficiente | ExecaoIdadeInvalida e) {
        System.out.println(e.getMessage());
      }
    }
}
