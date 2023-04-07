fun main() {
    val name = getName()
    val mail = getMail()
    val adres = getAdress()
    val age = getAge()
    ages(age)
    getInformation(name, mail, adres, age)
}

fun getName(): String? {
    println("Добро пожаловать! Напишите ваше имя:")
    return readln()
}

fun getMail(): String? {
    println("Укажите вашу почту")
    return readln()
}

fun getAdress(): String? {
    println("Укажите ваш город")
    return readln()
}

fun getAge(): Int? {
    println("Введите возраст:")
    return readLine()?.toInt()
}

fun ages(age:Int?) {
    if (age!! < 18) {
        println("Вы не достигли совереннолетия.")
    } else {
        println("Добро пожаловать!")
    }
}

fun getInformation(name:String?, mail:String?, adress:String?, age:Int?) {
    println("Данные пользователья:")
    println("Имя:$name")
    println("Адрес:$mail")
    println("Почта:$adress")
    println("Сколько лет:$age")
}