import java.util.Scanner

fun main() {

    val medication = mutableMapOf <String, String> (

    )
    val sc = Scanner(System.`in`)
    var agregarMed = true
    if (agregarMed) {


        do  {
        // código para agregar medicamentos al mapa

        println("Escriba el nombre del medicamento")
        val medicationName = sc.nextLine()
        println("Ingrese la hora en que debe tomarlo :: Ej 8:00 ::")
        val time = sc.nextLine()
        medication.put(medicationName, time)
        println("Desea agregar más medicamentos? (S/N)")
        var continuar = sc.nextLine()

    } while (continuar.equals("S", true))



    }

    if (!medication.isEmpty()) {
        printerLines(50)
        println("Lista de medicamentos")
        println(medication)
    } else {
        printerLines(50)
        print("No hay medicamentos")

    }
}
    // // Maps Inmutables
    // val edadDeSuperHeroes = mapOf(
    //     "Ironman" to 35,
    //     "Spiderman" to 23,
    //     "Capitan America" to 99
    // )
    // println(edadDeSuperHeroes)

    // // Maps mutables
    // val edadDeSuperHeroesMutable = mutableMapOf(
    //     "Ironman" to 35,
    //     "Spiderman" to 23,
    //     "Capitan America" to 99
    // )
    // println(edadDeSuperHeroesMutable)

    // // Consultar un valor por su clave
    // val edadIronman = edadDeSuperHeroesMutable["Ironman"]
    // println("La edad de Ironman es $edadIronman")

    // // Agregar elemento a un Map usando la función put
    // edadDeSuperHeroesMutable.put("Wolverine", 45)
    // println(edadDeSuperHeroesMutable)

    // // Usando asignación
    // edadDeSuperHeroesMutable["Storm"] = 30
    // println(edadDeSuperHeroesMutable)

    // // Eliminar elemento de nuestro Map
    // edadDeSuperHeroesMutable.remove("Wolverine")

    // // Para conocer todas las keys de nuestro map .keys
    // println(edadDeSuperHeroesMutable.keys)

    // // Todos los valores del map usamos .values
    // println(edadDeSuperHeroesMutable.values)

