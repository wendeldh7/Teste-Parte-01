package br.com.wendel.testes;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaTest {

    @Test
    public void testListaContemApenasMulheres() {
        // Criar a lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", Sexo.FEMININO));
        pessoas.add(new Pessoa("João", Sexo.MASCULINO));
        pessoas.add(new Pessoa("Ana", Sexo.FEMININO));
        pessoas.add(new Pessoa("Pedro", Sexo.MASCULINO));
        pessoas.add(new Pessoa("Laura", Sexo.FEMININO));

        // Filtrar apenas os nomes de mulheres
        List<String> nomesMulheres = pessoas.stream()
                .filter(p -> p.getSexo() == Sexo.FEMININO)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        // Verificar se a lista contém apenas nomes de mulheres
        Assert.assertEquals(pessoas.size(), nomesMulheres.size());
    }
}