open class Pengulang(var variabel: String){
    open fun tip(tipe: String, nama: String){
        println("$tipe $nama $variabel")
    }
    fun tip(tipe: String){
        println("$variabel $tipe")
    }
}
class mengulang(variabel: String) : Pengulang(variabel){
    override fun tip(tipe: String, nama: String){
        println("$tipe $nama $variabel")
    }
}

fun main(){
    val pengulang1 = Pengulang("123")
    pengulang1.tip("Hello", "Maulana")
    pengulang1.tip("Hello")
}