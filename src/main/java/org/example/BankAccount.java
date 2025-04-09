package org.example;
public class BankAccount {
    float saldo;
    float tassInt;
    int nConto;
    public BankAccount(float saldo, float tassInt, int nConto){
        this.saldo = saldo;
        this.tassInt=tassInt;
        this.nConto=nConto;
    }
    public BankAccount(float saldo, float tassInt){
        this.saldo=saldo;
        this.tassInt=tassInt;
    }
    public BankAccount(float saldo){
        this.saldo=saldo;
    }
    public void amount(int deposito){
        saldo+=deposito;
    }
    public void withdrw(int deposito){
        saldo-=deposito;
    }
    public float getBalance(){
        return saldo;
    }
    public int getAccountNumber(){
        return nConto;
    }
}
