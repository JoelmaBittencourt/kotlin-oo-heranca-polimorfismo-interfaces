class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int, val plr: Double

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
   // tipo = tipo
) {
    //ou  fun bonificacao(): Double {
    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr
       // return salario * 0.3 + salario+ plr
    }

//    fun autenticacao(senha: Int): Boolean {
//        if (this.senha == senha) {
//            return true
//        }
//        return false
//    }
}
