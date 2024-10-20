package ru.otus.cars

class GasStation {

    companion object {
        fun refuelCar(car: Car, litres: Int) {
            println("Заправляем ${car.javaClass.simpleName}")
            try {
                when (car.tank.tankMouth) {
                    is LpgMouth -> refuelLpg(car.tank, litres)

                    is PetrolMouth -> refuelPetrol(car.tank, litres)
                }
            } catch (e: NotImplementedError) {
                println("Не повезло. ${e.message}")
            }
        }
        private fun refuelLpg(tank: Tank, litres: Int) {
            println("Заправляем газом")
            tank.receiveFuel(litres)
        }

        private fun refuelPetrol(tank: Tank, litres: Int) {
            println("Заправляем бензином")
            tank.receiveFuel(litres)
        }
    }
}