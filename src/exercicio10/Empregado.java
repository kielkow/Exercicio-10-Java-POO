package exercicio10;

import javax.swing.JOptionPane;

public class Empregado implements Interface{
    
    private String nome;
    private double salario;

    
    
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Empregado() {
    }

    
    
    
    
    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
    
    @Override
    public void empregado() {
        this.setNome(JOptionPane.showInputDialog("Nome do empregado: "));
        this.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario:")));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                            "Salario: " + this.getSalario());
    }

    @Override
    public void aumentarSalario() {
        double porcento = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de aumento:"));
        this.setSalario(this.getSalario()+(this.getSalario()*porcento)/100);
        JOptionPane.showMessageDialog(null, "Salario Atual: " + this.getSalario());
    }
    
    
    
    
    
}
