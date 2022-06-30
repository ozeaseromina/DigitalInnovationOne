package one.digitalinnovation.digionebank.testes

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    print(digiOneBank.nome)
    print(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.Info())
}