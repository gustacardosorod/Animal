
public class MainAnimal {
    public static void main(String[] args) {

        // Instanciando a objeto da classe Gato.
        Gato g = new Gato();
        // Adicionando um gato na lista de gatos da classe Gato
        g.criar(new Gato(1L, "Siamês", "Miau", "10/10/2023", 3.5));
        // Adicionando um gato na lista de gatos da classe Gato
        g.criar(new Gato(2L, "Persa", "Mimi", "20/01/2020", 2.3));
        // Adicionando um gato na lista de gatos da classe Gato
        g.criar(new Gato(3L, "Ragdoll", "Lili", "05/12/2021", 4.1));
        // Buscando a lista de gatos (g.listar()) e visualizando os gatos presentes na
        // lista.
        g.visualizar(g.listar());
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o gato de id igual a 2");
        g.excluir(2L);
        // Buscando a lista de gatos (g.listar()) e visualizando os gatos presentes na
        // lista.
        g.visualizar(g.listar());
        // Verificando se existe um gato na lista com o id igual a 3
        if (g.buscar(3L) == null)
            System.out.println("Gato não encontrado!");
        else
            System.out.println("Gato encontrado!");
        // Verificando se existe um gato na lista com o id igual a 5
        if (g.buscar(5L) == null)
            System.out.println("Gato não encontrado!");
        else
            System.out.println("Gato encontrado!");

        // Exercício: desenvolver na classe Cachorro o que foi realizado na classe Gato.

        Cachorro c = new Cachorro();

        c.criar(new Cachorro(1L, "Canis lupus familiaris", "Milo", "Jack Russell Terrier", 3.0));

        c.criar(new Cachorro(2L, "Canis lupus familiaris", "Mi", "Vira-lata", 4.0));

        c.criar(new Cachorro(3L, "Canis lupus familiaris", "Lecia", "Pastor Alemão", 4.1));

        c.visualizar(c.listar());
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o cachorro de id igual a 2");
        c.excluir(2L);

        c.visualizar(c.listar());

        if (c.buscar(3L) == null)
            System.out.println("Cachorro não encontrado!");
        else
            System.out.println("Cachorro encontrado!");

        if (c.buscar(5L) == null)
            System.out.println("Cachorro não encontrado!");
        else
            System.out.println("Cachorro encontrado!");
    }
}
