package ba.edu.ssst.week12;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {
    private String message;

    private String hash;

    private String previousHash;

    private Integer index;

    public Block(String message, String previousHash, int index) throws NoSuchAlgorithmException {
        this.message = message;
        this.index = index;
        this.previousHash = previousHash;
        this.hash = hash_block();
    }

    public String getHash() {
        return hash;
    }

    public Integer getIndex() {
        return index;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    private String hash_block() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        String textToHash = message + previousHash + index.toString();
        byte[] encodedhash = digest.digest(textToHash.getBytes(StandardCharsets.UTF_8));
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
