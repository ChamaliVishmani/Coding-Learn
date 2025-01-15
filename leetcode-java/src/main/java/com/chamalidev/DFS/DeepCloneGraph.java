package com.chamalidev.DFS;

import java.util.HashMap;

public class DeepCloneGraph {
    private HashMap<Node,Node> oldToNewNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        return dfs(node);
    }

    private Node dfs(Node node){
        if(oldToNewNodes.containsKey(node)){
            return oldToNewNodes.get(node);
        } else {
            Node nodeCopy = new Node(node.val);
            oldToNewNodes.put(node,nodeCopy);

            for(Node neighbor : node.neighbors){
                nodeCopy.neighbors.add(dfs(neighbor));
            }

            return nodeCopy;
        }
    }

    public static void main(String[] args){
    }

}
