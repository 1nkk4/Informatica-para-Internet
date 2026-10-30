package util;

import java.util.Locale;

/**
 * Métodos auxiliares para exibir textos e números nas páginas.
 * São "static": chamamos direto, por exemplo  Texto.escapar(nome).
 */
public class Texto {

    // Troca caracteres especiais do HTML (<, >, &, ") por códigos seguros,
    // para que um texto digitado pelo usuário não "quebre" a página.
    public static String escapar(String texto) {
        if (texto == null) {
            return "";
        }
        texto = texto.replace("&", "&amp;");
        texto = texto.replace("<", "&lt;");
        texto = texto.replace(">", "&gt;");
        texto = texto.replace("\"", "&quot;");
        return texto;
    }

    // Preço para mostrar ao usuário: 28,90
    public static String precoParaExibir(double preco) {
        return String.format(Locale.forLanguageTag("pt-BR"), "%.2f", preco);
    }

    // Preço para colocar em um <input type="number">: 28.90 (com ponto)
    public static String precoParaCampo(double preco) {
        return String.format(Locale.US, "%.2f", preco);
    }
}
