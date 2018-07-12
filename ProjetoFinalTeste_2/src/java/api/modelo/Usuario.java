/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

import java.util.List;

/**
 *
 * @author william
 */
public class Usuario {
    private Long id;
    private String nome;
    private Long cpf;
    private String senha;
    private String email;
    private Long tipoUser;
    private String assunto;
    private String categoria;

    
    
    private List<Comentario>comentarios;


    public Usuario(){}
    public Usuario(Long id, String nome, Long cpf, String senha, String email, String assunto,
                   List<Comentario> comentarios, Long tipoUser){
        
        this.setNome(nome);
        this.setCpf(cpf); 
        this.setSenha(senha);
        this.setEmail(email);
        this.setAssunto(assunto);
        this.setComentario(comentarios);
        this.setTipoUser(tipoUser);              
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     public Long getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(Long tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<Comentario> getComentario() {
        return comentarios;
    }

    public void setComentario(List<Comentario> comentario) {
        this.comentarios = comentario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
