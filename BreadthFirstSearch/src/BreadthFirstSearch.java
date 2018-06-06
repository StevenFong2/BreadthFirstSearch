import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	Node startNode;
	Node goalNode;
	
	public BreadthFirstSearch(Node startNode, Node goalNode) {
		this.startNode = startNode;
		this.goalNode = goalNode;
	}
	
	public boolean compute() {
		
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
				else
					queue.addAll(current.getChildren());
			}
			
			explored.add(current);
		}
		return false;
	}
}
