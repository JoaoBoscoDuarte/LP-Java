package atv.contato.src;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;

    //Instância: objeto criado a partir de uma classe
    //Construtor: método de organização;
    //Sobrecarga de construtores: mais de um construtor
    public Contato(String nome, String telefone, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    //get: acessar o dado do objeto
    //set: modifica os atributos de um objeto

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;

        return getEmail().equals(contato.getEmail());
    }

    @Override
    public int hashCode() {
        return getEmail().hashCode();
    }

    @Override  // <-sobrescrever
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}