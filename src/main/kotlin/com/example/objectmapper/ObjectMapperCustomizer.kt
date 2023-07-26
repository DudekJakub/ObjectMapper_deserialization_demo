package com.example.objectmapper

import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import io.quarkus.jackson.ObjectMapperCustomizer
import jakarta.inject.Singleton

@Singleton
class MyObjectMapperCustomizer : ObjectMapperCustomizer {

    override fun customize(objectMapper: ObjectMapper) {
        objectMapper.registerModule(JavaTimeModule())
        objectMapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY))
    }
}