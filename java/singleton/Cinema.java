package singleton;

public class Cinema {

    private Cinema() {};
    private static Cinema instance = new Cinema();
    public static Cinema getInstance() {
        return instance;
    }

    private String nomeCinema;
    private String usuarioLogado;

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
