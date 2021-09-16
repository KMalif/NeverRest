package pluginbackendteam.kotlinrestfulapi.service

import pluginbackendteam.kotlinrestfulapi.model.CreateProductRequest
import pluginbackendteam.kotlinrestfulapi.model.ProductResponse

interface ProductService {
    fun create(createProductRequest : CreateProductRequest) : ProductResponse
}