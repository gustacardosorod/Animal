import java.util.ArrayList;
import java.util.List;

public class Gato extends AnimalAbs implements AnimalInt<Gato> {
    private List<Gato> lista = new ArrayList<Gato>();
    private String dataNascimento;


    public Gato() {
    }


    public Gato(Long id, String especie, String nome, String dataNascimento, Double peso) {
        this.setId(id);
        this.setEspecie(especie);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setPeso(peso);
    }

    @Override
    public void criar(Gato animal) {
        System.out.println("Data de nascimento: " + animal.getDataNascimento());
        System.out.println("Espécie: " + animal.getEspecie());
        this.lista.add(animal);
      
    }


    @Override
    public void modificar(Gato animal) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(animal.getId())) {
                this.lista.get(i).setDataNascimento(animal.getDataNascimento());
                this.lista.get(i).setEspecie(animal.getEspecie());
                this.lista.get(i).setNome(animal.getNome());
                this.lista.get(i).setPeso(animal.getPeso());
                break;
            }
        }

    }

  
    @Override
    public void excluir(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                break;
            }
        }

    }


    @Override
    public List<Gato> listar() {
        return this.lista;
 
    }

    @Override
    public Gato buscar(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                return this.lista.get(i);
            }
        }
        return null;

    }

    @Override
    public void visualizar(List<Gato> listaAnimal) {
        for (Gato item : listaAnimal) {
            System.out.println("Id: " + item.getId() + " - Espécie1: " + item.getEspecie() +
                    " - Nome1: " + item.getNome() + " - Data nascimento1: " + item.getDataNascimento() +
                    " - Peso: " + item.getPeso());
        }

    }


    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
