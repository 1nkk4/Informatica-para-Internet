package modelo;
public class Encomenda {

    public int codigo;
    public String nome_produto;
    public int cod_fornecedor;

    public String validar() {
        if (nome_produto == null || nome_produto.trim().equals("")) {
            return "este campo é obrigatório.";
        }
        if (cod_fornecedor <= 0) {
            return "este campo é obrigatório";
        }
        
    
   
        return null;
    }
}
