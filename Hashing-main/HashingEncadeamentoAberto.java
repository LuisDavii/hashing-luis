package hashing;

import java.util.ArrayList;
import java.util.List;

public class HashingEncadeamentoAberto implements EstruturaDeDados {
    private List<Integer>[] tabela;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public HashingEncadeamentoAberto() {
        this.tamanho = 1000; // Tamanho inicial da tabela
        this.tabela = new ArrayList[tamanho];
    }

    @Override
    public void insert(int chave) {
        int indice = hash(chave);
        
        if (tabela[indice] == null) {
            tabela[indice] = new ArrayList<>();
        }

        tabela[indice].add(chave);
    }

    @Override
    public void delete(int chave) {
        int indice = hash(chave);

        if (tabela[indice] != null) {
            tabela[indice].remove(Integer.valueOf(chave));
        }
    }

    @Override
    public boolean search(int chave) {
        int indice = hash(chave);

        if (tabela[indice] != null) {
            return tabela[indice].contains(chave);
        }

        return false;
    }

    private int hash(int chave) {
        return chave % tamanho;
    }
}