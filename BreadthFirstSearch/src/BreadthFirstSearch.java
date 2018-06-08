import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	Node startNode;
	Node goalNode;

	/*public BreadthFirstSearch(Node startNode, Node goalNode) {
		this.startNode = startNode;
		this.goalNode = goalNode;
	}*/

	public boolean compute(Node startNode, Node goalNode) {

		this.startNode = startNode;
		this.goalNode = goalNode;
		
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<>();
		queue.add(startNode);
		explored.add(startNode);

		while(!queue.isEmpty()) {
			Node current = queue.remove();
			if(current.equals(this.goalNode)) {
				return true;
			}

			else {
				if(current.getChildren().isEmpty())
					return false;
				else {
					queue.addAll(current.getChildren());
					if(current.getParent()!=null) {
						queue.remove(current.getParent());
					}	
				}
			}

			explored.add(current);
		}
		return false;
	}

	public ArrayList<Node> getParents(){
		ArrayList<Node> parents = new ArrayList<Node>();
		ArrayList<String> moveset = new ArrayList<String>();
		Node current = this.goalNode;
		parents.add(current);
		while(!current.equals(startNode)) {
			parents.add(0, current.getParent());
			current = current.getParent();
		}
		
		for(int i=0; i<parents.size();i++) {
			if(parents.get(i).getPoint().x < this.startNode.getPoint().x)
				moveset.add("down");
		}

		return parents;
	}
	
	/*public ArrayList<MoveType> getParents(){
		ArrayList<Node> parents = new ArrayList<Node>();
		ArrayList<MoveType> moveset = new ArrayList<MoveType>();
		int a = this.startNode.getPoint().x;
		int b = this.startNode.getPoint().y;
		Node current = this.goalNode;
		parents.add(current);
		while(!current.equals(startNode)) {
			parents.add(0, current.getParent());
			current = current.getParent();
		}
		
		for(int i=0; i<parents.size();i++) {
		    Point now = parents.get(i).getPoint();
			if(now.x < a){
				moveset.add(LEFT);
				a--;
			}
			else if(now.x > a){
			    moveset.add(RIGHT);
			    a++;
			}
			else if(now.y > b){
			    moveset.add(UP);
			    b++;
			}
			else if(now.y < b){
			    moveset.add(DOWN);
			    b--;
			}
		}

		return moveset;
	}*/
}
