package uz.sardor.todolist

sealed class Screens(val route:String){
    object MainScreen:Screens("MainScreen")
    object AddScreen:Screens("AddScreen")

}
