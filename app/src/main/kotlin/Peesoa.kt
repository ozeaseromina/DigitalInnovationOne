package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "123.123.123.11"
    private set
}

fun main() {
    val Jether = Pessoa()

    println(Jether.nome)
    println(Jether.cpf)


}




