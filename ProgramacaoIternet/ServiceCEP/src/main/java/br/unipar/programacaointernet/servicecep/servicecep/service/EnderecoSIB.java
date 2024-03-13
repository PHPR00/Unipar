package br.unipar.programacaointernet.servicecep.servicecep.service;

import br.unipar.programacaointernet.servicecep.servicecep.dao.EnderecoDAOImpl;
import br.unipar.programacaointernet.servicecep.servicecep.dao.EnderecoDao;
import br.unipar.programacaointernet.servicecep.servicecep.dao.UsuarioDAO;
import br.unipar.programacaointernet.servicecep.servicecep.dao.UsuarioDAOImpl;
import br.unipar.programacaointernet.servicecep.servicecep.model.Endereco;
import br.unipar.programacaointernet.servicecep.servicecep.model.Usuario;
import br.unipar.programacaointernet.servicecep.servicecep.util.EntityManagerUtil;
import jakarta.jws.WebService;


@WebService(endpointInterface = "br.unipar.programacaointernet.servicecep.servicecep.service.EnderecoSEI")
public class EnderecoSIB implements EnderecoSEI {

    @Override
    public String boasVinda(String nome) {
        return "Boas Vindas";
    }

    @Override
    public Endereco consultarEndereco(Long idEndereco) {
        EnderecoDao enderecoDao = new EnderecoDAOImpl(EntityManagerUtil.getManager());
        Endereco endereco = enderecoDao.findById(idEndereco);
        return endereco;
    }
}
