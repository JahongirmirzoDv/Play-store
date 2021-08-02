package com.example.playmarket.utils

class Data {
    var title: String? = null
    var icon: Int? = null
    var apps: ArrayList<Apps>? = null

    constructor(title: String?, icon: Int?, apps: ArrayList<Apps>?) {
        this.title = title
        this.icon = icon
        this.apps = apps
    }
}