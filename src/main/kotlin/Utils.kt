fun generaAleatorio(minimo: Int, maximo: Int): Int {
    return Math.floor(Math.random() * (maximo - minimo + 1) + minimo).toInt()
}