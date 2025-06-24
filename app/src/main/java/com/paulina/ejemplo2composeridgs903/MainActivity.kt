package com.paulina.ejemplo2composeridgs903

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.paulina.ejemplo2composeridgs903.ui.theme.Ejemplo2ComposerIDGS903Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo2ComposerIDGS903Theme {
                
                Calculadora()
            }
        }
    }
}

// You can keep your navigation composables here or move them to a separate file if they grow
// @Composable
// fun PantallaInicio(navController: NavHostController){
//    var nombre by remember { mutableStateOf("") }
//
//    Column (
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text("Pantalla de Inicio")
//        Spacer(modifier = Modifier.height(16.dp))
//        TextField(
//            value = nombre,
//            onValueChange = {nombre = it},
//            label = {("Ingrese su nombre")},
//            modifier = Modifier.fillMaxWidth()
//
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(onClick = {
//            val nombre = nombre.ifBlank { "Invitado" }
//            navController.navigate("detalle/nombre")
//        }){
//            Text("Ir a detalle con nombre ")
//        }
//        }
//
//    }
//
// @Composable
// fun PantallaDetalle ( navController: NavHostController, nombre: String){
//    Column (
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//
//        Text("Bienvenido $nombre")
//        Button(onClick = {
//            navController.navigate("inicio")
//        }){
//            Text("Volver")
//        }
//    }
// }