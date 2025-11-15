"""
M003: Design Parking Lot System (Simplified)

Summary:
Design a simple parking lot system for managing vehicle parking.

Requirements:
Implement the ParkingLot class:
- park(vehicle_id): Assigns next available spot
- remove(vehicle_id): Removes vehicle from parking lot
- get_available_spots(): Returns count of available spots

Approach:
Use dict to map vehicle_id -> spot number, track occupied count.

Data Structures:
- dict[str, int]: vehicle_id -> spot_number
- int: occupied_spots counter

Big O Analysis:
Time Complexity: O(1) for all operations
Space Complexity: O(n) where n is capacity
"""


class ParkingLot:
    
    def __init__(self, capacity: int):
        """
        TODO: Initialize parking lot
        Set capacity, occupied_spots = 0, create dict
        """
        pass
    
    def park(self, vehicle_id: str) -> int:
        """
        TODO: Park a vehicle
        1. Check if lot is full (occupied >= capacity)
        2. Check if vehicle already parked
        3. Assign spot (occupied + 1), add to dict, increment occupied
        4. Return spot number or -1 if full/duplicate
        """
        pass
    
    def remove(self, vehicle_id: str) -> bool:
        """
        TODO: Remove vehicle
        1. Check if vehicle exists
        2. Remove from dict, decrement occupied
        3. Return True if removed, False otherwise
        """
        pass
    
    def get_available_spots(self) -> int:
        """
        TODO: Get available spots
        Return capacity - occupied_spots
        """
        pass
    
    def display_status(self):
        """Display current status"""
        print(f"Occupied: {getattr(self, 'occupied_spots', 0)}/{getattr(self, 'capacity', 0)}")
        print(f"Available: {self.get_available_spots()}")
        print(f"Vehicles: {getattr(self, 'vehicle_to_spot', {})}")


if __name__ == "__main__":
    # Test Cases
    
    print("Test 1: Basic parking and removal")
    lot = ParkingLot(3)
    print(f"Park CAR-1: {lot.park('CAR-1')}")       # Expected: 1
    print(f"Park CAR-2: {lot.park('CAR-2')}")       # Expected: 2
    print(f"Park CAR-3: {lot.park('CAR-3')}")       # Expected: 3
    print(f"Park CAR-4 (full): {lot.park('CAR-4')}")  # Expected: -1
    print(f"Available: {lot.get_available_spots()}")  # Expected: 0
    
    print("\nTest 2: Remove and park again")
    print(f"Remove CAR-2: {lot.remove('CAR-2')}")   # Expected: True
    print(f"Available: {lot.get_available_spots()}")  # Expected: 1
    print(f"Remove CAR-999: {lot.remove('CAR-999')}")  # Expected: False
