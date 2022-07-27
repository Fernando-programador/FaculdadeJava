/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author java
 */
public class Login {
     String nome;
     String nomeLogin;
     String senha;
     int nivelAcesso;

    public Login(String nomeLogin, String senha) {
     setNivelAcesso(verificarLogin(nomeLogin, senha));
    }
     
     
     public Login(String nomeLogin, String senha, int token) {
     setNivelAcesso(verificarLogin(nomeLogin, senha, token));
    }
     

       public int verificarLogin(String nomeLogin, String senha ){
         int  nivelAcesso = 0;
         if (nomeLogin.equals("asl") && senha.equals("123") ){
         nivelAcesso = 10;
         setNome( "Ajeitando seu lado");
         }
         else{
                 nivelAcesso = 0;
                 
                 }
         return nivelAcesso;
         
     }
   
     
     public int verificarLogin(String nomeLogin, String senha, int tk ){
         int  nivelAcesso = 0;
         if (nomeLogin.equals("fer") && senha.equals("123") && verificarToken(tk)){
         nivelAcesso = 8;
         setNome( "Fernando");
         }
         else{
                 nivelAcesso = 0;
                 
                 }
         return nivelAcesso;
         
     }
        public boolean verificarToken(int tk){
        if(tk == 1000 || tk == 2000 || tk == 3000){
            return true;
        }
        else{
            return false;
        }
            
    }
    public void setNome(String nome) {
        if(!nome.isEmpty()){
        this.nome = nome;
    }
    }
    public void setNomeLogin(String nomeLogin) {
        if(!nomeLogin.isEmpty()){
        this.nomeLogin = nomeLogin;
    }
    }
    public void setSenha(String senha) {
        if(!senha.isEmpty()){
        this.senha = senha;
    }
    }
    public void setNivelAcesso(int nivelAcesso) {
        if(nivelAcesso >= 0){
        this.nivelAcesso = nivelAcesso;
    }
    }
    public String getNome() {
        return nome;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public String getSenha() {
        return senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }
     
     
     
     
    
    
    
}
