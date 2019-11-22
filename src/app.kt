package ordenador

fun main() {
    val mouseA = Mouse()
    mouseA.color = "blanco"
    println(mouseA.toString())
    println(mouseA.color)
    val mouseB = Mouse("bluetooth")
    println(mouseB.toString())
    var miComputador = Computer(Cpu(4.1F,5000), Mouse("usb"), Screen("Samsumg",21F))
    println("${miComputador.cpu} y ${miComputador.raton.tipo}")
    println(miComputador.toString())
    var ratonSorpresa=Mouse("Ay")
    println(ratonSorpresa.tipo)
    //comentario
}


