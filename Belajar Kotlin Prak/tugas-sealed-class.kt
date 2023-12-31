sealed class Kendaraan(merek: String, warna: String, kegunaan: String, unit: Int) {
    init {
        println("--list $merek--")
        println("warna : $warna")
        println("kegunaan : $kegunaan")
        println("unit : $unit \n")
    }
}

class Mobil(merek: String, warna: String, kegunaan: String, unit: Int) : Kendaraan(merek, warna, kegunaan, unit)

class Motor(merek: String, warna: String, kegunaan: String, unit: Int) : Kendaraan(merek, warna, kegunaan, unit)

fun main() {
    var mobil = Mobil("Lamborghini", "Merah", "Balapan", 10)
    var motor = Motor("Honda Beat", "Abu-Abu", "Pasar", 12)
    var mobil = Mobil("ESEMKA", "Biru", "Hialng", 322)
    var motor = Motor("Supra bapak", "Hitam", "Kekebun", 12)
}
