package com.team4studio.emerce.model.remote.entity


@kotlinx.serialization.Serializable
enum class OrderStatus(code: String)  {
    All("All"),
    Processing("Processing"),
    Shipped("Shipped"),
    Delivered("Delivered"),
}