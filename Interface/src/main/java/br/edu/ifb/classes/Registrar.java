/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.classes;

/**
 *
 * @author Vaio LG
 */
public class Registrar {
    private String usuarioEmail;
    private String senha;

    public Registrar(String usuarioEmail, String senha) {
        this.usuarioEmail = usuarioEmail;
        this.senha = senha;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
