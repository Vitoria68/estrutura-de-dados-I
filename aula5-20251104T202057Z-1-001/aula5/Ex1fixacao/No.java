public class No {
    public No proximo;
    public Pessoa elemento;
    public No anterior;

    public No (Pessoa elemento, No proximo, No anterior){//jeito um de criar 
        //adiciona o outro elemento a ser utilizado, o anterior
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    public No(){//jeito dois de criar
        //adiciona o outro elemento a ser utilizado, o anterior
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
}

//aqui tem q usar os dois jeitos ou pode escolher um? 
//pode escolher só um, mas se quiser manter os dois não será um problema