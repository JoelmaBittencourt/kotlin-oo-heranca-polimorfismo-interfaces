fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    println("-----------------------------------------------------")

    val jadiano = Estagiario(
        nome = "jadiano",
        cpf = "111.111.111-11",
        salario = 1000.0,
        apelido = "jadi"
    )

    println("nome ${jadiano.nome}")
    println("cpf ${jadiano.cpf}")
    println("salario ${jadiano.salario}")
    println("bonificação ${jadiano.bonificacao}")
    println("apelido ${jadiano.apelido}")


    println("-----------------------------------------------------")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
    println("-----------------------------------------------------")
    val mustafa = Coordenadora(
        nome = "Mustafa",
        cpf = "222.222.222-22",
        salario = 2000.0,
        nomeSocial = "Mustafa Maria",
    senha = 1234,
    plr = 100.0
    )

    println("nome ${mustafa.nome}")
    println("cpf ${mustafa.cpf}")
    println("salario ${mustafa.salario}")
    println("bonificação ${mustafa.bonificacao}")
    println("nome social ${mustafa.nomeSocial}")
    println("plr ${mustafa.plr}")


    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }


    println("-----------------------------------------------------")
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
    println("-----------------------------------------------------")
    val joelma = Engenheira(
        nome = "joelma",
        cpf = "333.333.333-33",
        salario = 5000.0,
        senha = 5432,
        plr = 200.0,
    mulher = "sim"
    )

    println("nome ${joelma.nome}")
    println("cpf ${joelma.cpf}")
    println("salario ${joelma.salario}")
    println("bonificação ${joelma.bonificacao}")
    println("plr ${joelma.plr}")
    println("mulher? ${joelma.mulher}")

    if (gui.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    println("-----------------------------------------------------")
    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )
    println("-----------------------------------------------------")
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}