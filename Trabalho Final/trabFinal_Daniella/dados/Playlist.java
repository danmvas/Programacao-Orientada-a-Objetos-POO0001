package trabFinal_Daniella.dados;

import java.util.UUID;
public class Playlist {

    private String nome;
    private int idPlaylist;

    public Playlist(){
        this.idPlaylist = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }
    
}