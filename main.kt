open class armaDeFuego(private var nombre: String, private var municion: Int,
                  private var municionARestar: Int, private var tipoDeMunicion: String,
                  private var danio: Int, private var radio: String) {
    fun dispara() {
        municion -= municionARestar
    }
    fun recarga() {
        municion += 20
    }


}

class pistola: armaDeFuego("pistola", 10, 1, "9mm", 9, "Amplio") {


}

fun main() {
    var p : pistola
    p.recarga()
    println(p.toString())

}