package com.example.tutorial

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel: ViewModel() {

     var backgroundColor by mutableStateOf(Color.White) //Alt+Enter to import the White color
        private set

    fun changeBackgroundColor() {
        backgroundColor = Color.Red

    }
}
