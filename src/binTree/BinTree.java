package binTree;

import java.awt.List;
import java.util.ArrayList;

public class BinTree {
	private static Node root;
	
	ArrayList<Integer> result = new ArrayList<Integer>();

    public void insertNode(Node node)
    {
    	Node newNode = new Node(node.getKey());
    	
    	if (root == null){
    		root = newNode;
    	} else{
    		Node focusNode = root;
    		
    		Node parent;
    		
    		while (true){
    			parent = focusNode;
    			
    			if(node.getKey() < focusNode.getKey()){
    				focusNode = focusNode.getLeft();
    				
    				if (focusNode == null){
    					parent.setLeft(newNode);
    					return;
    				}
    			} else {
    				focusNode = focusNode.getRight();
    				
    				if (focusNode == null){
    					parent.setRight(newNode);
    					return;
    				}
    			}
    		}
    	}
    }
    
    public void treeWalk(){
    	Node focusNode = root;
    	if (focusNode != null){
    		helper(focusNode);
    	}
    	
    	System.out.println(result);
    	result.clear();
    }
    
    public void helper(Node p){
    	if(p.getLeft() != null)
    		helper(p.getLeft());
   
    	result.add(p.getKey());
   	
    	if(p.getRight() != null)
    		helper(p.getRight());
  	}
}
