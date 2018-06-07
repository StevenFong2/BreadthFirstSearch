import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.*;

public class Node {

	private Point p;
	//private int x, y;
	private Node parent;
	private Node leftChild, rightChild, topChild, bottomChild;
	
	public Node(Point p, Node topChild, Node rightChild, Node bottomChild, Node leftChild) {
		//this.x = x;
		//this.y = y;
		this.p = p;
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
	
	public void setParent(Node parent) {
		this.parent =parent;
	}
	
	public Node getParent(){
		return this.parent;
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
