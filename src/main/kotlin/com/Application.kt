package com.example

import io.micronaut.runtime.Micronaut.*
import main.kotlin.com.BankAccount

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.example")
		.start()

}
fun main(args: Array<String>){
	println("Welcome to your personal banking application.")

	val bankaccount: BankAccount = BankAccount()
	var usersChoice: Int = 1
	while(usersChoice !=3){
		choices()
		display()
	}
}
fun choices(){
	println("What would you like to do today?")
	println("1: Withdraw")
	println("2: Deposit")
	println("3: Exit")
}