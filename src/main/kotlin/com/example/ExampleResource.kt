package com.example

import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path

@Path("/hello")
class ExampleResource {

    @PUT
    @Path("/list")
    fun helloList(dto: TestClassJavaList): TestClassJavaList {
        println(dto)
        return dto
    }

    @PUT
    @Path("/set")
    fun helloSet(dto: TestClassJavaSet): TestClassJavaSet {
        println(dto)
        return dto
    }

    @PUT
    @Path("/map")
    fun helloMap(dto: TestClassJavaMap): TestClassJavaMap {
        println(dto)
        return dto
    }
}

