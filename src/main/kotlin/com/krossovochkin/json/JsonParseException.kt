package com.krossovochkin.json

data class JsonParseException(
    override val message: String,
    override val cause: Throwable? = null
) : Exception(message, cause)