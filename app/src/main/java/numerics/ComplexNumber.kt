package numerics

data class ComplexNumber(val re: Double, val im: Double) {

    // TODO: Write tests for this
    operator fun plus(addend: ComplexNumber): ComplexNumber {
        return this
    }

    // TODO: Write tests for this
    operator fun unaryMinus(): ComplexNumber {
        return this
    }

    // TODO: Write tests for this
    operator fun minus(subtrahend: ComplexNumber): ComplexNumber {
        return this
    }

    // TODO: Write tests for this
    operator fun times(multiplicand: ComplexNumber): ComplexNumber {
        return this
    }

    // TODO: Write tests for this
    operator fun div(divisor: ComplexNumber): ComplexNumber {
        return this
    }

    // TODO: Write tests for this
    fun abs(): Double {
        return Double.NEGATIVE_INFINITY
    }

}