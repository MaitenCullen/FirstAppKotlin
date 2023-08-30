package com.example.myapplication

import com.example.myapplication.model.TextComparator
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TextComparatorTest {
    @Test
    fun testCompareTexts_equalTexts() {
        val textComparator = TextComparator()
        val result = textComparator.compareTexts("hello", "hello")
        assertTrue(result)
    }
    @Test
    fun testCompareTexts_differentTexts() {
        val textComparator = TextComparator()
        val result = textComparator.compareTexts("hello", "world")
        assertFalse(result)
    }

}