class Coordenadora (
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double,

    val nomeSocial : String
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

}
