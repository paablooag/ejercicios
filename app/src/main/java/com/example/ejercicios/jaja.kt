package com.example.ejercicios
val PI =  3.14159
fun main(){
    //ejercicio 1
    var edad = 19
    var nombre = "Pablo"
    var altura = 1.70

    //ejercicio 2
    var radio = 4
    var area = PI*(radio*radio)
    println("Area $area")

    //Ejercicio 3
    saludar(nombre,edad)
    //Ejercicio 4
    informacionPersonal(nombre,edad,ciudad="Graná")
    //Ejercicio5

}
//ejercicio 3
fun saludar(nombre:String,edad:Int){
    println("Hola bebe, soy $nombre y tengo $edad años")
}

//ejercicio 4
fun informacionPersonal(nombre: String, edad: Int, ciudad: String){
    println("Hola bebe, soy $nombre y tengo $edad años, ciudad $ciudad")
}
//Ejercicio 5
fun fan(grados:Int){

}
fun celsius(grados:Int){

}