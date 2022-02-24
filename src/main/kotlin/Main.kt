fun main(args: Array<String>) {
    val exerciciopratico: Fisica = Fisica()

    val resultadoPeso: Float = exerciciopratico.forcaPeso(3f, 5f)
    println("O resultado e $resultadoPeso")

    val resultadoCentripeta: Double = exerciciopratico.forcaCentripeta(4f, 8.0, 5f)
    ("o resultado e $resultadoCentripeta")

    val resultadoImpulso: Float = exerciciopratico.forcaImpulso(40f, 65f, 43f, 6f)
    println("O resultado e $resultadoImpulso")

    val resultadoElastica: Float = exerciciopratico.forcaelastica(12f, 24f)
    println("O resultado e $resultadoElastica")

    val resultadovelocidade: Float = exerciciopratico.velocidademedia(8f, 12f, 8f, 6f)
    println("O resultado e $resultadovelocidade")

    val resultadomovimento: Float = exerciciopratico.mru(43f, 6f, 2f, 14f)
    println("O resultado e $resultadomovimento")

    val resultadomrvu: Float = exerciciopratico.mrvu(12f, 5f, 43f, 4f, 23f)
    println("O resultado e $resultadomrvu")
}