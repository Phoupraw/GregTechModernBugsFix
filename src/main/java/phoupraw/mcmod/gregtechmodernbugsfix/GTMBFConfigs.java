package phoupraw.mcmod.gregtechmodernbugsfix;

import lombok.experimental.UtilityClass;
import net.neoforged.neoforge.common.ModConfigSpec;

@UtilityClass
public class GTMBFConfigs {
    public static final Server SERVER;
    static final ModConfigSpec SERVER_SPEC;
    static {
        var pair = new ModConfigSpec.Builder().configure(Server::new);
        SERVER = pair.getLeft();
        SERVER_SPEC = pair.getRight();
    }
    public static final Client CLIENT;
    static final ModConfigSpec CLIENT_SPEC;
    static {
        var pair = new ModConfigSpec.Builder().configure(Client::new);
        CLIENT = pair.getLeft();
        CLIENT_SPEC = pair.getRight();
    }
    public static final Common COMMON;
    static final ModConfigSpec COMMON_SPEC;
    static {
        var pair = new ModConfigSpec.Builder().configure(Common::new);
        COMMON = pair.getLeft();
        COMMON_SPEC = pair.getRight();
    }
    
    public static class Server {
        Server(ModConfigSpec.Builder builder) {
        }
    }
    
    public static class Client {
        Client(ModConfigSpec.Builder builder) {
        }
    }
    
    public static class Common {
        Common(ModConfigSpec.Builder builder) {
        }
    }
}