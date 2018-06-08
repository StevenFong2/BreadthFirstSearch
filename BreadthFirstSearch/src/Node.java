import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.*;

public class Node {

	private Point p;
	//private int x, y;
	private Node parent;
	private Node leftChild, rightChild, topChild, bottomChild;
	
	public Node(Point p, int topBound, int lengthBound) {
		//this.x = x;
		//this.y = y;
		this.p = p;
		int x = p.x;
		int y = p.y;
		if(y + 1 < topBound) {
			this.topChild = new Node(new Point(x,y+1), topBound, lengthBound);
			this.topChild.setParent(this);
		}
		if(x+1<lengthBound) {
			this.rightChild = new Node(new Point(x+1,y), topBound, lengthBound);
			this.rightChild.setParent(this);
		}
		if(y-1 > 0) {
			this.bottomChild = new Node(new Point(x,y-1), topBound, lengthBound);
			this.bottomChild.setParent(this);
		}
		if(x-1<0) {
			this.leftChild = new Node(new Point(x-1,y), topBound, lengthBound);
			this.leftChild.setParent(this);
		}
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
	
	public Point getPoint() {
		return this.p;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
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
