public class AppConfig {
    private static AppConfig instance;
    private String serverUrl;
    private int port;

    private AppConfig() {

        serverUrl = " ";
        port = 0;
    }

    // Métodos para obtener y establecer la configuración
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    // Método estático para obtener la instancia única de AppConfig
    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}

