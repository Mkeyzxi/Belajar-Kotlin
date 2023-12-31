class Mahasiswa(var nama:String = "",var nim:String = ""){
    // init {
    //     println("nama : $nama | nim : $nim");
    // }
}

fun main(){
    var mahasiswa1 = Mahasiswa("Muhammad Makbul N", "60200122070");
    println("${mahasiswa1.nama} | ${mahasiswa1.nim}");
    // mahasiswa1.nama = "Rexoan Malena";
    // mahasiswa1.nim = "60200122030";
    // println("${mahasiswa1.nama} | ${mahasiswa1.nim}");
}