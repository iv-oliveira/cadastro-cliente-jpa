import dao.PessoaDao;
import model.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //p1.setId(1L);
        p1.setNome("Ivson");
        p1.setCpf("096.953.274-20");

        PessoaDao pdao = new PessoaDao();
        //pdao.salvar(p1);
        //System.out.println(pdao.pesquisaPorId(1L));
        //pdao.deletar(6L);
        //pdao.atualizar(p1);
    }
}
