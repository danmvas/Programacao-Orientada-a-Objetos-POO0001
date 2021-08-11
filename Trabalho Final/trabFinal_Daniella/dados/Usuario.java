package trabFinal_Daniella.dados;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.jar.JarException;
import java.util.Scanner;
import trabFinal_Daniella.dados.*;

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

    //add musicas no vetor
    public void upload(){
        /*
        PreparedStatement ps = con.prepareStatement("SELECTimgFROMimagesWHEREimgname=?");
        ps.setString(1, "myimage.gif");
        ResultSet rs = ps.executeQuery();
        if (rs != null){
            while (rs.next()){
                byte[] imgBytes = rs.getBytes(1);
            // use os dados de alguma forma
        }
        rs.close();
        }
    ps.close();
    */
    }

    public void tocarPrevia(){
        try{
            FileInputStream fileInputStream = new FileInputStream("musica.mp3");
            Player player = new Player(fileInputStream);
            System.out.println("Song is playing...");
            player.play(300);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (JavaLayerException e){
            e.printStackTrace();
        }
    }

    public void criarPlaylist(){
        Playlist nova_Playlist = new Playlist();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nome da playlist: ");        
        nova_Playlist.setNome(s.nextLine());

        nova_Playlist.setIdPlaylist();
    }


    public void listarMusica(){

    }

    public void excluirMusicaPlaylist(){
        System.out.println("Qual musica deseja excluir?");
        Scanner s = new Scanner(System.in);
        
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