package com.bottom.navigtion


sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object File : NavigationItem("file", R.drawable.ic_book, "File")
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Music : NavigationItem("music", R.drawable.ic_music, "Music")
    object Movies : NavigationItem("movies", R.drawable.ic_movie, "Movies")
    object Books : NavigationItem("books", R.drawable.ic_book, "Books")
    object Web : NavigationItem("web", R.drawable.ic_book, "Web")
    object Dashboard : NavigationItem("dashboard", R.drawable.ic_book, "Dashboard")
    object Discover : NavigationItem("discover", R.drawable.ic_book, "Discover")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}