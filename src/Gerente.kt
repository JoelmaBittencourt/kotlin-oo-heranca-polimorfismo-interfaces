class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
   // tipo = tipo
) {
    // ou     fun bonificacao(): Double {
    override fun bonificacao(): Double {
        return salario * 0.2 + salario
    }

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
