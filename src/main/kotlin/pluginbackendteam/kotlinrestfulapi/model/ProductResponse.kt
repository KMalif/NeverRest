package pluginbackendteam.kotlinrestfulapi.model

import java.util.*
import javax.persistence.Column

data class ProductResponse(
        val id : String,

        val name : String,

        val price : Long,

        val quantity : Int,

        val createdAt : Date,

        val updatedAt : Date?
)