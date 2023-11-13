package Revisão.Quest2;

public class Fatura {
    String num;
    String descricao;
    int itemquant;
    double preco;


    //Construtor
    public Fatura(String num, String descricao, int itemquant, double preco){
        this.num = num;
        this.descricao = descricao;
        this.itemquant = itemquant;
        this.preco = preco;

    }
    
    /*
     * um getter é um método utilizado para obter o valor de um atributo 
     * privado (Não necessariamente), de uma classe. 
     * Ele fornece acesso somente leitura ao valor do atributo, 
     * permitindo que outros objetos obtenham informações sobre o estado interno do objeto 
     * sem a capacidade de modificá-lo diretamente.
     */
    public String getNumero(){
        return num;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getItemquant(){
        return itemquant;
    }

    public double getPreco(){
        return preco;
    }

    //Calcula o valor final da fatura multiplicando a quantidade pelo preço.
    public double totalFatura(){
        double result = itemquant * preco;
        return result;
    }
}
