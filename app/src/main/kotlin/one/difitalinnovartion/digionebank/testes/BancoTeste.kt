package one.digitalinnovation.digionebank.one.difitalinnovartion.digionebank.teste

import one.digitalinnovation.digionebank.one.difitalinnovartion.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    print(digiOneBank.nome)
    print(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.Info())
}
