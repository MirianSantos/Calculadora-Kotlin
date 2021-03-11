class Calculadora {
    companion object {

        const val SOMA = 1
        const val SUBTRACAO = 2
        const val MULTIPLICACAO = 3
        const val DIVISAO = 4

        @JvmStatic
        fun main(args: Array<String>) {

            try {
                print("Informe o valor do primeiro operador: ")
                var valor1: Float = readLine()?.toFloat()!!;

                print("Informe o valor do segundo operador: ")
                var valor2: Float = readLine()?.toFloat()!!;

                while (true) {
                    print("Entre com a operação desejada (1=SOMA, 2=SUBTRAÇÃO, 3=MULTIPLICAÇÃO, 4=DIVISÃO)")

                    var resultado: Float;
                    var operacao: Int = Integer.valueOf(readLine());

                    if (operacao == SOMA) {
                        resultado = valor1 + valor2
                        println(String.format("O resultado da soma de %s + %s = %s", valor1, valor2, resultado))
                    } else if (operacao == SUBTRACAO) {
                        resultado = valor1 - valor2
                        println(String.format("O resultado da subtração de %s - %s = %s", valor1, valor2, resultado))
                    } else if (operacao == MULTIPLICACAO) {
                        resultado = valor1 * valor2
                        println(
                            String.format(
                                "O resultado da multiplicação de %s x %s = %s",
                                valor1,
                                valor2,
                                resultado
                            )
                        )
                    } else if (operacao == DIVISAO) {
                        resultado = valor1 / valor2
                        println(String.format("O resultado da divisão de %s / %s = %s", valor1, valor2, resultado))
                    } else {
                        println(String.format("A operação selecionada não é válida! Tente novamente."))
                        continue
                    }
                    break
                }
            } catch (e:NumberFormatException) {
                println("O valor informado não é um número válido!")
            }
        }

    }
}