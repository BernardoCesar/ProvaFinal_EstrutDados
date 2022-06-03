import javax.swing.JOptionPane;

public class Produto {
    
    private int id;
    private String nome;
    private double valor;
    private int qt_estoque;

    public Produto(){

    }
    
    public Produto(int id, String nome, double valor, int qt_estoque){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.qt_estoque = qt_estoque;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQt_estoque(int qt_estoque) {
        this.qt_estoque = qt_estoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQt_estoque() {
        return qt_estoque;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "{Código: " +getId()+" |Nome: " + getNome() +" |Valor: "+ getValor() +" | Estoque: "+getQt_estoque() +"}";
    }

}

