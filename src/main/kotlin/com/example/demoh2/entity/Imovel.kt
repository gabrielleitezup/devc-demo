package com.example.demoh2.entity

data class Imovel(
        var id: String? = null,
        var cep: String? = null,
        var endereco: String? = null,
        var numero: Int? = null,
        var tipoImovel: TipoImovel? = null,
        var andar: Int? = null
)