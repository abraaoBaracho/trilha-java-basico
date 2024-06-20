public class Iphone implements IAparelhoTelefonico, IReprodutorMusical, INavegadorNaInternet {

    private String modelo;
    private String camera;
    private int memoriaRam;
    private int memoriaArmazenamento;
    private int bateriaMah;
       
    
    public Iphone(String modelo, String camera, int memoriaRam, int memoriaArmazenamento, int bateriaMah) {
        this.modelo = modelo;
        this.camera = camera;
        this.memoriaRam = memoriaRam;
        this.memoriaArmazenamento = memoriaArmazenamento;
        this.bateriaMah = bateriaMah;
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }

}
