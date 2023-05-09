package graph;

public class GraphUsingAdjacencyMatrix {
    int adjMatrix[][];
    int E;
    int V;

    public GraphUsingAdjacencyMatrix(int nodes){
        this.adjMatrix=new int[nodes][nodes];
        this.E=0;
        for(int i=0;i<nodes;i++){
            this.V++;
        }

    }

    public void addEdge(int u,int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
        E++;
    }
    
    public String tostring(){
        StringBuilder sb= new StringBuilder();
        sb.append(V+" vertices "+E+" edges"+"\n") ;
        for(int i=0;i<V;i++){
            sb.append(i+": ");
            for(int w:adjMatrix[i]){
                sb.append(w+"  ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        GraphUsingAdjacencyMatrix g=new GraphUsingAdjacencyMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g.tostring());
            
    }
    
}
