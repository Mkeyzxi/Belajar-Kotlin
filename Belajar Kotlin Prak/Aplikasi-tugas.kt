abstract class Barang(var kode: String, var nama: String, var harga: Int) {
    abstract fun tampilkanInfo()
}
class BarangElektronik(kode: String, nama: String, harga: Int, var merek: String) : Barang(kode, nama, harga) {
    override fun tampilkanInfo() {
        println("-- Barang Elektronik --")
        println("kode : $kode")
        println("nama : $nama")
        println("harga : RP$harga")
        println("merek : $merek\n")
    }
}
class BarangPakaian(kode: String, nama: String, harga: Int, var ukuran: String) : Barang(kode, nama, harga) {
    override fun tampilkanInfo() {
        println("-- Barang Pakaian --")
        println("kode: $kode")
        println("nama: $nama")
        println("harga: RP$harga")
        println("ukuran: $ukuran\n")
    }
}
class ManajerBarang {
    private val daftarBarang = mutableListOf<Barang>()
    fun tambahBarang(barang: Barang) {
        daftarBarang.add(barang)
    }
    fun ubahInfoBarang(kode: String, namaBaru: String, hargaBaru: Int) {
        val barang = cariBarang(kode)
        if (barang != null) {
            barang.nama = namaBaru
            barang.harga = hargaBaru
        } else {
            println("Barang dengan kode $kode tidak ditemukan.")
        }
    }
    fun hapusBarang(kode: String) {
        val barang = cariBarang(kode)
        if (barang != null) {
            daftarBarang.remove(barang)
            println("Barang dengan kode $kode berhasil dihapus.")
        } else {
            println("Barang dengan kode $kode tidak ditemukan.")
        }
    }
    private fun cariBarang(kode: String): Barang? {
        return daftarBarang.find { it.kode == kode }
    }
    fun tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            println("--> Daftar barang kosong.")
        } else {
            println("--> Daftar Barang:")
            daftarBarang.forEach { it.tampilkanInfo() }
        }
    }
}

fun main() {
    val manajerBarang = ManajerBarang()
    val elektronik1 = BarangElektronik("E001", "Laptop", 15000000, "Asus")
    val pakaian1 = BarangPakaian("P001", "Kaos", 50000, "L")

    manajerBarang.tambahBarang(elektronik1)
    manajerBarang.tambahBarang(pakaian1)
    manajerBarang.tampilkanSemuaBarang()
    manajerBarang.ubahInfoBarang("E001", "Laptop Gaming", 15000000)
    manajerBarang.tampilkanSemuaBarang()
    manajerBarang.hapusBarang("P001")
    manajerBarang.tampilkanSemuaBarang()
}
