package Revisão.Quest2;

import java.util.List;
import java.util.ArrayList;

public class CadastroInfo {

    /*
     * Atributo chamado fatura, que é uma lista (do tipo List) de objetos do tipo Quest2Fatura. 
     * Esse atributo é usado para armazenar as faturas cadastradas.
     */
    List<Fatura> faturas;

    /*
     * CONSTRUTOR
     * 
     * Ele inicializa a lista de faturas como um novo ArrayList. 
     * O ArrayList é uma implementação da interface List em Java, 
     * que fornece uma lista dinâmica que pode crescer ou diminuir conforme necessário.
     */
    public CadastroInfo(){
        this.faturas = new ArrayList<>();
    }

    public List<Fatura> getFatura(){
        return faturas;
    }

    /*
     * Método é responsável por cadastrar uma nova fatura.
     * Ele recebe os parâmetros (num, descricao, itemquant e preco) 
     * para criar um novo objeto 'Quest2Fatura'
     * com essas informações e adicioná-lo à lista clientes. 
     */
    public void cadastrarFatura(String num, String descricao, int itemquant, double preco){
        Fatura faturaCad = new Fatura(num, descricao, itemquant, preco);
        //faturas = lista criada no inicio da classe.
        //'add' usado para armazenar 'faturaCad' dentro da lista faturas.
        faturas.add(faturaCad);
        System.out.println("Cadastro Efetuado");
    }

    //Imprime as faturas cadastradas.
    public void imprimir(){
        //Função 'isEmpty()' é usada para verificar se a lista 'faturas' está vazia.
        if(faturas.isEmpty()){
            System.out.println("Não há faturas");
        }else{
            for(Fatura fatura : faturas){
                System.out.println("Número: " + fatura.getNumero());
                System.out.println("Descrição: " + fatura.getDescricao());
                System.out.println("Quantidade de itens: " + fatura.getItemquant());
                System.out.println("Preço: " + fatura.getPreco());
                System.out.println("");
            }
        }
    }
}
