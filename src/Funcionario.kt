open class Funcionario (
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int//0 funcionario,1 gerente,2 diretor
) {
   open fun  bonificacao(): Double {
        return salario * 0.1
    }
}
//    constructor(nome: String, cpf: String, salario: Double) {
//        this.nome = nome
//        this.cpf = cpf
//        this.salario = salario
//    }


