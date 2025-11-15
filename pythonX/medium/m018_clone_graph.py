"""
M018: Clone Graph (Deep Copy)

Summary:
Create a deep copy of an undirected graph.

Requirements:
Given a reference to a node, return deep copy of graph.

Approach:
Use DFS with dict to track cloned nodes.

Data Structures:
- Node class with val and neighbors list
- dict[Node, Node]: original -> clone mapping

Big O Analysis:
Time Complexity: O(V + E)
Space Complexity: O(V)
"""

from typing import Optional


class Node:
    def __init__(self, val: int = 0, neighbors: Optional[list['Node']] = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []


def clone_graph(node: Optional[Node]) -> Optional[Node]:
    """
    TODO: Clone graph
    1. If node is None, return None
    2. Create dict for tracking clones
    3. Call helper DFS function
    """
    pass


def clone(node: Node, visited: dict[Node, Node]) -> Node:
    """
    TODO: Recursive clone helper
    1. If node in visited, return cloned node
    2. Create new node with same value
    3. Add to visited dict
    4. For each neighbor:
       - Recursively clone neighbor
       - Add to new node's neighbors
    5. Return new node
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Four-node graph")
    # Graph: 1--2
    #        |  |
    #        4--3
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node4 = Node(4)
    node1.neighbors = [node2, node4]
    node2.neighbors = [node1, node3]
    node3.neighbors = [node2, node4]
    node4.neighbors = [node1, node3]
    
    cloned1 = clone_graph(node1)
    print(f"Cloned graph node value: {cloned1.val if cloned1 else 'null'}")
    print(f"Is different object: {cloned1 is not node1}")
    print(f"Has same neighbors count: {len(cloned1.neighbors) == 2 if cloned1 else False}")
    
    print("\nTest 2: Single node")
    single = Node(1)
    cloned_single = clone_graph(single)
    print(f"Cloned single node: {cloned_single.val if cloned_single else 'null'}")
    
    print("\nTest 3: Null graph")
    cloned_null = clone_graph(None)
    print(f"Cloned null: {'null' if cloned_null is None else 'not null'}")
