package com.practice.librarysystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication



@SpringBootApplication  //컴포넌트 검색과 자동구성 활성화
class LibrarySystemApplication

fun main(args: Array<String>) {
    // 애플리케이션 부트스트랩
    runApplication<LibrarySystemApplication>(*args)
}
