package ba.edu.ssst.week12;

import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashSet;
import java.util.Set;

public class BlockChain {

    private int proofOfWork = 0;

    private Set<Block> blocks = new LinkedHashSet<Block>();

    public BlockChain() throws NoSuchAlgorithmException {
        this.blocks = new LinkedHashSet<Block>();
        this.blocks.add(new Block("Genesis block", "0", 1));
    }

    public Block addNewBlock(String message) throws NoSuchAlgorithmException {
        String newMessage = message + returnProofOfWork();
        Block newBlock = new Block(newMessage, this.lastBlock().getHash(), this.lastBlock().getIndex());
        this.blocks.add(newBlock);
        return newBlock;
    }

    private int returnProofOfWork() {
        while(this.proofOfWork % 9 != 0) this.proofOfWork++;
        return this.proofOfWork;
    }

    public Block lastBlock() {
        return (Block) this.blocks.toArray()[this.blocks.size() - 1];
    }

    public Set<Block> getBlocks() {
        return blocks;
    }
}
