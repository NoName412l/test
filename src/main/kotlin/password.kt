import kotlin.random.Random

fun generatePassword(length: Int): String {
    val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+"
    return (1..length)
        .map { allowedChars[Random.nextInt(allowedChars.length)] }
        .joinToString("")
}

// Пример использования
fun main() {
    val password = generatePassword(10) // Сгенерировать пароль длиной 10 символов
    println("Ваш пароль: $password")
}


