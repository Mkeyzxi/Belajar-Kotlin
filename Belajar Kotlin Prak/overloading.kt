class dataMahasiswa(var nama: String){
    var id:String = "3232";
    var nim:String = "070"
    fun dataPenampilan(id: String) : Unit {
        println("Nama : ${nama}, NIM : ${id}")
    }
    fun dataPenampilan(id: String, kelas:String) : Unit {
        println("Nama : ${nama}, NIM : ${id}, KELAS : ${kelas}")
        
    }
    
}

fun main() {
    var mahasiswa = dataMahasiswa("makbul")
    mahasiswa.dataPenampilan("070","Kelas D")
    mahasiswa.dataPenampilan("070")
    
}
