package trabFinal_Daniella.dados;

import java.io.FileNotFoundException;

public class Usuario {

    private String username;
    private String senha;
    private int idUsuario;
    private Playlist playlist;
    private Musica musica;

    public Usuario(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public void upload(){

    }

    public void tocarPrevia(){
        try{
            FileInputStream fileInputStream = new FileInpurStream("musica.mp3");
            Player player new Player(fileInputStream);
            System.out.println("Song is playing...");
            player.play(300);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (JavaLayerException e){
            e.printStackTrace();
        }
    }

    public void criarPlaylist(){

    }

    public void listarMusica(){

    }

    public void excluirMusicaPlaylist(){

    }

    public void addMusicaPlaylist(){

    }

    public void excluiMusicaApp(){

    }

    public void listaArtistas(){

    }

    public void favoritaMusica(){

    }
    
}