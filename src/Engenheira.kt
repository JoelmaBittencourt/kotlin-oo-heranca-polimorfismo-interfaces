class Engenheira (
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,

    val plr: Double,
val mulher : String
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario
        }

}
