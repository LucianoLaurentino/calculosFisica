class Fisica {
    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun forcaCentripeta(massa: Float, velocidade: Double, raioDaCurva: Float): Double {
        return massa * ((velocidade * velocidade) / raioDaCurva)
    }

    fun forcaImpulso(forca: Float, deltaT: Float, deltaF: Float, deltaI: Float): Float {
        return forca * (deltaT - deltaI)
    }

    fun forcaelastica(constante: Float, deformacao: Float): Float {
        return constante * deformacao
    }

    fun velocidademedia(intervaloI: Float, intervaloF: Float, tempoI: Float, tempoF: Float): Float {
        return (intervaloF - intervaloI) / (tempoF - tempoI)
    }

    fun mru(deltasF: Float, deltasI: Float, velocidade: Float, tempo: Float): Float {
        return (deltasF - deltasI) + velocidade * tempo

    }

    fun mrvu(s: Float, deltaV: Float, a: Float, tempoT: Float, tempo: Float): Float {
        return s + deltaV * tempo + (a * (tempoT * tempoT) / 2)
    }
}