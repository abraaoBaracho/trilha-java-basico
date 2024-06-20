
public class ContaBancaria {

    private int conta;
    private String agencia;
    private String cliente;
    private double saldo;

    public ContaBancaria(int conta, String agencia, String cliente, double saldo){
        this.conta = conta;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    void contaCriada(){
        System.out.println("Olá "+ cliente +", obrigado por criar uma conta em nosso banco, "
        		+ "sua agência é "+ agencia +", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
