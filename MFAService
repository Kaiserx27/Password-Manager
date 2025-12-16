@Service
public class MFAService {

    public String generateCode(String secret) {
        long time = System.currentTimeMillis() / 30000;
        return String.format("%06d", Math.abs((secret + time).hashCode()) % 1_000_000);
    }
}
