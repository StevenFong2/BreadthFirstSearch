import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node {

	private int x, y;
	private Node leftChild, rightChild, topChild, bottomChild;
	
	public Node(int x, int y, Node topChild, Node rightChild, Node bottomChild, Node leftChild) {
		this.x = x;
		this.y = y;
		this.topChild = topChild;
		this.rightChild = rightChild;
		this.bottomChild = bottomChild;
		this.leftChild = leftChild;
	}
	
	public ArrayList<Node> getChildren(){
		ArrayList<Node> childNodes = new ArrayList<>();
		if(this.topChild != null)
			childNodes.add(this.topChild);
		if(this.rightChild != null)
			childNodes.add(this.rightChild);
		if(this.bottomChild != null)
			childNodes.add(this.bottomChild);
		if(this.leftChild != null)
			childNodes.add(this.leftChild);
		
		return childNodes;
	}
	
	public boolean removeChild(Node n) {
		return false;
	}
	
	public boolean equals(Object object) {
		if(object instanceof Node && this == object)
			return true;
		else
			return false;
	}
}
