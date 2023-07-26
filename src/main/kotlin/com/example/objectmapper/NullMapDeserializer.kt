package com.example.objectmapper

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode

class NullMapDeserializer: JsonDeserializer<Map<*, *>>() {

    override fun deserialize(parser: JsonParser, context: DeserializationContext): Map<*, *> {
        val node = parser.codec.readTree<JsonNode>(parser)
        val map = LinkedHashMap<Any, Any>()

        node.fields().forEach {
            map[it.key] = it.value
        }

        return map
    }

    @Deprecated("Deprecated in Java", ReplaceWith("emptyMap<Any, Any>()"))
    override fun getNullValue(): Map<*, *> {
        return emptyMap<Any, Any>()
    }
}