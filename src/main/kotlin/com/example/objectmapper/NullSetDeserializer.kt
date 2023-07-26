package com.example.objectmapper

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode

class NullSetDeserializer: JsonDeserializer<Set<*>>() {

    override fun deserialize(parser: JsonParser, context: DeserializationContext): Set<*> {
        return parser.codec.readTree<JsonNode>(parser).toSet()
    }

    @Deprecated("Deprecated in Java", ReplaceWith("emptySet<Any>()"))
    override fun getNullValue(): Set<*> {
        return emptySet<Any>()
    }
}