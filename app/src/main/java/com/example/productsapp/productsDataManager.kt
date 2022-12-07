package com.example.productsapp

object productsDataManager {
    val products = mutableListOf<Produkt>()

    init {
        createProducts()
    }

    fun createProducts() {

        products.add(Produkt(R.drawable.banana, "Banan", "20 kr/kg"))
        products.add(Produkt(R.drawable.apple, "Äpple", "19.90 kr/kg"))
        products.add(Produkt(R.drawable.vitkol, "Vitkål", "23.50 kr/kg"))
        products.add(Produkt(R.drawable.tomat, "Tomat", "18.90 kr/kg"))
        products.add(Produkt(R.drawable.kyckling, "Kyckling", "36.50 kr/st"))
        products.add(Produkt(R.drawable.meet, "Fläsk", "72.90 kr/kg"))
        products.add(Produkt(R.drawable.pommes, "Pommes", "24.00 kr/st"))
        products.add(Produkt(R.drawable.chips, "Chips", "22.50 kr/st"))
        products.add(Produkt(R.drawable.canndy, "Godis", "20.00 kr/hg"))
        products.add(Produkt(R.drawable.drink, "Läsk", "21.20 kr/st "))
    }
}