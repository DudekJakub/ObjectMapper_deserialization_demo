package com.example.objectmapper

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode

class NullListDeserializer: JsonDeserializer<List<*>>() {

    override fun deserialize(parser: JsonParser, context: DeserializationContext): List<*> {
        return parser.codec.readTree<JsonNode>(parser).toList()
    }

    @Deprecated("Deprecated in Java", ReplaceWith("emptyList<Any>()"))
    override fun getNullValue(): List<*> {
        return emptyList<Any>()
    }
}