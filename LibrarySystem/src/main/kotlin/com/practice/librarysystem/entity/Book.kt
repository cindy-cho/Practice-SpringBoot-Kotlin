package com.practice.librarysystem.entity

import java.time.LocalDate
import javax.persistence.*

@Entity
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identiy 설정은 DB에 위임한다. 이 경우는 Mysql에 위임
    val bookId: Long,
    @Column(length=200)
    val title: String,
    @Column(length = 50)
    val author: String,
    @Column(length = 50) //하나하나씩  column다 명시, length없을 경우는 기본 255
    val publisher: String,
    @Column(length = 500)
    val image_url: String,

    val publish_date: LocalDate
){
}