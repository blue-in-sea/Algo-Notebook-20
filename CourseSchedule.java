/**
 * Key: given input nodes & edges, build map that stores a direct grap 
 *      then BFS the graph to check whether it contains circle, or violate the requirement 
 * 
 * Algo: 1. convert graph (with nodes and edges) into Map<K = node, V = adjList>
 *       2. second Map<K = node, V = indegree> to calculate the indegree of each nodes
 *       3. BFS, put all indegree == 0 nodes into queue, also put them into bfs-result list
 *       4. return: check whether (# of nodes in the list == courses to be taken) if yes, return true
 *(Step2-4 本质: 因为拓扑排序节点入度为 0 时才会存入result, 所以如果存在环，那么有向图的拓扑排序节点个数就会小于图的节点个数)
 */

public class CourseSchedule {


}
