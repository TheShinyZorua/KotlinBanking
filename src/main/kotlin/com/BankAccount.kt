package main.kotlin.com

class BankAccount {
    private var balance = 0
    fun withdraw(amount: Int):Int{
        if (balance >= amount){
            balance -= amount
            println("Amount Withdrawn: $$amount")
        } else {
            println("Error: Insufficient balance!")
        }
        return balance
    }
    fun deposit(amount: Int): Int{
        balance += amount
        println("Amount Deposited: $$amount")
        return balance
    }
    fun display(){
        println("Available Balance: $$balance")
    }

}