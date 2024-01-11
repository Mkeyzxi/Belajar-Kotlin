import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.sin
import kotlin.math.pow
import kotlin.math.sqrt
import java.math.BigInteger

interface KalkulatorAritmatika {
    fun calculateTambah(): Int
    fun calculateKurang(): Int
    fun calculateKali(): Int
    fun calculateBagi(): Float
    fun calculateModulus(): Int
}

interface KalkulatorLanjutan {
    fun calculateMedian(): Float
    fun calculateAkar(): Float 
    fun calculatePerpangkatan(): BigInteger 
    fun calculateFaktorial(): BigInteger
}

interface KalkulatorTrigonometri {
    fun calculateSin(): Float
    fun calculateCos(): Float
    fun calculateTan(): Float
}
interface KalkulatorKonversi {
    fun calculateBulatToDecimal(): String
    fun calculateBulatToHexa(): String
    fun calculateBulatToBinery(): String
}

class KalkulatorAritmatikaKu(private var varSatu: Int,private var varDua: Int) : KalkulatorAritmatika {

    override fun calculateTambah(): Int = varSatu + varDua

    override fun calculateKurang(): Int = varSatu - varDua

    override fun calculateKali(): Int = varSatu * varDua

    override fun calculateBagi(): Float {
        if(varSatu != 0){
            return varSatu.toFloat() / varDua.toFloat()
        }else{
            return 0.0F
        }
    }

    override fun calculateModulus(): Int {
        if(varSatu != 0){
            return varSatu % varDua
        }else{
            return 0
        }
    }
}

class KalkulatorLanjutanKu(private var varSatu: Int,private var varDua: Int) : KalkulatorLanjutan{
    override fun calculateMedian(): Float = (varSatu.toFloat() + varDua.toFloat()) / 2

    override fun calculateAkar(): Float = sqrt(varSatu.toFloat())

    override fun calculatePerpangkatan(): BigInteger {
        var result = BigInteger.ONE
        val base = BigInteger.valueOf(varSatu.toLong())

        for (i in 1..varDua) {
            result *= base
        }

        return result
    }

    override fun calculateFaktorial(): BigInteger {
        var result = BigInteger.ONE
        for (i in 1..varSatu) {
            result *= BigInteger.valueOf(i.toLong())
        }
        return result
    }
}
class KalkulatorTrigonometriKu(private var varSatu: Int,private var varDua: Int) : KalkulatorTrigonometri{
    override fun calculateSin(): Float = sin(Math.toRadians(varSatu.toDouble())).toFloat()

    override fun calculateCos(): Float = cos(Math.toRadians(varSatu.toDouble())).toFloat()

    override fun calculateTan(): Float = tan(Math.toRadians(varSatu.toDouble())).toFloat()
}

class KalkulatorKonversiKu(private var varSatu: Int,private var varDua: Int) : KalkulatorKonversi{
    override fun calculateBulatToDecimal(): String = varSatu.toString()

    override fun calculateBulatToHexa(): String = Integer.toHexString(varSatu).uppercase()

    override fun calculateBulatToBinery(): String = Integer.toBinaryString(varSatu)
}



fun Cetak(varSatu: Int, varDua: Int, pilihan: String, pilihan2: String) {
    val kalkulatorKuAritmatika = KalkulatorAritmatikaKu(varSatu, varDua)
    val kalkulatorKuLanjutan = KalkulatorLanjutanKu(varSatu, varDua)
    val kalkulatorKuTrigonometri = KalkulatorTrigonometriKu(varSatu, varDua)
    val kalkulatorKuKonversi = KalkulatorKonversiKu(varSatu, varDua)


    when (pilihan) {
        "1" -> {
            println("Operasi Aritmatika")
            when (pilihan2) {
                "1" -> {
                    println("Pertambahan : $varSatu + $varDua")
                    println("hasil : " + kalkulatorKuAritmatika.calculateTambah())
                }
                "2" -> {
                    println("Pengurangan : $varSatu - $varDua")
                    println("hasil : " + kalkulatorKuAritmatika.calculateKurang())
                }
                "3" -> {
                    println("Perkalian : $varSatu * $varDua")
                    println("hasil : " + kalkulatorKuAritmatika.calculateKali())
                }
                "4" -> {
                    println("Pembagian : $varSatu / $varDua")
                    println("hasil : " + kalkulatorKuAritmatika.calculateBagi())
                }
                "5" -> {
                    println("Modulus : $varSatu % $varDua")
                    println("hasil : " + kalkulatorKuAritmatika.calculateModulus())
                }
                "6" -> {
                    println("Semua : $varSatu, $varDua")
                    println("hasil tambah : ${kalkulatorKuAritmatika.calculateTambah()}")
                    println("hasil kurang : ${kalkulatorKuAritmatika.calculateKurang()}")
                    println("hasil kali : ${kalkulatorKuAritmatika.calculateKali()}")
                    println("hasil bagi : ${kalkulatorKuAritmatika.calculateBagi()}")
                    println("hasil modulus : ${kalkulatorKuAritmatika.calculateModulus()}")
                }
                else -> {
                    println("Tidak ada operasi, saatnya berhenti ;)")
                }
            }
        }
        "2" -> {
            println("Operasi Lanjutan")
            when (pilihan2) {
                "1" -> {
                    println("Median : $varSatu")
                    println("hasil : ${kalkulatorKuLanjutan.calculateMedian()}")
                }
                "2" -> {
                    println("Akar : $varSatu")
                    println("hasil : ${kalkulatorKuLanjutan.calculateAkar()}")
                }
                "3" -> {
                    println("Perpangkatan : $varSatu^$varDua")
                    println("hasil : ${kalkulatorKuLanjutan.calculatePerpangkatan()}")
                }
                "4" -> {
                    println("Faktorial : $varSatu!")
                    println("hasil : ${kalkulatorKuLanjutan.calculateFaktorial()}")
                }
                "5" -> {
                    println("Semua : $varSatu, $varDua")
                    println("hasil median $varSatu-$varDua : ${kalkulatorKuLanjutan.calculateMedian()}")
                    println("hasil akar : ${kalkulatorKuLanjutan.calculateAkar()}")
                    println("hasil $varSatu^$varDua : ${kalkulatorKuLanjutan.calculatePerpangkatan()}")
                    println("hasil $varSatu! : ${kalkulatorKuLanjutan.calculateFaktorial()}")
                }
                else -> {
                    println("Tidak ada operasi, saatnya berhenti ;)")
                }
            }
        }
        "3" -> {
            println("Operasi Trigonometri")
            when (pilihan2) {
                "1" -> {
                    println("Sin : $varSatu")
                    println("hasil : ${kalkulatorKuTrigonometri.calculateSin()}")
                }
                "2" -> {
                    println("Cos : $varSatu")
                    println("hasil : ${kalkulatorKuTrigonometri.calculateCos()}")
                }
                "3" -> {
                    println("Tan : $varSatu")
                    println("hasil : ${kalkulatorKuTrigonometri.calculateTan()}")
                }
                "4" -> {
                    println("Semua : $varSatu")
                    println("hasil sin : ${kalkulatorKuTrigonometri.calculateSin()}")
                    println("hasil cos : ${kalkulatorKuTrigonometri.calculateCos()}")
                    println("hasil tan : ${kalkulatorKuTrigonometri.calculateTan()}")
                }
                else -> {
                    println("Tidak ada operasi, saatnya berhenti ;)")
                }
            }
        }
        "4" -> {
            println("Operasi Konversi")
            when (pilihan2) {
                "1" -> {
                    println("Decimal : $varSatu")
                    println("hasil : ${kalkulatorKuKonversi.calculateBulatToDecimal()}")
                }
                "2" -> {
                    println("Hexadecimal : $varSatu")
                    println("hasil : ${kalkulatorKuKonversi.calculateBulatToHexa()}")
                }
                "3" -> {
                    println("Binery : $varSatu")
                    println("hasil : ${kalkulatorKuKonversi.calculateBulatToBinery()}")
                }
                "4" -> {
                    println("Semua : $varSatu")
                    println("hasil Decimal : ${kalkulatorKuKonversi.calculateBulatToDecimal()}")
                    println("hasil Hexadecimal : ${kalkulatorKuKonversi.calculateBulatToHexa()}")
                    println("hasil Binery : ${kalkulatorKuKonversi.calculateBulatToBinery()}")
                }
                else -> {
                    println("Tidak ada operasi, saatnya berhenti ;)")
                }
            }
        }
        else -> {
            println("dadah")
        }
    }
}


fun main() {
    println("Selamat Datang Di KalkulatorKu")
    println("Silahkan memilih operasi!")
    println("1. Operasi aritmatika")
    println("   1 - Perjumlahan")
    println("   2 - Pengurangan")
    println("   3 - Perkalian")
    println("   4 - Pembagian")
    println("   5 - Modulus")
    println("   6 - Semua")
    println("2. Operasi lanjutan")
    println("   1 - Median")
    println("   2 - Akar")
    println("   3 - Perpangkatan")
    println("   4 - Faktorial")
    println("   5 - Semua")
    println("3. Operasi trigonometri")
    println("   1 - Sin")
    println("   2 - Cos")
    println("   3 - Tan")
    println("   4 - Semua")
    println("4. Operasi konversi")
    println("   1 - Decimal")
    println("   2 - Hexadecimal")
    println("   3 - Binery")
    println("   4 - Semua")
    println("\nPilihan anda : ")

    //masukkan pilihan dibawah ini

    Cetak(5, 5, "1", "6")
    Cetak(5, 5, "2", "5")
    Cetak(5, 5, "3", "4")
    Cetak(11, 5, "4", "4")
}
