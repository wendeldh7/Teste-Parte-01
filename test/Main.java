import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar a lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", Sexo.FEMININO));
        pessoas.add(new Pessoa("João", Sexo.MASCULINO));
        pessoas.add(new Pessoa("Ana", Sexo.FEMININO));
        pessoas.add(new Pessoa("Pedro", Sexo.MASCULINO));
        pessoas.add(new Pessoa("Laura", Sexo.FEMININO));

        // Filtrar apenas as mulheres usando expressões lambda
        List<Pessoa> mulheres = new ArrayList<>();
        pessoas.forEach(p -> {
            if (p.getSexo() == Sexo.FEMININO) {
                mulheres.add(p);
            }
        });

        // Imprimir as mulheres no console
        mulheres.forEach(m -> System.out.println("Nome: " + m.getNome() + ", Sexo: " + m.getSexo()));
    }
}