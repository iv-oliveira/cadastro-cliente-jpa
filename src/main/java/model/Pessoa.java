package model;

import javax.persistence.*;

@Entity
//@Table(name = "db_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // -> Imputa o "auto-increment" no Id
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
