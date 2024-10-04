package br.com.drighi.tcc.sistema_academico.domain.enumerators

enum class CursoEnum(val descricao: String) {

    NG_CIVIL("Engenharia Civil"),
    ADM_EMPRESARIAL("Administração Empresarial"),
    CIENCIA_COMPUTACAO("Ciência da Computação"),
    MEDICINA("Medicina"),
    ADS("Análise e Desenvolvimento de Sistemas"),;

    override fun toString(): String {
        return descricao
    }

}