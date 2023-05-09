package graph;

import java.util.LinkedList;

public class GraphUsingAdjacencyList {
    private LinkedList<Integer>[] adjList;

    private int V;
    private int E;

    public GraphUsingAdjacencyList(int nodes){
        this.E=0;
        this.V=nodes;
        this.adjList=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adjList[i]=new LinkedList<>();

        }
    }

    public void addEdge(int u,int v){
        this.adjList[u].add(v);
        this.adjList[v].add(u);
        E++;
    }

    public String tostring(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" vertices "+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for (int w : adjList[v]) {
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }
    public static void main(String[] args) {

        GraphUsingAdjacencyList g= new GraphUsingAdjacencyList(4);
        
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g.tostring());        

    }
    
}
