// No tocar esta clase ---
data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
    var type: String? = null,
    var info: String? = null
)
// -----------------------

fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
}

fun processList(inputList: List<Any?>?): List<ItemData>? {
    
    var result: ArrayList<ItemData> = arrayListOf<ItemData>()
    return result
    
    var item: Any
    var pos: Int
    
     when (item) {
         
     is String -> {
         ItemData(
             originalPos = pos,
             originalValue = item,
             type = "Cadena",
             info = "L" + item.length
         )
         
     }
     
     is Boolean -> {
         
         if(item == true){
            ItemData(
                originalPos = pos,
                originalValue = item,
                type = "Booleano",
                info = "Verdadero"
         	)
         } else if(item == false){
             ItemData(
                originalPos = pos,
                originalValue = item,
                type = "Booleano",
                info = "Falso"
         	)
         }
         
         
     }
     
     is Int -> {
         
         var multiplo: String = ""
         if(item % 10 == 0){
             multiplo = "M10"
         } else if(item % 5 == 0){
             multiplo = "M5"
         } else if(item % 2 == 0){
             multiplo = "M2"
         }
         
        ItemData(
            originalPos = pos,
            originalValue = item,
            type = "Entero",
            info = multiplo
    	)
     }
     else -> {
         ItemData(
             originalPos = pos,
             originalValue = item,
             type = null,
             info = null
         )
     }
 }
}
