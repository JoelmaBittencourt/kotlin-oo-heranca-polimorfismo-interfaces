class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int, tipo: Int,
val plr: Double

) : Funcionario(nome = nome,
    cpf = cpf,
    salario = salario,
tipo= tipo) {
            fun bonificacao(): Double {
            return salario * 0.3
        }
    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
