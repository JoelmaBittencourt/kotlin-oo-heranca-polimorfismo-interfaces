class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int, tipo: Int

) : Funcionario(nome = nome,
    cpf = cpf,
    salario = salario,
tipo= tipo) {
            override fun bonificacao(): Double {
            return salario * 0.5
        }
    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
