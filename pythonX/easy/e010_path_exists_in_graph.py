"""
E010: Path Exists in Graph

Summary:
Find if Path Exists in Graph.

Requirements:
- Given n nodes (0 to n-1), list of edges, source node, and destination node
- Determine if there is a valid path from source to destination
- Graph is bidirectional (undirected)

Approach:
- Build adjacency list from edges
- Use DFS to check if destination is reachable from source

Data Structures:
- dict[int, list[int]]: adjacency list
- set: visited nodes

Big O Analysis:
Time Complexity: O(V + E) where V = nodes, E = edges
Space Complexity: O(V + E)
"""

def valid_path(n: int, edges: list[list[int]], source: int, destination: int) -> bool:
    """
    TODO: Implement path finder
    1. Build adjacency list graph (use defaultdict or dict with lists)
    2. Create visited set
    3. Call dfs from source
    4. Return True if destination was reached
    """
    pass


def dfs(graph: dict[int, list[int]], visited: set[int], current: int, destination: int) -> bool:
    """
    TODO: Implement DFS
    1. If current == destination, return True
    2. Mark current as visited
    3. For each neighbor of current:
       - If not visited and dfs(neighbor) returns True, return True
    4. Return False
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Graph: 0--1--2
    #           |
    #           3
    edges1 = [[0, 1], [1, 2], [1, 3]]
    print(f"Path exists 0->2: {valid_path(4, edges1, 0, 2)}")
    print(f"Path exists 0->3: {valid_path(4, edges1, 0, 3)}")
    
    # Graph: 0--1  2--3 (disconnected)
    edges2 = [[0, 1], [2, 3]]
    print(f"Path exists 0->3: {valid_path(4, edges2, 0, 3)}")
    
    # Single node
    edges3 = []
    print(f"Path exists 0->0: {valid_path(1, edges3, 0, 0)}")
