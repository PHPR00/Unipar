package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.controller;

import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.Service.UsuarioService;
import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model.Usuario;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/Usuario")
public class UsuarioController {
    @Inject
    private UsuarioService usuarioService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response lsitarUsuarios() {
        return Response.ok(usuarioService.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response cadastrarLivro(Usuario usuario) {
        try {
            usuarioService.cadastrar(usuario);
            return Response.status(201)
                    .entity("Usuario cadastrado com sucesso")
                    .build();
        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }

}
