package pluginbackendteam.kotlinrestfulapi.model

data class WraperResponse<T>(
        val code : Int,

        val status : String,

        val data : T
)