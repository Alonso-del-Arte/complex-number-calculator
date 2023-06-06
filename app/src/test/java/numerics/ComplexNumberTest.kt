package numerics

import org.junit.Assert.*
import org.junit.Test

internal class ComplexNumberTest {

    @Test
    fun testToString() {
        val re = Math.random()
        val im = Math.random()
        val z = ComplexNumber(re, im)
        val expected: String = re.toString() + "+" + im.toString() + "i"
        val actual: String = z.toString().replace(" ", "")
        assertEquals(expected, actual)
    }

}