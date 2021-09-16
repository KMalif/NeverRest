package pluginbackendteam.kotlinrestfulapi.repository

import org.springframework.data.jpa.repository.JpaRepository
import pluginbackendteam.kotlinrestfulapi.entity.Product

interface ProductRepository : JpaRepository<Product, String> {

}