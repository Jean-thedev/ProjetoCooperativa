import java.util.ArrayList;

public class Produtor {
    String nome;
    String municipio;
    String tipoManejo;
    ArrayList<Entrega> entregas = new ArrayList<Entrega>();

    public Produtor(String nome, String municipio, String tipoManejo) {
        this.nome = nome;
        this.municipio = municipio;
        this.tipoManejo = tipoManejo;
    }

    public void registrarEntrega(Entrega e){
        entregas.add(e);
    }

    public double calcularTotalKg(){
        double totalkg = 0;
        for(Entrega e : entregas){
            totalkg += e.quantidade;
        }
        return totalkg;
    }

    public double calcularTotalRecebido(){
        double totalRecebido = 0;
        for(Entrega e : entregas){
            totalRecebido += e.calcularValor();
        }
        return totalRecebido;
    }

    public int contarEntregasGrandes(){
        int i = 0;
        for(Entrega e : entregas){
            if(e.ehEntregaGrande()){
                i++;
            }
        }
        return i;
    }

    public void exibirResumo(){
        System.out.println("Nome do Produtor: "+ this.nome);
        System.out.println("Municipio: " + this.municipio);
        System.out.println("Tipo de Manejo: " + this.tipoManejo);
        System.out.println();

        for(Entrega e : entregas){
            e.exibirDados();
        }

        System.out.println("Total de kg entregues: " + calcularTotalKg() + "kg");
        System.out.println("Total para receber: R$ " + calcularTotalRecebido());
        System.out.println("Entregas Grandes: " + contarEntregasGrandes());
       

    }

    


}
