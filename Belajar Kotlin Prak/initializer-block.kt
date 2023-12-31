class Mbul(nama:String = "nama", tinggi:Int = 175, berat:Int = 50){
    var nama:String = nama;
    var tinggi:Int = tinggi;
    var berat:Int = berat;
    init {
        println("nama ${nama} | tinggi ${tinggi} | berat ${berat}")
    }
}


fun main() {
    var orang1 = Mbul("mbul", 170, 52);
    var orang2 = Mbul("rezkzq", 166, 48);
    var orang3 = Mbul();
}
