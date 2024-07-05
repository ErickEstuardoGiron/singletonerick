public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de AppConfig
        AppConfig config = AppConfig.getInstance();

        // Establecer propiedades
        config.setServerUrl("http://miapi.com");
        config.setPort(8080);

        // Obtener propiedades
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Número de Puerto: " + config.getPort());
    }
}