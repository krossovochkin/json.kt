package com.krossovochkin.json

interface JsonFormatter {

    fun format(jsonElement: JsonElement): String
}

class MinifiedJsonFormatter : JsonFormatter {

    override fun format(jsonElement: JsonElement): String {
        return when (jsonElement) {
            is JsonObject -> {
                "{${jsonElement.children.entries.joinToString(separator = ",") { "\"${it.key}\":${format(it.value)}" }}}"
            }
            is JsonArray -> {
                "[${jsonElement.children.joinToString(separator = ",") { format(it) }}]"
            }
            is JsonProperty -> {
                if (jsonElement.value is String) {
                    "\"${jsonElement.value}\""
                } else {
                    "${jsonElement.value}"
                }
            }
        }
    }
}