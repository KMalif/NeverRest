package pluginbackendteam.kotlinrestfulapi.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import pluginbackendteam.kotlinrestfulapi.model.CreateProductRequest
import pluginbackendteam.kotlinrestfulapi.model.ProductResponse
import pluginbackendteam.kotlinrestfulapi.model.WraperResponse
import pluginbackendteam.kotlinrestfulapi.service.ProductService

@RestController
class ProductController(val productService : ProductService) {

    @PostMapping(
            value = ["api/products"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )

    fun createProduct(body : CreateProductRequest) : WraperResponse<ProductResponse>{
        val productResponse = productService.create(body)

        return WraperResponse(
                code = 200,
                status = "Create data success",
                data = productResponse
        )

    }

}