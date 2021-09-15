# API Specification
## CREATE Product
Request : 
- Method : POST
- Endpoint : `/api/products`
- Header : 
    - Content-Type : application/json
    - Accept : application/json
- Body : 
```json
{
    "id" : "String, unique",
    "name" : "String",
    "price" : "long",
    "quantity" : "integer"
}

```
Response : 
```json
{
    "code" : "number",
    "status": "String",
    "data" : {
        "id" : "String, unique",
        "name" : "String",
        "price" : "long",
        "quantity" : "integer",
        "createdAt" : "date",
        "updatedAt" : "date"            
   }
}
```
## GET Product
Request : 
- Method : GET
- Endpoint : `/api/products/{id_product}`
- Header : 
    - Accept : application/json


Response : 
```json
{
    "code" : "number",
        "status": "String",
        "data" : {
            "id" : "String, unique",
            "name" : "String",
            "price" : "long",
            "quantity" : "integer",
            "createdAt" : "date",
            "updatedAt" : "date"            
       }
}
```

## UPDATE Product
Request : 
- Method : PUT
- Endpoint : `/api/products/{id_product}`
- Header : 
    - Content-Type : application/json
    - Accept : application/json
- Body : 
```json
{
    "name" : "String",
    "price" : "long",
    "quantity" : "integer"
}

```
Response : 
```json
{
    "code"  : "number",
    "status": "String",
    "data"  : {
            "id" : "String, unique",
            "name" : "String",
            "price" : "long",
            "quantity" : "integer",
            "createdAt" : "date",
            "updatedAt" : "date"            
       }
}
```

## LIST Product
Request : 
- Method : GET
- Endpoint : `/api/products`
- Header : 
    - Accept : application/json
- Query Param : 
    - pageSize : number,
    - page : number
Response : 
Response : 
```json
{
    "code"  : "number",
    "status": "String",
    "data"  : [
         {
              "id" : "String, unique",
              "name" : "String",
              "price" : "long",
              "quantity" : "integer",
              "createdAt" : "date",
              "updatedAt" : "date"            
         },
         {
              "id" : "String, unique",
              "name" : "String",
              "price" : "long",
              "quantity" : "integer",
              "createdAt" : "date",
              "updatedAt" : "date"            
         }
  ]
}
```

## DELETE Product
Request : 
- Method : DELETE
- Endpoint : `/api/products/{id_product}`
- Header : 
    - Accept : application/json


Response : 
```json
{
    "code"  : "number",
    "status": "String"
}
```