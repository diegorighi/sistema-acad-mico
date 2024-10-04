package br.com.drighi.tcc.sistema_academico.domain.enumerators

enum class DisciplinaEnum(val descricao: String) {

    CALCULO_1("Cálculo 1"),
    CALCULO_2("Cálculo 2"),
    FISICA_1("Física 1"),
    FISICA_2("Física 2"),
    QUIMICA("Química"),
    ALGORITMOS("Algoritmos"),
    ESTRUTURA_DE_DADOS("Estrutura de Dados"),
    BANCO_DE_DADOS("Banco de Dados"),
    REDES("Redes"),
    SISTEMAS_OPERACIONAIS("Sistemas Operacionais"),
    ENGENHARIA_DE_SOFTWARE("Engenharia de Software"),
    INTELIGENCIA_ARTIFICIAL("Inteligência Artificial"),
    COMPUTACAO_NUVEM("Computação Nuvem"),
    COMPUTACAO_QUANTICA("Computação Quântica"),
    MATEMATICA_DISCRETA("Matemática Discreta");

    override fun toString(): String {
        return descricao
    }

}