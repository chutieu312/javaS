"""
E012: Find Center of Star Graph

Summary:
Find Center of Star Graph

Requirements:
- A star graph is a graph with one center node connected to every other node
- Given an undirected star graph with n nodes (labeled 1 to n)
- Given edges array where edges[i] = [u, v] indicates edge between u and v
- Return the center node of the star graph

Approach:
- The center node appears in every edge
- Check first two edges - the common node is the center

Big O Analysis:
Time Complexity: O(1)
Space Complexity: O(1)
"""

def find_center(edges: list[list[int]]) -> int:
    """
    TODO: Implement center finder
    1. Compare first two edges: edges[0] and edges[1]
    2. Find the common node between them
    3. If edges[0][0] appears in edges[1], it's the center
    4. Otherwise, edges[0][1] is the center
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Star graph: 2 is center
    #    1
    #    |
    #    2---3
    #    |
    #    4
    edges1 = [[1, 2], [2, 3], [4, 2]]
    print(f"Center of star graph: {find_center(edges1)}")
    
    # Star graph: 1 is center
    #    2
    #    |
    #    1---3
    #    |
    #    4
    edges2 = [[1, 2], [1, 3], [1, 4]]
    print(f"Center of star graph: {find_center(edges2)}")
    
    # Minimum star graph: 2 is center
    edges3 = [[1, 2], [2, 3]]
    print(f"Center of star graph (min): {find_center(edges3)}")
