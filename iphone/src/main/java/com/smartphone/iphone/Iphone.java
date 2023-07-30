package com.smartphone.iphone;

import com.smartphone.iphone.telefone.AparelhoTelefonico;
import com.smartphone.iphone.telefone.NavegadorInternet;
import com.smartphone.iphone.telefone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("*******Reprodutor Musical:******");// Ações do Reprodutor Musical
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("*******Telefone: ******");// Ações do Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("*****Navegador:****");// Ações do Navegador na Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
        // Implementação dos métodos da interface ReprodutorMusical
        @Override
        public void selecionarMusica () {
            System.out.println("Selecionando música");
        }

        @Override
        public void tocar () {
            System.out.println("Tocando música");
        }

        @Override
        public void pausar () {
            System.out.println("Pausando música");
        }

        // Implementação dos métodos da interface AparelhoTelefonico
        @Override
        public void ligar () {
            System.out.println("Ligando");
        }

        @Override
        public void atender () {
            System.out.println("Atendendo chamada");
        }

        @Override
        public void iniciarCorreioVoz () {
            System.out.println("Iniciando Correio de Voz");
        }

        // Implementação dos métodos da interface NavegadorInternet
        @Override
        public void exibirPagina () {
            System.out.println("Exibindo página");
        }

        @Override
        public void adicionarNovaAba () {
            System.out.println("Adicionando Nova Aba");
        }

        @Override
        public void atualizarPagina () {
            System.out.println("Atualizando Página");
        }

}
