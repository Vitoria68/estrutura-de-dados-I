public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("BRA2E19", "Volkswagen", "Gol", 45000.00);
        Carro carro2 = new Carro("JIP4A55", "Fiat", "Mobi", 39500.50);
        Carro carro3 = new Carro("GOL1D23", "Chevrolet", "Onix", 62000.75);
        Carro carro4 = new Carro("PAO7H11", "Hyundai", "HB20", 68900.00);
        Carro carro5 = new Carro("QRT5F88", "Toyota", "Corolla", 130000.00);
        Carro carro6 = new Carro("FEI9B44", "Jeep", "Renegade", 115000.00);
        Carro carro7 = new Carro("BMW3X01", "BMW", "X1", 210000.00);
        ListaCarro lista = new ListaCarro();
        lista.add(carro1);
        lista.add(carro2);
        lista.add(carro3);
        lista.excluir(carro3.getPlaca());
        lista.print();
    }
}
