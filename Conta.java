import java.math.BigDecimal;

public class Conta {

    private int numeroConta = 0;
    private String titular = "";
    private BigDecimal saldo;

    public Conta(int numeroConta, String titular,BigDecimal saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }
    public BigDecimal getSaldo(){
        return saldo;
    }

//Método de deposito
    public void depositar(BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) > 0){
           saldo = saldo.add(valor); 
        } else {
            throw new IllegalArgumentException("valor inválido");
        }
    }

//Método de saque

    public void sacar(BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("valor inválido");
        } else if (saldo.compareTo(valor) < 0){
            throw new IllegalArgumentException("sem saldo");
        } else {
            saldo = saldo.subtract(valor);
        }
    }
}