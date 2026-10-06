/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.jogador;


/**
 *
 * @author yago62977756
 */
public class JogoDaVelha {
    private int numero;
    private String nome;
    private char símbolo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSímbolo() {
        return símbolo;
    }

    public void setSímbolo(char símbolo) {
        this.símbolo = símbolo;
    }
    
     public JogoDaVelha (int numero, String nome, char símbolo){
         this.numero = numero;
         this.nome = nome;
         this.símbolo = símbolo;
     }
     
     public void jogar(){
         
     }
     
}
