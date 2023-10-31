package com.example.perpustakaan

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.perpustakaan.ui.theme.PerpustakaanTheme

private const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate State")
        setContent {
            PerpustakaanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Politeknik Statistika STIS")
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart State")
    }


    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume State")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause State")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop State")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy State")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart State")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Selamat Datang di Perpustakaan $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PerpustakaanTheme {
        Greeting("Android")
    }
}