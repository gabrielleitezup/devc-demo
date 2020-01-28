package com.example.demoh2.repository

import com.example.demoh2.entity.Imovel
import org.springframework.data.jpa.repository.JpaRepository

interface ImovelRepository : JpaRepository<Imovel, String> {
}