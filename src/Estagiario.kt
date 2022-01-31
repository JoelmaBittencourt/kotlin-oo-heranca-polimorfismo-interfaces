class Estagiario (

nome: String,
cpf: String,
salario: Double,

val apelido : String
) : Funcionario(
nome = nome,
cpf = cpf,
salario = salario,

) {
    override val bonificacao: Double
    get() = salario * 0.02 //To change initializer of created properties use File | Settings | File Templates.


}

