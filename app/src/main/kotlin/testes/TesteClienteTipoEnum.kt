package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEch { elemento ->
        println("${elemento.name} --${elemento} }
    }

    ClienteTipo.values().forEch {it: ClienteTipo
        println("${it.name} -- ${it: descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} --${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name}" -- ${pj.descricao}")
}