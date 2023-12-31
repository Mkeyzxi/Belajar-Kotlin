// interface bangunDatar{
//     var alas:int;
//     var tinggi:int;

//     fun segitiga(){
//         this.alas = alas;
//         this.tinggi  = tinggi;
//         var luas = 1/2 * (alas * tinggi);
//         println("segitiga memiliki alas $alas, dan tinggi $tinggi serta luas : $luas");
//     }
//     // fun persegiPanjang() : float{

//     // }
//     // fun persegi() : float{

//     // }
//     // fun lingkaran() :float{}
//     // fun jajaranGenjang():float{}
// }

// class cetak() : bangunDatar{
//     override fun segitiga();
//     // override fun persegiPanjang();
//     // override fun persegi();
//     // override fun lingkaran();
//     // override fun jajaranGenjang();
// }

// fun main(){
//     var cetak = cetak();
//     cetak.segitiga()
// }

interface BangunDatar {
    var alas: Int;
    var tinggi: Int;
    var panjang: Int;
    var lebar: Int;
    var sisi: Int;
    var sisi2: Int;
    var jari_jari: Int;

    fun segitiga() {
        val luas = 0.5 * alas * tinggi;
        println("Segitiga memiliki alas $alas dan tinggi $tinggi serta luas: $luas");
    }

    fun persegiPanjang() {
        val luas = panjang * lebar
        println("Persegi panjang memiliki panjang $panjang dan lebar $lebar serta luas: $luas");
    }

    fun persegi() {
        val luas = sisi * sisi
        println("Persegi memiliki sisi $sisi serta luas : $luas");
    }
    fun lingkaran() {
        var luas = 3.14 * sisi * sisi2
        println("Lingkaran memiliki sisi $sisi serta luas : $luas");
    }

    fun jajaranGenjang() {
        val luas = alas * tinggi
        println("Lingkaran memiliki alas $alas dan tinggi $tinggi serta luas : $luas");
    }
}

class Cetak : BangunDatar {
    override var alas: Int = 5;
    override var tinggi: Int = 5;
    override var lebar: Int = 6;
    override var panjang: Int = 7;
    override var sisi: Int = 8;
    override var sisi2: Int = 9;
    override var jari_jari: Int = 10;

    override fun segitiga() {
        super.segitiga();
    }
    override fun lingkaran() {
        super.lingkaran();
    }
    override fun persegiPanjang(){
        super.persegiPanjang();
    }
    override fun persegi(){
        super.persegi();
    }
    override fun jajaranGenjang() {
        super.jajaranGenjang();
    }
}

fun main() {
    val cetak = Cetak();
    cetak.segitiga();
    cetak.persegiPanjang();
    cetak.persegi();
    cetak.lingkaran();
    cetak.jajaranGenjang();
}