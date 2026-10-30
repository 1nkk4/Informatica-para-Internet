public class login {

    public int codigo;
    public String nome;
    public String email;
    public String senha;
    public long cpf;
    // Nome do fornecedor. Só é preenchido pelo método buscar() do ProdutoDAO,
    // que junta (JOIN) as tabelas produtos e fornecedores.
    public String nomeFornecedor;

    /**
     * Confere se os dados do produto são válidos.
     * Devolve a mensagem do problema encontrado, ou null se está tudo certo.
     */
    public String validar() {
        if (nome == null || nome.trim().equals("")) {
            return "O nome do produto é obrigatório.";
        }
        if (cpf <= 0) {
            return "Digite um cpf válido";
        }
        if (email == null) {
        	return "Digite um email válido";
        }
        if (senha == null) {
        	return "Digite uma senha válida";
        }
        
        
        return null;
    }
}
