"""
E011: Find the Town Judge

Summary:
Find the Town Judge

Requirements:
- In a town, there are n people labeled from 1 to n
- There is a rumor that one person is secretly the town judge
- The town judge:
  1. Trusts nobody
  2. Is trusted by everybody else (except themselves)
- Given array of trust relationships [a, b] meaning "a trusts b"
- Return the label of the town judge, or -1 if no such person exists

Approach:
- Count trust given and trust received for each person
- Judge has: trust given = 0, trust received = n - 1

Data Structures:
- list[int]: array to track trust count (positive = received, negative = given)

Big O Analysis:
Time Complexity: O(E) where E = number of trust relationships
Space Complexity: O(n)
"""

def find_judge(n: int, trust: list[list[int]]) -> int:
    """
    TODO: Implement judge finder
    1. Create list of size n+1 to track trust count for each person
    2. For each trust relationship [a, b]:
       - Decrement count[a] (a gives trust)
       - Increment count[b] (b receives trust)
    3. Loop through people 1 to n:
       - If count[i] == n - 1, return i (judge found)
    4. Return -1 if no judge found
    """
    pass


if __name__ == "__main__":
    # Test Cases
    
    # Test 1: Person 2 is judge (1 trusts 2)
    trust1 = [[1, 2]]
    print(f"Judge in town of 2: {find_judge(2, trust1)}")
    
    # Test 2: Person 3 is judge (1->3, 2->3)
    trust2 = [[1, 3], [2, 3]]
    print(f"Judge in town of 3: {find_judge(3, trust2)}")
    
    # Test 3: No judge (1->3, 2->3, 3->1 - judge can't trust anyone)
    trust3 = [[1, 3], [2, 3], [3, 1]]
    print(f"Judge in town of 3 (no judge): {find_judge(3, trust3)}")
    
    # Test 4: Single person is judge
    trust4 = []
    print(f"Judge in town of 1: {find_judge(1, trust4)}")
    
    # Test 5: Not everyone trusts candidate
    trust5 = [[1, 2]]
    print(f"Judge in town of 3 (incomplete trust): {find_judge(3, trust5)}")
