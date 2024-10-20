package ru.otus.cars


/**
 * Бак
 * */
interface Tank {
    /**
     * Горловина
     * */
    val tankMouth: TankMouth

    /**
     * Показать содержимое
     * */
    fun getContents():Int

    /**
     * Заправить
     * */
    fun receiveFuel(litres: Int)
}