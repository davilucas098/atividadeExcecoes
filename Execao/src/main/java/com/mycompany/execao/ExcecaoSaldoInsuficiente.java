/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.execao;

/**
 *
 * @author davil
 */
 class ExcecaoSaldoInsuficiente extends Exception {
   public ExcecaoSaldoInsuficiente(String mensagem) {
     super(mensagem);
   }
   
   public void verificarSaldo(double saldo, double valor) throws ExcecaoSaldoInsuficiente {
      if (valor > saldo) {
        throw new ExcecaoSaldoInsuficiente("Erro Saldo insuficiente para realizar a operacao.");
      } else {
        System.out.println("Operacao realizada com sucesso ! Saldo restante: " + (saldo - valor) );
      }
   }
 }
