package com.example.demoh2.entity

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class Imovel(

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
        var id: String? = null,

        @NotNull
        var cep: String? = null,

        @NotNull
        var endereco: String? = null,

        @NotNull
        var numero: Int? = null,
        @NotNull
        var tipoImovel: TipoImovel? = null,

        var andar: Int? = null
)