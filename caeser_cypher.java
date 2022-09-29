public class caeser_cypher {

    public static String criptografar(String texto, int chave){
        String criptografada = "";
        int tamanho_texto = texto.length();
        for (int i = 0; i < tamanho_texto; i++){
            char atual = '0';
            int character = (int)texto.charAt(i);
            if (character != 32){
                atual = (char)(97+((character+(((-1)*chave%25)+26))%123)%97);
            } else {
                atual = (char)character;
            }
            criptografada = criptografada + atual;
            }
        return criptografada;
    }

    public static String descriptografar(String texto, int chave){
        String descriptografada = "";
        int tamanho_mensagem = texto.length();
        for (int i = 0; i < tamanho_mensagem; i++){
                char atual = '0';
                int character = (int)texto.charAt(i);
                if (character != 32){
                    atual = (char)(97+((character+(chave%25))%123)%97);
                } else {
                    atual = (char)character;
                }
                descriptografada = descriptografada + atual;
            }
        return descriptografada;
    }
    public static void main(String[] args) {
        for(int chave = 1; chave < 26; chave++){
            System.out.printf("Chave: %s\n", chave);
            System.out.println(criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado", chave));
            System.out.println(descriptografar(criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado", chave), chave));
            System.out.println();
        }
    }
}

// to crypt msg, key 13:       a ligeira raposa marrom saltou sobre o cachorro cansado
// to decrypt msg key 13 : n yvtrven encbfn zneebz fnygbh fboer b pnpubeeb pnafnqb