package hashing;

import java.util.HashSet;
import java.util.Set;

public class HashingComPorao implements EstruturaDeDados {
    private Set<Integer> conjunto;

    public HashingComPorao() {
        this.conjunto = new HashSet<>();
    }

    @Override
    public void insert(int chave) {
        conjunto.add(chave);
    }

    @Override
    public void delete(int chave) {
        conjunto.remove(chave);
    }

    @Override
    public boolean search(int chave) {
        return conjunto.contains(chave);
    }
}