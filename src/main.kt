fun main() {


    val alex = Funcionario(
        cpf = "123.123.123=10",
        nome = "alex ferrado",
        salario = 10000.0,
      //  tipo = 1
    )

    println("Bem vindex ao ByteBank ${alex.nome}")
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")

    println("-------------------------------------------------------------------------------------")

    val joelma = Funcionario(
        cpf = "123.123.123=10",
        nome = "joelma B",
        salario = 90000.0,
    //    tipo = 0
    )


    println("Bem vindex ao ByteBank ${joelma.nome}")
    println("nome ${joelma.nome}")
    println("cpf ${joelma.cpf}")
    println("salario ${joelma.salario}")
    println("bonificação ${joelma.bonificacao()}")

    println("-------------------------------------------------------------------------------------")

    val fran = Gerente(
        nome = "fran",
        cpf = "1234567898-11",
        salario = 20000.0,
        senha = 123)
       // tipo = 2
    println("Bem vindex ao ByteBank Gerente ${fran.nome}")
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")


    if (fran.autenticacao(123)) {
        println("autenticação bem sucedida!!!")
    } else {
        println("senha incorreta")
    }
    println("-------------------------------------------------------------------------------------")


    val gui = Diretor(
       // tipo = 2,
        nome = "Gui",
        cpf = "123458795-5",
        salario = 4.0000,
        senha = 3000,
        plr = 2.000)

                println("Bem vindex ao ByteBank Diretor ${gui.nome}")
                println("nome ${gui.nome}")
                println("cpf ${gui.cpf}")
                println("salario ${gui.salario}")
                println("bonificação ${gui.bonificacao()}")
                println("plr ${gui.plr}")

    if (fran.autenticacao(4000)) {
        println("autenticação bem sucedida!!!")
    } else {
        println("senha incorreta")
    }
    val calculadora =CalculadoraBonificacao()
        calculadora.registra(alex)
        calculadora.registra(fran)
        calculadora.registra(gui)

    println("-------------------------------------------------------------------------------------")

    println("total de bonificaçãoo : ${calculadora.total}")
    }

