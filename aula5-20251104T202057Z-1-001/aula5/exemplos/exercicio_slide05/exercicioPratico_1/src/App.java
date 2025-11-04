public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente(0, "diego", "123");
        Cliente c2 = new Cliente(50, "vitoria", "321");
        Cliente c3 = new Cliente(140, "marcelo", "000");
        Cliente c4 = new Cliente(1, "ana", "111");
        ListaCliente lista = new ListaCliente();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.imprimeDecrescente();
    }
}
