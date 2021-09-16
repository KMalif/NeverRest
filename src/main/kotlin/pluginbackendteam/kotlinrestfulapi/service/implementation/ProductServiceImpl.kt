package pluginbackendteam.kotlinrestfulapi.service.implementation

import pluginbackendteam.kotlinrestfulapi.entity.Product
import pluginbackendteam.kotlinrestfulapi.model.CreateProductRequest
import pluginbackendteam.kotlinrestfulapi.model.ProductResponse
import pluginbackendteam.kotlinrestfulapi.repository.ProductRepository
import pluginbackendteam.kotlinrestfulapi.service.ProductService
import java.util.*

class ProductServiceImpl (val productRepository: ProductRepository) : ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
                id = createProductRequest.id,
                name = createProductRequest.name,
                price = createProductRequest.price,
                quantity = createProductRequest.quantity,
                createdAt= Date(),
                updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
                id = product.id,
                name = product.name,
                price = product.price,
                quantity = product.quantity,
                createdAt = product.createdAt,
                updatedAt = product.updatedAt
        )
    }
}