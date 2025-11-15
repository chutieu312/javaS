"""
M017: Course Schedule (Detect Cycle in Directed Graph)

Summary:
Determine if all courses can be finished given prerequisites.

Requirements:
Given numCourses and prerequisite pairs, detect circular dependencies.

Approach:
Build adjacency list, use DFS with state tracking to detect cycles.

Data Structures:
- list[list[int]]: adjacency list
- list[int]: state array (0=unvisited, 1=visiting, 2=visited)

Big O Analysis:
Time Complexity: O(V + E)
Space Complexity: O(V + E)
"""


def can_finish(num_courses: int, prerequisites: list[list[int]]) -> bool:
    """
    TODO: Check if courses can be completed
    1. Build adjacency list graph
    2. Create state array (0=unvisited, 1=visiting, 2=visited)
    3. For each course, if unvisited:
       - Run DFS to check for cycle
       - If cycle found, return False
    4. Return True
    """
    pass


def has_cycle(course: int, graph: list[list[int]], state: list[int]) -> bool:
    """
    TODO: Detect cycle using DFS
    1. If state[course] == 1, cycle detected, return True
    2. If state[course] == 2, already visited, return False
    3. Mark state[course] = 1 (visiting)
    4. For each neighbor:
       - If has_cycle(neighbor), return True
    5. Mark state[course] = 2 (visited)
    6. Return False
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Simple prerequisite")
    prereq1 = [[1, 0]]
    print(f"Can finish 2 courses: {can_finish(2, prereq1)}")  # Expected: True
    
    print("\nTest 2: Circular dependency")
    prereq2 = [[1, 0], [0, 1]]
    print(f"Can finish 2 courses: {can_finish(2, prereq2)}")  # Expected: False
    
    print("\nTest 3: Linear dependency")
    prereq3 = [[1, 0], [2, 1], [3, 2]]
    print(f"Can finish 4 courses: {can_finish(4, prereq3)}")  # Expected: True
    
    print("\nTest 4: No prerequisites")
    prereq4 = []
    print(f"Can finish 3 courses: {can_finish(3, prereq4)}")  # Expected: True
