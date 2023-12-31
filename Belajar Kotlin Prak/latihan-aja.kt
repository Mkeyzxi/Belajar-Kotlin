
class kamu{
    fun kita(){

        fun dia(){
            println("indonesia")
            fun mereka(){
                println("mereka")
                fun palestine(){
                    println("palestine")
                }
                palestine()
            }
            mereka()
        }
        dia()

        println("kamu")
    }
}

fun main(){
    val kamu = kamu()
    kamu.kita()
}


// class Kamu {
//     fun kita() {
//         fun dia() {
//             println("indonesia")
//         }

//         println("kamu")
//         dia() // Panggil metode dia() di dalam metode kita()
//     }
// }

// fun main() {
//     val kamu = Kamu()
//     kamu.kita() // Panggil metode kita()
// }