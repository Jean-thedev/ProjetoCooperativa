public class App {
    public static void main(String[] args) throws Exception {
        Entrega e1 = new Entrega("25/10/2026", 26.9, 40);
        Entrega e2 = new Entrega("20/10/2026", 120.9, 250);
        Entrega e3 = new Entrega("15/10/2026", 10.5, 25.45);
        Entrega e4 = new Entrega("10/10/2026", 200.6, 300.40);
        Entrega e5 = new Entrega("05/10/2026", 60.6, 80.6);

        Produtor p1 = new Produtor("Laila", "Cameta", "Ribeirinho");
        p1.registrarEntrega(e1);
        p1.registrarEntrega(e2);

        Produtor p2 = new Produtor("Gabriel", "Baião", "Pescador");
        p2.registrarEntrega(e3);
        p2.registrarEntrega(e4);

        Produtor p3 = new Produtor("João", "Ponta de Pedras", "Artesão");
        p3.registrarEntrega(e5);

        Cooperativa coop = new Cooperativa("Coop Açaí", "Belem");
        coop.cadastrarProdutor(p1);
        coop.cadastrarProdutor(p2);
        coop.cadastrarProdutor(p3);

        e2.aplicarBonificacao(100);
        e4.aplicarBonificacao(50);

        Produtor encontrado = coop.buscarProdutor("Laila");

        if(encontrado!=null){
            encontrado.exibirResumo();
        }
        else{
            System.out.println("Produtor não encontrado");
        }

        System.out.println();
        coop.exibirRelatorio();
        
    }
}
