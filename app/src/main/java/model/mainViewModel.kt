package model

import androidx.lifecycle.ViewModel
import com.example.myapplication.model.TextComparator

class MainViewModel : ViewModel() {
    private val textComparator = TextComparator()

    fun compareTexts(text1: String, text2: String): Boolean {
        return textComparator.compareTexts(text1, text2)
    }
}
