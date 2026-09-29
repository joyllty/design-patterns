public interface absFabrica {
    
    // lista de criações dos produtos
    Documento criarDocumento();
    EtiquetaEnvio criarEtiqueta();
    ProcessamentoPag criarProcessamento();
    
}
