
import java.util.*;

abstract class HuffmanTree implements Comparable<HuffmanTree> {
  public final int frequency; // the frequency of this tree

  public HuffmanTree(int freq) {
    frequency = freq;
  }

  // compares on the frequency
  public int compareTo(HuffmanTree tree) {
    return frequency - tree.frequency;
  }
}

class HuffmanLeaf extends HuffmanTree {
  public final char value;

  public HuffmanLeaf(int freq, char val) {
    super(freq);
    value = val;
  }
}

class HuffmanNode extends HuffmanTree {
  public final HuffmanTree left, right; // subtrees

  public HuffmanNode(HuffmanTree l, HuffmanTree r) {
    super(l.frequency + r.frequency);
    left = l;
    right = r;
  }
}

public class Huffman {
  // input is an array of frequencies, indexed by character code
  public static HuffmanTree buildTree(int[] charFreqs, char[] test2) {
    PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
    // initially, we have a forest of leaves
    // one for each non-empty charactr
    for (int i = 0; i < charFreqs.length; i++)
      if (charFreqs[i] > 0) {
        trees.offer(new HuffmanLeaf(charFreqs[i], test2[i]));
      }
    assert trees.size() > 0;
    // loop until there is only one tree left
    while (trees.size() > 1) {
      // two trees with least frequency
      HuffmanTree a = trees.poll();
      HuffmanTree b = trees.poll();
      // put into new node and re-insert into queue
      trees.offer(new HuffmanNode(a, b));
    }
    return trees.poll();
  }

  public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
    assert tree != null;
    if (tree instanceof HuffmanLeaf) {
      HuffmanLeaf leaf = (HuffmanLeaf) tree;
      // print out character, frequenxy and code for this leaf(which is just the
      // prefix)
      System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);
    } else if (tree instanceof HuffmanNode) {
      HuffmanNode node = (HuffmanNode) tree;
      // traverse left
      prefix.append("0");
      printCodes(node.left, prefix);
      prefix.deleteCharAt(prefix.length() - 1);
      // traverse right
      prefix.append("1");
      printCodes(node.right, prefix);
      prefix.deleteCharAt(prefix.length() - 1);
    }
  }

  public static void main(String[] args) {
    // Symbols:
    Scanner sc=new Scanner(System.in);
    String str = "";
    System.out.println("Enter the Huffman string:");
    str = sc.next();
    char[] test2 = str.toCharArray();
    // Frequency(of the symbols above):
    System.out.println("Enter the Frequency:");
    int[] charFreqs = new int[test2.length];
    // build tree
    for (int i = 0; i < test2.length; i++) {
      charFreqs[i] =sc.nextInt();
    }

    HuffmanTree tree = buildTree(charFreqs, test2);
    // print out results
    System.out.println("SYMBOL\tFREQ\tHUFFMAN CODE");
    printCodes(tree, new StringBuffer());
  }
}