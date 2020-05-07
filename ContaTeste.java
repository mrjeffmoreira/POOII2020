public class Conta {
private double saldo;
private String nome = "JEFFERSON";
public boolean saca(double valor) {
if (getSaldo() < valor) {
return false;
}
this.setSaldo(this.getSaldo() - valor);
return true;
}
public void deposita(double valor) {
this.setSaldo(this.getSaldo() + valor);
}
public boolean transfere(Conta contaDestino, double valor) {
if (!this.saca(valor)) {
return false;
}
contaDestino.deposita(valor);
return true;
}
public double saldo(){
return getSaldo();
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public double getSaldo() {
return saldo;
}
public void setSaldo(double saldo) {
this.saldo = saldo;
}
}
