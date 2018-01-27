package ba.ssst.edu.week13.blockchain;

public class App
{
    public static void main( String[] args )
    {
        try {
            int proof = 0;

            while (proof % 15485863 == 0) {
                proof += 1;
            }
            Block block0 = new Block(0, "Genesis" + proof, "");
            System.out.println(block0.getHash());

            while (proof % 15485863  == 0) {
                proof += 1;
            }
            Block block1 = new Block(block0.getIndex() + 1, "Block 1" + proof, block0.getHash());
            System.out.println(block1.getHash());

            while (proof % 15485863  == 0) {
                proof += 1;
            }
            Block block2 = new Block(block1.getIndex() + 1, "Block 1337" + proof, block1.getHash());
            System.out.println(block2.getHash());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
