import java.util.ArrayList;

public class Cooperativa {
    String nome;
    String sede;
    ArrayList<Produtor> Produtores = new ArrayList<Produtor>();

    public Cooperativa(String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
    }

    public void cadastrarProdutor(Produtor p){
        Produtores.add(p);
    }

    public double calcularVolumeTotal(){
        double volumetot = 0.0;
        for(Produtor p : Produtores){
            volumetot += p.calcularTotalKg();
        }
        return volumetot;
    }

    public Produtor produtorComMaiorVolume(){
        Produtor maior = null;
        for(Produtor p : Produtores){
            if(maior == null || p.calcularTotalKg() > maior.calcularTotalKg()){
                maior = p;
            }
        }
        return maior;
    }

    public Produtor buscarProdutor(String nomeDoProdutor){
            for(Produtor p : Produtores){
                if (p.nome.equalsIgnoreCase(nomeDoProdutor)) {
                return p;
            }
        }
        return null;
    }

    public void exibirRelatorio(){
        System.out.println("Relatorio");
        System.out.println("Cooperativa: "+ this.nome);
        System.out.println("Sede: " + this.sede);
        System.out.println();

        for(Produtor p : Produtores){
            System.out.println("Produtor: "+ p.nome);
            System.out.println("Municipio: "+p.municipio);
            System.out.println("Tipo de Manejo: " + p.tipoManejo);
            System.out.println("Total Entregue: " + p.calcularTotalKg() + "kg");
            System.out.println();   
            }
            System.out.println("Volume Total: " + calcularVolumeTotal() + "kg" );
            System.out.println();

            Produtor vencedor = produtorComMaiorVolume();

            if(vencedor!=null){
                System.out.println("Maior Produtor: " + vencedor.nome);
                System.out.println("Quantidade Vendida: " + vencedor.calcularTotalKg() + "kg");
            }
        }
    }