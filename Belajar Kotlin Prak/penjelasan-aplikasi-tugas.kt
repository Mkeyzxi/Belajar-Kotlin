// Kelas abstrak untuk merepresentasikan barang
abstract class Barang(var kode: String, var nama: String, var harga: Double) {
    abstract fun tampilkanInfo()
}

// Kelas implementasi untuk barang Elektronik
class BarangElektronik(kode: String, nama: String, harga: Double, var merek: String) : Barang(kode, nama, harga) {
    override fun tampilkanInfo() {
        println("Barang Elektronik:")
        println("Kode: $kode")
        println("Nama: $nama")
        println("Harga: $harga")
        println("Merek: $merek\n")
    }
}

// Kelas implementasi untuk barang Pakaian
class BarangPakaian(kode: String, nama: String, harga: Double, var ukuran: String) : Barang(kode, nama, harga) {
    override fun tampilkanInfo() {
        println("Barang Pakaian:")
        println("Kode: $kode")
        println("Nama: $nama")
        println("Harga: $harga")
        println("Ukuran: $ukuran\n")
    }
}

// Kelas untuk manajemen barang
class ManajerBarang {
    private val daftarBarang = mutableListOf<Barang>()

    // Menambahkan barang baru
    fun tambahBarang(barang: Barang) {
        daftarBarang.add(barang)
    }

    // Mengubah informasi barang
    fun ubahInfoBarang(kode: String, namaBaru: String, hargaBaru: Double) {
        val barang = cariBarang(kode)
        if (barang != null) {
            barang.nama = namaBaru
            barang.harga = hargaBaru
        } else {
            println("Barang dengan kode $kode tidak ditemukan.")
        }
    }

    // Menghapus barang
    fun hapusBarang(kode: String) {
        val barang = cariBarang(kode)
        if (barang != null) {
            daftarBarang.remove(barang)
            println("Barang dengan kode $kode berhasil dihapus.")
        } else {
            println("Barang dengan kode $kode tidak ditemukan.")
        }
    }

    // Mencari barang berdasarkan kode
    private fun cariBarang(kode: String): Barang? {
        return daftarBarang.find { it.kode == kode }
    }

    // Menampilkan semua barang
    fun tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            println("Daftar barang kosong.")
        } else {
            println("Daftar Barang:")
            daftarBarang.forEach { it.tampilkanInfo() }
        }
    }
}

fun main() {
    val manajerBarang = ManajerBarang()

    // Menambahkan barang
    val elektronik1 = BarangElektronik("E001", "Laptop", 800.0, "Asus")
    val pakaian1 = BarangPakaian("P001", "Kaos", 20.0, "L")

    manajerBarang.tambahBarang(elektronik1)
    manajerBarang.tambahBarang(pakaian1)

    // Menampilkan semua barang
    manajerBarang.tampilkanSemuaBarang()

    // Mengubah informasi barang
    manajerBarang.ubahInfoBarang("E001", "Laptop Gaming", 1000.0)

    // Menampilkan semua barang setelah perubahan
    manajerBarang.tampilkanSemuaBarang()

    // Menghapus barang
    manajerBarang.hapusBarang("P001")

    // Menampilkan semua barang setelah penghapusan
    manajerBarang.tampilkanSemuaBarang()
}
