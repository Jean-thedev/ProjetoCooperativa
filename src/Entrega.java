import java.util.ArrayList;

public class Entrega {
    ArrayList<Entrega> entregas = new ArrayList<Entrega>();
    String Data = "mm/dd/aaaa";
    double quantidade;
    double preco;

    public Entrega(String data, double quantidade, double preco) {
        Data = data;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double calcularValor(){
        return quantidade * preco;
    }

    public void aplicarBonificacao(double percent){
        double aumento = 0;
        aumento = preco * (percent / 100.0);
        this.preco += aumento;
    }
    public boolean ehEntregaGrande(){
        if(quantidade>100){
            return true;
        }
        else{
            return false;
        }
    }

    public void exibirDados(){
        System.out.println("Data: "+this.Data);
        System.out.println("Quantidade: " + this.quantidade + "kg");
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Valor total: R$" + calcularValor());
        System.out.println();

        if(ehEntregaGrande()){
            System.out.println("Entrega grande");
        }
        else{
            System.out.println("Entrega Comum");
        }
    }




}