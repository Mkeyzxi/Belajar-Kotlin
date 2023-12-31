interface Admin{
    fun cuciKomplit();
    fun dryClean();
    fun cuciSatuan();
}

abstract class DaftarPaket : Admin(){
    fun cuciKomplit(val reguler: String  = "Kilat",val kilat: String  = "Reguler",val express: String  = "Express",val pilihan: String?,){
        println("piihan anda reguler: ${pilihan}");
    }
    fun dryClean(val reguler: String  = "Kilat",val kilat: String  = "Reguler",val express: String  = "Express",val pilihan: String?){
        println("piihan anda dryClean : ${pilihan}");
    }
    fun cuciSatuan(val pilihan: String?){
        prinln("Pilihan anda cuci satuan : ${pilihan}");
    }
    fun WaktuKerja(val waktuKerja:int,val beratMin:int,val tarif:int){
        println("waktu Kerja : ${waktuKerja}")
        println("berat : ${beratMin} kg")
        println("tarif : RP${tarif}")
    }
}
class OrderBaru() : DaftarPaket(){
    if(pilihan == "Cuci Komplit" || pilihan == "cuci Komplit"){
        println("pilihan kilat")
    }else if(pilihan == "Dry Clean" || pilihan == "dry clean"){
        println("pilihan dry clean")
    }
    else if(pilihan == "Cuci Satuan" || pilihan == "cuci satuan"){
        println("pilihan cuci satuan")
    }else{
        println("anda tidak mempunya pilihan")
    }
} 

class RiwayatTransaksi : DaftarPaket(){
    println("indonesia")
}
fun main() {
    println("kamu nanya")
}