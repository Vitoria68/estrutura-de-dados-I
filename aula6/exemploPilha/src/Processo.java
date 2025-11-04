public class Processo  {
    int codigo;
    String responsavel;
    String cliente;

    public Processo(int codigo, String responsavel, String cliente) {
        this.codigo = codigo;
        this.responsavel = responsavel;
        this.cliente = cliente;
    }
    //construtor? sim, com parâmetros da classe (para criar objetos que contenham essas características)O this é necessário para diferenciar o atributo (this.codigo) do parâmetro (codigo), atribuindo os valores recebidos como parâmetros (quando o objeto é criado) aos atributos (variáveis) do objeto.
    public Processo(){

    }
    //pq tem um construor vazio aqui? para criar metodos, ou seja, sem precisar passar valores por ele na sua criação, podendo preencher os dados depois 
    //importante: lembrar que é permitido criar mais de um construtor 
}