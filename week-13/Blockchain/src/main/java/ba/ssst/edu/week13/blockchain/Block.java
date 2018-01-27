package ba.ssst.edu.week13.blockchain;

import javax.xml.bind.ValidationEventLocator;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {
    private final String previousHash;

    private final int index;

    private final String message;

    private final String hash;

    public Block(int index, String message, String previousHash) throws NoSuchAlgorithmException {
        this.index = index;
        this.message = message;
        this.previousHash = previousHash;
        this.hash = generateHash();
    }

    public String getHash() {
        return hash;
    }

    public int getIndex() {
        return index;
    }

    private String generateHash() throws NoSuchAlgorithmException {
        String hashMessage = index + message + previousHash;

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(hashMessage.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
