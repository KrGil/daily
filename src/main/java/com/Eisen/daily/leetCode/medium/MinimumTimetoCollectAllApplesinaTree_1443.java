package com.Eisen.daily.leetCode.medium;

import java.util.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MinimumTimetoCollectAllApplesinaTree_1443
 * author : eisen
 * date : 2023-01-11
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-11    AUTHOR: eisen    NOTE: 최초 생성
 */
public class MinimumTimetoCollectAllApplesinaTree_1443 {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adjacencyList= new ArrayList<>();
        //allocating the space for the vertex to store their adjacent vertex
        for (int i= 0; i< n; i++){
            adjacencyList.add(new ArrayList<>());
        }

        //Creating the adjacency list from the edge list
        for (int []edge: edges) {
            int u= edge[0];
            int v= edge[1];
            //undirected graph
            adjacencyList.get(u).add(v);
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
            adjacencyList.get(v).add(u);
        }
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            for (int j = 0; j < edge.length; j++) {
                int i1 = edge[j];

            }
        }
        boolean[] visited = new boolean[n];//boolean visited array, so that we dont visit the same vertex again
        return dfs(adjacencyList ,visited, hasApple, 0);//recursing down in depth of the tree and calculating the time while in postorder, like topological sort(iterative)
    }
    public int dfs (List<List<Integer>> adjacencyList, boolean[] visited, List<Boolean> hasApple, int source) {
        // preorder marking visited -> recursing in depth -> postorder time calculation
        // Bottom Up Approach

        // marking the current node as visited
        visited[source]= true;

        // time possible
        int totalTime = 0;
        // recursing down in depth
        for (int vertex: adjacencyList.get(source)){
            // only visiting the unvisited node
            if(!visited[vertex])
                //calculating the time while we are backtracking
                totalTime += dfs(adjacencyList, visited, hasApple, vertex);
        }
        // we are not considering the starting vertex because we are calculating the total time from bottom to top //case-1)
        // when the total time is greater than 0 then we would include that path
        // (intution: apple already exists previously in the path)//case-2)
        // we are considering the vertex with apple for total time calculation(intution: considering the edge)
        if (source != 0 && (hasApple.get(source) || totalTime > 0))
            //adding two because of 1)moving forward(arriving) 2)moving backward(returning)
            totalTime += 2;
        //returning the total time to tell the current time status to the parent
        return totalTime;
    }
}
